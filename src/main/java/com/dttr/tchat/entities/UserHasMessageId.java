package com.dttr.tchat.entities;
// Generated Jan 28, 2019 12:43:14 PM by Hibernate Tools 5.2.11.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserHasMessageId generated by hbm2java
 */
@Embeddable
public class UserHasMessageId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int messid;
	private int userid;

	public UserHasMessageId() {
	}

	public UserHasMessageId(int messid, int userid) {
		this.messid = messid;
		this.userid = userid;
	}

	@Column(name = "messid", nullable = false)
	public int getMessid() {
		return this.messid;
	}

	public void setMessid(int messid) {
		this.messid = messid;
	}

	@Column(name = "userid", nullable = false)
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserHasMessageId))
			return false;
		UserHasMessageId castOther = (UserHasMessageId) other;

		return (this.getMessid() == castOther.getMessid()) && (this.getUserid() == castOther.getUserid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMessid();
		result = 37 * result + this.getUserid();
		return result;
	}

}