public class ReverseWords {

    public static String reverseWords(String str) {

        String[] words = str.split(" "); // used split method
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                result = result + words[i];
            } else {
                result = result + words[i] + " ";
            }
        }
        return result;
    }

    public static void main(String args[]) {
        String str = "Hello World";
        System.out.print(reverseWords(str));
    }
}