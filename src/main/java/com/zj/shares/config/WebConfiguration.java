package com.zj.shares.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zhangjian
 * @date 2019/8/4 11:27
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	/**
	 * 配置CROS的跨域
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("http://127.0.0.1:6075","http://localhost:6075")
				.allowedMethods("POST","GET","OPTIONS","DELETE","PUT")
				.allowedHeaders("Content-Type","Access-Control-Allow-Headers","Authorization","X-Requested-With")
				.allowCredentials(true);


	}
}
