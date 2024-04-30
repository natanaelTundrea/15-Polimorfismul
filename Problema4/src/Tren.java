import java.util.ArrayList;
import java.util.HashSet;

public class Tren {
	private ArrayList<Vagon> vagoane;
	
	//constructor
	public Tren(ArrayList<Vagon> vagoane) {
		if(vagoane.size()<=15)
			this.vagoane = new ArrayList<Vagon>(vagoane);
		else {
			this.vagoane = new ArrayList<Vagon>();
			for(int i=0; i<15; i++)
				this.vagoane.add(vagoane.get(i));
			
			System.out.println("Vagoanele atasate au fost prea multe => preluate doar primlele 15 vagoane");
		}
	}
	
	//getters
	public int getCapacitateColete() {
		int suma = 0;
		for(Vagon vagon: vagoane)
			suma += vagon.getNrColete();
		return suma;
	}
	
	//equals
	public boolean equals(Tren obj) {
		return this.getCapacitateColete() == obj.getCapacitateColete();
	}
	
	//print
	public void printTipuriContinute() {
		HashSet<String> containedTypes = new HashSet<String>();
		for(Vagon vagon: vagoane)
			containedTypes.add(vagon.getClass().getName());
		System.out.println("Trenul contine aceste tipuri de vagoane:");
		for(String type: containedTypes)
			System.out.println("- " + type + " -");
	}
	
	public void printTren() {
		System.out.print("Locomotiva");
		for(Vagon vagon: vagoane)
			System.out.print(" -.- " + vagon.toString());
		System.out.print("\n");
			
	}

}
