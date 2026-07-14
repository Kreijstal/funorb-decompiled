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

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 >= -33) {
            field_b = null;
        }
    }

    final static boolean c(int param0) {
        if (param0 != 132199140) {
            return true;
        }
        return !cl.field_c.a((byte) -105) ? true : false;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var1 = eb.field_g[param0];
        for (var2 = 1; eb.field_g.length > var2; var2++) {
            var3 = eb.field_g[var2];
            qq.a(ac.field_K, var2 << 132199140, ac.field_K, var1, var3);
            var1 = var1 + var3;
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
