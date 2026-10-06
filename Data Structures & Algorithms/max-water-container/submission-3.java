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

        int width=0;

        int height=0;

        int size = 0;
        int sum =0;
        int meanHeight = 0;

        // for(int i=1;i<=heights.length-1;i++){


        //     sum+=heights[i];
        // }

        // meanHeight = sum/heights.length;




        while(left<right){




            


        height = Math.min(heights[left],heights[right]);


        width = right-left;


        if(heights[left] < heights[right]){


            left++;
        }else{

            right--;
        }



    
        


        size = Math.max(size,height * width);


        












            




        }

        return size;



        
    }
}
