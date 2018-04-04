
public class ChickenFarm {
	private int request;
	private int [][] eggBoxStack;
	private int minimumOrderSize;
	private int maximumOrderSize;
	private int exception=5;
	
	public ChickenFarm() {
		minimumOrderSize=25;
		maximumOrderSize=5000;
	}
	
	public ChickenFarm(int minimumOrderSize, int maximumOrderSize) {
		this.minimumOrderSize=minimumOrderSize;
		this.maximumOrderSize=maximumOrderSize;
	}
	
	private Egg[][] createEggBoxStack(int quanOfEgg) {
	int quanFullBox=quanOfEgg/25;
	int quanLastBox=quanOfEgg%25;
	if (quanLastBox==0) {
		Egg orgEggBoxStack[][]=new Egg [quanFullBox][];
		for (int i = 0; i<quanFullBox;i++) {
			orgEggBoxStack[i]=new Egg [25];
		}return orgEggBoxStack;
		
	}else {
		Egg orgEggBoxStack[][]=new Egg [quanFullBox+1][];
		for (int i = 0; i<quanFullBox;i++) {
			orgEggBoxStack[i]=new Egg[25];
		}
		orgEggBoxStack[quanFullBox]=new Egg[quanLastBox];
		return orgEggBoxStack;
		
	}
	
}
	
	

	public Egg[][] deliverEgg(int quanOfEgg) {
		Egg[][] eggBoxStack=createEggBoxStack(quanOfEgg);
		for(int i=0;i<eggBoxStack.length;i++) {
			for(int j=0; j<(eggBoxStack[i].length);j++) {
				eggBoxStack[i][j]=new Egg();
			}
		}
		return eggBoxStack;
	}
	
	public Egg[][] deliverEgg(int quanOfEgg, int exception) {
		exception=this.exception;
		
	}
	
	
}
