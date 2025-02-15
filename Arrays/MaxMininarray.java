
import java.util.*;

// find max and minimum number in an array of integers

class Main {
    public static void main(String[] args){
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int size=sc.nextInt();
      int[] arr=new int[size];
      System.out.println("Enter the array values");
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(Arrays.toString(arr));
      int maxvalue = Integer.MIN_VALUE;
      int minvalue = Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<minvalue){
          minvalue=arr[i];
          
        }
        if(arr[i]>maxvalue){
          maxvalue=arr[i];
          
        }
      }    
      System.out.println(minvalue);
      System.out.println(maxvalue);
    }
}




