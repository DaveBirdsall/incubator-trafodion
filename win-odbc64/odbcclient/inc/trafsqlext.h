/*
// @@@ START COPYRIGHT @@@
//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
// @@@ END COPYRIGHT @@@
*/

#ifndef __TRAFSQLEXTH
#define __TRAFSQLEXTH

#define SQL_ATTR_SESSIONNAME		5000
#define SQL_MAX_SESSIONNAME_LEN		25

// Attribute to get the 64bit rowcount when using the 32-bit ODBC driver
#define SQL_ATTR_ROWCOUNT64_PTR		5001

#define SQL_ATTR_ROLENAME           5002
/* Max rolename length excluding terminating null */
#define SQL_MAX_ROLENAME_LEN		128

// Attribute to set fetchahead connection attribute
#define SQL_ATTR_FETCHAHEAD         5003

#define SQL_ATTR_APPLNAME		    5100
#define SQL_MAX_APPLNAME_LEN		128


#ifdef HOLDABLE
// SAP support for holdable cursor
#define SQL_ATTR_CURSOR_HOLDABLE 	-3 
#define SQL_NONHOLDABLE			0
#define SQL_HOLDABLE			1
#endif
#define SQL_ATTR_CERTIFICATE_DIR			5200
#define SQL_ATTR_CERTIFICATE_FILE			5201
#define SQL_ATTR_CERTIFICATE_FILE_ACTIVE	5202
#define SQL_START_NODE                      4000

#endif /* __TRAFSQLEXTH */
