/**
 *
 */
package com.doltics.commerce.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.doltics.commerce.constants.StatusTypes;
import com.doltics.commerce.response.GenericMessage;

/**
 * Add a brief description of ErrorController
 * 
 * @author <a href="mailto:enter email address">Paul Kevin</a>
 * @verion enter version, May 19, 2016
 * @since enter jdk version
 */
@RestController
public class ErrorHandlerController implements ErrorController {

	/**
	 * 
	 * Error handling
	 * <p>
	 * 
	 * @return
	 */
	@RequestMapping(value = "/error")
	public GenericMessage error(Exception ex, WebRequest request) {

		return new GenericMessage(StatusTypes.ERROR, "An error occured completing your request");
	}

}
