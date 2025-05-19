class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
            
        }
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];
                
            }
            else if(arr[i]>secmax && arr[i]!=max){
                secmax=arr[i];
            }
            
        }
        return (secmax==Integer.MIN_VALUE)?-1 : secmax;
        
    }
}
