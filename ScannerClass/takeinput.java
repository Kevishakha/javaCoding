import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name =  sc.next();
        System.out.println(" Your name is :" +name);
        System.out.print("Enter two integers to sum : ");
         int int1=sc.nextInt();
         int int2=sc.nextInt();
         int sum=int1+int2;
         System.out.print(sum);


        sc.close();


    }
}
