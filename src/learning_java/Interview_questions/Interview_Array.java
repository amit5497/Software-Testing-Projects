package learning_java.Interview_questions;

import java.util.Arrays;
import java.util.HashMap;

public class Interview_Array {
   public static void main(String args[]){
       // Print frequency of number in arrays
       //int[] arr ={1,4,4,1,10,12,1};
       //frequencyForNumber(arr);
       String str ="amkmar";
       frequencyForString(str);
       //secondHight();
       //shorting();
       //printNumberOfChar();
      // input = "ao io aomo" output = a$ i$$ a$$$m$$$$;
       String input="ao io aomo";
      // findAndReplace(input);






   }

    private static void printNumberOfChar() {
        char[] chars ={'a','a','a','a','a','a','a'};
        char[] change ={'a','b','c','d','e','f','g'};
        //System.out.println(chars);
        for(int i=0;i<change.length;i++){
            for(int j=change.length-i-1;j<7;j++){
                chars[j]=change[i];
            }
            System.out.println(chars);
        }
    }

    private static void findAndReplace(String input) {
        StringBuilder bul = new StringBuilder();
        //String output ="";
        int count=1;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='o'){
                for(int j=0;j<count;j++){
                    //output +='$';
                    bul.append('$');
                }
                count++;
            }else{
                bul.append(input.charAt(i));
                //output +=input.charAt(i);
            }
        }
        System.out.println(bul);
    }

    private  static void secondHight(){
       int[] arr = {10, 20, 30, 30, 5, 25};
       int highest = arr[0];    // Initialize with the smallest value
       int secondHighest = arr[1];

       for (int value : arr) {
           if (value > highest) {
               secondHighest = highest;    // Update second-highest
               highest = value;            // Update highest
           } else if (value > secondHighest && value != highest) {
               secondHighest = value;      // Update second-highest only
           }
       }
       System.out.println(secondHighest);
   }

    private static void shorting() {
       int[] arr={10,20,30,30,5,25};
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]<arr[j]){
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));

    }

    static void frequencyForString(String str) {
       char[] ch = str.toCharArray();
       boolean[] visited = new boolean[ch.length];
       int len = ch.length;
       System.out.println(Arrays.toString(ch));
         HashMap<Character,Integer> hm = new HashMap<>();

         for (int i=0;i<len;i++){
             int count =1;
             if(visited[i]) continue;
             for(int j=i+1;j<len;j++){
                 if(ch[i]==ch[j]){

                     visited[j]=true;
                     count++;

                 }
             }
             System.out.println(ch[i]+" frequncy : "+count);
             hm.put(ch[i],count);
         }
         System.out.println(hm);
        System.out.println(hm.keySet() +" "+hm.values());
    }

    private static void frequencyForNumber(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        int arrayLength = arr.length;

        for(int i=0;i<arrayLength;i++){

            if(visited[i]) continue;
            int count =1;
            for(int j=i+1;j<arrayLength;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("Frequency of "+arr[i]+": "+count);



        }
    }
}
