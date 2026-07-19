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
        cb discarded$2 = null;
        cb var4 = null;
        var4 = new cb();
        if (param2 != 27375) {
          discarded$2 = fa.a(5, -19, -58, -17);
          var4.field_k = param1;
          var4.field_l = param3;
          ae.field_nb.a((byte) 54, var4);
          pd.a(var4, true, param0);
          return var4;
        } else {
          var4.field_k = param1;
          var4.field_l = param3;
          ae.field_nb.a((byte) 54, var4);
          pd.a(var4, true, param0);
          return var4;
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        og var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (og) ((Object) bh.field_c.b(param1 + 21386));
            if (param1 == -21386) {
              L1: while (true) {
                if (var4 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  jo.a(true, param0, var4);
                  var4 = (og) ((Object) bh.field_c.f(param1 + -2673));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "fa.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = 5;
        field_e = -1;
        field_a = false;
    }
}
