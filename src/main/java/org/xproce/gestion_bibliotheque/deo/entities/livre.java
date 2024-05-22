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
public class livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String Auteur;
    private String genre;
    private String datePublication;
    private boolean disponible;
   @OneToMany(mappedBy = "livre")
    private Set<Emprunt> emprunts;
    @OneToMany(mappedBy = "livre")
    private Set<Reservation> reservations;

    @ManyToOne
    private Editeur editeur;
    @OneToMany(mappedBy = "livre")
    private Set<Commentaire> commentaires;
}
