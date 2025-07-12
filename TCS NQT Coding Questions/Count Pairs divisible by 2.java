import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while ( t-- > 0) 
        {
           int N = scanner.nextInt();
            int[] arr = new int[N];
            int even = 0, odd = 0;
            for (int i = 0; i < N; i++) 
            {
                arr[i] = scanner.nextInt();
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            long evenPairs = (long) even * (even - 1) / 2;
            long oddPairs = (long) odd * (odd - 1) / 2;
            System.out.println(evenPairs + oddPairs);
        }
    }
}