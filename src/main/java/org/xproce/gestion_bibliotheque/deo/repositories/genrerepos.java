package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Genre;
import org.xproce.gestion_bibliotheque.deo.entities.livre;

public interface genrerepos extends JpaRepository<Genre, Long> {
}
