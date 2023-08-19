import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression02 {

    public static void main(String[] args) {

        String input1 = "I have 5 apples and 10 oranges.";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input1);

        while(matcher.find()) {
            String number = matcher.group();
            System.out.println("Found number : " + number);
        }

        
    }
    
}
