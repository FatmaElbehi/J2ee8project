package tn.itbs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

import tn.itbs.models.Categories;
import tn.itbs.models.Products;
import tn.itbs.models.Utilisateur;
import tn.itbs.repositories.CategRepository;
import tn.itbs.repositories.ProductRepository;
import org.springframework.util.StringUtils;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private CategRepository cateRepo;

	
	public List<Products> getProductsList(){
		return prodRepo.findAll();
	}
	
	public Products getById(int id)
	{
		return prodRepo.findById(id).get();
	}
	
	public void addProduct(Products prod,int idC,MultipartFile file)
	{
		Categories c=cateRepo.findById(idC).get();
		prod.setCateg(c);
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			prod.setImg(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		prodRepo.save(prod);
	}
	
	public void deleteProduct(Products prod)
	{
		prodRepo.delete(prod);
	}
	
	public void deleteProductById(int id)
	{
		prodRepo.deleteById(id);
	}

	public void updateProd(Products prod,int idC,MultipartFile file)
	{
		Categories c=cateRepo.findById(idC).get();
		prod.setCateg(c);
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		if(fileName.contains(".."))
		{
			System.out.println("not a a valid file");
		}
		try {
			prod.setImg(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		prodRepo.save(prod);	
		}

}
