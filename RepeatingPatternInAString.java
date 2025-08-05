import java.util.HashMap;
import java.util.Map;

public class RepeatingPatternInAString {
    public static void main(String[] args) {
        String str = "abcabcabc";

        Map<String, String> mp = new HashMap<>();

        for (int i = 1; i < str.length() / 2; i++) {
            String sub = str.substring(0, i);
            for (int j = 0; j < str.length(); j++) {

            }
        }
    }
}
