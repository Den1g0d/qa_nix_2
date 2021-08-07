package ua.com.alevel;

public class SampleReverse {

    public static String reverse(String src, String dest) {

        String rS = "";

        if (src.contains(dest) && (dest.length() > 1)) {
            char[] s = dest.toCharArray();
            for (int i = s.length - 1; i >= 0; i--) {
                rS += s[i];
            }
            String nS = src.replace(dest, rS);
            return nS;
        } else {
            return ("No exact matches found or one character entered");
        }

    }
}
