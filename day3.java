class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(j>=0){
            arr[j]=arr2[i];
            j--;
            }
            
        }
    }
}
