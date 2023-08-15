/*
 *  Copyright (c) .
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
smakercloud.smaker

 */

package com.cbas.ffx.codegen;


import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author renzl
 * @date 2019/2/1
 * 代码生成模块
 */
@SpringCloudApplication
@EnableFeignClients
public class CBASCodeGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CBASCodeGenApplication.class, args);
	}
}
