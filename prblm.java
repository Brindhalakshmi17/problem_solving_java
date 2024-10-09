import java.util.*;
public class prblm {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count=0;
        if(m<n){
            for (int i=m;i<=n;i++){
                if (isspecific(i)){
                        count++;
            }
            
        }
        System.out.println(count);
    }

}
public static boolean isspecific(int n){
        int r=0;
        while(n>0){
            r = n%10;
            if(r!=1 && r!=4 && r!=9){
                return false;
            
            }
            n=n/10;
        }
        return true;
}
}
