package Persona;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona Persona) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(Persona);
        t.commit();
        System.out.println("Persona salvato correttamente");
    }

    public Persona findById(UUID id) {
        Persona found = em.find(Persona.class, id);
        return found;
    }

    public void findByIdAndDelete(UUID i) {
        Persona found = em.find(Persona.class, i);
        if (found != null) {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.remove(found);
            t.commit();
            System.out.println("Persona eliminato correttamente");
        } else {
            System.out.println("Persona non trovato");
        }
    }

    public void refresh(UUID id) {
        Persona found = em.find(Persona.class, id);
        if (found != null) {
            System.out.println("PRE REFRESH");
            System.out.println(found);
            em.refresh(found);
            System.out.println("POST REFRESH");
            System.out.println(found);
        } else {
            System.out.println("Persona non trovato");
        }
    }
}