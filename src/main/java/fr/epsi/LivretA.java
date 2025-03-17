package fr.epsi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
// @PrimaryKeyJoinColumn(name = "id")
public class LivretA extends Account {
    @Id
    private Long id;

    @JoinColumn(name = "account_id")
    private Integer account_id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
