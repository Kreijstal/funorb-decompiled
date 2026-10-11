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
        int var4;
        var4 = BachelorFridge.field_y;
        if (this.field_a) {
          fda.field_m.a(0, 20 + this.field_j, 36 + (this.field_p + param1), -1049413117, (-this.field_b + 1024) * 4);
        }
        nk.a(qa.field_k, param1 + 16 + this.field_p, 4 + this.field_j, 48, 28);
        if (this.field_a) {
          if (this.field_b == 0) {
            ca.field_c[this.field_e].e(16 + this.field_p + param1, -22 + this.field_j);
          } else {
            dc.field_y[this.field_e].e(param1 + (16 + this.field_p), -22 + this.field_j);
            if (256 - (this.field_b >> 2) > 0) {
              tr.a(this.field_j - 22, dc.field_y[this.field_e], -(this.field_b >> 2) + 256, this.field_k, ua.field_d, this.field_q, -26512, param1 + this.field_p + 16);
            }
            if (0 < -(this.field_b >> 1) + 256) {
              tr.a(-22 + this.field_j, dc.field_y[this.field_e], -(this.field_b >> 1) + 256, this.field_k, aw.field_y, this.field_q, -26512, param1 + (16 + this.field_p));
            }
          }
        } else {
          a.field_n[this.field_e].e(this.field_p + 16 + param1, this.field_j - 22);
        }
        if (param0) {
          this.a(true);
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
        if (!hp.field_a) {
          return;
        }
        this.field_b = this.field_b - 1;
        if (this.field_b < 0) {
          this.field_b = 0;
        }
        if (this.field_b == 512) {
          uca.a(8, (byte) -44);
        }
        if (this.field_f) {
          if (this.field_n > 0) {
            this.field_n = this.field_n - 1;
          }
          if (this.field_n < 0) {
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
        return 10 + this.field_h * 56;
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          laa.a(param1, wt.field_u, ut.field_l, true, waa.field_a, param0 - 2392, 0);
          if (param0 != 8766) {
            it.a(127, 20);
          }
          for (var2_int = 0; var2_int < ut.field_l; var2_int++) {
            fn.field_k[var2_int + param1] = var2_int;
          }
          laa.a(param1 + param1, af.field_c, param1 + ut.field_l, false, mt.field_r, 6374, param1);
          if (param1 < ut.field_l) {
            ut.field_l = param1;
          }
          return;
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
          this.field_a = param0.b(16711935) == 1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "it.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new vi(16);
        field_c = new double[]{50.0, 100.0, 120.0, 140.0, 160.0, 200.0};
    }
}
