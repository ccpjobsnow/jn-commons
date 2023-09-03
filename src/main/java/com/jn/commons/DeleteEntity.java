package com.jn.commons;

import com.ccp.decorators.CcpMapDecorator;
import com.ccp.process.CcpNextStep;
import com.ccp.process.CcpStepResult;
import com.ccp.process.CcpProcessStatus;

public class DeleteEntity extends CcpNextStep {

	private final Integer statusToReturnAfterSaving;

	private final JnEntity entity;
	
	
	DeleteEntity(JnEntity entity, CcpProcessStatus statusToReturnAfterSaving) {
		this.statusToReturnAfterSaving = statusToReturnAfterSaving.status();
		this.entity = entity;
	}

	@Override
	public CcpStepResult executeThisStep(CcpMapDecorator values) {
		this.entity.delete(values);
		return new CcpStepResult(values.put("entity", this.entity.name()), this.statusToReturnAfterSaving, this);
	}

}