import java.util.Scanner;

public class NumberPattern21 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        int count=1;
        for (int i = 1; i <= n; i++) {
            if (i%2==1)
            {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }else {
                int temp=count+i-1;
                for (int j = 0; j < i; j++) {
                    System.out.print(temp-- +" ");
                    count++;
                }

                System.out.println();
            }
        }
    }
}
/*
1
3 2
4 5 6
10 9 8 7
11 12 13 14 15
*/

