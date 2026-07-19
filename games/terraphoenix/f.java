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
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gh var14 = null;
        gl stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl stackOut_2_0 = null;
        Object stackOut_1_0 = null;
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
              if (param1 instanceof gh) {
                stackOut_2_0 = (gl) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (gl) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (gh) ((Object) stackIn_3_0);
              l.f(param2 + param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, this.field_d);
              if (param3 == -24381) {
                break L2;
              } else {
                this.field_b = 13;
                break L2;
              }
            }
            L3: {
              if (var14 != null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = var14.field_R + (param2 + param1.field_w);
              var8 = param0 + param1.field_u - -var14.field_M;
              l.e(var7, var8, var14.field_Q, this.field_b);
              if ((var14.field_P ^ -1) != 0) {
                var9 = 3.141592653589793 * (double)var14.field_P * 2.0 / (double)var14.field_K;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
                var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
                l.e(var7 + var11, var8 - -var12, 1, this.field_l);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              l.e(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_N) / (double)var14.field_K;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_Q);
              var12 = (int)(Math.cos(var9) * (double)var14.field_Q);
              l.c(var7, var8, var7 - -var11, var12 + var8, 1);
              if (null == this.field_k) {
                break L5;
              } else {
                var13 = var14.field_Q + (var14.field_R - -this.field_c);
                discarded$1 = this.field_k.a(param1.field_o, var13 + (param1.field_w + param2), this.field_j + param0 - -param1.field_u, -this.field_c + (-var13 + param1.field_p), param1.field_n - (this.field_c << -108911807), this.field_e, this.field_f, 1, 1, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("f.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param1 < -48) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0.length() < na.field_Y) {
                    break L1;
                  } else {
                    if (param0.length() <= sl.field_e) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("f.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
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
