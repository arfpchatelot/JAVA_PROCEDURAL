package nbrpremier;

import java.util.*;

public class premier {

	public static void main(String[] args) {
		
		
	// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		String recommencer="";
		long nbtest;
	
		boolean premier;
		do {
			premier= true;
			long diviseur=2;
			
			System.out.println("Veuillez saisir un nombre entier");
			nbtest=sc.nextLong();
			while(diviseur<=Math.sqrt(nbtest) && premier==true) 
			{ 
				if (nbtest%diviseur==0) {
					
					premier=false;
					
					
				}
				
				
				
				diviseur++;
				
			}
			
			if (!premier) {
        System.out.println("Le nombre "+nbtest+" n'est pas premier car il a au moins un diviseur :"+ (diviseur-1));
				
			}
			else {
				System.out.println("Le nombre "+nbtest+" est premier" );
			}
			sc.nextLine();
			
			System.out.println(" Voulez-vous recommencer? O/N");
			  
			recommencer=sc.nextLine();
			
			
		} while (recommencer.charAt(0)=='O' && recommencer.length()<2 );
		
		
		
	}

}
