class Solution {
    public int findMin(int[] nums) {

       
       // goal : get the minumum elements wihtout looping all over elements 


       // middle = start+3nd/2

       // nums[middle] > nums[end] start-> middle+1

       // set end -> middle 



       int start = 0;

       int end = nums.length -1;

       int middle = 0;


       while(start < end){

        middle = (start+end)/2;


        if(nums[middle] > nums[end]){


            start = middle+1;
        }else{

            end = middle;
        }
       }


       return nums[start];




        
    }
}
