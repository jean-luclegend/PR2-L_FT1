
public class EasterEggProduction {
	
	private EasterEgg[][] EasterEggBoxStack;
	
	public void productionImport(Egg normalEggBoxStack[][]) {
		
		this.EasterEggBoxStack=new EasterEgg[normalEggBoxStack.length][];
		
		for(int i=0;i<normalEggBoxStack.length;i++) {
			for(int j=0; j<(normalEggBoxStack[i].length);j++) {
				normalEggBoxStack[i][j]=new EasterEgg(normalEggBoxStack[i][j]);
			}
		} 
	}
	
	public void cookEggs(Egg palette []) {
		
	}
}
