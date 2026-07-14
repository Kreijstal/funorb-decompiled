/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class urb extends rqa {
    static String field_p;
    static qca field_o;

    urb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    final nc a(nc[] param0, int param1) {
        wda.field_q = param0[0].a(124);
        if (param1 > -119) {
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
        field_p = "Railed sniper cannon";
    }
}
