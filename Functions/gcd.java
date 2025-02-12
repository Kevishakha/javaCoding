import java.util.*;

class Main {
    public static int gcd(int n1, int n2){
      int cgcd = 1;

      for(int i=1; i<=Math.min(n1,n2);i++){
        if(n1%i==0 && n2%i==0){
          cgcd = i;
        }
        
      }
      
  return cgcd;

    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt(); 
        int num2=sc.nextInt();
        System.out.println("gcd is " +gcd(num1, num2));
    }
}
