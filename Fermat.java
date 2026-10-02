import java.util.Scanner ;

public class Fermat{
	
	public static void main(String[] args) {
		
        for (;;) {
    		System.out.println("Imput value for integers a, b, c, and n, in this order, for the expression a^n + b^ n = c^n") ;
		
    		Scanner in = new Scanner(System.in) ;
    		int a = in.nextInt();
    		int b = in.nextInt();
    		int c = in.nextInt();
    		int n = in.nextInt();
		
    		double p = Math.pow(a, n) ;
    		double q = Math.pow(b, n) ;
    		double r = Math.pow(c, n) ;
		
    		if (p+q == r  && n>2){
    			System.out.println("Holy smokes, Fermat was wrong!") ;
    			break ;
	} else if (n <= 2) {
		System.out.println("Please input n such that n > 2 in order to disprove Fermat.") ;
		System.out.println() ;
		System.out.println() ;
	}else {
        System.out.println("No, that doesn't work.") ;
		System.out.println() ;
		System.out.println() ;
	}
	
        }
        
	}
    
}
