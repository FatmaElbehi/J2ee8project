package tn.itbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.models.Categories;
import tn.itbs.services.CategoriesService;

@RestController
public class CategorieController {


	@Autowired
	private CategoriesService categService;
	
	@GetMapping("/get")
	public List<Categories> getCategs()
	{
		return categService.getListCategories();
	}
	
	@PostMapping("/add")
	public void ajouter(@RequestBody Categories categ)
	{
		categService.addCategorie(categ);
	}
	
	@DeleteMapping("/delete/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		categService.deleteCategorieById(id);
	}
	
	@GetMapping("/getCategById/{id}")
	public Categories getCateg(@PathVariable("id") int id)
	{
		return categService.getById(id);
	}
	
	@PatchMapping("/updateCateg/{id}")
	public void modifierParId(@PathVariable("id") int id)
	{
		Categories categ=categService.getById(id);
		categService.updateCategorie(categ);
	}
}
