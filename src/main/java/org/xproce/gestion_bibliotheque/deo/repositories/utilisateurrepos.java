package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Utilisateurs;
import org.xproce.gestion_bibliotheque.deo.entities.livre;

public interface utilisateurrepos extends JpaRepository<Utilisateurs, Long> {
    Utilisateurs findByEmail(String email);
}
