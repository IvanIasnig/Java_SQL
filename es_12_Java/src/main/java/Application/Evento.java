package Application;

import javax.persistence.*;

import Location.Location;
import Partecipazione.Partecipazione;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Evento {

    @Id
    @GeneratedValue
    private UUID id;
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private int numeroMassimoPartecipanti;
    
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany
    private Set<Partecipazione> partecipazioni = new HashSet<>();


    public Evento() {}

    public Evento(String titolo, TipoEvento tipoEvento, String descrizione, LocalDate dataEvento, int numeroMassimoPartecipanti,Location location) {
        this.titolo = titolo;
        this.tipoEvento = tipoEvento;
        this.descrizione = descrizione;
        this.dataEvento = dataEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.location = location;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Set<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void addPartecipazione(Partecipazione partecipazione) {
        this.partecipazioni.add(partecipazione);
        partecipazione.setEvento(this);
    }

    public void removePartecipazione(Partecipazione partecipazione) {
        this.partecipazioni.remove(partecipazione);
        partecipazione.setEvento(null);
    }
}


