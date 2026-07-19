/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj implements ir {
    private int field_k;
    private int field_g;
    private hc field_l;
    private int field_o;
    private int field_h;
    static al[] field_c;
    private int field_i;
    static String field_e;
    static String field_a;
    private int field_m;
    private int field_b;
    private int field_j;
    private int field_f;
    private int field_d;
    private int field_n;

    final static int a(int param0, byte[] param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -117) {
                break L1;
              } else {
                var4 = (byte[]) null;
                discarded$2 = lj.a(-124, (byte[]) null, 84);
                break L1;
              }
            }
            stackOut_2_0 = cl.a(0, param1, param2, (byte) -105);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("lj.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sq var11 = null;
        ea stackIn_5_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param1 == -7592) {
              L1: {
                if (param3 instanceof sq) {
                  stackOut_4_0 = (ea) (param3);
                  stackIn_5_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = null;
                  stackIn_5_0 = (ea) ((Object) stackOut_3_0);
                  break L1;
                }
              }
              L2: {
                var11 = (sq) ((Object) stackIn_5_0);
                if (var11 == null) {
                  break L2;
                } else {
                  param0 = param0 & var11.field_u;
                  break L2;
                }
              }
              L3: {
                var7 = 5592405;
                vp.b(param2 - -param3.field_p, param4 - -param3.field_h, param3.field_q, param3.field_n, this.field_o);
                if (!param0) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                var8 = param2 - -param3.field_p + this.field_n;
                var9 = this.field_h + param4 + param3.field_h;
                vp.d(var8, var9, this.field_m, this.field_j, 5592405);
                vp.b(var8, var9, this.field_m, this.field_j, var7);
                if (!var11.field_s) {
                  break L4;
                } else {
                  vp.f(var8, var9, var8 + this.field_m, var9 - -this.field_j, 1);
                  vp.f(var8 + this.field_m, var9, var8, this.field_j + var9, 1);
                  break L4;
                }
              }
              L5: {
                if (null == this.field_l) {
                  break L5;
                } else {
                  var10 = this.field_m + (this.field_n - -this.field_f);
                  discarded$1 = this.field_l.a(param3.field_f, param2 + param3.field_p - -var10, param4 + (param3.field_h - -this.field_i), param3.field_q - (this.field_f + var10), param3.field_n - (this.field_f << -709448575), this.field_g, this.field_k, this.field_b, this.field_d, 0);
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
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("lj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        if (!param0) {
            lj.a(107);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (-33 <= (l.field_c ^ -1)) {
          ve.a((byte) 43, 0);
          if (param0 > 97) {
            return;
          } else {
            lj.a(true);
            return;
          }
        } else {
          L0: {
            var1 = l.field_c % 32;
            if (-1 == (var1 ^ -1)) {
              var1 = 32;
              break L0;
            } else {
              break L0;
            }
          }
          ve.a((byte) 43, l.field_c - var1);
          if (param0 > 97) {
            return;
          } else {
            lj.a(true);
            return;
          }
        }
    }

    lj(hc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_b = 1;
        this.field_d = 1;
        try {
            this.field_m = param8;
            this.field_h = param6;
            this.field_n = param5;
            this.field_f = param1;
            this.field_g = param3;
            this.field_o = param9;
            this.field_j = param7;
            this.field_l = param0;
            this.field_k = param4;
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_e = "Confirm Email:";
        field_a = "Try again";
    }
}
