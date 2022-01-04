package some;

public class Application {

    public static void main(String[] args) {
        printPrimesBetweenZeroAndTwenty();
    }
 
    private static void printPrimesBetweenZeroAndTwenty() {
        for (int i = 0; i < 20; i++){
            if (isPrime(i))
                System.out.println("Prime number: " + i);
        }
    }

    private static boolean isPrime(int potentialPrimeNumber) {
        if (potentialPrimeNumber <= 1)
            return false;

        for (int i = 2; i < potentialPrimeNumber; i++) {
            if (potentialPrimeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
