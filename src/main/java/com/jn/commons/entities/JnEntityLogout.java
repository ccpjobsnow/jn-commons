package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;
import com.ccp.especifications.db.utils.CcpTimeOption;
import com.jn.commons.entities.base.JnBaseEntity;

public class JnEntityLogout extends JnBaseEntity{

	public static final JnEntityLogout INSTANCE = new JnEntityLogout();
	
	private JnEntityLogout() {
		super(CcpTimeOption.ddMMyyyy, Fields.values());
	}
	
	public static enum Fields implements CcpEntityField{
		email(true)
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
