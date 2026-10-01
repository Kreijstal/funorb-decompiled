/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String tutorialCompleteMessage;
    static ba field_a;
    static int field_c;
    private static String field_z;

    public static void a(boolean param0) {
        if (param0) {
            tutorialCompleteMessage = (String) null;
            field_a = null;
            tutorialCompleteMessage = null;
            return;
        }
        field_a = null;
        tutorialCompleteMessage = null;
    }

    static {
        field_z = "li.A(";
        tutorialCompleteMessage = "You clearly have a knack for this! It's time for the real deal. Remember: try to prevent the geoblox from reaching the edge of the rotating play area, but don't panic - relax and enjoy the game!<br>If you want to learn more about bonuses, special geoblox, or how to make geoblox fall faster, go to the Instructions page, found on the pause menu (press <img=4> to pause). Press <img=2> to continue.";
        field_c = 64;
    }
}
