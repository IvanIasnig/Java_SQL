package Application;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
public class Evento {

    public enum TipoEvento { PUBBLICO, PRIVATO }

    @Id
    @GeneratedValue
    private UUID id;
    private String titolo;
    private Date dataEvento;
    private String descrizione;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;
    private int numeroMassimoPartecipanti;

    public Evento() {}

    public Evento(String titolo, TipoEvento tipoEvento, String descrizione, Date dataEvento, int numeroMassimoPartecipanti) {
        this.titolo = titolo;
        this.tipoEvento = tipoEvento;
        this.descrizione = descrizione;
        this.dataEvento = dataEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
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

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
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
}


