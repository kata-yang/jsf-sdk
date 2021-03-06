/**
 * Copyright 2004-2048 .
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.jsf.gd.filter.validation;

/**
 * Validator
 *
 */
public interface Validator {

    /**
     * 校验方法下的参数
     *
     * @param methodName
     *         方法名
     * @param parameterTypes
     *         方法参数类型
     * @param arguments
     *         方法值列表
     * @throws Exception
     *         校验不通过抛出的异常
     */
    void validate(String methodName, String[] parameterTypes, Object[] arguments) throws Exception;
}