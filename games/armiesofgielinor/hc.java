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
        if (((hc) this).field_p.g(260)) {
            ((hc) this).field_x.f((byte) 126);
            ((hc) this).field_p.f((byte) 127);
        } else {
            if (!(!((hc) this).field_x.g(260))) {
                ((hc) this).field_p.f((byte) -53);
                ((hc) this).field_x.f((byte) 1);
            }
        }
        if (param0 != -25) {
            ((hc) this).field_s = 40;
            return;
        }
    }

    private final void a(int param0, byte param1) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((hc) this).field_a = param0;
        ((hc) this).field_p.b(0, ((hc) this).field_a);
        ((hc) this).field_f.a(0, ((hc) this).field_a);
        ((hc) this).field_f.a(true);
        ((hc) this).field_m = new String[pt.field_W.length - -1];
        int var3 = 0;
        if (param1 != 39) {
            int discarded$0 = this.a(-92, 45);
        }
        while (pt.field_W.length > var3) {
            ((hc) this).field_m[var3] = pt.field_W[var3];
            var3++;
        }
        ((hc) this).field_m[pt.field_W.length] = "special";
        ((hc) this).field_x.a(((hc) this).field_m, -29799);
        this.a(false, 0);
    }

    private final void c(int param0) {
        if (param0 <= 116) {
            this.e((byte) -94);
        }
        if (!(!br.field_f[96])) {
            ((hc) this).field_t = ((hc) this).field_t + 5;
        }
        if (!(!br.field_f[97])) {
            ((hc) this).field_t = ((hc) this).field_t - 5;
        }
        if (!(!br.field_f[98])) {
            ((hc) this).field_r = ((hc) this).field_r + 2;
        }
        if (!(!br.field_f[99])) {
            ((hc) this).field_r = ((hc) this).field_r - 2;
        }
    }

    private final void b(byte param0) {
        int var2 = ((hc) this).field_p.h(5);
        if (var2 == ((hc) this).field_a) {
            return;
        }
        this.a(var2, (byte) 39);
        if (param0 != 111) {
            return;
        }
    }

    private final void a(boolean param0) {
        if (param0) {
            ((hc) this).field_v = null;
        }
        int var2 = so.field_b.field_a >> -1260475487;
        int var3 = -((hc) this).field_l.field_H + (so.field_b.field_g + -(((hc) this).field_l.field_L << -296222751));
        int var4 = ((hc) this).field_j[0];
        ((hc) this).field_l.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final int a(byte param0, int param1) {
        if (param0 != -47) {
            ((hc) this).field_s = 67;
        }
        if (!(param1 != -1)) {
            return ((hc) this).field_n.a((byte) -50);
        }
        if (!(-2 != param1)) {
            return ((hc) this).field_p.e(true);
        }
        if (!((param1 ^ -1) != -3)) {
            return ((hc) this).field_u.a((byte) -11);
        }
        if ((param1 ^ -1) == -4) {
            return ((hc) this).field_x.e(true);
        }
        return 0;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        this.a(param2 ^ 9, param3, param4);
        if (param2 != 8) {
            ((hc) this).field_g = 40;
        }
        if (((hc) this).field_p.g(param2 ^ 268)) {
            ((hc) this).field_p.a(param0, -18596, param3, param4, param1, param5);
        }
        if (((hc) this).field_x.g(260)) {
            ((hc) this).field_x.a(param0, param2 ^ -18604, param3, param4, param1, param5);
        }
        if (!((hc) this).field_p.a((byte) 111)) {
            // ifeq L157
        }
        this.a(0, so.field_b.field_a >> 1885000737, so.field_b.field_a >> 679090529, so.field_b.field_g, 0);
        return;
    }

    private final int a(int param0, int param1) {
        if (!(param1 != 0)) {
            return ((hc) this).field_n.c(-29408);
        }
        if (!(1 != param1)) {
            return ((hc) this).field_p.n(-18332);
        }
        if (!(-3 != (param1 ^ -1))) {
            return ((hc) this).field_u.c(-29408);
        }
        int var3 = 19 % ((39 - param0) / 62);
        if ((param1 ^ -1) != -4) {
            return 0;
        }
        return ((hc) this).field_x.n(-18332);
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
        if (param1 != 181) {
            // if_icmpeq L18
        } else {
            return param1;
        }
        if (param0 != 98) {
            char discarded$0 = hc.a(39, 'ﾫ');
        }
        return Character.toTitleCase(param1);
    }

    public static void b(int param0) {
        field_o = null;
        field_w = null;
        field_d = null;
        if (param0 != 1017) {
            hc.b(44);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        ne var3 = null;
        jd var4 = null;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            hc.a(-115, false);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= vs.field_e.length) {
            return;
          } else {
            var3 = vs.field_e[var2];
            var4 = var3.field_c;
            if (var4 != null) {
              if (param0 == var4.field_O) {
                kl.field_a.a((byte) 53, var2);
                return;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void c(byte param0) {
        qn.b();
        ((hc) this).field_n.a(71);
        ((hc) this).field_u.a(45);
        ((hc) this).field_l.c("shift: " + nh.field_D[((hc) this).field_a], 480, 230, 16777215, -1);
        ((hc) this).field_l.c("model ID: " + sf.field_P[((hc) this).field_a], 480, 242, 16777215, -1);
        this.a(false);
        this.e((byte) -25);
        ((hc) this).field_f.e((byte) 109);
        if (param0 > -52) {
            return;
        }
    }

    private final void a(byte param0) {
        this.c(127);
        if (param0 >= -30) {
            hc.a(-57, true);
        }
        ((hc) this).field_f.a(((hc) this).field_r, 1, ((hc) this).field_h, -29001, ((hc) this).field_t, ((hc) this).field_s);
        ((hc) this).field_f.b(-19812);
    }

    private final int b(int param0, int param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var9 = aw.field_j[((hc) this).field_a][param0];
        int[] var3 = var9;
        int var4 = var3[ns.a(false, var9.length, new Random())];
        if (!(0 > var4)) {
            return var4;
        }
        int[] var5 = var3;
        for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            if (!((var7 ^ -1) > -1)) {
                return var7;
            }
        }
        if (param1 != -6892) {
            this.d((byte) -91);
        }
        return aw.field_j[((hc) this).field_a][0][0];
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!((hc) this).field_p.g((byte) 97)) {
              break L1;
            } else {
              if (((hc) this).field_p.c(param1, param0 + -1, param2)) {
                ((hc) this).field_p.j(0);
                ((hc) this).field_x.e(32);
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!((hc) this).field_x.g((byte) 97)) {
              break L2;
            } else {
              if (((hc) this).field_x.c(param1, param0 + -1, param2)) {
                ((hc) this).field_x.j(0);
                ((hc) this).field_p.e(32);
                break L0;
              } else {
                break L2;
              }
            }
          }
          if (!((hc) this).field_p.a(param2, param0 + 106, param1)) {
            if (((hc) this).field_x.a(param2, 81, param1)) {
              ((hc) this).field_x.j(param0 + -1);
              ((hc) this).field_p.e(32);
              break L0;
            } else {
              if (!((hc) this).field_p.g((byte) 97)) {
                if (!((hc) this).field_x.g((byte) 97)) {
                  ((hc) this).field_p.j(0);
                  ((hc) this).field_x.e(32);
                  break L0;
                } else {
                  ((hc) this).field_x.j(0);
                  ((hc) this).field_p.e(32);
                  break L0;
                }
              } else {
                ((hc) this).field_p.j(0);
                ((hc) this).field_x.e(32);
                break L0;
              }
            }
          } else {
            ((hc) this).field_p.j(param0 ^ 1);
            ((hc) this).field_x.e(32);
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
        int var2 = ((hc) this).field_x.h(5);
        if (!(var2 != ((hc) this).field_g)) {
            return;
        }
        int var3 = -5 % ((param0 - 58) / 50);
        this.a(false, var2);
    }

    private final void a(boolean param0, int param1) {
        ((hc) this).field_g = param1;
        ((hc) this).field_x.b(0, ((hc) this).field_g);
        ((hc) this).field_f.a(115);
        int var3 = this.b(((hc) this).field_g, -6892);
        if (param0) {
            return;
        }
        ((hc) this).field_f.a(var3, ((hc) this).field_g, (byte) 63);
        ((hc) this).field_f.a(true);
    }

    private final void d(int param0) {
        ((hc) this).field_h = param0 * (so.field_b.field_g >> -1842926078);
        ((hc) this).field_t = 0;
        ((hc) this).field_s = so.field_b.field_a / 3;
        ((hc) this).field_f = new sh();
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 != 0)) {
            ((hc) this).field_n.a(param0, (byte) 67, param1);
        }
        if (param2 == -2) {
            ((hc) this).field_p.e(105, param1, param0);
        }
        if (param3 <= 18) {
            return;
        }
        if (-3 == param2) {
            ((hc) this).field_u.a(param0, (byte) 53, param1);
        }
        if (!(param2 != 3)) {
            ((hc) this).field_x.e(68, param1, param0);
        }
    }

    private final void d(byte param0) {
        ((hc) this).field_n = new ia(((hc) this).field_v, ((hc) this).field_l, ((hc) this).field_j, "Model", 0, 0);
        ((hc) this).field_u = new ia(((hc) this).field_v, ((hc) this).field_l, ((hc) this).field_j, "Animation", 0, 0);
        ((hc) this).field_k = hf.field_d;
        ((hc) this).field_p = new r(((hc) this).field_v, ((hc) this).field_c, ((hc) this).field_l, ((hc) this).field_j, ((hc) this).field_k, 0, 0);
        if (param0 >= -122) {
            field_b = 61;
        }
        ((hc) this).field_x = new r(((hc) this).field_v, ((hc) this).field_c, ((hc) this).field_l, ((hc) this).field_j, ((hc) this).field_m, 0, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        ((hc) this).field_c = param1;
        ((hc) this).field_j = param3;
        ((hc) this).field_l = param2;
        ((hc) this).field_m = pt.field_W;
        ((hc) this).field_v = param0;
        this.d((byte) -127);
        this.d(3);
        this.a(param4, (byte) 39);
        this.a(0, so.field_b.field_a >> 207970785, so.field_b.field_a >> -1422973343, so.field_b.field_g, 0);
        qt.a(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Benefits";
        field_d = "Computer players: ";
        field_o = new int[][]{new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4], new int[4]};
        field_q = 0;
    }
}
