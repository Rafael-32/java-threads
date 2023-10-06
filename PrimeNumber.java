import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        sc.close();

        if(isPrime(prime)) {
            System.out.println(prime + " is a prime number");
        }else {
            System.out.println(prime + " is not a prime number");
        }

    }

    public static  boolean isPrime(int pr) {
        if(pr==0 || pr ==1) {
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(pr);i++) {
            if(pr%i==0) {
                return false;
            }
        }
        return true;
    }
}
