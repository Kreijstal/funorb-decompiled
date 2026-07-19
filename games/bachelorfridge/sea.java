/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sea implements qda {
    private int field_l;
    private int field_i;
    private int field_a;
    static boolean field_j;
    private int field_m;
    private int field_b;
    private int field_n;
    private po field_c;
    private int field_h;
    private int field_e;
    private int field_f;
    static sna field_k;
    private int field_d;
    private int field_g;

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dia var11 = null;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        wj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param1 instanceof dia) {
                stackOut_2_0 = (wj) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (wj) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (dia) ((Object) stackIn_3_0);
              if (var11 != null) {
                param4 = param4 & var11.field_z;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (!param4) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              dg.c(param1.field_s + param0, param1.field_v + param3, param1.field_p, param1.field_q, this.field_e);
              var8 = param1.field_s + param0 - -this.field_h;
              var9 = this.field_a + param1.field_v + param3;
              dg.e(var8, var9, this.field_f, this.field_m, 5592405);
              dg.c(var8, var9, this.field_f, this.field_m, var7);
              if (param2 == 32679) {
                break L4;
              } else {
                sea.a((byte) 118);
                break L4;
              }
            }
            L5: {
              if (!var11.field_B) {
                break L5;
              } else {
                dg.d(var8, var9, var8 - -this.field_f, var9 + this.field_m, 1);
                dg.d(this.field_f + var8, var9, var8, this.field_m + var9, 1);
                break L5;
              }
            }
            L6: {
              if (this.field_c == null) {
                break L6;
              } else {
                var10 = this.field_n + (this.field_h + this.field_f);
                discarded$1 = this.field_c.a(param1.field_w, var10 + param1.field_s + param0, param1.field_v + (param3 - -this.field_b), -this.field_n + (-var10 + param1.field_p), param1.field_q - (this.field_n << 62705889), this.field_l, this.field_d, this.field_i, this.field_g, 0);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var6);
            stackOut_15_1 = new StringBuilder().append("sea.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -12) {
            return;
        }
        field_k = null;
    }

    sea(po param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_i = 1;
        this.field_g = 1;
        try {
            this.field_d = param4;
            this.field_f = param8;
            this.field_h = param5;
            this.field_c = param0;
            this.field_n = param1;
            this.field_l = param3;
            this.field_b = param2;
            this.field_a = param6;
            this.field_m = param7;
            this.field_e = param9;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "sea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
    }
}
