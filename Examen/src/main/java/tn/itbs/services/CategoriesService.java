package tn.itbs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.itbs.models.Categories;
import tn.itbs.models.Utilisateur;
import tn.itbs.repositories.CategRepository;

@Service
public class CategoriesService {

	@Autowired
	private CategRepository categRepo;
	
    //@RequestMapping(method = RequestMethod.GET)
	public List<Categories> getListCategories(){
		return categRepo.findAll();
	}
	
	public Categories getById(int id)
	{
		return categRepo.findById(id).get();
	}
	
	public void addCategorie(Categories categ)
	{
		categRepo.save(categ);
	}
	
	public void deleteCategorie(Categories categ)
	{
		categRepo.delete(categ);
	}
	
	public void deleteCategorieById(int id)
	{
		categRepo.deleteById(id);
	}
	
	public void updateCategorie(Categories categ)
	{
		categRepo.save(categ);
	}
	
	/*public void update(Categories categ) {
		categRepo.update(categ);		
	}
	
	public void updateCategById(int id) {
		categRepo.updateById(id);		
	}*/
	
}
