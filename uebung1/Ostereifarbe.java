package uebung1;

public enum Ostereifarbe { 
	ROT, GELB, GRUEN, BLAU, UGLY;

public String getRealName() {
	switch (this) {
		case ROT: return "rot ";
		case GELB: return "gelb";
		case GRUEN: return "grün";
		case BLAU: return "blau";
		case UGLY: return "UGLY";
		default: return "";
	}
}

}
