public class hillornot {
    public static void main(String[] args) {/*...*/
        int A[]=new int[]{15,15};
        boolean hill= isHill(2,A);
        System.out.println(hill);
    }
    public static boolean isHill(int n, int[] arr) {
        int i = 0;
    
        // Ascending part
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        //flat part
        while (i < n - 1 && arr[i] == arr[i + 1]) {
            i++;
        }
    
        // Descending or plateau part
        while (i < n - 1 && arr[i] >= arr[i + 1]) {
            i++;
        }
    
        // The array forms a valid hill if we reached the end
        return i == n - 1;
    }
    

    }
    
