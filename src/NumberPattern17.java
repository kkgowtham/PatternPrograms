import java.util.Scanner;

public class NumberPattern17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j)
                {
                    System.out.print(i);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
 */
