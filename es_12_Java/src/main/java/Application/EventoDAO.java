package Application;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import sottoEventi.Concerto;
import sottoEventi.Genere;


public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
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
    public List<Concerto> getConcertiInStreaming(boolean inStreaming) {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = :inStreaming", Concerto.class);
        query.setParameter("inStreaming", inStreaming);
        return query.getResultList();
    }

    public List<Concerto> getConcertiPerGenere(List<Genere> generi) {
        TypedQuery<Concerto> query = em.createQuery("SELECT c FROM Concerto c WHERE c.genere IN :generi", Concerto.class);
        query.setParameter("generi", generi);
        return query.getResultList();
    }

}

