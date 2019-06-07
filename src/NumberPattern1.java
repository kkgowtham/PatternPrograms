import java.util.Scanner;

public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }

}



/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
*/
