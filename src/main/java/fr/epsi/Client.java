package fr.epsi;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double montant;
    private String motif;
    private LocalDateTime date;

    @OneToOne
    private Address adresse;

    public Calendar getAccount(Account compte1) {
        return null;
    }
}

