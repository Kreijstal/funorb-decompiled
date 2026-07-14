/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qf {
    static byte[] field_j;
    private int field_m;
    static int field_i;
    static int field_f;
    private int[] field_g;
    private eg field_n;
    private int field_q;
    private hm field_e;
    private nc field_o;
    static String field_l;
    private int field_c;
    private int field_b;
    private int field_a;
    private hm field_p;
    static dd field_k;
    private int field_h;
    static ai field_d;

    final void a(int param0) {
        ((qf) this).field_a = ((qf) this).field_a + ((qf) this).field_h;
        ((qf) this).field_q = ((qf) this).field_q + ((qf) this).field_b;
        ((qf) this).field_m = ((qf) this).field_m + ((qf) this).field_c;
        if ((((qf) this).field_q ^ -1) > -167772161) {
          if (-167772160 >= ((qf) this).field_q) {
            ((qf) this).field_q = 167772159;
            ((qf) this).field_g[0] = ((qf) this).field_q >> -1762639347;
            ((qf) this).field_g[1] = ((qf) this).field_m >> 522312589;
            ((qf) this).field_g[2] = ((qf) this).field_a >> 906360557;
            if (param0 != 2115785453) {
              return;
            } else {
              ((qf) this).field_p.a(3, ((qf) this).field_e);
              ((qf) this).field_o = null;
              return;
            }
          } else {
            ((qf) this).field_g[0] = ((qf) this).field_q >> -1762639347;
            ((qf) this).field_g[1] = ((qf) this).field_m >> 522312589;
            ((qf) this).field_g[2] = ((qf) this).field_a >> 906360557;
            if (param0 != 2115785453) {
              return;
            } else {
              ((qf) this).field_p.a(3, ((qf) this).field_e);
              ((qf) this).field_o = null;
              return;
            }
          }
        } else {
          ((qf) this).field_q = -167772159;
          ((qf) this).field_g[0] = ((qf) this).field_q >> -1762639347;
          ((qf) this).field_g[1] = ((qf) this).field_m >> 522312589;
          ((qf) this).field_g[2] = ((qf) this).field_a >> 906360557;
          if (param0 != 2115785453) {
            return;
          } else {
            ((qf) this).field_p.a(3, ((qf) this).field_e);
            ((qf) this).field_o = null;
            return;
          }
        }
    }

    final void a(int[] param0, gh param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        var5 = Pool.field_O;
        if (param2 > 79) {
          if (null != ((qf) this).field_o) {
            ((qf) this).field_o.b(param0, ((qf) this).field_g);
            return;
          } else {
            ((qf) this).field_p.a(((qf) this).field_g, -125);
            if (((qf) this).field_q > 134217728) {
              ((qf) this).field_n.field_f = hi.field_h[((qf) this).field_q + -134217728 >> 1950978612];
              ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
              ((qf) this).field_o.b(param0, ((qf) this).field_g);
              return;
            } else {
              if (((qf) this).field_q >= -134217728) {
                ((qf) this).field_n.field_f = null;
                ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
                ((qf) this).field_o.b(param0, ((qf) this).field_g);
                return;
              } else {
                ((qf) this).field_n.field_f = hi.field_h[-134217728 + -((qf) this).field_q >> -768754220];
                ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
                ((qf) this).field_o.b(param0, ((qf) this).field_g);
                return;
              }
            }
          }
        } else {
          var6 = null;
          qf.a(48, -85, 56, (byte) 112, -17, (dd[]) null);
          if (null != ((qf) this).field_o) {
            ((qf) this).field_o.b(param0, ((qf) this).field_g);
            return;
          } else {
            ((qf) this).field_p.a(((qf) this).field_g, -125);
            if (((qf) this).field_q > 134217728) {
              ((qf) this).field_n.field_f = hi.field_h[((qf) this).field_q + -134217728 >> 1950978612];
              ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
              ((qf) this).field_o.b(param0, ((qf) this).field_g);
              return;
            } else {
              if (((qf) this).field_q >= -134217728) {
                ((qf) this).field_n.field_f = null;
                ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
                ((qf) this).field_o.b(param0, ((qf) this).field_g);
                return;
              } else {
                ((qf) this).field_n.field_f = hi.field_h[-134217728 + -((qf) this).field_q >> -768754220];
                ((qf) this).field_o = (nc) (Object) ((qf) this).field_n.a(param1.field_C, param1.field_F, param1.field_q, param1.field_e, param1.field_u, ((qf) this).field_g);
                ((qf) this).field_o.b(param0, ((qf) this).field_g);
                return;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (!param0) {
          field_l = null;
          field_d = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_d = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    final int a(int[] param0, byte param1) {
        int var3 = -101 % ((param1 - -31) / 38);
        return (-param0[1] + ((qf) this).field_g[1]) * param0[10] + (param0[9] * (((qf) this).field_g[0] + -param0[0]) + (((qf) this).field_g[2] - param0[2]) * param0[11]);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, dd[] param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = Pool.field_O;
        if (param5 != null) {
          if (-1 > (param4 ^ -1)) {
            var6 = param5[0].field_w;
            var7 = param5[2].field_w;
            var8 = param5[1].field_w;
            param5[0].e(param2, param0, param1);
            param5[2].e(-var7 + (param2 - -param4), param0, param1);
            qh.a(sq.field_a);
            qh.d(var6 + param2, param0, param4 + (param2 + -var7), param0 + param5[1].field_y);
            var9 = param2 - -var6;
            var10 = param2 + param4 - var7;
            if (param3 != 18) {
              var12 = null;
              qf.a(-32, 78, -31, (byte) 16, 88, (dd[]) null);
              param2 = var9;
              L0: while (true) {
                if (param2 >= var10) {
                  qh.b(sq.field_a);
                  return;
                } else {
                  param5[1].e(param2, param0, param1);
                  param2 = param2 + var8;
                  continue L0;
                }
              }
            } else {
              param2 = var9;
              L1: while (true) {
                if (param2 >= var10) {
                  qh.b(sq.field_a);
                  return;
                } else {
                  param5[1].e(param2, param0, param1);
                  param2 = param2 + var8;
                  continue L1;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    qf(eg param0) {
        ((qf) this).field_n = null;
        ((qf) this).field_o = null;
        ((qf) this).field_n = param0;
        int var2 = ga.a(8192, true, ea.field_r);
        int var3 = 1024;
        ((qf) this).field_q = -134217728 + ga.a(268435456, true, ea.field_r);
        ((qf) this).field_m = af.c((byte) -128, var2) * var3;
        ((qf) this).field_a = o.a(var2, (byte) 77) * var3;
        ((qf) this).field_g = new int[]{-134217728 + ga.a(268435456, true, ea.field_r) >> -219057171, af.c((byte) -128, var2) * var3 >> -277340819, o.a(var2, (byte) 77) * var3 >> 2115785453, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        ((qf) this).field_b = -(65536 + ga.a(131072, true, ea.field_r));
        ((qf) this).field_c = ga.a(9, true, ea.field_r) - 5;
        ((qf) this).field_h = -5 + ga.a(9, true, ea.field_r);
        ((qf) this).field_p = new hm(ga.a(32768, true, ea.field_r) - 16384, ga.a(32768, true, ea.field_r) + -16384, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r));
        ((qf) this).field_p.b(true);
        ((qf) this).field_e = new hm();
        ((qf) this).field_e.a(60, ga.a(32768, true, ea.field_r) + -16384, -16384 + ga.a(32768, true, ea.field_r), -16384 + ga.a(32768, true, ea.field_r), 1 + ga.a(8, true, ea.field_r));
        ((qf) this).field_e.b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Enter name of player to add to list";
    }
}
