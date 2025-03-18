package fr.epsi;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Banque")
public class Banque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nom")
    private String nom;

    public int getId(){
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Banque(String nom) {
        this.nom = nom;
    }

    public Banque() {}
}