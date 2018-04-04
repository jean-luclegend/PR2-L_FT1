package uebung1;

public class FarmDeliveryQuantityException extends Exception {
	
	private String returnMessage = "";
	
	public FarmDeliveryQuantityException(String returnMessage) {
		this.returnMessage = returnMessage;
	}
	
	public FarmDeliveryQuantityException(int current, int min, int max) {
		returnMessage = "Falsche Bestellmenge (min: " + min + ", max: " + max + ", bestellt: " + current + ")!";
	}
	
	@Override
	public String toString() {
		return returnMessage;
	}
}
