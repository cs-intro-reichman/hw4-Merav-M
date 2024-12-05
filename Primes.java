public class Primes {
    public static void main(String[] args) {
        int nInputNum = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[nInputNum + 1];

        for (int i = 2; i <= nInputNum; i++) {
            isPrime[i] = true;
        }

        int nPrime = 2;
        while (nPrime * nPrime <= nInputNum) {
            if (isPrime[nPrime]) {
                // Mark multiples of p as non-prime
                int nMultipleOfPrime = nPrime * nPrime;
                while (nMultipleOfPrime <= nInputNum) {
                    isPrime[nMultipleOfPrime] = false;
                    nMultipleOfPrime += nPrime;
                }
            }
            nPrime++;
        }

        System.out.println("Prime numbers up to " + nInputNum + ":");
        int nCounter = 0;
        int nNum = 2;
        while (nNum <= nInputNum) {
            if (isPrime[nNum]) {
                System.out.println(nNum);
                nCounter++;
            }
            nNum++;
        }

        // Calculate and print the percentage of primes
        double percentage = (nCounter * 100.0) / nInputNum;
        System.out.println("There are " + nCounter + " primes between 2 and " + nInputNum +
                           " (" + String.format("%.0f", percentage) + "% are primes)");
    }
}