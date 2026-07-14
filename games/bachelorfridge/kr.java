/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends sna {
    kha field_yb;
    static String field_wb;
    static String field_xb;
    static String field_zb;
    static int field_vb;

    final static void a(int param0, rg param1, int param2) {
        pf var3 = null;
        var3 = sja.field_fb;
        var3.c(param2, (byte) 126);
        var3.d(2, 0);
        var3.d(0, 0);
        if (param0 <= 62) {
          return;
        } else {
          var3.d(param1.field_i, 0);
          return;
        }
    }

    public static void f(int param0) {
        field_zb = null;
        int var1 = 110 % ((-79 - param0) / 43);
        field_xb = null;
        field_wb = null;
    }

    kr(int param0, kv param1, kha param2) {
        ((kr) this).field_p = 39;
        ((kr) this).field_v = param1;
        ((kr) this).field_sb = 39;
        if (qg.field_b.field_z != null) {
            ((kr) this).field_kb = 39 * (qg.field_b.field_z.g(0) % 4);
            ((kr) this).field_rb = qg.field_b.field_z.g(0) / 4 * 39 + -8;
        }
        ((kr) this).field_yb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = "(Including <%0>)";
        field_xb = "Arena combat. Follow the tooltips on screen to continue.";
        field_zb = "Email: ";
    }
}
