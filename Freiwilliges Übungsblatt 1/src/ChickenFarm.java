
public class ChickenFarm {
	private int request;
	private int [][] eggBoxStack;
	private int minimumOrderSize;
	private int maximumOrderSize;
	
	public ChickenFarm() {
		minimumOrderSize=25;
		maximumOrderSize=5000;
	}
	
	public ChickenFarm(int minimumOrderSize, int maximumOrderSize) {
		this.minimumOrderSize=minimumOrderSize;
		this.maximumOrderSize=maximumOrderSize;
	}
	
	public int[][] fillEggBoxStack(int quanOfEgg) {
		int quanFullBox=quanOfEgg/25;
		int quanLastBox=quanOfEgg%25;
		int planEggBoxStack[][]=new int [quanFullBox][quanLastBox];
		return planEggBoxStack[][];
	}
	
	public Egg[][] deliverEgg(quantity) {
		if()
	}
}
