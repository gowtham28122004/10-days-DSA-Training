import java.util.Scanner;

class SumProdAnaPrime {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = sum(n);
        int product = prod(n);
        if(isPrime(sum) && isPrime(product)){
            System.out.println("Perfect Prime");
        }
        else{
            System.out.println("Not a Perfect Prime");
        }
        if(isAnagram(frequency(sum),frequency(product))){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        if(isPalindrome(sum) && isPalindrome(product)){
            System.out.println("Both are Palindrome");
        }
        else if(isPalindrome(sum)){
            System.out.println("Sum is palindrome");
        }
        else if(isPalindrome(product)){
            System.out.println("Product is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
    public static int sum(int num){
        int c = 0;
        while(num != 0){
            c += num%10;
            num /= 10;
        }
        return c;
    }
    public static int prod(int num){
        int c = 1;
        while(num != 0){
            c *= num%10;
            num /= 10;
        }
        return c;
    }
    public static boolean isPrime(int num){
        if(num < 0) return isPrime(num*-1);
        for(int i = 2;i < Math.sqrt(num);i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static int[] frequency(int num){
        int arr[] = new int[10];
        while(num != 0){
            arr[num%10]++;
            num /= 10;
        }
        return arr;
    }
    public static boolean isAnagram(int arr1[],int arr2[]){
        for(int i = 0;i < 10;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n){
        int temp = n;
        int reverse = 0;
        while(temp != 0){
            reverse = (reverse*10) + (temp%10);
            temp /= 10;
        }
        return reverse == n;
    }
}
