import java.util.*;

class Main {
    public static void main(String[] args){
     // Declaration of array
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size for array :");
     int size=sc.nextInt();
     int[] arr = new int[size];
     System.out.println(arr);   // return the memory reference
     System.out.println(Arrays.toString(arr)); 
     // initialization of an array
     for(int i=0; i<size;i++){
      System.out.print("Enter the digits in your array of " +size+ " size :");
      arr[i]=sc.nextInt();
     }
      // print the output of array elements
     System.out.println("Your array" +Arrays.toString(arr));
     for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
     }
    }
}
