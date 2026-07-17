/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og implements rd {
    private int field_d;
    static String field_c;
    static String field_b;
    private le field_i;
    private int field_a;
    private int field_e;
    private int field_g;
    static int[][] field_f;
    private int field_k;
    private int field_h;
    static String field_j;

    public static void a() {
        field_f = null;
        field_c = null;
        int var1 = 0;
        field_b = null;
        field_j = null;
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wi var12 = null;
        w stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        w stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof wi)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (w) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (w) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (wi) (Object) stackIn_4_0;
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              lf.a(param3.field_t + param1, param3.field_o + param0, param3.field_j, param3.field_v, ((og) this).field_d);
              var7 = -(var12.field_G * 2) + param3.field_j;
              var8 = var12.field_G + param3.field_t + param1;
              var9 = param0 - (-param3.field_o - var12.field_H);
              if (param4 == -3284) {
                break L3;
              } else {
                ((og) this).field_g = 108;
                break L3;
              }
            }
            lf.b(var8, var9, var7 + var8, var9, ((og) this).field_h);
            var10 = -1 + var12.e(false);
            L4: while (true) {
              if (var10 < 0) {
                if (((og) this).field_i == null) {
                  break L0;
                } else {
                  ((og) this).field_i.a(var12.field_u, var7 / 2 + var8, var12.field_H + var9 - -((og) this).field_i.field_C, ((og) this).field_e, ((og) this).field_g);
                  return;
                }
              } else {
                lf.c(var12.a(var10, (byte) -37) * var7 / var12.i(-1) + var8, var9, ((og) this).field_a, ((og) this).field_k);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("og.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    final static boolean a(int param0) {
        return 250 < mc.field_k;
    }

    og(le param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((og) this).field_d = param4;
            ((og) this).field_e = param1;
            ((og) this).field_i = param0;
            ((og) this).field_h = param3;
            ((og) this).field_g = param2;
            ((og) this).field_a = param5;
            ((og) this).field_k = param6;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Retry";
        field_f = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
    }
}
