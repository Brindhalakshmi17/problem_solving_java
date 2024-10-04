import java.util.Scanner;

public class numbersystem {
    public static void main(String[] args) {/*...*/
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    for(int i = 2; i<=n;i++){
        if (n%i==0){
            count++;
        }
    }
    System.out.println(count);
    }
}
