package tableau2dim_formation;

import java.util.Scanner;

public class formation {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le nombre de formations de l'établissement!");
		int formations = sc.nextInt();

		sc.nextLine();
		String[][] mesFormations = new String[formations][2];

		formation.saisieFormation(mesFormations, formations);
		formation.afficherFormation(mesFormations);

		sc.close();

	}
	
	 public static void saisieFormation(String [][] _tabf, int _nbFormation) 
	 {
		 Scanner sc2= new Scanner(System.in);
		//String [][]_tabf1= new String [_nbFormation][2];
		for (int i = 0; i < _nbFormation; i++)
		{
			System.out.println("Entrer le nom de la "+(i+1) + " formation");
			_tabf[i][0]=sc2.nextLine();
			System .out.println("Veuillez entrer l'éffectif prévu de la "+(i+1)+" formation !!");
			_tabf[i][1]=sc2.nextLine();
		}
		 
		sc2.close();
	 }
		 
	 public static void afficherFormation(String [][] _tabf)
	 {int i=0;
		 for (String[] sousTab : _tabf) {
			 
			 for (String element :  sousTab) {
				
				if (i%2==0) {
					
					System.out.print("Formation: "+element);
				} 
				else
				{
					System.out.print(" l'effectif de la formation est: "+element+" \n");
				}	
				
				i++;
				
				
			}
			 
			
		}
		 
	 }
	 

}
