package com.jn.commons.entities;

import com.ccp.decorators.CcpJsonRepresentation;
import com.ccp.especifications.db.utils.CcpEntity;
import com.ccp.especifications.db.utils.CcpEntityField;
import com.ccp.especifications.db.utils.decorators.CcpEntityExpurgable;
import com.ccp.especifications.db.utils.decorators.CcpEntitySpecifications;
import com.ccp.especifications.db.utils.decorators.CcpFactoryEntity;
import com.ccp.especifications.db.utils.decorators.CcpLongevityEntity;
import com.jn.commons.utils.JnDisposableEntity;

@CcpEntityExpurgable(expurgableEntityFactory = JnDisposableEntity.class, longevityEntity = CcpLongevityEntity.hourly)
@CcpEntitySpecifications(cacheableEntity = true)
public class JnEntityHttpApiRetrySendRequest {

	public static final CcpEntity ENTITY = CcpFactoryEntity.getEntityInstance(JnEntityHttpApiRetrySendRequest.class);
	
	public static boolean exceededTries(CcpJsonRepresentation json, String fieldName, int limit) {
		
		for(int k = 1; k <= limit; k++) {
			
			CcpJsonRepresentation put = json.put(fieldName, k);
			
			boolean exists = ENTITY.exists(put);
			
			if(exists == false) {
				ENTITY.createOrUpdate(put);
				return false;
			}
		}
		return true;
	}

	public static enum Fields implements CcpEntityField{
		url(true), method(true), headers(true), request(false), apiName(true), tries(true), response(false), status(false)
		,timestamp(false), details(false)
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
