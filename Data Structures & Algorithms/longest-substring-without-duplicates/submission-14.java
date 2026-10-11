class Solution {


   public int lengthOfLongestSubstring(String s) {



    // goal : to get the longuest substirng with no duplicates charcter inside the string s 



    // steps

    // left =0

    // 


    int left =0;

    int length =0;

    Set<Character> tab = new HashSet<>();


    for(int i=0;i<s.length();i++){


      while(tab.contains(s.charAt(i))){

        tab.remove(s.charAt(left));

        left++;

        
      }


      tab.add(s.charAt(i));


      length = Math.max(length,tab.size());





    }

    return length;









   


   }



}
   





          
          

      
      
      



      
      















        
    

