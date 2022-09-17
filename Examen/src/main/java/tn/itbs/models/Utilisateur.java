package tn.itbs.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String email_user;
	
	@Column
	private String password_user;
	
	@Column
	private String type_user;

	@Column
	private String name;
	
	@Column
	private String adresse_client;
	
	@Column
	private String tel_client;
	
	@OneToMany(mappedBy="CID.utilisateur")
	private List<Commandes> listC = new ArrayList<Commandes>();

	public Utilisateur() {
		super();
	}
	
}
