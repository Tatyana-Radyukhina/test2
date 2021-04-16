import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewLesson2 {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile ("(ab)+");
        Matcher matcher = pattern.matcher (text);
        if (matcher.find()){
            text = matcher.replaceAll("tratata");
            System.out.println(text);
        }

    }
}
