package com.zj.shares;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主程序入口
 * MapperScan   扫描整个mapper
 */
@SpringBootApplication
@MapperScan("com.zj.shares.mapper")
public class SharesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharesApplication.class, args);
	}

}
