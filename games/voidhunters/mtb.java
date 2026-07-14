/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mtb extends rqa {
    static int field_o;
    static String field_q;
    static int field_p;

    mtb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static ngb a(int param0, int param1, asb param2, int param3, asb param4) {
        if (param0 == 320) {
          if (!pa.a(param3, 2, param4, param1)) {
            return null;
          } else {
            return lpb.a((byte) 19, param2.a(param3, param1, (byte) 13));
          }
        } else {
          return null;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = -10;
          return new nc((Object) (Object) frb.a(64, 101));
        } else {
          return new nc((Object) (Object) frb.a(64, 101));
        }
    }

    public static void e(byte param0) {
        if (param0 > -37) {
            field_p = -2;
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Unfortunately you are not eligible to create an account.";
        field_o = 320;
    }
}
