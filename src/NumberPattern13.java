import java.util.Scanner;

public class NumberPattern13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
1  2  3  4  5  6  7
  2  3  4  5  6  7
    3  4  5  6  7
      4  5  6  7
        5  6  7
          6  7
            7
          6  7
        5  6  7
      4  5  6  7
    3  4  5  6  7
  2  3  4  5  6  7
1  2  3  4  5  6  7
*/
