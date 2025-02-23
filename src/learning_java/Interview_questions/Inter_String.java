package learning_java.Interview_questions;

public class Inter_String {
    public static void main(String[] args) {

        String str = " aa bb c ";
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        // Reverse the characters while keeping spaces in place
        while (left < right) {
            // Skip spaces from the left
            while (left < right && chars[left] == ' ') {
                System.out.println("A"+left);
                left++;
            }
            // Skip spaces from the right
            while (left < right && chars[right] == ' ') {
                System.out.println("b"+right);
                right--;
            }
            // Swap characters
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
                System.out.println("c"+right+left);
            }
        }
        System.out.println(chars);


    }
}
