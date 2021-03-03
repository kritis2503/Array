import java.util.*;

public class lec01{
    public static void dividePostiveAndNegative(int []arr){
        int start=0, end=arr.length-1;
        while(end>=start){
            if(arr[start]<0 && arr[end]>0)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                System.out.println("l");
                end--;
            }
            if(arr[start]>0)
                start++;
            if(arr[end]<0)
                end--;
        }
    }
    public static void swap(int a, int b){
     int temp=a;
     a=b;
     b=temp;      
        
    }
    //here order remains the same
    public static void dividePostiveAndNegative02(int []arr){
        if (arr.length == 0)
        return;

    int k = 0,  n = arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]>=0 && k<n-1){
            int temp=arr[k];
            arr[k]=arr[i];
            arr[i]=temp;
            k++;
        }
    }  
        display(arr);
    }
    // leetcode 75: segregate 0,1,2    
    public static void sortColors(int [] arr) {
               if (arr.length == 0)
                return;
        
            int p1 = -1, idx = 0, n = arr.length, p2 = n - 1;
            while (idx <= p2)
            {
                if (arr[idx] == 0)
                    swap(arr[++p1], arr[idx++]);
                else if (arr[idx] == 2)
                    swap(arr[idx], arr[p2--]);
                else
                    idx++;
            }  
            }
    
    public static void main(String[] args) {
        solve();

    }
    public static void solve(){
        int[] arr={4,-3,6,7,2,-8,-9,10,11,12,-19};
        //dividePostiveAndNegative(arr);
        dividePostiveAndNegative02(arr);
        //display(arr);
    }
    public static void display(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}