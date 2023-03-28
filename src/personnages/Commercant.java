package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,String boisson,int argent) {
		super(nom,"thé",argent);
	}
	void seFaireExtorquer() {
		perdreArgent(getArgent());
		parler("J'ai tout perdu!");
;	}
	void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+"sous! merci");
	}
}
