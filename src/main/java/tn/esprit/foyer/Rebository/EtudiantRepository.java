package tn.esprit.foyer.Rebository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
