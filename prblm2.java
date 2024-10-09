import java.util.*;
public class prblm2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[][] = new int[n][2];
        int result[]=new int[n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.nextInt();
            }
    }
    for (int i=0;i<n;i++){
        result[i]= (a[i][0]*12)+a[i][1];
    }
    int max= result[0];
    for (int i = 1; i <result.length; i++) {
        // If current element is greater than max, update max
        if (result[i] > max) {
            max = result[i];
        }
    }
    System.out.println(max);
}
}
