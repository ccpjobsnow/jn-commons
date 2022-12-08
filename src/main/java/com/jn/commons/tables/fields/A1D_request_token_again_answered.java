package com.jn.commons.tables.fields;

import com.ccp.especifications.db.table.CcpDbTableField;

public enum A1D_request_token_again_answered implements CcpDbTableField{
		audit(false), email(true)
	;
	
	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_request_token_again_answered(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	
}
