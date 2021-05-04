package com.vs.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class arr[]={StudentConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[]= {"/"};
		return arr;
	}

}
