/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends rqa {
    static String field_q;
    static dja field_p;
    static mfb[] field_o;
    static String field_r;

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        field_p = null;
        if (param0 != 0) {
            field_q = null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    ema(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        lcb.field_o = param0[0].a(false);
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Accept draw";
        field_p = (dja) (Object) new wla();
        field_r = "Passwords must be between 5 and 20 characters long";
    }
}
