package com.jw.linkedface.config.dao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jw.linkedface.dao")
public class DataSourceConfiguration {

}
