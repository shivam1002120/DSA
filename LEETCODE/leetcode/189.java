// "https://leetcode.com/problems/rotate-array/"
// 189 Medium:

class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
        
        int i=0;
        int j=(nums.length-k)-1;
        nums = swap(nums,i,j);
        
        i=(nums.length-k);
        j=nums.length-1;

        nums = swap(nums,i,j);
        
        nums = swap(nums,0,nums.length-1);
        
    }

    public int[] swap(int[] arr, int si, int ei){

        while(si<ei){
            int temp = arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            si++;
            ei--;
        }

        return arr;
    }
}