/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static rm field_i;
    static String field_c;
    static int field_d;
    static String field_f;
    static int[] field_a;
    static RgbSprite field_h;
    static String[] field_b;
    static String field_e;
    static String field_g;

    final static int sine16(int angle, int halfTurnBoundary) {
        angle = angle & 8191;
        if (halfTurnBoundary > angle) {
          return angle >= 2048 ? hk.quarterSine16[4096 - angle] : hk.quarterSine16[angle];
        }
        return angle >= 6144 ? -hk.quarterSine16[-angle + 8192] : -hk.quarterSine16[angle - 4096];
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_g = null;
        field_a = null;
        field_b = null;
        if (param0 != 30706) {
          jh.a(49);
        }
    }

    static {
        int var0 = 0;
        field_c = "Password: ";
        field_d = 4;
        field_f = "Only show lobby chat from my friends";
        field_a = new int[20];
        for (var0 = 0; field_a.length > var0; var0++) {
          field_a[var0] = 1200;
        }
        field_g = "Set up new unrated game";
        field_e = "You cannot join this game - it is in progress";
    }
}
