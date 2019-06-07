import java.util.Scanner;

public class NumberPattern10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 2; i--)
        {
            for (int j = i-1; j<=n; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/*
 1234567
 234567
 34567
 4567
 567
 67
 7
 67
 567
 4567
 34567
 234567
 1234567
 */
