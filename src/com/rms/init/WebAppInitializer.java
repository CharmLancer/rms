package com.rms.init;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.rms.config.WebConfiguration;
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
	    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(WebConfiguration.class);  
        ctx.setServletContext(servletContext);
        
        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        dynamic.addMapping("/");  
        dynamic.setLoadOnStartup(1);  
	}  

}