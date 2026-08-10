/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements rd {
    static jb[] field_a;
    static String field_i;
    private int field_k;
    private int field_j;
    private int field_f;
    private int field_h;
    private int field_l;
    private le field_c;
    static String field_b;
    private int field_e;
    static int[] field_g;
    private int field_d;

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        ae var14 = !(param3 instanceof ae) ? null : (ae) ((Object) param3);
        if (var14 == null) {
        }
        if (param4 != -3284) {
            return;
        }
        try {
            lf.a(param1 - -param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, this.field_j);
            var7 = var14.field_L + (param1 + param3.field_t);
            var8 = var14.field_F + (param3.field_o + param0);
            lf.c(var7, var8, var14.field_I, this.field_k);
            if (0 != (var14.field_H ^ -1)) {
                var9 = 3.141592653589793 * (double)var14.field_H * 2.0 / (double)var14.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                lf.c(var11 + var7, var8 - -var12, 1, this.field_h);
            }
            lf.c(var7, var8, 2, 1);
            var9 = (double)var14.field_G * 3.141592653589793 * 2.0 / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            lf.b(var7, var8, var11 + var7, var8 - -var12, 1);
            if (null != this.field_c) {
                var13 = var14.field_L - (-var14.field_I + -this.field_d);
                this.field_c.a(param3.field_u, var13 + (param1 + param3.field_t), param3.field_o + param0 + this.field_f, param3.field_j + -this.field_d + -var13, param3.field_v - (this.field_d << 784973377), this.field_e, this.field_l, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ib.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_i = null;
        field_g = null;
        if (!param0) {
            return;
        }
        ib.a(true);
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param4 < -36) {
          param2--;
          L0: while (true) {
            if (param2 < 0) {
              return;
            } else {
              try {
                L1: {
                  var9 = param1;
                  var5 = var9;
                  var6 = param0;
                  var7 = param3;
                  var9[var6] = (vg.a(var9[var6], 16711422) >> -334453343) + var7;
                  param0++;
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var5_ref = decompiledCaughtException;
                  stackIn_10_0 = (RuntimeException) (var5_ref);

                  stackIn_10_1 = new StringBuilder().append("ib.C(").append(param0).append(',');

                  if (param1 == null) {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    break L2;
                  } else {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "{...}";
                    break L2;
                  }
                }
                throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
              }
              param2--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    ib(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param6;
            this.field_k = param5;
            this.field_c = param0;
            this.field_d = param1;
            this.field_j = param7;
            this.field_e = param3;
            this.field_f = param2;
            this.field_l = param4;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_i = "The account name you use to access RuneScape and other Jagex.com games";
        field_g = new int[]{0, 0, 0, 10, 40, 125, 250, 500, 1000};
    }
}
