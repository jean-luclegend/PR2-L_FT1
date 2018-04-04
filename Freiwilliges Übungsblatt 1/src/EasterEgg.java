
public class EasterEgg extends Egg {
		
	private Colour eggColour=null;
	private boolean cooked;
	//private boolean coloured=false;
	
	
	public EasterEgg() {
		
	}
	
	public EasterEgg(Egg normalEgg) {
		super(normalEgg);
	}
	
	public void cook() throws EggCrackException{
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
