/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fhb extends rqa {
    static llb field_q;
    static String field_o;
    static boolean field_p;

    public static void a(int param0) {
        if (param0 > -16) {
            fhb.a(-80);
            field_o = null;
            field_q = null;
            return;
        }
        field_o = null;
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((fhb) this).a((nc[]) null, -24);
          return new nc((Object) (Object) frb.a(138, 93));
        } else {
          return new nc((Object) (Object) frb.a(138, 93));
        }
    }

    fhb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Cancel rematch";
    }
}
