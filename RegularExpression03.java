import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression03 {
 public static void main(String[] args) {

        // 분석하고자 하는 데이터
        String input2 = "Hello World 123";

        // 어떤 패턴을 분석할지 기준 잡는거
        Pattern pattern = Pattern.compile("[a-zA-Z]+"); 

        // 데이터와 패턴을 매칭시키는것
        Matcher matcher = pattern.matcher(input2);

        // 만약에 여기서
        // Pattern pattern  = Pattern.compile("[a-zA-Z]+");
        // 이 구문에 대하여 + 를 빼게 되면
        // 글자 결과는 한글자씩만 출력을 하게 된다.
        // 그룹을 만들지 않는다는 의미임

        while(matcher.find()) {
            String word = matcher.group();
            System.out.println("Found word : " + word);
            
        }
        
    
 }   
}
