class Solution {
    public boolean isValid(String s) {


         // goal return true if the all the chars inisde the s if we have '(',')'

         // false


         // steps

         // Stack


         // for(int i=0;i<s.length();i++){

         // if(s.charAt(i) == '(' || a.charAt(i) == '{' || s.charAt(i) == '['){


         //stack.push(s.charAt(i))
         
         
         //}
         //else{

         // top = s.pop()

         //if( (s.charAt(i) == ')' && top != '(')) // return false;
         
         
         //}



         
         
         //}



         Stack<Character> stack = new Stack<>();

         for(int i=0;i<s.length();i++){


            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){

                stack.push(s.charAt(i));
            }else{

                // } ] )

                if(stack.isEmpty()){

                    return false;
                }

                Character top = stack.pop();


                if((top == '(' && s.charAt(i) != ')') || (top == '{' && s.charAt(i) != '}') || (top == '[' && s.charAt(i) != ']') ) return false;
            }
         } 

         return stack.isEmpty();

        
        
    }
}
