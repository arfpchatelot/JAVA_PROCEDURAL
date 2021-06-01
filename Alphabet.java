package alphabet_phrase;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char [] alphabet =new char [26];
		 String phrase="Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu’il avait par ailleurs, grouillaient désespérément sous ses yeux.";
		 
		  int [] tabfrequence= new int[26];
		  
		  Scanner sc= new Scanner(System.in); 
			/*
			 * do {
			 * 
			 * System.out.
			 * println("Veuillez saisir une phrase d'au moins 120 caractères ponctuation non comprise?"
			 * ); phrase=sc.nextLine();
			 * 
			 * } while (phrase.length()<120);
			 */
		  char lettre='a';
		  for (int i = 0; i < alphabet.length; i++) 
		  {
			alphabet[i]=lettre;
			lettre++;
		  }
		  
		  for (char element : alphabet) {
			  
			System.out.print(element + " " );
		}
		

	}

}
