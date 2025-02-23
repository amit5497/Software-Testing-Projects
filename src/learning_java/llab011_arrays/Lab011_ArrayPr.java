package learning_java.llab011_arrays;

import java.util.Arrays;
import java.util.Stack;

public class Lab011_ArrayPr {
    public static void main(String args[]){
        int[] num = {12, 34, 10, 1, 100, 3, 4, 32};
        int len=num.length;
        for(int i=0;i<len;i++){

            for(int j=1+i;j<len;j++){
                if(num[i]>num[j]){
                    int temp =num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));

        //Second smallest number  in any array
        int[] arr = {12, 34, 10, 1, 100, 3, 4, 35};
        int firstNum =arr[0];
        int secondNum = 0;
        int leng =arr.length;
        for(int value : arr){
                if(firstNum<value){
                    secondNum=firstNum;
                    firstNum=value;
                }
                else if(value>secondNum && firstNum != value){
                    secondNum=value;
                }
        }

        System.out.println(secondNum);

        //Left Triangle Star Pattern
        /*
        for(int i=0;i<6;i++){

            for(int j=0;j<6-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        } */
        //Right-Angled Triangle
        for(int i=0;i<5;i++){

            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //13. Inverted Right-Angled Triangle.
        for(int i=0;i<5;i++){

            for(int j =0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        //Pyramid Pattern
        for(int i=1;i<=5;i++){
            for(int k=i;k<5;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=(i*2 -1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        String input ="[{()}]";
        if(checkStringIsValid(input)){
            System.out.println(" String is valid ");
        }else {
            System.out.println(" String is Not valid ");
        }

    }

    private static boolean checkStringIsValid(String input) {

        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else if (ch ==')' || ch =='}' || ch ==']') {
                if(stack.isEmpty()){
                    return false;
                }
                char sta = stack.pop();
                if(ch==')' && sta != '(' ||
                        ch=='}' && sta != '{' ||
                        ch==']' && sta != '['){
                    return false;
                }
            }

        }


        return stack.isEmpty();

    }

}
