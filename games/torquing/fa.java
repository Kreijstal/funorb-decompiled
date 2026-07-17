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

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        og var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            var4 = (og) (Object) bh.field_c.b(0);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                jo.a(true, 7, var4);
                var4 = (og) (Object) bh.field_c.f(-24059);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "fa.A(" + 7 + 44 + -21386 + 41);
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
