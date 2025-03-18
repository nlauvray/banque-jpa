package fr.epsi;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Courant")
public class Courant extends Account{
    @Column(name = "decouvert")
    private double decouvert;

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public Courant(String numero, double solde, double decouvert) {
        super(numero, solde);
        this.decouvert = decouvert;
    }
    public Courant() {}

}