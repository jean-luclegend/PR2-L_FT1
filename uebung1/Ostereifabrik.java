package uebung1;

public class Ostereifabrik {
	
	private Osterei[][] eierkartonstapel;
	
	
	public void wareneingang (Ei[][] eierkartonstapel) {
		//Ostereierkartonstapel ist genauso hoch wie die Eingangslieferung
		this.eierkartonstapel = new Osterei[eierkartonstapel.length][];		
		for (int i=0; i<eierkartonstapel.length; i++) {
			//Anzahl der Plätze pro Palette ist ebenfalls identisch der Eingangslieferung
			this.eierkartonstapel[i] = new Osterei[eierkartonstapel[i].length];
			
			for (int j=0; j<eierkartonstapel[i].length; j++) {				
				//aus Eiern werden Ostereier, das Palettengebinde gleibt identisch
				this.eierkartonstapel[i][j] = new Osterei(eierkartonstapel[i][j]);
			}
		}				
	}
	
	
	public void kocheEier(int palette) throws EggCrackException {		
		if (palette < eierkartonstapel.length) {			
			//Palette existiert
			for (int i=0; i<eierkartonstapel[palette].length; i++) {			
				try {
					eierkartonstapel[palette][i].kochen();
				}
				catch (EggCrackException e) {
					//Ei ging beim Kochen kaputt
					vernichtePalette(palette);
					throw e;
				}							
			}			
		} 
	}
	
	
	public void faerbeEier(int palette, Ostereifarbe farbe) throws EggNotBoiledException, EggColoredException {		
		if (palette < eierkartonstapel.length) {			
			//Palette existiert
			for (int i=0; i<eierkartonstapel[palette].length; i++) {
				if (!eierkartonstapel[palette][i].getGekocht()) {
					//rohes Ei
					vernichtePalette(palette);
					throw new EggNotBoiledException();
				}
				eierkartonstapel[palette][i].faerben(farbe);
				if (eierkartonstapel[palette][i].getFarbe() == Ostereifarbe.UGLY) {
					//Ei waren schon gefärbt
					vernichtePalette(palette);
					throw new EggColoredException(Ostereifarbe.UGLY, farbe);
				}				
			}			
		}		
	}
	
	
	public void printGestapelteEierkartons () {						
		for (int i=0; i<getAnzahlEierkartons(); i++) {
			for (int j=0; j<eierkartonstapel[i].length; j++) {				
				if (eierkartonstapel[i][j].getFarbe() == null) {
					//ungefärbtes Ei
					System.out.print("egg  | ");
				}
				else {
					System.out.print(eierkartonstapel[i][j].getFarbe().getRealName() + " | ");
				}
			}
			System.out.println();
		}			
		
	}
	
	private void vernichtePalette(int palette) {		
		if (palette < eierkartonstapel.length) {
			if (eierkartonstapel.length > 1) {
				//neuer Stapel wird um eine Palette kleiner
				Osterei[][] neuerStapel = new Osterei[eierkartonstapel.length-1][];				
				
				int j = 0;
				for (int i=0; i<eierkartonstapel.length; i++) {
					if (i != palette) {
						//alle Paletten außer der zu vernichtenden zuweisen
						neuerStapel[j++] = eierkartonstapel[i];
					}
				}
				eierkartonstapel = neuerStapel;
			}
			else {
				//Stapel bestelt aus nur einer Palette -> gibt keinen Stapel mehr
				eierkartonstapel = null;
			}			
		}		
	}
		
	
	public int getAnzahlEierkartons() {
		if (eierkartonstapel != null) {
			return eierkartonstapel.length;
		}
		else {
			return 0;
		}
	}
	
}
