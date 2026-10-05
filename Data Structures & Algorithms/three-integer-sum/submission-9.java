class Solution {
    public List<List<Integer>> threeSum(int[] nums) {


        // goal here it to return the max list element that has 3 element and its sum return 0


        // nums.length < 3 return []

        // nums.lengh == 3 and sum of nums != 0 return []


        // int left = 0
        // int right = nums.length -1 

        // while(left < right){


        // sum = nums[left]+nums[left+1]+nums[left+3]

        // if(sum > 0) right --;

        //(sum < 0) left++;

        // else list.add(new list())
        
        //}



        if(nums.length<3) return new ArrayList<>();

        if(nums.length == 3 && (nums[0]+nums[1]+nums[2] != 0)) return new ArrayList<>();


        int[] sortedarray = nums.clone();

        List<List<Integer>> array = new ArrayList<>();

        Arrays.sort(sortedarray);


        int left = 0;

        int sum = 0;

        int right = 0;


        for(int i=0;i<sortedarray.length;i++){


            if(i>0 && sortedarray[i-1] == sortedarray[i]){

                continue;
            }

            left = i+1;

            right = sortedarray.length-1;


           while(left < right){


             sum = sortedarray[left]+sortedarray[i]+sortedarray[right];

            if(sum > 0){
                right--;
              
            
            
            }

            if(sum < 0){

                 left ++;
                
            }

            if(sum == 0){

                List<Integer> tab = new ArrayList<>();
                tab.add(sortedarray[i]);

                tab.add(sortedarray[left]);
                
                tab.add(sortedarray[right]);


                array.add(tab);

                right--;
                left++;

                while(left < right && sortedarray[left-1] == sortedarray[left]){



                    left++;
                }

                while(left < right && sortedarray[right] == sortedarray[right+1]){

                    right--;
                }
            }
           }
        }


        return array;







        

        
        
    }
}
