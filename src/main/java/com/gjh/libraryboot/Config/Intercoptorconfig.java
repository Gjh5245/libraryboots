package com.gjh.libraryboot.Config;

import com.gjh.libraryboot.intercptor.webintercptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class Intercoptorconfig implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new webintercptor()).addPathPatterns("/**").
                excludePathPatterns("/login.html","/user","/css/**","/fonts/**","/images/**","/js/**");

    }
}
