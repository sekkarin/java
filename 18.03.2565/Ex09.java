import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X ");
        int x = input.nextInt();

        if(x > 0){
            System.out.println( "Possitive Number" );
        }
        else if(x < 0){
            System.out.println( "Negative Number" );
        }
        else{
            System.out.println( "ZERO Number");
        }
    } 
}