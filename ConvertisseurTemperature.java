import java.math.RoundingMode;
import java.text.*;
import java.util.*;

public class ConvertisseurTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CONVERTISSEUR DEGRÉ CELCIUS ET DEGRÉ FAHRENHEIT");
		System.out.println("----------------------------------------------------------");
		Scanner sc =new Scanner(System.in);
		char mode =' ';
		String test="";
		String rep;

		do {



			do {


				System.out.println("Choisissez le mode de conversion ! ");

				System.out.println(" 1 - Convertisseur Celcius --> Fahrenheit ");
				System.out.println(" 2 - Convertisseur Fahrenheit --> Celcius ");

				test= sc.nextLine();

				mode=test.charAt(0);

				System.out.println(test.length());

				if (mode!='1' &&  mode!='2' ||  test.length()>1)
				{ 

					System.out.println(" Mode inconnu !!! veuillez reitérer l'operation");

				}

			} while ((mode!='1'  &&  mode!='2') ||  test.length()>1); 

			DecimalFormat modele= new DecimalFormat("0.00");
			modele.setRoundingMode(RoundingMode.HALF_UP);
			if (mode=='1') {

				System.out.println("veuillez entrer la temperature en celcius à convertir?");
				double a=sc.nextDouble();
				double s=(a*9)/5 +32;
						s= ConvertisseurTemperature.NbArrondi2(s, 3);
				//String  result=modele.format(s);
				System.out.println("Temperature equivalente en fahrenheit : "+s );



			}
			else 
			{
				System.out.println("veuillez entrer la temperature en Fahrenheit à convertir?");
				double f=sc.nextDouble();
				double c= (f-32 )*5/9;
				//String result2 =modele.format(c);
				c=NbArrondi2(c,3);
			
				System.out.println("Temperature equivalente en Celcius : "+c );


			}
			sc.nextLine();
			System.out.println("Voulez-vous convertir une autre température ? O /N ");

			rep=sc.nextLine().toLowerCase();

		} while ( rep.charAt(0)=='o' && rep.length()<2 );

		System.out.println("programme terminé!");
sc.close();

	}
	
	
	  public static double NbArrondi( double _nombre) {
		  double nbArrondi=Math.round(_nombre*100.0)/100.0; 
		  return nbArrondi;
	  
	  }
	 
	public static double NbArrondi2 ( double _nombre, int _chiffreVirgule)
	{// 79.79
		double temp= _nombre*Math.pow(10,_chiffreVirgule);
		double nbArrondi= Math.round(temp)/Math.pow(10, _chiffreVirgule);
		return nbArrondi;
		
	}	



}
