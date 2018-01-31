/**
 * CONFIDENTIAL INFORMATION
 * <p>
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 * <p>
 * Date: Jan 30, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.boilerplate.sdk.sample;

import com.boilerplate.sdk.autoconfigure.SdkProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.boilerplate.sdk.Service;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@SpringBootApplication
public class SpringBootSdkClientApplication implements CommandLineRunner {

    @Autowired
    private Service service;

    @Override
    public void run(final String... args) throws Exception {
        String result = service.callDb("PARAM");

        System.out.println(result);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSdkClientApplication.class, args);
    }

}
