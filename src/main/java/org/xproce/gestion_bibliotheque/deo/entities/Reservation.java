package org.xproce.gestion_bibliotheque.deo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private livre livre;

    @ManyToOne
    private Utilisateurs utilisateur;

    private LocalDate dateReservation;
    private LocalDate dateExpiration;
}
