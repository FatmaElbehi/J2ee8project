package tn.itbs.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="categories")
public class Categories implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat;
	
	@Column
	private String name_cat;
	
	@Column
	private String description_cat;
	
	public Categories() {
		super();
	}
	
	/*@OneToMany(mappedBy = "categories")
	@Autowired
	private List<Products> list = new ArrayList<Products>();*/
}
