package com.mtopgul.springmongodbdoc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 15:52
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.mtopgul.springmongodbdoc.repository")
public class Config {
}
