class Solution {
    public int findMin(int[] nums) {

        // goal : is to get the min element inside this nums

        // binary search


        // steps

        // int middle = nums.length/2 - 1

        //int min = 0


        // if(nums[middle] > nums[min]) min = Math.min(nums[min],min)



        int start = 0;

        int end = nums.length -1;


        int middle = 0;


        while(start<end){

            middle = (int) Math.floor((end+start)/2);





            if(nums[middle] >= nums[end]){

                start = middle+1;

            }else{

                end = middle;
            }
            
        }


        return nums[end];














        
    }
}
