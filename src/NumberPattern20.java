import java.util.Scanner;

public class NumberPattern20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        int count=1;
        for (int i = 1; i <= n; i++) {
            if (i%2==0)
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
2 3
6 5 4
7 8 9 10
15 14 13 12 11
 */
