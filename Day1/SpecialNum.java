import java.io.*;
import java.util.*;

public class SpecialNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for(;a <= b;a++){
            if(special(a)){
                System.out.println(a);
            }
        }
    }
    
    public static boolean special(int i){
        int temp = i;
        int h = 0;
        int j = 1;
        while(temp != 0){
            h += temp%10;
            j *= temp%10;
            temp /= 10;
        }
        return (h+j) == i;
    }
}
