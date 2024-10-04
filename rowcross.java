import java.util.Scanner;

public class rowcross {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of rows
        int arr[][] = new int[n][2];  // Array with n rows and 2 columns
        int num = 1;  // Initialize the number
        
        
        // Fill the 2D array in snake pattern
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // For even-indexed rows (left to right)
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = num++;
                }
            } else {
                // For odd-indexed rows (right to left)
                for (int j = 1; j >= 0; j--) {
                    arr[i][j] = num++;
                }
            }
        }
        
        // Print the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
