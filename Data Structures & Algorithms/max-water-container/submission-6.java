class Solution {
    public int maxArea(int[] heights) {



        // goals : to get the maximum surface to return the maximum amount of water


        // steps ;

        // l = 0 & r=n-1

        // surface = 0

        // while(l<r) 

        // surface = Math.max((r-l)*Math.min(height[l],heights[r]),surface)

        // if(height[r]>height[l]){


        // l++
        
        //}

        // right --;



        // return surface



        int left = 0;

        int right = heights.length-1;


        int surface = 0;


        while(left < right){


            surface = Math.max(((right-left)*Math.min(heights[right],heights[left])),surface);


            if(heights[right] > heights[left]){

                left++;
            }else{
                right--;



            }

            



        }



        return surface;



      




        
    }
}
