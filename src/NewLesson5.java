import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewLesson5 {
    public static void main(String[] args) {
        String text = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern = Pattern.compile ("[a-zA-Z]");
        Matcher matcher = pattern.matcher (text);
        if (matcher.find()){
            text = matcher.replaceAll("tratata ");
            System.out.println(text);
            System.out.println(text);


            System.out.println("Проверка2");

        }

    }
}

