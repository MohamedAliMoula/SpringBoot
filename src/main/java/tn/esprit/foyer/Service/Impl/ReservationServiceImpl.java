package tn.esprit.foyer.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Rebository.ResevationRepository;
import tn.esprit.foyer.Service.ReservationService;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    ResevationRepository resevationRepository;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return resevationRepository.findAll() ;
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return resevationRepository.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return resevationRepository.findById(idReservation).get();
    }
}
