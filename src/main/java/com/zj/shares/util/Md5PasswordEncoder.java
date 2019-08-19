package com.zj.shares.util;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 密码比较器
 * @author zhangjian
 * @date 2019/8/16 14:09
 */
public class Md5PasswordEncoder implements PasswordEncoder {
	@Override
	public String encode(CharSequence charSequence) {
		return null;
	}

	@Override
	public boolean matches(CharSequence charSequence, String s) {
		return false;
	}
}
