package fr.epsi;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class AssuranceVie extends Account {
    private double taux;
    private LocalDate dateFin;
    @Id
    private Long id;

    public AssuranceVie() {}

    public AssuranceVie(String numero, double solde, double taux, LocalDate dateFin) {
        super(numero, solde);
        this.taux = taux;
        this.dateFin = dateFin;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId() {
        return Math.toIntExact(id);
    }
}