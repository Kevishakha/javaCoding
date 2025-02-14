import java.util.*;

class Main {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter size of array");
      //int size=sc.nextInt();
         int[] arr=new int[50];
         System.out.println(Arrays.toString(arr));
         // to store only evennumber in array
         int evennumber=0;
         for(int i=0;i<arr.length;i++){
             arr[i]=evennumber;
             evennumber+=2;
              
         }
         System.out.println(Arrays.toString(arr));
         
         
        System.out.println("Enter a Even number to search");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
          if(arr[i]==num){
            System.out.println("The number" +num+ "is at the index" +i);
          }
        }

    }
}
