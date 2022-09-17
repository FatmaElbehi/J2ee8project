package tn.itbs.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class CommandesId implements Serializable{

	@ManyToOne
	@JoinColumn(name="idProduit") // permet de specifier la clé etrangère
	private Products produits;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private Utilisateur utilisateur;
}
