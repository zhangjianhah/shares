package com.zj.shares.exception;

import lombok.Data;

/**
 * @author zhangjian
 * @date 2019/8/13 22:08
 * 错误返回类
 */
@Data
public class Result {

	/**
	 * 错误内容
	 */
	private String error;

	/**
	 * 自定义错误码
	 */
	private int code;


	public Result(String error, int code)
	{
		this.error = error;
		this.code = code;
	}

}
