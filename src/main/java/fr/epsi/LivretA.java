package fr.epsi;

import jakarta.persistence.*;

@Entity
public class LivretA extends Account {

    @Column(name = "taux")
    private double taux;

    public LivretA(String numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }

    public LivretA() {}

    public LivretA(String numero, double solde) {
        super(numero, solde);
        this.taux = taux;
    }
}