/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee implements ch {
    static String field_k;
    private int field_c;
    private int field_e;
    private int field_b;
    static int field_h;
    private int field_a;
    private fa field_d;
    static boolean field_i;
    private int field_f;
    private int field_j;
    private int field_g;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        md var14 = null;
        qa stackIn_5_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        qa stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0 <= -36) {
              L1: {
                if (!(param3 instanceof md)) {
                  stackOut_4_0 = null;
                  stackIn_5_0 = (qa) (Object) stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = (qa) param3;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var14 = (md) (Object) stackIn_5_0;
                gb.e(param1 + param3.field_y, param3.field_z + param4, param3.field_u, param3.field_j, ((ee) this).field_j);
                if (var14 != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var7 = param3.field_y + (param1 - -var14.field_U);
                var8 = param4 + param3.field_z + var14.field_R;
                gb.f(var7, var8, var14.field_O, ((ee) this).field_c);
                if (-1 != var14.field_K) {
                  var9 = 3.141592653589793 * (double)var14.field_K * 2.0 / (double)var14.field_N;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_O);
                  gb.f(var7 + var11, var12 + var8, 1, ((ee) this).field_g);
                  break L3;
                } else {
                  break L3;
                }
              }
              gb.f(var7, var8, 2, 1);
              var9 = (double)var14.field_Q * 3.141592653589793 * 2.0 / (double)var14.field_N;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
              var12 = (int)(Math.cos(var9) * (double)var14.field_O);
              gb.d(var7, var8, var11 + var7, var8 + var12, 1);
              if (null != ((ee) this).field_d) {
                var13 = ((ee) this).field_a + var14.field_U - -var14.field_O;
                int discarded$1 = ((ee) this).field_d.a(param3.field_i, var13 + param3.field_y + param1, ((ee) this).field_f + param4 - -param3.field_z, param3.field_u + -var13 + -((ee) this).field_a, param3.field_j - (((ee) this).field_a << 1), ((ee) this).field_b, ((ee) this).field_e, 1, 1, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("ee.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            ee.a(55);
            field_k = null;
            return;
        }
        field_k = null;
    }

    ee(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((ee) this).field_b = param3;
            ((ee) this).field_d = param0;
            ((ee) this).field_f = param2;
            ((ee) this).field_g = param6;
            ((ee) this).field_j = param7;
            ((ee) this).field_e = param4;
            ((ee) this).field_c = param5;
            ((ee) this).field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Continue";
        field_i = true;
    }
}
