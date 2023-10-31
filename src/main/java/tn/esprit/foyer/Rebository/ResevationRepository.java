package tn.esprit.foyer.Rebository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Reservation;

public interface ResevationRepository extends JpaRepository<Reservation, Long> {
}
