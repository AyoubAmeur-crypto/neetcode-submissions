class Solution {
    public List<List<Integer>> threeSum(int[] nums) {



        // goal is to return the max list of integers where their sum equals to 0


        // nums.length < 3 return new arraylist<>()

        // nums.length == 3 && nums[0]+nums[1]+nums[2] != 0 reurn new arrayList


        // int left = 0


        // int sum = 0


        //List<List<Integer>> tab = new ArrayList<>();

        // int right = 0

        // clone()

        // array = Arrays.sort(nums)


        // for(int i=0;i<nums.length;i++){


        // left = i+1;

        // right = nums.length - 1


        // while(left < right){


        // sum = array[i]+array[left]+array[right];


        // if(sum < 0) {
        
        // left++
        
        // if(sum > 0) right--;


        // if(sum == 0) {
         


         //left++
         //rgiht--
        
        
        
        int left = 0;

        int sum = 0;

        int right = 0;

        int[] sortedArray = nums.clone();


        Arrays.sort(sortedArray);


        List<List<Integer>> tab = new ArrayList<>();
        
        


        if(nums.length < 3) return new ArrayList<>();

        


        if(nums.length == 3 && nums[0]+nums[1]+nums[2] != 0) return new ArrayList<>();

        


        for(int i=0;i<sortedArray.length-1 ; i++){

            if(i>0 && sortedArray[i-1]== sortedArray[i]){


                continue;


                
            }


            




            right = sortedArray.length-1;
            left = i+1;


            while(left < right  ){


                sum = sortedArray[left]+sortedArray[right]+sortedArray[i];


                if(sum < 0){


                    left++;
                }if(sum > 0){


                    right--;
                }if(sum == 0){


                    List<Integer> list = new ArrayList<>();


                    list.add(sortedArray[i]);
                    list.add(sortedArray[left]);
                    list.add(sortedArray[right]);

                    tab.add(list);





                    left++;
                    right--;

                    while(left < sortedArray.length - 1 && sortedArray[left-1] == sortedArray[left]){

                        left++;
                    }

                    while(right > 0 && sortedArray[right+1] == sortedArray[right]){

                        right--;
                    }

                    
                }
            }
        }
        

        return tab;





        



        
        
        }
        
        
        
        }





    


  










        
  
