import java.util.Scanner;

public class NumberPattern23 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        int x1=n*2-1;
        int x2=1;
        System.out.println("The Pattern is:");
        for (int i = 1; i <=n ; i++) {
            int temp=i;
            for (int j = 1; j <= n; j++) {
                System.out.print(temp+" ");
                if (j%2==1)
                {
                 temp=temp+x1;
                }else {
                    temp=temp+x2;
                }


            }
            x1-=2;
            x2+=2;
            System.out.println();
        }
    }
}
/*
1 10 11 20 21
2 9 12 19 22
3 8 13 18 23
4 7 14 17 24
5 6 15 16 25
 */
