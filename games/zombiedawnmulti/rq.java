/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rq extends br {
    private int field_h;
    static String field_n;
    private int field_t;
    private int field_f;
    private int field_o;
    static String field_g;
    private int field_w;
    private int field_k;
    private int field_s;
    static ja field_v;
    static int[] field_u;
    private int field_i;
    private int field_m;
    static String field_q;
    static String field_r;
    private int field_j;
    static ri field_l;
    private int field_p;

    final boolean a(int param0, byte param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param1 <= 2) {
          return true;
        }
        stackIn_6_0 = (30 > Math.abs(-this.field_k + param2)) && (Math.abs(param0 - this.field_f) < 30);
        return stackIn_6_0;
    }

    public static void b(boolean param0) {
        field_q = null;
        field_g = null;
        field_u = null;
        field_r = null;
        field_n = null;
        if (param0) {
          field_n = (String) null;
        }
        field_v = null;
        field_l = null;
    }

    private final int d(int param0) {
        if (param0 != -30019) {
          this.a((byte) -99);
        }
        return -9 + hp.a((byte) 112, g.field_a, 18);
    }

    final void a(byte param0) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        if (fieldTemp$0 > 1) {
          this.field_h = 0;
        } else {
          return;
        }
        if (this.field_w > 0) {
          this.field_w = this.field_w - 1;
          return;
        }
        if (this.field_t < this.field_o) {
          this.field_t = this.field_t + 1;
        }
        if (param0 <= 84) {
          field_r = (String) null;
        }
        int fieldTemp$1 = this.field_p + 1;
        this.field_p = this.field_p + 1;
        if (fieldTemp$1 >= 8) {
          this.c(12);
        }
    }

    final void a(nm param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_w > 0) {
            return;
          }
          pk.field_c.c(-30 + param0.c(this.field_k, -20126), param0.d(this.field_f, 121) - 30, this.field_t);
          if (param1 >= -24) {
            this.a((byte) 103);
          }
          if (this.field_p >= 0) {
            var3_int = param0.c(this.field_j, -20126);
            var4 = param0.d(this.field_i, 108);
            wi.field_g[this.field_p].c(-11 + var3_int, -this.field_p - this.field_p - this.field_p + var4 - (this.field_p + 11), 8 - this.field_p << 3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rq.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        nm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_8_2 = 0;
        String stackIn_28_0 = null;
        int var1;
        int var2;
        int var3;
        int var4_int;
        String var4;
        int var5_int;
        String var5;
        int var1Lifetime1;
        int var1Lifetime2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        if (!qj.field_p) {
          return;
        }
        if (null != wd.field_G) {
          var1 = wn.a(-125, wf.field_m << 7) * 4 >> 16;
          stackIn_7_0 = fb.field_e.field_k;
          stackIn_7_1 = 9 + wd.field_G.g(119);
          stackIn_8_2 = (wd.field_G instanceof h) ? 30 : 0;
          var2 = (int)((float)((nm) (Object) stackIn_7_0).c(stackIn_7_1 + stackIn_8_2, -20126) / fb.field_e.field_k.field_d);
          var3 = (int)((float)fb.field_e.field_k.d(-72 + (wd.field_G.h(param0 ^ -80) + 6), 112) / fb.field_e.field_k.field_d);
          var4_int = 2 + (var2 + var1);
          var5_int = -var1 + var3 - 2;
          if (0 == var1) {
            ul.field_e = true;
          }
          if (var1 == -4 &&
            ul.field_e) {
            ul.field_e = false;
            nm.b(param0 - 137, 47);
          }
          ig.field_b.e(var4_int, var5_int, 128, 61264);
        }
        if (param0 != 9) {
          return;
        }
        if (se.field_E > 0) {
          var1Lifetime1 = (400 - se.field_E >> 1) + 10;
          var2Lifetime1 = 20 + se.field_E + 20;
          g.c();
          var3Lifetime1 = 45;
          oo.h(var1Lifetime1, var3Lifetime1, var2Lifetime1 + var1Lifetime1, var3Lifetime1 + hj.field_g);
          oo.f(var1Lifetime1, var3Lifetime1, var2Lifetime1, hj.field_g, 2560, 160);
          g.a(o.field_h, 10, var3Lifetime1, 192);
          sj.field_j.g(10, var3Lifetime1);
          sj.field_j.a(10, -5 + (hj.field_g + var3Lifetime1));
          lm.field_fb.g(var1Lifetime1, var3Lifetime1);
          lm.field_fb.b(-5 + (var2Lifetime1 + var1Lifetime1), var3Lifetime1);
          rp.field_r[0].g(var1Lifetime1, var3Lifetime1);
          rp.field_r[1].g(var2Lifetime1 + (var1Lifetime1 - 5), var3Lifetime1);
          rp.field_r[2].g(var1Lifetime1, var3Lifetime1 + hj.field_g - 5);
          rp.field_r[3].g(-5 + var1Lifetime1 + var2Lifetime1, var3Lifetime1 + hj.field_g - 5);
          var4 = ei.field_g[ma.field_d][ml.field_Jb];
          if (ma.field_d == 21 &&
            1 == ll.field_k.b((byte) -1) &&
            ml.field_Jb < ci.field_c.length &&
            null != ci.field_c[ml.field_Jb]) {
            var4 = ci.field_c[ml.field_Jb];
          }
          pb.field_e.a(var4, 30, -10 + (var3Lifetime1 + 20), 400, -4 + hj.field_g - 20, 16777215, 0, 0, 0, 0);
          if (!pp.field_n) {
            if (dg.field_J) {
              stackIn_28_0 = gf.field_b;
            } else {
              stackIn_28_0 = ob.field_A;
            }
            var5 = stackIn_28_0;
            pb.field_e.a(var5, 430, hj.field_g + var3Lifetime1 - 14, 10066329, 0);
          }
          g.b();
        }
        if (21 == ai.field_b &&
          hg.field_rb == 9) {
          var1Lifetime2 = 4 * wn.a(-125, wf.field_m << 7) >> 16;
          var2Lifetime2 = var1Lifetime2 + 222;
          var3Lifetime2 = 428 - var1Lifetime2;
          if (var1Lifetime2 == 0) {
            ul.field_e = true;
          }
          if (var1Lifetime2 == -4 &&
            ul.field_e) {
            ul.field_e = false;
            nm.b(-127, 47);
          }
          ig.field_b.e(var2Lifetime2, var3Lifetime2, 128, 61264);
        }
    }

    final static void a(ja[] param0, int param1) {
        int var2_int = 0;
        String var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.c();
          el.field_H = param0;
          ve.field_b = new ja(55, 130);
          ve.field_b.a();
          el.field_H[2].f(5, -5, param1);
          el.field_H[3].f(5, -5, 16777215);
          oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
          el.field_H[2].f(5, -5, 0);
          el.field_H[3].f(5, -5, 0);
          oj.field_M = new ja[39];
          fe.field_W = new ja[oj.field_M.length];
          for (var2_int = 0; var2_int < oj.field_M.length; var2_int++) {
            oj.field_M[var2_int] = new ja(200, 25);
            oj.field_M[var2_int].a();
            var3 = lh.a((byte) -12, var2_int);
            pb.field_e.b(var3, 100, 17, 16777215, -1);
            fe.field_W[var2_int] = g.b(oj.field_M[var2_int]);
          }
          dl.field_c = da.a(9, np.field_l);
          fe.field_U = da.a(param1 ^ -16777125, mj.field_Sb);
          mi.field_Mb = da.a(104, mq.field_o);
          up.field_f = da.a(4, wm.field_U);
          la.field_j = da.a(70, vc.field_a);
          bq.field_a = da.a(-113, ej.field_k);
          wp.field_e = da.a(100, bg.field_p);
          bf.field_f = g.b(dl.field_c);
          ap.field_t = g.b(fe.field_U);
          ii.field_c = g.b(bq.field_a);
          aq.field_u = g.b(mi.field_Mb);
          kj.field_o = g.b(la.field_j);
          oq.field_t = g.b(up.field_f);
          vl.field_k = g.b(wp.field_e);
          g.b();
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "rq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(int param0) {
        this.field_j = param0 + (this.field_s * 24 + this.d(-30019));
        this.field_i = this.field_m * 24 + 12 + this.d(-30019);
        this.field_p = -hp.a((byte) 39, g.field_a, 50);
    }

    rq(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_m = param1;
        this.c(12);
        this.field_o = 25 + hp.a((byte) 37, g.field_a, 10) >> 2;
        this.field_t = 0;
        this.field_k = 12 + 24 * this.field_s + this.d(-30019);
        this.field_f = 12 + (this.field_m * 24 + this.d(-30019));
        this.field_w = param2 + hp.a((byte) 58, g.field_a, 10);
        this.field_p = 0;
        this.field_h = hp.a((byte) -110, g.field_a, 1);
    }

    static {
        field_q = "Show chat (<%0> unread messages)";
        field_r = "Show game chat from my friends";
        field_n = "Blast humans and zombies, stunning them! If you could only make it 'deadly'...";
        field_g = "Hide lobby chat";
    }
}
