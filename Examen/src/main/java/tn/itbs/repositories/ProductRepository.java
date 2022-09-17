package tn.itbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.itbs.models.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer>{
	//Products findById_Prod(int id_prod);
	/*void update(Products prod);
	void updateById(int id);*/

}
