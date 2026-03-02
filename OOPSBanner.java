public class OOPSBanner {

    public static void main(String[] args) {

        String[] lines = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static String buildLine(int index) {
        return getO()[index] + "  " +
               getO()[index] + "  " +
               getP()[index] + "  " +
               getS()[index];
    }

    public static String[] getO() {
        return new String[]{
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
    }

    public static String[] getP() {
        return new String[]{
            "******   ",
            "**    ** ",
            "**    ** ",
            "******   ",
            "**       ",
            "**       ",
            "**       "
        };
    }

    public static String[] getS() {
        return new String[]{
            " ******  ",
            "**    ** ",
            "**       ",
            " ******  ",
            "       **",
            "**    ** ",
            " ******  "
        };
    }
}