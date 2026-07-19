/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb implements dh {
    static int[] field_l;
    static int field_b;
    static rh field_n;
    private int field_m;
    static String field_h;
    private int field_e;
    private m field_a;
    private int field_i;
    private int field_g;
    private int field_c;
    private int field_f;
    private int field_k;
    static wa field_j;
    static dm[] field_d;

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qb var14 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        el stackOut_1_0 = null;
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
              if (!(param4 instanceof qb)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (el) ((Object) stackOut_2_0);
                break L1;
              } else {
                stackOut_1_0 = (el) (param4);
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (qb) ((Object) stackIn_3_0);
              vb.a(param0 - -param4.field_v, param4.field_m + param2, param4.field_r, param4.field_h, this.field_f);
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = param4.field_v + param0 - -var14.field_E;
              var8 = param4.field_m + param2 - -var14.field_O;
              vb.d(var7, var8, var14.field_K, this.field_e);
              if (var14.field_J == -1) {
                break L3;
              } else {
                var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_H;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
                var12 = (int)(Math.cos(var9) * (double)var14.field_K);
                vb.d(var7 + var11, var8 - -var12, 1, this.field_g);
                break L3;
              }
            }
            vb.d(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_I) / (double)var14.field_H;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
            var12 = (int)(Math.cos(var9) * (double)var14.field_K);
            if (param1 <= -5) {
              L4: {
                vb.g(var7, var8, var11 + var7, var12 + var8, 1);
                if (this.field_a == null) {
                  break L4;
                } else {
                  var13 = this.field_c + (var14.field_E - -var14.field_K);
                  discarded$1 = this.field_a.a(param4.field_s, var13 + (param0 + param4.field_v), param2 - -param4.field_m - -this.field_i, param4.field_r - (this.field_c + var13), -(this.field_c << 1444492961) + param4.field_h, this.field_m, this.field_k, 1, 1, 0);
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
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("hb.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        if (param0 != 0) {
          field_h = (String) null;
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        } else {
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        }
    }

    hb(m param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_e = param5;
            this.field_f = param7;
            this.field_m = param3;
            this.field_a = param0;
            this.field_c = param1;
            this.field_k = param4;
            this.field_g = param6;
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = 0;
        field_h = "Play free version";
    }
}
