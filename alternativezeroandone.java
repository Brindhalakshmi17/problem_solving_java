public class alternativezeroandone {
    public static void main(String[] args) {
        String s= "110";
        System.out.println(isspecific(s));
        
    
    }
    
    public static boolean isspecific(String s) {
       int zeros=0;
       int ones=0;
       char arr[]=s.toCharArray();
       for(int i=0;i<s.length();i++){
          if(arr[i]=='0'){
              zeros++;
          }
         else{
                  ones++;
              }
          }
          if(Math.abs(zeros-ones)>=2){
              return false;
          }
          else{
              return true;
           }
       }
    }

