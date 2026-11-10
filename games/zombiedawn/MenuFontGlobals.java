/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuFontGlobals {
    static String field_b;
    static String field_a;
    static int field_c;
    static String field_f;
    static Font field_e;
    static Sprite[] field_d;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 != 25268) {
          return;
        }
        field_b = null;
    }

    final static int getMouseIdleTicks(byte param0) {
        if (param0 < 58) {
          MenuFontGlobals.getMouseIdleTicks((byte) 26);
          return MinigunGunner.field_Ob;
        }
        return MinigunGunner.field_Ob;
    }

    static {
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_f = "This game has been updated! Please reload this page.";
    }
}
