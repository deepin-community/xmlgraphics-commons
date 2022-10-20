/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: PropertyUtil.java 1732018 2016-02-24 04:51:06Z gadams $ */

package org.apache.xmlgraphics.image.codec.util;

import java.util.MissingResourceException;

import org.apache.xmlgraphics.util.i18n.LocalizableSupport;

public final class PropertyUtil {

    private PropertyUtil() {
    }

    private static final String RESOURCES =
        "org.apache.xmlgraphics.image.codec.Messages";


    private static final LocalizableSupport LOCALIZABLESUPPORT =
        new LocalizableSupport(
        RESOURCES, PropertyUtil.class.getClassLoader());

    public static String getString(String key) {
        try {
            return LOCALIZABLESUPPORT.formatMessage(key, null);
        } catch (MissingResourceException e) {
            return key;
        }
   }
}
