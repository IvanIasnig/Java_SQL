package Partecipazione;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class PartecipazioneDAO {
    private final EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazione Partecipazione) {
        EntityTransaction t = em.getTransaction();
        em.persist(Partecipazione);
        System.out.println("Partecipazione salvato correttamente");
    }

    public Partecipazione findById(UUID id) {
        Partecipazione found = em.find(Partecipazione.class, id);
        return found;
    }

    public void findByIdAndDelete(UUID i) {
        Partecipazione found = em.find(Partecipazione.class, i);
        if (found != null) {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.remove(found);
            t.commit();
            System.out.println("Partecipazione eliminato correttamente");
        } else {
            System.out.println("Partecipazione non trovato");
        }
    }

    public void refresh(UUID id) {
        Partecipazione found = em.find(Partecipazione.class, id);
        if (found != null) {
            System.out.println("PRE REFRESH");
            System.out.println(found);
            em.refresh(found);
            System.out.println("POST REFRESH");
            System.out.println(found);
        } else {
            System.out.println("Partecipazione non trovato");
        }
    }
}