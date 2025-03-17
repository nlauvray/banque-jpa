package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Virement", schema = "banque", catalog = "banque")
public class Virement extends Operation {
    private String beneficiaire;
    private String remboursement;

    private Long id;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Operation operation;


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
