import java.util.ArrayList;

public class Contribuabil {
	private String name;
	private ArrayList<Proprietate> proprietati;
	
	//constructors
	public Contribuabil(String name) {
		this.name = name;
		this.proprietati = new ArrayList<Proprietate>();
	}
	
	public Contribuabil(String name, ArrayList<Proprietate> proprietati) {
		this.name = name;
		this.proprietati = proprietati;
	}
	
	//insert
	public void insertProprietate(Proprietate newProprietate) {
		proprietati.add(newProprietate);
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String toString() {
		int suma = 0;
		String output = getClass().getName() + ": " + getName() + "\n";
		for(Proprietate proprietate : proprietati) {
			output += proprietate.toString() + "\n";
			suma += proprietate.getCost();
		}
		return output + "Suma totala: " + suma;
	}
	
}
