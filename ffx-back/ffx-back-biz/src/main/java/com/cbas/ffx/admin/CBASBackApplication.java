/*
 *  Copyright (c) .
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
smakercloud.smaker

 */

package com.cbas.ffx.admin;


import com.cbas.ffx.common.security.annotation.EnableCloudFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author renzl
 * @date 2018年06月21日
 * 用户统一管理系统
 */
@EnableCloudFeignClients
@SpringCloudApplication
public class CBASBackApplication {
	public static void main(String[] args) {
		SpringApplication.run(CBASBackApplication.class, args);
	}

}
