package com.zj.shares.util;

import com.zj.shares.modal.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * @author zhangjian
 * @date 2019/8/16 14:21
 */
public class SecurityUtils {

	public static Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}


	public static Collection<? extends GrantedAuthority> getAllPermission(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		return authorities;
	}

	public static boolean hasPermission(String permission){
		if(StringUtils.isEmpty(permission)){
			return false;
		}
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		boolean hasPermission = false;
		for(GrantedAuthority grantedAuthority : authorities){
			String authority = grantedAuthority.getAuthority();
			if(authority.equals(permission)){
				hasPermission =true;
			}
		}
		return hasPermission;
	}


	public static User getUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return (User) authentication.getPrincipal();
	}


	public static void logout(){
		SecurityContextHolder.clearContext();
	}

}
