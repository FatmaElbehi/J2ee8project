package tn.itbs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.itbs.models.Categories;
import tn.itbs.models.Commandes;
import tn.itbs.models.CommandesId;
import tn.itbs.models.Products;
import tn.itbs.models.Utilisateur;
import tn.itbs.repositories.CategRepository;
import tn.itbs.repositories.CommandeRepository;
import tn.itbs.repositories.ProductRepository;
import tn.itbs.repositories.UserRepository;

@Service
public class CommandeService {


	@Autowired
	private CommandeRepository commandeRepo;
	
	@Autowired
	private ProductRepository prodRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public List<Commandes> getCommandesList(){
		return commandeRepo.findAll();
	}
	
	public Commandes getById(CommandesId id)
	{
		return commandeRepo.findById(id).get();
	}
	
	public void addCommande(Commandes cmd,int idC,int idP)
	{
		Products prod=prodRepo.findById(idP).get();
		cmd.getCID().setProduits(prod);
		
		Utilisateur user=userRepo.findById(idC).get();
		cmd.getCID().setUtilisateur(user);
		  
		commandeRepo.save(cmd);
	}
	
	public void deleteCommande(Commandes cmd)
	{
		commandeRepo.delete(cmd);
	}
	
	public void deleteCommandeById(CommandesId id)
	{
		commandeRepo.deleteById(id);
	}
	
	public void updateCommande(Commandes cmd)
	{
		commandeRepo.save(cmd);
	}
	
}
