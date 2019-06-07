import java.util.Scanner;

public class NumberPattern27 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        System.out.println("The Pattern is:");
        for (int i = 1; i <=n ; i++) {
            int temp=i;
            boolean b=false;
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(temp+" ");
                if (temp==2*i-1)
                {
                    b=true;
                }
                if (b)
                {
                    temp--;
                }else {
                    temp++;
                }
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}

/*
         1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
  */
