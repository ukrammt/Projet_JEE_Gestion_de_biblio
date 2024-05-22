package org.xproce.gestion_bibliotheque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.gestion_bibliotheque.deo.entities.Utilisateurs;
import org.xproce.gestion_bibliotheque.deo.repositories.utilisateurrepos;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService{
    @Autowired
    private utilisateurrepos utilisateurRepository;

    @Override
    public Utilisateurs trouverParId(Long id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Utilisateurs> trouverTous() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateurs enregistrer(Utilisateurs utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void supprimer(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateurs trouverParEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }
}
