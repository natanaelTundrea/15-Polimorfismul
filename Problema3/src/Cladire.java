
public class Cladire extends Proprietate {
	
	//constructor
	public Cladire(Adresa adresa, int suprafata) {
		super(adresa, suprafata);
		// TODO Auto-generated constructor stub
	}
	
	//getters
	public int getCost() {
		return 500 * getSuprafata();
	}

	public String toString() {
		String output = "";
		output += getClass().getName() + ": " + getAdresa() + "\n";
		output += "         Suprafata: " + getSuprafata() + "\n";
		output += "         Cost: " + getCost() + "\n";
		return output;
	}

}
