/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    String field_l;
    static sj field_e;
    String field_g;
    int field_d;
    bj field_j;
    static String field_a;
    static ta field_k;
    String field_m;
    static ea field_h;
    private static int[] field_c;
    static char[] field_n;
    static ta field_b;
    static hg field_f;
    static hg field_o;
    static bj field_i;

    final static String a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        String var1 = "(" + lc.field_s + " " + rd.field_a + " " + ud.field_a + ") " + oj.field_K;
        if (rj.field_d > 0) {
            var1 = var1 + ":";
            for (var2 = 0; rj.field_d > var2; var2++) {
                var1 = var1 + 32;
                var3 = kj.field_a.field_u[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        if (param0 <= 48) {
            field_e = null;
        }
        return var1;
    }

    final static void a(bj param0) {
        RuntimeException var2 = null;
        ld var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        pb var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ld var8 = null;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var8 = new ld(param0.a("", 0, "logo.fo3d"));
            var2_ref = var8;
            var3 = var2_ref.d((byte) -54);
            var2_ref.f((byte) 16);
            bl.field_v = tk.a(-123, var2_ref);
            aj.field_b = new pb[var3];
            pa.field_b = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var2_ref.o(-98);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = aj.field_b[var9];
                    var5.a(1, 6, 6, 6, (byte) -81);
                    var5.a(true);
                    var6 = new int[]{var5.field_v + var5.field_H >> 1, var5.field_h + var5.field_l >> 1, var5.field_J + var5.field_j >> 1};
                    pa.field_b[var9] = var6;
                    var5.a(-var6[2], -var6[1], 0, -var6[0]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                aj.field_b[var4] = lj.a(var8, (byte) -62);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("hj.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 347664612 + 41);
        }
    }

    public static void a() {
        field_i = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_n = null;
        field_o = null;
        field_k = null;
        field_e = null;
        field_h = null;
        field_f = null;
    }

    private hj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var4 = 0L;
        long var6 = 0L;
        int var2 = 0;
        int var3 = 0;
        int var1 = 0;
        field_e = new sj("usename");
        field_a = "Just play";
        field_k = new ta();
        field_c = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var4 = (long)(-1 + (var0 << 1));
            var6 = (long)((var0 << 1) - -1);
            var2 = (int)((var4 * var4 >> 18) + -32768L);
            var3 = (int)((var6 * var6 >> 18) - 32768L);
            if (field_c.length <= var3) {
                var3 = -1 + field_c.length;
            }
            for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
                field_c[var1] = var0;
            }
        }
        field_n = new char[128];
        field_b = new ta();
    }
}
