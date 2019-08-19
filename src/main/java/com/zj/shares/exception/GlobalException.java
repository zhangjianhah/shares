package com.zj.shares.exception;

/**
 * @author zhangjian
 * @date 2019/8/13 21:56
 * 全局异常基类
 */
public class GlobalException extends Exception{

	private int code;

	public GlobalException(String message)
	{
		super(message);
	}

	public GlobalException(String message, int code)
	{
		super(message);
		this.code = code;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public int getCode()
	{
		return code;
	}
}
