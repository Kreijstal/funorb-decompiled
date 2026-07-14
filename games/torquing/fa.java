/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static int field_e;
    static int field_d;
    static boolean field_a;
    static int field_b;
    static int field_c;

    final static cb a(int param0, int param1, int param2, int param3) {
        cb var4 = null;
        var4 = new cb();
        if (param2 != 27375) {
          cb discarded$2 = fa.a(5, -19, -58, -17);
          var4.field_k = param1;
          var4.field_l = param3;
          ae.field_nb.a((byte) 54, (q) (Object) var4);
          pd.a(var4, true, param0);
          return var4;
        } else {
          var4.field_k = param1;
          var4.field_l = param3;
          ae.field_nb.a((byte) 54, (q) (Object) var4);
          pd.a(var4, true, param0);
          return var4;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        og var4 = null;
        var3 = Torquing.field_u;
        var4 = (og) (Object) bh.field_c.b(param1 + 21386);
        if (param1 == -21386) {
          L0: while (true) {
            if (var4 != null) {
              jo.a(true, param0, var4);
              var4 = (og) (Object) bh.field_c.f(param1 + -2673);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 5;
        field_e = -1;
        field_a = false;
    }
}
