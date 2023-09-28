import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
		
public class Lottorivi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Random r = new Random();
				Scanner in = new Scanner(System.in);
				
				ArrayList<Integer> Lottonumerot = new ArrayList<Integer>(7);
				int numero;
				
//				Tulostetaan 7 lukua väliltä 1-35
				
					for (int i = 0; i < 7; i++)
					{
						numero = r.nextInt(35)+1;
						
				           if (Lottonumerot.contains(numero)) //if Lottonumerot has the suggested number, suggest another number
				           {
				        	   do {
				                   numero = r.nextInt(35)+1;
				               } while (Lottonumerot.contains(numero));

				               // Add the new number to the ArrayList
				               Lottonumerot.add(numero);  
				           }
				           else //if Lottonumerot doesn't have the number, add it
				           {
				        	   Lottonumerot.add(numero);
				           }
				                
				            
				    }
					//Sort the numbers to make the list easier to read
				Collections.sort(Lottonumerot);
				System.out.println(Lottonumerot);
				
				}

			}





