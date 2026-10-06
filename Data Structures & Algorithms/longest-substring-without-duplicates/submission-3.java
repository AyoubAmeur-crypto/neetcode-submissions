class Solution {


   public int lengthOfLongestSubstring(String s) {


      // gaol to get the longest susbtring that has the longest length 


      // counter = Math.max(counter, i-left+1)

      // left 

      // 

      // while(tab.contains(s.charAt(i))){


       // tab.remove(s.charAt(left))

       // left++



      
      



        
        int counter = 0;

        int left = 0;

        Set<Character> tab = new HashSet<>();


        for(int i=0;i<s.length();i++){


          while(tab.contains(s.charAt(i))){


            tab.remove(s.charAt(left));

            left++;
          }


          tab.add(s.charAt(i));

          counter = Math.max(counter,i-left+1);
        }


        return counter; 
        
        }
}
   





          
          

      
      
      



      
      















        
    

