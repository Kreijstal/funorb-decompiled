/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rb extends de {
    static String field_r;
    static int field_q;
    static int field_o;
    static String[] field_p;

    final void a(int param0, int param1, boolean param2) {
        jn.field_v = -1;
        jm.field_j = -1;
        super.a(param0, param1, param2);
    }

    private final String d(int param0, int param1) {
        if (param1 != 7698) {
          this.a(-110, 30, true);
        }
        if (param0 == 0) {
          return ge.field_b;
        }
        return we.field_o[this.field_k[param0]];
    }

    private final int f(int param0) {
        if (param0 >= -95) {
          return -69;
        }
        return this.field_l == 9 ? go.field_k : de.field_n;
    }

    private final boolean c(int param0, byte param1) {
        boolean stackIn_9_0 = false;
        if (param1 <= 90) {
          this.b(6);
        }
        stackIn_9_0 = ((8 == this.field_l &&
          !(param0 >= 16)) ||
          this.a((byte) 66, param0));
        return stackIn_9_0;
    }

    final int a(int param0, boolean param1) {
        if (param1) {
          field_r = (String) null;
        }
        return this.a(param0, (byte) 90) + this.e(-112, param0);
    }

    final int b(int param0, int param1) {
        int var3 = 25 / ((param0 + 13) / 37);
        return this.field_d;
    }

    private final int e(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        for (var3 = param0; var3 < tn.field_n.length; var3++) {
          if ((1 << var3 & this.f(-111)) > 0) {
            var2++;
          }
        }
        return var2;
    }

    final void a(int param0) {
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        int var2;
        ob var3;
        tc var4;
        int var5;
        int var6;
        tf var6_ref_tf;
        int var7;
        int var8;
        tf var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var5Lifetime1;
        int var7Lifetime1;
        var15 = Pixelate.field_H ? 1 : 0;
        stackIn_3_0 = (9 != this.field_l) ? 0 : 1;
        var2 = stackIn_3_0;
        var3 = rk.field_e;
        if (param0 != 11) {
          rb.b(-94, (byte) 78);
        }
        var4 = qj.field_e;
        gj.field_W[6].b(0, 45);
        this.b((byte) -71);
        for (var5 = 0; var5 < tn.field_n.length; var5++) {
          var6_ref_tf = this.b((byte) 37, var5);
          if ((this.a((byte) 66, var5) ||
            var2 == 0) && this.c(var5, (byte) 97)) {
            var7 = this.d(var5, (byte) -54);
            var8 = this.f(-111, var5);
            if (var5 == jm.field_j) {
              t.a(var7 - 3, -3 + var8, 38, 38, 6, 0, 128);
            }
            if (var5 == jn.field_v) {
              t.e(var7 - 3, var8 - 3, 38, 38, 6, 16777215);
            }
            var6_ref_tf.e(var7, var8);
          }
        }
        if (jm.field_j == -1) {
          stackIn_24_0 = jn.field_v;
        } else {
          stackIn_24_0 = jm.field_j;
        }
        var5Lifetime1 = stackIn_24_0;
        if (-1 != var5Lifetime1) {
          var6 = var3.field_z + var3.field_D;
          var7Lifetime1 = var4.field_D + (var4.field_z + 3);
          var3.b(tn.field_n[var5Lifetime1], 320, 280, 0, -1);
          if (this.a((byte) 66, var5Lifetime1)) {
            var3.b(co.field_d, 320, 280 + var6, 0, -1);
          } else {
            var3.b(bf.field_t, 320, var6 + 280, 1, -1);
          }
          var9 = this.b((byte) 37, var5Lifetime1);
          var9.b(60, 120);
          var10 = var4.a(this.a(true, var5Lifetime1), 120, 320, 400, 400, 16777215, 0, 0, 0, var7Lifetime1);
          var11 = 320 + (var7Lifetime1 * var10 + 24);
          var4.a(to.field_p + ri.field_c[var5Lifetime1], 120, var11, 16777215, 0);
          var11 = var11 + (4 + var7Lifetime1);
          var4.a(fh.field_K, 120, var11, 16777215, 0);
          var12 = var4.c(fh.field_K) + 120;
          var13 = var11;
          for (var14 = 0; var14 < ri.field_e[var5Lifetime1]; var14++) {
            vn.field_c.b((vn.field_c.field_A >> 1) * var14 + var12, -vn.field_c.field_B + (var13 + 4));
          }
        } else {
          var3.a(th.field_a, 30, 280, 580, 400, 0, -1, 1, 0, 30);
          if (jg.a((byte) 109)) {
            var6 = 280 + this.field_d >> 1;
            var4.b(mj.field_h, 320, var6, 16777215, 0);
          }
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var7;
        int var5;
        int var6;
        var7 = Pixelate.field_H ? 1 : 0;
        var4 = 0;
        if (param0 != 4) {
          return 126;
        }
        while (tn.field_n.length > var4) {
          if (this.c(var4, (byte) 95)) {
            var5 = this.d(var4, (byte) -89);
            var6 = this.f(124, var4);
            if (var5 < param1 &&
              var6 < param2 &&
              param1 < var5 + 32 &&
              param2 < var6 + 32) {
              return var4;
            }
          }
          var4++;
        }
        return -1;
    }

    final int a(int param0, byte param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        int var3 = -40;
        int var4 = 0;
        int var4Lifetime1;
        if (param1 != 90) {
          field_q = 120;
        }
        while (this.field_g.field_h > var4) {
          var3 = var3 + (40 + this.e(param1 - 207, var4));
          var4++;
        }
        var4Lifetime1 = 640 - var3 >> 1;
        for (var5 = 0; param0 > var5; var5++) {
          var4Lifetime1 = var4Lifetime1 + (this.e(-118, var5) + 40);
        }
        return var4Lifetime1;
    }

    private final String a(boolean param0, int param1) {
        if (!param0) {
          return (String) null;
        }
        if (param1 == 10 &&
          !this.a((byte) 66, param1)) {
          return dq.field_a;
        }
        return qa.field_a[param1];
    }

    final void c(byte param0) {
        if (param0 >= -13) {
          return;
        }
        la.a(this.field_l, nc.field_a, false, -25528);
    }

    rb(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final int d(int param0, byte param1) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var7 = Pixelate.field_H ? 1 : 0;
        if (16 > param0) {
          return 264 + 40 * (param0 % 8);
        }
        var3 = 40 * this.e(16);
        var4 = (-var3 + 320) / 2 + 264;
        var5 = 68 % ((39 - param1) / 56);
        for (var6 = 16; param0 > var6; var6++) {
          if (this.a((byte) 66, var6)) {
            var4 += 40;
          }
        }
        return var4;
    }

    private final tf b(byte param0, int param1) {
        if (this.a((byte) 66, param1)) {
          return oo.field_c[param1];
        }
        if (gq.d(param0 ^ 96) &&
          qi.field_p[param1]) {
          return gd.field_i;
        }
        if (param0 == 37) {
          return pj.field_a;
        }
        return (tf) null;
    }

    private final boolean a(byte param0, int param1) {
        if (param0 != 66) {
          field_o = -28;
        }
        return 0 < (1 << param1 & this.f(-109)) ? true : false;
    }

    private final int f(int param0, int param1) {
        int var4 = -118 / ((param0 - 91) / 33);
        int var3 = this.e(16) != 0 ? 130 : 150;
        return var3 + param1 / 8 * 40;
    }

    final void e(byte param0) {
        super.e((byte) -94);
        if (param0 > -64) {
          field_q = 92;
        }
        jn.field_v = this.b(4, uf.field_d, bg.field_k);
        if (jn.field_v != -1 &&
          nm.field_c == 1) {
          mc.a(128, -126);
          if (jn.field_v == jm.field_j) {
            jm.field_j = -1;
          } else {
            jm.field_j = jn.field_v;
          }
        }
    }

    final void b(int param0) {
        if (param0 > -35) {
          return;
        }
        this.field_g.a(114, 0);
    }

    final static rk b(int param0, byte param1) {
        int var2 = -(param0 * 2) + 140;
        if (param1 < 26) {
          field_o = 88;
        }
        int var3 = 3 + ok.a(tg.field_f, -124, 17);
        double var4 = (double)(param0 - 10) / 10.0 + 7.0;
        return new rk(var2, var3, of.a(var4, 65536));
    }

    public static void b(boolean param0) {
        if (!param0) {
          rb.b(3, (byte) 57);
        }
        field_p = null;
        field_r = null;
    }

    private final int e(int param0, int param1) {
        if (param0 >= -107) {
          return 80;
        }
        return rk.field_e.c(this.d(param1, 7698)) + (0 == param1 ? sn.field_m.field_A : 0);
    }

    final void a(byte param0, boolean param1, int param2) {
        String var4;
        tf stackIn_5_0 = null;
        tf var5;
        var4 = this.d(param2, 7698);
        if (param2 == 1 &&
          this.field_k[param2] == 23) {
          stackIn_5_0 = oc.field_S;
        } else {
          stackIn_5_0 = oc.field_N;
        }
        var5 = stackIn_5_0;
        if (param2 == 0) {
          this.a(param1, var4, var5, -6, this.a(0, (byte) 90) + this.a(0, false) >> 1);
        } else {
          super.a(var4, param1, param2, var5, (byte) 124);
        }
        if (param0 > -116) {
          rb.b(40, (byte) -112);
        }
    }

    static {
        field_r = "Email: ";
    }
}
