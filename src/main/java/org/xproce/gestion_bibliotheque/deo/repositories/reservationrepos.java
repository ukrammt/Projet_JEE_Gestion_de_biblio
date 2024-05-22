package org.xproce.gestion_bibliotheque.deo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.gestion_bibliotheque.deo.entities.Reservation;
import org.xproce.gestion_bibliotheque.deo.entities.livre;

public interface reservationrepos extends JpaRepository<Reservation, Long> {
}
