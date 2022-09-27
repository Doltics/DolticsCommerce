package com.doltics.commerce.constants;

/**
 * Response status codes
 * 
 * @author Paul
 *
 */
public enum StatusTypes {

	SUCCESS(200), NOTSET(203), FORBIDDEN(403), ERROR(500), NOTFOUND(404);

	private final int value;

	StatusTypes(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
