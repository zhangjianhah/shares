package com.zj.shares.modal;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangjian
 * @date 2019/7/29 22:12
 */
@Data
public class User {
	private Long uid;
	private String account;
	private String nickName;
	private String address;
	private String phone;
	private String email;
	private String sex;
	private String pwd;
	private String birthday;
	private String headerImg;
	private Date createTime;
	private Date updateTime;
	private Date lastLoginTime;
	private Short delflg;
}
