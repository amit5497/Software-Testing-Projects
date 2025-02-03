package learning_java.lab008_ifelse;

public class Lab008_29ifElse {

    public static void main(String args[]){

//        1) Check if a Number is Positive or Negative.
                int num = 21;
                if(num>0){
                    System.out.println("Number is Positive: "+num);
                }else
                    System.out.println("Number is Negative: "+num);
//        2)Check if a Number is Even or Odd.
                if(num%2==0)
                    System.out.println("Number is Even : "+num);
                else
                    System.out.println("Number is Odd: "+num);
//        3) Find the Maximum of Two Numbers.
                int num1=15,num2=20;
                if(num1>num2)
                    System.out.println("Small Number : "+num1);
                else
                    System.out.println("big Number : "+num2);

//        4) Check if a Character is a Vowel or Consonant.
                char ch ='s';
                if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
                    System.out.println("Character is a Vowel: "+ch);
                else
                    System.out.println("Character is a Consonant: "+ch);
//        5) Check if a Person is Eligible to Vote (Age Check).
                int age =18;
                if(age>17)
                    System.out.println("Person is Eligible to Vote: "+age);
                else
                    System.out.println("Person is Not Eligible to Vote: "+age);


    }
}
