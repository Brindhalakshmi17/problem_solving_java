public class xorBinarystring {
    public static void main(String[] args) {
        String s1 = "101010";
        String s2 = "101";
        int n1= s1.length();
        int n2= s2.length();
        if (n1!=n2){
            if (n1<n2){
                for (int i=0;i<n2-n1;i++){
                    s1 = "0"+s1;
                }
            }
            else{
                for (int i=0;i<n1-n2;i++){
                    s2 = "0"+s2;
                }
            }
        }
        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        String ans = "";
        for (int i=0;i<c1.length;i++){
            if (c1[i]==c2[i]){
                ans = ans+"0";
            }
            else{
                ans = ans+"1";
            }
        }
        System.out.println(ans);
    }
    
}
/** # reduced time complexity :  O(n)
 * public class XorBinaryString {
    public static void main(String[] args) {
        String s1 = "101010";
        String s2 = "101";
        int n1 = s1.length();
        int n2 = s2.length();
        // Padding the shorter string with leading zeros
        if (n1 != n2) {
            if (n1 < n2) {
                // Add leading zeros to s1
                s1 = "0".repeat(n2 - n1) + s1;
            } else {
                // Add leading zeros to s2
                s2 = "0".repeat(n1 - n2) + s2;
            }
        }
        // Convert strings to character arrays
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        StringBuilder ans = new StringBuilder();
        // XOR operation
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] == c2[i]) {
                ans.append("0");
            } else {
                ans.append("1");
            }
        }
        // Output the result
        System.out.println(ans.toString());
    }
}

 */