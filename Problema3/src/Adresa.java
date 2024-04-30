
public class Adresa {
	private String strada;
	private int numar;
	
	//constructor
	public Adresa(String strada, int numar) {
		this.strada = strada;
		this.numar = numar;
	}
	
	//getters
	public String getStrada() {
		return strada;
	}
	
	public int getNumar() {
		return numar;
	}
	
	public String toString() {
		return "Strada " + strada + " Nr " + numar;
	}

}
