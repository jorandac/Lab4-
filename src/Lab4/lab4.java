// JoRanda Chapman 

package Lab4;

import java.util.Scanner;

public class lab4 {
	
	public static void main(String[] args) { 
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Learn your squares and cubes!");
		
		String choice = "y"; 
        	
do {
		System.out.println("Enter an integer:");
		int userInput = scnr.nextInt(); //Scanner to ask user to input integer
		
		System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");       
        System.out.println("======" + "  " + "======" + "  " + "======");
        
       
        for (int i = 1; i <= userInput; i++) 
        {      
        	i = userInput;
            int numberSquared = (int) Math.pow(i, 2);
            int numberCubed = (int) Math.pow(i, 3);

            String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
        
            System.out.println(message);
            System.out.println();
        }
        
        System.out.print("Continue? (y/n): ");
        choice = scnr.next();
        System.out.println(); 
	
} while(choice.equalsIgnoreCase("y"));

}
}


