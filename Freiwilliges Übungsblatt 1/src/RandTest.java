import java.time.LocalDate;
import java.util.*;
public class RandTest {
	
	


	public static void main(String[] args) {
		
		EasterEgg easteregg= new EasterEgg();
		try{
			easteregg.cook();
		}catch(EggCrackException e){
			System.out.println("Ei wird weggeworfen");
		}
	}

}
