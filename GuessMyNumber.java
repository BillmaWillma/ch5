import java.util.Scanner ;
import java.util.Random ;

public class GuessMyNumber{

	public static void main(String[] args) {
		
		int wrong = 0 ;
		Random random = new Random() ;
		int number = random.nextInt(100)+1 ;
		System.out.printf("I'm thinking of an integer between 1 and 100, inclusive. \nCan you guess what it is?") ; 
		System.out.printf("\nType a number: ") ; 
		
		for(;;){
			Scanner in = new Scanner(System.in) ;
			int guess ;
			guess = in.nextInt() ;
			
			int dif = Math.abs(number - guess) ;
			
			if (number == guess){
				System.out.println() ;
				System.out.println ("You guessed it correctly! I was thinking of " + number) ;
				break ;
		} else if (number>=guess){
			System.out.println() ;
			System.out.println("You guessed too low.");
			System.out.println("Guess again.");
			System.out.println();
			wrong += 1 ;
		} else{
			System.out.println() ;
			System.out.println("You guessed too high.") ;
			System.out.println("Guess again.");
			System.out.println();
			wrong += 1 ;
		} 
	
		if (wrong == 3) {
			System.out.println() ;
			System.out.println("I was thinking of " +number ) ;
			System.out.println("You were off by " +dif) ;
			break;
		}
		
		
	}

}
}
