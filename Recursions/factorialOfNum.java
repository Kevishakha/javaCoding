
class Main {
    // Print factorial of a number using recursion
    // fact n-=5 fact = 5*4*3*2*1=120
    public static int printfact(int n,int fact) {
        if(n==0){
            
            return fact;
        }
        fact *= n;
        return printfact(n-1,fact);
        
    }
    public static void main(String[] args) {
        int n = 5;
        int fact=1;
        int res=printfact(n, fact);
        System.out.println("result is "+res);
        
    }

 
}
