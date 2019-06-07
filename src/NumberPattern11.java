import java.util.Scanner;

public class NumberPattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
*/