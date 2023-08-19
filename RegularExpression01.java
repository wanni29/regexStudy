import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression01 {

    public static void main(String[] args) {
        String text = "Hello, my email is wanni@wakanda.com";
        String pattern = "\\w+@\\w+\\.\\w+";

        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(text);

        while(matcher.find()) {
            System.out.println("Found : " + matcher.group());
        }
    }

}
