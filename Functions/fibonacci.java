import java.util.*;

class Main {
    public static void fibonacci(int n){
      int first =0;
      int second =1;
      if(n==1){
        System.out.println(first);
        return;
      }
      System.out.print(first + "," + second);
     

      
      for(int i=2; i<=n-1;i++){
         
        int next=first+second;
        System.out.print("," +next);
        
        first=second;
        second=next;
        
      
    }
     
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n terms : ");
        int num =sc.nextInt(); 
         fibonacci(num);
    }
}
