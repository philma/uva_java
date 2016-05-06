import java.util.*;
import java.math.*;

class Main
{
    static BigInteger factorial(int n)
    {
        BigInteger ans = BigInteger.ONE;
        BigInteger tmp = BigInteger.ONE;
        for(int i = 1; i <= n; ++i)
        {
            ans = ans.multiply(tmp);
            tmp = tmp.add(BigInteger.ONE);
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            int n = input.nextInt();
            int m = input.nextInt();
            if(n == 0 && m == 0)
                break;

            BigInteger ans = factorial(n).divide(factorial(n - m).multiply(factorial(m)));
            System.out.println(n + " things taken " + m + " at a time is " + ans + " exactly.");        
        }
    }
}
