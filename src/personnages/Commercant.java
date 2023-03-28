package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,String boisson,int argent) {
		super(nom,"thé",argent);
	}
	int seFaireExtorquer() {
		int montant=getArgent();
		perdreArgent(montant);
		parler("J'ai tout perdu!");
		return montant;
	}
	void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent+"sous! merci");
	}
}
