package com.zj.shares.exception;

/**
 * 参数为空
 * @author zhangjian
 * @date 2019/8/14 22:40
 */

public class ParamNotExistException extends GlobalException {
	public ParamNotExistException(String message, int code) {
		super(message,code);
	}
}
