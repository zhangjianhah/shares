package com.zj.shares.service;

import com.zj.shares.exception.ErrorCode;
import com.zj.shares.mapper.UserMapper;
import com.zj.shares.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjian
 * @date 2019/7/29 22:12
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public void addUser(User user){
		int num = userMapper.insert(user);
	}


}
