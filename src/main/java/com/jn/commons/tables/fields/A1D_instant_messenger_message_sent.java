package com.jn.commons.tables.fields;

import com.ccp.especifications.db.table.CcpDbTableField;

public enum A1D_instant_messenger_message_sent implements CcpDbTableField{
		audit(false), botToken(true), chatId(true), subjectType(false), message(false), interval(true)
	;
	
	private final boolean primaryKey;

	public boolean isPrimaryKey() {
		return this.primaryKey;
	}

	private A1D_instant_messenger_message_sent(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	
}