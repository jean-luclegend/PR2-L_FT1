import java.io.*;
public class EasterEggProduction {
	
	public static void main (String[]args) {
		
		ChickenFarm myChickenFarm = new ChickenFarm ();
		EasterEggFactory myEasterEggFactory = new EasterEggFactory ();
		
		try {
			//System.out.println("a");
			myEasterEggFactory.productionImport(myChickenFarm.deliverEgg(120));
			for (int i = 0; i <myEasterEggFactory.sizeEasterEggBoxStack();i++) {
				System.out.println(myEasterEggFactory.sizeEasterEggBoxStack());
				System.out.println(i);
				try {
					myEasterEggFactory.cookEggs(i);//Notitz: Nachricht ob Eier erfolgreich gekocht werfen lassen in Klasse?
					System.out.println("Cooking ends succesfully=)");
				}
				catch(EggCrackException e) {
					i--;
					e.toString();
					
				}
			}
			//System.out.println("b");
			for (int i = 0; i<myEasterEggFactory.sizeEasterEggBoxStack();i++) {
				//System.out.println("c");
				try {
					
					myEasterEggFactory.colouringEggs(i, Colour.chooseColour((int)(Math.random()*5)));
					//System.out.println("d");
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
		myEasterEggFactory.printEasterEggBoxStack();
		System.out.println("The eggs are ready for takeoff=)");
		
		EggFileConverter myETFC = new EggFileConverter();
		
		
		myETFC.eggToFileConverter(myEasterEggFactory.getEasterEggBoxStack(),"testfile.txt");
		System.out.println(myETFC.getEggText());
		
		
		
	}

}
