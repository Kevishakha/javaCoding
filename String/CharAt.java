import java.util.*;

class Main {

    public static void main(String[] args) {
        // String declaration
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter first name : ");
        String firstname=sc.next();
        System.out.println("Enter your last name :");
        String lastname= sc.next();
        // String functions  
     // String concatenation 
     String fullname = firstname+ " " +lastname;
     System.out.println(fullname);
         for(int i=0; i<= fullname.length();i++){
           
                System.out.println(fullname.charAt(i));
            
                 }

    }
}
