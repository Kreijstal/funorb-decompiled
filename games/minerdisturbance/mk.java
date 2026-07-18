/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk implements ad {
    private int field_e;
    private int field_i;
    static int field_a;
    static boolean[] field_b;
    private int field_f;
    private int field_m;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_j;
    private int field_g;
    private int field_k;
    private int field_l;
    private we field_n;

    public static void a() {
        int var1 = -46;
        field_b = null;
    }

    final static ln a(int param0) {
        ln var1 = new ln(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], db.field_b[0], af.field_p);
        ec.a((byte) 24);
        return var1;
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ti var11 = null;
        fe stackIn_5_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        fe stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param0 == 12088) {
              L1: {
                if (!(param2 instanceof ti)) {
                  stackOut_4_0 = null;
                  stackIn_5_0 = (fe) (Object) stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = (fe) param2;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var11 = (ti) (Object) stackIn_5_0;
                if (var11 == null) {
                  break L2;
                } else {
                  param4 = param4 & var11.field_E;
                  break L2;
                }
              }
              L3: {
                var7 = 5592405;
                eh.e(param2.field_u + param1, param3 - -param2.field_t, param2.field_v, param2.field_q, ((mk) this).field_d);
                if (!param4) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                var8 = ((mk) this).field_c + (param1 + param2.field_u);
                var9 = param2.field_t + param3 + ((mk) this).field_f;
                eh.b(var8, var9, ((mk) this).field_i, ((mk) this).field_j, 5592405);
                eh.e(var8, var9, ((mk) this).field_i, ((mk) this).field_j, var7);
                if (!var11.field_H) {
                  break L4;
                } else {
                  eh.d(var8, var9, ((mk) this).field_i + var8, var9 + ((mk) this).field_j, 1);
                  eh.d(((mk) this).field_i + var8, var9, var8, var9 - -((mk) this).field_j, 1);
                  break L4;
                }
              }
              L5: {
                if (null == ((mk) this).field_n) {
                  break L5;
                } else {
                  var10 = ((mk) this).field_l + ((mk) this).field_i + ((mk) this).field_c;
                  int discarded$1 = ((mk) this).field_n.a(param2.field_s, param1 + param2.field_u + var10, ((mk) this).field_k + param2.field_t + param3, -((mk) this).field_l + -var10 + param2.field_v, param2.field_q - (((mk) this).field_l << 1), ((mk) this).field_e, ((mk) this).field_h, ((mk) this).field_g, ((mk) this).field_m, 0);
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("mk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int b(int param0) {
        if (param0 <= 2) {
            return 108;
        }
        return hb.field_b;
    }

    final static void a(boolean param0, wh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          int discarded$4 = 0;
          int discarded$5 = 256;
          ke.a(param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("mk.D(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 0 + ')');
        }
    }

    mk(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((mk) this).field_m = 1;
        ((mk) this).field_g = 1;
        try {
            ((mk) this).field_c = param5;
            ((mk) this).field_f = param6;
            ((mk) this).field_i = param8;
            ((mk) this).field_h = param4;
            ((mk) this).field_e = param3;
            ((mk) this).field_j = param7;
            ((mk) this).field_n = param0;
            ((mk) this).field_d = param9;
            ((mk) this).field_k = param2;
            ((mk) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[64];
    }
}
