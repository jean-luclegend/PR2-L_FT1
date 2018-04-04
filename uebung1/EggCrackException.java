package uebung1;

public class EggCrackException extends Exception {	
	@Override
	public String toString() {
		return ("Das Ei hatte einen Defekt und ist gebrochen.");
	}
}
