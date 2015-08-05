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

package org.trafodion.jdbc.t4;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.UnsupportedCharsetException;
import java.sql.SQLException;

class odbc_Dcs_GetObjRefHdl_exc_ {
	int exception_nr;
	int exception_detail;

	String ErrorText;
	int errorCode;

	//
	// It looks like ODBC doesn't generate error text in all
	// error cases, so the following variable will contain
	// any error text generated by this JDBC driver.
	// Note, this variable is not part of the message, but it
	// represents a value stored in the HPT4Messages_*.properties file.
	//

	String clientErrorText;

	static final int odbc_Dcs_GetObjRefHdl_ASParamError_exn_ = 1;
	static final int odbc_Dcs_GetObjRefHdl_ASTimeout_exn_ = 2;
	static final int odbc_Dcs_GetObjRefHdl_ASNoSrvrHdl_exn_ = 3;
	static final int odbc_Dcs_GetObjRefHdl_ASTryAgain_exn_ = 4;
	static final int odbc_Dcs_GetObjRefHdl_ASNotAvailable_exn_ = 5;
	static final int odbc_Dcs_GetObjRefHdl_DSNotAvailable_exn_ = 6;
	static final int odbc_Dcs_GetObjRefHdl_PortNotAvailable_exn_ = 7;
	static final int odbc_Dcs_GetObjRefHdl_InvalidUser_exn_ = 8;
	static final int odbc_Dcs_GetObjRefHdl_LogonUserFailure_exn_ = 9;

	// -------------------------------------------------------------------
	void extractFromByteArray(LogicalByteArray buffer1, InterfaceConnection ic) throws SQLException,
			UnsupportedCharsetException, CharacterCodingException {
		exception_nr = buffer1.extractInt();
		exception_detail = buffer1.extractInt();

		String temp0 = Integer.toString(exception_nr);
		String temp1 = Integer.toString(exception_detail);

		ErrorText = ic.decodeBytes(buffer1.extractString(), 1);

		switch (exception_nr) {
		case TRANSPORT.CEE_SUCCESS:
			break;
		case odbc_Dcs_GetObjRefHdl_ASParamError_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_program_error", ErrorText);
		case odbc_Dcs_GetObjRefHdl_LogonUserFailure_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_unable_to_logon", "");
		case odbc_Dcs_GetObjRefHdl_ASNotAvailable_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_dcs_srvr_not_available", ErrorText);
		case odbc_Dcs_GetObjRefHdl_DSNotAvailable_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_ds_not_available", new T4Properties()
					.getServerDataSource());
		case odbc_Dcs_GetObjRefHdl_PortNotAvailable_exn_:
		case odbc_Dcs_GetObjRefHdl_ASTryAgain_exn_:
		case odbc_Dcs_GetObjRefHdl_ASNoSrvrHdl_exn_:
		case -27:
		case -29:

			// should be retried by the driver so dont throw exception
			clientErrorText = "ids_port_not_available";
			break;
		case odbc_Dcs_GetObjRefHdl_InvalidUser_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_28_000", null);
		case odbc_Dcs_GetObjRefHdl_ASTimeout_exn_:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "ids_s1_t00", null);
		default:
			throw HPT4Messages.createSQLException(null, ic.getLocale(), "unknown_connect_error", null);
		}
	}
}
