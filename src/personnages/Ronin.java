package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	public Ronin(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	void donner(Commercant beneficiaire) {
		int montant=getArgent()*10/100;
		perdreArgent(montant);
		beneficiaire.gagnerArgent(montant);
		
	}

}
