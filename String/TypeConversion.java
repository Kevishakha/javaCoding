import java.util.*;
class Main{
    public static void main(String[] args){
        // Parsing Parse Int // Tostring
        String add="123";
        System.out.println(add);
        System.out.println(Integer.parseInt(add)+5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        System.out.println("Enter a name");
        String name=sc.next();
        String username=name + Integer.toString(number);
        System.out.println(username);

    }
}
