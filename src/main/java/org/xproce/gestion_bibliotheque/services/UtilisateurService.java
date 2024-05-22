package org.xproce.gestion_bibliotheque.services;

import org.springframework.stereotype.Service;
import org.xproce.gestion_bibliotheque.deo.entities.Utilisateurs;

import java.util.List;
@Service
public interface UtilisateurService {
    Utilisateurs trouverParId(Long id);
    List<Utilisateurs> trouverTous();
    Utilisateurs enregistrer(Utilisateurs utilisateur);
    void supprimer(Long id);
    Utilisateurs trouverParEmail(String email);
}
