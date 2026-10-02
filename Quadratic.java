import java.util.Scanner ;

public class Quadratic {
		
	public static void main(String[] args) {
		
		System.out.println("Input integer values a, b, and c for the quadratic formula.") ;
		
		for (;;) {
		Scanner in = new Scanner(System.in) ;
		int a = in.nextInt() ;
		int b = in.nextInt() ;
		int c = in.nextInt() ;
	
		
		
		if (a ==0){
			System.out.println ("a cannot be 0. Try again.") ;
			System.out.println() ;
		} else if (b*b - 4*a*c < 0){
			System.out.println ("The discriminant cannot be a negative value. Try again.") ;
			System.out.println() ;
		} else{
			double p = Math.sqrt(b*b - 4 *a*c) ;
			int q = 2*a ;
			int r = 0-b ;
		
			double x = (r + p) /q ;
			double y = (r+p) / q ;
			
			System.out.println("x = " + x +" , " + y) ;
		}
		
	}
	}
	
}
