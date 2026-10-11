class Solution {


   public int lengthOfLongestSubstring(String s) {



    // goal is to give the max length of non duplacated and unique contiguos substirng isnide a string



    // int start. = 0

    // int left = s.length - 1

    //int counter = 0

    // Set<Character> tab = new HashSet<>();

    

    // for(int i =0 ; i < s.length ; i++){


// while(!tab.conatinas(s.charAt(i))){
    
    //. tab.add(s.charAt(i))
    
    //}

    // tab.remove(s.charAt(start));

    //start++

    // counter = Math.max(counter,tab.size())
    
    
    
    //}





    int left = 0;

    int right = s.length() - 1;


    int counter = 0;


    Set<Character> tab = new HashSet<>();


   


      for(int i=0; i< s.length();i++){

       


        while(tab.contains(s.charAt(i)) && left<right){

          
          tab.remove(s.charAt(left));
          left++;
        }


        while(!tab.contains(s.charAt(i))){


          tab.add(s.charAt(i));


        }


        counter = Math.max(counter,tab.size());



      
}


return counter;


   }



}
   





          
          

      
      
      



      
      















        
    

