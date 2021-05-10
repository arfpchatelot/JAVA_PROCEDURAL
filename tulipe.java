package projets;

import java.util.Scanner;

public class tulipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		boolean continuer = true;
		String rep="test";
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		
		

		System.out.println("Veuillez entrer une année formt aaaa!");

		a = sc.nextInt();

	
		if (a % 4 == 0) {
			

			if (a % 100 == 0) {


			
				
				if (a% 400 == 0) {

					System.out.println("Année Bissextile !");

					

				}
				else 
				{
					System.out.println("Année non bissextile !");

					
				}
				


			} else 
			
			{

				System.out.println("Année Bissextile !");

				
			}

		} else {
			System.out.println("année non bissextile !");

			
		}
		
	//	Scanner sc2 = new Scanner(System.in);
		  sc.nextLine();
		 System.out.println("Voulez-vous rentrer une autre année ?");
		 			
		 	rep=sc.nextLine();
			
		
			 if (!rep.equalsIgnoreCase("oui")) {
				
				 continuer=false;
				
			}
			 
			 
			// System.out.println(rep); 
			
	
			
		} while(continuer);
		
		
		 
		 
		System.out.println("programme terminé");
		
	/*	String reponse;
		
		System.out.println("Est-ce qu'il fera beau demain?");
		reponse=sc.nextLine().toLowerCase();
		
		System.out.println(reponse);
		
		
		if (reponse.equals("oui")) {
			System.out.println(" J'arrache les mauvaises herbes! ");
			System.out.println(" Je plante des tulipes ");
			
			
		} 
		else 
		{
			
			System.out.println(" Je reste sur mon canapé à la maison ! ");

		}*/
	
		
	}

}
