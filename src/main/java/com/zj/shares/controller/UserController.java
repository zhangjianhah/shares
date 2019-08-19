package com.zj.shares.controller;

import com.zj.shares.modal.User;
import com.zj.shares.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * @author zhangjian
 * @date 2019/7/29 21:28
 */
@RestController
@RequestMapping(value = "/users")
@Slf4j
public class UserController {

	//Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private UserService userService;


	@GetMapping(value = "/show")
	public Map<String,Object> showTemplate(){
		Map<String,Object> map = new HashMap<>();
		StringUtils.isEmpty("ss");
		map.put("name","zhangjian");
		map.put("age",20);
		map.put("job","java");
		//logger.info("展示用户信息");
		log.info("展示用户信息");
		return map;
	}
	@GetMapping(value = "/add")
	public String addUser(HttpServletRequest request,String nickName,String account,String pwd){
		User user = new User();
		user.setAccount(account);
		user.setNickName(nickName);
		user.setPwd(pwd);

		userService.addUser(user);

		return "success";

	}
}
