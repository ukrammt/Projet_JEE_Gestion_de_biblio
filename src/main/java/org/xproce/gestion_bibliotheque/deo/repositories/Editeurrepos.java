package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Admin;
import org.xproce.gestion_bibliotheque.deo.entities.Editeur;

public interface Editeurrepos extends JpaRepository<Editeur,Long> {
}
