package fr.epsi;

import jakarta.persistence.*;
import java.time.LocalDateTime;

public class TestBanque {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Client client1 = new Client();
        Client client2 = new Client();

        Account compte1 = new Courant();
        compte1.setNumero("12345");
        compte1.setSolde(1000.0);
        client1.getAccount(compte1);
        client2.getAccount(compte1);

        em.persist(client1);
        em.persist(client2);
        em.persist(compte1);

        Client client3 = new Client();
        Account livretA = new LivretA();
        livretA.setNumero("67890");
        livretA.setSolde(2000.0);

        Account assuranceVie = new AssuranceVie();
        assuranceVie.setNumero("54321");
        assuranceVie.setSolde(5000.0);

        client3.getAccount(livretA);
        client3.getAccount(assuranceVie);

        em.persist(client3);
        em.persist(livretA);
        em.persist(assuranceVie);

        Virement virement = new Virement();
        virement.setMontant(100.0);
        virement.setMotif("Remboursement");
        virement.setDate(LocalDateTime.now());
        virement.setBeneficiary("Paul");
        virement.setAccount(compte1);

        em.persist(virement);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
