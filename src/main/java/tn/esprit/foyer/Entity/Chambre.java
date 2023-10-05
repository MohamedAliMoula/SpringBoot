package tn.esprit.foyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chambre {
    public enum TypeChambre { SIMPLE, DOUBLE, TRIPLE };
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)

    private TypeChambre typeChambre;
    @ManyToOne
    Bloc bloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="chambre")
    private Set<Reservation> Reservations;
}
