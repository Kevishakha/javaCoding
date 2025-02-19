
class Main{
    public static void main(String[] args){
        int[] arr={7,8,3,1,2,5};
        // selection sort 
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;  // stores the index of smallest
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;  // update the index
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
