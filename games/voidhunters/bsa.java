/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bsa extends rqa {
    static String field_p;
    static llb field_q;
    static boolean field_o;

    public static void e(byte param0) {
        field_p = null;
        if (param0 != -7) {
            return;
        }
        field_q = null;
    }

    final nc a(nc[] param0, int param1) {
        qaa.field_a = param0[0].d(0);
        if (param1 >= -119) {
          bsa.e((byte) -82);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    bsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "<%0> connected";
    }
}
