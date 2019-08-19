package com.zj.shares.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zj.shares.exception.ErrorCode;
import com.zj.shares.exception.ParamNotExistException;
import com.zj.shares.mapper.CategoryMapper;
import com.zj.shares.modal.Category;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangjian
 * @date 2019/8/13 22:39
 */
@Service
public class CategoryService {

	@Resource
	private CategoryMapper categoryMapper;


	public List<Category> listAllCategory(){
		List<Category> list = categoryMapper.selectList(new QueryWrapper<Category>().eq("delflg",0));
		return list;
	}

	public Integer addCategory(String categoryName) throws ParamNotExistException {
		if(StringUtils.isEmpty(categoryName)){
			throw new ParamNotExistException("种类名称不可为空",ErrorCode.PARAM_IS_NULL.getCode());
		}
		Category category = new Category();
		category.setCategoryName(categoryName);
		category.setCreateTime(new Date());
		category.setDelflg((short) 0);
		return categoryMapper.insert(category);
	}
}
