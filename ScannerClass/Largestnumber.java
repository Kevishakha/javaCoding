import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        
         int int1=sc.nextInt();
         int int2=sc.nextInt();
         int int3 =sc.nextInt();
         
         if(int1>int2){
            System.out.print(" first one is greater");
         } else if(int2>int3){
            System.out.print(" Second one is greater");
         }
         else{
            System.out.print(" Third one is greater");
         }

         System.out.print(Math.max(int1, int2));
         System.out.print(Math.max(int2, int3));
        sc.close();
        
    }
}
