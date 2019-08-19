package com.zj.shares.controller;

import com.zj.shares.exception.ParamNotExistException;
import com.zj.shares.modal.Category;
import com.zj.shares.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangjian
 * @date 2019/8/14 22:35
 */
@RestController
@RequestMapping(value = "/categorys")
@Slf4j
public class CategoryController {

	@Resource
	private CategoryService categoryService;

	@PostMapping(value = "")
	public Integer addCategory(String categoryName) throws ParamNotExistException {

		return categoryService.addCategory(categoryName);

	}


	@GetMapping(value = "/list")
	public List<Category> listAllCategory(){
		return categoryService.listAllCategory();
	}




}
