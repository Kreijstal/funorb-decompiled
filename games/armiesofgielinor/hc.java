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

    private final void e() {
        if (((hc) this).field_p.g(260)) {
            ((hc) this).field_x.f((byte) 126);
            ((hc) this).field_p.f((byte) 127);
        } else {
            if (!(!((hc) this).field_x.g(260))) {
                ((hc) this).field_p.f((byte) -53);
                ((hc) this).field_x.f((byte) 1);
            }
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((hc) this).field_a = param0;
        ((hc) this).field_p.b(0, ((hc) this).field_a);
        ((hc) this).field_f.a(0, ((hc) this).field_a);
        ((hc) this).field_f.a(true);
        ((hc) this).field_m = new String[pt.field_W.length - -1];
        for (var3 = 0; pt.field_W.length > var3; var3++) {
            ((hc) this).field_m[var3] = pt.field_W[var3];
        }
        ((hc) this).field_m[pt.field_W.length] = "special";
        ((hc) this).field_x.a(((hc) this).field_m, -29799);
        this.a(false, 0);
    }

    private final void c() {
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

    private final void b() {
        int var2 = ((hc) this).field_p.h(5);
        if (var2 == ((hc) this).field_a) {
            return;
        }
        this.a(var2, (byte) 39);
    }

    private final void a(boolean param0) {
        if (param0) {
            ((hc) this).field_v = null;
        }
        int var2 = so.field_b.field_a >> 1;
        int var3 = -((hc) this).field_l.field_H + (so.field_b.field_g + -(((hc) this).field_l.field_L << 1));
        int var4 = ((hc) this).field_j[0];
        ((hc) this).field_l.c("Press Esc to return to the main menu", var2, var3, var4, -1);
    }

    private final int a(byte param0, int param1) {
        if (!(param1 != 0)) {
            return ((hc) this).field_n.a((byte) -50);
        }
        if (!(param1 != 1)) {
            return ((hc) this).field_p.e(true);
        }
        if (!(param1 != 2)) {
            return ((hc) this).field_u.a((byte) -11);
        }
        if (param1 == 3) {
            return ((hc) this).field_x.e(true);
        }
        return 0;
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        L0: {
          this.a(1, param3, param4);
          if (!((hc) this).field_p.g(260)) {
            break L0;
          } else {
            ((hc) this).field_p.a(param0, -18596, param3, param4, param1, param5);
            break L0;
          }
        }
        L1: {
          if (!((hc) this).field_x.g(260)) {
            break L1;
          } else {
            ((hc) this).field_x.a(param0, -18596, param3, param4, param1, param5);
            break L1;
          }
        }
        L2: {
          if (((hc) this).field_p.a((byte) 111)) {
            break L2;
          } else {
            if (!((hc) this).field_x.a((byte) 74)) {
              return;
            } else {
              break L2;
            }
          }
        }
        this.a(0, so.field_b.field_a >> 1, so.field_b.field_a >> 1, so.field_b.field_g, 0);
    }

    private final int a(int param0, int param1) {
        if (!(param1 != 0)) {
            return ((hc) this).field_n.c(-29408);
        }
        if (!(1 != param1)) {
            return ((hc) this).field_p.n(-18332);
        }
        if (!(param1 != 2)) {
            return ((hc) this).field_u.c(-29408);
        }
        int var3 = 1;
        if (param1 != 3) {
            return 0;
        }
        return ((hc) this).field_x.n(-18332);
    }

    final void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        this.a(param2, param1, 8, param4, param3, param5);
        if (param0 <= 66) {
            this.a(true);
        }
        int discarded$0 = 111;
        this.b();
        this.a(125);
        int discarded$1 = -95;
        this.a();
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
                  char discarded$2 = hc.a(39, 'ﾫ');
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
        field_o = null;
        field_w = null;
        field_d = null;
        if (param0 != 1017) {
            hc.b(44);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ne var3 = null;
        jd var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= vs.field_e.length) {
                break L0;
              } else {
                L2: {
                  var3 = vs.field_e[var2_int];
                  var4 = var3.field_c;
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (param0 != var4.field_O) {
                      break L2;
                    } else {
                      kl.field_a.a((byte) 53, var2_int);
                      return;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var2, "hc.N(" + param0 + 44 + 0 + 41);
        }
    }

    final void c(byte param0) {
        qn.b();
        ((hc) this).field_n.a(71);
        ((hc) this).field_u.a(45);
        ((hc) this).field_l.c("shift: " + nh.field_D[((hc) this).field_a], 480, 230, 16777215, -1);
        ((hc) this).field_l.c("model ID: " + sf.field_P[((hc) this).field_a], 480, 242, 16777215, -1);
        this.a(false);
        int discarded$0 = -25;
        this.e();
        ((hc) this).field_f.e((byte) 109);
        if (param0 > -52) {
            return;
        }
    }

    private final void a() {
        int discarded$0 = 127;
        this.c();
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
            if (!(var7 < 0)) {
                return var7;
            }
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
              if (((hc) this).field_p.c(param1, 0, param2)) {
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
              if (((hc) this).field_x.c(param1, 0, param2)) {
                ((hc) this).field_x.j(0);
                ((hc) this).field_p.e(32);
                break L0;
              } else {
                break L2;
              }
            }
          }
          if (!((hc) this).field_p.a(param2, 107, param1)) {
            if (((hc) this).field_x.a(param2, 81, param1)) {
              ((hc) this).field_x.j(0);
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
            ((hc) this).field_p.j(0);
            ((hc) this).field_x.e(32);
            return;
          }
        }
    }

    private final void a(int param0) {
        int var2 = ((hc) this).field_x.h(5);
        if (!(var2 != ((hc) this).field_g)) {
            return;
        }
        int var3 = 0;
        this.a(false, var2);
    }

    private final void a(boolean param0, int param1) {
        ((hc) this).field_g = param1;
        ((hc) this).field_x.b(0, ((hc) this).field_g);
        ((hc) this).field_f.a(115);
        int var3 = this.b(((hc) this).field_g, -6892);
        ((hc) this).field_f.a(var3, ((hc) this).field_g, (byte) 63);
        ((hc) this).field_f.a(true);
    }

    private final void d(int param0) {
        ((hc) this).field_h = 3 * (so.field_b.field_g >> 2);
        ((hc) this).field_t = 0;
        ((hc) this).field_s = so.field_b.field_a / 3;
        ((hc) this).field_f = new sh();
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 != 0)) {
            ((hc) this).field_n.a(param0, (byte) 67, param1);
        }
        if (param2 == 1) {
            ((hc) this).field_p.e(105, param1, param0);
            return;
        }
    }

    private final void d() {
        ((hc) this).field_n = new ia(((hc) this).field_v, ((hc) this).field_l, ((hc) this).field_j, "Model", 0, 0);
        ((hc) this).field_u = new ia(((hc) this).field_v, ((hc) this).field_l, ((hc) this).field_j, "Animation", 0, 0);
        ((hc) this).field_k = hf.field_d;
        ((hc) this).field_p = new r(((hc) this).field_v, ((hc) this).field_c, ((hc) this).field_l, ((hc) this).field_j, ((hc) this).field_k, 0, 0);
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
        var7 = 0;
        L0: while (true) {
          if (var7 >= 4) {
            return;
          } else {
            L1: {
              var8 = this.a(-100, var7);
              var9 = param2 + (-var8 + param1 >> 1);
              if (2 > var7) {
                var11 = var6;
                var10 = var11;
                if (0 != var7) {
                  break L1;
                } else {
                  var12 = this.a((byte) -47, var7);
                  var10 = var10 - var12;
                  break L1;
                }
              } else {
                var11 = 0 - -param3 + -var6;
                var10 = var11;
                if (var7 == 2) {
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((hc) this).field_c = param1;
            ((hc) this).field_j = param3;
            ((hc) this).field_l = param2;
            ((hc) this).field_m = pt.field_W;
            ((hc) this).field_v = param0;
            int discarded$2 = -127;
            this.d();
            this.d(3);
            this.a(param4, (byte) 39);
            this.a(0, so.field_b.field_a >> 1, so.field_b.field_a >> 1, so.field_b.field_g, 0);
            qt.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("hc.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 44 + param5 + 41);
        }
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
