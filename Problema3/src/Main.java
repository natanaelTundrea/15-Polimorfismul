
public class Main {

	public static void main(String[] args) {
		Contribuabil c1 = new Contribuabil("Ionel Ghita");
		c1.insertProprietate(new Teren(new Adresa("Aleea Onestilor", 38), 1500, Rang.TWO));
		c1.insertProprietate(new Cladire(new Adresa("Aleea Onestilor", 38), 400));
		System.out.println(c1.toString());

	}

}
