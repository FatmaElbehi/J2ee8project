package tn.itbs.models;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="produits")
public class Products {
	
	@Id
	@Column(name="id_produit")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prod;
	
	@Column(name="name_produit")
	private String name_product;
	
	@Column(name="prix")
	private double price;
	
	@Column(name="description")
	private String description;
	
	@Column
	private String disponibility;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String Img;
	
	
	@ManyToOne
	@JoinColumn(name = "id_cat")
    private Categories categ;	
	
	//@JsonIgnore
	@OneToMany(mappedBy="CID.produits")
	private List<Commandes> listC = new ArrayList<Commandes>();
	
	public Products() {
		super();
	}
	

}
