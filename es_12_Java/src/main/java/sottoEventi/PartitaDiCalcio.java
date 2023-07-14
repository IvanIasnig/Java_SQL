//package sottoEventi;
//
//import javax.persistence.DiscriminatorValue;
//import javax.persistence.Entity;
//
//import Application.Evento;
//
//@Entity
//@DiscriminatorValue("calcio")
//public class PartitaDiCalcio extends Evento {
//
//    private String squadraCasa;
//    private String squadraOspite;
//    private String squadraVincente;
//    private int numeroGolSquadraCasa;
//    private int numeroGolSquadraOspite;
//    
//    protected PartitaDiCalcio() {
//    }
//    
//	public PartitaDiCalcio(String squadraCasa, String squadraOspite, String squadraVincente, int numeroGolSquadraCasa,
//			int numeroGolSquadraOspite) {
//		super();
//		this.squadraCasa = squadraCasa;
//		this.squadraOspite = squadraOspite;
//		this.squadraVincente = squadraVincente;
//		this.numeroGolSquadraCasa = numeroGolSquadraCasa;
//		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
//	}
//	
//	public String getSquadraCasa() {
//		return squadraCasa;
//	}
//
//	public void setSquadraCasa(String squadraCasa) {
//		this.squadraCasa = squadraCasa;
//	}
//
//	public String getSquadraOspite() {
//		return squadraOspite;
//	}
//
//	public void setSquadraOspite(String squadraOspite) {
//		this.squadraOspite = squadraOspite;
//	}
//
//	public String getSquadraVincente() {
//		return squadraVincente;
//	}
//
//	public void setSquadraVincente(String squadraVincente) {
//		this.squadraVincente = squadraVincente;
//	}
//
//	public int getNumeroGolSquadraCasa() {
//		return numeroGolSquadraCasa;
//	}
//
//	public void setNumeroGolSquadraCasa(int numeroGolSquadraCasa) {
//		this.numeroGolSquadraCasa = numeroGolSquadraCasa;
//	}
//
//	public int getNumeroGolSquadraOspite() {
//		return numeroGolSquadraOspite;
//	}
//
//	public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
//		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
//	}
//}
