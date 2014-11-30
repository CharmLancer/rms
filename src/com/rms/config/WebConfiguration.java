package com.rms.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration 
@EnableWebMvc
@ComponentScan("com.rms")
@Import({ WebSocketConfig.class })
public class WebConfiguration extends WebMvcConfigurerAdapter {

//	@Bean  
//    public UrlBasedViewResolver setupViewResolver() {  
//        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
//        resolver.setPrefix("/jsp/");  
//        resolver.setSuffix(".jsp");  
//        resolver.setViewClass(JstlView.class);  
//        return resolver;  
//    }
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/js/");
    }
}