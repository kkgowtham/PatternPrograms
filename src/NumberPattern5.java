import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print((j)+" ");
            }
            System.out.println();
        }

    }
}



/*
        1 2 3 4 5 6 7
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

 */