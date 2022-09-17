package tn.itbs.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.itbs.models.Utilisateur;
import tn.itbs.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public List<Utilisateur> getUserList(){
		return userRepo.findAll();
	}
	
	public Utilisateur getById(int id)
	{
		return userRepo.findById(id).get();
	}
	
	public void addUser(Utilisateur user)
	{
		userRepo.save(user);
	}
	
	public void deleteUser(Utilisateur user)
	{
		userRepo.delete(user);
	}
	
	public void deleteUserById(int id)
	{
		userRepo.deleteById(id);
	}
	
	public void updateUser(Utilisateur user)
	{
		userRepo.save(user);
	}
	
	
	/*public void updateById(int id) {
		userRepo.flush	
	}*/
	
}
