package tn.esprit.foyer.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  idBloc ;
    private String nomBloc;
    private long capacityBloc;
    @ManyToOne
    Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> Chambres;
}
