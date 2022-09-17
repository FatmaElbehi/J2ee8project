package tn.itbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.itbs.models.Products;
import tn.itbs.services.ProductService;

@RestController
public class ProductController {


	@Autowired
	private ProductService prodService;
	
	@GetMapping("/getProducts")
	public List<Products> getAll()
	{
		return prodService.getProductsList();
	}
	
	@PostMapping("/addProducts")
	public void ajouter(@RequestBody Products prod,@RequestParam(name="id") int id, @RequestParam("file") MultipartFile file)
	{
		prodService.addProduct(prod,id,file);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void supprimer(@PathVariable("id") int id)
	{
		prodService.deleteProductById(id);
	}

	@GetMapping("/getById/{id}")
	public Products getCateg(@PathVariable("id") int id)
	{
		return prodService.getById(id);
	}
	
	@PutMapping("/updateProduct/{id}")
	public void modifierParId(@RequestBody Products prod,@PathVariable("id") int id, @RequestParam("file") MultipartFile file)
	{
		prodService.updateProd(prod,id,file);
	}
}
