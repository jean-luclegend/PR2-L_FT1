import java.util.*;
import java.time.LocalDate;

/***
 * 
 * @author alexrogausch,jean-lucbusch @
 *
 */
public class Egg {
	private int weight;
	private Size eggsize;
	private LocalDate prodDate, expiDate;
	private boolean defect = false;
	private int defectProb = 5;
	Random rand = new Random();

	public Egg() { // standard constructor
		weight = rand.nextInt(40) + 40; //Generation of random weight(between 40 and 80) 
										//and classification into defined sizes
		if (weight < 53) {
			eggsize = Size.S;
		}
		if (weight > 53 && weight <= 62) {
			eggsize = Size.M;
		}
		if (weight > 62 && weight <= 73) {
			eggsize = Size.L;
		}
		if (weight > 73) {
			eggsize = Size.XL;
		}

		if (rand.nextInt(100) < defectProb) {	// random value to determine whether the egg has a defect or not
			defect = true;
		}
		prodDate = LocalDate.now();	// date of production based on local time of computer
		expiDate = prodDate.plusMonths(6);	// optional addition of an expiration date 
	}

	public Egg(int defectProb) { // overloaded constructor with given defect probability
		this.defectProb = defectProb;
		weight = rand.nextInt(40) + 40;
		if (weight < 53) {
			eggsize = Size.S;
		}
		if (weight > 53 && weight <= 62) {
			eggsize = Size.M;
		}
		if (weight > 62 && weight <= 73) {
			eggsize = Size.L;
		}
		if (weight > 73) {
			eggsize = Size.XL;
		}

		if (rand.nextInt(100) < defectProb) {
			defect = true;
		}
		prodDate = LocalDate.now();
		expiDate = prodDate.plusMonths(6);
	}

	public Egg(Egg normalEgg) {	// overloaded constructor with the parameter egg of the type egg 
								// used later for the creation of easter eggs 
		this.weight = normalEgg.getWeight();
		this.eggsize = normalEgg.getEggsize();
		this.prodDate = normalEgg.getProdDate();
		this.expiDate = normalEgg.getExpiDate();
		this.defect = normalEgg.getDefect();
	}

	// the following methods are setter and getter methods of the attributes Weight, eggsize, production date,
	// expiration date and defect
	public int getWeight() { 
		return weight;
	}

	public Size getEggsize() {
		return eggsize;
	}

	public LocalDate getProdDate() {
		return prodDate;
	}

	public LocalDate getExpiDate() {
		return expiDate;
	}

	public boolean getDefect() {
		return defect;
	}

	public void setDefect(boolean defect) {
		if (defect == true) {
			this.defect = defect; 	// can only become false if it wasn't false before 
									//(later needed for cracked egg exception)
		}
	}
}
