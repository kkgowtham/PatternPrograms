import java.util.Scanner;

public class NumberPattern19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 */
