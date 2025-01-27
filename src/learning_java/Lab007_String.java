package learning_java;

public class Lab007_String {
    public static void main(String args[]){

        String str ="madam";
        //checkStringIsPalidrome(str);

        //checkCountOfVowelConsnants(str);
        checkTheNumber();
    }

    private static void checkTheNumber() {
        //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz :"+i);
            else if(i%3==0)
                System.out.println("Fizz :"+i);
            else if(i%5==0)
                System.out.println("Buzz :"+i);
            else
                System.out.println(i);
        }
    }

    private static void checkCountOfVowelConsnants(String str) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants -
        int vowels=0,consnants=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch =='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consnants++;
            }
        }
        System.out.println("vowels - " +vowels +"  consnants -  "+consnants);
    }

    private static void checkStringIsPalidrome(String str) {
        //Palidrome of String (chatAt()) - naman, → reverse - naman , mada
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
            System.out.println("String is Palidrome : " +rev);
        else System.out.println("String is Not Palidrome : " +rev);
    }
}
