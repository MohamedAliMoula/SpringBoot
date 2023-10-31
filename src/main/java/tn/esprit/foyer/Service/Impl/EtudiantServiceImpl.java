package tn.esprit.foyer.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Etudiant;
import tn.esprit.foyer.Rebository.EtudiantRepository;
import tn.esprit.foyer.Service.EtudiantService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {
    private final EtudiantRepository etudiantRepository;
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

}
