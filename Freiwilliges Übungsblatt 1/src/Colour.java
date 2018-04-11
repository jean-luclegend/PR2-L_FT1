
public enum Colour {

	blue, yellow, green, red, ugly,white;

	public static Colour chooseColour(int x) {
		switch (x) {
		case 0:
			return blue;
		case 1:
			return yellow;
		case 2:
			return green;
		case 3:
			return red;
		default:
			return null;
		}
	}
	
	
	public String getRealName() {
		switch (this) {
		case red:
			return "red ";
		case yellow:
			return "yellow";
		case green:
			return "green";
		case blue:
			return "blue";
		case ugly:
			return "ugly";
		case white:
			return "white";
		default:
			return "";
		}
	}
}