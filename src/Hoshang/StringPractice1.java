package Hoshang;

public class StringPractice1 {
    public static void main(String[] args) {

        String str = "abfcabd";

        String result = "";

        for (int j=0; j<str.length(); j++) {
            char firstIndex = str.charAt(j);
            int counter = 0;
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == firstIndex) {
                    counter++;
                }
            }
            if (counter == 1) {
                result += firstIndex;
            }
        }

        System.out.println(result);





    }
}
