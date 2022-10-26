package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	public String getNom() {
		return nom;
	}
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public int getArgent() {
		return argent;
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom 
				+ " et j'aime boire du " + boisson);
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + boisson 
				+ " ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent 
					+ " sous en poche. Je vais pouvoir m'offrir " + bien 
					+ " a ");
		}
	}
	private void gagnerArgent(int gain) {
		
	}
	private void perdreArgent(int perte) {
		
	}
	
}
