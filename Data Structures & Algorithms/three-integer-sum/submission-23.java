class Solution {
    public List<List<Integer>> threeSum(int[] nums) {



        // goal : is to regroup [] of 3 elements their sum -> 0 and return a list that contains list<Integer>


        // steps two pointer 


        // left = 0

        // right = n - 1


        // sort the array


        // int medium = 0


        // List<List<Integer>> list = new ArrayList()<>;


        // int sum =0


        // while(left < right){
        
            // medium = (left+right)/2

            //sum = nums[left]+nums[right]+nums[middle] 


            //if(sum == 0){

            //List<Integer> embededlist = new ArrayList()<>;
            // embededlist.add(nums[left])
             // embededlist.add(nums[right])
              // embededlist.add(nums[middle])

            // list.add(embeded)
            
            //}

            // if(sum > 0){

            // right--;


            
            //}else -> left++;
        
        
        //}


        // return list;



        Arrays.sort(nums);









        List<List<Integer>> list = new ArrayList<>();


        int sum = 0;

        int right = 0;
        int left  = 0;

        
        for(int medium = 0;medium < nums.length -2 ; medium ++){

            
            // skip duplicates
            if (medium > 0 && nums[medium] == nums[medium - 1]) {
                continue;
            }


            left=medium+1;

            right = nums.length - 1;

             



        while(left < right){



            

            sum = nums[left]+nums[right]+nums[medium];


            if(sum == 0){

                List<Integer> embbadedlist = new ArrayList<>();


                
                embbadedlist.add(nums[medium]);
                embbadedlist.add(nums[left]);
                embbadedlist.add(nums[right]);


                list.add(embbadedlist);
                left++;
                right--;


                while(left < right && nums[left] == nums[left - 1]) left++;

                while(right > left && nums[right] == nums[right + 1]) right--;


                
            }else if(sum > 0){

                right--;
            }else{

                left++;
            }
        }






        }




        return list;



      
        



        
        
        }
        
        
        
        }





    


  










        
  
