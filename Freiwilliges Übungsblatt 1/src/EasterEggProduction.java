
public class EasterEggProduction {
	
	public static void main (String[]args) {
		
		ChickenFarm myChickenFarm = new ChickenFarm ();
		EasterEggFactory myEasterEggFactory = new EasterEggFactory ();
		
		try {
			myEasterEggFactory.productionImport(myChickenFarm.deliverEgg(120));
			for (int i = 0; i <myEasterEggFactory.sizeEasterEggBoxStack();i++) {
				try {
					myEasterEggFactory.cookEggs(i);//Notitz: Nachricht ob Eier erfolgreich gekocht werfen lassen in Klasse?
					System.out.println("Cooking ends succesfully=)");
				}
				catch(EggCrackException e) {
					i--;
					e.toString();
					
				}
			}
			for (int i = 0; i<myEasterEggFactory.sizeEasterEggBoxStack();i++) {
				try {
					myEasterEggFactory.colouringEggs(i, Colour.values()[i%Colour.values().length-1]);
					System.out.println("Coluring ends succesfully=)");
				}
				catch(EggColoredException e) {
					i--;
					e.toString();
				}
				catch(EggNotBoiledException e) {
					i--;
					e.toString();
				}
			}
					
				
			
			
			
		}
		catch(FarmDeliveryQuantityException e){
			e.toString();
		}
		System.out.println("The eggs are ready for takeoff=)");
	}

}
