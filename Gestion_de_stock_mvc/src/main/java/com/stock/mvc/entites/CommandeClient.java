package com.stock.mvc.entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeClient implements Serializable{

	@Id
	@GeneratedValue
	private Long idCommandClt;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@ManyToOne
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="commandeClient")
	private List<LigneCmdClient> ligneCmdClients;
	
	

	public CommandeClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdCommandClt() {
		return idCommandClt;
	}

	public void setIdCommandClt(Long idCommandClt) {
		this.idCommandClt = idCommandClt;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCmdClient> getLigneCmdClients() {
		return ligneCmdClients;
	}

	public void setLigneCmdClients(List<LigneCmdClient> ligneCmdClients) {
		this.ligneCmdClients = ligneCmdClients;
	}

	
}
