/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * ;License;); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * ;AS IS; BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.chemistry.opencmis.commons.data;

/**
 * A collection of flags that indicate which type attributes can be set at type
 * creation.
 */
public interface NewTypeSettableAttributes extends ExtensionsData {

    /**
     * Indicates if the "id" attribute can be set.
     * 
     * @return <code>true</code> if the "id" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetId();

    /**
     * Indicates if the "localName" attribute can be set.
     * 
     * @return <code>true</code> if the "localName" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetLocalName();

    /**
     * Indicates if the "localNamespace" attribute can be set.
     * 
     * @return <code>true</code> if the "localNamespace" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetLocalNamespace();

    /**
     * Indicates if the "displayName" attribute can be set.
     * 
     * @return <code>true</code> if the "displayName" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetDisplayName();

    /**
     * Indicates if the "queryName" attribute can be set.
     * 
     * @return <code>true</code> if the "queryName" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetQueryName();

    /**
     * Indicates if the "description" attribute can be set.
     * 
     * @return <code>true</code> if the "description" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetDescription();

    /**
     * Indicates if the "creatable" attribute can be set.
     * 
     * @return <code>true</code> if the "creatable" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetCreatable();

    /**
     * Indicates if the "fileable" attribute can be set.
     * 
     * @return <code>true</code> if the "fileable" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetFileable();

    /**
     * Indicates if the "queryable" attribute can be set.
     * 
     * @return <code>true</code> if the "queryable" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetQueryable();

    /**
     * Indicates if the "fulltextIndexed" attribute can be set.
     * 
     * @return <code>true</code> if the "fulltextIndexed" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetFulltextIndexed();

    /**
     * Indicates if the "includedInSupertypeQuery" attribute can be set.
     * 
     * @return <code>true</code> if the "includedInSupertypeQuery" attribute can
     *         be set, <code>false</code> otherwise
     */
    Boolean canSetIncludedInSupertypeQuery();

    /**
     * Indicates if the "controllablePolicy" attribute can be set.
     * 
     * @return <code>true</code> if the "controllablePolicy" attribute can be
     *         set, <code>false</code> otherwise
     */
    Boolean canSetControllablePolicy();

    /**
     * Indicates if the "controllableACL" attribute can be set.
     * 
     * @return <code>true</code> if the "controllableACL" attribute can be set,
     *         <code>false</code> otherwise
     */
    Boolean canSetControllableAcl();
}
