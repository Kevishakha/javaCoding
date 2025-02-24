
class Main{
    public static void main(String[] args){
        // String Builder  StringBuilder is a class in Java (java.lang package) used to create and manipulate mutable (modifiable) sequences of characters. Unlike String, which is immutable, StringBuilder allows modification of character sequences without creating new objects, making it more efficient for string manipulations.  
        //Declaration
        String str= "Vishakha";
         StringBuilder sb=new StringBuilder(str);
         
        // Get char at index
            System.out.println("Character at index 4" + sb.charAt(4));
        // set char at index
            sb.setCharAt(4,'I');
            System.out.println("Character changed of index 4" + sb);
        // Insert a char at Index
           sb.insert(7,'A');
           System.out.println("Charater is inserted");
           System.out.println(sb);
        // Delete a char at index

        sb.delete(6,7);
        System.out.println("Character removed");
        System.out.println(sb);
        sb.delete(4,6);
        System.out.println("Character is removed");
        System.out.println(sb);
        // Append add at last
        sb.append("Ahir");
        System.out.println("String Appended:");
        System.out.println(sb);
        sb.append("war");
        System.out.println("String Appended");
        System.out.println(sb); 
        // Print length
       System.out.println("Length of this String is  "+sb.length());

    }
}
