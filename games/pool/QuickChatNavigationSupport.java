/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatNavigationSupport {
    static UiComponent field_d;
    static IntrusiveDeque field_c;
    static String tooltipBallInHand;
    static String gameoptPlayerneedsrating;
    static int field_g;
    static UiComponent field_f;
    static String[] field_e;
    static String playerYouFirstListHaveWon;

    final static void restoreQuickChatMenu(byte param0) {
        int var1 = -75 / ((-64 - param0) / 62);
        CueStick.a(120, GrowableIntListFactory.field_b);
    }

    public static void releaseStatics(boolean param0) {
        playerYouFirstListHaveWon = null;
        tooltipBallInHand = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0) {
          return;
        }
        gameoptPlayerneedsrating = null;
    }

    static {
        gameoptPlayerneedsrating = "<%0> would need a rating of <%1> to play with the current options.";
        tooltipBallInHand = "Ball-in-hand";
        field_g = 0;
        playerYouFirstListHaveWon = "You<%0> have won!";
    }
}
