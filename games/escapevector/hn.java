/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn implements db {
    private int field_a;
    private int field_p;
    private int field_m;
    private int field_j;
    static mf field_h;
    static ig field_l;
    private int field_g;
    static hf field_q;
    static String field_f;
    private int field_e;
    static boolean field_n;
    private int field_k;
    private wl field_o;
    private int field_d;
    private int field_i;
    static int field_s;
    static ed field_c;
    private int field_r;
    private int field_t;
    static byte[][] field_b;

    final static int a(ih param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_b = (byte[][]) null;
                break L1;
              }
            }
            var2 = " ";
            var3 = param0.b(var2);
            stackIn_3_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("hn.A(");

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        hm stackIn_3_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bo var11 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof bo)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (hm) (param3);
                break L1;
              }
            }
            L2: {
              var11 = (bo) ((Object) stackIn_3_0);
              if (var11 != null) {
                param4 = param4 & var11.field_y;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              em.a(param0 + param3.field_k, param1 + param3.field_j, param3.field_g, param3.field_x, this.field_t);
              if (param4) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            var8 = param3.field_k + param0 - -this.field_e;
            if (param2 <= -14) {
              L4: {
                var9 = this.field_r + (param3.field_j + param1);
                em.e(var8, var9, this.field_a, this.field_k, 5592405);
                em.a(var8, var9, this.field_a, this.field_k, var7);
                if (var11.field_z) {
                  em.d(var8, var9, var8 + this.field_a, this.field_k + var9, 1);
                  em.d(var8 + this.field_a, var9, var8, this.field_k + var9, 1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (this.field_o == null) {
                  break L5;
                } else {
                  var10 = this.field_e + (this.field_a + this.field_g);
                  this.field_o.a(param3.field_l, var10 + param0 + param3.field_k, this.field_m + param3.field_j + param1, param3.field_g - (var10 + this.field_g), -(this.field_g << -1089808351) + param3.field_x, this.field_i, this.field_d, this.field_p, this.field_j, 0);
                  break L5;
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
          L6: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("hn.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_b = (byte[][]) null;
        field_f = null;
        if (param0 != -44) {
            return;
        }
        field_h = null;
        field_l = null;
        field_q = null;
        field_c = null;
    }

    hn(wl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_p = 1;
        this.field_j = 1;
        try {
            this.field_m = param2;
            this.field_k = param7;
            this.field_a = param8;
            this.field_r = param6;
            this.field_i = param3;
            this.field_o = param0;
            this.field_g = param1;
            this.field_d = param4;
            this.field_t = param9;
            this.field_e = param5;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = "Time: ";
        field_q = new hf();
    }
}
