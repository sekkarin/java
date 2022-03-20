import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter products !");
        int n = input.nextInt();
        System.out.println("Enter price !");
        Double x = input.nextDouble();

        double result = n * x;
        System.out.println( "result = " + n + " * " + x );
        System.out.println( "answer = " + n * x );
    } 
}