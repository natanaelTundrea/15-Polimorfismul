
public class Calatori extends Vagon {
	private int nrLocuri;
	
	//constructor
	protected Calatori(int nrColete, int nrLocuri) {
		super(nrColete);
		this.nrLocuri = nrLocuri;
	}
	
	//getter
	public int getNrLocuri() {
		return nrLocuri;
	}
	
	//methods
	public void deschidereaAutomataUsi() {
		System.out.println("Usile s-au deschis automat");
	}
	
	public void inchidereaAutomataUsi() {
		System.out.println("Usile s-au inchis automat");
	}

}
