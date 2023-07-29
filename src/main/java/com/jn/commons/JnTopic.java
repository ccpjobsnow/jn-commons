package com.jn.commons;

import com.ccp.constantes.CcpConstants;
import com.ccp.decorators.CcpMapDecorator;
import com.ccp.decorators.CcpStringDecorator;
import com.ccp.dependency.injection.CcpDependencyInject;
import com.ccp.especifications.mensageria.sender.CcpMensageriaSender;
import com.ccp.especifications.mensageria.sender.CcpMensageriaTopic;
import com.ccp.exceptions.mensageria.sender.MensageriaTopicGenericError;

public enum JnTopic implements CcpMensageriaTopic{
	sendUserToken, requestTokenAgain, requestUnlockToken, saveCandidateData, 
	notifyContactUs, saveResumesQuery, sendEmail, sendInstantMessage, notifyError, removeTries;
	
	@CcpDependencyInject
	CcpMensageriaSender mensageriaSender;

	
	public CcpMapDecorator send(CcpMapDecorator values) {
		String token = new CcpStringDecorator(CcpConstants.CHARACTERS_TO_GENERATE_TOKEN).text().generateToken(20);
		CcpMapDecorator messageDetails = new CcpMapDecorator()
				.put("id", token)
				.put("request", values)
				.put("topic", this.name())
				.put("started", System.currentTimeMillis())
				;
		String asyncTaskId = JnEntity.async_task.getId(messageDetails);
		CcpMapDecorator messageSent = values.put("asyncTaskId", asyncTaskId);
		this.mensageriaSender.send(messageSent, this);
		JnEntity.async_task.createOrUpdate(messageDetails);
		return messageSent;
	}


	public CcpMapDecorator getTranslatedAsyncTaskResult(CcpMapDecorator asyncTask) {
		throw new MensageriaTopicGenericError();
	}
}
