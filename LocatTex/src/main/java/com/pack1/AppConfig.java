package com.pack1;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.pack1")
@EnableTransactionManagement
public class AppConfig 
{
	@Bean
	public JdbcTemplate jt()
	{
		return new JdbcTemplate(ds());
	}
	
	@Bean
	public DataSource ds()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("tiger");
		return ds;
	}
	
	 @Bean
     public PlatformTransactionManager txm() {
         return new DataSourceTransactionManager(ds());
	}
}
