public class panagramstring {
    public static void main(String[] args) {
        String s = "The quick fox jumps over the lazy dog";
        s=s.toLowerCase();
        boolean result = isPangram(s);
        String s2= "Abcdefghijklmnopqrstuvwxyz";
        System.out.println(result);
        s2=s2.toLowerCase();
        boolean result1 = isPangram(s2);
        System.out.println(result1);
        
    }
    public static boolean isPangram(String s) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!s.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
