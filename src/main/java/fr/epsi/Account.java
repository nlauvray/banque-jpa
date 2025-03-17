package fr.epsi;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private double solde;

    public void setNumero(String number) {
    }
    public void setSolde(double sold) {
    }
    public void getAccount(int number) {
    }
}

