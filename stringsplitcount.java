public class stringsplitcount {
    public static void main(String[] args) {
        String s="bbbbaaaabaaba";
        int l=4;
        System.out.println(countbox(s,l));
        /*...*/}
    public static int countbox(String s,int l) {
        int count=0;
        int max=0;
        for (int i=0;i<s.length()-3;i++) {
          for (int j=i;j<i+l;j++) {
            if (s.charAt(j)=='a') {
                count++;
            }  
          }
          max=Math.max(max,count);
          count=0;
}
return max;

}
}