/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String field_a;
    static db field_e;
    static String[] field_b;
    static hl field_d;
    static wf field_c;
    static oh field_f;

    public static void b(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, byte param1, int param2, oh[] param3) {
        try {
            nm.field_o = new ve(param3);
            ng.field_D = 8;
            fl.field_b = 12;
            ca.b(-69);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "e.B(" + 8 + ',' + -92 + ',' + 12 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static kh[] a(byte param0) {
        kh[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TetraLink.field_J;
        var1 = new kh[vj.field_n];
        var2 = 0;
        L0: while (true) {
          if (vj.field_n <= var2) {
            if (param0 < 98) {
              kh[] discarded$2 = e.a((byte) 60);
              an.b(-125);
              return var1;
            } else {
              an.b(-125);
              return var1;
            }
          } else {
            var1[var2] = new kh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], ga.field_a[var2], ti.field_c);
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Lost";
        field_e = new db(6, 0, 4, 2);
        field_b = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
