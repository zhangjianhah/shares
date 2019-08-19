package com.zj.shares.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhangjian
 * @date 2019/8/1 22:19
 * Druid 的配置类，因为在yml中配置数据池连接大小等在datasource不是默认成员，所以无法绑定
 */
@Configuration
public class DruidConfig {


	/**
	 * 生成自己的druid  bean
	 * @return
	 */
	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druid(){
		return new DruidDataSource();
	}
}
