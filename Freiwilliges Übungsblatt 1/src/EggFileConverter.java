import java.io.*;
import java.util.regex.Pattern;

public class EggFileConverter {

	private String eggText = "";
	final private  char SPRTR = '|';
	int lines =0;

	public void eggToFileConverter(Egg[][] eggsToFile, String fileName) {
		if (eggsToFile != null) {
			//File eggTextFile = new File(fileName);
			for (int i = 0; i < eggsToFile.length; i++) {

				for (int j = 0; j < eggsToFile[i].length; j++) {
					eggText = eggText + i + SPRTR + j + SPRTR + eggsToFile[i][j].getWeight() + SPRTR
							+ eggsToFile[i][j].getEggsize() + SPRTR + eggsToFile[i][j].getProdDate() + SPRTR
							+ eggsToFile[i][j].getExpiDate() + SPRTR + eggsToFile[i][j].getDefect()
							+ String.format("%n");
				}
			}

			FileWriter eggTextFileWriter = null;
			try {
				eggTextFileWriter = new FileWriter(fileName);
				eggTextFileWriter.write(eggText);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (eggTextFileWriter != null) {
					try {
						eggTextFileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public Egg[][] fileToEgg(String fileName) {//void or Egg[][]?
		BufferedReader eggTextFileReader= new BufferedReader(new FileReader (fileName));// try/catch?
		String[]eggData;
		try {
			while(eggTextFileReader.readLine()!=null) {
				
				lines ++;
				
			
				eggText=eggTextFileReader.toString();
			for (int i =0; i<eggText.length();i++) {
				while(eggText.charAt(i)!=SPRTR) {
					
					
				}
			}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getEggText() {
		return eggText;
	}

}
