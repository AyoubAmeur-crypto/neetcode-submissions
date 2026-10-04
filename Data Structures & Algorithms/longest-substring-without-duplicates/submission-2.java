class Solution {
    public int lengthOfLongestSubstring(String s) {



     /// goal : get the longest substring from s qithout duplicating and return it's length


     /// steps 

     /// left index

     /// maxength



     /// hashset

     /// loop over the legnth of the string 


     //// while hashset conatains a exisiting char

     /// left ++ , calculat maxLenght = Math.max(maxLength,i-left+1)




     int left = 0;

     int maxLength=0;


     Set<Character> words = new HashSet<>();


     for(int i=0;i<s.length();i++){


        while(words.contains(s.charAt(i))){

            words.remove(s.charAt(left));


            left+=1;

        }


        words.add(s.charAt(i));

        maxLength = Math.max(maxLength,i-left+1);
     }



     return maxLength;

  



    
       








        
    }
}
