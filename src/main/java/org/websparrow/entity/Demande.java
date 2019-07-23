package org.websparrow.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
@Table(name="demande")
public class Demande implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="idDmd")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDmd;
	
	
	@Column(name="nomclient")
	protected String nomClient;
	
	@Column(name="prenonClient")
	protected String prenonClient;
	
	@Column(name="genre")
	protected String genre;
	
	@Column(name="cin")
	protected int cin;
	
	@Column(name="dateNaissance")
	protected Date dateNaissance ;
	
	@Column(name="actuellement")
	protected String actuellement;
	
	@Column(name="connaissanceenda")
	protected String connaissanceenda;
	
	@Column(name="beniciecredit")
	protected String beniciecredit;

	@Column(name="creditencours")
	protected String crediEnCous;
	
	@Column(name="activite")
	protected String activite;
	
	@Column(name="descriptionactivite")
	protected String descriptionActivite;
	
	@Column(name="besoin")
	protected String besoin;
	
	@Column(name="montantDemande")
	protected float montantDemande;
	
	@Column(name="capacite")
	protected float capacite;
	
	@Column(name="adresseproject")
	protected String adresseProject;
	
	
	@Column(name="gouvernorat")
	protected String gouvernorat;
	
	
	@Column(name="delegation")
	protected String delegation;
	
	
	@Column(name="agenceenda")
	protected String agenceEnda;
	
	
	@Column(name="adresseclient")
	protected String adresseclient;
	
	@Column(name="telephone")
	protected long telephone;
	
	@Column(name="email")
	protected String email;
	
	@Column(name="dateSaisie")
	private LocalDateTime dateSaisie;
	
	@Column(name="dateModification")
	private LocalDateTime dateModification;
	
	@Column(name="dateReafectation")
	private LocalDateTime dateReafectation;
	

	
	@ManyToOne
	private Statut statut;

	 @ManyToOne
	 private Agence agence;
	 
	 
	public Demande() {
		
	}


	public Demande(int idDmd, String nomClient, String prenonClient, String genre, int cin, Date dateNaissance,
			String actuellement, String connaissanceenda, String beniciecredit, String crediEnCous, String activite,
			String descriptionActivite, String besoin, float montantDemande, float capacite, String adresseProject,
			String gouvernorat, String delegation, String agenceEnda, String adresseclient, long telephone,
			String email, LocalDateTime dateSaisie, LocalDateTime dateModification, LocalDateTime dateReafectation) {
		super();
		this.idDmd = idDmd;
		this.nomClient = nomClient;
		this.prenonClient = prenonClient;
		this.genre = genre;
		this.cin = cin;
		this.dateNaissance = dateNaissance;
		this.actuellement = actuellement;
		this.connaissanceenda = connaissanceenda;
		this.beniciecredit = beniciecredit;
		this.crediEnCous = crediEnCous;
		this.activite = activite;
		this.descriptionActivite = descriptionActivite;
		this.besoin = besoin;
		this.montantDemande = montantDemande;
		this.capacite = capacite;
		this.adresseProject = adresseProject;
		this.gouvernorat = gouvernorat;
		this.delegation = delegation;
		this.agenceEnda = agenceEnda;
		this.adresseclient = adresseclient;
		this.telephone = telephone;
		this.email = email;
		this.dateSaisie = dateSaisie;
		this.dateModification = dateModification;
		this.dateReafectation = dateReafectation;
	}


	public int getIdDmd() {
		return idDmd;
	}


	public void setIdDmd(int idDmd) {
		this.idDmd = idDmd;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenonClient() {
		return prenonClient;
	}


	public void setPrenonClient(String prenonClient) {
		this.prenonClient = prenonClient;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public Date getDateNaissance() {
		return dateNaissance;
	}


	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	public String getActuellement() {
		return actuellement;
	}


	public void setActuellement(String actuellement) {
		this.actuellement = actuellement;
	}


	public String getConnaissanceenda() {
		return connaissanceenda;
	}


	public void setConnaissanceenda(String connaissanceenda) {
		this.connaissanceenda = connaissanceenda;
	}


	public String getBeniciecredit() {
		return beniciecredit;
	}


	public void setBeniciecredit(String beniciecredit) {
		this.beniciecredit = beniciecredit;
	}


	public String getCrediEnCous() {
		return crediEnCous;
	}


	public void setCrediEnCous(String crediEnCous) {
		this.crediEnCous = crediEnCous;
	}


	public String getActivite() {
		return activite;
	}


	public void setActivite(String activite) {
		this.activite = activite;
	}


	public String getDescriptionActivite() {
		return descriptionActivite;
	}


	public void setDescriptionActivite(String descriptionActivite) {
		this.descriptionActivite = descriptionActivite;
	}


	public String getBesoin() {
		return besoin;
	}


	public void setBesoin(String besoin) {
		this.besoin = besoin;
	}


	public float getMontantDemande() {
		return montantDemande;
	}


	public void setMontantDemande(float montantDemande) {
		this.montantDemande = montantDemande;
	}


	public float getCapacite() {
		return capacite;
	}


	public void setCapacite(float capacite) {
		this.capacite = capacite;
	}


	public String getAdresseProject() {
		return adresseProject;
	}


	public void setAdresseProject(String adresseProject) {
		this.adresseProject = adresseProject;
	}


	public String getGouvernorat() {
		return gouvernorat;
	}


	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}


	public String getDelegation() {
		return delegation;
	}


	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}


	public String getAgenceEnda() {
		return agenceEnda;
	}


	public void setAgenceEnda(String agenceEnda) {
		this.agenceEnda = agenceEnda;
	}


	public String getAdresseclient() {
		return adresseclient;
	}


	public void setAdresseclient(String adresseclient) {
		this.adresseclient = adresseclient;
	}


	public long getTelephone() {
		return telephone;
	}


	public void setTelephone(long telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public LocalDateTime getDateSaisie() {
		return dateSaisie;
	}


	public void setDateSaisie(LocalDateTime dateSaisie) {
		this.dateSaisie = dateSaisie;
	}


	public LocalDateTime getDateModification() {
		return dateModification;
	}


	public void setDateModification(LocalDateTime dateModification) {
		this.dateModification = dateModification;
	}


	public LocalDateTime getDateReafectation() {
		return dateReafectation;
	}


	public void setDateReafectation(LocalDateTime dateReafectation) {
		this.dateReafectation = dateReafectation;
	}


	public Statut getStatut() {
		return statut;
	}


	public void setStatut(Statut statut) {
		this.statut = statut;
	}


	public Agence getAgence() {
		return agence;
	}


	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
	
}
