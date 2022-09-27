package com.doltics.commerce.utils;

/**
 * Response status codes
 * 
 * @author Paul
 *
 */
public enum StatusUtils {

	SUCCESS(200), NOTSET(203), FORBIDDEN(403), ERROR(500), NOTFOUND(404);

	private final int value;

	StatusUtils(final int newValue) {
		value = newValue;
	}

	public int getValue() {
		return value;
	}
}
