package Location;

import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location Location) {
        EntityTransaction t = em.getTransaction();
        t.begin();
        em.persist(Location);
        t.commit();
        System.out.println("Evento salvato correttamente");
    }

    public Location findById(UUID id) {
        Location found = em.find(Location.class, id);
        return found;
    }

    public void findByIdAndDelete(UUID i) {
        Location found = em.find(Location.class, i);
        if (found != null) {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.remove(found);
            t.commit();
            System.out.println("Location eliminato correttamente");
        } else {
            System.out.println("Location non trovato");
        }
    }

    public void refresh(UUID id) {
        Location found = em.find(Location.class, id);
        if (found != null) {
            System.out.println("PRE REFRESH");
            System.out.println(found);
            em.refresh(found);
            System.out.println("POST REFRESH");
            System.out.println(found);
        } else {
            System.out.println("Location non trovato");
        }
    }
}
