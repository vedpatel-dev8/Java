import java.util.ArrayList;

class ST02Demo
{
    // Prime check method
    public static boolean isPrime(int n)
    {
        if(n <= 1) return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String [] args)
    {
        ArrayList<Integer> no = new ArrayList<Integer>();
        
        no.add(5);
        no.add(4);
        no.add(7);
        no.add(1);
        no.add(6);
        no.add(3);
        no.add(2);
        
        System.out.println("Element: " + no);

        // 👉 Prime numbers only
        System.out.println("\nPrime Numbers:");
        no.stream()
            .filter(n -> isPrime(n))
            .forEach(n -> System.out.println(n));

        // 👉 Prime numbers * 10
        System.out.println("\nPrime * 10:");
        no.stream()
            .filter(n -> isPrime(n))
            .map(n -> n * 10)
            .forEach(n -> System.out.println(n));

        // 👉 Map first then filter (LOGIC CHANGE!)
        System.out.println("\nMap then Filter (WRONG LOGIC if you want original primes):");
        no.stream()
            .map(n -> n * 10)
            .filter(n -> isPrime(n))   // checking prime AFTER multiplying
            .forEach(n -> System.out.println(n));
    }
}