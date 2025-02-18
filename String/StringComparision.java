import java.util.*;

class Main {

    public static void main(String[] args) {
        // String declaration
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter first name : ");
        String firstname=sc.next();
        System.out.print(" Enter Last name : ");
        String Lastname=sc.next();
        
        if(firstname.compareTo(Lastname)==0){
            System.out.println("Names are equal");
        }else{
            System.out.println("Names are not equal");
        }
    }
}
