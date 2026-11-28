/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static RgbSprite field_e;
    static String field_f;
    static RgbSprite[] field_d;
    static FullscreenNoticeType field_b;
    static he field_a;
    static String field_c;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 == 52) {
          field_d = null;
          field_a = null;
          field_e = null;
          field_f = null;
          field_b = null;
          return;
        }
        rk.clearStaticReferences((byte) -12);
        field_d = null;
        field_a = null;
        field_e = null;
        field_f = null;
        field_b = null;
    }

    static {
        field_f = "";
        field_e = null;
        field_b = new FullscreenNoticeType();
        field_c = "Menu";
    }
}
