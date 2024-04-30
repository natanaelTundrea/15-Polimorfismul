
public abstract class Vagon {
	private int nrColete;
	
	//constructor
	protected Vagon(int nrColete) {
		this.nrColete = nrColete;
	}
	
	//getter
	public int getNrColete() {
		return nrColete;
	}
	
	public String toString() {
		return this.getClass().getName();
	}

}
