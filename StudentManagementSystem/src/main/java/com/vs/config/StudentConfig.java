package com.vs.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages= {"com.vs"})
public class StudentConfig {
	
	@Bean
	InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver =new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		System.out.println("----- comes in jdbc teplate >>>>>>");
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	DataSource dataSource() {
		
		System.out.println("-------- comes ion datasource >>>>");
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/student?useSSL=false");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds; 
	}

}
