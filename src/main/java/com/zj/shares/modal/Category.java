package com.zj.shares.modal;

import lombok.Data;

import java.util.Date;

/**
 * @author zhangjian
 * @date 2019/8/13 22:23
 */
@Data
public class Category {
	private Long categoryId;
	private String categoryName;
	private Date createTime;
	private Date updateTime;
	private Short delflg;
}
