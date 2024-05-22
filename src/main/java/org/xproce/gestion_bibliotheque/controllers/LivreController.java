package org.xproce.gestion_bibliotheque.controllers;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xproce.gestion_bibliotheque.deo.entities.livre;
import org.xproce.gestion_bibliotheque.services.LivreService;

import java.util.List;

//@RestController
@Controller
public class LivreController {
    @Autowired
    private LivreService livreService;
    @GetMapping("/index")
    public String start(Model model){
        return "livre";
    }
    @GetMapping("/Membre")
    public String membre()
    {
        return "Membre";
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<livre> obtenirLivreParId(@PathVariable Long id) {
//        livre livre = livreService.trouverParId(id);
//        return livre != null ? ResponseEntity.ok(livre) : ResponseEntity.notFound().build();
//    }
//
//    @GetMapping("")
//    public ResponseEntity<List<livre>> obtenirTousLesLivres() {
//        List<livre> livres = livreService.trouverTous();
//        return ResponseEntity.ok(livres);
//    }
//
//    @PostMapping
//    public ResponseEntity<livre> ajouterLivre(@RequestBody livre livre) {
//        livre livreAjoute = livreService.enregistrer(livre);
//        return ResponseEntity.ok(livreAjoute);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<livre> mettreAJourLivre(@PathVariable Long id, @RequestBody livre livre) {
//        livre livreMisAJour = livreService.trouverParId(id);
//        if (livreMisAJour != null) {
//            livre.setId(id);
//            livreMisAJour = livreService.enregistrer(livre);
//            return ResponseEntity.ok(livreMisAJour);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> supprimerLivre(@PathVariable Long id) {
//        livre livre = livreService.trouverParId(id);
//        if (livre != null) {
//            livreService.supprimer(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
