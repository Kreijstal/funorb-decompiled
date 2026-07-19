/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh implements uk {
    private int field_b;
    private int field_g;
    private int field_e;
    private int field_f;
    private bd field_c;
    private int field_i;
    private int field_h;
    private int field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 25434) {
            field_d = (String) null;
        }
    }

    hh(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_g = param4;
            this.field_f = param3;
            this.field_a = param6;
            this.field_c = param0;
            this.field_e = param2;
            this.field_h = param7;
            this.field_b = param1;
            this.field_i = param5;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fg var14 = null;
        rj stackIn_5_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_4_0 = null;
        Object stackOut_3_0 = null;
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
            if (param4 == 4549) {
              L1: {
                if (param3 instanceof fg) {
                  stackOut_4_0 = (rj) (param3);
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = null;
                  stackIn_5_0 = (rj) ((Object) stackOut_3_0);
                  break L1;
                }
              }
              L2: {
                var14 = (fg) ((Object) stackIn_5_0);
                if (var14 != null) {
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                ti.f(param1 + param3.field_w, param2 - -param3.field_k, param3.field_p, param3.field_t, this.field_h);
                var7 = var14.field_L + (param3.field_w + param1);
                var8 = var14.field_F + (param2 - -param3.field_k);
                ti.e(var7, var8, var14.field_I, this.field_i);
                if ((var14.field_H ^ -1) != 0) {
                  var9 = 2.0 * ((double)var14.field_H * 3.141592653589793) / (double)var14.field_N;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                  ti.e(var7 - -var11, var8 - -var12, 1, this.field_a);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                ti.e(var7, var8, 2, 1);
                var9 = 3.141592653589793 * (double)var14.field_J * 2.0 / (double)var14.field_N;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                ti.a(var7, var8, var11 + var7, var8 + var12, 1);
                if (this.field_c == null) {
                  break L4;
                } else {
                  var13 = this.field_b + var14.field_I + var14.field_L;
                  discarded$1 = this.field_c.a(param3.field_m, var13 + (param1 - -param3.field_w), this.field_e + (param3.field_k + param2), -var13 + (-this.field_b + param3.field_p), param3.field_t - (this.field_b << -118878591), this.field_f, this.field_g, 1, 1, 0);
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("hh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "Level: <%0>";
    }
}
