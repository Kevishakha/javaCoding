import java.util.*;

class Main {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the rows number: ");
        int rows=sc.nextInt();
        System.out.println("ENter columns size :");
        int cols=sc.nextInt();
        // to take input inside the arrays
        int[][] arr=new int[rows][cols];
        for(int i=0; i<rows;i++){
          for(int j=0;j<cols;j++){
              arr[i][j]=sc.nextInt();
          }
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
          }

    }
}
