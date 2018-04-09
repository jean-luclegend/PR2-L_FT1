
public class EasterEggFactory {

	private EasterEgg[][] easterEggBoxStack;

	public void productionImport(Egg normalEggBoxStack[][]) {

		this.easterEggBoxStack = new EasterEgg[normalEggBoxStack.length][];
		for (int i = 0; i < normalEggBoxStack.length; i++) {
			easterEggBoxStack[i] = new EasterEgg[normalEggBoxStack[i].length];
		}

		for (int i = 0; i < easterEggBoxStack.length; i++) {
			for (int j = 0; j < (easterEggBoxStack[i].length); j++) {
				easterEggBoxStack[i][j] = new EasterEgg(normalEggBoxStack[i][j]);
			}
		}
	}

	public void cookEggs(int indxPalette) throws EggCrackException {
		for (int i = 0; i < easterEggBoxStack[indxPalette].length; i++) {

			easterEggBoxStack[indxPalette][i].cook();
		}

	}

	public void colouringEggs(int indxPalette, Colour colour) throws EggColoredException, EggNotBoiledException, EggCrackException {
		for (int i = 0; i < easterEggBoxStack[indxPalette].length; i++) {
			if (easterEggBoxStack[indxPalette][i].getEggColour() != Colour.ugly) {
				easterEggBoxStack[indxPalette][i].colouring(colour);
			} else {
				destroyPalette(indxPalette);
				throw new EggColoredException(easterEggBoxStack[indxPalette][i].getEggColour(), colour);
			}
			if (!easterEggBoxStack[indxPalette][i].getCooked()) {
				easterEggBoxStack[indxPalette][i].cook();
			}
			else {
				destroyPalette(indxPalette);
				throw new EggNotBoiledException();
			}
		}
	}

	public int sizeEasterEggBoxStack() {
		return easterEggBoxStack.length;

	}

	public String printEasterEggBoxStack() {
		String printedEasterEggs = null;
		for (int i=0; i<easterEggBoxStack.length; i++) {
			for (int j =0; j<easterEggBoxStack[i].length; j++) {
				printedEasterEggs= printedEasterEggs + " | " + easterEggBoxStack[i][j].getEggColour();
			}
			printedEasterEggs=printedEasterEggs + "/n";
		}
		return printedEasterEggs;
	}

	private void destroyPalette(int indxPalette) {
		for (int i=indxPalette; i<easterEggBoxStack.length-1;i++) {
			easterEggBoxStack[i]=easterEggBoxStack[i+1];
			
		}
		easterEggBoxStack[easterEggBoxStack.length-1]=null;

		
	}
}
