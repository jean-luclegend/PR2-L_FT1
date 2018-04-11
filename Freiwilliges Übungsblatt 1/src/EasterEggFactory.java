
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
			try {
				easterEggBoxStack[indxPalette][i].cook();
			} catch (EggCrackException e) {
				destroyPalette(i);
				throw e;
			}
		}

	}

	public void colouringEggs(int indxPalette, Colour colour) throws EggColoredException, EggNotBoiledException {
		for (int i = 0; i < easterEggBoxStack[indxPalette].length; i++) {
			if (easterEggBoxStack[indxPalette][i].getEggColour() != Colour.ugly) {
				easterEggBoxStack[indxPalette][i].colouring(colour);
			} else {
				destroyPalette(indxPalette);
				throw new EggColoredException(easterEggBoxStack[indxPalette][i].getEggColour(), colour);

			}
			// try {
			// easterEggBoxStack[indxPalette][i].cook(); //COOKING IS NOT NEEDED IN METHOD
			// COLOURING, cooking is processed in a seperte method
			//
			// }
			// catch(EggCrackException e) {
			// destroyPalette(indxPalette);
			// throw new EggNotBoiledException();
			// }
		}
	}

	public int sizeEasterEggBoxStack() {
		if (easterEggBoxStack != null) {
			return easterEggBoxStack.length;
		} else {
			return 0;
		}

	}

	public void printEasterEggBoxStack() {
		// String printedEasterEggs = null;
		for (int i = 0; i < sizeEasterEggBoxStack(); i++) {
			for (int j = 0; j < easterEggBoxStack[i].length; j++) {
				// printedEasterEggs= printedEasterEggs + " | " +
				// easterEggBoxStack[i][j].getEggColour();
				if (easterEggBoxStack[i][j].getEggColour() != null) {
					System.out.print("| " + easterEggBoxStack[i][j].getEggColour().getRealName() + " |");
				} 
//					else {
//					System.out.print("| uncolored egg |");
//
//				}
			}
			System.out.println();
			// printedEasterEggs=printedEasterEggs + "/n";
		}
		// return printedEasterEggs;
	}
	
	public Egg[][] getEasterEggBoxStack(){
		return easterEggBoxStack;
	}

	private void destroyPalette(int indxPalette) {

		if (indxPalette < easterEggBoxStack.length) {
			if (easterEggBoxStack.length > 1) {
				// neuer Stapel wird um eine Palette kleiner
				EasterEgg[][] newEasterEggBoxStack = new EasterEgg[easterEggBoxStack.length - 1][];

				int j = 0;
				for (int i = 0; i < easterEggBoxStack.length; i++) {
					if (i != indxPalette) {
						// alle Paletten außer der zu vernichtenden zuweisen
						newEasterEggBoxStack[j++] = easterEggBoxStack[i];
					}
				}
				easterEggBoxStack = newEasterEggBoxStack;
			} else {
				// Stapel bestelt aus nur einer Palette -> gibt keinen Stapel mehr
				easterEggBoxStack = null;
			}//System.out.println("palette "+indxPalette+" is destroyed!");
		}
		

		// for (int i=indxPalette; i<easterEggBoxStack.length-1;i++) {
		// easterEggBoxStack[i]=easterEggBoxStack[i+1];
		//
		// }
		// easterEggBoxStack[easterEggBoxStack.length-1]=null;

	}
}
