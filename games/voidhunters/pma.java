/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pma extends rqa {
    static String field_q;
    static String field_p;
    static int field_o;

    pma(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(148, 62, param0[0].a(94));
        if (param1 >= -119) {
          return null;
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    public static void e(byte param0) {
        int var1 = -98 % ((param0 - -24) / 63);
        field_p = null;
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Open in popup window";
        field_p = "Hull diamond";
    }
}
