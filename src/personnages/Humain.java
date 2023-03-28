package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	protected void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour! Je m'appelle "+getNom()+" et J'aime boire du "+this.boisson);
	}
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+"GLOUPS!");
	}
	public void acheter(String bien,int prix) {
		if(this.argent>=prix) {
			perdreArgent(prix);
			parler("J'ai acheter un "+bien+" qui coute "+prix);
		}
		else {
			parler("Je n'ai pas assez d'argent");
		}
	}
	void perdreArgent(int montant) {
		this.argent-=montant;
		if(this.argent<0) {
			this.argent=0;
		}
	}
	void gagnerArgent(int montant) {
		if(montant<0) {
			parler("montant est negatif!");
		}
		else this.argent+=montant;
	}
	
	
}
