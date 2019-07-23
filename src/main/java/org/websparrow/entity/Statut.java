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


	
	@Entity
	@Table(name="statut")
	public class Statut implements Serializable{
		
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="idStatut")
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long idStatut;
		
		@Column(name="titleStatut")
		private String titleStatut;
		
		@OneToMany(mappedBy="statut")
		private List <Demande>demandes=new ArrayList<Demande>();

		public List<Demande> getDemandes() {
			return demandes;
		}
		public Statut() {
			
		}
		public Statut(Long idStatut, String titleStatut, List<Demande> demandes) {
			super();
			this.idStatut = idStatut;
			this.titleStatut = titleStatut;
			this.demandes = demandes;
		}

		public Long getIdStatut() {
			return idStatut;
		}

		public void setIdStatut(Long idStatut) {
			this.idStatut = idStatut;
		}

		public String getTitleStatut() {
			return titleStatut;
		}

		public void setTitleStatut(String titleStatut) {
			this.titleStatut = titleStatut;
		}

		public void setDemandes(List<Demande> demandes) {
			this.demandes = demandes;
		}

		
	}

		
