package com.doltics.commerce.abstracts;

import java.io.Serializable;
import java.util.Date;

import com.doltics.commerce.utils.StatusUtils;

/**
 * Abstract API response.
 * Base class used to return a response.
 * 
 * @author Paul
 *
 */
public abstract class AbstractResponse implements Serializable {

	private static final long serialVersionUID = -8759131711743091195L;

	private int status;

	private String message;

	private Date date;
	
	public AbstractResponse() {
		super();
	}
	
	public AbstractResponse(StatusUtils status, String message) {
		super();
		this.status = status.getValue();
		this.message = message;
		this.date = new Date();
	}

	public AbstractResponse(StatusUtils status, String message, Date date) {
		super();
		this.status = status.getValue();
		this.message = message;
		this.date = date;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(StatusUtils status) {
		this.status = status.getValue();
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
