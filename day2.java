class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j=0;
        int count=0;
        int e=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            else if(arr[i]==0){
                count++;
            }
            
        
        }
        for(int i=0;i<count;i++){
            arr[e]=0;
            e--;
        }
        
        
    }
}
