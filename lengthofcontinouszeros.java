public class lengthofcontinouszeros {
    public static void main(String[] args) {/*...*/
        String str= "101001110001";
        System.out.print(maxcontinouszeros(str));
    }

    public static int maxcontinouszeros(String s) {
        String[] arr=s.split("1");
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>max){
                max=arr[i].length();
            }
        }
        return max;
    
    }
    
}
