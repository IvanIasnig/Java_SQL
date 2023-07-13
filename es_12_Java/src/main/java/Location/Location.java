package Location;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import Application.Evento;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String citta;
    
    @OneToMany(mappedBy = "location")
    private Set<Evento> evento;
    
    public Location() {}
    
	public Location(String nome, String citta) {
		this.nome = nome;
		this.citta = citta;
	}
	
    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
}
    @Override
    public String toString() {
        return "Location [id=" + id + ", nome=" + nome + ", citta=" + citta + "]";
    }
}
