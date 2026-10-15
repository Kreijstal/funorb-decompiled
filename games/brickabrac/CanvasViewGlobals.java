/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasViewGlobals {
    static int serviceHeaderByte;
    static String field_b;
    static String field_f;
    static int field_d;
    static String field_e;
    static RgbSprite chocolateSmallFarSprite;
    static int field_a;
    private static String field_z;

    public static void a(int param0) {
        chocolateSmallFarSprite = null;
        field_e = null;
        field_b = null;
        if (param0 != 2) {
          field_b = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_z = "u.A(";
        field_b = "This game has been updated! Please reload this page.";
        field_f = "to return to the normal view.";
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = 2;
    }
}
