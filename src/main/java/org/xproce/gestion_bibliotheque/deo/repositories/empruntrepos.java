package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Emprunt;
import org.xproce.gestion_bibliotheque.deo.entities.livre;

public interface empruntrepos extends JpaRepository<Emprunt, Long> {
}
