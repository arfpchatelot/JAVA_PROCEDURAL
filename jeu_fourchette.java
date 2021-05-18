package fourchette;

import java.util.*;

public class jeu_fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min, max, nbUser, nbMachine;
		boolean continuer=false;
		int compteur=0;
		int essai;
		Scanner sc =new Scanner(System.in);
		Random  aleas= new Random();
		String jouer="O";
		do {
			
		nbMachine = aleas.nextInt(101);
		
		min =0;
		max=100;
		essai= 10;
		compteur=0;
		continuer=false;
		
		do {
			System.out.println("Choisissez un nombre entre "+ min+ " et " +max );
			System.out.println("vous avez 10 essais maximums!" );
			nbUser=sc.nextInt();
			if (nbUser > nbMachine) {
				
				max=nbUser;
				compteur++;
				essai= 10-compteur; 
				System.out.println("Il vous reste : "+essai+" essais" );
				/*continuer=false*/
				
			}
			else if(nbUser<nbMachine) 
			{
				min=nbUser;
				compteur++;
				essai= 10-compteur; 
				System.out.println("Il vous reste : "+essai+" essais" );
			}
			else {
				
				compteur++;
				continuer=true;
				
			}
				
				
			
			
		} while (continuer==false && compteur<10);
		
		if (continuer) {
			
			System.out.println("Victoire bravo! vous avez réussi en :"+compteur +" coups");
			
			
			
		}
		else {
			System.out.println("Perdu! Essai encore !" );
			System.out.println("Le nombre recherché est : "+nbMachine);
			
		}
		
		sc.nextLine();
		System.out.println("Voulez-vous rejouer une partie ? O/N");
		jouer=sc.nextLine().toUpperCase();
		} while (jouer.charAt(0)=='O' && jouer.length()<2);
		sc.close();
		System.out.println("Programme terminé");

	}

}
