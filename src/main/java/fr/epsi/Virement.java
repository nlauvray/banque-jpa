package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Virement")
public class Virement extends Operation {
    private String beneficiaire;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Operation operation;


    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiary(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

}
