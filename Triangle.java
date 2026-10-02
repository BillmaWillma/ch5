import java.util.Scanner ;

public class Triangle{

	public static void main(String[] args){
        
        System.out.println("Enter the three integer sides: a, b, and c, of a triangle, in that order.") ;

        for (;;) {
            Scanner in = new Scanner(System.in) ;

            int a = in.nextInt() ;
            int b = in.nextInt() ;
            int c = in.nextInt() ;

            if (a<=0 || b<=0 || c<=0) {
                System.out.println("No side of a triangle may be zero or negative. Try again.") ;
                    System.out.println() ;
            } else if (a+b>c && a+c>b && b+c>a) {
                System.out.println("It is possible to make a triangle with the given side lengths.") ;
                break ;
            } else {
                System.out.println("No triangles may be formed with the given sides. Try again.") ;
                System.out.println() ;
            }

        }
        
	}
    
}
