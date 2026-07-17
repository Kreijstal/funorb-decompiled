/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends am {
    private String field_Q;
    static int field_R;
    static int[] field_T;
    private boolean field_L;
    private int field_U;
    static e field_N;
    private int field_K;
    static int field_O;
    private ok field_P;
    static long[] field_S;
    private int field_J;
    static ej field_M;

    final String f(byte param0) {
        int var2 = ((la) this).field_H.field_w ? 1 : 0;
        ((la) this).field_H.field_w = ((la) this).field_w;
        if (param0 > -82) {
            la.i(13);
        }
        String var3 = ((la) this).field_H.f((byte) -84);
        ((la) this).field_H.field_w = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < 36) {
            String discarded$0 = ((la) this).f((byte) 63);
        }
        int var5 = param3 + ((la) this).field_q;
        int var6 = param0 + ((la) this).field_m;
        super.a(param0, param1, (byte) 75, param3);
        if (!(param1 == 0)) {
            return;
        }
        int var7 = !((la) this).field_L ? 0 : -(((la) this).field_U * 2) + ((la) this).field_F + -((la) this).field_J;
        int discarded$1 = ((la) this).field_P.a(((la) this).field_Q, var5 - (-var7 - ((la) this).field_U), var6 - -((la) this).field_U, -((la) this).field_U + ((la) this).field_J, -(((la) this).field_U * 2) + ((la) this).field_z, ((la) this).field_K, -1, ((la) this).field_L ? 0 : 2, 1, ((la) this).field_P.field_C);
    }

    final static void j(int param0) {
        bj.a(true, kc.field_n, 14451, rd.field_Jb);
        pc.field_f = true;
        if (param0 < 23) {
            la.j(106);
        }
    }

    la(int param0, int param1, int param2, int param3, fj param4, boolean param5, int param6, int param7, ok param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fe) null, (uk) null);
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
              ((la) this).field_K = param9;
              ((la) this).field_U = param7;
              ((la) this).field_Q = param10;
              ((la) this).field_P = param8;
              ((la) this).field_H = param4;
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
              ((la) this).field_L = stackIn_4_1 != 0;
              ((la) this).field_J = param6;
              var12_int = ((la) this).field_J + -((la) this).field_U;
              var13 = ((la) this).field_P.b(param10, var12_int, ((la) this).field_P.field_C) - -(((la) this).field_U * 2);
              if (var13 <= param3) {
                var13 = param3;
                break L2;
              } else {
                ((la) this).a(-111, param2, param1, var13, param0);
                break L2;
              }
            }
            L3: {
              if (!((la) this).field_L) {
                stackOut_9_0 = 2 * ((la) this).field_U + ((la) this).field_J;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((la) this).field_H.a(-114, -((la) this).field_J + param2 - ((la) this).field_U * 3, (var13 - param3 >> 1) + ((la) this).field_U, param3 + -(((la) this).field_U * 2), var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("la.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    public static void i(int param0) {
        field_T = null;
        field_N = null;
        field_M = null;
        field_S = null;
        int var1 = -101 % ((param0 - -31) / 34);
    }

    final static long h(int param0) {
        if (param0 <= 110) {
            la.j(13);
        }
        return -m.field_b + ri.a(-3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new long[1000];
        field_N = new e(8, 0, 4, 1);
        field_M = new ej();
    }
}
