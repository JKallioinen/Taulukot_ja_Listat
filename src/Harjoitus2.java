import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Harjoitus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		int[] heitetytNoppaluvut = new int[5];
		int pointsTotal = 0;
		int points;
		
		//Tulostetaan 5 lukua väliltä 1-6
		for (int i = 0; i < 5; i++)
		{
			System.out.println(points = r.nextInt(6)+1);
			pointsTotal += points;
			heitetytNoppaluvut[i] = points;
		};
		
		//Lasketaan pisteet yhteen
		System.out.println("You got " + pointsTotal + " points");
		
		//Järjestetään numerot, jotta suurin löytyy helpommin. Ja tulostetaan suurin numero
		Arrays.sort(heitetytNoppaluvut);
		
		int largestNumber = heitetytNoppaluvut[heitetytNoppaluvut.length - 1];
		System.out.println("Largest number is " + largestNumber);
	}

}
