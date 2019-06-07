import java.util.Scanner;

public class NumberPattern15 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        boolean a=true;
        System.out.println("The Pattern is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a)
                {
                 System.out.print(1);
                 a=false;
                }else {
                    System.out.print(0);
                    a=true;
                }
            }
            System.out.println();
        }
    }
}

/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/
