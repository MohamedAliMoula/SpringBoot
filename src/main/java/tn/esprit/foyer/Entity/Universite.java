package tn.esprit.foyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne(mappedBy="universite")
    private Foyer foyer;
}
