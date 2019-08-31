package com.gohenry.coding.parentdetails.config;

import javax.annotation.PostConstruct;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration
@Import(AppsCommonConfig.class)
@EntityScan({ "com.gohenry.coding.parentdetails.entity" })
public class ParentDetailsConfig {

	@Autowired
	private DozerBeanMapper mapper;

	/**
	 * Setup the local bean-mappings XML configuration to the Dozer-mapper bean
	 * 
	 * @throws Exception
	 */
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		mapper.addMapping(ParentDetailsConfig.class.getResourceAsStream("/parent-dozer-mapping.xml"));
	}
}
