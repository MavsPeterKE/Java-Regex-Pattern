import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitWithRegex {
    /**
     * String with Patterns which we intend to extract
     */
    public static final String QR_STRING = "Charles Mwangi^+254700581532^+254711224455^SO2618933^Tatu/Warehouse^2019-04-08 00:00:00^2019-04-10^MG2147936^0000^0^0^0.00^::4316^1^29^~4225^1^105^~3547^1^119^~3521^1^93^~2469^2^210^~1837^1^100^~889^1^27^~846^1^194^~685^1^95^~290^1^44^~4516^1^0^~::3521,3547,1837,4225,889,4316,846,290,685,2469,4516^";
    public static final String QR_STRING2 = "Francis Chege Njoroge^+254727643752^Francis Chege Njoroge^SO606855^Magana/Muranga 1^2017-08-11^2017-08-16^MG0213030^^^0^6300.00^::11488^20^630^0^~";

    public static String[] matchCasesArray = {"SINGLE CHARACTER MATCHING", "", "", ""};

    public static void main(String[] args) {
        /**
         * $ - matchesif appears at the end of the line
         * ^- Matches If Appears at the beginning of the Libe
         * [^ ] matches any characters but the ones listed
         * . Matches any Single Character
         */
        String uptoWarehouseRegex = "(^[\\s\\w]+)\\^(\\+\\d+)\\^([\\s\\w]+)\\^(\\w+)\\^(\\w+\\/\\w+\\s+\\d)\\^(\\d{4}\\-\\d{2}\\-\\d{2})\\^(\\d{4}\\-\\d{2}\\-\\d{2})\\^(\\w+)\\^(\\d{4}|\\w+|\\s|)\\^(\\d{4}|\\w+|\\s|)\\^(\\d+|\\s|)\\^(\\d+\\.\\d{2}|\\s|)\\^";
        Matcher matcher = Pattern.compile(uptoWarehouseRegex).matcher(QR_STRING2);

        //\^(\d{4}\-\d{2}\-\d{2})\^
        if (matcher.find()) {
            System.out.println("Match Found");
            System.out.println("Agent Name:  " + matcher.group(1));
            System.out.println("Agent Phone:  " + matcher.group(2));
            System.out.println("Customer Name:  " + matcher.group(3));
            System.out.println("Order No:  " + matcher.group(4));
            System.out.println("Warehouse:  " + matcher.group(5));
            System.out.println("Order Date:  " + matcher.group(6));
            System.out.println("Delivery Date:  " + matcher.group(7));
            System.out.println("ReceiptNO:  " + matcher.group(8));
            System.out.println("Pin:  " + matcher.group(9));
            System.out.println("Credit Days  " + matcher.group(10));
            System.out.println("Copia Pesa  " + matcher.group(11));
            System.out.println("Prepayment  " + matcher.group(12));
            System.out.println("Group Count  " + matcher.groupCount());
            /*System.out.println("Fist Item:  " + matcher.group(6));
            System.out.println("Fist Item:  " + matcher.group(7));
            System.out.println("Fist Item:  " + matcher.group(8));*/

        } else {
            System.out.println("No Match Found");
        }
    }
}
