package com.stock.mvc.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCmdFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCmdFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCmdFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	

	public LigneCmdFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdLigneCmdFournisseur() {
		return idLigneCmdFournisseur;
	}

	public void setIdLigneCmdFournisseur(Long idLigneCmdFournisseur) {
		this.idLigneCmdFournisseur = idLigneCmdFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	

	
}
