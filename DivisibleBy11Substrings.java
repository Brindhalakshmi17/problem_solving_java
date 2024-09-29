public class DivisibleBy11Substrings {

    public static int countDivisibleBy11(String num) {
        int count = 0;  // Counter for substrings divisible by 11
        
        // Iterate over all possible start positions
        for (int i = 0; i < num.length(); i++) {
            
            // Iterate over all possible end positions starting from the current start
            for (int j = 1; j <= num.length()-i; j++) {
                // Generate the substring by progressively appending digits
                String fragment = num.substring(i, i + j);

                // Convert the substring to a number
                int currentNumber = Integer.parseInt(fragment);
                
                // Check if the current number is divisible by 11
                if (currentNumber % 11 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String num = "55";
        int result = countDivisibleBy11(num);
        System.out.println("Count of contiguous substrings divisible by 11: " + result);
    }
}
