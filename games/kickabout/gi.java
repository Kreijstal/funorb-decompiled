/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends hd {
    private int field_Cb;
    private int field_Ab;
    private gr field_zb;
    int field_yb;
    static String field_Bb;

    final static boolean a(int param0, pt param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pt var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 140) {
                break L1;
              } else {
                gi.b(108);
                break L1;
              }
            }
            var4 = (pt) ((Object) ce.field_K.g(param0 ^ 23877));
            L2: while (true) {
              if (var4 == null) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4.a(param1, 5250)) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var4 = (pt) ((Object) ce.field_K.c(param0 ^ 173));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final boolean c(boolean param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (this.field_Ab != 0) {
            stackOut_2_0 = this.field_zb.field_R;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = this.field_zb.field_k;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0) {
          return false;
        } else {
          L1: {
            if (var2 != this.field_yb) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          return stackIn_7_0 != 0;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Kickabout.field_G;
          var2 = this.c(false) ? 1 : 0;
          var3 = this.field_F;
          var4 = this.field_T;
          if (var2 != 0) {
            var6 = -4 + var4;
            var5 = -4 + var3;
            var7 = 29;
            break L0;
          } else {
            var5 = var3;
            var7 = 21;
            var6 = var4;
            break L0;
          }
        }
        on.e(var5 - -1, var6, -2 + var7, var7, 0);
        on.e(var5, 1 + var6, var7, var7 + -2, 0);
        on.a(2 + var5, var6 + 2, -4 + var7, -4 + var7, this.field_Cb);
        if (var2 == 0) {
          if (!this.field_gb) {
            wt.field_z[0].b(var5 - -2, var6 + 2, 140);
            wt.field_z[1].b(var5 - -2, var6 + 2, 128);
            wt.field_z[3].c(2 + var5, 2 + var6, 128);
            on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
            on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
            on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
            return;
          } else {
            on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
            on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
            on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
            return;
          }
        } else {
          L1: {
            if (!this.field_gb) {
              wt.field_z[0].d(var5 - -2, var6 - -2, -4 + var7, var7 - 4, 140);
              wt.field_z[1].d(var5 + 2, var6 - -2, -4 + var7, -4 + var7, 128);
              wt.field_z[3].e(2 + var5, var6 + 2, -4 + var7, -4 + var7, 256);
              break L1;
            } else {
              break L1;
            }
          }
          su.field_a.c((-su.field_a.field_o + var7 >> -603192063) + var5, (var7 + -su.field_a.field_v >> -1443481887) + var6);
          on.c(var5 - -2, -3 + var7 + var6, -4 + var7, 0, 90);
          on.f(var5 - (-var7 + param0), 2 + var6, -5 + var7, 0, 90);
          on.f(2 + var5, 2 + var6, var7 + -5, 0, 90);
          return;
        }
    }

    public static void h(int param0) {
        field_Bb = null;
        if (param0 != -31922) {
            field_Bb = (String) null;
        }
    }

    gi(gr param0, int param1, int param2) {
        try {
            this.field_yb = param2;
            this.field_Ab = param1;
            this.field_zb = param0;
            this.field_Cb = t.field_l[ev.field_B[this.field_yb]];
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        wh var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            gp.b((byte) -28);
            var3 = (wh) ((Object) pn.field_z.g(24009));
            L1: while (true) {
              if (var3 == null) {
                if (param0 == 17702) {
                  break L0;
                } else {
                  gi.b(94);
                  return;
                }
              } else {
                var3.f((byte) -127);
                var3 = (wh) ((Object) pn.field_z.c(33));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "gi.B(" + param0 + ')');
        }
    }

    static {
        field_Bb = "Your email address is used to identify this account";
    }
}
