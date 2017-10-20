package com.crst.sci.bosOrderApi.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Rohit
 *
 */
@Entity
@Table(name = "Booker")
public class Booker implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "BOOKER_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookerId;

	private String name;
	private Long number;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="USER_ID")
	@JsonIgnore
	private User user;

	/**
	 * Default Constructor
	 */
	public Booker() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param number
	 * 
	 *            Parametrized Constructor
	 */
	public Booker(String name, Long number, User user) {
		this.name = name;
		this.number = number;
		this.user = user;
	}

	public Long getBookerId() {
		return bookerId;
	}

	public void setBookerId(Long bookerId) {
		this.bookerId = bookerId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}
}
