package learning_java;

public class Lab002_ConditionalStat {
    public static void main(String args[]) {
        int num1 = 1, num2 = 5, num3 = 2,largest,smallest;
        //Largest of 3 number
        if (num1 >= num2 && num1 >= num3) {
            largest=num1;
        } else if (num2>=num1 && num2>=num3) {
            largest=num2;
        }else largest=num3;
        System.out.println("Largest No:" +largest);

        //Smallest of 3 number
        if (num1 <= num2 && num1 <= num3) {
            smallest=num1;
        } else if (num2<=num1 && num2<=num3) {
            smallest=num2;
        }else smallest=num3;
        System.out.println("Smallest No:" +smallest);

        //Print week number based on week name switch case
        int weekNo = 0;
        String weakDay="Monday";
        switch (weakDay){
            case "Monday" : weekNo=1;break;
            case "Tuesday" : weekNo=2;break;
            case "wednesdy" : weekNo=3;break;

        }
        System.out.println("WeekNumber :"+weekNo);

        //
    }
}
