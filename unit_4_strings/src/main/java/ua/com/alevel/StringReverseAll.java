package ua.com.alevel;

public class StringReverseAll {

    public static String reverse(String src, boolean reverseAll) {

        char[] s = src.toCharArray();
        String rS = "";
        String[] splitSentence = src.split(" ");

        if (reverseAll) {
            for (int i = s.length - 1; i >= 0; i--) {
                rS += s[i];
            }
        } else {
            for (int i = 0; i < splitSentence.length; i++) {
                String splitWord = splitSentence[i];

                String revWord = "";

                for (int j = splitWord.length() - 1; j >= 0; j--) {
                    revWord += splitWord.charAt(j);
                }

                rS = rS + revWord + " ";
            }
        }
        return rS;
    }
}




