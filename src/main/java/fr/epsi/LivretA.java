package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LivretA extends Account {
    private double taux;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
