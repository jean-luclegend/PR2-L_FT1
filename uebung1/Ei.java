package uebung1;

import java.util.Calendar;
import java.util.Random;

public class Egg {
	
	private Egggroesse groesse = null;	
	private String legedatum = null;
	private int gewicht = 0;
	private boolean mangel = false;
	
	public Egg() {
		legeEgg(5);		
	}
	
	public Egg(int ausschussrate) {		
		legeEgg(ausschussrate);		
	}
	
	public Egg (Egg Egg) {
		this.gewicht = Egg.getGewicht();
		this.groesse = Egg.getGroesse();
		this.legedatum = Egg.getLegedatum();
		this.mangel = Egg.getMangel();
	}
	
	
	private void legeEgg(int ausschussrate) {
		int minGewicht = 40;
		int maxGewicht = 80;		
		Random rand = new Random();
		gewicht = rand.nextInt(maxGewicht-minGewicht)+minGewicht;		
		if (gewicht < 53) {
			groesse = Egggroesse.S;
		}
		else if (gewicht < 63) {
			groesse = Egggroesse.M;
		}
		else if (gewicht < 74) {
			groesse = Egggroesse.L;
		}
		else {
			groesse = Egggroesse.XL;
		}
		
		//prozentuale WahrschEggnlichkEggt auf Eggnen Mangel
		if (rand.nextInt(100) < ausschussrate) {
			mangel = true;
		}			
			
		this.legedatum = Calendar.getInstance().getTime().toString();
	}
	
	
	public Egggroesse getGroesse() {
		return groesse;
	}
	
	public String getLegedatum() {
		return legedatum;
	}
	
	public int getGewicht() {
		return gewicht;
	}
	
	public boolean getMangel() {
		return mangel;
	}

	
	public void setGroesse(Egggroesse groesse) {
		if (this.groesse == null) {
			this.groesse = groesse;
		}		
	}
	
	public void setLegedatum(String legedatum) {
		if (this.legedatum == null) {
			this.legedatum = legedatum;
		}		
	}
	
	public void setGewicht(int gewicht) {
		if (this.gewicht <= 0) {
			this.gewicht = gewicht;
		}		
	}
	
	public void setMangel(boolean mangel) {		
		if (!this.mangel) {
			this.mangel = mangel;
		}								
	}
}
