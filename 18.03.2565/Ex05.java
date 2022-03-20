import java.util.Scanner;
public class Ex05
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter wide ");
        double w = input.nextDouble();
        System.out.println("Enter long ");
        Double l = input.nextDouble();

        double area = w * l ;
        System.out.println( "area = " + w + " * " + l );
        System.out.println("answer = " + w * l );
    } 
}