import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i; j--) {
                System.out.print((j)+" ");
            }
            System.out.println();
        }
    }
}

/*
 7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
 */