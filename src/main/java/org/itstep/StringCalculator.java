package org.itstep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringCalculator {
    public static int add(String s) throws SpliterFormatException {
       // if(s == null || "".equals(s)) {
       //     return 0;
       // }


        /*s=s.replaceAll("\\D+", " ");
        String t[] = s.split(" ");

        for (int i=0; i < t.length; i++){
            if(Integer.parseInt(t[i])>1000){}
            else{
            sum+=Integer.parseInt(t[i]);}
        }*/
        //return sum;

        if(s==null ||s.equals("")){return 0;}
        String[] nums;
        if(s.startsWith("//"))
        {
            String[] parts=s.split("\n");
            String[] delimiters= getDelimiters(parts[0].substring(2).trim());
            String divider = null;
            if(delimiters.length<=1) {

                //}
                divider = parts[0].substring(2).trim();
                divider = divider.replace("[", "")
                        .replace("]", "")
                        .replace("*", "\\D");

                if (!divider.contains("\\D") && !parts[1].contains(divider)) {
                    throw new SpliterFormatException("Разделитель не корректный");
                }
                for (char sym : divider.toCharArray()) {
                    if (Character.isDigit(sym)) {
                        throw new SpliterFormatException("Разделитель не корректный");
                    }
                }
            }else {
                divider=makeDivider(delimiters);
            }
            nums= parts[1].replace(" ","").split(divider);
        } else {
            nums=s.split(",|\n");
        }

        int sum=0;
        for(String n:nums){
                int num = Integer.parseInt(n.trim());
                if (num > 1000) continue;
                sum += num;

        }
        return  sum;
    }
      public static String[] getDelimiters(String input){
        String[] delimeters = new String[0];
       int start = -1,end;
       while ((start= input.indexOf("[",start+1))>=0){
           end=input.indexOf("]",start+1);
       delimeters= Arrays.copyOf(delimeters,delimeters.length+1);
       delimeters[delimeters.length-1]=input.substring(start+1,end);
       }
       return  delimeters;
}

    public static String makeDivider(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String d: strings)
        {
            sb.append("(").append(d.replace("*","\\*").replace("|","\\|"))
                    .append(")")
            .append("|");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
