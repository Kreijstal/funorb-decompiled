/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug implements ci {
    private ee field_c;
    static int field_h;
    private int field_b;
    private int field_e;
    private int field_g;
    private int field_i;
    private int field_a;
    private int field_f;
    private int field_d;

    final static void a(float param0, int param1, String param2) {
        try {
            if (param1 <= 51) {
                String var4 = (String) null;
                ug.a(-0.46710100769996643f, 7, (String) null);
            }
            he.field_g = param0;
            ck.field_G = param2;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ug.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static jg a(je param0, int param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        jg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                var4 = (String) null;
                ug.a(-0.6929006576538086f, 125, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = new jg(param0, gd.field_m * param2 / 1000);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ug.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    ug(ee param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_f = param4;
            this.field_g = param7;
            this.field_a = param1;
            this.field_c = param0;
            this.field_e = param6;
            this.field_d = param2;
            this.field_b = param3;
            this.field_i = param5;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        se var14 = null;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof se)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (lk) (param1);
                break L1;
              }
            }
            L2: {
              var14 = (se) ((Object) stackIn_3_0);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              vj.c(param1.field_o + param0, param3 - -param1.field_i, param1.field_h, param1.field_q, this.field_g);
              var7 = param0 + param1.field_o + var14.field_E;
              var8 = param1.field_i + param3 + var14.field_M;
              vj.b(var7, var8, var14.field_H, this.field_i);
              if (-1 != var14.field_I) {
                var9 = (double)var14.field_I * 3.141592653589793 * 2.0 / (double)var14.field_N;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_H);
                var12 = (int)(Math.cos(var9) * (double)var14.field_H);
                vj.b(var11 + var7, var8 + var12, 1, this.field_e);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              vj.b(var7, var8, 2, 1);
              var9 = (double)var14.field_L * 3.141592653589793 * 2.0 / (double)var14.field_N;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_H);
              var12 = (int)(Math.cos(var9) * (double)var14.field_H);
              if (param2 == 11447) {
                break L4;
              } else {
                this.field_f = -46;
                break L4;
              }
            }
            vj.e(var7, var8, var11 + var7, var12 + var8, 1);
            if (this.field_c != null) {
              var13 = this.field_a + (var14.field_H + var14.field_E);
              this.field_c.a(param1.field_r, param1.field_o + param0 + var13, this.field_d + param3 + param1.field_i, param1.field_h - var13 + -this.field_a, -(this.field_a << -273569375) + param1.field_q, this.field_b, this.field_f, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ug.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_h = -1;
    }
}
