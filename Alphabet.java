package alphabet_phrase;

import java.util.Iterator;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char [] alphabet =new char [26];
		// String phrase="Ses nombreuses pattes, lamentablement gr�les par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient d�sesp�r�ment sous ses yeux.?!";
		 String phrase="";
		  int [] tabfrequence= new int[26];
		  
		  Scanner sc= new Scanner(System.in); 
			
			  do {
			  
			  System.out.
			  println("Veuillez saisir une phrase d'au moins 120 caract�res ponctuation non comprise?"
			  ); phrase=sc.nextLine();
			  
			  } while (phrase.length()<120);
			 
		  char lettre='a';
		  for (int i = 0; i < alphabet.length; i++) 
		  {
			alphabet[i]=lettre;
			lettre++;
		  }
		  
			/*
			 * for (char element : alphabet) {
			 * 
			 * System.out.print(element + " " ); }
			 */
		  
		 phrase=phrase.toLowerCase();
		 phrase= phrase.replace('�', 'a');
		 phrase= phrase.replace('�', 'e');
		 phrase= phrase.replace('�', 'e');
		 phrase= phrase.replace('�', 'e');
		 phrase= phrase.replace('�', 'u');
		 phrase= phrase.replace('�', 'a');
		 phrase= phrase.replace('�', 'i');
		 phrase= phrase.replace('�', 'a');
		 phrase= phrase.replace('�', 'e');
		 phrase= phrase.replace('�', 'o');
	
		 
		
		// phrase=phrase.replace(" ",String.valueOf(null));
		
	       
	       phrase=phrase.replaceAll("\\p{Punct}", "");
	       phrase=phrase.replaceAll("\'", " " );
	       phrase=phrase.replaceAll(" ","");		 
		 
		 
		 System.out.println("verif phrase :"+phrase );
		for (int i = 0; i < alphabet.length; i++) {
			
			for (int j = 0; j < phrase.length(); j++) 
			{
				if (alphabet[i]==phrase.charAt(j)) 
				{
					
					tabfrequence[i]++;
					
				}
			}
			
			
		}
		 System.out.print("-------------------------------------\n");
		 for (int i = 0; i < tabfrequence.length; i++) 
		 {
			 if (tabfrequence[i]>0) {
				 
				 System.out.println("la lettre "+alphabet[i] +" est pr�sente "+ tabfrequence[i]+" fois!" );
				
			}
		 } 
			 
		 
		 System.out.print("\n-------------------------------------");
		 sc.close();
	}

}
