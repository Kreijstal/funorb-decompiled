/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk implements ad {
    private int field_e;
    private int field_i;
    static int field_a;
    static boolean[] field_b;
    private int field_f;
    private int field_m;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_j;
    private int field_g;
    private int field_k;
    private int field_l;
    private we field_n;

    public static void a(byte param0) {
        int var1 = 93 / ((param0 - 30) / 58);
        field_b = null;
    }

    final static ln a(int param0) {
        ln var1 = null;
        if (param0 <= 76) {
          return (ln) null;
        } else {
          var1 = new ln(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], db.field_b[0], af.field_p);
          ec.a((byte) 24);
          return var1;
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ti var11 = null;
        fe stackIn_5_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        fe stackOut_3_0 = null;
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
            if (param0 == 12088) {
              L1: {
                if (!(param2 instanceof ti)) {
                  stackOut_4_0 = null;
                  stackIn_5_0 = (fe) ((Object) stackOut_4_0);
                  break L1;
                } else {
                  stackOut_3_0 = (fe) (param2);
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var11 = (ti) ((Object) stackIn_5_0);
                if (var11 == null) {
                  break L2;
                } else {
                  param4 = param4 & var11.field_E;
                  break L2;
                }
              }
              L3: {
                var7 = 5592405;
                eh.e(param2.field_u + param1, param3 - -param2.field_t, param2.field_v, param2.field_q, this.field_d);
                if (!param4) {
                  break L3;
                } else {
                  var7 = 16777215;
                  break L3;
                }
              }
              L4: {
                var8 = this.field_c + (param1 + param2.field_u);
                var9 = param2.field_t + param3 + this.field_f;
                eh.b(var8, var9, this.field_i, this.field_j, 5592405);
                eh.e(var8, var9, this.field_i, this.field_j, var7);
                if (!var11.field_H) {
                  break L4;
                } else {
                  eh.d(var8, var9, this.field_i + var8, var9 + this.field_j, 1);
                  eh.d(this.field_i + var8, var9, var8, var9 - -this.field_j, 1);
                  break L4;
                }
              }
              L5: {
                if (null == this.field_n) {
                  break L5;
                } else {
                  var10 = this.field_l + this.field_i + this.field_c;
                  discarded$1 = this.field_n.a(param2.field_s, param1 + param2.field_u + var10, this.field_k + param2.field_t + param3, -this.field_l + -var10 + param2.field_v, param2.field_q - (this.field_l << -1568029823), this.field_e, this.field_h, this.field_g, this.field_m, 0);
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
            stackOut_14_1 = new StringBuilder().append("mk.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int b(int param0) {
        if (param0 <= 2) {
            return 108;
        }
        return hb.field_b;
    }

    final static void a(boolean param0, wh param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ke.a(param1, param0, 256, false);
              if (param2 == 0) {
                break L1;
              } else {
                field_b = (boolean[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("mk.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    mk(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_m = 1;
        this.field_g = 1;
        try {
            this.field_c = param5;
            this.field_f = param6;
            this.field_i = param8;
            this.field_h = param4;
            this.field_e = param3;
            this.field_j = param7;
            this.field_n = param0;
            this.field_d = param9;
            this.field_k = param2;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_b = new boolean[64];
    }
}
