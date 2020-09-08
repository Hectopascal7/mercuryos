package com.mint.mercuryos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName : CorsConfig
 * @Description : 跨域请求配置类
 * @Author : Jeanne d' Arc
 * @Date : 2020-09-08 13:31
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**") // 允许跨域请求的路径
                .allowedOrigins("*") //允许跨域请求的源
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE") //允许请求方法
                .maxAge(16800) //预检间隔时间
                .allowedHeaders("*") //允许头部设置
                .allowCredentials(true); //是否发送Cookie
    }
}
