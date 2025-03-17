package fr.epsi;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private String rue;
    private String codePostal;
    private String ville;

    public Address(String numero) {
        this.numero = numero;
    }

    public Address() {

    }
}
