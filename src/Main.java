import java.util.Scanner;

//https://pl.spoj.com/problems/ML2_A/

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int numberOfAttempts = in.nextInt();
        for (int i = 0; i < numberOfAttempts; i++) {
            int numberToCalculate = in.nextInt();
            System.out.println(numberToCalculate);
            calculateSumOfTwoPrimeNumbers(numberToCalculate);
        }
    }

    private static void calculateSumOfTwoPrimeNumbers(int numberToCalculate) {
        boolean canBeShowAsSumOfTwoPrimes = false;
        for(int i = 2; i <= (numberToCalculate/2); i++)
        {
            if(isPrime(i)){
                if(isPrime(numberToCalculate - i)){
                    canBeShowAsSumOfTwoPrimes = true;
                    System.out.println("TAK " + i + " " + (numberToCalculate-i));
                    break;
                }
            }
        }
        if(!canBeShowAsSumOfTwoPrimes) {
            System.out.println("NIE");
        }
    }

    private static boolean isPrime(int number){
        boolean isPrime = true;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
