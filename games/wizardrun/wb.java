/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb implements bf {
    private int field_j;
    static String field_h;
    static int field_f;
    private vd field_d;
    private int field_b;
    private int field_k;
    static String field_a;
    private int field_g;
    private int field_c;
    private int field_e;
    private int field_i;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        int var1 = 20 % ((-69 - param0) / 50);
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        ug var15 = null;
        ub stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ub stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof ug)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ub) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ub) param2;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (ug) (Object) stackIn_3_0;
              if (var15 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ed.c(param2.field_o + param0, param2.field_l + param1, param2.field_r, param2.field_n, ((wb) this).field_g);
              var7 = var15.field_J + param0 - -param2.field_o;
              var8 = var15.field_L + param1 + param2.field_l;
              if (param3) {
                break L3;
              } else {
                var14 = null;
                ((wb) this).a(121, 51, (ub) null, true, false);
                break L3;
              }
            }
            L4: {
              ed.a(var7, var8, var15.field_G, ((wb) this).field_b);
              if (var15.field_K != -1) {
                var9 = (double)var15.field_K * 3.141592653589793 * 2.0 / (double)var15.field_O;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
                var12 = (int)(Math.cos(var9) * (double)var15.field_G);
                ed.a(var7 - -var11, var12 + var8, 1, ((wb) this).field_e);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ed.a(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var15.field_M * 2.0 / (double)var15.field_O;
              var11 = (int)(-Math.sin(var9) * (double)var15.field_G);
              var12 = (int)(Math.cos(var9) * (double)var15.field_G);
              ed.e(var7, var8, var7 + var11, var12 + var8, 1);
              if (((wb) this).field_d == null) {
                break L5;
              } else {
                var13 = var15.field_G + (var15.field_J + ((wb) this).field_k);
                int discarded$1 = ((wb) this).field_d.a(param2.field_k, var13 + (param2.field_o + param0), ((wb) this).field_j + (param1 + param2.field_l), param2.field_r - (var13 - -((wb) this).field_k), param2.field_n - (((wb) this).field_k << 1), ((wb) this).field_c, ((wb) this).field_i, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("wb.B(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    wb(vd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((wb) this).field_e = param6;
            ((wb) this).field_k = param1;
            ((wb) this).field_g = param7;
            ((wb) this).field_j = param2;
            ((wb) this).field_d = param0;
            ((wb) this).field_c = param3;
            ((wb) this).field_b = param5;
            ((wb) this).field_i = param4;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "wb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Press <%1> or UP";
        field_h = "Cancel";
    }
}
