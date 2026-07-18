/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg implements eb {
    private int field_j;
    private int field_c;
    private int field_f;
    static String field_i;
    static String field_b;
    static int field_g;
    private jl field_h;
    private int field_d;
    private int field_a;
    private int field_e;

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        int var1 = -35 / ((param0 - 19) / 58);
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tm var12 = null;
        ng stackIn_6_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ng stackOut_4_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -124) {
                break L1;
              } else {
                hg.a(-84);
                break L1;
              }
            }
            L2: {
              if (!(param0 instanceof tm)) {
                stackOut_5_0 = null;
                stackIn_6_0 = (ng) (Object) stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = (ng) param0;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var12 = (tm) (Object) stackIn_6_0;
              t.d(param0.field_z + param3, param2 + param0.field_p, param0.field_E, param0.field_C, ((hg) this).field_d);
              if (var12 != null) {
                break L3;
              } else {
                break L3;
              }
            }
            var7 = param0.field_E - 2 * var12.field_R;
            var8 = param3 + param0.field_z + var12.field_R;
            var9 = param2 + param0.field_p - -var12.field_T;
            t.b(var8, var9, var7 + var8, var9, ((hg) this).field_c);
            var10 = -1 + var12.f((byte) 62);
            L4: while (true) {
              if (var10 < 0) {
                if (null != ((hg) this).field_h) {
                  ((hg) this).field_h.b(var12.field_q, var7 / 2 + var8, ((hg) this).field_h.field_M + (var9 - -var12.field_T), ((hg) this).field_f, ((hg) this).field_j);
                  break L0;
                } else {
                  return;
                }
              } else {
                t.c(var8 - -(var7 * var12.a((byte) -91, var10) / var12.k(param1 + 123)), var9, ((hg) this).field_e, ((hg) this).field_a);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("hg.A(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    hg(jl param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((hg) this).field_c = param3;
            ((hg) this).field_j = param2;
            ((hg) this).field_d = param4;
            ((hg) this).field_h = param0;
            ((hg) this).field_f = param1;
            ((hg) this).field_a = param6;
            ((hg) this).field_e = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> has not yet unlocked this option for use.";
        field_b = "Rating";
        field_g = 50;
    }
}
