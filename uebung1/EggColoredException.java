package uebung1;

public class EggColoredException extends Exception {
	private Ostereifarbe neueFarbe;
	private Ostereifarbe aktuelleFarbe;
	
	public EggColoredException(Ostereifarbe aktuelleFarbe, Ostereifarbe neueFarbe) {
		this.neueFarbe = neueFarbe;
		this.aktuelleFarbe = aktuelleFarbe;
	}
	
	@Override
	public String toString() {
		return "Vorhandene Eifarbe: " + aktuelleFarbe.getRealName() + ", neuer Färbversuch: " + neueFarbe.getRealName();
	}

}
