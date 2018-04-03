import java.util.*;
import java.time.LocalDate;

public class Egg  {
	private int weight;
	private Size eggsize ;
	private LocalDate prodDate,expiDate;
	private boolean defect=true;
	
	Random rand = new Random();
	
	
	public Egg() {
		 weight = rand.nextInt(40)+40;
		 if(weight<53){
			eggsize=Size.S; 
		 }
		 if(weight>53 && weight<=62) {
			 eggsize=Size.M;
		 }
		 if(weight>62 && weight<=73) {
			 eggsize=Size.L;
		 }
		 if(weight>73) {
			 eggsize=Size.XL;
		 }
		 int defectProb= rand.nextInt(100);
		 if(rand.nextInt(100)< defectProb) {
			 defect = false;
		 }
		prodDate=LocalDate.now();
		expiDate=prodDate.plusMonths(6);
	}
	
	public Egg(int defectProb) {
		 weight = rand.nextInt(40)+40;
		 if(weight<53){
			eggsize=Size.S; 
		 }
		 if(weight>53 && weight<=62) {
			 eggsize=Size.M;
		 }
		 if(weight>62 && weight<=73) {
			 eggsize=Size.L;
		 }
		 if(weight>73) {
			 eggsize=Size.XL;
		 }
		 
		 if(rand.nextInt(100)< defectProb) {
			 defect = false;
		 }
		prodDate=LocalDate.now();
		expiDate=prodDate.plusMonths(6);
	}
	
	public int getWeight(){
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
		if(defect==false) {
			this.defect=defect;
		}
	}
}
