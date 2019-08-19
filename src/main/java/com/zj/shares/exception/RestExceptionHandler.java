package com.zj.shares.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zhangjian
 * @date 2019/8/13 22:01
 */

@ControllerAdvice
@Slf4j
public class RestExceptionHandler {

	@ExceptionHandler(value = NotFoundException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Result handleResourceNotFoundException(NotFoundException e)
	{
		log.error(e.getMessage(), e);
		return new Result(e.getMessage(), e.getCode());
	}


	@ExceptionHandler(value = ParamIsNullException.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.FORBIDDEN)
	public Result handleParamIsNullException(ParamIsNullException e){
		log.error(e.getMessage(), e);
		return new Result(e.getMessage(), e.getCode());
	}
}
