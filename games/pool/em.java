/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class em extends ob {
    static String field_O;
    static int field_I;
    static boolean field_K;
    static kh field_L;
    static int field_P;
    static ao field_J;
    static boolean field_N;
    static dd field_M;

    private final boolean g(int param0, int param1) {
        int var3;
        int var4;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_26_0 = false;
        boolean stackIn_30_0 = false;
        var4 = Pool.field_O;
        if (param1 != 53) {
          return true;
        }
        var3 = this.field_h[param0];
        if (14 == var3) {
          stackIn_14_0 = (hd.field_J == 0);
          return stackIn_14_0;
        }
        if (var3 == 15) {
          stackIn_18_0 = (hd.field_J == 1);
          return stackIn_18_0;
        }
        if (var3 == 16) {
          stackIn_22_0 = (hd.field_J == 2);
          return stackIn_22_0;
        }
        if (52 == var3) {
          stackIn_26_0 = (0 == fd.field_O);
          return stackIn_26_0;
        }
        stackIn_30_0 = (var3 == 53) && (1 == fd.field_O);
        return stackIn_30_0;
    }

    private final void i(int param0) {
        int stackIn_13_0;
        int stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        int stackIn_14_4 = 0;
        String var2;
        String[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        String var10;
        int var11;
        int[] var15;
        int var7Lifetime1;
        var11 = Pool.field_O;
        if (null == eq.field_V) {
          eq.field_V = jf.a(-112, 1, fd.field_O, 3, 10);
        }
        L1: {
          if (eq.field_V.field_u) {
            if (null != eq.field_V.field_m) {
              nj.a(vk.field_y, (byte) -87, 320, 160, 160, 165 + ni.field_Z.field_G + 16);
              var2 = ni.field_S;
              var3 = eq.field_V.field_m[hd.field_J];
              var15 = eq.field_V.field_z[hd.field_J];
              var5 = 180;
              ni.field_Z.b(vi.field_b, 438, var5, 15658734, -1);
              var5 = var5 + (ni.field_Z.field_C + 8);
              var6 = lc.a(hd.field_J, param0 ^ -3, eq.field_V, ti.field_d);
              for (var7 = 0; var7 < 10; var7++) {
                if (null != var3[var7]) {
                  stackIn_13_0 = 162;
                  stackIn_13_1 = -sa.field_h.field_C + var5;
                  stackIn_13_2 = 316;
                  stackIn_13_3 = 15;
                  if ((1 & var7) == 0) {
                    stackIn_14_4 = 4475508;
                  } else {
                    stackIn_14_4 = 4146281;
                  }
                  qh.f(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3, stackIn_14_4);
                  var8 = 15658734;
                  var9 = var15[var7];
                  if (var7 == var6) {
                    var8 = 16764057;
                  }
                  var10 = var3[var7];
                  sa.field_h.c(var7 + 1 + ". ", 190, var5, var8, -1);
                  sa.field_h.d(var10, 190, var5, var8, -1);
                  var2 = "";
                  sa.field_h.b(lh.b(-var9, (byte) -80), 440, var5, var8, -1);
                }
                var5 += 15;
              }
              if (((null != ti.field_d)) &&
                (!(0 <= var6)) &&
                ((ti.field_d.field_l == fd.field_O))) {
                var7Lifetime1 = ti.field_d.field_z[0];
                sa.field_h.d(di.field_j, 190, var5, 16764057, -1);
                sa.field_h.b(lh.b(-var7Lifetime1, (byte) -80), 440, var5, 16764057, -1);
              }
              break L1;
            }
            var2 = fh.field_a;
          } else {
            var2 = cl.field_j;
          }
        }
        sa.field_h.b(var2, qh.field_l >> 1, 202, 16777215, -1);
        if (param0 != -3) {
          field_P = -127;
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 6402) {
          field_K = true;
        }
        if (param0 >= 3) {
          return super.a(param0, 6402);
        }
        return 0;
    }

    private final void f(int param0) {
        if (param0 != 2931) {
          field_N = false;
        }
    }

    em(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(lk.field_w, param0, param1, param2, param3, param4, param5);
    }

    final void e(byte param0) {
        eq.field_V = null;
        if (param0 != -6) {
          field_J = (ao) null;
        }
    }

    final int d(int param0, int param1) {
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 != 0) {
          return 97;
        }
        L0: {
          if (!hk.b(35)) {
            var3 = param1;
            if (var3 != 0 &&
              1 != var3) {
              switch (var3) {
                case 2:
                  return param1 * 140 + 120;
                case 3:
                  return 60;
                case 4:
                  return 170;
                default:
                  break L0;
                case 5:
                  return 380;
              }
            }
            return param1 * 140 + 120;
          }
        }
        return param1 * 350 + 80;
    }

    final void e(int param0) {
        if (hk.b(param0 + 37)) {
          super.e(-34);
        } else {
          if (qi.field_a == 96) {
            this.field_B.a(this.field_B.field_h / 3 * 3 + (this.field_B.field_h + 2) % 3, (byte) 1);
          }
          if (qi.field_a == 97) {
            this.field_B.a(3 * (this.field_B.field_h / 3) + (this.field_B.field_h + 1) % 3, (byte) 1);
          }
          if (qi.field_a == 99 ||
            qi.field_a == 98) {
            this.field_B.a((this.field_B.field_h + 3) % 6, (byte) 1);
          }
          this.field_B.a(false);
        }
        if (param0 != -34) {
          field_I = -119;
        }
    }

    final static int a(float param0, int param1) {
        if (param1 != -4) {
          field_P = -95;
        }
        return j.a(16, param0, (byte) 127);
    }

    final int a(byte param0, int param1) {
        if (param0 != 69) {
          em.a(93, (byte) -1, 126);
        }
        if (!hk.b(param0 - 178) &&
          param1 < 3) {
          return 24;
        }
        return 36;
    }

    final static void a(byte param0, boolean param1, int param2, String param3) {
        if (param0 < 116) {
          return;
        }
        try {
          n.a(8, param3, param1 ? 13421772 : 16762114, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "em.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(int param0) {
        if (param0 != 36) {
          em.a(4, (byte) -14, 28);
        }
        return 1900 + new Date().getYear();
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener(wn.field_a);
        if (param1 != -39) {
          return;
        }
        try {
          param0.removeFocusListener(wn.field_a);
          qq.field_xb = -1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "em.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final dd a(String param0, int param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        dd stackIn_5_0 = null;
        dd stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_N = false;
          }
          if (!hk.b(36) &&
            3 > param3) {
            var6 = mc.field_e.field_U[param1];
            var5 = var6;
            stackIn_5_0 = ag.a((byte) 89, var6[var6.length >> 1], param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = super.a(param0, param1, 0, param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("em.PA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (!hk.b(72)) {
          if (param1 < 3) {
            return 120 + this.d(0, param1);
          }
          if (param1 == 3) {
            return this.d(0, param1) + 100;
          }
          return this.d(0, param1) + 200;
        }
        if (param0) {
          return -81;
        }
        if (param1 == 0) {
          return 340 + this.d(0, param1);
        }
        if (1 == param1) {
          return this.d(0, param1) + 130;
        }
        return this.d(0, param1) + 140;
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
          field_K = true;
        }
        if (!hk.b(-5)) {
          if (param1 < 3) {
            return 130;
          }
          return 390;
        }
        return 390;
    }

    final static void a(int param0, byte param1, int param2) {
        oq var3 = ej.field_j;
        var3.b(false, param2);
        if (param1 > -103) {
          em.a(-22, (byte) -114, 4);
        }
        var3.a(3, false);
        var3.a(8, false);
        var3.a((byte) -81, param0);
    }

    final void c(int param0) {
        super.c(105);
        if (hk.b(95)) {
          this.f(2931);
        } else {
          this.i(-3);
        }
        if (param0 <= 36) {
          field_P = -120;
        }
        String var2 = !hk.b(66) ? va.field_P : ra.field_a;
        sa.field_h.b(var2, 320, 380, 15658734, -1);
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.field_h[param2];
        if (var4 == 14) {
          if (this.field_B.b((byte) 84)) {
            hd.field_J = 0;
          }
        } else {
          if (var4 == 15) {
            if (this.field_B.b((byte) 59)) {
              hd.field_J = 1;
            }
          } else {
            if (var4 == 16) {
              if (this.field_B.b((byte) 91)) {
                hd.field_J = 2;
              }
            } else {
              if (52 == var4) {
                if (this.field_B.b((byte) 82)) {
                  eq.field_V = null;
                  fd.field_O = 0;
                }
              } else {
                if (53 == var4) {
                  if (this.field_B.b((byte) 62)) {
                    fd.field_O = 1;
                    eq.field_V = null;
                  }
                } else {
                  if (var4 != 23) {
                    super.b(-16470, param1, param2);
                  } else {
                    if (this.field_B.b((byte) 93)) {
                      nk.a(pl.field_d, this.field_E, (byte) 83);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 != -16470) {
          field_O = (String) null;
        }
    }

    final static void a(String[] args, int param1, int param2, boolean param3, di param4, int param5, di param6, byte[] param7, int[] param8, di param9, String[][] param10, String[] param11, byte[] param12, qb[] param13, String[] param14, dd[][] param15, String[][] param16, byte param17, dd[][] param18, int[] param19) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var20_int = 0;
        RuntimeException var20 = null;
        try {
          ap.a(param4, false, param13, param8, param9);
          wo.a(1, param9);
          rn.a(param10, param14, args, param2, (byte) 60, param12, param18, param15, param1, param5, param11, param19, param16, param7, param9);
          jk.a(param3, false, param9, param6);
          ef.a(-74);
          var20_int = -118 % ((26 - param17) / 52);
          cn.a(-119);
          ho.c((byte) -22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_4_0 = var20;
          stackIn_4_1 = new StringBuilder().append("em.SA(");
          if (args == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param8 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param9 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param10 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param11 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param12 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param13 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param14 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param16 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param19 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final dd[] b(int param0, int param1) {
        if (param1 != -34) {
          field_J = (ao) null;
        }
        return this.g(param0, 53) ? ln.field_s : super.b(param0, -34);
    }

    public static void g(int param0) {
        int var1 = 31 % ((param0 + 47) / 54);
        field_M = null;
        field_J = null;
        field_L = null;
        field_O = null;
    }

    static {
        field_I = 0;
        field_O = "To aim, drag <img=2> or <img=9><img=0>, or use <img=5>/<img=6>, or <img=13>/<img=15>.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c9c3307e6488(int param0, boolean param1, int param2, String param3) {
        if (param0 < 116) {
          return;
        }
        try {
          n.a(8, param3, param1 ? 13421772 : 16762114, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "em.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }
}
