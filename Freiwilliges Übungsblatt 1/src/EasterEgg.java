
public class EasterEgg extends Egg {
		
	private Colour eggColour;
	private boolean cooked;
	private boolean coloured=false;
	
	
	
	public void cook() throws EggCrackException{
		if(cooked==true||getDefect()==true) {
			throw new EggCrackException();
		}
		else {
			cooked=true;
		}
		
	}
	
	/*public void coluring() {
		if(coloured==true) {
			eggColour = Colour.ugly;
		}
		else {
			eggColour = colour;
		}
	}*/
	

	
	public void colouring(Colour colour) {
		if(coloured==true) {
			eggColour = Colour.ugly;
		}
		else {
			eggColour = colour;
		}
	}
}
