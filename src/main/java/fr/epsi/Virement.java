package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Virement extends Operation {
    private String beneficiaire;
    private String remboursement;

    // Getters et Setters
    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiary(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(String remboursement) {
        this.remboursement = remboursement;
    }

}
