import java.util.Random;
import java.util.Scanner;

public class PierreFeuilleCiseaux {

	public static  int tryParse(String _unechaine  )
	{int res;
		try {
			
			res=  Integer.parseInt(_unechaine) ;
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			 //System.out.println("Une erreur s'est produite :"+e.getMessage() );
			res=4;
		}
		
		return res;
	}
	
	
	
	public static void main(String[] args) {
		
		int NbMachine;
		int NbUtilisateur;
		int Diff;
		int scoreUtilisateur;
		int scoreBot;
		boolean continuer=true;
		String rep;
		Scanner sc=new Scanner(System.in); 
		
		Random aleas= new Random();
		
		scoreBot=0;
		scoreUtilisateur=0;
		do {
		
			
			do {
				 
				System.out.println("Veuillez entrer un Nombre au choix entre 0-1-2, ou un nombre n�gatif pour arr�ter la partie!");
			
				NbUtilisateur=PierreFeuilleCiseaux.tryParse(sc.nextLine())  ;
			//	NbUtilisateur=sc.nextInt();
			} while ( NbUtilisateur>=3 );
			
			
		//	sc.nextLine();
			
			NbMachine=aleas.nextInt(3); 
			
			
			if (NbUtilisateur>0) {
				
				Diff=Math.abs(NbUtilisateur-NbMachine);
				
			switch (Diff) {
			case 2:
				if (NbUtilisateur> NbMachine) 
				{
					
					scoreUtilisateur++;
					System.out.println("bravo vous avez gagn� un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);
					
					
				}else {
					scoreBot++;
					System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;
					
					
				}
				
				
				
				break;
			case 1:
				if (NbUtilisateur< NbMachine) 
				{
					
					scoreUtilisateur++;
					System.out.println("bravo vous avez gagn� un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);
					
					
				}else {
					scoreBot++;
					System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;
					
					
				}
				
				
				
				
				break;
			case 0:
				System.out.println(" Match nul, personne ne marque de point : Score utilisateur "+ scoreUtilisateur +" score machine :"+ scoreBot);
				
				
				
				break;
			default:
				System.out.println(" valeur impr�vue"); 
				
				break;
			}
		}
			
			

			
			
			
			
			
		} while (scoreBot<10 && scoreUtilisateur<10 && NbUtilisateur>=0  );
		
		if (NbUtilisateur<0) {
			
			System.out.println(" Vous avez arr�t� le jeu! Le score de la machine est :" + scoreBot+" votre score est : " +scoreUtilisateur);
			
		}
		else if(scoreUtilisateur >=10)
		{
			System.out.println(" Bravo vous avez gagn�! vous atteint 10 points, le score de la machine est :" + scoreBot);
			
		}
		else {
			System.out.println(" Perdu ! Machine 10 points!  Essai encore!! Votre score �tait de :" + scoreUtilisateur);
		}
		
		
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
