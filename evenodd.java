import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even=0;
        int odd=0;
        int r=0;
        while(num>0){
            r = num%10;
        if(r%2==0){
            even+=r;
        }else{
            odd+=r;
        }
        num=num/10;
        }
        if (even>odd){
        System.out.println(even);
        }else{
        System.out.println(odd);
        }
    }
    
}
