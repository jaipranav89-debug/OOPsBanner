public class OOPSBanner {


    public static void main(String[] args) {
        

        String[] oPattern = getO();
        String[] pPattern = getP();
        String[] sPattern = getS();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
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