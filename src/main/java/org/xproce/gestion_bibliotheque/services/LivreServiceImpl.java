package org.xproce.gestion_bibliotheque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xproce.gestion_bibliotheque.deo.entities.livre;
import org.xproce.gestion_bibliotheque.deo.repositories.livrerepos;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService {

    @Autowired
    private livrerepos livreRepository;

    @Override
    public livre trouverParId(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    @Override
    public List<livre> trouverTous() {
        return livreRepository.findAll();
    }

    @Override
    public List<livre> livretrouverTous() {
        // Appelez la méthode findAll() de livreRepository ici
        return livreRepository.findAll();
    }

    @Override
    public livre enregistrer(livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public void supprimer(Long id) {
        livreRepository.deleteById(id);
    }

    @Override
    public List<livre> trouverParAuteur(String auteur) {
//        return livreRepository.findByAuteur(auteur);
        return null;
    }
}
