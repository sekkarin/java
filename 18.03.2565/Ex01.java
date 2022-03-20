import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number1 : ");
        int x1 = input.nextInt();
        System.out.print("Enter Number2 : ");
        int x2 = input.nextInt();
        System.out.print("Enter Number3 : ");
        int x3 = input.nextInt();
        System.out.print("Enter Number4 : ");
        int x4 = input.nextInt();
        System.out.print("Enter Number5 : ");
        int x5 = input.nextInt();
        
        int sum = x1 + x2 + x3 + x4 + x5;
        double average = sum / 5;

        if(average >= 50){
            //Yes
            System.out.println("Average = " +average);
            System.out.println("Pass !!");
        }
        else{
            //NO
            System.out.println("Average = " +average);
            System.out.println("Fail !!");
        }
    }
}
