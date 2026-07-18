/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static int field_c;
    static String field_a;
    static fe field_f;
    static String field_e;
    static int[] field_g;
    static tr field_d;
    static er[] field_b;

    public static void a() {
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
    }

    final static boolean c() {
        return !cl.field_c.a((byte) -105);
    }

    final static void b() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = eb.field_g[0];
            var2 = 1;
            L1: while (true) {
              if (eb.field_g.length <= var2) {
                break L0;
              } else {
                var3 = eb.field_g[var2];
                qq.a(ac.field_K, var2 << 4, ac.field_K, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "ln.E(" + 0 + ')');
        }
    }

    final static uh a(int param0, int param1) {
        gp stackIn_4_0 = null;
        gp stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        gp stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        gp stackOut_2_0 = null;
        if (param0 != 0) {
          L0: {
            ln.d(29);
            if (null == lh.field_b) {
              stackOut_7_0 = null;
              stackIn_8_0 = (gp) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = lh.field_b.a(param0 + 3661, (long)param1);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (uh) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null == lh.field_b) {
              stackOut_3_0 = null;
              stackIn_4_0 = (gp) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = lh.field_b.a(param0 + 3661, (long)param1);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (uh) (Object) stackIn_4_0;
        }
    }

    final static void d(int param0) {
        nn var1 = (nn) (Object) gi.field_v.d((byte) 92);
        if (param0 != -28558) {
            uh discarded$8 = ln.a(101, 106);
            if (!(var1 != null)) {
                throw new IllegalStateException();
            }
            bi.a(var1.field_n, var1.field_r, var1.field_o);
            bi.g(var1.field_q, var1.field_x, var1.field_u, var1.field_v);
            var1.field_n = null;
            ag.field_b.a((li) (Object) var1, false);
            return;
        }
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        bi.a(var1.field_n, var1.field_r, var1.field_o);
        bi.g(var1.field_q, var1.field_x, var1.field_u, var1.field_v);
        var1.field_n = null;
        ag.field_b.a((li) (Object) var1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
        field_e = "Add <%0> to friend list";
    }
}
