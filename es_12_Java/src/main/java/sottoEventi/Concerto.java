package sottoEventi;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import Application.Evento;
import Application.TipoEvento;
import Location.Location;

@Entity
@DiscriminatorValue("concerto")
public class Concerto extends Evento {

    @Enumerated(EnumType.STRING)
    private Genere genere;
    private boolean inStreaming;

    public Concerto() {
    }

    public Concerto(String titolo, TipoEvento tipoEvento, String descrizione, LocalDate dataEvento, int limitePartecipanti, Location location, Genere genere, boolean inStreaming) {
        super(titolo, tipoEvento, descrizione, dataEvento, limitePartecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public boolean isInStreaming() {
		return inStreaming;
	}

	public void setInStreaming(boolean inStreaming) {
		this.inStreaming = inStreaming;
	}



}
