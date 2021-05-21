package convertisseur_km_miles;

import java.util.Scanner;

public class ConvertisseurKmMi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Convertisseur Kilomètre <-> Miles");
		System.out.println("----------------------------------");
		String saisie=" ";
		double distance;
		String [] montab;
		Scanner sc= new Scanner(System.in );
		System.out.print("Veuillez saisir une  distance à convertir avec un espace et l'unité km pour kilomètre ou mi pour miles :");
		saisie=sc.nextLine();
		
		montab= saisie.split(" ");
		distance=Double.parseDouble(montab[0]);
		String unite;
		if(montab.length<2)
		{
		  unite="";
		  
		}else
		{
			unite=montab[1];
		}
		for( String  el : montab)
		{
			
			System.out.print(el+" ");
			
		}
		/*
		 * for (int i = 0; i < montab.length; i++) {
		 * 
		 * System.out.print(montab[i]+ " ");
		 * 
		 * }
		 */
		if (unite.equals("km") || unite=="" ) {
			
			double res= distance/1.609344 ;
			System.out.println("Cela donne en miles : "+res);
			
		}else {
			
			double res2= distance*1.609344 ;
			
			System.out.println("Cela donne en km : "+res2);
			
			
		}
		
		
		
		
		
		
		
	}

}
