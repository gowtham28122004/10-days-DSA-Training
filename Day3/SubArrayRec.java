import java.util.*;
class SubArrayRec {
    public static void print(int arr[],int n,int i,int j,List<ArrayList<Integer>> li,ArrayList<Integer> al)
    {
        if(j==n)
        {
            i=i+1;
            if(i==n)
            {
                System.out.println(li);
                return;
            }
            j=i;
            al.clear();
            print(arr,n,i,j,li,al);
        }
        else
        {
            al.add(arr[j]);
            ArrayList<Integer> temp=new ArrayList<Integer>(al);
            li.add(temp);
             print(arr,n,i,j+1,li,al);
        }
    }
    public static void main(String[] args) {
     List<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
     ArrayList<Integer> al=new ArrayList<Integer>();
     int arr[]={1,2,3,4,5};
     print(arr,5,0,0,li,al);
    }
}
