package tn.esprit.foyer.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Etudiant;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Rebository.EtudiantRepository;
import tn.esprit.foyer.Rebository.ResevationRepository;
import tn.esprit.foyer.Service.EtudiantService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final ResevationRepository resevationRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
      return etudiantRepository.saveAll(etudiants);
    }

//    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
//        // Supposition de méthodes pour trouver un Etudiant et une Reservation par leurs identifiants
//        Etudiant etudiant = etudiantRepository.findEtudiantByNomEtAndPrenomEt(nomEt, prenomEt);
//        Reservation reservation = resevationRepository.findByIdReservation(idReservation);
//
//        if (etudiant != null && reservation != null) {
//            // Supposition d'une manière d'associer un Etudiant avec une Reservation
//            reservation.setEtudiants((List<Etudiant>) etudiant);
//            // Sauvegarde de la reservation mise à jour
//            resevationRepository.save(reservation);
//        } else {
//            // Gestion des cas où l'étudiant ou la réservation n'est pas trouvée
//        }
//        return etudiant;
//    }
    // In EtudiantServiceImpl.java
    @Override
    public Etudiant affecterEtudiantAReservation(String nomEt, String prenomEt, String idReservation) {
        // Assuming that there is a method in EtudiantRepository to find by name and first name
        Etudiant etudiant = etudiantRepository.findEtudiantByNomEtAndPrenomEt(nomEt, prenomEt);
        Reservation reservation = resevationRepository.findByIdReservation(idReservation);

        if(etudiant != null && reservation != null) {
            // Assuming Reservation has a method to set Etudiant
            // This part may change based on your actual relationship and business logic

            reservation.setEtudiants(etudiant);
//            etudiant.setReservations((List<Reservation>) reservation);
//            etudiantRepository.save(etudiant);
            resevationRepository.save(reservation);
            return etudiant;
        }

        return null; // or throw an exception if preferred
    }


}
