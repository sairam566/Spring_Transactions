package com.tsr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({PersistenceConfig.class})
@ComponentScan(basePackages = {"com.tsr.controller","com.tsr.service","com.tsr.dao"})
@EnableTransactionManagement
public class RootConfig {
	
}
