import java.util.*;

public class Board {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       char[][] arr = new char[n][n];
       for(int i = 0;i < n;i++){
           for(int j = 0;j < n;j++){
               arr[i][j] = s.next().charAt(0);
           }
       }
       if(isBoard(arr,n)){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
    
    public static boolean isBoard(char[][] board,int n){
        if(n < 2)
        {
            return false;
        }
        char a, b;
        if(board[0][0] != board[0][1]){
            a = board[0][0];
            b = board[0][1];
            System.out.println(a+","+b);
        }
        else{
            return false;
        }
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < n-1;j++){
                if(board[i][j] != a && board[i][j] != b)
                {
                    return false;
                }
                if(board[i][j] == board[i+1][j] || board[i][j] == board[i][j+1] || board[i][j] != board[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
