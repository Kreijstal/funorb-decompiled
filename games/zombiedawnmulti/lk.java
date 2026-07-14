/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lk extends id {
    private int field_K;
    private int field_M;
    private int field_Q;
    int field_S;
    static int[] field_P;
    static String field_I;
    boolean field_O;
    static int[][] field_G;
    static cj field_J;
    private int field_F;
    private int field_H;
    private int field_N;

    final void f(byte param0) {
        if (param0 < -79) {
          ((lk) this).field_H = ((lk) this).field_H + 1;
          if ((((lk) this).field_H + 1 ^ -1) <= -5) {
            ((lk) this).field_H = 0;
            ((lk) this).field_M = ((lk) this).field_M + 1;
            if (((lk) this).field_M + 1 >= od.field_Fb.length) {
              if ((((lk) this).field_S ^ -1) == -2) {
                ((lk) this).field_O = true;
                return;
              } else {
                this.h((byte) -11);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        ((lk) this).field_E = param2 << -1655083824;
        ((lk) this).field_S = 0;
        ((lk) this).field_N = param2;
        if (param3 != 7457) {
          lk.g((byte) -21);
          ((lk) this).field_O = false;
          ((lk) this).field_z = param0 << -1097850000;
          ((lk) this).field_Q = param0;
          this.h((byte) -11);
          var5 = od.field_Fb.length;
          ((lk) this).field_H = hp.a((byte) 68, g.field_a, 10);
          ((lk) this).field_K = hp.a((byte) 107, g.field_a, param1);
          ((lk) this).field_M = hp.a((byte) -68, g.field_a, var5);
          return;
        } else {
          ((lk) this).field_O = false;
          ((lk) this).field_z = param0 << -1097850000;
          ((lk) this).field_Q = param0;
          this.h((byte) -11);
          var5 = od.field_Fb.length;
          ((lk) this).field_H = hp.a((byte) 68, g.field_a, 10);
          ((lk) this).field_K = hp.a((byte) 107, g.field_a, param1);
          ((lk) this).field_M = hp.a((byte) -68, g.field_a, var5);
          return;
        }
    }

    final void a(int param0, nm param1) {
        int var3 = 0;
        int var4 = 0;
        if (param0 == -10136) {
          if (!((lk) this).field_O) {
            ((lk) this).field_K = ((lk) this).field_K - 1;
            if (((lk) this).field_K - 1 <= 0) {
              var3 = param1.c(((lk) this).g(-50), -20126);
              var4 = -24 + param1.d(((lk) this).h(-76), param0 + 10242);
              if (io.a(var3, var4, (byte) -112, param1)) {
                if (!he.field_a) {
                  if (fb.field_e.field_u.field_k[((lk) this).h(82) / 24][((lk) this).g(-95) / 24]) {
                    return;
                  } else {
                    od.field_Fb[((lk) this).field_M].c(var3, var4, ((lk) this).field_F);
                    return;
                  }
                } else {
                  od.field_Fb[((lk) this).field_M].c(var3, var4, ((lk) this).field_F);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        if (param0 != 11041) {
          lk.i(-25);
          field_G = null;
          field_J = null;
          field_P = null;
          field_I = null;
          return;
        } else {
          field_G = null;
          field_J = null;
          field_P = null;
          field_I = null;
          return;
        }
    }

    final static int b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param0) {
          boolean discarded$5 = nb.field_a.a(hj.field_c, (byte) -27, nk.field_s, true);
          nb.field_a.h((byte) -104);
          L0: while (true) {
            if (!ba.c(-1)) {
              if (-1 == jk.field_j) {
                if (!nj.field_f) {
                  if (ta.field_hb != dj.field_k) {
                    if (!tg.field_g.d(-96)) {
                      return 1;
                    } else {
                      if (dj.field_k == id.field_B) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = jk.field_j;
                fb.a(-1, 107);
                return var1;
              }
            } else {
              boolean discarded$6 = nb.field_a.a(0, pn.field_d, sj.field_p);
              continue L0;
            }
          }
        } else {
          int discarded$7 = lk.b(true);
          boolean discarded$8 = nb.field_a.a(hj.field_c, (byte) -27, nk.field_s, true);
          nb.field_a.h((byte) -104);
          L1: while (true) {
            if (!ba.c(-1)) {
              if (-1 == jk.field_j) {
                if (!nj.field_f) {
                  if (ta.field_hb != dj.field_k) {
                    if (!tg.field_g.d(-96)) {
                      return 1;
                    } else {
                      if (dj.field_k == id.field_B) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              } else {
                var1 = jk.field_j;
                fb.a(-1, 107);
                return var1;
              }
            } else {
              boolean discarded$9 = nb.field_a.a(0, pn.field_d, sj.field_p);
              continue L1;
            }
          }
        }
    }

    final static void g(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        if (param0 < 36) {
          int discarded$1 = lk.b(false);
          var1 = b.field_d * b.field_d;
          var2 = -(t.field_e * t.field_e) + var1;
          var3 = vj.field_t + var2 * (-vj.field_t + km.field_cb) / var1;
          dq.field_k.a(120, var3, 640, ck.field_a, -3344);
          eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
          return;
        } else {
          var1 = b.field_d * b.field_d;
          var2 = -(t.field_e * t.field_e) + var1;
          var3 = vj.field_t + var2 * (-vj.field_t + km.field_cb) / var1;
          dq.field_k.a(120, var3, 640, ck.field_a, -3344);
          eo.a(nj.field_h, ed.field_c, 0, -10, 5, 640, km.field_cb - 24);
          return;
        }
    }

    lk() {
        super(0, 0, 0);
        ((lk) this).field_H = 0;
    }

    final void j(int param0) {
        ((lk) this).a(true);
        ((lk) this).a(-4564);
        bo.field_a.a(-25612, (br) this);
        if (param0 != 23068) {
            ((lk) this).f((byte) -105);
        }
    }

    private final void h(byte param0) {
        ((lk) this).field_F = 128 - -hp.a((byte) -85, g.field_a, 127);
        ((lk) this).field_M = 0;
        ((lk) this).field_z = ((lk) this).field_Q + -12 + hp.a((byte) -106, g.field_a, 24) << 413735312;
        ((lk) this).field_E = ((lk) this).field_N - 12 - -hp.a((byte) 40, g.field_a, 24) << -1546083440;
        if (param0 != -11) {
            ((lk) this).field_N = 22;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Kick <%0> from this game";
    }
}
