package Persona;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import Partecipazione.Partecipazione;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;



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
    
    @OneToMany(mappedBy = "persona")
    @OrderBy("dataEvento ASC")
    private List<Partecipazione> listaPartecipazioni;

    public Persona() {}

	public UUID getId() {
		return id;
	}

	public Persona(String nome, String cognome, LocalDate dataNascita, String email, PersonaSesso sesso,
			List<Partecipazione> listaPartecipazioni) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.email = email;
		this.sesso = sesso;
		this.setListaPartecipazioni(listaPartecipazioni);
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

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", dataDiNascita=" + dataNascita + ", sesso=" + sesso + "]";
    }
}
