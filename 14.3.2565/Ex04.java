import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your x");
        int x = input.nextInt();
        System.out.println("Enter your y");
        int y = input.nextInt();
        System.out.println("Enter your z");
        int z = input.nextInt();

        int max = 0;
        if (x > y) {
            if (x > z) {
                max = x;
            } else {
                max = z;
            }
        } else {
            if (y > z) {
                max = y;
            } else {
                max = z;
            }
        }
        System.out.println("maximum is "+max);
    }
}
