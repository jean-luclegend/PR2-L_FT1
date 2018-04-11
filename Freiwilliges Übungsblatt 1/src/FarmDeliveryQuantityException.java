
public class FarmDeliveryQuantityException extends Exception{
	
	private String message="";
	
	public FarmDeliveryQuantityException(int minimumOrderSize,int maximumOrderSize, int quanOfEgg) {
		message="Order out of delivery range. Delivery range is "+ minimumOrderSize+"to "+maximumOrderSize+". Your order was "+quanOfEgg;
	}
	
	public FarmDeliveryQuantityException(int minimumOrderSize,int maximumOrderSize){
		message="Minimum order size("+minimumOrderSize+") is bigger than maximum Order Size("+maximumOrderSize+").";
	}
	
	@Override
	public String toString() {
		return message;
	}
}
