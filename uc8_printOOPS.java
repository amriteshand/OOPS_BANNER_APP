import java.util.HashMap;
import java.util.Map;

public class uc8_printOOPS {

    // Method to build and return character patterns using HashMap
    public static Map<Character, String[]> getCharacterPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Method to render banner word
    public static void printBanner(String word, Map<Character, String[]> patterns) {
        int height = 5; // each character has 5 rows

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append("  "); // spacing between letters
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patterns = getCharacterPatterns();
        String word = "OOPS";
        printBanner(word, patterns);
    }
}