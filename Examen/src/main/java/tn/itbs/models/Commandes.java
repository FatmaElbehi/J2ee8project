package tn.itbs.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Commandes {
	//@JsonIgnore
	//@JsonBackReference
	@Id
	private CommandesId CID;

	@Column
	private int qte;
}
