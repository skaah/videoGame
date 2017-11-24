package ecole;

public class Eleve {
	private String nomElv;
	private Integer ageElv;
	private Integer annElv;
	
	public Eleve(String nomElv, Integer ageElv, Integer annElv) {
		this.nomElv = nomElv;
		this.ageElv = ageElv;
		this.annElv = annElv;
	}
	
	public String getNomElv() {
		return nomElv;
	}
	public Integer getAgeElv() {
		return ageElv;
	}
	public Integer getAnnElv() {
		return annElv;
	}
	

}
