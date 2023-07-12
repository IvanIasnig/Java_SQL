package Persona;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import Application.TipoEvento;

@Entity
public class Persona {

    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String email;
    @Enumerated(EnumType.STRING)
    private PersonaSesso sesso;


    public Persona() {}

	public UUID getId() {
		return id;
	}

	public Persona(UUID id, String nome, String cognome, LocalDate dataNascita, String email, PersonaSesso sesso,
			int listaPartecipazioni) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.email = email;
		this.sesso = sesso;

	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonaSesso getSesso() {
		return sesso;
	}

	public void setSesso(PersonaSesso sesso) {
		this.sesso = sesso;
	}


}
