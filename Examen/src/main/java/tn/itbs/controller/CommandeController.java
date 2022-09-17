package tn.itbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.itbs.models.Commandes;
import tn.itbs.models.CommandesId;
import tn.itbs.services.CommandeService;

@RestController
public class CommandeController {


	@Autowired
	private CommandeService cmdService;
	
	@GetMapping("/getCommandes")
	public List<Commandes> getListCmd()
	{
		return cmdService.getCommandesList();
	}
	
	@PostMapping("/addCommande")
	public void ajouter(@RequestBody Commandes cmd,@RequestParam(name="idC") int idC,@RequestParam(name="idP") int idP)
	{
		cmdService.addCommande(cmd,idC,idP);
	}
	
	@PostMapping("/deleteCommande")
	public void supprimer(@RequestBody Commandes cmd)
	{
		cmdService.deleteCommande(cmd); 
	}
	
	@GetMapping("/getCmdById/{id}")
	public Commandes getCmd(@PathVariable("id") CommandesId id)
	{
		return cmdService.getById(id);
	}
	
	@PostMapping("/updateCmd")
	public void modifierParId(@RequestBody CommandesId id)
	{
		Commandes cmd=cmdService.getById(id);
		cmdService.updateCommande(cmd);
	}
}
