package tn.itbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.itbs.models.CommandesId;
import tn.itbs.models.Commandes;

@Repository
public interface CommandeRepository  extends JpaRepository<Commandes, CommandesId> {

}
