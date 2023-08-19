import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression05 {

    public static void main(String[] args) {

        String input = "Visit my website at https://example.com";
        Pattern pattern = Pattern.compile("(https?://[^\\s]+)");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            String url = matcher.group();
            System.out.println("Found URL : " + url);
        }

    }

}
