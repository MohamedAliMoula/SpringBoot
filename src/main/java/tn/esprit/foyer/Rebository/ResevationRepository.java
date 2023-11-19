package tn.esprit.foyer.Rebository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Entity.Universite;

import java.sql.Date;

public interface ResevationRepository extends JpaRepository<Reservation, Long> {
    Reservation findByIdReservation(String idReservation);
    Reservation findReservationsByAnneeUniversitaire(Date date);
}
