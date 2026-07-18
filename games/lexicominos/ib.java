/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements rd {
    static jb[] field_a;
    static String field_i;
    private int field_k;
    private int field_j;
    private int field_f;
    private int field_h;
    private int field_l;
    private le field_c;
    static String field_b;
    private int field_e;
    static int[] field_g;
    private int field_d;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ae var14 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof ae) {
                stackOut_2_0 = (w) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (w) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (ae) (Object) stackIn_3_0;
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param4 == -3284) {
              L3: {
                lf.a(param1 - -param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, ((ib) this).field_j);
                var7 = var14.field_L + (param1 + param3.field_t);
                var8 = var14.field_F + (param3.field_o + param0);
                lf.c(var7, var8, var14.field_I, ((ib) this).field_k);
                if (var14.field_H == -1) {
                  break L3;
                } else {
                  var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_K;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                  lf.c(var11 + var7, var8 - -var12, 1, ((ib) this).field_h);
                  break L3;
                }
              }
              L4: {
                lf.c(var7, var8, 2, 1);
                var9 = (double)var14.field_G * 3.141592653589793 * 2.0 / (double)var14.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                lf.b(var7, var8, var11 + var7, var8 - -var12, 1);
                if (null == ((ib) this).field_c) {
                  break L4;
                } else {
                  var13 = var14.field_L - (-var14.field_I + -((ib) this).field_d);
                  int discarded$1 = ((ib) this).field_c.a(param3.field_u, var13 + (param1 + param3.field_t), param3.field_o + param0 + ((ib) this).field_f, param3.field_j + -((ib) this).field_d + -var13, param3.field_v - (((ib) this).field_d << 1), ((ib) this).field_e, ((ib) this).field_l, 1, 1, 0);
                  break L4;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        ib.a(true);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param4 < -36) {
              param2--;
              L1: while (true) {
                if (param2 < 0) {
                  break L0;
                } else {
                  var9 = param1;
                  var5_array = var9;
                  var6 = param0;
                  var7 = param3;
                  var9[var6] = (vg.a(var9[var6], 16711422) >> 1) + var7;
                  param0++;
                  param2--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ib.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    ib(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ib) this).field_h = param6;
            ((ib) this).field_k = param5;
            ((ib) this).field_c = param0;
            ((ib) this).field_d = param1;
            ((ib) this).field_j = param7;
            ((ib) this).field_e = param3;
            ((ib) this).field_f = param2;
            ((ib) this).field_l = param4;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = new int[]{0, 0, 0, 10, 40, 125, 250, 500, 1000};
    }
}
