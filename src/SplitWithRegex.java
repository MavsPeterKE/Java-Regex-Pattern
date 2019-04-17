import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitWithRegex {


    public static final String valueString = "Johntege Ntege Njoge^+255727643752^Johntege Ntege Njoge^BX60685^Unait/Bim 1^2019-08-11^2019-08-16^G021303^^^0^6300.00^::11488^20^630^0^~";


    public static void main(String[] args) {

        //Regex Pattern to extract data groups from the String

        String regexPattern = "(^[\\s\\w]+)\\^(\\+\\d+)\\^([\\s\\w]+)\\^(\\w+)\\^(\\w+\\/\\w+\\s+\\d)\\^(\\d{4}\\-\\d{2}\\-\\d{2})\\^(\\d{4}\\-\\d{2}\\-\\d{2})\\^(\\w+)\\^(\\d{4}|\\w+|\\s|)\\^(\\d{4}|\\w+|\\s|)\\^(\\d+|\\s|)\\^(\\d+\\.\\d{2}|\\s|)\\^";

        //Matcher to check pattern on the String
        Matcher matcher = Pattern.compile(regexPattern).matcher(valueString);

        //Check if there is match on the pattern
        if (matcher.find()) {
            System.out.println("Match Found");
            System.out.println("Data Group 1:  " + matcher.group(1));
            System.out.println("Data Group 2:  " + matcher.group(2));
            System.out.println("Data Group 3:  " + matcher.group(3));
            System.out.println("Data Group 4 " + matcher.group(4));
            System.out.println("Data Group 5  " + matcher.group(5));
            System.out.println("Data Group 6 " + matcher.group(6));
            System.out.println("Data Group 7:  " + matcher.group(7));
            System.out.println("Data Group 8  " + matcher.group(8));
            System.out.println("Data Group 9" + matcher.group(9));
            System.out.println("Data Group 10  " + matcher.group(10));
            System.out.println("Data Group 11 " + matcher.group(11));
            System.out.println("Data Group 12 " + matcher.group(12));
            System.out.println("Group Size Count  " + matcher.groupCount());


        } else {
            System.out.println("No Match Found");
        }
    }
}
