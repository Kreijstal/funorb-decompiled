/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends pa {
    static String[] field_G;
    private int field_D;
    private int field_J;
    private String field_F;
    private rb field_E;
    private boolean field_K;
    static rb field_H;
    private int field_I;

    final String d(int param0) {
        int var3 = 50 % ((10 - param0) / 58);
        int var2 = ((q) this).field_z.field_l ? 1 : 0;
        ((q) this).field_z.field_l = ((q) this).field_l;
        String var4 = ((q) this).field_z.d(-71);
        ((q) this).field_z.field_l = var2 != 0 ? true : false;
        return var4;
    }

    public static void c(boolean param0) {
        field_H = null;
        field_G = null;
    }

    q(int param0, int param1, int param2, int param3, ga param4, boolean param5, int param6, int param7, rb param8, int param9, String param10) {
        super(param0, param1, param2, param3, (io) null, (sk) null);
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              ((q) this).field_I = param7;
              ((q) this).field_D = param6;
              ((q) this).field_F = param10;
              ((q) this).field_z = param4;
              ((q) this).field_J = param9;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((q) this).field_K = stackIn_4_1 != 0;
              ((q) this).field_E = param8;
              var12_int = ((q) this).field_D - ((q) this).field_I;
              var13 = ((q) this).field_E.b(param10, var12_int, ((q) this).field_E.field_I) - -(((q) this).field_I * 2);
              if (param3 >= var13) {
                var13 = param3;
                break L2;
              } else {
                ((q) this).a(-109, param1, param0, param2, var13);
                break L2;
              }
            }
            L3: {
              if (!((q) this).field_K) {
                stackOut_9_0 = ((q) this).field_D - -(2 * ((q) this).field_I);
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((q) this).field_z.a(118, ((q) this).field_I - -(var13 + -param3 >> 1), var14, param2 - ((q) this).field_D + -(((q) this).field_I * 3), param3 - 2 * ((q) this).field_I);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("q.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param8 == null) {
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
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param9).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param10 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((q) this).field_k;
        int var6 = param0 + ((q) this).field_j;
        super.a(param0, param1, param2, param3);
        if (!(0 == param1)) {
            return;
        }
        int var7 = ((q) this).field_K ? -(2 * ((q) this).field_I) + (-((q) this).field_D + ((q) this).field_i) : 0;
        int discarded$0 = ((q) this).field_E.a(((q) this).field_F, ((q) this).field_I + (var5 + var7), ((q) this).field_I + var6, ((q) this).field_D + -((q) this).field_I, -(((q) this).field_I * 2) + ((q) this).field_n, ((q) this).field_J, -1, !((q) this).field_K ? 2 : 0, 1, ((q) this).field_E.field_I);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Washington D.C.", "London"};
    }
}
