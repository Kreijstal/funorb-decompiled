/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wpa extends rqa {
    static Object field_q;
    static int field_r;
    static String field_o;
    static int field_p;

    wpa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_r = 64;
          return new nc((Object) (Object) frb.a(79, 124));
        } else {
          return new nc((Object) (Object) frb.a(79, 124));
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        field_q = null;
        if (!param0) {
            field_o = null;
        }
    }

    final static String a(int param0) {
        if (dw.field_c == dn.field_r) {
            return bfa.field_p;
        }
        if (!wba.field_p.a(4)) {
            return wba.field_p.b(4);
        }
        if (param0 != 52) {
            wpa.b(true);
            if (!(dw.field_c != lrb.field_b)) {
                return wba.field_p.b(4);
            }
            return qsb.field_d;
        }
        if (!(dw.field_c != lrb.field_b)) {
            return wba.field_p.b(4);
        }
        return qsb.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "More suggestions";
        field_r = 87;
        field_p = 52;
    }
}
