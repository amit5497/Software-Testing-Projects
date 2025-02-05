package learning_java.lab008_ifelse;

public class Lab008_5febifElse {
    public static void main(String[] args) {
        //For Loop

// 1️⃣ Print numbers from 1 to 10
        for(int i=1;i<=10;i++){
            System.out.print(i+",");
        }
        System.out.println("");
// 2️⃣ Print even numbers from 1 to 20
        for(int i=1;i<=20;i++){
            if(i%2==0)
                System.out.print(i+",");
        }
        System.out.println("");
// 3️⃣ Print "Hello" 5 times
        for(int i=1;i<=5;i++){
            System.out.print("Hello"+",");
        }
        System.out.println("");
// 4️⃣ Print the sum of first 10 natural numbers
        int sum=0;
        for(int i=1;i<=10;i++){
            sum =sum+i;
        }
        System.out.println(" sum of first 10 natural numbers :"+sum);

// While Loop

// 1️⃣ Print numbers from 1 to 10
        int i=1;
        while(i<=10){
            System.out.print(i+",");
            i++;
        }
// 2️⃣ Print even numbers from 1 to 20
        int j=1;
        while(j<=20){
            if(j%2==0)
                System.out.print(j+",");
            j++;
        }
    }
}
