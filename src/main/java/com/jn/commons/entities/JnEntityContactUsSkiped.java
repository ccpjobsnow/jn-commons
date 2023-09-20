package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;

public class JnEntityContactUsSkiped extends JnBaseEntity{
	public JnEntityContactUsSkiped() {
		super(new CcpEntityField[] {});//TODO FALTA OS FIELDS
	}
	
	public static enum Fields implements CcpEntityField{
		email(false)
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
