import java.util.Arrays;
import java.util.Scanner;

public class Harjoitus1 {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	
    	String[] huonekalut = {
            "tuoli", "sohva", "pöytä", "kaappi"
        };

        Arrays.sort(huonekalut);
        
        //Tulostetaan koko lista
//        for (String huonekalu : huonekalut) {
//            System.out.println(huonekalu);
//        }
        
        //toinen tapa tulostaa lista
//        for (int i = 0; i < huonekalut.length; i++) {
//            System.out.println(huonekalut[i]);
//        }
        
        //vain 2 ensimmäistä esinettä tulostetaan
//        for (int i = 0; i < 2; i++) {
//            System.out.println(huonekalut[i]);
//        }
        
        //UUSI VAIHE
        boolean found = false;
        String toiveEsine;
        
        //Kysytään esinettä
        System.out.println("Mitä esinettä etsit? (Kirjoita haku pienillä kirjaimilla)");
        toiveEsine = in.nextLine();
        
        //Käydään lista läpi
        for (String huonekalu : huonekalut)
        	{
        		if (huonekalu.equals(toiveEsine))
        		{
        			found = true;
        			break;
        		}
        	}
        //Jos esine löytyy, todetaan se käyttäjälle
        if (found)
        	{
        		System.out.println(toiveEsine + " löytyy listalta.");
        	}
        else 
        {
        	System.out.println(toiveEsine + " ei löydy listalta.");
        }
    }
}

