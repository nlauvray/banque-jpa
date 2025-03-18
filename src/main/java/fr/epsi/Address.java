package fr.epsi;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name= "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "numéro", nullable = false)
    private String numero;

    @Column(name ="rue", nullable = false)
    private String rue;

    @Column(name = "codePostal", nullable = false)
    private String cp;

    @Column(name = "ville")
    private String ville;

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getCp() {
        return cp;
    }

    public String getVille() {
        return ville;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Address(String numero, String rue, String cp, String ville) {
        this.numero = numero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Address() {}
}

