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
        int discarded$0 = 0;
        if (param0 >= -13) {
            discarded$0 = this.c(95);
        }
        this.field_k = kla.a(100, m.field_a, -2147483648);
        this.field_q = kla.a(100, m.field_a, -2147483648);
    }

    public static void d(int param0) {
        if (param0 <= 102) {
            field_c = (double[]) null;
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
          if (!this.field_a) {
            break L0;
          } else {
            fda.field_m.a(0, 20 + this.field_j, 36 + (this.field_p + param1), -1049413117, (-this.field_b + 1024) * 4);
            break L0;
          }
        }
        L1: {
          nk.a(qa.field_k, param1 + 16 + this.field_p, 4 + this.field_j, 48, 28);
          if (this.field_a) {
            if (-1 == (this.field_b ^ -1)) {
              ca.field_c[this.field_e].e(16 + this.field_p - -param1, -22 + this.field_j);
              break L1;
            } else {
              L2: {
                dc.field_y[this.field_e].e(param1 + (16 + this.field_p), -22 + this.field_j);
                if ((256 + -(this.field_b >> -1733221438) ^ -1) < -1) {
                  tr.a(this.field_j - 22, dc.field_y[this.field_e], -(this.field_b >> 1371791234) + 256, this.field_k, ua.field_d, this.field_q, -26512, param1 + this.field_p + 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              if (0 >= -(this.field_b >> -2045144447) + 256) {
                break L1;
              } else {
                tr.a(-22 + this.field_j, dc.field_y[this.field_e], -(this.field_b >> 1208595073) + 256, this.field_k, aw.field_y, this.field_q, -26512, param1 + (16 + this.field_p));
                break L1;
              }
            }
          } else {
            a.field_n[this.field_e].e(this.field_p + 16 + param1, this.field_j - 22);
            break L1;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            this.a(true);
            break L3;
          }
        }
    }

    private final int c(int param0) {
        int var2 = -117 % ((param0 - 8) / 58);
        return this.field_m * 39 + 84;
    }

    final void b(int param0) {
        if (param0 != 24981) {
            this.field_b = -103;
        }
        if (!(hp.field_a)) {
            return;
        }
        this.field_b = this.field_b - 1;
        if (this.field_b < 0) {
            this.field_b = 0;
        }
        if (!(this.field_b != 512)) {
            uca.a(8, (byte) -44);
        }
        if (this.field_f) {
            if (!((this.field_n ^ -1) >= -1)) {
                this.field_n = this.field_n - 1;
            }
            if (!(this.field_n >= 0)) {
                this.field_n = 0;
            }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            this.field_p = -25;
        }
    }

    private final int a(int param0) {
        int var2 = 69 / ((77 - param0) / 42);
        return 10 - -(this.field_h * 56);
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              laa.a(param1, wt.field_u, ut.field_l, true, waa.field_a, param0 + -2392, 0);
              if (param0 == 8766) {
                break L1;
              } else {
                it.a(127, 20);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= ut.field_l) {
                L3: {
                  laa.a(param1 + param1, af.field_c, param1 + ut.field_l, false, mt.field_r, 6374, param1);
                  if (param1 >= ut.field_l) {
                    break L3;
                  } else {
                    ut.field_l = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                fn.field_k[var2_int - -param1] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "it.B(" + param0 + ',' + param1 + ')');
        }
    }

    it(int param0, int param1, int param2) {
        this.field_a = true;
        this.field_e = param2;
        this.field_m = param1;
        this.field_h = param0;
        this.field_d = fw.field_h[this.field_e];
        this.field_p = this.a(120);
        this.field_j = this.c(-97);
        this.field_b = 1024;
    }

    it(lu param0) {
        this.field_a = true;
        try {
            this.field_e = param0.b(16711935);
            this.field_h = param0.b(16711935);
            this.field_m = param0.b(16711935);
            this.field_d = fw.field_h[this.field_e];
            this.field_p = this.a(-19);
            this.field_j = this.c(98);
            this.field_b = param0.e((byte) 87);
            this.field_a = -2 == (param0.b(16711935) ^ -1) ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "it.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new vi(16);
        field_c = new double[]{50.0, 100.0, 120.0, 140.0, 160.0, 200.0};
    }
}
