package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;
import com.jn.commons.entities.base.JnBaseEntity;

public class JnEntityContactUsIgnored extends JnBaseEntity{
	private JnEntityContactUsIgnored() {
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
