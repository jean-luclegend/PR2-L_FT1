
public class EasterEgg extends Egg { //subclass of egg with additional attributes and methods
		
	private Colour eggColour=null;
	private boolean cooked;
	//private boolean coloured=false;
	
	
	public EasterEgg() { // standard constructor
		
	}
	
	public EasterEgg(Egg normalEgg) {
		super(normalEgg); 	// calls super constructor of the class Egg (Includes all attributes from class Egg)
							// exists to create an easter egg from an egg
	}
	
	public void cook() throws EggCrackException{	// cooks egg with exception if egg was already cooked
		if(cooked||getDefect()) {
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
		if(eggColour==null) {
			eggColour = colour;
		}
		else {
			eggColour = Colour.ugly;
		}
	}
	
	
	
	public Colour getEggColour() {
		return eggColour;
	}
	
	
	public boolean getCooked() {
		return cooked;
	}
}
