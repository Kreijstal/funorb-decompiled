/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fmb extends rqa {
    static String field_p;
    static int[] field_o;
    static String field_q;
    static int field_r;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ah.field_o[3] = param3;
        if (param0 < 2) {
          return;
        } else {
          ah.field_o[0] = param2;
          ah.field_o[2] = param1;
          ah.field_o[1] = param4;
          return;
        }
    }

    fmb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 0) {
            fmb.a(36, 75, 97, 14, 66);
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(161, 103));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Mass driver";
        field_p = "Your game";
        field_r = 0;
    }
}
