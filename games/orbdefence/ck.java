/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck implements td {
    private int field_a;
    private int field_i;
    static String[] field_h;
    static qg[] field_n;
    private int field_l;
    static kc field_g;
    static String field_k;
    static int field_f;
    static long field_e;
    private int field_b;
    private int field_o;
    static rf field_j;
    private int field_d;
    static hj[] field_c;
    private kc field_m;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ue var12 = null;
        pj stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        pj stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof ue)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (pj) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (pj) param2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (ue) (Object) stackIn_4_0;
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ul.h(param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, ((ck) this).field_o);
              var7 = -(var12.field_I * 2) + param2.field_m;
              var8 = param2.field_s + param1 + var12.field_I;
              if (param3 == -4394) {
                break L3;
              } else {
                field_j = null;
                break L3;
              }
            }
            var9 = param2.field_n + (param0 - -var12.field_L);
            ul.b(var8, var9, var7 + var8, var9, ((ck) this).field_d);
            var10 = -1 + var12.a((byte) -90);
            L4: while (true) {
              if (var10 < 0) {
                if (null == ((ck) this).field_m) {
                  break L0;
                } else {
                  ((ck) this).field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + ((ck) this).field_m.field_z + var9, ((ck) this).field_l, ((ck) this).field_i);
                  return;
                }
              } else {
                ul.f(var8 - -(var7 * var12.a(-1, var10) / var12.j(1)), var9, ((ck) this).field_b, ((ck) this).field_a);
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
            stackOut_13_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw dd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        field_k = null;
        field_h = null;
        field_c = null;
    }

    ck(kc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((ck) this).field_i = param2;
            ((ck) this).field_o = param4;
            ((ck) this).field_l = param1;
            ((ck) this).field_d = param3;
            ((ck) this).field_a = param6;
            ((ck) this).field_m = param0;
            ((ck) this).field_b = param5;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ck.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_k = ",";
    }
}
