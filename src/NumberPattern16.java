import java.util.Scanner;

public class NumberPattern16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i=1;i<=n;i++)
        {
            int p=i;
            for (int j = 1; j <=i; j++) {
                System.out.print(p+" ");
                p=p+n-j;

            }
            System.out.println();
        }
    }
}
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
