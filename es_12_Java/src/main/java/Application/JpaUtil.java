package Application;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("pippo");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}