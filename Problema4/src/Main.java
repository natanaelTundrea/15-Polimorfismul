import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Marfa m1 = new Marfa();
		Marfa m2 = new Marfa();
		CalatoriA ca1 = new CalatoriA();
		CalatoriA ca2 = new CalatoriA();
		CalatoriB cb1 = new CalatoriB();
		ArrayList<Vagon> list = new ArrayList<Vagon>();
		list.add(m1);
		list.add(m2);
		list.add(ca1);
		list.add(ca2);
		
		Tren tren1 = new Tren(list);
		tren1.printTren();
		System.out.println("Capacitate colete: " + tren1.getCapacitateColete());
		tren1.printTipuriContinute();
		
		System.out.println();
		list.add(cb1);
		
		Tren tren2 = new Tren(list);
		tren2.printTren();
		System.out.println("Capacitate colete: " + tren2.getCapacitateColete());
		tren2.printTipuriContinute();
		
		System.out.println();
		System.out.println("Sunt trenurile egale? -- " + tren1.equals(tren2));
		
	}

}
