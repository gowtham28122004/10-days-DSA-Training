import java.io.*;
import java.util.*;

public class LowerTriangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        if(lower(arr,n)){
            System.out.println("Lower triangular matrix");
        }
        else{
            System.out.println("Not an Lower triangular matrix");
        }
    }
    
    public static boolean lower(int arr[][],int n){
        for(int i = 1;i < n;i++){
            for(int j = 0;j < i;j++){
                if(arr[j][i] != 0)
                    return false;
            }
        }
        return true;
    }
}
