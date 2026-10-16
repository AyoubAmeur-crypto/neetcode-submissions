class Solution {
    public boolean canJump(int[] nums) {



        // goal is to reach the last index onsode a list and in each element we have the maximum jump


        // step


        // fartest = 0

        // lastPosition = nums.length - 1

        // fratest+=nums[i]


        // if(nums[i] + i > lastPosition) return true

        // if(fartest < i) return false


        // return true;



        int step=0;

        int fartest =0;

        int lastPosition =nums.length - 1;

        for(int i=0;i < nums.length ;i++){


                        if(fartest < i) return false;




            fartest = Math.max(i+nums[i],fartest);
            

            


            if(i + nums[i] >= lastPosition) return true;









        }


        return true;

        





        
        
    }
}
