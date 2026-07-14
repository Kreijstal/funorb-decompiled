/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pua extends rqa {
    static int field_p;
    static String field_o;

    public static void a(int param0) {
        field_o = null;
        if (param0 != 80) {
            field_p = -59;
        }
    }

    pua(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) frb.a(80, 89));
        } else {
          return new nc((Object) (Object) frb.a(80, 89));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        vna discarded$0 = new vna();
        field_o = "The '<%0>' setting needs to be changed.";
    }
}
