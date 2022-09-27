/**
 *
 */
package com.doltics.commerce.entity;

import java.util.Calendar;

import com.doltics.commerce.utils.IDUtils;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;


/**
 * 
 * EntityListener - handles common entity persistence fields
 * 
 * @author <a href="mailto:paul@hubloy.com">Paul Kevin</a>
 *
 * @version enter version, 27 Oct 2020
 *
 * @since  jdk 12
 */
public class EntityListener<E> {
	
	@PrePersist
	public void monitorPrePersist(AbstractEntity e) {
		e.setVersion(1);
		e.setItemId(IDUtils.id());
		e.setDateCreated(Calendar.getInstance().getTime());
		e.setDeleted(false);
	}

	@PreUpdate
	public void monitorPreUpdate(AbstractEntity e) {
		e.setDateUpdated(Calendar.getInstance().getTime());
	}
}