package Partecipazione;

import javax.persistence.*;

import Application.Evento;
import Persona.Persona;

import java.util.UUID;

@Entity
public class Partecipazione {

    public enum Stato { CONFERMATA, DA_CONFERMARE }

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private Persona persona;

    @ManyToOne
    private Evento evento;

    @Enumerated(EnumType.STRING)
    private Stato stato;

    public Partecipazione() {}

    public Partecipazione(Persona persona, Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }
    
    //setters, getters e override del toString

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione [id=" + id + ", persona=" + persona + ", evento=" + evento + ", stato=" + stato + "]";
    }
}
