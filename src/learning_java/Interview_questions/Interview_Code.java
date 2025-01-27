package learning_java.Interview_questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Interview_Code {
    public static void main (String args[]){
        //Reverse a number
        int number = 20;
        int rev = 0;
        while(number>0){
            int rem = number%10;
            rev = 10*rev +rem;
            number=number/10;
        }
        System.out.println(rev);

        int a[]= {10,20,30,60};
        int num= 200;
        for (int x:a) {
            if (num == x) {
                System.out.println(x);
                break;
            }
        }

        int[] reverse = new int[a.length];
        for(int i =0;i<a.length;i++){
            reverse[i] =  a[a.length -1 -i];
        }
        System.out.println(Arrays.toString(reverse));

        int arr[] ={10,50,10,20,30,60};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

        String s = "AMIT";
        //output =TIMA
        String Srev ="";
        for(int i=s.length()-1;i>=0;i--){
            Srev += s.charAt(i);
        }
        System.out.println(Srev);

        String IntPut="India is My Country";
        //output = aidnI si yM yrtnuoC
        String var="";
        var = rev( IntPut.substring(0,5))+" "+rev( IntPut.substring(6,8))+" "+rev( IntPut.substring(9,11))+" "+rev( IntPut.substring(12,19));
        System.out.println(var);

        //Output = Kumar itAm
        String InPut1="Amit Kumar";

        String NewArr[] =InPut1.split(" ");
        String RevOpt = NewArr[1]+" "+NewArr[0].substring(2,4)+NewArr[0].substring(0,2);
        System.out.println(RevOpt);
    }

    public static String rev(String substring) {
        String rev="";
        for(int i=substring.length()-1;i>=0;i--){
            rev +=substring.charAt(i);

        }
        return rev;


    }

}
