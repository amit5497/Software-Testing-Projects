import java.util.HashMap;

public class Test {
    public static void main(String args[]) {
        /*
        input1: RAVICHANDRAN
input2: ASHWIN
output: RAASVHIWCIHNANDRAN
input1: SACHIN
input2: TENDULKAR
output: STAECNHDIUNLKAR
         */
String input1 ="RAVICHANDRAN";
String input2 ="ASHWIN";
String newString =margeString(input1,input2);
System.out.println(newString);

    }

    private static String margeString(String str1, String str2) {
        String strbud ="";
        int i=0,j=0;
        while(i<str1.length() || j<str2.length()){
            if(i<str1.length()){
                strbud += str1.charAt(i);
                i++;
            }
            if(j<str2.length()){
                strbud += str2.charAt(j);
                j++;
            }
        }
        return strbud;
    }
}
