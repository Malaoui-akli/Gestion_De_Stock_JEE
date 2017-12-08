package com.stock.mvc.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MvtStock implements Serializable{

	private static final int ENTREE = 1;
	private static final int SORTIE = 2;
	@Id
	@GeneratedValue
	private Long idMvtStock;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvtStock;
	
	private BigDecimal quantite;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	

	public MvtStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdMvtStock() {
		return idMvtStock;
	}

	public void setIdMvtStock(Long idMvtStock) {
		this.idMvtStock = idMvtStock;
	}

	public Date getDateMvtStock() {
		return dateMvtStock;
	}

	public void setDateMvtStock(Date dateMvtStock) {
		this.dateMvtStock = dateMvtStock;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	

	
}
