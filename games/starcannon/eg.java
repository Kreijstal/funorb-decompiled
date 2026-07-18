/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg implements de {
    private int field_e;
    static int field_l;
    private int field_d;
    private qe field_k;
    private int field_m;
    static String field_i;
    static int[] field_a;
    private int field_c;
    static boolean field_h;
    private int field_j;
    static wd field_f;
    private int field_g;
    private int field_b;

    final static void a(java.awt.Frame param0, byte param1, ka param2) {
        bk var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: while (true) {
            var3 = param2.a(param0, 12250);
            L1: while (true) {
              if (var3.field_b != 0) {
                if (var3.field_b == 1) {
                  param0.setVisible(false);
                  param0.dispose();
                  return;
                } else {
                  uc.a(-98, 100L);
                  continue L0;
                }
              } else {
                uc.a(-121, 10L);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("eg.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(-47).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static ed a(int param0, int param1, c param2) {
        RuntimeException var3 = null;
        ed stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_2_0 = null;
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
            stackOut_2_0 = new ed(param2, param1 * df.field_n / 1000);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("eg.E(").append(29723).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        el var15 = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        uj stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof el)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (uj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (uj) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (el) (Object) stackIn_3_0;
              ki.d(param0 + param4.field_s, param4.field_j + param3, param4.field_i, param4.field_f, ((eg) this).field_b);
              if (var15 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = var15.field_K + (param4.field_s + param0);
              var8 = var15.field_G + param4.field_j + param3;
              ki.e(var7, var8, var15.field_I, ((eg) this).field_g);
              if (var15.field_E == -1) {
                break L3;
              } else {
                var9 = (double)var15.field_E * 3.141592653589793 * 2.0 / (double)var15.field_B;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
                var12 = (int)(Math.cos(var9) * (double)var15.field_I);
                ki.e(var7 + var11, var8 + var12, 1, ((eg) this).field_j);
                break L3;
              }
            }
            L4: {
              ki.e(var7, var8, 2, 1);
              var9 = (double)var15.field_F * 3.141592653589793 * 2.0 / (double)var15.field_B;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
              var13 = -54 / ((param2 - 2) / 54);
              var12 = (int)(Math.cos(var9) * (double)var15.field_I);
              ki.a(var7, var8, var11 + var7, var12 + var8, 1);
              if (((eg) this).field_k == null) {
                break L4;
              } else {
                var14 = var15.field_I + var15.field_K - -((eg) this).field_d;
                int discarded$1 = ((eg) this).field_k.a(param4.field_k, var14 + param4.field_s + param0, ((eg) this).field_e + param4.field_j + param3, -((eg) this).field_d + (-var14 + param4.field_i), param4.field_f - (((eg) this).field_d << 1), ((eg) this).field_c, ((eg) this).field_m, 1, 1, 0);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("eg.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        ig.field_b = param1;
        sb.field_m = param3;
        sd.field_a = param0;
    }

    final static void b(byte param0) {
        jb.field_c = null;
        nh.field_h = null;
    }

    public static void a(byte param0) {
        field_f = null;
        field_i = null;
        field_a = null;
    }

    eg(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((eg) this).field_k = param0;
            ((eg) this).field_m = param4;
            ((eg) this).field_j = param6;
            ((eg) this).field_d = param1;
            ((eg) this).field_e = param2;
            ((eg) this).field_g = param5;
            ((eg) this).field_c = param3;
            ((eg) this).field_b = param7;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_i = "Level 1<br>Defeat the Paragulan fleet<br>attacking our solar system";
    }
}
