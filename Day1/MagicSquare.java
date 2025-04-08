import java.io.*;
import java.util.*;

public class MagicSquare {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int a = 0;
        int b = 0;
        for(int i = 0;i < n;i++){
            a += arr[i][i];
            b += arr[i][n-i-1];
        }
        if(a == b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
