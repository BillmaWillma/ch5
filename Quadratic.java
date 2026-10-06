import java.util.Scanner ;

public class Quadratic {
		
		public static void qformula (int a, int b, int c){
			double p = Math.sqrt(b*b-4 *a*c) ;
			int q = 2*a ;
			int r = 0-b ;
		
			double x = (r + p) / q ;
			double y = (r - p) / q ;
			     if (x == y) {
                System.out.println("x = " + x) ;
                System.out.println() ;
            } else {
                System.out.println("x = " + x +" , " + y) ;
                System.out.println() ;
			}
	}
		
		
		public static void main(String[] args) {
		
		System.out.println("Input integer values a, b, and c, in this order, for the quadratic formula.") ;
		Scanner in = new Scanner(System.in) ;
		
		for (;;) {
    		int a = in.nextInt() ;
    		int b = in.nextInt() ;
    		int c = in.nextInt() ;
		
    		if (a ==0){
    			System.out.println ("a cannot be 0. Try again.") ;
    			System.out.println() ;
    		} else if (b*b-4*a*c < 0){
    			System.out.println ("This quadratic equation has no real solutions. Its discriminant is negative.") ;
    			System.out.println() ;
		} else{
			qformula (a, b, c) ;
			}
		
		}
		
	}
	
}
