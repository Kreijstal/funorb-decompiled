/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f implements cj {
    private int field_c;
    private int field_j;
    private int field_b;
    private int field_f;
    private int field_d;
    private pk field_k;
    private int field_e;
    static int[] field_a;
    static bg[] field_i;
    private int field_l;
    static int field_g;
    static String field_h;

    public static void a(int param0) {
        field_h = null;
        field_i = null;
        field_a = null;
        if (param0 != -108911807) {
            field_g = -119;
        }
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        gh var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var14 = !(param1 instanceof gh) ? null : (gh) ((Object) param1);
            l.f(param2 + param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, this.field_d);
            if (param3 != -24381) {
                this.field_b = 13;
            }
            if (var14 == null) {
            }
            var7 = var14.field_R + (param2 + param1.field_w);
            var8 = param0 + param1.field_u - -var14.field_M;
            l.e(var7, var8, var14.field_Q, this.field_b);
            if (!((var14.field_P ^ -1) == 0)) {
                var9 = 3.141592653589793 * (double)var14.field_P * 2.0 / (double)var14.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
                var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
                l.e(var7 + var11, var8 - -var12, 1, this.field_l);
            }
            l.e(var7, var8, 2, 1);
            var9 = 2.0 * (3.141592653589793 * (double)var14.field_N) / (double)var14.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
            var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
            l.c(var7, var8, var7 - -var11, var12 + var8, 1);
            if (null != this.field_k) {
                var13 = var14.field_Q + (var14.field_R - -this.field_c);
                this.field_k.a(param1.field_o, var13 + (param1.field_w + param2), this.field_j + param0 - -param1.field_u, -this.field_c + (-var13 + param1.field_p), param1.field_n - (this.field_c << -108911807), this.field_e, this.field_f, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    f(pk param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_f = param4;
            this.field_e = param3;
            this.field_d = param7;
            this.field_l = param6;
            this.field_b = param5;
            this.field_c = param1;
            this.field_j = param2;
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -48) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length() < na.field_Y) {
                    break L1;
                  } else {
                    if (param0.length() <= sl.field_e) {
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("f.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    static {
        field_h = "    Allied soldier";
    }
}
