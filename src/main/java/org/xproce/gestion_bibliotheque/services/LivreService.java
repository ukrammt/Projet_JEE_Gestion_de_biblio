package org.xproce.gestion_bibliotheque.services;
import org.springframework.stereotype.Service;

import org.xproce.gestion_bibliotheque.deo.entities.livre;

import java.util.List;

public interface LivreService {


    livre trouverParId(Long id);

    List<livre> trouverTous();

    List<livre> livretrouverTous();
    livre enregistrer(livre livre);
    void supprimer(Long id);
    List<livre> trouverParAuteur(String auteur);
}
