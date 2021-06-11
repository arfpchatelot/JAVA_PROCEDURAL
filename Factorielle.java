package exo_factorielle;

import java.util.Scanner;

public class Factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soit un nombre n n(n-1)(n-2)( n-(n-2)) 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choisir un nombre pour fonction factorielle: ");
		long test=sc.nextInt();
    long result= factoriel(test);
    System.out.println("factorielle test :"+result);
		
		

	}

	public static long factoriel(long _nb) 
	{
		if (_nb>1) {
			return _nb *factoriel(_nb-1);
		}else
		{
			return 1;
		}
	}
}
