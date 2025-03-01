
class Main {
    public static void printnum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("The value" + n);
        printnum(n - 1);
    }
    public static void main(String[] args) {
        int n = 8;
        printnum(n);

    }

 
}
