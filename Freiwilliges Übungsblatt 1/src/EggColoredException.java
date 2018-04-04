
public class EggColoredException extends Exception{
	
	private Colour oldColour;
	private Colour newColour;
	
	public EggColoredException(Colour oldColour, Colour newColour) {
		this.oldColour=oldColour;
		this.newColour=newColour;
	}
	
	@Override
	
	public String toString() {
		return("An Egg was coloured before. Old Colour: "+oldColour+" NewColour: "+newColour);
	}
	
}
