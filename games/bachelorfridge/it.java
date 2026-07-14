/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class it {
    static vi field_o;
    private int field_k;
    int field_e;
    boolean field_f;
    int field_m;
    int field_h;
    pd field_d;
    int field_b;
    boolean field_a;
    static int[] field_l;
    int field_j;
    static int field_r;
    private int field_q;
    static ee field_i;
    static lda field_s;
    int field_p;
    static double[] field_c;
    int field_n;
    boolean field_g;

    final void a(byte param0) {
        if (param0 >= -13) {
            int discarded$0 = this.c(95);
        }
        ((it) this).field_k = kla.a(100, m.field_a, -2147483648);
        ((it) this).field_q = kla.a(100, m.field_a, -2147483648);
    }

    public static void d(int param0) {
        if (param0 <= 102) {
            field_c = null;
        }
        field_l = null;
        field_c = null;
        field_s = null;
        field_o = null;
        field_i = null;
    }

    final void a(boolean param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (!((it) this).field_a) {
            break L0;
          } else {
            fda.field_m.a(0, 20 + ((it) this).field_j, 36 + (((it) this).field_p + param1), -1049413117, (-((it) this).field_b + 1024) * 4);
            break L0;
          }
        }
        L1: {
          nk.a(qa.field_k, param1 + 16 + ((it) this).field_p, 4 + ((it) this).field_j, 48, 28);
          if (((it) this).field_a) {
            if (-1 == (((it) this).field_b ^ -1)) {
              ca.field_c[((it) this).field_e].e(16 + ((it) this).field_p - -param1, -22 + ((it) this).field_j);
              break L1;
            } else {
              L2: {
                dc.field_y[((it) this).field_e].e(param1 + (16 + ((it) this).field_p), -22 + ((it) this).field_j);
                if ((256 + -(((it) this).field_b >> -1733221438) ^ -1) < -1) {
                  tr.a(((it) this).field_j - 22, dc.field_y[((it) this).field_e], -(((it) this).field_b >> 1371791234) + 256, ((it) this).field_k, ua.field_d, ((it) this).field_q, -26512, param1 + ((it) this).field_p + 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 >= -(((it) this).field_b >> -2045144447) + 256) {
                break L1;
              } else {
                tr.a(-22 + ((it) this).field_j, dc.field_y[((it) this).field_e], -(((it) this).field_b >> 1208595073) + 256, ((it) this).field_k, aw.field_y, ((it) this).field_q, -26512, param1 + (16 + ((it) this).field_p));
                break L1;
              }
            }
          } else {
            a.field_n[((it) this).field_e].e(((it) this).field_p + 16 + param1, ((it) this).field_j - 22);
            break L1;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            ((it) this).a(true);
            break L3;
          }
        }
    }

    private final int c(int param0) {
        int var2 = -117 % ((param0 - 8) / 58);
        return ((it) this).field_m * 39 + 84;
    }

    final void b(int param0) {
        if (param0 != 24981) {
            ((it) this).field_b = -103;
        }
        if (!(hp.field_a)) {
            return;
        }
        ((it) this).field_b = ((it) this).field_b - 1;
        if (((it) this).field_b < 0) {
            ((it) this).field_b = 0;
        }
        if (!(((it) this).field_b != 512)) {
            uca.a(8, (byte) -44);
        }
        if (((it) this).field_f) {
            if (!((((it) this).field_n ^ -1) >= -1)) {
                ((it) this).field_n = ((it) this).field_n - 1;
            }
            if (!(((it) this).field_n >= 0)) {
                ((it) this).field_n = 0;
            }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((it) this).field_p = -25;
        }
    }

    private final int a(int param0) {
        int var2 = 69 / ((77 - param0) / 42);
        return 10 - -(((it) this).field_h * 56);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        laa.a(param1, wt.field_u, ut.field_l, true, waa.field_a, param0 + -2392, 0);
        if (param0 != 8766) {
            it.a(127, 20);
        }
        for (var2 = 0; var2 < ut.field_l; var2++) {
            fn.field_k[var2 - -param1] = var2;
        }
        laa.a(param1 + param1, af.field_c, param1 + ut.field_l, false, mt.field_r, 6374, param1);
        if (param1 < ut.field_l) {
            ut.field_l = param1;
        }
    }

    it(int param0, int param1, int param2) {
        ((it) this).field_a = true;
        ((it) this).field_e = param2;
        ((it) this).field_m = param1;
        ((it) this).field_h = param0;
        ((it) this).field_d = fw.field_h[((it) this).field_e];
        ((it) this).field_p = this.a(120);
        ((it) this).field_j = this.c(-97);
        ((it) this).field_b = 1024;
    }

    it(lu param0) {
        ((it) this).field_a = true;
        ((it) this).field_e = param0.b(16711935);
        ((it) this).field_h = param0.b(16711935);
        ((it) this).field_m = param0.b(16711935);
        ((it) this).field_d = fw.field_h[((it) this).field_e];
        ((it) this).field_p = this.a(-19);
        ((it) this).field_j = this.c(98);
        ((it) this).field_b = param0.e((byte) 87);
        ((it) this).field_a = -2 == (param0.b(16711935) ^ -1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new vi(16);
        field_c = new double[]{50.0, 100.0, 120.0, 140.0, 160.0, 200.0};
    }
}
