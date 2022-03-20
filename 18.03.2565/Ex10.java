import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Midterm ");
        int a = input.nextInt();
        System.out.println("Enter Endterm ");
        int b = input.nextInt();

        double sum = a + b ;

        
    if (sum>=80){
        System.out.println("Score = "+ sum +" Grade = A");
    }
    else if (sum>=75){
        System.out.println("Score = "+ sum +" Grade = B+");
    }
    else if (sum>=70){
        System.out.println("Score = "+ sum +" Grade = B");
    }
    else if (sum>=65 ){
        System.out.println("Score = "+ sum +" Grade = C+");
    }

    else if (sum>=60 ){
        System.out.println("Score = "+ sum +" Grade = C");
    }
    else if (sum>=55){
        System.out.println("Score = "+ sum +" Grade = D+");
    }
    else if (sum>=50 ){
        System.out.println("Score = "+ sum +" Grade = D");
    }else 
        System.out.println("Score = "+ sum +" Grade = F");
    
    } 
}