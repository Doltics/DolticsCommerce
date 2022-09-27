package com.doltics.commerce.abstracts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract utilities class
 * 
 * @author Paul
 *
 */
public abstract class AbstractUtil {
	
	private static Logger LOGGER = LoggerFactory.getLogger(AbstractUtil.class);
	
	/**
	 * Get Logger
	 * 
	 * @return
	 */
	public static Logger log() {
		return LOGGER;
	}
}
