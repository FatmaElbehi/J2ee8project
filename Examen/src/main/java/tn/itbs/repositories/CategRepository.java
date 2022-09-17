package tn.itbs.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.itbs.models.Categories;

@Repository
public interface CategRepository extends JpaRepository<Categories, Integer> {
    public List<Categories> findAll();
	
//	public void update(Categories categ);

//	public void updateById(int id);
	

}
