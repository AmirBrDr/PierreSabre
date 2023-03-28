package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
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
}
