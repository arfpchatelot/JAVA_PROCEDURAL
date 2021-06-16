package jeu_du_pendu;

import java.util.Scanner;

public class Pendu {

	public static void main(String[] args) {
		   String Mot;
	         Scanner sc= new Scanner(System.in);
	         
	         do
	         {
	             System.out.println("Joueur 1, veuillez saisir un mot fran�ais de 5 lettres minimum"); 
	              Mot = sc.nextLine();
	         } while ( Mot.length()<5 );
	         // char[] MotRecherche = new char[Mot.Length]; declaration tableau classique;
	         
	         char[] MotRecherche = Mot.toCharArray();
	        
	         System.out.println("Joueur 2 voici le mot � rechercher :");
	         MasqueLettre( MotRecherche);
	         int Essai = 0;
	         boolean gagne = false;
	        
	         do
	         {
	            
	            System.out.println("Veuillez choisir une lettre masqu�e qui compose le mot ou pas!!!");
	             char lettre =sc.nextLine().charAt(0);
	             
	             if (Jouer(MotRecherche,lettre,Mot) == false)
	             {
	                 Essai++;
	                 if((6-Essai)>=0) { 
	                System.out.println("Rat�!!Il ne vous reste que :"+ (6 - Essai)+ " coups � jouer");
	                 }
	             }
	             else
	             {
	                 gagne = true;
	                AfficherTableau( MotRecherche);
	                 for (int i = 0; i < MotRecherche.length; i++)
	                 {
	                     if (MotRecherche[i] == '-')
	                     {
	                         gagne = false;
	                     }
	                 }
	                 

	             }

	         } while (Essai<6 && gagne==false);
	         if (gagne == true)
	         {
	            System.out.println("Bravo vous avez gagn� !! le mot est  bien :"+Mot+" avec un nombre d'erreur de :"+Essai);
	            // Jeu_tableau.AfficherTableau(MotRecherche);
	         }
	         else
	         {
	             System.out.println(" Vous avez d�passer les 6 ESSAIS, vous �tes \"pendu\" :");
	             System.out.println("Le mot cach� �tait: " + Mot);
	         }

		
		
		// TODO Auto-generated method stub

	}
	
	public static void MasqueLettre( char[] _tableau)
    {
       for (int i = 1; i < _tableau.length-1; i++)
       {
           _tableau[i] = '-';
       }
       AfficherTableau(_tableau);
           
   } 
	
	public static void AfficherTableau(char[] _tableauAffiche)
    {
        System.out.print("[ ");
        for (char element : _tableauAffiche)
        {
            System.out.print(element + " ");
        }
        System.out.print(" ] \n");
    }
	public static boolean Jouer(char[] _tableauRecherhe, char _lettre,String _Mot)
    {
        boolean Win = false;
        for (int i = 1; i < _tableauRecherhe.length-1; i++)
        {
            if (_Mot.charAt(i)==_lettre)
            {
                _tableauRecherhe[i] =_lettre;
                Win = true;
            }

        }
        return Win;
    }
	
	
}
