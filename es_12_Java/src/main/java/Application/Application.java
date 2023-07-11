package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.sql.Date;
import java.util.UUID;

public class Application {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {

        // Creiamo l'EntityManagerFactory
        EntityManager em = emf.createEntityManager();

        System.out.println("CIAO");

        Evento festa = new Evento("Festa in piscina", Evento.TipoEvento.PUBBLICO, "Una festa in piscina", new Date(System.currentTimeMillis()), 100);
        EventoDAO ed = new EventoDAO(em);

        // *************** SAVE ***************
        // ed.save(festa);

        // *************** FIND BY ID **********
        // Supponiamo che questo sia l'UUID dell'evento "festa"
        // UUID festaUUID = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
        // Evento festaFromDB = ed.findById(festaUUID);
        // System.out.println(festaFromDB);

        // ***************** DELETE **************
        // ed.findByIdAndDelete(festaUUID);

        // ****************** REFRESH *************
        // ed.refresh(festaUUID);

        // Ricordiamoci di chiudere entity manager & factory
        em.close();
        emf.close();

    }
}

