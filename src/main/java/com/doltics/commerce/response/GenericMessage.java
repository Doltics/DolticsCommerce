package com.doltics.commerce.response;

import java.util.Date;

import com.doltics.commerce.abstracts.AbstractResponse;
import com.doltics.commerce.utils.StatusUtils;

public class GenericMessage extends AbstractResponse{

	private static final long serialVersionUID = 3401800594759069537L;

	public GenericMessage() {
		super();
	}

	public GenericMessage(StatusUtils status, String message, Date date) {
		super(status, message, date);
	}

	public GenericMessage(StatusUtils status, String message) {
		super(status, message);
	}

}
