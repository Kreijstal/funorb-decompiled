/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg implements cg {
    private rf field_d;
    static int field_i;
    private int field_c;
    private int field_l;
    private int field_h;
    static int[] field_a;
    static boolean field_g;
    private int field_e;
    private int field_b;
    private int field_j;
    static int field_f;
    private int field_k;

    public static void a(byte param0) {
        if (param0 > -84) {
            field_i = 80;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (fa.d(0)) {
              discarded$12 = hg.field_S.a(jd.field_P, fl.field_f, true, 0);
              hg.field_S.b(false);
              L1: while (true) {
                if (!th.a(-109)) {
                  if (param0 == 2) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    field_f = -12;
                    return;
                  }
                } else {
                  discarded$13 = hg.field_S.a(di.field_c, sj.field_g, 121);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == df.field_l) {
                  break L2;
                } else {
                  if (df.field_l.field_h) {
                    af.b(6);
                    hg.field_S.a((byte) -115, (vg) (new ae(hg.field_S, uf.field_a)));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "lg.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1192215969;
        param1 = param1 | param1 >>> 1463303266;
        if (param0 != 2) {
          return -71;
        } else {
          param1 = param1 | param1 >>> 743783812;
          param1 = param1 | param1 >>> -350083224;
          param1 = param1 | param1 >>> 605771888;
          return 1 + param1;
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nd var14 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param2 instanceof nd) {
                stackOut_2_0 = (vg) (param2);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (vg) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var14 = (nd) ((Object) stackIn_3_0);
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            wj.f(param4 - -param2.field_o, param3 - -param2.field_m, param2.field_w, param2.field_k, this.field_e);
            var7 = var14.field_O + (param4 - -param2.field_o);
            var8 = var14.field_S + param3 - -param2.field_m;
            wj.b(var7, var8, var14.field_J, this.field_k);
            if (param1 >= 94) {
              L3: {
                if (var14.field_I != -1) {
                  var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_T;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_J);
                  wj.b(var7 + var11, var12 + var8, 1, this.field_c);
                  break L3;
                } else {
                  break L3;
                }
              }
              wj.b(var7, var8, 2, 1);
              var9 = 3.141592653589793 * (double)var14.field_N * 2.0 / (double)var14.field_T;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
              var12 = (int)(Math.cos(var9) * (double)var14.field_J);
              wj.g(var7, var8, var7 - -var11, var8 + var12, 1);
              if (null != this.field_d) {
                var13 = var14.field_J + (var14.field_O - -this.field_j);
                discarded$1 = this.field_d.a(param2.field_p, var13 + param2.field_o + param4, this.field_l + (param3 + param2.field_m), param2.field_w - this.field_j - var13, -(this.field_j << -785132607) + param2.field_k, this.field_b, this.field_h, 1, 1, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("lg.J(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    lg(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_e = param7;
            this.field_h = param4;
            this.field_j = param1;
            this.field_l = param2;
            this.field_k = param5;
            this.field_b = param3;
            this.field_c = param6;
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_g = false;
    }
}
