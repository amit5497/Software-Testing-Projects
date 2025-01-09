package learning_java;

public class Lab003_LoopingStat {
    public static void main(String args[]){
        int number=1221,reverseNumber=0,count=0;
        int temp =number;
        // Reverse a number
        while(temp !=0){
            int reminder = temp%10;
            reverseNumber = reverseNumber*10+reminder;
            temp=temp/10;
        }
        System.out.println("Reverse Number: "+reverseNumber);

        //Palindrome Number
        if (number==reverseNumber){
            System.out.println("Number Is Palindrome: "+reverseNumber +"  "+number);
        } else System.out.println("Number Is Not Palindrome:: "+reverseNumber +"  "+number);

        //count the number of digits in number
        while(number != 0){
            count++;
            number=number/10;
        }
        System.out.println("Total digits in Number are : " +count);

        //count even & odd digits in a Number
        int evenCount=0,oddCount=0;

        int value = 123456;
        while (value != 0){
            int rem =value%10;
            value=value/10;
            if (rem%2 ==0 ){
                evenCount++;
            } else oddCount++;
        }
        System.out.println("Digits of Even Count :"+evenCount +"\nDigits of Odd Counts: " +oddCount);
    }
}
