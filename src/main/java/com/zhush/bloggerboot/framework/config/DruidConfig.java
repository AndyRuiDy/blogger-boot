package com.zhush.bloggerboot.framework.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhush
 * @Description: druid 多数据源配置
 * @date
 */
@Configuration
public class DruidConfig {

    /**
     * 主库配置
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    public DataSource masterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * 从库配置
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid.slave")
    @ConditionalOnProperty(prefix = "spring.datasource.druid.slave", name = "enabled", havingValue = "true")
    public DataSource slaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
