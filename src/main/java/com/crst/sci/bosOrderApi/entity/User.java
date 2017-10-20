package com.crst.sci.bosOrderApi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rohit
 *
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	// @JoinColumn(name="BOOKER_ID")
	private List<Booker> bookers;

	/**
	 * Default Constructor
	 */
	public User() {

	}

	/**
	 * @param name
	 * @param number
	 * 
	 *            Parametrized Constructor
	 */
	public User(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return id;
	}

	public void setUserId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Collection<Booker> getBookerCollection() { return
	 * bookerCollection; }
	 * 
	 * public void setBookerCollection(Collection<Booker> bookerCollection) {
	 * this.bookerCollection = bookerCollection; }
	 */

}
