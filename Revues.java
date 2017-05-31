
import java.util.*;

/**
 * 
 */
public class Revues extends Document {

    private int mois;

    public Revues(int nuEnr, String titre, int mois, int annee) {
		super(nuEnr, titre);
		this.mois = mois;
		this.annee = annee;
	}

	/**
     * 
     */
    private int annee;
    
    public String toString(){
    	return "Revues a pour numéro: "+this.nuEnr+" comme titre "+this.titre+" sortie en moi "+this.mois+" de l'année "+this.annee+".";
    }
}