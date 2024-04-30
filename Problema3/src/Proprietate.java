
public abstract class Proprietate {
	private Adresa adresa;
	private int suprafata;
	
	//constructor
	public Proprietate(Adresa adresa, int suprafata) {
		this.adresa = adresa;
		this.suprafata = suprafata;
	}
	
	//getters
	public String getAdresa() {
		return adresa.toString();
	}
	
	public int getSuprafata() {
		return suprafata;
	}
	
	public abstract int getCost();
	
	public abstract String toString();

}
