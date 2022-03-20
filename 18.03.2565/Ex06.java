import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X  ");
        int x = input.nextInt();
      

        int y1 = (x*x) ;
        int y2 = (2*x) ;
        int y3 = (x*x)+(2*x)+10 ;

        System.out.println( " y = " + " ( "+ x + " * " + x +  " ) "  +  " + " + " ( " + 2 + " * " + x +  " ) " + " + "  + 10 ) ;
        System.out.println( " y = " +   y1  + " + " + y2 +   " + " + 10 );
        System.out.println( " y = " +   y3 ) ;
    } 
}