public class uc6_printOOPS {

    public static void main(String[] args) {

        // Array declaration using method calls
        String[] banner = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds complete line by composing O O P S
    private static String buildLine(int row) {
        return getOPattern(row) + "  "
             + getOPattern(row) + "  "
             + getPPattern(row) + "  "
             + getSPattern(row);
    }

    // Pattern for letter O (7x5)
    private static String getOPattern(int row) {
        switch (row) {
            case 0:
            case 6:
                return String.join(" ", "*","*","*","*","*");
            default:
                return String.join(" ", "*"," "," "," ","*");
        }
    }

    // Pattern for letter P (7x5)
    private static String getPPattern(int row) {
        switch (row) {
            case 0:
            case 3:
                return String.join(" ", "*","*","*","*","*");
            case 1:
            case 2:
                return String.join(" ", "*"," "," "," ","*");
            default:
                return String.join(" ", "*"," "," "," "," ");
        }
    }

    // Pattern for letter S (7x5)
    private static String getSPattern(int row) {
        switch (row) {
            case 0:
            case 3:
            case 6:
                return String.join(" ", "*","*","*","*","*");
            case 1:
            case 2:
                return String.join(" ", "*"," "," "," "," ");
            default:
                return String.join(" ", " "," "," "," ","*");
        }
    }
}