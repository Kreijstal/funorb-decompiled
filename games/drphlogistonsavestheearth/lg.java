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

    public static void a() {
        field_a = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            int discarded$18 = 0;
            if (fa.d()) {
              boolean discarded$19 = hg.field_S.a(jd.field_P, fl.field_f, true, 0);
              hg.field_S.b(false);
              L1: while (true) {
                if (!th.a(-109)) {
                  break L0;
                } else {
                  boolean discarded$20 = hg.field_S.a(di.field_c, sj.field_g, 121);
                  continue L1;
                }
              }
            } else {
              L2: {
                if (null == df.field_l) {
                  break L2;
                } else {
                  if (df.field_l.field_h) {
                    int discarded$21 = 6;
                    af.b();
                    hg.field_S.a((byte) -115, (vg) (Object) new ae(hg.field_S, uf.field_a));
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "lg.B(" + 2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        return 1 + param1;
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
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
                stackOut_2_0 = (vg) param2;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (vg) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (nd) (Object) stackIn_3_0;
              if (var14 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            wj.f(param4 - -param2.field_o, param3 - -param2.field_m, param2.field_w, param2.field_k, ((lg) this).field_e);
            var7 = var14.field_O + (param4 - -param2.field_o);
            var8 = var14.field_S + param3 - -param2.field_m;
            wj.b(var7, var8, var14.field_J, ((lg) this).field_k);
            if (param1 >= 94) {
              L3: {
                if (var14.field_I != -1) {
                  var9 = 3.141592653589793 * (double)var14.field_I * 2.0 / (double)var14.field_T;
                  var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
                  var12 = (int)(Math.cos(var9) * (double)var14.field_J);
                  wj.b(var7 + var11, var12 + var8, 1, ((lg) this).field_c);
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
              if (null != ((lg) this).field_d) {
                var13 = var14.field_J + (var14.field_O - -((lg) this).field_j);
                int discarded$1 = ((lg) this).field_d.a(param2.field_p, var13 + param2.field_o + param4, ((lg) this).field_l + (param3 + param2.field_m), param2.field_w - ((lg) this).field_j - var13, -(((lg) this).field_j << 1) + param2.field_k, ((lg) this).field_b, ((lg) this).field_h, 1, 1, 0);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("lg.J(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    lg(rf param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((lg) this).field_e = param7;
            ((lg) this).field_h = param4;
            ((lg) this).field_j = param1;
            ((lg) this).field_l = param2;
            ((lg) this).field_k = param5;
            ((lg) this).field_b = param3;
            ((lg) this).field_c = param6;
            ((lg) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "lg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = false;
    }
}
