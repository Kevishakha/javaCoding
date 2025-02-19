import java.util.*;

class Main {

    public static void main(String[] args) {
       // find Find the Pair with Given Sum with two approaches
       int[] arr=new int[5];
       arr = new int[]{4,5,8,6,7};
       int target=13;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if((arr[i]+arr[j]) == target){
                System.out.println("The target is pair of" +arr[i]+ " " +arr[j]);
                System.out.println("THe index is" +i+ " " +j);
            }
        }
       }

    }
}
