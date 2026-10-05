class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

// extract the maximum dsitinct element from the list that theri sum = 0

// length less than 3 return new arraylist<>()

// length == 3 and sum !=0 return new arraylist<>()

// int[] array = nums.clone()

// Array.sort(array)


// int left = 0
// int right  = 0

// int sum = 0

// for loop 

// left = i+1
// right = array.length - 1

// while(left < right ){

// sum > 0 right--;

// sum < 0 left ++;

// sum ==0 right-- left++


if(nums.length < 3) return new ArrayList<>();


if(nums.length == 3 && nums[0]+nums[1]+nums[2] != 0) return new ArrayList<>();



int left = 0;

int right = 0;

int sum = 0;


int[] tab = nums.clone();

List<List<Integer>> result = new ArrayList<>();


Arrays.sort(tab);


for(int i=0;i<tab.length-1;i++){


    if(i>0 && tab[i-1] == tab[i]){

        continue;
    }

    left = i+1;

    right = tab.length-1;

    while(left<right){


          sum = tab[i]+tab[left]+tab[right];

    if(sum > 0) {

        right--;
    }
    if(sum < 0){

        left ++;
    }
    if(sum == 0){

        List<Integer> list = new ArrayList<>();

        list.add(tab[i]);
        list.add(tab[left]);
        list.add(tab[right]);

        result.add(list);



        left++;
        right--;

        while(tab[right+1] == tab[right] && left < right){

            right--;
        }

        while(tab[left-1] == tab[left] && left < right){

            left++;
        }

    }



    }


  
}


return result;






        
        
    }
}
