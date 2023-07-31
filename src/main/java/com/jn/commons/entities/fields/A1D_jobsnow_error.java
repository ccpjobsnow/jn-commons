package com.jn.commons.entities.fields;

import com.ccp.especifications.db.utils.CcpField;

public enum A1D_jobsnow_error implements CcpField{
	cause(false), stackTrace(false), type(true), message(false)
	;

	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_jobsnow_error(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	

}
