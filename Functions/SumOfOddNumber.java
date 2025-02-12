import java.util.*;

class Main {
    public static void average(int n){
      int SumOfOdd = 0;

      for(int i=1; i<=n;i++){
        if(i%2 !=0){
          SumOfOdd += i;
        }
      }

      System.out.println(SumOfOdd);
      return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); 
        average(n);
    }
}
