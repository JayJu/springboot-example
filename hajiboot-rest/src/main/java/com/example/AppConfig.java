package com.example;


import javax.sql.DataSource;


import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.nio.charset.Charset;

/**
 * Created by 1015331 on 2016-11-14.
 */
@Configuration
public class AppConfig {
    @Autowired
    DataSourceProperties dataSourceProperties;
    DataSource dataSource;
/*
    @Bean
    @Primary
    DataSource dataSource() {
        return new Log4jdbcProxyDataSource(this.dataSource);
    }
  */

    @Order(Ordered.HIGHEST_PRECEDENCE)
    @Bean
    CharacterEncodingFilter characterEncodingFilter() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        filter.setForceEncoding(true);

        return filter;
    }

    @Bean
    DataSource realDataSource() {
        DataSourceBuilder factory = DataSourceBuilder
                .create(this.dataSourceProperties.getClassLoader())
                .url(this.dataSourceProperties.getUrl())
                .username(this.dataSourceProperties.getUsername())
                .password(this.dataSourceProperties.getPassword());
        this.dataSource = factory.build();

        //return this.dataSource;
        return new Log4jdbcProxyDataSource(this.dataSource);
    }
}
