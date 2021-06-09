package Calcul_PGCD;

import java.util.Scanner;

public class PGCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Exercice final : Calcul du PGCD de 2 entiers positifs (Codage uniquement) 
		En arithmétique élémentaire, le plus grand commun diviseur ou PGCD de deux nombres entiers non nuls est le plus 
		grand entier qui les divise simultanément. 
		Par exemple, le PGCD de 20 et de 30 est 10, puisque leurs diviseurs communs sont 1, 2, 5 et 10.
		On souhaite écrire un programme de calcul du PGCD de deux entiers non nuls strictement positifs, à partir de 
		l’algorithme de la méthode dite « égyptienne ».
		Voici une spécification de l'algorithme de calcul du PGCD de deux nombres (entiers strictement positifs) p et q, selon 
		cette méthode : 
		
		Lire (p, q )
		 TantQue p ≠ q 
		 Faire 
		 Si p > q Alors
		 p ← p – q 
		 Sinon 
		 q ← q – p 
		 FinSi 
		 Fin TantQue
		Ecrire( " PGCD = " , p ) 
		
		Version 1 :
		Réalisez le programme correspondant. L’algorithme ci-dessus doit être implémenté dans une fonction nommée 
		« Calcul_PGCD » qui accepte 2 nombres entiers en paramètres et retourne le PGCD calculé au format nombre entier.
		La signature de la méthode Calcul_PGCD est : Calcul_PGCD ( int a , int b ) : int.
		Conservez votre fonction Calcul_PGCD, elle vous sera utile pour les exercices suivants.
		Exemple d’affichage en mode Console :
		Programme de calcul du PGCD de 2 nombres entiers positifs
		Saisir le 1er nombre : 
		176
		Saisir le 2nd nombre : 
		892
		Le PGCD de 176 et 892 est égal à 4.
		Version 2 :
		En vous inspirant des exercices précédents, proposez une version améliorée et intuitive du programme.
		 */
		int p, q;
		
		String reponse;
		int nouvNumerateur,nouvDenominateur;
		Scanner sc= new Scanner(System.in);
		System.out.println("Veuillez entrer 2 nombres séparés par un espace !!");
		
		reponse=sc.nextLine();
		String [] tabNumDenom=reponse.split(" ");
		p=Integer.parseInt(tabNumDenom[0]);
		q=Integer.parseInt(tabNumDenom[1]);
		System.out.println("La fraction non simplifiée est : " +p+"/"+q+"\n\n" );
		
		int pgcd= PGCD.recherchePGCD(p, q);
		nouvNumerateur=p/pgcd;
		nouvDenominateur=q/pgcd;
		System.out.println("le plus grand diviseur Commun (PGCD) est :"+ pgcd);
		System.out.println("La fraction la plus simplifiée : " +nouvNumerateur+"/"+nouvDenominateur+"\n\n" );
		
	sc.close();
		
	}
	
	/* TantQue p ≠ q 
	 Faire 
	 Si p > q Alors
	 p ← p – q 
	 Sinon 
	 q ← q – p 
	 FinSi 
	 Fin TantQue
	Ecrire( " PGCD = " , p )*/ 
	public static int recherchePGCD(int _p, int _q ) 
	{
		while (_p!=_q)
			{
			if (_p>_q) {
				
				_p=_p-_q;
			}
			else {
				_q=_q-_p;
			}
			};
		return _p;
		
		
	}

	public static int recherchePGCD2(int _p, int _q ) 
	{
		
			do {
			if (_p>_q) {
				
				_p=_p-_q;
			}
			else {
				_q=_q-_p;
			}
			} while (_p!=_q);
		return _p;
		
		
	}
	
}
