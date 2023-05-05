package com.sunman.library.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;

public class MongoConfig extends AbstractMongoClientConfiguration {

	/* @Value - read the properties from application.properties */
	@Value("${spring.data.mongodb.database}")
	private String database;

	@Override
	protected String getDatabaseName() {
		return database;
	}
	
	@Bean
	public GridFsTemplate getGridFsTemplate() {
		//return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
		return null;
	}
	
	
}
