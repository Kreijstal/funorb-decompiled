/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rc extends en {
    private String field_Q;
    static String field_T;
    private int field_V;
    static ah field_U;
    static hl field_S;
    private int field_O;
    private int field_P;
    static long field_N;
    private jb field_R;
    private boolean field_W;

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            stackOut_2_0 = qb.a(true, param0, (byte) -126, 10);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("rc.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 10 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        jb stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        jb stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        jb stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        jb stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        jb stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        jb stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = param1 + ((rc) this).field_t;
        var6 = ((rc) this).field_w + param2;
        super.a(0, param1, param2, param3);
        if (param0 != param3) {
          return;
        } else {
          L0: {
            if (((rc) this).field_W) {
              stackOut_3_0 = -((rc) this).field_P + ((rc) this).field_F + -(((rc) this).field_O * 2);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            stackOut_4_0 = ((rc) this).field_R;
            stackOut_4_1 = ((rc) this).field_Q;
            stackOut_4_2 = ((rc) this).field_O + var7 + var5;
            stackOut_4_3 = var6 + ((rc) this).field_O;
            stackOut_4_4 = -((rc) this).field_O + ((rc) this).field_P;
            stackOut_4_5 = -(2 * ((rc) this).field_O) + ((rc) this).field_u;
            stackOut_4_6 = ((rc) this).field_V;
            stackOut_4_7 = -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            stackIn_6_7 = stackOut_4_7;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            stackIn_5_5 = stackOut_4_5;
            stackIn_5_6 = stackOut_4_6;
            stackIn_5_7 = stackOut_4_7;
            if (((rc) this).field_W) {
              stackOut_6_0 = (jb) (Object) stackIn_6_0;
              stackOut_6_1 = (String) (Object) stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              stackIn_7_8 = stackOut_6_8;
              break L1;
            } else {
              stackOut_5_0 = (jb) (Object) stackIn_5_0;
              stackOut_5_1 = (String) (Object) stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 2;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_7_8 = stackOut_5_8;
              break L1;
            }
          }
          int discarded$1 = ((jb) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((rc) this).field_R.field_N);
          return;
        }
    }

    public static void h(int param0) {
        field_U = null;
        field_S = null;
        field_T = null;
    }

    rc(int param0, int param1, int param2, int param3, na param4, boolean param5, int param6, int param7, jb param8, int param9, String param10) {
        super(param0, param1, param2, param3, (kg) null, (dn) null);
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
              ((rc) this).field_O = param7;
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
              ((rc) this).field_W = stackIn_4_1 != 0;
              ((rc) this).field_J = param4;
              ((rc) this).field_Q = param10;
              ((rc) this).field_R = param8;
              ((rc) this).field_P = param6;
              ((rc) this).field_V = param9;
              var12_int = -((rc) this).field_O + ((rc) this).field_P;
              var13 = ((rc) this).field_R.b(param10, var12_int, ((rc) this).field_R.field_N) + 2 * ((rc) this).field_O;
              if (var13 > param3) {
                ((rc) this).a(var13, param1, -119, param0, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (!((rc) this).field_W) {
                stackOut_9_0 = ((rc) this).field_O * 2 + ((rc) this).field_P;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            ((rc) this).field_J.a(-(2 * ((rc) this).field_O) + param3, (var13 - param3 >> 1) + ((rc) this).field_O, -124, var14, -(((rc) this).field_O * 3) + param2 + -((rc) this).field_P);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var12;
            stackOut_12_1 = new StringBuilder().append("rc.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final String e(int param0) {
        int var2 = ((rc) this).field_J.field_r ? 1 : 0;
        ((rc) this).field_J.field_r = ((rc) this).field_r;
        String var3 = ((rc) this).field_J.e(param0);
        ((rc) this).field_J.field_r = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Sorry, you were removed from the game you were in. This happens if you are disconnected for too long or if the server is updated.";
    }
}
