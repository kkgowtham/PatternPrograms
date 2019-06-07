import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        int n=new Scanner(System.in).nextInt();
        System.out.println("The pattern is");
        int[][] arr=new int[n][n];
        int a=1;
        int minRow=0;
        int minCol=0;
        int maxRow=n-1;
        int maxCol=n-1;
        while (a<n*n)
        {
            //iterating left to right in a row
            for (int i = minCol; i <=maxCol; i++) {
                arr[minRow][i]=a;
                a++;
            }
            //iterating top to bottom in a column
            for (int i = minRow+1; i <=maxRow; i++) {
                arr[i][maxCol]=a;
                a++;
            }
            //iterating right to left in a row
            for (int i = maxCol-1; i >=minCol ; i--) {
                arr[maxRow][i]=a;
                a++;
            }
            //iterating  bottom to top in a column

            for (int i = maxRow-1; i >=minRow+1; i--) {
                arr[i][minCol]=a;
                a++;
            }

            minRow++;
            minCol++;
            maxCol--;
            maxRow--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

     /*
        //iterating 2d array in spiral manner
        int val=1;
        int p=0,q=n-1,r=0,s=n-1;
        while (val<n*n)
        {
            for (int i = r; i <= s; i++) {
                System.out.println(arr[p][i]);
                val++;
            }
            for (int i = p+1; i <=q; i++) {
                System.out.println(arr[i][s]);
                val++;
            }
            for (int i = s-1; i >=r ; i--) {
                System.out.println(arr[q][i]);
                val++;
            }
            for (int i = q-1; i >=p+1 ; i--) {
                System.out.println(arr[i][r]);
                val++;
            }
            p++;
            r++;
            q--;
            s--;
        }*/
    }

}


/*
1 2 3  4  5
16 17 18 19 6
15 24 25  20  7
14 23 22 21 8
13 12 11 10 9
 */
