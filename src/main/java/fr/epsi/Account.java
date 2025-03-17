package fr.epsi;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private float solde;

    private String numero;

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSolde(double solde) {
        this.solde = (float) solde;
    }
}

