/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.chemistry.opencmis.commons.exceptions;

import java.math.BigInteger;

/**
 * CMIS FilterNotValid Exception.
 * 
 * @author <a href="mailto:fmueller@opentext.com">Florian M&uuml;ller</a>
 * 
 */
public class CmisFilterNotValidException extends CmisBaseException {

    private static final long serialVersionUID = 1L;

    public CmisFilterNotValidException() {
        super();
    }

    public CmisFilterNotValidException(String message, BigInteger code, Throwable cause) {
        super(message, code, cause);
    }

    public CmisFilterNotValidException(String message, String errorContent) {
        super(message, errorContent);
    }

    public CmisFilterNotValidException(String message, BigInteger code) {
        super(message, code);
    }

    public CmisFilterNotValidException(String message, String errorContent, Throwable cause) {
        super(message, errorContent, cause);
    }

    public CmisFilterNotValidException(String message, Throwable cause) {
        super(message, (BigInteger) null, cause);
    }

    public CmisFilterNotValidException(String message) {
        super(message, (BigInteger) null);
    }
}