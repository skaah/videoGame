package ecole;

public class Cours {

	private String nomCours;
	private Integer nbhCours;
	private Integer annCours;

	public Cours(String nomCours, Integer nbhCours, Integer annCours) {
		this.nomCours = nomCours;
		this.nbhCours = nbhCours;
		this.annCours = annCours;

	}

	public String getNomCours() {
		return nomCours;
	}

	public Integer getNbhCours() {
		return nbhCours;
	}

	public Integer getAnnCours() {
		return annCours;
	}

	

}
