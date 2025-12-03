import java.util.ArrayList;
import java.util.List;

public class ProblemThree {

    public static void main(String[] args) {
        long n = 600851475143L;
        long k = n;
        List<Long> primeFactorList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (isPrime(i) && k % i == 0) {
                primeFactorList.add(Long.valueOf(i));
                k = k/i;
                System.out.println("FAKTOR: " + i);
            }
        }
        System.out.println(primeFactorList.getLast());
        
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        // Prüfe auf Teiler von 2 bis zur Quadratwurzel der Zahl
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Teiler gefunden, also keine Primzahl
            }
        }
        return true; // Kein Teiler gefunden, also eine Primzahl
    }

}
