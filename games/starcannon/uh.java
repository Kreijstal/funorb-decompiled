/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uh extends rf {
    static p field_g;
    uh field_m;
    long field_j;
    uh field_f;
    static volatile int field_i;
    static pf field_k;
    static String[] field_h;
    static vi field_l;

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = StarCannon.field_A;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        for (var4 = 0; param0 > var4; var4++) {
            var6[var4] = '*';
        }
        return new String(var6);
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 111) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            stackOut_2_0 = va.a(0, 83, param1, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("uh.RB(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(byte param0) {
        int var1 = 0;
        field_l = null;
        field_k = null;
        field_g = null;
        field_h = null;
    }

    final static hl c(byte param0) {
        int var4_int = 0;
        int var5 = StarCannon.field_A;
        int var1 = gg.field_d[0] * gh.field_C[0];
        byte[] var2 = og.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = of.field_g[w.a(255, (int) var2[var4_int])];
        }
        hl var4 = new hl(td.field_m, gb.field_w, fc.field_d[0], qd.field_H[0], gg.field_d[0], gh.field_C[0], var3);
        rc.b((byte) -121);
        return var4;
    }

    protected uh() {
    }

    final void a(int param0) {
        if (!(((uh) this).field_f != null)) {
            return;
        }
        ((uh) this).field_f.field_m = ((uh) this).field_m;
        ((uh) this).field_m.field_f = ((uh) this).field_f;
        ((uh) this).field_f = null;
        ((uh) this).field_m = null;
        if (param0 != -6242) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new p();
        field_i = 0;
    }
}
