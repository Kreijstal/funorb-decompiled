/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements io {
    private int field_a;
    private int field_l;
    private rb field_g;
    static fi field_m;
    static fi field_i;
    private int field_f;
    private int field_j;
    private int field_k;
    private int field_e;
    static int field_b;
    private int field_d;
    static int field_h;
    static int field_c;

    final static df a(boolean param0, int param1) {
        df var2;
        if (param0) {
          t.a(false, 81);
          var2 = new df();
          jj.field_D.a(0, var2);
          p.a(0, param1);
          return var2;
        } else {
          var2 = new df();
          jj.field_D.a(0, var2);
          p.a(0, param1);
          return var2;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param1 > 65) {
              L1: {
                L2: {
                  param2 = ic.a("", 0, param2, '_');
                  var3 = am.a(param2, 1);
                  if (param0.indexOf(param2) != -1) {
                    break L2;
                  } else {
                    if ((param0.indexOf(var3) ^ -1) == 0) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
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
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("t.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void b(int param0) {
        if (param0 != 27803) {
            field_b = -70;
            field_i = null;
            field_m = null;
            return;
        }
        field_i = null;
        field_m = null;
    }

    final static String a(int param0) {
        if (!(null != ce.field_r)) {
            return "";
        }
        if (param0 != 1) {
            return (String) null;
        }
        return ce.field_r;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        fp var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        try {
            var14 = param3 instanceof fp ? (fp) ((Object) param3) : null;
            bi.b(param3.field_k + param4, param3.field_j + param2, param3.field_i, param3.field_n, this.field_a);
            if (param0 != 16777215) {
                this.field_g = (rb) null;
            }
            if (var14 != null) {
            }
            var7 = var14.field_K + (param4 + param3.field_k);
            var8 = var14.field_G + param3.field_j + param2;
            bi.g(var7, var8, var14.field_I, this.field_j);
            if (-1 != var14.field_E) {
                var9 = 2.0 * (3.141592653589793 * (double)var14.field_E) / (double)var14.field_L;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
                var12 = (int)(Math.cos(var9) * (double)var14.field_I);
                bi.g(var11 + var7, var8 + var12, 1, this.field_d);
            }
            bi.g(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_J * 3.141592653589793) / (double)var14.field_L;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            bi.e(var7, var8, var7 + var11, var8 - -var12, 1);
            if (null != this.field_g) {
                var13 = this.field_e + (var14.field_I + var14.field_K);
                this.field_g.a(param3.field_o, var13 + param4 + param3.field_k, this.field_k + param3.field_j + param2, -this.field_e - (var13 - param3.field_i), param3.field_n - (this.field_e << -1077052639), this.field_l, this.field_f, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "t.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    t(rb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_g = param0;
            this.field_j = param5;
            this.field_k = param2;
            this.field_l = param3;
            this.field_d = param6;
            this.field_e = param1;
            this.field_f = param4;
            this.field_a = param7;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_b = 1 + (int)(9.0 * Math.sqrt(2.0));
    }
}
