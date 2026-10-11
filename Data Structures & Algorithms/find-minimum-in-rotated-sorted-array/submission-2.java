class Solution {
    public int findMin(int[] nums) {

       
       // to o(log n) binary search

       // left =0 

       // right = nums.length -1;

       //while(left<right)


       // middle = right+left/2

       //while(nums[middle] < nums[end]){


       // left = middle+1


       // right = middle 

       // return nums[right]
       
       
       int left =0;

       int right = nums.length - 1;


       int middle = 0;


       while(left < right){


        middle = (left+right)/2;


        if(nums[middle] > nums[right]){

            left = middle+1;
        }else{


            right = middle;
        }

        
       }


       return nums[right];



        
    }
}
