package tn.itbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import tn.itbs.models.Utilisateur;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur, Integer>{

		//void updateUserById(int id);

}
