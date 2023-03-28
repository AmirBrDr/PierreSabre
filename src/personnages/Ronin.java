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
	private void provoquer(Yakuza adversaire) {
		if(this.honneur*2>=adversaire.getReputation()) {
			gagnerArgent(adversaire.perdre());
			this.honneur+=1;
			parler("j'ai gagne");
		}
		else {
			this.honneur-=1;
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			parler("j'ai perdu");
		}
	}

}
