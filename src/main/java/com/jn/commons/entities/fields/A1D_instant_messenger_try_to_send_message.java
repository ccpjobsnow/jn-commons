package com.jn.commons.entities.fields;

import com.ccp.especifications.db.utils.CcpField;

public enum A1D_instant_messenger_try_to_send_message implements CcpField{
		botToken(true), chatId(false), subjectType(false), message(false), tries(true)
	;
	
	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_instant_messenger_try_to_send_message(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	
}