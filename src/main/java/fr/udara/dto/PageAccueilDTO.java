/**
 * 
 */
package fr.udara.dto;

import java.util.List;

/**
 * DTO associé à la page d'accueil : infos meteo + qualitéAir + recensement
 * @author Udara
 *
 */
public class PageAccueilDTO {
	
	/** commune : String */
	private String nomCommune;
	
	/** recensement : String */
	private String recensement;
	
	/** positionGPS : String */
	private String positionGPS;

	/** indiceQualiteAir : String */
	private String indiceQualiteAir;
	
	/** valeursNiveauxMeteo : List<String> */
	private List<String> valeursNiveauxMeteo;
	
	/** valeursIndicateursAir : List<String> */
	private List<String> valeursIndicateursAir;

	/** dateDerniereMiseAJour : String */
	private String dateDerniereMiseAJour;

	/**
	 * Getter
	 * 
	 * @return la commune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Setter
	 * 
	 * @param commune la commune
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return le recensement
	 */
	public String getRecensement() {
		return recensement;
	}

	/**
	 * Setter
	 * 
	 * @param recensement le recensement
	 */
	public void setRecensement(String recensement) {
		this.recensement = recensement;
	}

	/**
	 * Getter
	 * 
	 * @return la positionGPS
	 */
	public String getPositionGPS() {
		return positionGPS;
	}

	/**
	 * Setter
	 * 
	 * @param positionGPS la position GPS
	 */
	public void setPositionGPS(String positionGPS) {
		this.positionGPS = positionGPS;
	}

	/**
	 * Getter
	 * 
	 * @return l'indice de la qualité de l'air
	 */
	public String getIndiceQualiteAir() {
		return indiceQualiteAir;
	}

	/**
	 * Setter
	 * 
	 * @param indiceQualiteAir l'indice de la qualité de l'air
	 */
	public void setIndiceQualiteAir(String indiceQualiteAir) {
		this.indiceQualiteAir = indiceQualiteAir;
	}

	/**
	 * Getter
	 * 
	 * @return la liste des valeurs NiveauMeteo
	 */
	public List<String> getValeursNiveauxMeteo() {
		return valeursNiveauxMeteo;
	}

	/**
	 * Setter
	 * 
	 * @param valeursNiveauxMeteo la liste des valeurs des niveaux météo
	 */
	public void setValeursNiveauxMeteo(List<String> valeursNiveauxMeteo) {
		this.valeursNiveauxMeteo = valeursNiveauxMeteo;
	}

	/**
	 * Getter
	 * 
	 * @return la lists des valeurs indicateursAir
	 */
	public List<String> getValeursIndicateursAir() {
		return valeursIndicateursAir;
	}

	/**
	 * Setter
	 * 
	 * @param valeursIndicateursAir la liste des valeurs des indicateurs Air
	 */
	public void setValeursIndicateursAir(List<String> valeursIndicateursAir) {
		this.valeursIndicateursAir = valeursIndicateursAir;
	}

	/**
	 * Getter
	 * 
	 * @return la DateDerniereMiseAJour
	 */
	public String getDateDerniereMiseAJour() {
		return dateDerniereMiseAJour;
	}

	/**
	 * Setter
	 * 
	 * @param dateDerniereMiseAJour la date de dernière mise à jour à modifier
	 */
	public void setDateDerniereMiseAJour(String dateDerniereMiseAJour) {
		this.dateDerniereMiseAJour = dateDerniereMiseAJour;
	}

}