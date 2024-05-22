//package org.xproce.gestion_bibliotheque.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.xproce.gestion_bibliotheque.deo.entities.Utilisateurs;
//import org.xproce.gestion_bibliotheque.services.UtilisateurService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/utilisateurs")
//public class UtilisateurController {
//    @Autowired
//    private UtilisateurService utilisateurService;
//    @GetMapping("/")
//    public String home(){
//        return "home";
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Utilisateurs> obtenirUtilisateurParId(@PathVariable Long id) {
//        Utilisateurs utilisateur = utilisateurService.trouverParId(id);
//        return utilisateur != null ? ResponseEntity.ok(utilisateur) : ResponseEntity.notFound().build();
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Utilisateurs>> obtenirTousLesUtilisateurs() {
//        List<Utilisateurs> utilisateurs = utilisateurService.trouverTous();
//        return ResponseEntity.ok(utilisateurs);
//    }
//
//    @PostMapping
//    public ResponseEntity<Utilisateurs> ajouterUtilisateur(@RequestBody Utilisateurs utilisateur) {
//        Utilisateurs utilisateurAjoute = utilisateurService.enregistrer(utilisateur);
//        return ResponseEntity.ok(utilisateurAjoute);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Utilisateurs> mettreAJourUtilisateur(@PathVariable Long id, @RequestBody Utilisateurs utilisateur) {
//        Utilisateurs utilisateurMisAJour = utilisateurService.trouverParId(id);
//        if (utilisateurMisAJour != null) {
//            utilisateur.setId(id);
//            utilisateurMisAJour = utilisateurService.enregistrer(utilisateur);
//            return ResponseEntity.ok(utilisateurMisAJour);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> supprimerUtilisateur(@PathVariable Long id) {
//        Utilisateurs utilisateur = utilisateurService.trouverParId(id);
//        if (utilisateur != null) {
//            utilisateurService.supprimer(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//}
