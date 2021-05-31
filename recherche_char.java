package recherche_lettre;

import java.util.*;

public class recherche_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String maphrase="";
		char malettre;
		boolean passe=false;
		int nbOccurences=0;
		int [] tabPosition = new int[120];   
		boolean trouve=false;
		
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("Veuillez entrer une phrase terminée par un point !");
			maphrase=sc.nextLine();
			int depart=maphrase.length()-1;
			String souschaine= maphrase.substring(depart,maphrase.length());
			if(souschaine.equals("."))
			{
				passe=true;
			}
		
			
		} while (passe==false);
		
		// sc.nextLine();
		if (maphrase.length()==1) {
			
			System.out.println("La phrase est  vide !!!");
			
		}
		else {
			
			System.out.println("Veuillez entrer une lettre à rechercher dans la phrase !!");  
			malettre= sc.nextLine().charAt(0);
			for (int i = 0; i <=maphrase.length()-1; i++) {
				
				
				if (malettre==maphrase.charAt(i)) {
					
					trouve =true;
					
					tabPosition[ nbOccurences]=(i+1);	
					nbOccurences++;
					
				}
			}
			
			if (trouve==false) {
				System.out.println("La lettre n'est pas présente dans la phrase !!!");
				
			} else
			{
					System.out.println("La lettre est présente " +nbOccurences +" fois dans la phrase aux (à la) position(s) suivante(s):" );
					for( int element: tabPosition )
					{
						if (element!=0) {
							System.out.print(element+ " ");
						}
						
					}
					
				
				
			}
			
		sc.close();	
		}
		
		

	}

}
