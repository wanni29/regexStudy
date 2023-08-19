import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression04 {

    public static void main(String[] args) {
        String input = "wanni30@example.com";
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(input);

        
        if (matcher.matches()) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }

    }

}
