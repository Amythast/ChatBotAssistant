/*
 *  Copyright (c) .
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
smakercloud.smaker

 */

package com.cbas.ffx.auth;


import com.cbas.ffx.common.security.annotation.EnableCloudFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author renzl
 * @date 2018年06月21日
 * 认证授权中心
 */
@SpringCloudApplication
@EnableCloudFeignClients
public class CBASAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(CBASAuthApplication.class, args);
	}
}
