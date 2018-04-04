
public class EasterEggFactory {
	
	private EasterEgg[][] EasterEggBoxStack;
	
	public void productionImport(Egg normalEggBoxStack[][]) {
		
		this.EasterEggBoxStack=new EasterEgg[normalEggBoxStack.length][];
		for (int i=0; i<normalEggBoxStack.length;i++) {
			EasterEggBoxStack[i]=new EasterEgg[normalEggBoxStack[i].length];
		}
		
		for(int i=0;i<EasterEggBoxStack.length;i++) {
			for(int j=0; j<(EasterEggBoxStack[i].length);j++) {
				EasterEggBoxStack[i][j]=new EasterEgg(normalEggBoxStack[i][j]);
			}
		} 
	}
	
	public void cookEggs(int indxPalette) throws EggCrackException{
		for(int i=0;i<EasterEggBoxStack[indxPalette].length;i++) {
			
			EasterEggBoxStack[indxPalette][i].cook();
		}
		
	}
	
	
	public void colouringEggs(int indxPalette, Colour colour) throws EggColoredException,EggNotBoiledException{
		for (int i=0;i<EasterEggBoxStack[indxPalette].length;i++) {
			if (EasterEggBoxStack[indxPalette][i].getEggColour()!=Colour.ugly) {
				EasterEggBoxStack[indxPalette][i].colouring(colour);
			}
			else {
				destroyPalette(indxPalette);
				throw new EggColoredException(EasterEggBoxStack[indxPalette][i].getEggColour(),colour);
			}
			if (!EasterEggBoxStack[indxPalette][i].getCooked()) {
				EasterEggBoxStack[indxPalette][i].cook();
			}
		}
	}
}
