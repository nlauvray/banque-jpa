package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courant extends Account {
    private double decouvert;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
