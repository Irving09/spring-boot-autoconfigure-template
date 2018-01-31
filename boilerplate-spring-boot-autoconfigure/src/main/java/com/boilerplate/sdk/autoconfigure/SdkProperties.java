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

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "boilerplate.sdk")
public class SdkProperties {

    private String userName;

}
