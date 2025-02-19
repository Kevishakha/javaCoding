import java.util.*;

class Main {

    public static void main(String[] args) {
       // find Find the Pair with Given Sum with two approaches  optimized approach
       int[] arr= {7,8,3,1,2};
        int target=9;
        HashMap<Integer, Integer> map=new HashMap<>();
       
        for(int num : arr){
            int complement=target-num;
            if(map.containsKey(complement)){
                System.out.println("Pair is at :" +complement+ " " +num);
                
            }
            map.put(num,1);
        }

    }
}
