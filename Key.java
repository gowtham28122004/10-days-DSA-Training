import java.util.*;

public class Key {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();  
        int lepos = scan.nextInt(); 
        int ripos = scan.nextInt() - 1; 
        
        int c = 0;
        int t = i;
        
        while (t > 0) {
            t /= 10;
            c++;
        }
        System.out.println(c); 
        
        int leftDigit = (i / (int) Math.pow(10, lepos - 1)) % 10;
        int rightDigit = (i / (int) Math.pow(10, ripos)) % 10;

        System.out.println(leftDigit + rightDigit);
        
        scan.close();
    }
}
