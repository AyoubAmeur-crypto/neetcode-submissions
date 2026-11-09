class Solution {


   public int lengthOfLongestSubstring(String s) {



    // goal : return the longuest substring without reapeating character

    // recognetion : sliding window pattern o(n*k) -> o(n)


    // steps :

    // maxLenght = 0


    // left = 0

    // HashSet of charcters

    // for loop


    // condition using the hashset if carachter already there ?

    // left ++ , maxLength = Math.max(..,i-right+1)


    // return maxlength



    int left = 0;

    int maxLength=0;

    Set<Character> set = new HashSet<>();


    for(int i=0; i< s.length();i++){


        while(set.contains(s.charAt(i))){
            set.remove(s.charAt(left));
            
            

            left++;
            
            

        }

        set.add(s.charAt(i));
        maxLength = Math.max(maxLength,i-left+1);
    }



    return maxLength;




 








   


   }



}
   





          
          

      
      
      



      
      















        
    

