package fr.epsi;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque-jpa");
        EntityManager em = emf.createEntityManager();
        try{
            System.out.println("OK 👌");
        }catch(Exception e){
            System.out.println("KO");
        }
        em.close();
        emf.close();
    }
}