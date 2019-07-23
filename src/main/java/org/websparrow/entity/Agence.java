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
@Table(name="agence")
public class Agence implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idAgence")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idAgence;
	
	@Column(name="codeAgence", unique= true)
	private int codeAgence;

	
	@Column(name="nameAgence")
	private String nameAgence;
	
	@JsonIgnore
	@OneToMany(mappedBy="agence")
	private List <Demande>demandes=new ArrayList<Demande>();
	
	@JsonIgnore
    @OneToMany(mappedBy="agence")
	private List <User>users=new ArrayList<User>();
	
	
	
	
	public Agence() {
		
	}
	
	public Agence(Long idAgence, int codeAgence, String nameAgence) {
		super();
		this.idAgence = idAgence;
		this.codeAgence = codeAgence;
		this.nameAgence = nameAgence;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public List<Demande> getDemandes() {
		return demandes;
	}

	public List<User> getUsers() {
		return users;
	}

	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	public String getNameAgence() {
		return nameAgence;
	}
	public void setNameAgence(String nameAgence) {
		this.nameAgence = nameAgence;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	}

	

	
	
	
	


