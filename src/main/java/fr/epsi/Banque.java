package fr.epsi;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Banque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
}

