import java.util.Scanner;
public class countgreaterthan {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
    
        System.out.println("count: "+countgreater(arr, n));
    }

    public static int countgreater(int[] arr, int n) {
        int count=0;
        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
    }
    return count;
    }
}
