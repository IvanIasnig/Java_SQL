package Location;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Application.Evento;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(evento);
        t.commit();
        System.out.println("Evento salvato correttamente");
    }

    public Evento findById(UUID id) {
        Evento found = em.find(Evento.class, id);
        return found;
    }

    public void findByIdAndDelete(UUID i) {
        Evento found = em.find(Evento.class, i);
        if (found != null) {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.remove(found);
            t.commit();
            System.out.println("Evento eliminato correttamente");
        } else {
            System.out.println("Evento non trovato");
        }
    }

    public void refresh(UUID id) {
        Evento found = em.find(Evento.class, id);
        if (found != null) {
            System.out.println("PRE REFRESH");
            System.out.println(found);
            em.refresh(found);
            System.out.println("POST REFRESH");
            System.out.println(found);
        } else {
            System.out.println("Evento non trovato");
        }
    }
}