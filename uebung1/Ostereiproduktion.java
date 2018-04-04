package uebung1;

public class Ostereiproduktion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Huehnerfarm myHuehnerfarm = new Huehnerfarm();
		Ostereifabrik myOstereifabrik = new Ostereifabrik();
		
		
		try {
			Ei[][] rohEier = myHuehnerfarm.liefereEier(60, 4);
			System.out.println("Eier geliefert.");
			myOstereifabrik.wareneingang(rohEier);
			rohEier = null; //die gibt es nun nicht mehr bzw. die sind jetzt Ostereier
			System.out.println("Eier in Ostereifabrik eingegangen.");
			
			for (int i=0; i<myOstereifabrik.getAnzahlEierkartons(); i++) {
				try {
					myOstereifabrik.kocheEier(i);				
					System.out.println("Eier gekocht.");
				}
				catch (EggCrackException ex) {
					//Ei beim Kochen geplatzt
					i--; //Palette wurde in Fabrik vernichtet
					System.out.println(ex.toString());
				}	
			}
				
			for (int i=0; i<myOstereifabrik.getAnzahlEierkartons(); i++) {
				try {	
					myOstereifabrik.faerbeEier(i, Ostereifarbe.values()[i % (Ostereifarbe.values().length-1)]);				
					System.out.println("Eier gefärbt.");
				}
				catch (EggNotBoiledException ex) {
					//rohes Ei gefärbt
					i--; //Palette wurde in Fabrik vernichtet
					System.out.println(ex.toString());
				}
				catch (EggColoredException ex) {
					//gefärbtes Ei erneut gefärbt
					i--; //Palette wurde in Fabrik vernichtet
					System.out.println(ex.toString());
				}		
			}
			
			
			myOstereifabrik.printGestapelteEierkartons();			
			
		}
		catch (FarmDeliveryQuantityException ex) {
			//falsche Mengenangabe
			System.out.print(ex.toString());
		}
		
		
		

	}

}
