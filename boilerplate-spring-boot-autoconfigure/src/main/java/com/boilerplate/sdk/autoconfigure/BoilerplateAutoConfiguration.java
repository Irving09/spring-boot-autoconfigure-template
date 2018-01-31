/**
 * CONFIDENTIAL INFORMATION
 * <p>
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 * <p>
 * Date: Jan 30, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.boilerplate.sdk.autoconfigure;

import com.boilerplate.sdk.Service;
import com.boilerplate.sdk.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@Configuration
@ConditionalOnClass(Service.class)
@EnableConfigurationProperties(SdkProperties.class)
public class BoilerplateAutoConfiguration {

    @Autowired
    private SdkProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public ServiceConfig serviceConfig() {
        return new ServiceConfig(properties.getUserName());
    }

    @Bean
    @ConditionalOnMissingBean
    public Service service() {
        return new Service(serviceConfig());
    }

}
