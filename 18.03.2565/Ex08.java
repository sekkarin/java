public class Ex08 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        do{
            System.out.println("Sum = " + sum);
            sum = sum + n;
            System.out.println("n = " + n);
            n = n + 1;
        }while( n <= 10 );
        System.out.println("Totel = " + sum);

        sum = 0;
        for( int i=1 ; i <= 10; i=i+1 ){
            sum = sum+ i;
        }
        System.out.println("Totel = " + sum);

        int k = 1;
        sum = 0;
        while(k <= 10){
            sum = sum+k;
            k = k + 1;
        }
        System.out.println("Totel = " + sum);
    }
}
