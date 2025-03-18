package fr.epsi;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="Montant")
    private double montant;

    @Column(name = "motif")
    private String motif;

    @Column(name = "date")
    private LocalDateTime date;

    @ManyToMany
    private List<Account> comptes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public String getMotif() {
        return motif;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client(){}

    public Client(double montant, String motif, LocalDateTime date) {
        this.montant = montant;
        this.motif = motif;
        this.date = date;
    }
}