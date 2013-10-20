public class prob10{
    public static boolean isPrime(long n )
    {
        for (long i = 2; i< n; i++)
        {
            if ( n %i == 0)
                return false;
        }
        return true;
    }

    public static void main(String args [] )
    {
        long sum = 0;
        for ( int i =2; i < 2000000; i++)
        {
            if ( isPrime(i))
            {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}

