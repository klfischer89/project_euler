public class ProblemTwo {

    public static long solve(){
        
        int n = 4000000;
        long a = 0;
        long b = 1;
        long sum = 0;

        while (a <= n) {
            if (a % 2 == 0) {
                sum += a;            // aktuellen Fibonacci-Wert zur Summe addieren
            }
            
            long next = a + b;   // nächsten Fibonacci-Wert berechnen
            a = b;
            b = next;
        }

        return sum;
    }
}
