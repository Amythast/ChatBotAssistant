/*
 *  Copyright (c) 2019-2020,.
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>

 */

package com.cbas.ffx.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.cbas.ffx.common.security.component.CloudAuth2ExceptionSerializer;

/**
 * @author renzl
 * @date 2019/2/1
 */
@JsonSerialize(using = CloudAuth2ExceptionSerializer.class)
public class InvalidException extends CloudAuth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
