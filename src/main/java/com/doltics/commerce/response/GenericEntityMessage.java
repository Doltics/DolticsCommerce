package com.doltics.commerce.response;

import java.util.Date;

import com.doltics.commerce.abstracts.AbstractResponse;
import com.doltics.commerce.utils.StatusUtils;

public class GenericEntityMessage extends AbstractResponse{

	private static final long serialVersionUID = -2344886059222694984L;

	private String id;

	public GenericEntityMessage() {
		super();
	}

	public GenericEntityMessage(StatusUtils status, String message, Date date) {
		super(status, message, date);
	}

	public GenericEntityMessage(StatusUtils status, String message) {
		super(status, message);
	}
	
	public GenericEntityMessage(StatusUtils status, String message, String id) {
		super(status, message);
		setId(id);
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
}
