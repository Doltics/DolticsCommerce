/**
 *
 */
package com.doltics.commerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doltics.commerce.constants.StatusTypes;
import com.doltics.commerce.response.GenericMessage;

/**
 * Add a brief description of DefaultController
 * 
 * @author <a href="mailto:enter email address">Paul Kevin</a>
 * @verion enter version, Jul 5, 2016
 * @since enter jdk version
 */
@RestController
public class DefaultController {


	/**
	 * 
	 * Default page
	 * <p>
	 * 
	 * @return <code>GenericResponse</code>
	 */
	@RequestMapping(value = "/")
	public GenericMessage indexPage() {

		return new GenericMessage(StatusTypes.SUCCESS, "Welcome");
	}
}