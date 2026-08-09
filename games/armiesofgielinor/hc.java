/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hc {
    private tu field_l;
    private int field_h;
    static int[][] field_o;
    static String field_d;
    private int field_a;
    static int field_b;
    private String[] field_k;
    private int[] field_j;
    static int field_e;
    static String field_w;
    private int field_g;
    private r field_p;
    static boolean field_i;
    private ia field_n;
    private int field_r;
    private wk[] field_c;
    private wk[] field_v;
    static int field_q;
    private int field_t;
    private r field_x;
    private int field_s;
    private ia field_u;
    private String[] field_m;
    private sh field_f;

    private final void e(byte param0) {
        if (this.field_p.g(260)) {
            this.field_x.f((byte) 126);
            this.field_p.f((byte) 127);
        } else {
            if (!(!this.field_x.g(260))) {
                this.field_p.f((byte) -53);
                this.field_x.f((byte) 1);
            }
        }
        if (param0 != -25) {
            this.field_s = 40;
            return;
        }
    }

    private final void a(int param0, byte param1) {
        int discarded$0 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_a = param0;
        this.field_p.b(0, this.field_a);
        this.field_f.a(0, this.field_a);
        this.field_f.a(true);
        this.field_m = new String[pt.field_W.length - -1];
        int var3 = 0;
        if (param1 != 39) {
            discarded$0 = this.a(-92, 45);
        }
        while (pt.field_W.length > var3) {
            this.field_m[var3] = pt.field_W[var3];
            var3++;
        }
        this.field_m[pt.field_W.length] = "special";
        this.field_x.a(this.field_m, -29799);
        this.a(false, 0);
    }

    private final void c(int param0) {
        if (param0 <= 116) {
            this.e((byte) -94);
        }
        if (!(!br.field_f[96])) {
            this.field_t = this.field_t + 5;
        }
        if (!(!br.field_f[97])) {
            this.field_t = this.field_t - 5;
        }
        if (!(!br.field_f[98])) {
            this.field_r = this.field_r + 2;
        }
        if (!(!br.field_f[99])) {
            this.field_r = this.field_r - 2;
        }
    }

    private final void b(byte param0) {
        int var2 = this.field_p.h(5);
        if (var2 == this.field_a) {
            return;
        }
        this.a(var2, (byte) 39);
        if (param0 != 111) {
            return;
        }
    }

    private final void a(boolean param0) {
        if (param0) {
            this.field_v = (wk[]) null;
        }
        int var2 = so.field_b.field_a >> -1260475487;
        int var3 = -this.field_l.field_H + (so.field_b.field_g + -(this.field_l.field_L << -296222751));
        int var4 = this.field_j[0];
        this.field_l.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final int a(byte param0, int param1) {
        if (param0 != -47) {
            this.field_s = 67;
        }
        if (!(param1 != 0)) {
            return this.field_n.a((byte) -50);
        }
        if (!(-2 != (param1 ^ -1))) {
            return this.field_p.e(true);
        }
        if (!((param1 ^ -1) != -3)) {
            return this.field_u.a((byte) -11);
        }
        if ((param1 ^ -1) == -4) {
            return this.field_x.e(true);
        }
        return 0;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        this.a(param2 ^ 9, param3, param4);
        if (param2 != 8) {
            this.field_g = 40;
        }
        if (this.field_p.g(param2 ^ 268)) {
            this.field_p.a(param0, -18596, param3, param4, param1, param5);
        }
        if (this.field_x.g(260)) {
            this.field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
        }
        if (this.field_p.a((byte) 111) || this.field_x.a((byte) 74)) {
            this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
            return;
        }
    }

    private final int a(int param0, int param1) {
        if (!(param1 != 0)) {
            return this.field_n.c(-29408);
        }
        if (!(1 != param1)) {
            return this.field_p.n(-18332);
        }
        if (!(-3 != (param1 ^ -1))) {
            return this.field_u.c(-29408);
        }
        int var3 = 19 % ((39 - param0) / 62);
        if ((param1 ^ -1) != -4) {
            return 0;
        }
        return this.field_x.n(-18332);
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        this.a(param2, param1, 8, param4, param3, param5);
        if (param0 <= 66) {
            this.a(true);
        }
        this.b((byte) 111);
        this.a(125);
        this.a((byte) -95);
    }

    final static char a(int param0, char param1) {
        L0: {
          if (param1 == 181) {
            break L0;
          } else {
            if (param1 == 402) {
              break L0;
            } else {
              L1: {
                if (param0 == 98) {
                  break L1;
                } else {
                  hc.a(39, 'ﾫ');
                  break L1;
                }
              }
              return Character.toTitleCase(param1);
            }
          }
        }
        return param1;
    }

    public static void b(int param0) {
        field_o = (int[][]) null;
        field_w = null;
        field_d = null;
        if (param0 != 1017) {
            hc.b(44);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        ne var3 = null;
        jd var4 = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                hc.a(-115, false);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= vs.field_e.length) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var3 = vs.field_e[var2_int];
                  var4 = var3.field_c;
                  if (var4 == null) {
                    break L3;
                  } else {
                    if (param0 != var4.field_O) {
                      break L3;
                    } else {
                      kl.field_a.a((byte) 53, var2_int);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "hc.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        qn.b();
        this.field_n.a(71);
        this.field_u.a(45);
        this.field_l.c("shift: " + nh.field_D[this.field_a], 480, 230, 16777215, -1);
        this.field_l.c("model ID: " + sf.field_P[this.field_a], 480, 242, 16777215, -1);
        this.a(false);
        this.e((byte) -25);
        this.field_f.e((byte) 109);
        if (param0 > -52) {
            return;
        }
    }

    private final void a(byte param0) {
        this.c(127);
        if (param0 >= -30) {
            hc.a(-57, true);
        }
        this.field_f.a(this.field_r, 1, this.field_h, -29001, this.field_t, this.field_s);
        this.field_f.b(-19812);
    }

    private final int b(int param0, int param1) {
        int[] var3;
        int var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var9 = aw.field_j[this.field_a][param0];
        var3 = var9;
        var4 = var3[ns.a(false, var9.length, new Random())];
        if (0 <= var4) {
          return var4;
        } else {
          var5 = var3;
          var6 = 0;
          L0: while (true) {
            if (var5.length <= var6) {
              L1: {
                if (param1 == -6892) {
                  break L1;
                } else {
                  this.d((byte) -91);
                  break L1;
                }
              }
              return aw.field_j[this.field_a][0][0];
            } else {
              var7 = var5[var6];
              if ((var7 ^ -1) <= -1) {
                return var7;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var5;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!this.field_p.g((byte) 97)) {
              break L1;
            } else {
              if (this.field_p.c(param1, param0 + -1, param2)) {
                this.field_p.j(0);
                this.field_x.e(32);
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!this.field_x.g((byte) 97)) {
              break L2;
            } else {
              if (this.field_x.c(param1, param0 + -1, param2)) {
                this.field_x.j(0);
                this.field_p.e(32);
                break L0;
              } else {
                break L2;
              }
            }
          }
          if (!this.field_p.a(param2, param0 + 106, param1)) {
            if (this.field_x.a(param2, 81, param1)) {
              this.field_x.j(param0 + -1);
              this.field_p.e(32);
              break L0;
            } else {
              if (!this.field_p.g((byte) 97)) {
                if (!this.field_x.g((byte) 97)) {
                  this.field_p.j(0);
                  this.field_x.e(32);
                  break L0;
                } else {
                  this.field_x.j(0);
                  this.field_p.e(32);
                  break L0;
                }
              } else {
                this.field_p.j(0);
                this.field_x.e(32);
                break L0;
              }
            }
          } else {
            this.field_p.j(param0 ^ 1);
            this.field_x.e(32);
            break L0;
          }
        }
        if (param0 == 1) {
          return;
        } else {
          this.a(-69, (byte) 100);
          return;
        }
    }

    private final void a(int param0) {
        int var2 = this.field_x.h(5);
        if (!(var2 != this.field_g)) {
            return;
        }
        int var3 = -5 % ((param0 - 58) / 50);
        this.a(false, var2);
    }

    private final void a(boolean param0, int param1) {
        this.field_g = param1;
        this.field_x.b(0, this.field_g);
        this.field_f.a(115);
        int var3 = this.b(this.field_g, -6892);
        if (param0) {
            return;
        }
        this.field_f.a(var3, this.field_g, (byte) 63);
        this.field_f.a(true);
    }

    private final void d(int param0) {
        this.field_h = param0 * (so.field_b.field_g >> -1842926078);
        this.field_t = 0;
        this.field_s = so.field_b.field_a / 3;
        this.field_f = new sh();
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 != 0)) {
            this.field_n.a(param0, (byte) 67, param1);
        }
        if ((param2 ^ -1) == -2) {
            this.field_p.e(105, param1, param0);
        }
        if (param3 <= 18) {
            return;
        }
        if (-3 == (param2 ^ -1)) {
            this.field_u.a(param0, (byte) 53, param1);
        }
        if (!(param2 != 3)) {
            this.field_x.e(68, param1, param0);
        }
    }

    private final void d(byte param0) {
        this.field_n = new ia(this.field_v, this.field_l, this.field_j, "Model", 0, 0);
        this.field_u = new ia(this.field_v, this.field_l, this.field_j, "Animation", 0, 0);
        this.field_k = hf.field_d;
        this.field_p = new r(this.field_v, this.field_c, this.field_l, this.field_j, this.field_k, 0, 0);
        if (param0 >= -122) {
            field_b = 61;
        }
        this.field_x = new r(this.field_v, this.field_c, this.field_l, this.field_j, this.field_m, 0, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = param3 / 3;
        var7 = param0;
        L0: while (true) {
          if ((var7 ^ -1) <= -5) {
            return;
          } else {
            L1: {
              var8 = this.a(param0 + -100, var7);
              var9 = param2 + (-var8 + param1 >> 1031828769);
              if (2 > var7) {
                var11 = var6 + param4;
                var10 = var11;
                if (0 != var7) {
                  break L1;
                } else {
                  var12 = this.a((byte) -47, var7);
                  var10 = var10 - var12;
                  break L1;
                }
              } else {
                var11 = param4 - -param3 + -var6;
                var10 = var11;
                if (-3 == (var7 ^ -1)) {
                  var12 = this.a((byte) -47, var7);
                  var10 = -var12 + var10;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            this.a(var10, var9, var7, 35);
            var7++;
            continue L0;
          }
        }
    }

    hc(wk[] param0, wk[] param1, tu param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_c = param1;
            this.field_j = param3;
            this.field_l = param2;
            this.field_m = pt.field_W;
            this.field_v = param0;
            this.d((byte) -127);
            this.d(3);
            this.a(param4, (byte) 39);
            this.a(0, so.field_b.field_a >> 207970785, so.field_b.field_a >> -1422973343, so.field_b.field_g, 0);
            qt.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("hc.<init>(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_w = "Benefits";
        field_d = "Computer players: ";
        field_o = new int[][]{new int[]{-1, 3, 1, 0}, new int[]{-1, 4, 1, 0}, new int[]{-1, 5, 1, 0}, new int[]{-1, 6, 1, 0}, new int[]{-1, 7, 1, 0}, new int[]{-1, 8, 1, 0}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}, new int[]{-1, 7, 1, 2}, new int[]{-1, 8, 1, 2}, new int[]{-1, 2, 1, 3}, new int[]{-1, 2, 4, 1}, new int[]{-1, 3, 4, 1}, new int[]{-1, 5, 4, 1}, new int[]{-1, 7, 4, 1}};
        field_q = 0;
    }
}
