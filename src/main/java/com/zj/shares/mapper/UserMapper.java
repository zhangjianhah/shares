package com.zj.shares.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zj.shares.modal.User;
import org.springframework.stereotype.Repository;

/**
 * @author zhangjian
 * @date 2019/7/29 22:26
 * 一般来说，不用加@Repository 这个注解的因为会自动扫描mapper接口并且生成实现类，
 * 但是idea在检测的时候找不到，会有警告，这里单纯的为了消除警告
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
