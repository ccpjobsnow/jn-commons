package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;
import com.jn.commons.entities.base.JnAuditableEntity;

public class JnEntityLoginTokenLocked extends JnAuditableEntity{

	public static final JnEntityLoginTokenLocked INSTANCE = new JnEntityLoginTokenLocked();

	private JnEntityLoginTokenLocked() {
		super(Fields.values());
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