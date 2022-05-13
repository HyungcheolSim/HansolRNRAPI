package com.hansol.spring.product.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    //spring.datasource 가 접두어로 붙어 있는 application properties 값들을 참조
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    //커넥션 풀을 관리하는 객체 Datasource 설정
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
