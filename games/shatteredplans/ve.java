/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends qr {
    String field_Ab;
    String field_Eb;
    qr field_Fb;
    qr field_Db;
    int field_zb;
    static String field_Gb;
    String field_xb;
    String field_Bb;
    qr field_Cb;
    static String field_yb;

    final static String a(bc param0, int param1, String param2, String param3, int param4) {
        Object var6 = null;
        if (!param0.b((byte) 5)) {
          return param2;
        } else {
          if (param4 != -14930) {
            var6 = null;
            String discarded$2 = ve.a((bc) null, -19, (String) null, (String) null, -86);
            return param3 + " - " + param0.c((byte) 36, param1) + "%";
          } else {
            return param3 + " - " + param0.c((byte) 36, param1) + "%";
          }
        }
    }

    public static void g(int param0) {
        field_yb = null;
        field_Gb = null;
        if (param0 != 0) {
            ve.g(15);
        }
    }

    ve() {
        super(0L, (qr) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = "<%0> might change the options - wait and see.";
        field_yb = "Tips";
    }
}
