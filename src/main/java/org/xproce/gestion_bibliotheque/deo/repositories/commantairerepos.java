package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Admin;
import org.xproce.gestion_bibliotheque.deo.entities.Commentaire;

public interface commantairerepos extends JpaRepository<Commentaire,Long> {
}
