import java.util.Scanner;

public class NumberPattern22 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");

        for (int i = 1; i <= n; i++) {
            int k=i*2-1;
            for (int j = 1; j <=n ; j++) {
                System.out.print(k+" ");
                k=k+2;
                if (k>n*2-1)
                {
                    k=1;
                }
            }
            System.out.println();
        }

    }
}

/*
1 3 5 7 9
3 5 7 9 1
5 7 9 1 3
7 9 1 3 5
9 1 3 5 7
 */