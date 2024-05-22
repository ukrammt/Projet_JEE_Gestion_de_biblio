package org.xproce.gestion_bibliotheque.deo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private long num;
    private String Adress;
    @OneToMany(mappedBy = "utilisateur")
    private Set<Emprunt> emprunts;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Reservation> reservations;
    @OneToMany(mappedBy = "utilisateur")
    private Set<Commentaire> commentaires;
}
