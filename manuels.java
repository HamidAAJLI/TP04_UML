
import java.util.*;

/**
 * 
 */
public class manuels extends Livres {
    /**
     * 
     */
    private int niveauSco;

	public manuels(int nuEnr, String titre, String auteur, int nbPages, int niveauSco) {
		super(nuEnr, titre, auteur, nbPages);
		this.niveauSco = niveauSco;
	}
	
	public String toString(){
    	return "Manuel a pour num�ro: "+this.nuEnr+" comme titre "+this.titre+" �crite par "+this.auteur+" contient "+this.nbPages+" pages. pour le niveau "+this.niveauSco+".";
    }
}