package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public int getReputation() {
		return reputation;
	}
	public Yakuza(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan= clan;
	}
	void extorquer(Commercant commercant) {
		int montant=commercant.seFaireExtorquer();
		gagnerArgent(montant); 
		reputation+=1;
		parler("J'ai pique "+montant+" sous! de "+commercant.getNom()+"et la j'ai "+getArgent()+"sous");
	}
	int perdre() {
		int montant=getArgent();
		perdreArgent(montant);
		reputation-=1;
		parler("j'ai perdu");
		return montant;
	}
	void gagner(int gain) {
		gagnerArgent(gain);
		parler("j'ai gagne");
	}
}
