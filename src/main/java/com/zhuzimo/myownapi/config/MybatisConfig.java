package com.zhuzimo.myownapi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zhuzimo.myownapi.mapper")
public class MybatisConfig {
}
