import java.io.*;
import java.util.*;
public class Coefficient
{
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        float max=arraymax(arr,0);
        float min=arraymin(arr,0);
        System.out.println(max);
        System.out.println(min);
        float range=max-min;
        System.out.println(range);
        float range1=max+min;
        float coeffic= (range)/(range1);
        System.out.println(coeffic);
    }
    public static float arraymax(int []arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        float misa=arraymax(arr,index+1);
        if(arr[index]<misa){
            return misa;
        }
        else {
            return arr[index];
        }
    }
    public static float arraymin(int []arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        float minisa=arraymin(arr,index+1);
        if(arr[index]>minisa){
            return minisa;
        }else{
            return arr[index];
        }
    }

}
