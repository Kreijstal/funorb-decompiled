/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb implements uk {
    private int field_r;
    private int field_j;
    private int field_p;
    static String[] field_k;
    private int field_o;
    private int field_e;
    private int field_a;
    static int field_d;
    static String field_h;
    private int field_q;
    private int field_b;
    private bd field_g;
    static li field_m;
    private int field_n;
    private int field_i;
    static String field_l;
    static String field_f;
    private int field_c;

    public static void a(boolean param0) {
        field_h = null;
        field_f = null;
        field_l = null;
        field_k = null;
        if (param0) {
            bb.a(true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nd var11 = null;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        rj stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof nd)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (rj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (rj) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (nd) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param0 = param0 & var11.field_E;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param0) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              ti.f(param3.field_w + param1, param3.field_k + param2, param3.field_p, param3.field_t, ((bb) this).field_i);
              var8 = param1 + (param3.field_w + ((bb) this).field_e);
              if (param4 == 4549) {
                break L4;
              } else {
                field_h = null;
                break L4;
              }
            }
            L5: {
              var9 = param2 + (param3.field_k - -((bb) this).field_j);
              ti.e(var8, var9, ((bb) this).field_b, ((bb) this).field_r, 5592405);
              ti.f(var8, var9, ((bb) this).field_b, ((bb) this).field_r, var7);
              if (var11.field_z) {
                ti.a(var8, var9, var8 + ((bb) this).field_b, var9 - -((bb) this).field_r, 1);
                ti.a(var8 + ((bb) this).field_b, var9, var8, ((bb) this).field_r + var9, 1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((bb) this).field_g == null) {
                break L6;
              } else {
                var10 = ((bb) this).field_q + (((bb) this).field_e + ((bb) this).field_b);
                int discarded$1 = ((bb) this).field_g.a(param3.field_m, param1 - (-param3.field_w - var10), param2 - -param3.field_k - -((bb) this).field_c, param3.field_p - (var10 + ((bb) this).field_q), -(((bb) this).field_q << 1) + param3.field_t, ((bb) this).field_o, ((bb) this).field_a, ((bb) this).field_n, ((bb) this).field_p, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var6;
            stackOut_15_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
    }

    final static nf a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        nf var9 = null;
        RuntimeException var9_ref = null;
        nf stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf stackOut_2_0 = null;
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
            var9 = new nf(5, 65530, param3, param1, param8, param2, param5);
            wb.field_f.b(-113, (gg) (Object) var9);
            int discarded$2 = 80;
            ea.a(3, var9);
            stackOut_2_0 = (nf) var9;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9_ref;
            stackOut_4_1 = new StringBuilder().append("bb.B(").append(5).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param5 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 65530 + ',' + 0 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    bb(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((bb) this).field_p = 1;
        ((bb) this).field_n = 1;
        try {
            ((bb) this).field_e = param5;
            ((bb) this).field_r = param7;
            ((bb) this).field_a = param4;
            ((bb) this).field_g = param0;
            ((bb) this).field_i = param9;
            ((bb) this).field_j = param6;
            ((bb) this).field_q = param1;
            ((bb) this).field_c = param2;
            ((bb) this).field_b = param8;
            ((bb) this).field_o = param3;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Orb points: <%0>";
        field_l = "Cancel";
        field_m = new li(8, 0, 4, 1);
        field_f = "Press escape for menu";
    }
}
