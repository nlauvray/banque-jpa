package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class LivretA extends Account {
    private double taux;
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Account account;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
