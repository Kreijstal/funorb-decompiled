/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends mg {
    static db field_N;
    private boolean field_J;
    static long field_P;
    private le field_D;
    static String field_G;
    static int field_K;
    private int field_F;
    private int field_E;
    private String field_Q;
    private int field_H;
    static bj field_L;
    static String[] field_C;
    static int field_I;
    static db field_O;
    static bj field_M;

    final String b(int param0) {
        int var2 = 0;
        String var3 = null;
        w stackIn_2_0 = null;
        w stackIn_3_0 = null;
        w stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        w stackIn_6_0 = null;
        w stackIn_7_0 = null;
        w stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        w stackOut_5_0 = null;
        w stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        w stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        w stackOut_1_0 = null;
        w stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        w stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var2 = ((jf) this).field_A.field_m ? 1 : 0;
        if (param0 < 121) {
          L0: {
            int discarded$2 = jf.a((byte) 47, -104);
            ((jf) this).field_A.field_m = ((jf) this).field_m;
            var3 = ((jf) this).field_A.b(122);
            stackOut_5_0 = ((jf) this).field_A;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var2 == 0) {
              stackOut_7_0 = (w) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (w) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_m = stackIn_8_1 != 0;
          return var3;
        } else {
          L1: {
            ((jf) this).field_A.field_m = ((jf) this).field_m;
            var3 = ((jf) this).field_A.b(122);
            stackOut_1_0 = ((jf) this).field_A;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (w) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (w) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_m = stackIn_4_1 != 0;
          return var3;
        }
    }

    jf(int param0, int param1, int param2, int param3, w param4, boolean param5, int param6, int param7, le param8, int param9, String param10) {
        super(param0, param1, param2, param3, (rd) null, (vd) null);
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
              ((jf) this).field_Q = param10;
              ((jf) this).field_H = param9;
              ((jf) this).field_A = param4;
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
              ((jf) this).field_J = stackIn_4_1 != 0;
              ((jf) this).field_D = param8;
              ((jf) this).field_F = param6;
              ((jf) this).field_E = param7;
              var12_int = ((jf) this).field_F + -((jf) this).field_E;
              var13 = ((jf) this).field_D.a(param10, var12_int, ((jf) this).field_D.field_E) + 2 * ((jf) this).field_E;
              if (var13 > param3) {
                ((jf) this).a(var13, param2, true, param1, param0);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (((jf) this).field_J) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = ((jf) this).field_F - -(((jf) this).field_E * 2);
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((jf) this).field_A.a(param3 + -(2 * ((jf) this).field_E), -((jf) this).field_F + param2 + -(((jf) this).field_E * 3), true, ((jf) this).field_E - -(var13 + -param3 >> 1), var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("jf.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');
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
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_O = null;
        field_C = null;
        field_L = null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = ((jf) this).field_t - -param2;
        int var6 = param1 + ((jf) this).field_o;
        super.a(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        int var7 = !((jf) this).field_J ? 0 : -(2 * ((jf) this).field_E) + (-((jf) this).field_F + ((jf) this).field_j);
        int discarded$0 = ((jf) this).field_D.a(((jf) this).field_Q, var5 - (-var7 + -((jf) this).field_E), var6 + ((jf) this).field_E, -((jf) this).field_E + ((jf) this).field_F, ((jf) this).field_v - 2 * ((jf) this).field_E, ((jf) this).field_H, -1, ((jf) this).field_J ? 0 : 2, 1, ((jf) this).field_D.field_E);
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) - -(param1 >>> 1 & 1431655765);
        param1 = ((-858993457 & param1) >>> 2) + (858993459 & param1);
        param1 = 252645135 & (param1 >>> 4) + param1;
        if (param0 <= 80) {
          int discarded$2 = jf.a((byte) 29, -19);
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "THREE";
        field_L = new bj(0);
        field_C = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_O = new db(311, 450);
        field_M = new bj(3);
    }
}
