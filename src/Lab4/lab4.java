// JoRanda Chapman 

package Lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) { 
		
		int userInput; 
		int i; 
		String choice = "y";  
		
		//Scanner for user Input 
		Scanner scnr = new Scanner(System.in);
		
		//Introduction Print Out 
		System.out.println("Learn your squares and cubes!");
   
        //Loop to determine whether user would like to continue 
	    while(choice.equalsIgnoreCase("y")) { 

		System.out.println("Enter an integer:");
	    userInput = scnr.nextInt(); //Scanner to ask user to input integer

		//Formatted Columns for Titles  
		System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");       
        System.out.println("======" + "  " + "======" + "  " + "======");
        
       
        for (i = 1; i <= userInput; i++)  {      
            int numberSquared = (int) Math.pow(i, 2);
            int numberCubed = (int) Math.pow(i, 3);
            
            System.out.println(i + "\t\t" + i * i  + "\t\t" + i * i * i);
            System.out.println(); 
        
        }
        
        System.out.print("Continue? (y/n): ");
        choice = scnr.next();  //Scanner to ask user if they would like to continue 
        System.out.println(); 

			}
//Output if user chooses "n" when asked to continue 	
System.out.println("\nGoodbye.");
scnr.close();

} 
	
     }

	



