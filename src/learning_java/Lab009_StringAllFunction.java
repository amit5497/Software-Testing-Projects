package learning_java;

import java.util.Arrays;

public class Lab009_StringAllFunction {
    public static void main(String args[]){
        String str = "Amit";
        String name = new String("Amit"); // Object
        System.out.println(str==name); // false beacuse be cont compare String variable with object
        System.out.println(str.equalsIgnoreCase(name));

        // charAt();
        System.out.println(str.charAt(2)); //output = i
        //  concat()
        System.out.println(str.concat(" Kumar"));
        // contains()
        System.out.println(str.contains("Amit")); // true
        //indexOf()
        System.out.println(str.indexOf('m')); // 1
        //replace
        System.out.println(str.replace('m','M'));
        //length()
        System.out.println(str.length());

        String str1 ="Amit Kumar";
        //split()
        String[] str2= str1.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println(str1.split(" ")[1]); // Kumar
        //substring
        System.out.println(str.substring(1,4));// Amit 0,3 == output =mit
        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Amit");
        System.out.println(stringBuilder);


        StringBuilder sb = new StringBuilder("Ku");
        sb.append("Mar");
        System.out.println(sb.toString());


    }
}
