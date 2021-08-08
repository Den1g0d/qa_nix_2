package ua.com.alevel;

public class StringReverseByIndex {

    String reverse(String src, int firstIndex, int lastIndex) {

        String rS = "";
        String nS = "";

        String iString = src.substring(firstIndex, lastIndex + 1);
        String[] splitSentence = iString.split(" ");

        for (int i = 0; i < splitSentence.length; i++) {
            String splitWord = splitSentence[i];
            String revWord = "";

            for (int j = splitWord.length() - 1; j >= 0; j--) {
                revWord += splitWord.charAt(j);
            }

            rS = rS + revWord + " ";
            String rsTrim = (rS == null || rS.length() == 0) ? null : (rS.substring(0, rS.length() - 1));
            nS = src.replace(iString, rsTrim);

        }
        return nS;
    }
}
