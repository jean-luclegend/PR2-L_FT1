
public class EasterEggProduction {
	
	public static void main (String[]args) {
		
		ChickenFarm myChickenFarm = new ChickenFarm ();
		EasterEggFactory myEasterEggFactory = new EasterEggFactory ();
		
		try {
			myEasterEggFactory.productionImport(myChickenFarm.deliverEgg(120));	
			
		}
		catch(FarmDeliveryQuantityException e){
			e.toString();
		}
	}

}
