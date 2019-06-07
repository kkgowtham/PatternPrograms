import java.util.Scanner;

public class NumberPattern8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print((j+1)+" ");
            }
            for (int j = i-1; j>=1; j--) {
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
}

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1
 */
