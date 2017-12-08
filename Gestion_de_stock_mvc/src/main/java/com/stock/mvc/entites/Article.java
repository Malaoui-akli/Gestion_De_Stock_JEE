package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article implements Serializable {

	@Id
	@GeneratedValue
	private Long idArticle;

	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
	private Long prixTtc;
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCaterogie")
	private Categorie categorie;
	
	

	public Article() {
		super();
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHt() {
		return prixUnitaireHt;
	}

	public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public Long getPrixTtc() {
		return prixTtc;
	}

	public void setPrixTtc(Long prixTtc) {
		this.prixTtc = prixTtc;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

}
