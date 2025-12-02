import java.math.BigInteger;

public class problemZero{
    
    public static long solve() {
        long n = 936000;
        long square = 0;
        long oddSquareSum = 0;

        for (int i = 1; i <= n; i++) {
            square = i*i;
            if (square % 2 != 0) {
                oddSquareSum += square;
                // System.out.println("SQUARE: " + square);
                // System.out.println("SQUARE_SUM: " + oddSquareSum);
            }
        }

        System.out.println("Summer aller ungeraden Quadrate: " + oddSquareSum);

        BigInteger a = BigInteger.valueOf(936_000);
        BigInteger b = BigInteger.valueOf(935_999);
        BigInteger c = BigInteger.valueOf(936_001);
        BigInteger three = BigInteger.valueOf(3);

        BigInteger res = a.multiply(b).multiply(c).divide(three);
        System.out.println(res); // Ausgabe: 273413215688000000

        return oddSquareSum;
    }

    
}
