/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements fc {
    static jb field_f;
    private int field_e;
    static int[] field_j;
    private tj field_i;
    static int field_d;
    private int field_k;
    private int field_b;
    static tg field_c;
    private int field_g;
    private int field_a;
    private int field_h;
    private int field_l;

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        fh var15 = null;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof fh) {
                stackOut_2_0 = (lk) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lk) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var15 = (fh) ((Object) stackIn_3_0);
              if (var15 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              na.e(param4 - -param1.field_r, param0 + param1.field_i, param1.field_k, param1.field_m, this.field_l);
              var7 = param4 + param1.field_r - -var15.field_H;
              var8 = var15.field_D + param0 + param1.field_i;
              na.b(var7, var8, var15.field_I, this.field_k);
              if (var15.field_F == -1) {
                break L3;
              } else {
                var9 = 3.141592653589793 * (double)var15.field_F * 2.0 / (double)var15.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
                var12 = (int)(Math.cos(var9) * (double)var15.field_I);
                na.b(var7 - -var11, var8 + var12, 1, this.field_a);
                break L3;
              }
            }
            na.b(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var15.field_J * 2.0 / (double)var15.field_K;
            var13 = 77 % ((param2 - -60) / 56);
            var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
            var12 = (int)(Math.cos(var9) * (double)var15.field_I);
            na.a(var7, var8, var11 + var7, var12 + var8, 1);
            if (null != this.field_i) {
              var14 = var15.field_I + (var15.field_H - -this.field_h);
              discarded$1 = this.field_i.a(param1.field_h, param1.field_r + param4 - -var14, param0 - -param1.field_i + this.field_e, -this.field_h + (-var14 + param1.field_k), -(this.field_h << -1814982111) + param1.field_m, this.field_b, this.field_g, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("sj.B(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 < 15) {
            return;
        }
        field_f = null;
        field_c = null;
    }

    sj(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_i = param0;
            this.field_k = param5;
            this.field_l = param7;
            this.field_b = param3;
            this.field_e = param2;
            this.field_h = param1;
            this.field_a = param6;
            this.field_g = param4;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_d = -1;
    }
}
