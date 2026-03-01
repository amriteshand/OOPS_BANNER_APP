/**
 * UC7 - OOPS Banner App
 * Stores Character Pattern using Inner Static Class
 */
public class uc7_printOOPS {

    /**
     * Inner Static Class to encapsulate character and its banner pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * 
         * @param character character value
         * @param pattern 7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // Pattern for O
    private static String[] buildOPattern() {
        return new String[]{
            String.join(" ", "*","*","*","*","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*","*","*","*","*")
        };
    }

    // Pattern for P
    private static String[] buildPPattern() {
        return new String[]{
            String.join(" ", "*","*","*","*","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*"," "," "," ","*"),
            String.join(" ", "*","*","*","*","*"),
            String.join(" ", "*"," "," "," "," "),
            String.join(" ", "*"," "," "," "," "),
            String.join(" ", "*"," "," "," "," ")
        };
    }

    // Pattern for S
    private static String[] buildSPattern() {
        return new String[]{
            String.join(" ", "*","*","*","*","*"),
            String.join(" ", "*"," "," "," "," "),
            String.join(" ", "*"," "," "," "," "),
            String.join(" ", "*","*","*","*","*"),
            String.join(" ", " "," "," "," ","*"),
            String.join(" ", " "," "," "," ","*"),
            String.join(" ", "*","*","*","*","*")
        };
    }

    public static void main(String[] args) {

        // Array of objects (O O P S)
        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', buildOPattern()),
            new CharacterPatternMap('O', buildOPattern()),
            new CharacterPatternMap('P', buildPPattern()),
            new CharacterPatternMap('S', buildSPattern())
        };

        // Print banner
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap cp : patterns) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line.toString().trim());
        }
    }
}