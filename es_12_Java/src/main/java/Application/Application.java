package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.time.LocalDate;
import java.util.UUID;

public class Application {

    private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        System.out.println("CIAO");
        
        
        
        Evento festa = new Evento("Festa in piscina", TipoEvento.PUBBLICO, "Una festa in piscina",  LocalDate.now(), 150);
        // Evento festa2 = new Evento("Festa in giardino", TipoEvento.PRIVATO, "Una festa in GIARDINO", LocalDate.of(2023-08-08),200);
        EventoDAO ed = new EventoDAO(em);

        // *************** SAVE ***************
           ed.save(festa);
          // ed.save(festa2);

        // *************** FIND BY ID **********
         // Evento festaFromDB = ed.findById(festaUUID);
         // System.out.println(festaFromDB);

        // ***************** DELETE **************
         // ed.findByIdAndDelete(UUID.fromString("3ddb5449-eb84-424b-8007-ae2e7e0ffa09"));

        // ****************** REFRESH *************
        // ed.refresh(festaUUID);

        em.close();
        emf.close();

    }
}

