package com.jn.commons.tables.fields;

import com.ccp.especifications.db.table.CcpDbTableField;

public enum A1D_email_api_unavailable implements CcpDbTableField{
		
	;
	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_email_api_unavailable(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	
}
