/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h implements nn {
    static String field_f;
    private int field_g;
    private int field_a;
    private int field_c;
    static kb field_b;
    private int field_e;
    private int field_h;
    private vm field_d;
    private int field_i;

    public static void a() {
        field_f = null;
        field_b = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tb var12 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ag stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof tb)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (ag) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (ag) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (tb) (Object) stackIn_4_0;
              si.c(param1 + param3.field_v, param3.field_m + param0, param3.field_s, param3.field_x, ((h) this).field_g);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param3.field_s - var12.field_G * 2;
              var8 = var12.field_G + param1 - -param3.field_v;
              var9 = var12.field_H + param0 + param3.field_m;
              si.g(var8, var9, var8 - -var7, var9, ((h) this).field_a);
              if (param2 == 15430) {
                break L3;
              } else {
                field_f = null;
                break L3;
              }
            }
            var10 = var12.a((byte) 65) + -1;
            L4: while (true) {
              if (var10 < 0) {
                if (null == ((h) this).field_d) {
                  break L0;
                } else {
                  ((h) this).field_d.b(var12.field_n, var8 - -(var7 / 2), var12.field_H + var9 + ((h) this).field_d.field_u, ((h) this).field_c, ((h) this).field_i);
                  return;
                }
              } else {
                si.e(var8 + var12.a(var10, -24584) * var7 / var12.j(11884), var9, ((h) this).field_h, ((h) this).field_e);
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
            stackOut_13_1 = new StringBuilder().append("h.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    h(vm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((h) this).field_h = param5;
            ((h) this).field_g = param4;
            ((h) this).field_c = param1;
            ((h) this).field_d = param0;
            ((h) this).field_e = param6;
            ((h) this).field_i = param2;
            ((h) this).field_a = param3;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<col=ffffff>Close-range<nbsp>assault<nbsp>gun</col><br>The C.R.A.G. provides heavy stopping power for dealing with nearby targets. Accuracy and damage at range is very low.";
    }
}
