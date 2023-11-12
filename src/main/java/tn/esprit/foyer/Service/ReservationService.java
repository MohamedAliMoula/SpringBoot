package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Reservation;

import java.util.List;

public interface ReservationService {
    List<Reservation> retrieveAllReservation();

    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (long idReservation);
}
