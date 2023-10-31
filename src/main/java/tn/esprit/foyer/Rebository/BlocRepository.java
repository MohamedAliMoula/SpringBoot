package tn.esprit.foyer.Rebository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Bloc;


public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
