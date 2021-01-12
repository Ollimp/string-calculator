package org.itstep;

public class StringUtils {

    public static final char SPACE = ' ';

    public static int countSpaces(CharSequence input) {
        String str = input.toString();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == SPACE) {
                count++;
            }
        }
        return count;
    }
}
