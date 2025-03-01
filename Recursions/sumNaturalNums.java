
class Main {
    // Print sum of natural numbers using recursion
    public static int printsum(int n,int sum) {
        if(n==0){
            
            return sum;
        }
        sum += n;
        return printsum(n-1,sum);
        
    }
    public static void main(String[] args) {
        int n = 8;
        int sum=0;
        int res=printsum(n, sum);
        System.out.println("result is" +res);
        
    }

 
}
