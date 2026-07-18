/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends rk {
    int field_m;
    int field_v;
    int field_t;
    int field_r;
    static w field_p;
    static double field_q;
    int field_u;
    static String field_o;
    int field_n;
    static jf field_s;

    public static void a(byte param0) {
        field_p = null;
        field_s = null;
        field_o = null;
    }

    final static qn a(int param0, int param1, int param2, int param3, byte param4) {
        qn var5 = null;
        int var6 = 0;
        var6 = Confined.field_J ? 1 : 0;
        var5 = (qn) (Object) na.field_T.a(97);
        L0: while (true) {
          if (var5 != null) {
            if (param0 != var5.field_w) {
              var5 = (qn) (Object) na.field_T.d(2123);
              continue L0;
            } else {
              return var5;
            }
          } else {
            var5 = new qn();
            var5.field_s = 1;
            var5.field_w = param0;
            var5.field_o = 10;
            na.field_T.a((rk) (Object) var5, (byte) 105);
            dh.a(3, var5, 21821);
            return var5;
          }
        }
    }

    final static void b(boolean param0) {
        gb.a((byte) -94, ii.b(false));
    }

    private om() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Open in popup window";
    }
}
