
import java.util.*;
class SumSubArray {
    public static void print(int arr[],int n,int k,int i,int j,int sum,List<ArrayList<Integer>> li,ArrayList<Integer> al)
    {
        if(j == n) {
            i += 1;
            j = i;
            al.clear();
            if(i == n) {
                if(arr[n-1] == k) {
                    al.add(arr[n-1]);
                    li.add(new ArrayList<Integer>(al));
                }
                System.out.println(li);
                return;
            }
            sum = 0;
            print(arr,n,k,i,j,sum,li,al);
        }
        else {
            while(sum+arr[j] <= k && j < n-1) {
                sum+=arr[j];
                al.add(arr[j]);
                j+=1;
                if(sum == k) {
                    li.add(new ArrayList<Integer>(al));
                }
            }
            sum = 0;
            print(arr,n,k,i,n,sum,li,al);
        }
    }
    public static void main(String[] args) {
     List<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
     ArrayList<Integer> al=new ArrayList<Integer>();
     int arr[]={1,2,3,4,5,2,2,4};
     print(arr,arr.length,4,0,0,0,li,al);
    }
}
