package tn.esprit.foyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Bloc;
import tn.esprit.foyer.Entity.Chambre;
import tn.esprit.foyer.Rebository.BlocRepository;
import tn.esprit.foyer.Rebository.ChambreRepository;
import tn.esprit.foyer.Service.ChambreService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ChambreServiceImpl  implements ChambreService {
    ChambreRepository chambreRepository;
    BlocRepository blocRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Set<Chambre> getChambresParNomBloc(String nomBloc) {

        Bloc bloc = blocRepository.findBlocByNomBloc(nomBloc);

        if (bloc != null) {
            // Supposition que Bloc possède une liste de Chambres
            return  bloc.getChambres();
        } else {
            // Gestion du cas où le bloc n'est pas trouvé
            return null;
        }
    }

    @Override
    public long nbrChambreParTypeEtBloc(Chambre.TypeChambre type, long idBloc) {
        // Supposition d'une méthode pour trouver un Bloc par son ID
        Bloc bloc = blocRepository.findById(idBloc).get();

        if (bloc != null) {
            // Supposition que Bloc possède une liste de Chambres
            return bloc.getChambres().stream()
                    .filter(chambre -> chambre.getTypeChambre() == type)
                    .count();
        } else {
            // Gestion du cas où le bloc n'est pas trouvé
            return 0;
        }
    }
}
