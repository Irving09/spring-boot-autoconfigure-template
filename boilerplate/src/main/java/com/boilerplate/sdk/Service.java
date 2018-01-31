/**
 * CONFIDENTIAL INFORMATION
 * <p>
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 * <p>
 * Date: Jan 30, 2018
 * Copyright 2018 innoirvinge@gmail.com
 */
package com.boilerplate.sdk;

import lombok.AllArgsConstructor;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@AllArgsConstructor
public class Service {

    private ServiceConfig config;

    public String callDb(String clientParam) {
        String username = config.getUserName();

        return String.format("Database is called using the username property [%s] and client params [%s]", username, clientParam);
    }

}
