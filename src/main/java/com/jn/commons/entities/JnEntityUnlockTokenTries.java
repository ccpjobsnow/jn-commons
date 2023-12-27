package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;

public class JnEntityUnlockTokenTries extends JnBaseEntity{
	public JnEntityUnlockTokenTries() {
		super(Fields.values());
	}
	public static enum Fields implements CcpEntityField{
		email(true), tries(true)
		;
		
		private final boolean primaryKey;

		private Fields(boolean primaryKey) {
			this.primaryKey = primaryKey;
		}
		public boolean isPrimaryKey() {
			return this.primaryKey;
		}

	}

}