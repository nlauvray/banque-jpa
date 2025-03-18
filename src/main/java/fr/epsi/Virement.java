package fr.epsi;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Virement extends Operation {
    private String beneficiaire;

    public Virement() {}

    public Virement(String beneficiaire, LocalDateTime dateOperation, double montant, Account compte) {
        super(dateOperation, montant, compte);
        this.beneficiaire = beneficiaire;
    }
    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }
}