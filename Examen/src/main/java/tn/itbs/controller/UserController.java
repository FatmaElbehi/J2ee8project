package tn.itbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tn.itbs.models.Utilisateur;

import tn.itbs.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/Clients")
	public List<Utilisateur> getAll()
	{
		return userService.getUserList();
	}
	
	@PostMapping("/addUser")
	public void ajouter(@RequestBody Utilisateur user)
	{
		userService.addUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity supprimer(@PathVariable("id") int id)
	{
		userService.deleteUserById(id);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/getUserById/{id}")
	public Utilisateur getUser(@PathVariable("id") int id)
	{
		return userService.getById(id);
	}
	
	@PatchMapping("/updateUser/{id}")
	public void modifierParId(@PathVariable("id") int id)
	{
		Utilisateur user=userService.getById(id);
		userService.updateUser(user);
	}
}
