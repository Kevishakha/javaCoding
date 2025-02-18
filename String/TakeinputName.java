import java.util.*;

class Main {

    public static void main(String[] args) {
        // String declaration
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter first name : ");
        String firstname=sc.next();
        System.out.print(" Enter Last name : ");
        String Lastname=sc.next();
        
        
        System.out.println("Hey  " + firstname);
        System.out.println("Good evening Miss " +Lastname);
        System.out.println("Your name is " + firstname + " " +Lastname);
    }
}
