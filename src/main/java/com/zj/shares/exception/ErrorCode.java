package com.zj.shares.exception;

/**
 * 自定义错误状态码
 * @author zhangjian
 * @date 2019/8/13 21:51
 */
public enum ErrorCode {
	//用户不存在
	USER_NOT_FOUND(40401),
	//用户已存在
	USER_ALREADY_EXIST(40402),
	//用户已存在
	PARAM_IS_NULL(40403),
	;

	private int code;

	public int getCode()
	{
		return code;
	}

	ErrorCode(int code)
	{
		this.code = code;
	}
}
