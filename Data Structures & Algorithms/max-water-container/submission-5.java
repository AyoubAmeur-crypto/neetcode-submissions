class Solution {
    public int maxArea(int[] heights) {

        // goal is to get the two bars index  have the biggest difference to reprsent width and their value should be close to each other to get the minum height so that we can get the biggest surface 



        // steps


        //left = 0

        // right = heights.length -1

        // width

        // height


        // left < right


        // width = Math.max(width,right-left)

        // height = Math.max(height,Math.min(heights[left],heights[right]))


        int left = 0;

        int right = heights.length -1;

        int width = 0;
        int height = 0;

        int size = 0;


        while(left<right){

            width = right - left;

            height = Math.min(heights[right],heights[left]);


            if(heights[left]< heights[right]){

                left++;
            }else{

                right--;
            }


            size = Math.max(size,height*width);
        }


        return size;






        
    }
}
