package palindrome;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		String finChaine;
        String phrase;
        String palindrome;
        Scanner sc=new Scanner(System.in); 
        do
        {

           System.out.println("Veuillez saisir une  phrase  terminée par un point(.)...");
        phrase = sc.nextLine().toLowerCase();
        int depart=phrase.length()-1;
        finChaine = phrase.substring(depart,phrase.length());
     //   System.out.println("test :"+finChaine);

    } while (!finChaine.equals("."));
       // finChaine = phrase.substring((phrase.length()-1),phrase.length());
       if (phrase.length()==1 )
        {
         System.out.println("La  phrase est vide !");	
        
        }
		
        else
        {
        	
        	
       palindrome = phrase.substring(0,phrase.length()-1);
        palindrome=palindrome.replaceAll(" ","");
        
        boolean verifPalindrome=true;
        for (int i = 0; i < palindrome.length(); i++) {
        	
        	if (palindrome.charAt(i)!= palindrome.charAt( (palindrome.length()-1)-i)) {
				verifPalindrome=false;
				break;
			}
			
		}   
        
        
		/*char [] endroitPalindrome=palindrome.toCharArray();
		char [] enversPalindrome= new char[endroitPalindrome.length];
		for (int i = 0; i < enversPalindrome.length; i++) 
		{
			enversPalindrome[i]=endroitPalindrome[(endroitPalindrome.length-1)-i]; 
			
		}
		Boolean verif=true;
		
		for (int i = 0; i < enversPalindrome.length; i++) {
			if(endroitPalindrome[i]!=enversPalindrome[i])
			{
				verif=false;
				break;
			}*/
        
        if (!verifPalindrome) {
			System.out.println("La chaine de caractère \n"+ phrase+"\n  n'est pas un palindrome !" );
			
		}else
		{
			System.out.println("La chaine de caractère \n"+ phrase+"\n est un palindrome !" );
		}
        
			
		}
		/*if (!verif) {
			System.out.println("La chaine de caractère \n"+ phrase+"\n  n'est pas un palindrome !" );
			
		}else
		{
			System.out.println("La chaine de caractère \n"+ phrase+"\n est un palindrome !" );
		}
		*/
        
		// TODO Auto-generated method stub

	}

}
