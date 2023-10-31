package tn.esprit.foyer.Service.Impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Foyer;
import tn.esprit.foyer.Entity.Universite;
import tn.esprit.foyer.Rebository.FoyerRepository;
import tn.esprit.foyer.Rebository.UniversiteRepository;
import tn.esprit.foyer.Service.UniversiteService;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements UniversiteService {
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversity(long idUniversity){
        return universiteRepository.findById(idUniversity).orElse(null);
    }

    @Override
    public void removeUniversity(long idUniversity) {
            universiteRepository.deleteById(idUniversity);
    }
}
