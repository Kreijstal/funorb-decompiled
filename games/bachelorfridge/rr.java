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
        int var6 = 0;
        int var7 = 0;
        int var2 = this.field_p + this.field_w * this.field_q;
        int var3 = this.field_u + this.field_w * this.field_k;
        int var6Lifetime1;
        int var7Lifetime1;
        var2 = var2 + this.field_j.field_s.field_b;
        var3 = var3 + this.field_j.field_s.field_B;
        int var4 = (this.field_w & 13) >> 3;
        int var5 = (via.a(this.field_w << 8, (byte) 65) >> 13) + 64;
        if (this.field_w < 0) {
          var6 = var5;
          if (this.field_w > -32) {
            var6 = var6 * -this.field_w >> 5;
          }
          nv.field_wb.b(var2 + 44, var3 - var6);
        }
        var6Lifetime1 = -(var5 >> 2) + 64;
        if (param0 >= -10) {
          this.field_m = true;
          var7 = -(var5 >> 2) + 48;
          nk.a(this.field_j.field_s.field_y, -(var6Lifetime1 >> 1) + (64 + var2), -(var7 >> 1) + var3 + 24, var6Lifetime1, var7);
          if (!this.field_m) {
            ho.field_j[var4].c(var2, -45 + (var3 - var5));
            return;
          }
          ho.field_j[var4].a(var2, -45 + (var3 - var5));
          return;
        }
        var7Lifetime1 = -(var5 >> 2) + 48;
        nk.a(this.field_j.field_s.field_y, -(var6Lifetime1 >> 1) + (64 + var2), -(var7Lifetime1 >> 1) + var3 + 24, var6Lifetime1, var7Lifetime1);
        if (!this.field_m) {
          ho.field_j[var4].c(var2, -45 + (var3 - var5));
          return;
        }
        ho.field_j[var4].a(var2, -45 + (var3 - var5));
    }

    private final void e(int param0) {
        if (this.field_l != null) {
          id.a(97, this.field_l);
          if (param0 >= -54) {
            this.field_m = true;
            return;
          }
          return;
        }
        if (param0 < -54) {
          return;
        }
        this.field_m = true;
    }

    public static void f(int param0) {
        if (param0 != -13421) {
          field_r = (String) null;
          field_x = null;
          field_r = null;
          return;
        }
        field_x = null;
        field_r = null;
    }

    final void d(int param0) {
        int var2 = this.field_w * this.field_q + this.field_p;
        int var3 = this.field_u + this.field_k * this.field_w;
        this.field_j.field_s.c(107, 240 - var3, param0 - var2);
    }

    final static void a(int param0, eaa param1, int param2, Random param3) {
        lh var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          var4 = (lh) (param1.b((byte) 90));
          while (var4 != null) {
            if (var4.b(true)) {
              kla.a(50, param3, -2147483648);
              var4.field_p = (int)((double)(128 + kla.a(80000, param3, -2147483648)) * Math.sin(var4.field_r));
              var4.field_g = (int)((double)(kla.a(40000, param3, -2147483648) + 128) * Math.cos(var4.field_r));
            }
            var4 = (lh) (param1.c(0));
          }
          if (param0 >= 120) {
            return;
          }
          rr.f(63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("rr.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final taa e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        taa var4 = null;
        taa var4Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 == -120) {
          var2 = this.field_p - this.field_t * this.field_q;
          var3 = -(this.field_t * this.field_k) + this.field_u;
          var4 = new taa(this.field_j, 0, 0);
          var4.field_k = 320 - var2;
          var4.field_j = 240 - var3;
          return var4;
        }
        this.field_w = 21;
        var2Lifetime1 = this.field_p - this.field_t * this.field_q;
        var3Lifetime1 = -(this.field_t * this.field_k) + this.field_u;
        var4Lifetime1 = new taa(this.field_j, 0, 0);
        var4Lifetime1.field_k = 320 - var2Lifetime1;
        var4Lifetime1.field_j = 240 - var3Lifetime1;
        return var4Lifetime1;
    }

    final boolean c(byte param0) {
        je var3 = null;
        int var2 = -62 / ((param0 - 71) / 47);
        if (this.field_w == -this.field_t) {
          var3 = je.a(rt.field_a[20], 256, 128);
          var3.d(-1);
          this.field_l = tw.a(var3, (byte) -36);
        }
        int fieldTemp$0 = this.field_w + 1;
        this.field_w = this.field_w + 1;
        if (this.field_s <= fieldTemp$0) {
          this.e(-119);
          return true;
        }
        if (this.field_w == -15) {
          jja.a(192, -1, 1);
        }
        if (this.field_w == 0) {
          this.d((byte) 95);
          return false;
        }
        return false;
    }

    private final void d(byte param0) {
        oia var2 = null;
        this.field_o.a(this.field_v, this.field_n, this.field_o.field_B.field_l.a(-27449, this.field_j), 0);
        if (param0 > 87) {
          var2 = new oia(this.field_j, this.field_v, this.field_n);
          ((kj) ((Object) var2)).a(0);
          return;
        }
    }

    rr(gj param0, fd param1, int param2, int param3, boolean param4) {
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        aj var7 = null;
        try {
          this.field_j = param0;
          this.field_o = param1;
          this.field_v = param2;
          this.field_n = param3;
          var7 = this.field_j.field_s.a(this.field_n, (byte) 114, this.field_v);
          this.field_p = -this.field_j.field_s.field_b + var7.field_c;
          this.field_k = 2;
          this.field_u = -this.field_j.field_s.field_B + var7.field_a;
          stackIn_4_1 = (param4);
          this.field_m = stackIn_4_1;
          this.field_q = this.field_k << 1;
          if (!this.field_m) {
            this.field_s = ((this.field_j.field_h.field_z - this.field_v) * 64 + 640) / this.field_q;
            this.field_t = (10 + this.field_v) * 64 / this.field_q;
          } else {
            this.field_t = 64 * (10 + this.field_n) / this.field_q;
            this.field_s = (640 + (-this.field_n + this.field_j.field_h.field_B) * 64) / this.field_q;
          }
          if (this.field_m) {
            this.field_q = -this.field_q;
          }
          this.field_w = -this.field_t;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("rr.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_x = "<%0> has been removed.";
    }
}
