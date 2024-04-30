
public class Teren extends Proprietate {
	private Rang rang;
	
	//constructor
	public Teren(Adresa adresa, int suprafata, Rang rang) {
		super(adresa, suprafata);
		this.rang = rang;
	}

	//getters
	public int getCost() {
		return (350 * getSuprafata()) /rang.getRang();
	}

	public String toString() {
		String output = "";
		output += getClass().getName() + ":   " + getAdresa() + "\n";
		output += "         Suprafata: " + getSuprafata() + "\n";
		output += "         Cost: " + getCost() + "\n";
		return output;
	}

}
