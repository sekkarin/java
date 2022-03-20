public class Ex06 {
    public static void main(String[] args) {
        double result = 1;
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                
                result *= i;
            }
        }

        System.out.println("Answer " + result);
    }
}
