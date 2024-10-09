public class implementbackspace {
    public static void main(String[] args) {
        /*...*/
        String s="coo#dd##ing#";
        System.out.println(backspace(s));
        String s1="###hello";
        System.out.println(backspace(s1));
    }
    public static String backspace(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=0;
        while(j<ch.length){
            if(ch[j]!='#'){
                ch[i]=ch[j];
                i++;
            }
            else{
                if(i>0){
                    i--;
                }
            }
            j++;
        }
        return String.valueOf(ch).substring(0,i);

    }
    
}
