package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.livre;

import java.util.List;

public interface livrerepos extends JpaRepository<livre, Long> {
//   List<livre> findByAuteur(String auteur);
}
