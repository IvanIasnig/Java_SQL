package Application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import Location.Location;
import Location.LocationDAO;
import Partecipazione.Partecipazione;
import Partecipazione.PartecipazioneDAO;
import Persona.Persona;
import Persona.PersonaDAO;
import Persona.PersonaSesso;
import sottoEventi.Concerto;
import sottoEventi.GaraDiAtletica;
import sottoEventi.Genere;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Application {

    private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        EventoDAO eventoDao = new EventoDAO(em);

        Location location = new Location("Nome location", "Città");

        
        // Creare dei concerti e salvarli
        Concerto concerto1 = new Concerto("Concerto Rock", TipoEvento.PUBBLICO, "Un concerto di musica rock", LocalDate.now(), 200, location, Genere.ROCK, true);
        Concerto concerto2 = new Concerto("Concerto Pop", TipoEvento.PUBBLICO, "Un concerto di musica pop", LocalDate.now(), 150, location, Genere.POP, false);
        
        em.getTransaction().begin();
        eventoDao.save(concerto1);
        eventoDao.save(concerto2);
        em.getTransaction().commit();

        // Utilizzare i metodi di EventoDAO
        List<Concerto> concertiInStreaming = eventoDao.getConcertiInStreaming(true);
        List<Concerto> concertiRock = eventoDao.getConcertiPerGenere(Arrays.asList(Genere.ROCK));

        // Stampa i risultati
        System.out.println("Concerti in streaming:");
        for (Concerto c : concertiInStreaming) {
            System.out.println(c.getTitolo());
        }

        System.out.println("Concerti di genere rock:");
        for (Concerto c : concertiRock) {
            System.out.println(c.getTitolo());
        }

        em.close();
        emf.close();
    }
}




