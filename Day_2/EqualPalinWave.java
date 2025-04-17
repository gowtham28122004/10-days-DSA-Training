import java.util.Scanner;

class EqualPalinWave {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0;i < n;i++){
            arr1[i] = s.nextInt();
        }
        for(int i = 0;i < m;i++){
            arr2[i] = s.nextInt();
        }
        if(isEqual(arr1,arr2,n,m)){
            if(isPalindrome(arr1)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not Palindrome");
            }
        }
        else if(!isEqual(arr1,arr2,n,m)){
            int a1 = sum(arr1);
            int a2 = sum(arr2);
            if(a1 > a2){
                arr1 = wave(sort(arr1,n));
                for(int i : arr1){
                    System.out.print(i+ " ");
                }
            }
            else{
                arr2 = wave(sort(arr2,m));
                for(int i : arr2){
                    System.out.print(i+ " ");
                }
            }
        }
        
    }
    public static boolean isPalindrome(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            if(arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public static boolean isEqual(int[] arr1,int arr2[],int n,int m){
        if(n != m) return false;
        for(int i = 0;i < n;i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static int[] sort(int[] arr,int n){
        for(int i = 0;i < n-1;i++){
            for(int j = 0;j < i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int sum(int[] arr){
        int c = 0;
        for(int i : arr){
            c += i;
        }
        return c;
    }
    public static int[] wave(int[] arr){
        for(int i = 0;i < arr.length-1;i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }
}
