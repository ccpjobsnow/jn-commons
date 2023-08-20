package com.jn.commons.entities.fields;

import com.ccp.especifications.db.utils.CcpField;

public enum A1D_password implements CcpField{
		email(true), password(false)
	;
	
	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_password(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	
	
}
