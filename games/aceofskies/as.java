/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as {
    static long field_b;
    static String field_a;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static cp a(gk param0, int param1, gk param2, String param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        if (param1 > -89) {
          field_b = -94L;
          var5 = param2.b(param4, 0);
          var6 = param2.a(-110, var5, param3);
          return uc.a(121, param0, var6, param2, var5);
        } else {
          var5 = param2.b(param4, 0);
          var6 = param2.a(-110, var5, param3);
          return uc.a(121, param0, var6, param2, var5);
        }
    }

    final static void a(int param0) {
        if (!(null == vn.field_f)) {
            vn.field_f.j(0);
        }
        int var1 = -41 % ((param0 - -56) / 53);
        if (!(null == fu.field_d)) {
            fu.field_d.k(-116);
        }
        fo.b(0);
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 < 120) {
            field_c = -80;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
