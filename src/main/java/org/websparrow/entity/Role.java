package org.websparrow.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="role")
public class Role implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idRole")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idRole;
	
	
	@Column(name="libelle")
	private String libelle;
	
	@JsonIgnore
	@OneToMany(mappedBy="role")
	private List <User>users=new ArrayList<User>();
	
	
	public Role() {
		
	}


	public Role (Long idRole, String libelle, List<User> users) {
		super();
		this.idRole = idRole;
		this.libelle = libelle;
		this.users = users;
	}


	public Long getIdRole() {
		return idRole;
	}


	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}


	public String getLibelle() {
		return libelle;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	
	
	}

	

	
	
	
	



