class Solution {
    public boolean canJump(int[] nums) {

        // goal here is to tru to start from index 0 and verify the value of it 
        // to see how much index we will jump then we get into another index then we see it's value untill we see if we can reach the end index if not it's false else it's true 



        //steps

        // lastPosition = nums.length - 1

        // index = 0


        // while(index <= lastPosition)

        // index +=nums[index]



        // if(nums[index] == nums[lastposition]) return true;


        // return false;


        int lastPosition = nums.length - 1;

        int farthest = 0;
        int index=0;


        for(int i=0;i<nums.length;i++){



            if(i> farthest) return false;

            if(i+nums[i] >= lastPosition) return true; 


            farthest = Math.max(farthest,nums[i]+i);



            






        }

        return false;


        



        
        
    }
}
