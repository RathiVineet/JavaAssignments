import java.util.Arrays;
import java.util.Scanner;

public class Qus4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of rows");
        int m = sc.nextInt();
        System.out.println("Enter the No. of columns");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Enter the array");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        int rowArr[] = new int[m];
        int l=0;
        for(int i=0; i<m; i++){
            int rowSum = 0;
            for(int j=0; j<n; j++){
                rowSum += arr[i][j];
            }
            rowArr[l++] = rowSum;
        }

        int colArr[] = new int[n];
        int k=0;
        for(int i=0; i<n; i++){
            int calSum = 0;
            for(int j=0; j<m; j++){
                calSum += arr[j][i];
            }
            colArr[k++] = calSum;
        }
        String rowSum = Arrays.toString(rowArr);
        String colSum = Arrays.toString(colArr);
        System.out.println("Sum of all element of each row : "+ rowSum);
        System.out.println("Sum of all element of each column : "+ colSum);

    }
}
