/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static boolean field_a;
    static String field_c;
    static String field_b;
    static String[] field_d;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_d = null;
        int var1 = 88;
    }

    final static void a(int param0, hi param1) {
        ih var3 = null;
        int var4 = 0;
        try {
            var3 = ud.field_b;
            var3.e(8, param0);
            var3.field_i = var3.field_i + 1;
            var4 = var3.field_i;
            var3.a(-11, 1);
            var3.a(-11, param1.field_j);
            var3.a(-11, param1.field_m);
            var3.a(param1.field_o, (byte) -46);
            var3.a(param1.field_i, (byte) -82);
            var3.a(param1.field_l, (byte) -67);
            var3.a(param1.field_n, (byte) -42);
            int discarded$0 = var3.c(var4, -30532);
            var3.c((byte) -81, var3.field_i - var4);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "sc.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          var1 = (Object) (Object) rh.field_f;
          synchronized (var1) {
            L0: {
              L1: {
                tl.field_o = tc.field_h;
                lg.field_d = lg.field_d + 1;
                if (em.field_f < 0) {
                  var5 = 0;
                  var2 = var5;
                  L2: while (true) {
                    if (-113 <= var5) {
                      em.field_f = sd.field_a;
                      break L1;
                    } else {
                      ei.field_H[var5] = false;
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  L3: while (true) {
                    if (em.field_f == sd.field_a) {
                      break L1;
                    } else {
                      var2 = qk.field_b[sd.field_a];
                      sd.field_a = 127 & 1 + sd.field_a;
                      if (0 <= var2) {
                        ei.field_H[var2] = true;
                        continue L3;
                      } else {
                        ei.field_H[var2] = false;
                        continue L3;
                      }
                    }
                  }
                }
              }
              tc.field_h = ak.field_e;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1_ref, "sc.A(" + -1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = "Create a free account to start using this feature";
        field_c = "Loading levels";
        field_d = new String[16];
    }
}
