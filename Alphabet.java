package alphabet_phrase;

import java.util.Iterator;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char [] alphabet =new char [26];
		// String phrase="Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient désespérément sous ses yeux.?!";
		 String phrase="";
		  int [] tabfrequence= new int[26];
		  
		  Scanner sc= new Scanner(System.in); 
			
			  do {
			  
			  System.out.
			  println("Veuillez saisir une phrase d'au moins 120 caractères ponctuation non comprise?"
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
		 phrase= phrase.replace('à', 'a');
		 phrase= phrase.replace('é', 'e');
		 phrase= phrase.replace('ê', 'e');
		 phrase= phrase.replace('è', 'e');
		 phrase= phrase.replace('ù', 'u');
		 phrase= phrase.replace('ç', 'a');
		 phrase= phrase.replace('î', 'i');
		 phrase= phrase.replace('â', 'a');
		 phrase= phrase.replace('ë', 'e');
		 phrase= phrase.replace('ô', 'o');
	
		 
		
		// phrase=phrase.replace(" ",String.valueOf(null));
		
	       
	       phrase=phrase.replaceAll("\\p{Punct}", "");
	       phrase=phrase.replaceAll("\'", " " );
	       phrase=phrase.replaceAll(" ","");		 
		 //algorithme de recherche de fréquence des lettres
		 
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
		 String [][] alphaFrequence =new String[26][2];
		 for (int i = 0; i <alphabet.length; i++) 
		 {
			 alphaFrequence[i][0]= ""+alphabet[i] ;
			 
		 }	 
		
		 for (int i = 0; i <alphabet.length; i++) 
		 {
			 alphaFrequence[i][1]=  Integer.toString(tabfrequence[i])  ;
			 //alphaFrequence[i][1]=  ""+ tabfrequence[i]  ;
		
		 }	 	 
		  Alphabet.tabTrier(alphaFrequence,26);
		
		
		  	for (int i = 0; i <26; i++) 
		  	{ int test= Integer.parseInt(alphaFrequence[i][1]);
		  	if (test!=0) {
			  
			  System.out.println("la lettre "+ alphaFrequence[i][0] +" est présente "+alphaFrequence[i][1]+" fois!" );
			  
			  } 
		  		}
			 
			
			/*
			 * for (int i = 0; i < tabfrequence.length; i++) { if (tabfrequence[i]>0) {
			 * 
			 * System.out.println("la lettre "+alphabet[i] +" est présente "+
			 * tabfrequence[i]+" fois!" );
			 * 
			 * } }
			 */
			 
			 
		 
		 System.out.print("\n-------------------------------------");
		 sc.close();
	}
	
	public static void tabTrier( String [][] _monTab, int _nbligne) 
	{
		boolean continuer;
		String templettre;
		String tempeffectif;
		int frequence1;
		int frequence2;
		do { continuer=false;
		for (int i = 0; i < _nbligne-1; i++) {
			
			frequence1=Integer.parseInt( _monTab[i][1]);
			frequence2=Integer.parseInt( _monTab[i+1][1]);
			if (frequence1>frequence2) {
				
				//intervertir les frequences
				templettre= _monTab[i][1];
				_monTab[i][1]=_monTab[i+1][1];
				_monTab[i+1][1]=templettre;
				
				
				//intervertir les lettres;
				tempeffectif= _monTab[i][0];
				_monTab[i][0]=_monTab[i+1][0];
				_monTab[i+1][0]=tempeffectif;
				continuer=true;
				
			}
			
		}
			
			
			
		} while (continuer==true);
		
		
	}
}
