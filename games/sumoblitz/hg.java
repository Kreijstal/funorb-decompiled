/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends ms {
    static String field_t;
    int field_u;
    int field_n;
    static float[] field_l;
    int field_s;
    static lg field_o;
    static float[] field_k;
    int field_p;
    int field_r;
    int field_q;
    static int[] field_m;

    final static nj[] a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        nj[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        nj[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        nj[] stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 != param1[param1.length - 1]) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (var2_int != 0) {
                stackOut_6_0 = param1.length;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param1.length + 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = new nj[stackIn_7_0];
            var4 = 0;
            var4 = 0;
            L3: while (true) {
              if (var4 >= param1.length) {
                L4: {
                  if (var4 < var3.length) {
                    var3[var4] = new nj(0, 2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = -34;
                stackOut_13_0 = (nj[]) var3;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                var3[var4] = new nj(param1[var4], 2);
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hg.A(").append(110).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    public static void a() {
        field_m = null;
        field_l = null;
        field_t = null;
        field_k = null;
        field_o = null;
    }

    hg(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hg) this).field_n = param4;
        ((hg) this).field_r = param2;
        ((hg) this).field_s = param3;
        ((hg) this).field_q = param1;
        ((hg) this).field_u = param0;
        ((hg) this).field_p = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_t = "Play the game without logging in just yet";
        field_k = new float[16384];
        field_l = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
            field_k[var2] = (float)Math.sin((double)var2 * var0);
            field_l[var2] = (float)Math.cos(var0 * (double)var2);
        }
        field_m = new int[1];
    }
}
