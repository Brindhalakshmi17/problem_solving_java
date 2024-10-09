import java.util.*;
public class hypenstring {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='-'){
                String s1 = str.substring(0,i);
                String s2 = str.substring(i+1);
                str = "-"+s1+s2;
            }

        }
        System.out.println(str);
    }
    
}
