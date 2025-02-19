
class Main{
    public static void main(String[] args){
        // bubble sort
        int[] arr={7,8,3,1,2,5};
        for(int i=0;i<arr.length-1;i++){  // the loop runs -1 time because the last element will always be sorted 
            for(int j=0; j<arr.length-i-1;j++){    // loops run -i times becuse in each iteration the array  will get sorted by the count of i element
                if(arr[j]>arr[j+1]){
                   int temp=arr[j];   // Swaping starts 
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                } 
                
            }
        } 
        System.out.println("Ascending order :");
        for(int i=0;i<arr.length;i++){
            
            System.out.print( +arr[i]+ " ");
        }
        System.out.println(" ");
           // desending order of an array
     
        for(int i=0;i<arr.length-1;i++){  // the loop runs -1 time because the last element will always be sorted 
            for(int j=0; j<arr.length-i-1;j++){    // loops run -i times becuse in each iteration the array  will get sorted by the count of i element
                if(arr[j]<arr[j+1]){
                   int temp=arr[j];   // Swaping starts 
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                } 
                
            }
        } 
        System.out.println("Descending order :");
        for(int i=0;i<arr.length;i++){
        
            System.out.print( +arr[i]+ " ");
        }
    }
}
