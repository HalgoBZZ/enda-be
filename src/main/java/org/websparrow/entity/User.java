package org.websparrow.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="user")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idUser")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUser;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String pwd;
	
	@ManyToOne
	private Role role;
	
	
	 @ManyToOne
	 private Agence agence;


	public User() {
		super();
	}


	public User(Long idUser, String name, String email, String pwd, org.websparrow.entity.Agence agence) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.agence = agence;
	}


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public Agence getAgence() {
		return agence;
	}


	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	

	
	}

	

	
	
	
	


