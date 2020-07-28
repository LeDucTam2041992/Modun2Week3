package ngay18_baitap3;

import java.util.LinkedList;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int count = 0;
        int prime = 2;
        LinkedList<Integer> primes = new LinkedList<>();
        while (count != 10) {
            if (isPrime(prime)) {
                primes.add(prime);
                System.out.print("Optimized : ");
                for (int s:primes) {
                    System.out.print(s + "\t");
                }
                System.out.println();
                count++;
            }
            prime++;
        }
        System.out.println("Optimized Prime Factorization done!");
    }

    private static boolean isPrime(int number){
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
