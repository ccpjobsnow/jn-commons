package com.jn.commons.entities;

import com.ccp.especifications.db.utils.CcpEntityField;
import com.jn.commons.entities.base.JnDisposableEntity;
import com.jn.commons.entities.base.JnDiposableRecordTimeExpiration;

public class JnEntityInstantMessengerMessageSent extends JnDisposableEntity{
	
	public static final JnEntityInstantMessengerMessageSent INSTANCE = new JnEntityInstantMessengerMessageSent();

	
	private JnEntityInstantMessengerMessageSent() {
		super(JnDiposableRecordTimeExpiration.daily, Fields.values());
	}
	
	public static enum Fields implements CcpEntityField{
		token(true), recipient(true), subjectType(false), message(false), interval(true)
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
