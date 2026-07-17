/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static be field_c;
    static tg[] field_d;
    static String field_b;
    static int field_e;
    static mf field_a;

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
    }

    final static tg[] a(byte param0, int param1) {
        tg[] var2 = null;
        tg[] var3 = null;
        var3 = new tg[9];
        var2 = var3;
        if (param0 > -53) {
          field_b = null;
          var3[4] = hc.a(64, param1, (byte) -123);
          return var2;
        } else {
          var3[4] = hc.a(64, param1, (byte) -123);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_b = "Login: ";
        field_a = new mf();
    }
}
