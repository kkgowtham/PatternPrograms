import java.util.Scanner;

public class NumberPattern12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j%2==0)
                {
                    System.out.print(0+" ");
                }
                else
                {
                        System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}




/*1
10
101
1010
10101
101010
1010101*/