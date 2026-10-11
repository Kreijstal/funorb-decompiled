/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport079 {
    static String stringState0323;
    static boolean booleanState0098;
    int integerState0420;
    static String stringState0324;
    NodeDeque nodeDequeState0014;
    static RgbSprite rgbSpriteState0030;
    static String stringState0325;
    int integerState0421;
    static long longState0026;

    public static void performAction1050(int integerArgument1) {
        stringState0323 = null;
        stringState0324 = null;
        if (integerArgument1 == -19893) {
          rgbSpriteState0030 = null;
          stringState0325 = null;
          return;
        }
        MixedSupport079.performAction1050(101);
        rgbSpriteState0030 = null;
        stringState0325 = null;
    }

    static int computeInteger1051(int integerArgument1, int integerArgument2) {
        return integerArgument1 & integerArgument2;
    }

    static {
        booleanState0098 = true;
        stringState0323 = "You must play <%1> more rated games before playing with the current options.";
        stringState0324 = "Show chat (1 unread message)";
        stringState0325 = "Inviting <%0>";
    }
}
