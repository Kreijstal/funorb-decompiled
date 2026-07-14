/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rr extends at {
    private int field_s;
    private fd field_o;
    private int field_u;
    private int field_k;
    private cq field_l;
    private int field_q;
    private int field_n;
    int field_w;
    static String field_r;
    private gj field_j;
    private int field_p;
    private int field_t;
    static String field_x;
    private boolean field_m;
    private int field_v;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = ((rr) this).field_p + ((rr) this).field_w * ((rr) this).field_q;
          var3 = ((rr) this).field_u - -(((rr) this).field_w * ((rr) this).field_k);
          var2 = var2 + ((rr) this).field_j.field_s.field_b;
          var3 = var3 + ((rr) this).field_j.field_s.field_B;
          var4 = (((rr) this).field_w & 13) >> 1693919299;
          var5 = (via.a(((rr) this).field_w << 276779784, (byte) 65) >> 1841598381) + 64;
          if (((rr) this).field_w >= 0) {
            break L0;
          } else {
            L1: {
              var6 = var5;
              if (((rr) this).field_w <= -32) {
                break L1;
              } else {
                var6 = var6 * -((rr) this).field_w >> -343524283;
                break L1;
              }
            }
            nv.field_wb.b(var2 - -44, var3 + -var6);
            break L0;
          }
        }
        var6 = -(var5 >> 1416252450) + 64;
        if (param0 < -10) {
          var7 = -(var5 >> 1682445218) + 48;
          nk.a(((rr) this).field_j.field_s.field_y, -(var6 >> -1588607231) + (64 + var2), -(var7 >> -1532796703) + var3 - -24, var6, var7);
          if (((rr) this).field_m) {
            ho.field_j[var4].a(var2, -45 + (var3 - var5));
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + (var3 - var5));
            return;
          }
        } else {
          ((rr) this).field_m = true;
          var7 = -(var5 >> 1682445218) + 48;
          nk.a(((rr) this).field_j.field_s.field_y, -(var6 >> -1588607231) + (64 + var2), -(var7 >> -1532796703) + var3 - -24, var6, var7);
          if (((rr) this).field_m) {
            ho.field_j[var4].a(var2, -45 + (var3 - var5));
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + (var3 - var5));
            return;
          }
        }
    }

    private final void e(int param0) {
        if (((rr) this).field_l == null) {
          if (param0 >= -54) {
            ((rr) this).field_m = true;
            return;
          } else {
            return;
          }
        } else {
          id.a(97, ((rr) this).field_l);
          if (param0 < -54) {
            return;
          } else {
            ((rr) this).field_m = true;
            return;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -13421) {
            field_r = null;
            field_x = null;
            field_r = null;
            return;
        }
        field_x = null;
        field_r = null;
    }

    final void d(int param0) {
        int var2 = ((rr) this).field_w * ((rr) this).field_q + ((rr) this).field_p;
        int var3 = ((rr) this).field_u - -(((rr) this).field_k * ((rr) this).field_w);
        ((rr) this).field_j.field_s.c(107, 240 + -var3, param0 - var2);
    }

    final static void a(int param0, eaa param1, int param2, Random param3) {
        lh var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var4 = (lh) (Object) param1.b((byte) 90);
        L0: while (true) {
          if (var4 == null) {
            if (param0 < 120) {
              rr.f(63);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              if (!var4.b(true)) {
                break L1;
              } else {
                int discarded$4 = kla.a(50, param3, -2147483648);
                var4.field_p = (int)((double)(128 + kla.a(80000, param3, -2147483648)) * Math.sin(var4.field_r));
                var4.field_g = (int)((double)(kla.a(40000, param3, -2147483648) + 128) * Math.cos(var4.field_r));
                break L1;
              }
            }
            var4 = (lh) (Object) param1.c(0);
            continue L0;
          }
        }
    }

    final taa e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        taa var4 = null;
        if (param0 != -120) {
          ((rr) this).field_w = 21;
          var2 = ((rr) this).field_p - ((rr) this).field_t * ((rr) this).field_q;
          var3 = -(((rr) this).field_t * ((rr) this).field_k) + ((rr) this).field_u;
          var4 = new taa(((rr) this).field_j, 0, 0);
          var4.field_k = 320 - var2;
          var4.field_j = 240 - var3;
          return var4;
        } else {
          var2 = ((rr) this).field_p - ((rr) this).field_t * ((rr) this).field_q;
          var3 = -(((rr) this).field_t * ((rr) this).field_k) + ((rr) this).field_u;
          var4 = new taa(((rr) this).field_j, 0, 0);
          var4.field_k = 320 - var2;
          var4.field_j = 240 - var3;
          return var4;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        je var3 = null;
        L0: {
          var2 = -62 / ((param0 - 71) / 47);
          if (((rr) this).field_w != -((rr) this).field_t) {
            break L0;
          } else {
            var3 = je.a(rt.field_a[20], 256, 128);
            var3.d(-1);
            ((rr) this).field_l = tw.a(var3, (byte) -36);
            break L0;
          }
        }
        ((rr) this).field_w = ((rr) this).field_w + 1;
        if (((rr) this).field_s > ((rr) this).field_w + 1) {
          L1: {
            if (((rr) this).field_w == -15) {
              jja.a(192, -1, 1);
              break L1;
            } else {
              break L1;
            }
          }
          if (-1 != (((rr) this).field_w ^ -1)) {
            return false;
          } else {
            this.d((byte) 95);
            return false;
          }
        } else {
          this.e(-119);
          return true;
        }
    }

    private final void d(byte param0) {
        oia var2 = null;
        ((rr) this).field_o.a(((rr) this).field_v, ((rr) this).field_n, ((rr) this).field_o.field_B.field_l.a(-27449, ((rr) this).field_j), 0);
        if (param0 <= 87) {
          return;
        } else {
          var2 = new oia(((rr) this).field_j, ((rr) this).field_v, ((rr) this).field_n);
          ((kj) (Object) var2).a(0);
          return;
        }
    }

    rr(gj param0, fd param1, int param2, int param3, boolean param4) {
        aj var7 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((rr) this).field_j = param0;
          ((rr) this).field_o = param1;
          ((rr) this).field_v = param2;
          ((rr) this).field_n = param3;
          var7 = ((rr) this).field_j.field_s.a(((rr) this).field_n, (byte) 114, ((rr) this).field_v);
          ((rr) this).field_p = -((rr) this).field_j.field_s.field_b + var7.field_c;
          ((rr) this).field_k = 2;
          ((rr) this).field_u = -((rr) this).field_j.field_s.field_B + var7.field_a;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param4) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((rr) this).field_m = stackIn_3_1 != 0;
          ((rr) this).field_q = ((rr) this).field_k << 1666074369;
          if (!((rr) this).field_m) {
            ((rr) this).field_s = ((((rr) this).field_j.field_h.field_z + -((rr) this).field_v) * 64 + 640) / ((rr) this).field_q;
            ((rr) this).field_t = (10 + ((rr) this).field_v) * 64 / ((rr) this).field_q;
            break L1;
          } else {
            ((rr) this).field_t = 64 * (10 + ((rr) this).field_n) / ((rr) this).field_q;
            ((rr) this).field_s = (640 + (-((rr) this).field_n + ((rr) this).field_j.field_h.field_B) * 64) / ((rr) this).field_q;
            break L1;
          }
        }
        L2: {
          if (!((rr) this).field_m) {
            break L2;
          } else {
            ((rr) this).field_q = -((rr) this).field_q;
            break L2;
          }
        }
        ((rr) this).field_w = -((rr) this).field_t;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "<%0> has been removed.";
    }
}
