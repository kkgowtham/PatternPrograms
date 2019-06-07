import java.util.Scanner;

public class NumberPattern25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <= n; i++) {
            int temp=i;
            for (int j = 0; j < n; j++) {
                System.out.print(temp+" ");
                temp=temp+n;
            }
            System.out.println();
        }
    }
}


/*
1 6 11 16 21
2 7 12 17 22
3 8 13 18 23
4 9 14 19 24
5 10 15 20 25
 */