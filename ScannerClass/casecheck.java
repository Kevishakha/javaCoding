import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          char ch=sc.next().trim().charAt(0);
          if(ch>='a' && ch<='z'){
            System.out.print("Lowercase");
          }else{
            System.out.print("Uppercase");
          }

        sc.close();
        
    }
}
