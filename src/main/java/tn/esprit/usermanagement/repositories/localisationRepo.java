package tn.esprit.usermanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.usermanagement.entities.localisation;

@Repository

public interface localisationRepo extends JpaRepository<localisation,Integer> {
}
