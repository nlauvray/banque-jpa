package fr.epsi;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Operation")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "motif")
    private String motif;

    @Column(name = "date")
    private LocalDate dateOpe;

    @ManyToOne
    @JoinColumn(name = "compte_id")
    private Account compte;


    public double montant;

    public int getId() {
        return id;
    }

    public String getMotif() {
        return motif;
    }

    public LocalDate getDate() {
        return dateOpe;
    }

    public Account getCompte() {
        return compte;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public void setDate(LocalDate date) {
        this.dateOpe = dateOpe;
    }

    public void setCompte(Account Account) {
        this.compte = Account;
    }

    public Operation(LocalDateTime dateOpe, double montant, Account compte) {
        this.dateOpe = LocalDate.from(dateOpe);
        this.montant = montant;
        this.compte = compte;
    }

    public Operation() {}

}