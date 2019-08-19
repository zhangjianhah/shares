package com.zj.shares.exception;

/**
 * @author zhangjian
 * @date 2019/8/13 21:59
 * 资源没找到
 */
public class NotFoundException extends GlobalException {
	public NotFoundException(String message, int code) {
		super(message, code);
	}
}
