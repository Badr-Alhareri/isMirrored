import java.util.Scanner;
public class Main {
    public static boolean isMirrored(int num) {
        // write your code here
        String convert_to_string=String.valueOf(num);
        boolean isMirrored=true;
        for (int i = 0; i <convert_to_string.length() ; i++) {
            char c1=convert_to_string.charAt(i);
            char c2=convert_to_string.charAt(convert_to_string.length()-i-1);
            if(c1!=c2) {
                isMirrored = false;
                break;
            }
        }
        if (isMirrored)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(isMirrored(12021));

    }
}























