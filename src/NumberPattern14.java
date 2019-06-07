import java.util.Scanner;

public class NumberPattern14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print(1);
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/
