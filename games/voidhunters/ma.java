/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends rqa {
    static String field_o;

    ma(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != -17548) {
            ma.a(-66);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(155, 62, param0[0].a(21));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Unable to add name - system busy";
    }
}
