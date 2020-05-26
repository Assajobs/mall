package com.xdkj.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
/**
 * MyBatis配置类
 * Created by macro on 2020/05/21
 */
@Configuration
@MapperScan("com.xdkj.mall.mbg.mapper")
public class MyBatisConfig {
}
