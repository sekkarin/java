import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = input.nextInt();

        while (number <= 0) {
            System.out.println("Enter your number again!");
            number = input.nextInt();
            if(number>0){
                break;
            }
        }
        System.out.println("wowwwwwww your number : "+number);
    }
}
