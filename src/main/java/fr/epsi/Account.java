package fr.epsi;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "solde")
    private double solde;

    @ManyToMany
    @JoinTable(
            name = "compte_client",
            joinColumns = @JoinColumn(name = "compte_client"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private List<Client> clients = new ArrayList<>();

    @OneToMany(mappedBy = "compte")
    private List<Operation> operations = new ArrayList<>();


    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Account(){}

    public Account(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }
}
