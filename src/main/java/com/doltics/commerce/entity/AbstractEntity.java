/**
 *
 */
package com.doltics.commerce.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * 
 * AbstractEntity - entity super class
 * 
 * @author <a href="mailto:paul@hubloy.com">Paul Kevin</a>
 *
 * @version enter version, 27 Oct 2020
 *
 * @since  jdk 12
 */
@MappedSuperclass
@EntityListeners(EntityListener.class)
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 785175327893141674L;

	@Version
	private int version;

	@Column(name = "item_id", nullable = false, unique = true)
	protected String itemId;

	@Column(name = "date_created", updatable = false)
	@CreatedDate
	private Date dateCreated;

	@Column(name = "date_updated", nullable = true)
	@LastModifiedDate
	private Date dateUpdated;

	@Column(name = "deleted", nullable = false)
	private boolean deleted = false;

	public int getVersion() {

		return version;
	}

	public void setVersion(int version) {

		this.version = version;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Date getDateCreated() {

		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {

		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {

		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {

		this.dateUpdated = dateUpdated;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}