package com.zj.shares.exception;

/**
 * 参数为空或空字符串
 * @author zhangjian
 * @date 2019/8/14 22:45
 */
public class ParamIsNullException extends GlobalException {
	public ParamIsNullException(String message, int code) {
		super(message, code);
	}
}
