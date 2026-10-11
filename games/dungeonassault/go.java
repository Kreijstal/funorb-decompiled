/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class go extends qe {
    static String[] field_A;
    private boolean field_w;
    static cn field_S;
    pj field_Y;
    static String field_F;
    static String field_V;
    private int field_H;
    private nn field_M;
    private int field_I;
    private int[] field_P;
    private pp field_O;
    private int field_s;
    private int field_u;
    private String field_E;
    private hb field_y;
    private boolean field_v;
    private int field_C;
    private hj[] field_z;
    private String field_W;
    private int[] field_U;
    private boolean field_Q;
    private pp field_N;
    private pp field_r;
    private tf field_x;
    private md field_B;
    private int field_G;
    private pp field_J;
    private cl field_R;
    private md field_T;
    private pp field_t;
    ni field_D;
    private int field_X;
    ni field_L;
    private pp field_K;

    final void b(int param0, int param1) {
        if (this.field_w) {
          if (!this.h(26)) {
            return;
          }
          ac.field_B.d((byte) -97, 69);
          ac.field_B.i(param0, -94);
          return;
        }
        mo var3 = this.field_Y.b(this.field_Y.field_o, gm.field_d.field_N, param1 ^ 18900, param0, this.field_Y.field_y);
        var3.field_c.field_o = 0;
        if (param1 != 69) {
          this.field_E = (String) null;
        }
        this.a(true, var3.field_c, param1 + 53);
    }

    private final void a(byte param0, hb param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ec var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          var3_int = param1.field_n.field_s;
          this.field_I = -1;
          this.field_G = -1;
          var5 = 23 % ((param0 + 15) / 45);
          this.field_y = param1;
          var4 = new ec(1);
          var4.a(6, param1.field_j);
          if (ob.field_lc != var3_int &&
            var3_int != ob.field_Gb &&
            ob.field_Wb != var3_int &&
            var3_int != ob.field_Pb) {
            if (var3_int == ob.field_fc) {
              this.a(pe.field_i, -8963);
              return;
            }
            if (ob.field_Jb == var3_int) {
              this.a(bb.field_r, -8963);
              return;
            }
            if (ob.field_pc == var3_int) {
              this.a(jd.field_i, -8963);
              return;
            }
            if (var3_int == ob.field_Mb) {
              this.a(mo.field_b, -8963);
              return;
            }
            if (ob.field_dc != var3_int &&
              ob.field_Nb != var3_int) {
              if (ob.field_nc == var3_int) {
                this.a(em.field_F, -8963);
                return;
              }
              if (ob.field_Ib == var3_int) {
                this.a(ta.field_g, -8963);
                return;
              }
              if (var3_int == ob.field_Zb) {
                this.a(wf.field_D, -8963);
                return;
              }
              if (var3_int == ob.field_Lb) {
                this.a(li.field_c, -8963);
                return;
              }
              if (var3_int == ob.field_Ub) {
                this.a(eb.field_P, -8963);
                this.field_b = (kl) ((Object) new hn(param1.field_n.field_F.toUpperCase(), param1.field_e + param1.field_g, param1.field_n.field_m, param1.field_e));
                return;
              }
              this.field_y = null;
              this.a(27989);
              return;
            }
            this.a(rl.field_c, -8963);
            return;
          }
          this.a(param1, true);
          this.a(var4, 114);
          this.field_y = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("go.IC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        fa var1 = null;
        int var2 = DungeonAssault.field_K;
        fa var1Lifetime1;
        try {
          if (param0 != 14) {
            field_A = (String[]) null;
          }
          ub.field_n.a();
          hm.field_n.a();
          lj.field_r = lj.field_r - 1;
          if (lj.field_r == 0) {
            lj.field_r = 200;
            var1 = (fa) (ud.field_v.e(-24172));
            while (var1 != null) {
              if (!var1.field_o.c(-62)) {
                var1.a(false);
              }
              var1 = (fa) (ud.field_v.a(param0 ^ 10));
            }
            if (oi.field_F != null) {
              var1Lifetime1 = (fa) (oi.field_F.e(-24172));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_o.c(-67)) {
                  var1Lifetime1.a(false);
                }
                var1Lifetime1 = (fa) (oi.field_F.a(4));
              }
            }
          }
          if (null != ob.field_Xb &&
            !ob.field_Xb.b((byte) -124)) {
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.JC(" + param0 + ')');
        }
    }

    private final void a(byte param0, ai param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 < 16) {
            this.field_y = (hb) null;
          }
          if (null != param1.field_h.field_u) {
            param1.field_c.a(29, param1.field_h.field_u);
          }
          if (null != param1.field_h.field_x) {
            gd.a(64, param1.field_h.field_x);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("go.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        t.a(64, g.field_Lb, true, true);
    }

    final void a(byte param0) {
        if (!gl.field_Lb) {
          this.field_R = (cl) ((Object) new lj(this, 320, 210));
        } else {
          this.field_R = (cl) ((Object) new sf(this, 320, 240));
        }
        int var2 = 43 / ((param0 + 18) / 47);
    }

    private final void c(int param0, int param1) {
        int var7 = 0;
        int var9;
        int stackIn_27_0 = 0;
        mo stackIn_31_0 = null;
        int var3;
        int var4;
        int var5_int;
        mo var5;
        hb[] var6;
        hb var8;
        var9 = DungeonAssault.field_K;
        if (this.field_w) {
          if (!this.h(6)) {
            return;
          }
          if (param1 == 2) {
            ac.field_B.d((byte) -117, 67);
          } else {
            if (param1 == 1) {
              ac.field_B.d((byte) -125, 66);
            } else {
              ac.field_B.d((byte) -124, 65);
            }
          }
          return;
        }
        var3 = this.field_Y.field_B;
        var4 = 0;
        if (param0 > -102) {
          this.field_s = 112;
        }
        if (kn.field_g) {
          var5_int = 0;
          var6 = this.field_Y.field_A;
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            if (var8 != null &&
              (var8.field_o & 6) == 0) {
              var5_int++;
            }
          }
          stackIn_27_0 = (1 != var5_int) ? 0 : 1;
          var4 = stackIn_27_0;
        }
        if (var4 == 0) {
          stackIn_31_0 = this.field_Y.b((byte) 121, param1);
        } else {
          stackIn_31_0 = this.field_Y.c(-94, param1);
        }
        var5 = stackIn_31_0;
        var5.field_c.field_o = 0;
        this.a(true, var5.field_c, var3, 4743);
        return;
    }

    private final void i(int param0) {
        if (!this.field_Y.field_p.a(24, (byte) 115)) {
          this.b(false, 24);
        }
        this.field_Y.a(this.field_Y.field_u, true, 24);
        this.field_Y.a(false, 64);
        int var2 = 72 / ((param0 - 17) / 53);
        this.a(um.field_c, -8963);
        this.field_b = (kl) ((Object) new ro(this));
    }

    public static void f(int param0) {
        field_A = null;
        field_F = null;
        if (param0 != 10) {
          go.b((byte) -114);
        }
        field_V = null;
        field_S = null;
    }

    private final void b(ai param0, int param1) {
        try {
          if (param0.field_h.field_m != null) {
            param0.field_c.a(li.field_h, param0.field_h.field_m, -10872);
          }
          if (null != param0.field_h.field_p) {
            gd.a(64, param0.field_h.field_p);
          }
          int var3_int = 51 % ((param1 + 47) / 49);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.UB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void g(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        hb[] var2;
        hb var4;
        int var5;
        hb[] var6;
        var5 = DungeonAssault.field_K;
        super.b(param0);
        bl.a((byte) 98);
        for (var2_int = 0; var2_int < 6; var2_int++) {
          np.field_I[var2_int] = 110 - la.field_b.field_H * (var2_int * 4) / 3;
        }
        jh.a(this.field_e);
        go.a(this.field_e, 0, 0, 640, 480, 320, 240);
        vo.a(82, 82, 398, 336, 152);
        vo.a(118, 72, 408, 185, 0);
        vo.a(57, 72, 408, 185, 455);
        vf.a(32, true, 164, 106, 8);
        vf.a(32, true, 468, 115, 8);
        vf.a(352, true, 32, -39, 48);
        vf.a(352, true, 600, 103, 48);
        je.a((byte) -99, 352, 48, pi.field_b, 0, 32);
        je.a((byte) -113, 352, 48, pi.field_b, 608, 32);
        c.a(0, 640, 0, (byte) 118);
        c.a(0, 640, 40, (byte) 65);
        vd.a(200, 2, -14561, 0, 0, 400);
        vd.a(200, 0, -14561, 2, 440, 400);
        vd.a(360, 2, -14561, 2, 140, 390);
        ke.a(17, 185, 72, 408);
        ke.a(111, 447, 72, 408);
        ke.a(76, 144, 2, 398);
        ke.a(-99, 488, 2, 398);
        en.a((byte) -1, 40, 552, 100, 60);
        jh.b();
        rh discarded$2 = new rh(191, 345, 80, 160, 16711680, 768, 249);
        rh discarded$3 = new rh(449, 345, 80, 160, 16711680, 768, 249);
        this.a((byte) 57);
        var6 = this.field_Y.field_A;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.field_b = new wd(var4.field_n.field_e);
            if ((var4.field_o & 6) != 0) {
              var4.field_b.field_e = 0;
              var4.field_b.field_k = ga.field_n;
            }
          }
        }
    }

    private final void a(hb param0, boolean param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param0.field_n.field_a) {
            gd.a(64, param0.field_n.field_a);
          }
          if (!param1) {
            this.field_B = (md) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("go.QB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(byte param0) {
        ro var3 = null;
        ib.c(-107);
        int var2 = -56 % ((-42 - param0) / 52);
        if (this.field_Y.field_g == 1) {
          t.a(1048576, kj.field_o, false, true);
        } else {
          if (this.field_Y.field_g == 4 ||
            this.field_Y.field_g == 3) {
            gd.a(64, ef.field_d);
            var3 = new ro(this);
            var3.d(2);
            this.field_b = (kl) ((Object) var3);
          }
          t.a(1048576, tm.field_b, false, true);
        }
    }

    private final void m(int param0) {
        int var4_int = 0;
        int var5 = 0;
        int var2;
        hb[] var3_ref_hb__;
        int var3;
        hb[] var4;
        hb var5_ref_hb;
        hb var6;
        int[] var7;
        int var8;
        var8 = DungeonAssault.field_K;
        if (param0 < 86) {
          this.e((byte) -9);
        }
        this.field_R.b(-20827);
        if (this.field_Y.field_k == 128) {
          this.e((byte) -94);
        }
        if (kn.field_g) {
          var2 = 0;
          var3_ref_hb__ = this.field_Y.field_A;
          for (var4_int = 0; var4_int < var3_ref_hb__.length; var4_int++) {
            var5_ref_hb = var3_ref_hb__[var4_int];
            if (this.field_Y.b(0, var5_ref_hb)) {
              var2 = var2 | 1 << var5_ref_hb.field_j;
            }
          }
          if (0 != (~cc.field_d & var2)) {
            gh.a(15, 11);
          }
          cc.field_d = var2;
          var3 = 0;
          var4 = this.field_Y.field_A;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            if (var6 != null) {
              var7 = qa.field_a[var6.field_j];
              if (var6.field_e != var7[0] ||
                var7[1] != var6.field_g ||
                var6.field_f != var7[2] ||
                var6.field_k != var7[3]) {
                var3 = 1;
                var7[3] = var6.field_n.field_o;
                var7[2] = var6.field_n.field_b;
                var7[0] = var6.field_n.field_m;
                var7[1] = var6.field_n.field_r;
              }
            }
          }
          if (var3 != 0 &&
            kd.field_c != 11) {
            gh.a(16, 11);
          }
        }
        this.d(-77);
        this.d(false);
    }

    private final void a(int param0, boolean param1, hb param2) {
        wd stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_2_0 = param2.field_b;
          if (!param1) {
            stackIn_3_1 = rf.field_M;
          } else {
            stackIn_3_1 = li.field_h;
          }
          ((wd) (Object) stackIn_2_0).a(stackIn_3_1, param2.field_n.field_v, -10872);
          if (null != param2.field_n.field_g) {
            gd.a(64, param2.field_n.field_g);
          }
          if (param0 != 0) {
            go.f(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("go.HC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var3_int = 0;
        int var2 = 0;
        hb var4;
        int var5;
        hb[] var6;
        ai var3;
        var5 = DungeonAssault.field_K;
        this.field_R.c(-30876);
        if (0 < this.field_X) {
          this.field_X = this.field_X - 1;
        }
        var6 = this.field_Y.field_A;
        for (var3_int = 0; var3_int < var6.length; var3_int++) {
          var4 = var6[var3_int];
          if (var4 != null) {
            var4.field_b.a((byte) 109, 20);
            if ((4 & var4.field_o) != 0 &&
              ga.field_n == var4.field_b.field_k) {
              var4.field_b.a(rl.field_b, k.field_c, -10872);
              var4.field_b.field_e = 0;
            }
            var4.field_b.field_e = var4.field_b.field_e + 1;
          }
        }
        if (param0 >= -123) {
          return;
        }
        for (var2 = 0; var2 < 49; var2++) {
          var3 = this.field_Y.field_h[var2];
          if (var3 != null &&
            null != var3.field_c) {
            var3.field_c.a((byte) 109, 20);
          }
        }
        return;
    }

    private final void a(byte param0, ec param1, boolean param2) {
        hb stackIn_4_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hb var6 = null;
        ai var7 = null;
        int var8_int = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        ai var11 = null;
        ai var12 = null;
        String var13 = null;
        String var8Lifetime1;
        String var8Lifetime2;
        var10 = DungeonAssault.field_K;
        try {
          var4_int = param1.c(true);
          var5 = param1.c(true);
          if (-1 == var5) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = this.field_Y.field_A[var5];
          }
          var6 = stackIn_4_0;
          var7 = this.field_Y.field_h[var4_int];
          if (!param2) {
            var11 = bl.a(true, param1, false);
            var12 = var11;
            var7 = var12;
            this.field_Y.field_h[var4_int] = var11;
            var12.field_c = new wd(var12.field_h.field_d);
            var8_int = param1.c(true);
            this.a(var8_int, -31959, var4_int);
          }
          if (!this.field_Y.field_p.a(var4_int, (byte) 77)) {
            this.b(false, var4_int);
          }
          var13 = var7.field_h.field_z.toUpperCase();
          var8 = var13;
          var8Lifetime1 = var13;
          var8Lifetime2 = var13;
          if (param0 != -110) {
            go.a(117L, -45);
          }
          var9 = -1;
          if (2 != var7.field_h.field_g) {
            if (var7.field_h.field_g == 1) {
              var9 = 2188106;
            } else {
              if (3 == var7.field_h.field_g) {
                var9 = 42962;
              }
            }
          } else {
            var9 = 16711680;
          }
          if (var9 != -1) {
            var8Lifetime2 = "<col=" + Integer.toString(var9, 16) + ">" + var13 + "</col>";
          }
          rf.field_K.a(var8Lifetime2, -114, "lastroom");
          this.field_R.a(2985);
          if (var7.field_h.field_g == 2) {
            qh.a(param0 ^ 13822, this.field_N, 6);
            this.field_R.a(-9398, 16711935, var4_int);
          } else {
            if (var7.field_h.field_g != 1) {
              if (var7.field_h.field_g == 3) {
                qh.a(param0 - 13606, this.field_N, 9);
                this.field_R.a(param0 - 9288, 8421631, var4_int);
              } else {
                if (var7.field_a != 2) {
                  if (var7.field_a != 0) {
                    if (var7.field_a == 3) {
                      qh.a(param0 - 13606, this.field_z[0], 1);
                    }
                  } else {
                    gh.a(3, param0 + 121);
                  }
                } else {
                  qh.a(-13716, this.field_K, 14);
                }
              }
            } else {
              qh.a(-13716, this.field_N, 8);
              this.field_R.a(-9398, 65280, var4_int);
            }
          }
          this.field_Y.a(var6, true, var4_int);
          if (!this.field_Y.field_j.a(var4_int, (byte) 89)) {
            this.a(var7, 89);
          }
          if (this.field_Y.field_k != 8) {
            if (this.field_Y.field_k == 16) {
              this.a(rn.field_d, -8963);
              this.d(-110);
              this.d(false);
            }
          } else {
            if (null != this.field_Y.field_u) {
              this.a(pi.field_g, -8963);
            } else {
              this.a(ho.field_b, -8963);
            }
            this.m(103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("go.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0) {
        if (null == this.field_y) {
          return;
        }
        int var2 = -90 % ((-38 - param0) / 62);
    }

    final void c(boolean param0) {
        int var3 = 0;
        hj stackIn_33_0 = null;
        boolean stackIn_34_1 = false;
        pp stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        pp stackIn_43_0 = null;
        boolean stackIn_45_1 = false;
        pp stackIn_49_0 = null;
        boolean stackIn_50_1 = false;
        pp stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        boolean stackIn_62_1 = false;
        boolean stackIn_67_1 = false;
        hj[] var2;
        ec var3_ref_ec;
        hj var4;
        int var5;
        hj[] var6;
        hn var7;
        var5 = DungeonAssault.field_K;
        super.c(param0);
        if (0 < this.field_H) {
          this.field_H = this.field_H - 1;
        }
        if (param0) {
          this.a(true, 251569954);
        }
        this.g(-127);
        if (param0) {
          this.k(2);
          if (kn.field_g) {
            bl.a(0);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_E != null) {
          decompiledFrameRemainder0 = !(this.field_E.equals(this.field_W));
        } else {
          decompiledFrameRemainder0 = (null != this.field_W);
        }
        if (decompiledFrameRemainder0) {
          this.d((byte) -93);
        }
        if (this.field_b != null &&
          this.field_b.field_d) {
          if (this.field_b instanceof ro) {
            this.field_b.c(-123);
            hm.a(11, -1, true, -62);
          } else {
            if (this.field_b instanceof hn) {
              var7 = (hn) (this.field_b);
              if (var7.field_s) {
                var3_ref_ec = new ec(3);
                this.field_y.field_g = -var7.field_o + var7.field_n;
                this.field_y.field_e = var7.field_o;
                var3_ref_ec.a(6, this.field_y.field_j);
                var3_ref_ec.a(6, this.field_y.field_e);
                var3_ref_ec.a(6, this.field_y.field_g);
                this.a(this.field_y, true);
                this.a(var3_ref_ec, 118);
              }
            }
          }
          this.field_b.c(-124);
          this.field_b = null;
        }
        var6 = this.field_z;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            boolean decompiledFrameRemainder2 = true;
            stackIn_33_0 = var4;
            if ((6 & var4.field_V.field_o) == 0 && (this.field_Y.field_k == 8 ||
              this.field_Y.field_k == 4)) {
              stackIn_34_1 = true;
              decompiledFrameRemainder2 = false;
            }
            else {
              stackIn_34_1 = false;
            }
            stackIn_33_0.field_Y = stackIn_34_1;
          }
        }
        stackIn_39_0 = this.field_O;
        stackIn_40_1 = (this.field_Y.field_u != null) && (this.field_Y.b(0, this.field_Y.field_u));
        stackIn_39_0.field_w = stackIn_40_1;
        stackIn_43_0 = this.field_N;
        stackIn_45_1 = (this.field_Y.field_k == 16) || (32 == this.field_Y.field_k);
        stackIn_43_0.field_w = stackIn_45_1;
        stackIn_49_0 = this.field_r;
        stackIn_50_1 = (this.field_Y.field_k == 16) && (this.field_Y.field_h[this.field_Y.field_B].field_h.field_g == 2) && (!this.field_Y.field_h[this.field_Y.field_B].field_h.a((byte) -45, 15));
        stackIn_49_0.field_w = stackIn_50_1;
        stackIn_53_0 = this.field_t;
        stackIn_54_1 = (16 == this.field_Y.field_k) && (this.field_Y.field_h[this.field_Y.field_B].field_h.field_g == 2);
        boolean decompiledFrameRemainder1 = true;
        stackIn_53_0.field_w = stackIn_54_1;
        if ((this.field_Y.field_u == null ||
          (6 & this.field_Y.field_u.field_o) != 0) && (this.field_Y.field_k != 4 ||
          !kn.field_g)) {
          stackIn_62_1 = true;
          decompiledFrameRemainder1 = false;
        }
        else {
          stackIn_62_1 = false;
        }
        this.field_v = stackIn_62_1;
        stackIn_67_1 = (this.field_Y.field_k == 16) || (this.field_Y.field_k == 32);
        this.field_Q = stackIn_67_1;
    }

    private final void a(ai param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0.field_h != null &&
            null != param0.field_h.field_a) {
            gd.a(64, param0.field_h.field_a);
          }
          this.f((byte) -128);
          if (param1 < 32) {
            this.b(false, -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("go.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void k(int param0) {
        int stackIn_65_0 = 0;
        int stackIn_108_0 = 0;
        ai stackIn_115_0 = null;
        boolean stackIn_130_0 = false;
        Object var2;
        int var3;
        int var4;
        ai var4_ref_ai;
        wb[] var4_ref_wb__;
        en var5;
        ai var5_ref;
        int var5_int;
        int var6_int;
        wb[] var6;
        int var7_int;
        Object var7;
        int var8;
        int var9_int;
        ac var9;
        int var10;
        int var11;
        wb var12_ref_wb;
        int var12;
        int var13;
        wb var14;
        int var15;
        md var16;
        wb[] var17;
        hb var18;
        ai var19;
        ac var20;
        Object var21;
        ai var21_ref;
        int var4Lifetime1;
        int var4Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        wb var14Lifetime1;
        wb var14Lifetime2;
        var21 = null;
        var15 = DungeonAssault.field_K;
        this.field_s = -1;
        if (kh.d(true)) {
          var16 = (md) null;
          eg.a((md) null, true);
          return;
        }
        if (kn.field_g &&
          od.a((byte) -76)) {
          return;
        }
        if (super.d()) {
          return;
        }
        if (param0 != 2) {
          return;
        }
        var2 = null;
        var3 = -1;
        if (no.field_d == 1) {
          var3 = this.field_R.b(lc.field_c, 19091, hm.field_k);
          if (-1 != var3) {
            this.field_u = var3;
          }
        }
        this.field_s = this.field_R.b(hj.field_S, param0 + 19089, eh.field_h);
        if (hh.field_s != null) {
          if (this.field_J == hh.field_s) {
            gd.a(dc.field_z, param0 - 2, 1, false);
          }
          if (this.field_K == hh.field_s) {
            hm.a(11, -1, true, -23);
          }
          if (this.field_N == hh.field_s) {
            if (this.field_Y.field_k != 16) {
              if (32 == this.field_Y.field_k) {
                this.e(param0 ^ 70);
              }
            } else {
              this.c(-124, 0);
            }
          }
          if (this.field_r == hh.field_s) {
            if (this.field_Y.field_k == 16) {
              this.c(param0 ^ -119, 1);
            } else {
              if (this.field_Y.field_k == 32) {
                this.e(68);
              }
            }
          }
          if (this.field_t == hh.field_s &&
            this.field_Y.field_k == 16) {
            this.c(-117, 2);
          }
          if (this.field_O == hh.field_s &&
            null != this.field_Y.field_u &&
            this.field_Y.b(param0 - 2, this.field_Y.field_u)) {
            this.a((byte) -94, this.field_Y.field_u);
          }
          if (hh.field_s instanceof hj) {
            var18 = ((hj) (hh.field_s)).field_V;
            var2 = var18;
            if (this.field_y == null &&
              var18 != null && (this.field_Y.field_k != 4 ||
              !kn.field_g) && (var18.field_o & 6) == 0 && (this.field_Y.field_k == 8 ||
              this.field_Y.field_k == 4)) {
              this.b((byte) 119, var18);
              this.a(pi.field_g, param0 - 8965);
              this.m(param0 ^ 94);
              gh.a(2, 11);
            }
          }
        }
        if (this.field_y == null &&
          var3 != -1) {
          var4 = 0;
          if (this.field_Y.field_k == 4) {
            var4 = 1;
          }
          if (8 == this.field_Y.field_k) {
            if (null != this.field_Y.field_u) {
              stackIn_65_0 = ((6 & this.field_Y.field_u.field_o) == 0) ? 1 : 0;
            } else {
              stackIn_65_0 = 0;
            }
            var4 = stackIn_65_0;
          }
          if (var4 != 0 &&
            this.field_Y.b(var3, 27747)) {
            this.a(this.field_Y.field_u, var3, (byte) 123);
          } else {
            this.field_X = 125;
          }
        }
        if (this.field_y != null) {
          this.a(this.field_y, (hb) (var2), var3, (byte) -115);
        }
        if (-1 != this.field_s) {
          var19 = this.field_Y.field_h[this.field_s];
          var4_ref_ai = var19;
          if (var4_ref_ai != jb.field_Pb) {
            if (!this.field_Y.field_p.a(this.field_s, (byte) 105) &&
              this.field_s != 24) {
              var20 = gh.field_i[1];
              kh.field_u = (en) ((Object) new qf(var20.field_z.toUpperCase(), var20.field_t, var20.field_z));
            } else {
              kh.field_u = (en) ((Object) new bd(this.field_Y, var19));
            }
            jb.field_Pb = var4_ref_ai;
          }
          uj.a(kh.field_u, 95);
        }
        if (jg.a(false, 10, 112, 112, 57) &&
          this.field_Y.field_u != null) {
          var17 = this.field_Y.field_u.field_i;
          var4_ref_wb__ = var17;
          var5 = this.field_z[this.field_Y.field_u.field_j].field_n;
          var6_int = 7;
          if (var4_ref_wb__ != null) {
            var7_int = 104;
            var8 = 151;
            var9_int = var7_int;
            var10 = var8;
            var11 = 0;
            while (var17.length > var11) {
              var12_ref_wb = var17[var11];
              var14 = var12_ref_wb;
              var14Lifetime2 = var12_ref_wb;
              if (jg.a(false, var9_int, 12, 12, var10)) {
                var5 = var12_ref_wb.a();
              }
              var9_int -= 16;
              var11++;
              if (var11 % var6_int != 0) {
                continue;
              }
              var9_int = var7_int - 18;
              var10 -= 16;
            }
          }
          uj.a(var5, 95);
        }
        for (var4Lifetime1 = 0; var4Lifetime1 < 4; var4Lifetime1++) {
          var5_int = 126;
          if (jg.a(false, 50, 16, var5_int, 16 * var4Lifetime1 + 320)) {
            uj.a(fi.field_r[var4Lifetime1], 95);
          }
          if (jg.a(false, -var5_int + 590, 16, var5_int, 320 + 16 * var4Lifetime1)) {
            uj.a(rd.field_F[var4Lifetime1], 95);
          }
        }
        if (0 <= this.field_u &&
          this.field_Y.field_p.a(this.field_u, (byte) 73)) {
          stackIn_108_0 = this.field_u;
        } else {
          stackIn_108_0 = -1;
        }
        var4Lifetime2 = stackIn_108_0;
        if (var4Lifetime2 == -1 &&
          this.field_Y.field_B >= 0) {
          var4Lifetime2 = this.field_Y.field_B;
        }
        if (var4Lifetime2 < 0) {
          stackIn_115_0 = (ai) null;
        } else {
          stackIn_115_0 = this.field_Y.field_h[var4Lifetime2];
        }
        var21_ref = stackIn_115_0;
        var5_ref = var21_ref;
        if (jg.a(false, 518, 112, 112, 57) &&
          var21_ref != null) {
          var6 = var21_ref.field_f;
          var7 = null;
          var8Lifetime1 = 7;
          if (var6 != null) {
            var9_intLifetime1 = 612;
            var10Lifetime1 = 151;
            var11Lifetime1 = var9_intLifetime1;
            var12 = var10Lifetime1;
            var13 = 0;
            while (var13 < var6.length) {
              var14Lifetime1 = var6[var13];
              if (jg.a(false, var11Lifetime1, 12, 12, var12)) {
                var7 = var14Lifetime1.a();
              }
              var11Lifetime1 -= 16;
              var13++;
              if (var13 % var8Lifetime1 != 0) {
                continue;
              }
              var12 -= 16;
              var11Lifetime1 = var9_intLifetime1 - 18;
            }
          }
          if (var7 == null) {
            if (jb.field_Pb != var21_ref) {
              stackIn_130_0 = this.field_Y.field_p.a(var4Lifetime2, (byte) 105);
              if (!stackIn_130_0 &&
                24 != var4Lifetime2) {
                var9 = gh.field_i[1];
                kh.field_u = (en) ((Object) new qf(var9.field_z.toUpperCase(), var9.field_t, var9.field_z));
                jb.field_Pb = var21_ref;
                var7 = kh.field_u;
                uj.a((en) (var7), 95);
                return;
              }
              kh.field_u = (en) ((Object) new bd(this.field_Y, var21_ref));
              jb.field_Pb = var21_ref;
              var7 = kh.field_u;
              uj.a((en) (var7), 95);
              return;
            }
            var7 = kh.field_u;
          }
          uj.a((en) (var7), 95);
        }
        return;
    }

    private final void a(int param0, ec param1, boolean param2) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        ai var8 = null;
        ai var9_ref_ai = null;
        int var9 = 0;
        int var10 = 0;
        ai var11 = null;
        int var12 = 0;
        int var13 = 0;
        ec var14 = null;
        hb var15 = null;
        hb var16 = null;
        hb var17 = null;
        var13 = DungeonAssault.field_K;
        try {
          this.field_y = null;
          var15 = this.field_Y.field_A[param1.c(true)];
          var4 = var15;
          if (param0 != -67) {
            var14 = (ec) null;
            this.a(false, (ec) null, 48, 11);
          }
          var5 = var15.field_n.field_s;
          if (var5 != ob.field_dc &&
            var5 != ob.field_Nb) {
            if (var5 == ob.field_Lb) {
              var6 = param1.field_o;
              var7 = param1.c(true);
              var8_int = param1.c(true);
              if (!param2) {
                var9_ref_ai = bl.a(true, param1, false);
                var9_ref_ai.field_c = new wd(var9_ref_ai.field_h.field_d);
                var10 = param1.c(true);
                var11 = bl.a(true, param1, false);
                var11.field_c = new wd(var11.field_h.field_d);
                var12 = param1.c(true);
                this.field_Y.field_h[var7] = var9_ref_ai;
                this.field_Y.field_h[var8_int] = var11;
                this.a(var10, -31959, var7);
                this.a(var12, -31959, var8_int);
              }
              if (!this.field_Y.field_p.a(var7, (byte) 71)) {
                this.b(false, var7);
              }
              if (!this.field_Y.field_p.a(var8_int, (byte) 83)) {
                this.b(false, var8_int);
              }
              je.a(param0 ^ -67, dc.field_q);
              param1.field_o = var6;
            } else if (var5 != ob.field_nc &&
              ob.field_Ib != var5 &&
              var5 != ob.field_Zb) {
              if (var5 == ob.field_Mb) {
                var6 = param1.field_o;
                var16 = this.field_Y.field_A[param1.c(true)];
                var16.field_b.a(rf.field_M, var16.field_n.field_t, -10872);
                param1.field_o = var6;
              } else if (var5 == ob.field_lc ||
                var5 == ob.field_Gb) {
                this.a(param0 ^ -71, this.field_Y.field_u);
                this.b(this.field_Y.field_h[this.field_Y.field_B], -113);
              }
            } else {
              var6 = param1.field_o;
              var17 = this.field_Y.field_A[param1.c(true)];
              var17.field_b.a(li.field_h, var17.field_n.field_l, -10872);
              param1.field_o = var6;
              if (null != var17.field_n.field_g) {
                gd.a(64, var17.field_n.field_g);
              }
              var4.field_b = new wd(var15.field_n.field_e, var15.field_n.field_t, rf.field_M);
            }
          } else {
            var6 = param1.field_o;
            var7 = param1.c(true);
            if (!param2) {
              var8 = bl.a(true, param1, false);
              var8.field_c = new wd(var8.field_h.field_d);
              var9 = param1.c(true);
              this.field_Y.field_h[var7] = var8;
              this.a(var9, -31959, var7);
            }
            if (!this.field_Y.field_p.a(var7, (byte) 93)) {
              this.b(false, var7);
            }
            if (ob.field_dc == var5) {
              je.a(0, dc.field_q);
            }
            param1.field_o = var6;
          }
          this.field_Y.a(var15, param1, 118);
          this.d(false);
          if (var5 != ob.field_lc &&
            ob.field_Gb != var5) {
            return;
          }
          this.field_R.b(-20827);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_44_0 = var4_ref;
          stackIn_44_1 = new StringBuilder().append("go.NC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        this.field_U = new int[32];
        for (var2 = 0; 32 > var2; var2++) {
          this.field_U[var2] = oi.b(0, 4);
        }
        this.field_P = new int[4];
        if (param0 != 7872) {
          go.a(117L, 85);
        }
        this.field_B = new md();
        this.field_T = new md();
        this.field_D = ni.a(om.field_b.field_e, 256, 0);
        this.field_L = ni.a(k.field_f.field_e, 256, 0);
        this.field_D.e(-1);
        this.field_L.e(-1);
        l.a(this.field_D, 0);
        l.a(this.field_L, 0);
        t.a(64, g.field_Lb, true, true);
    }

    private final void b(hb param0, int param1) {
        try {
          param0.field_b.a(li.field_h, param0.field_n.field_l, -10872);
          if (param0.field_n.field_g != null) {
            gd.a(64, param0.field_n.field_g);
          }
          if (param1 > -120) {
            String var4 = (String) null;
            this.a((String) null, 98);
          }
          gh.a(13, 11);
          this.field_R.a((byte) -77);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void f() {
        ai dupTemp$0 = null;
        int var1;
        int var2;
        int var3_int;
        ai var3;
        int var4;
        int var1Lifetime1;
        int var2Lifetime1;
        var4 = DungeonAssault.field_K;
        if (13 == mm.field_t) {
          gd.a(dc.field_z, 0, 1, false);
        } else {
          if (ll.field_k) {
            if (this.field_Y.field_u != null &&
              !qk.field_e[82] &&
              !this.field_w) {
              var1 = this.field_Y.field_u.field_j;
              var2 = this.field_Y.field_u.field_c;
              var3_int = var2;
              if (mm.field_t != 27) {
                if (mm.field_t == 26) {
                  var3_int = (var2 + 34) % 35;
                  if (var3_int == 0) {
                    var3_int = 34;
                  }
                }
              } else {
                var3_int = (1 + var2) % 35;
                if (var3_int == 0) {
                  var3_int++;
                }
              }
              if (var2 != var3_int) {
                this.field_Y.field_A[var1] = new hb(var1, var3_int);
                this.field_Y.field_A[var1].field_b = new wd(this.field_Y.field_A[var1].field_n.field_e);
                this.b((byte) 47, this.field_Y.field_A[var1]);
              }
            }
            if (this.field_u != -1 &&
              qk.field_e[82] &&
              !this.field_w) {
              var1Lifetime1 = this.field_Y.field_h[this.field_u].field_a;
              var2Lifetime1 = var1Lifetime1;
              this.field_Y.field_p.a(this.field_u, -96);
              this.b(false, this.field_u);
              if (mm.field_t == 27) {
                var2Lifetime1 = (var1Lifetime1 + 1) % 38;
              } else {
                if (mm.field_t == 26) {
                  var2Lifetime1 = (var1Lifetime1 + 37) % 38;
                }
              }
              if (var1Lifetime1 != var2Lifetime1) {
                dupTemp$0 = new ai(var2Lifetime1);
                this.field_Y.field_h[this.field_u] = dupTemp$0;
                var3 = dupTemp$0;
                this.field_Y.field_j.b(this.field_u, 31);
                this.a(var3, 76);
                var3.field_c = new wd(var3.field_h.field_d);
              }
            }
            if (mm.field_t == 9) {
              ll.a(-72);
            }
          }
          super.f();
        }
    }

    private final void b(int param0, hb param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 2) {
            return;
          }
          if (param1.field_b.field_n == param1.field_b.field_i) {
            param1.field_b.a(126, param1.field_n.field_u);
            if (null == param1.field_n.field_p) {
              return;
            }
            gd.a(64, param1.field_n.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("go.SC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (this.field_H > 0) {
          return false;
        }
        this.field_H = 50;
        if (param0 <= 2) {
          this.field_E = (String) null;
          return true;
        }
        return true;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = DungeonAssault.field_K;
        this.a(sm.field_e, -8963);
        if (param0 != 1) {
          field_F = (String) null;
        }
        gd.a(64, ef.field_d);
        var3 = 0;
        for (var4 = 0; var4 < 4; var4++) {
          if ((param1 & 1 << var4) != 0) {
            this.field_Y.a(120, this.field_Y.field_A[var4]);
            if (0 == (4 & this.field_Y.field_A[var4].field_o)) {
              if ((this.field_Y.field_A[var4].field_o & 2) != 0) {
                this.a(0, true, this.field_Y.field_A[var4]);
              }
            } else {
              this.b(this.field_Y.field_A[var4], -126);
              var3 = var3 | 1 << var4;
            }
          }
        }
        this.e((byte) -118);
        return var3;
    }

    private final void a(hb param0, hb param1, int param2, byte param3) {
        int stackIn_32_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ec var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        try {
          if (no.field_d == 2) {
            this.field_y = null;
            this.a(27989);
            return;
          }
          var5_int = param0.field_n.field_s;
          var6 = new ec(3);
          var7 = 0;
          var6.a(6, param0.field_j);
          if ((ob.field_dc == var5_int ||
            var5_int == ob.field_Nb) && (this.field_G == -1 &&
            this.field_Y.b(param2, 27747) &&
            param2 != 24)) {
            this.field_G = param2;
            var7 = 1;
            var6.a(6, this.field_G);
          }
          if ((ob.field_nc == var5_int ||
            ob.field_Ib == var5_int) && (this.field_G == -1 &&
            param1 != null &&
            (6 & param1.field_o) == 0)) {
            if (0 != param1.field_n.field_z) {
              if ((ob.field_Ib == var5_int) &&
                (param1.field_n.field_z == 1)) {
                this.field_G = param1.field_j;
                var6.a(6, this.field_G);
                var7 = 1;
              }
            } else {
              this.field_G = param1.field_j;
              var6.a(6, this.field_G);
              var7 = 1;
            }
          }
          if (ob.field_fc == var5_int ||
            var5_int == ob.field_Jb ||
            var5_int == ob.field_pc) {
            if (ob.field_fc != var5_int) {
              stackIn_32_0 = (var5_int == ob.field_Jb) ? 2 : 4;
            } else {
              stackIn_32_0 = 1;
            }
            var8 = stackIn_32_0;
            if (param1 != null &&
              (6 & param1.field_o) == 0 &&
              (param1.field_d & var8) == 0) {
              this.field_G = param1.field_j;
              var6.a(6, this.field_G);
              var7 = 1;
            }
          }
          if (ob.field_Zb == var5_int &&
            this.field_G == -1 &&
            param1 != null &&
            this.field_y != param1 &&
            (param1.field_o & 6) == 0) {
            this.field_G = param1.field_j;
            var7 = 1;
            var6.a(6, this.field_G);
          }
          if (var5_int == ob.field_Lb) {
            if (param2 != -1) {
              stackIn_51_0 = (param2 != this.field_G) ? 1 : 0;
            } else {
              stackIn_51_0 = 0;
            }
            var8Lifetime1 = stackIn_51_0;
            if (var8Lifetime1 != 0 &&
              !this.field_Y.field_p.a(param2, (byte) 78) &&
              param2 != 24) {
              if (this.field_G != -1) {
                this.field_I = param2;
                var6.a(6, this.field_G);
                var7 = 1;
                var6.a(6, this.field_I);
              } else {
                this.field_G = param2;
              }
            }
          }
          var8Lifetime2 = 109 % ((-55 - param3) / 35);
          if (var5_int == ob.field_Mb &&
            param1 != null &&
            (4 & param1.field_o) != 0 &&
            param1.field_g > 0) {
            this.field_G = param1.field_j;
            var7 = 1;
            var6.a(6, this.field_G);
          }
          if (var7 != 0) {
            this.a(param0, true);
            this.a(var6, 110);
            this.a(27989);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_71_0 = var5;
          stackIn_71_1 = new StringBuilder().append("go.TC(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(byte param0, hb param1) {
        String[] var3 = null;
        String var4 = null;
        String[] var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.field_Y.field_u = param1;
          this.b(2, param1);
          ae.field_a = jn.a(this.field_Y.field_u.field_n.field_F.toUpperCase(), np.field_I, -73, la.field_b);
          if (this.field_Y.field_u.field_n.field_s != -1) {
            var5 = this.field_Y.field_u.field_n.field_d;
            var3 = var5;
            var4 = jk.a(new String[]{this.field_Y.field_u.field_n.field_F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
            this.field_O.field_n = (en) ((Object) new qf(jk.a(new String[]{var5[0]}, vo.field_m, 30496), jk.a(new String[]{var4}, var5[1], 30496)));
          }
          if (param0 <= 27) {
            this.field_w = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("go.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(hb param0, int param1, byte param2) {
        ec stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ec var5 = null;
        try {
          if (param0 == null &&
            this.field_Y.field_k == 4) {
            param0 = this.field_Y.field_A[0];
          }
          if (!this.field_Y.field_p.a(param1, (byte) 89)) {
            je.a(0, dc.field_q);
          }
          if (this.field_w) {
            if (!this.h(51)) {
              return;
            }
            ac.field_B.d((byte) -101, 63);
            ac.field_B.a(6, param1);
            ac.field_B.a(6, param0.field_j);
            return;
          }
          var5 = new ec(2);
          var5.a(6, param1);
          if (param2 <= 6) {
            this.field_L = (ni) null;
          }
          stackIn_16_0 = var5;
          stackIn_16_1 = 6;
          if (param0 == null) {
            stackIn_17_2 = -1;
          } else {
            stackIn_17_2 = param0.field_j;
          }
          ((ec) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
          var5.field_o = 0;
          this.a((byte) -110, var5, true);
          if (this.field_Y.field_h[this.field_Y.field_B].field_a == 2) {
            if (!kn.field_g) {
              this.i(94);
            } else {
              gh.a(17, 11);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("go.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(byte param0) {
        int var9 = 0;
        String var10 = null;
        int var11 = DungeonAssault.field_K;
        this.field_E = this.field_W;
        jh.c();
        int var2 = -40 + this.field_q.field_b;
        String[] var3 = jn.a(this.field_W, new int[]{var2}, -103, la.field_b);
        int var4 = var3.length;
        int var5 = la.field_b.field_E + la.field_b.field_H * var4;
        int var6 = la.field_b.field_H;
        cn var7 = new cn(var2, var5);
        if (param0 > -62) {
          hb var12 = (hb) null;
          this.a((hb) null, (hb) null, 123, (byte) -100);
        }
        var7.e();
        String[] var8 = var3;
        for (var9 = 0; var8.length > var9; var9++) {
          var10 = var8[var9];
          la.field_b.c(var10, var2 >> 1, var6, 16777215, -1);
          var6 = var6 + la.field_b.field_H;
        }
        jh.b();
        this.field_q.a(var7, 0, true, 116, -var7.field_v + this.field_q.field_y >> 1);
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != -31959) {
          this.c();
        }
        if ((param0 & 1) != 0) {
          this.field_Y.field_v.a(-1 + (param2 - param2 / 7), param1 + 31854);
        }
        if ((2 & param0) != 0) {
          this.field_Y.field_v.a(param2 - param2 / 7, param1 ^ 31920);
        }
        if ((4 & param0) != 0) {
          this.field_Y.field_v.a(param2 + 35, param1 + 31884);
        }
        if ((8 & param0) != 0) {
          this.field_Y.field_v.a(42 + param2, param1 + 31894);
        }
    }

    final void c() {
        super.c();
        ln.a(this.field_D, -28711);
        ln.a(this.field_L, -28711);
        jb.field_Pb = null;
        this.field_R = null;
        kh.field_u = null;
        System.gc();
    }

    private final void b(boolean param0, int param1) {
        ai var3 = this.field_Y.field_h[param1];
        var3.field_c = new wd(var3.field_h.field_d);
        this.field_R.a(15122, param1);
        if (param0) {
          this.field_r = (pp) null;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        boolean discarded$0 = false;
        ai stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_8_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        ai stackIn_101_0 = null;
        boolean stackIn_102_1 = false;
        int var6;
        hb var7;
        int var8;
        hb[] var9_ref_hb__;
        int var9;
        int var10;
        hb var11_ref_hb;
        int var11;
        int var12;
        ai var13;
        var12 = DungeonAssault.field_K;
        var13 = this.field_Y.field_h[param1];
        var6 = 0;
        var7 = this.field_Y.field_u;
        var8 = var13.field_i ? 1 : 0;
        stackIn_2_0 = var13;
        stackIn_3_1 = ((param0 & 2048) == 0) ? false : true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        stackIn_2_0.field_i = stackIn_3_1;
        if (1 == var13.field_h.field_g) {
          if (param0 != 36864) {
            if (!param2) {
              this.field_Y.a(param1, true, -12331);
            }
            if (param0 != 20480) {
              this.a((byte) 76, var13);
              if (!param2) {
                this.field_Y.a(true, 118, param1);
              }
              if (0 != (param0 & 2048)) {
                this.b(var7, param3 - 127);
              } else {
                this.a(0, true, var7);
              }
            } else {
              this.b(var13, 2);
            }
          } else {
            this.b(var13, 76);
            this.a(4, var7);
          }
        } else {
          if (var13.field_h.field_g == 2) {
            stackIn_8_0 = ((param0 & 32768) == 0) ? 0 : 1;
            var6 = stackIn_8_0;
            if (var13.field_h.a((byte) -108, 7) &&
              var6 != 0) {
              this.field_Y.a(32768, 3);
              this.a((byte) 27, var13);
              var9_ref_hb__ = this.field_Y.field_A;
              for (var10 = 0; var9_ref_hb__.length > var10; var10++) {
                var11_ref_hb = var9_ref_hb__[var10];
                if (var11_ref_hb != null) {
                  this.a(0, true, var11_ref_hb);
                }
              }
              this.e((byte) -96);
              this.m(92);
              return;
            }
            if ((16384 & param0) != 0 &&
              !param2) {
              this.field_Y.a(param1, true, -12331);
            }
            if (0 == (16384 & param0) &&
              var6 != 0) {
            }
            if (var13.field_h.a((byte) -52, 3) &&
              0 == (16384 & param0)) {
              if ((param0 & 4096) != 0) {
                this.b(var13, param3 ^ -87);
              } else {
                this.a((byte) 78, var13);
                if (!param2) {
                  this.field_Y.a(true, param3 ^ -126, param1);
                }
                if ((param0 & 2048) == 0) {
                  this.a(param3 + 1, true, var7);
                } else {
                  this.b(var7, -123);
                }
              }
            } else {
              if (var13.field_h.a((byte) -65, 15) &&
                (16384 & param0) == 0) {
                this.field_Y.b(-100);
                this.field_Y.a(false, 32);
                this.field_Y.a(false, 8);
                this.m(param3 ^ -121);
                return;
              }
              stackIn_40_0 = (0 == (param0 & 8192)) ? 0 : 1;
              var9 = stackIn_40_0;
              stackIn_43_0 = ((param0 & 4096) == 0) ? 0 : 1;
              var10 = stackIn_43_0;
              var11 = 7 & param0;
              do {
                var11--;
                if (var9 != 0) {
                  if (var6 != 0) {
                    if (var11 <= 0 &&
                      var10 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  } else {
                    if (var11 <= 0 &&
                      var10 != 0) {
                      this.a(4, var7);
                      this.b(var13, 57);
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
                var9 = 1;
              } while (var11 != 0 ||
                var10 != 0);
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                this.a((byte) 117, var13);
                if ((param0 & 2048) != 0) {
                  this.b(var7, -128);
                } else {
                  this.a(0, true, var7);
                }
              }
            }
            if (decompiledFrameCompleted1) {
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0) &&
            (var13.field_h.field_g == 3)) {
            if (var13.field_h.a((byte) -119, 10)) {
              if (param0 == 36864) {
                this.a(param3 ^ -5, var7);
                this.b(var13, param3 + 5);
              } else {
                if (!param2) {
                  this.field_Y.a(true, 113, param1);
                }
                this.a(~param3, false, var7);
                this.a((byte) 85, var13);
              }
            } else {
              if (param0 != 36864) {
                if (!param2) {
                  this.field_Y.a(param1, true, -12331);
                }
                this.a(0, false, var7);
                this.a((byte) 117, var13);
              } else {
                this.a(param3 ^ -5, var7);
                this.b(var13, param3 ^ 100);
              }
            }
          }
        }
        if (!param2) {
          if (var13.field_h.a((byte) -72, 13)) {
            this.field_Y.a(false);
          }
          if ((param0 & 4096) == 0) {
            this.field_Y.d(param3 ^ -109);
          } else {
            if (var6 != 0) {
              this.field_Y.a(param3 ^ 7);
            } else {
              this.field_Y.a(false);
            }
          }
        }
        if (param3 != -1) {
          discarded$0 = this.h(-79);
        }
        stackIn_101_0 = var13;
        stackIn_102_1 = (var8 == 0) ? false : true;
        stackIn_101_0.field_i = stackIn_102_1;
        this.m(101);
    }

    final void a(boolean param0) {
        ai stackIn_16_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        cl stackIn_58_0 = null;
        boolean stackIn_60_1 = false;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        int var2;
        String[] var3;
        ai var3_ref;
        int var4;
        String var5_ref_String;
        int var5;
        String[] var6_ref_String__;
        int var6;
        int var7;
        String var8_ref_String;
        int var8;
        int var9;
        int var10;
        int var11;
        hb var12;
        wd var13;
        String[] var14;
        rj var15;
        ai var16;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var6Lifetime2;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime1Lifetime1;
        rj var15Lifetime1;
        var11 = DungeonAssault.field_K;
        super.a(param0);
        this.field_e.b(0, 0);
        if (null == this.field_Y) {
          return;
        }
        if (null != this.field_Y.field_u) {
          go.a(10, 57, this.field_Y.field_u);
          var2 = 85;
          var14 = ae.field_a;
          var3 = var14;
          for (var4 = 0; var4 < var14.length; var4++) {
            var5_ref_String = var14[var4];
            la.field_b.b(var5_ref_String, 140, var2, 16777215, -1);
            var2 = var2 + la.field_b.field_H;
          }
        } else {
          var12 = (hb) null;
          go.a(10, 57, (hb) null);
        }
        go.a(50, 320, this.field_Y.field_u, this.field_Y.field_i);
        var2Lifetime1 = this.field_Y.field_B;
        if ((var2Lifetime1 == -1 ||
          this.field_Y.field_q == var2Lifetime1) && (this.field_s != -1 &&
          this.field_Y.field_p.a(this.field_s, (byte) 69))) {
          var2Lifetime1 = this.field_s;
        }
        if (var2Lifetime1 >= 0) {
          stackIn_16_0 = this.field_Y.field_h[var2Lifetime1];
        } else {
          stackIn_16_0 = null;
        }
        var16 = stackIn_16_0;
        var3_ref = var16;
        var4Lifetime1 = 0;
        if ((1 & this.field_Y.field_t) != 0) {
          var4Lifetime1 = 1;
        }
        if (null != this.field_Y.field_u &&
          (this.field_Y.field_u.field_d & 4) != 0) {
          var4Lifetime1 = 1;
        }
        stackIn_24_0 = var4Lifetime1;
        stackIn_25_1 = (this.field_Y.field_B != var2Lifetime1) ? 0 : 1;
        var4Lifetime2 = stackIn_24_0 & stackIn_25_1;
        if (var16 != null &&
          var16.field_h != null) {
          stackIn_30_0 = var4Lifetime2;
          stackIn_31_1 = (var16.field_h.field_g != 2) ? 0 : 1;
          var4Lifetime2 = stackIn_30_0 & stackIn_31_1;
        }
        if (var16 != null) {
          go.a(518, 57, var16);
          if (var16 != ac.field_n) {
            ig.field_b = jn.a(var16.field_h.field_z.toUpperCase(), np.field_I, -122, la.field_b);
            ac.field_n = var16;
          }
          var5 = 85;
          var6_ref_String__ = ig.field_b;
          for (var7 = 0; var6_ref_String__.length > var7; var7++) {
            var8_ref_String = var6_ref_String__[var7];
            la.field_b.a(var8_ref_String, 500, var5, 16777215, -1);
            var5 = var5 + la.field_b.field_H;
          }
        } else {
          var13 = (wd) null;
          go.a(518, 57, (wd) null, kc.field_V);
        }
        go.a(590, 320, var16, var4Lifetime2 != 0, this.field_Y.field_i);
        var15 = (rj) (this.field_p.e(-24172));
        while (var15 != null) {
          var15.a(65);
          var15 = (rj) (this.field_p.a(4));
        }
        ad.field_e.i(172, -ad.field_e.field_b + 40);
        ad.field_e.f(468 - ad.field_e.field_d, 40 - ad.field_e.field_b);
        if (null != this.field_x) {
          this.field_x.a(320, 24, 1699);
        }
        this.field_R.b((byte) -55);
        this.b(-114);
        if (this.field_b != null) {
          this.field_b.a((byte) -110);
        }
        go.e();
        this.field_q.a((byte) -21);
        if (this.field_b == null) {
          if (this.field_Y.field_k == 4 ||
            null != this.field_Y.field_u &&
            0 == (this.field_Y.field_u.field_o & 6) &&
            (this.field_Y.field_k == 32 ||
            8 == this.field_Y.field_k)) {
            stackIn_58_0 = this.field_R;
            stackIn_60_1 = !(this.field_w) || (0 == this.field_H);
            ((cl) (Object) stackIn_58_0).a(stackIn_60_1, -1723, this.field_X);
          }
          this.field_R.a(true);
        }
        var15Lifetime1 = (rj) (this.field_p.e(-24172));
        while (var15Lifetime1 != null) {
          var15Lifetime1.d(0);
          var15Lifetime1 = (rj) (this.field_p.a(4));
        }
        if (!this.field_w ||
          this.field_H == 0) {
          if (this.field_Q) {
            var6 = this.field_N.field_t;
            var7Lifetime1 = this.field_N.field_i;
            var8 = this.field_O.field_t - (-this.field_O.field_q + var6);
            var9 = this.field_N.field_x;
            if (null == uk.field_e) {
              uk.field_e = mf.a(16744448, 4 + var9, 8, 4 + var8, (byte) 112);
            }
            if (this.field_X % 30 >= 15) {
              ec.a(var7Lifetime1 - 2, var6 - 2, (byte) -93, uk.field_e, 16711680, 256);
            } else {
              if (this.field_X <= 0) {
                stackIn_75_0 = (int)((1.0 + Math.cos((double)((float)mo.field_a / 10.0f))) * 64.0) + 128;
              } else {
                stackIn_75_0 = 256;
              }
              var10 = stackIn_75_0;
              uk.field_e.b(-2 + var6, var7Lifetime1 - 2, var10);
            }
          }
          if (this.field_v) {
            var6Lifetime2 = this.field_z[0].field_t;
            var7Lifetime1Lifetime1 = this.field_z[0].field_i;
            var8Lifetime1 = 166;
            var9Lifetime1 = this.field_z[0].field_x;
            if (rd.field_z == null) {
              rd.field_z = mf.a(16744448, 4 + var9Lifetime1, 8, var8Lifetime1 + 4, (byte) 115);
            }
            if (15 <= this.field_X % 30) {
              ec.a(-2 + var7Lifetime1Lifetime1, -2 + var6Lifetime2, (byte) -96, rd.field_z, 16711680, 256);
            } else {
              if (this.field_X <= 0) {
                stackIn_85_0 = (int)(64.0 * (Math.cos((double)((float)mo.field_a / 10.0f)) + 1.0)) + 128;
              } else {
                stackIn_85_0 = 256;
              }
              var10Lifetime1 = stackIn_85_0;
              rd.field_z.b(var6Lifetime2 - 2, var7Lifetime1Lifetime1 - 2, var10Lifetime1);
            }
          }
        }
        if (this.field_b != null) {
          for (var6Lifetime1 = 0; var6Lifetime1 < gf.field_b.length; var6Lifetime1++) {
            gf.field_b[var6Lifetime1] = nb.a(gf.field_b[var6Lifetime1] >>> 2, 1061109567);
          }
          this.field_b.b(-61);
        }
        if (kn.field_g) {
          ab.a(0);
        }
        if (hj.field_S != -1) {
          if (!this.f(true)) {
          }
          oh.a((byte) 17);
        }
        if (ll.field_k &&
          0 < this.field_H) {
          ne.field_c.a(Integer.toString(this.field_H), 630, ne.field_c.field_H + 10, 16777215, -1);
        }
        return;
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        ai var5;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        var4 = DungeonAssault.field_K;
        if (this.field_w) {
          ac.field_B.d((byte) -101, 62);
          if (nf.field_A) {
            return;
          }
        }
        if (param0 != 17158) {
          var5 = (ai) null;
          this.a((ai) null, 46);
        }
        if (kn.field_g &&
          kd.field_c == 17) {
          gd.a(0, param0 ^ 17158, 4, param1);
        } else {
          if (en.a(param0 ^ -17159, bp.field_e)) {
            var3 = param1 ? 1 : 0;
            stackIn_19_0 = (ve.a(false)) ? 12 : 0;
            gd.a(stackIn_19_0, 0, 9, var3 != 0);
          } else {
            if (!ve.a(false)) {
              var3 = param1 ? 1 : 0;
              stackIn_15_0 = (ve.a(false)) ? 12 : 0;
              gd.a(stackIn_15_0, param0 ^ 17158, 0, var3 != 0);
            } else {
              gd.a(0, 0, 12, param1);
            }
          }
        }
    }

    final void f(byte param0) {
        ai var3 = null;
        int var2 = 0;
        if (this.field_Y.field_B != -1) {
          var3 = this.field_Y.field_h[this.field_Y.field_B];
          var2 = var3.field_p + var3.field_g > 8 ? 1 : 0;
        }
        if (var2 == 0) {
          t.a(64, g.field_Lb, true, true);
        } else {
          t.a(64, gh.field_d, true, true);
        }
        if (param0 > -126) {
          this.b(true, 28);
        }
    }

    final void a(boolean param0, int param1) {
        int var9 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int var3_int;
        o var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        ec var11;
        int var12;
        o var3Lifetime1;
        var10 = DungeonAssault.field_K;
        if (!param0) {
          var12 = 0;
          var3_int = var12;
          while (var12 < 4) {
            stackIn_33_0 = 0;
            stackIn_33_1 = this.field_P[var12];
            if (stackIn_33_0 < stackIn_33_1) {
              this.field_P[var12] = this.field_P[var12] - 1;
            }
            var12++;
          }
          if (this.field_P[2] > 0 &&
            0 == oi.b(0, 100)) {
            this.field_B.a(je.a(0, sa.field_v), false);
          }
        } else if (this.field_Y.field_q != -1) {
          var3_int = this.field_Y.field_q / 7;
          var4 = this.field_Y.field_q % 7;
          var5 = 4 * (1 + var3_int >> 1) + (1 + var4 >> 1);
          var6 = 4 * (var3_int >> 1) + 16 + (var4 >> 1);
          var7 = this.field_U[var5];
          var8 = this.field_U[var6];
          for (var9 = 0; var9 < 4; var9++) {
            stackIn_12_0 = ~var9;
            stackIn_12_1 = ~var7;
            if (stackIn_12_0 != stackIn_12_1 &&
              var8 != var9) {
              if (0 < this.field_P[var9]) {
                this.field_P[var9] = this.field_P[var9] - 1;
              }
            } else {
              if (256 > this.field_P[var9]) {
                this.field_P[var9] = this.field_P[var9] + 1;
              }
            }
          }
          if (this.field_P[2] > 0 &&
            0 == oi.b(0, 100)) {
            this.field_B.a(je.a(0, sa.field_v), false);
          }
        } else {
          if (this.field_P[2] > 0 &&
            0 == oi.b(0, 100)) {
            this.field_B.a(je.a(0, sa.field_v), false);
          }
        }
        if (this.field_P[3] > 0 &&
          oi.b(0, 100) == 0) {
          this.field_T.a(je.a(param1 - 251569954, hp.field_c), false);
        }
        this.field_D.d(oo.field_d * (om.field_b.field_a * this.field_P[0]) / 96 >> 8);
        this.field_L.d(this.field_P[1] * (k.field_f.field_a * oo.field_d) / 96 >> 8);
        var3 = (o) (this.field_B.e(param1 - 251594126));
        if (param1 != 251569954) {
          var11 = (ec) null;
          this.a(false, (ec) null, 74);
        }
        while (var3 != null) {
          var3.field_k.a(var3.field_p * this.field_P[2] >> 2, param1 ^ 251569970);
          var3 = (o) (this.field_B.a(4));
        }
        var3Lifetime1 = (o) (this.field_T.e(param1 ^ -251590986));
        while (var3Lifetime1 != null) {
          var3Lifetime1.field_k.a(var3Lifetime1.field_p * this.field_P[3] >> 2, -111);
          var3Lifetime1 = (o) (this.field_T.a(4));
        }
    }

    private final void e(boolean param0) {
        if (param0) {
          return;
        }
        this.field_H = 0;
    }

    private final boolean f(boolean param0) {
        int stackIn_23_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_1 = 0;
        Object var2;
        int var3;
        gg var4_ref_gg;
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        var5 = DungeonAssault.field_K;
        if (null == this.field_y) {
          return false;
        }
        var2 = null;
        if (wi.field_ob instanceof hj) {
          var2 = ((hj) (wi.field_ob)).field_V;
        }
        var3 = this.field_y.field_n.field_s;
        if (!param0) {
          return true;
        }
        if (ob.field_Lb == var3 &&
          this.field_G != -1) {
          var4_ref_gg = this.field_R.b(this.field_G, -15390);
          fj.field_d[0].h(-(fj.field_d[0].field_E >> 1) + var4_ref_gg.field_f, -(fj.field_d[0].field_G >> 1) + var4_ref_gg.field_b);
        }
        if (this.field_s != -1) {
          if ((ob.field_dc == var3 ||
            var3 == ob.field_Nb) &&
            -1 == this.field_G) {
            if (this.field_Y.b(this.field_s, 27747)) {
              stackIn_23_0 = (this.field_s != 24) ? 1 : 0;
            } else {
              stackIn_23_0 = 0;
            }
            var4 = stackIn_23_0;
            if (var4 != 0 &&
              this.field_Y.field_p.a(this.field_s, (byte) 66)) {
              var4 = 0;
            }
            if (var4 != 0) {
              fj.field_d[0].h(hj.field_S - 16, eh.field_h - 16);
            } else {
              fj.field_d[1].h(hj.field_S - 16, eh.field_h - 16);
            }
            return true;
          }
          if (ob.field_Lb == var3 &&
            this.field_I == -1) {
            if (this.field_s != -1) {
              if (this.field_s != this.field_G) {
                stackIn_41_0 = (this.field_s != 24) ? 1 : 0;
              } else {
                stackIn_41_0 = 0;
              }
            } else {
              stackIn_41_0 = 0;
            }
            var4Lifetime2 = stackIn_41_0;
            if (var4Lifetime2 != 0 &&
              this.field_Y.field_p.a(this.field_s, (byte) 72)) {
              var4Lifetime2 = 0;
            }
            if (var4Lifetime2 == 0) {
              fj.field_d[1].h(hj.field_S - 16, eh.field_h - 16);
            } else {
              fj.field_d[0].h(-16 + hj.field_S, -16 + eh.field_h);
            }
            return true;
          }
        }
        if (var2 != null) {
          if ((var3 == ob.field_nc ||
            var3 == ob.field_Ib) &&
            -1 == this.field_G) {
            stackIn_57_0 = (0 != ((hb) (var2)).field_n.field_z) ? 0 : 1;
            var4Lifetime1 = stackIn_57_0;
            if (ob.field_Ib == var3) {
              stackIn_60_0 = var4Lifetime1;
              if (((hb) (var2)).field_n.field_z != 1) {
                stackIn_61_1 = 0;
              } else {
                stackIn_61_1 = 1;
              }
              var4Lifetime1 = stackIn_60_0 | stackIn_61_1;
            }
            stackIn_64_0 = var4Lifetime1;
            if (0 != (6 & ((hb) (var2)).field_o)) {
              stackIn_65_1 = 0;
            } else {
              stackIn_65_1 = 1;
            }
            var4Lifetime1Lifetime1 = stackIn_64_0 & stackIn_65_1;
            if (var4Lifetime1Lifetime1 == 0) {
              bf.field_e[1].h(-16 + hj.field_S, -16 + eh.field_h);
            } else {
              bf.field_e[0].h(-16 + hj.field_S, eh.field_h - 16);
            }
            return true;
          }
          if (var3 == ob.field_Mb &&
            this.field_G == -1) {
            if ((((hb) (var2)).field_o & 4) != 0 &&
              ((hb) (var2)).field_g > 0) {
              kh.field_r.h(hj.field_S - 16, eh.field_h - 16);
            } else {
              kh.field_r.e(-16 + hj.field_S, eh.field_h - 16, 4210752);
            }
            return true;
          }
          if (var3 == ob.field_Zb &&
            this.field_G == -1 &&
            hj.field_S != -1) {
            if (var2 != this.field_y &&
              (((hb) (var2)).field_o & 6) == 0) {
              bf.field_e[0].h(-16 + hj.field_S, -16 + eh.field_h);
            } else {
              bf.field_e[1].h(hj.field_S - 16, -16 + eh.field_h);
            }
            return true;
          }
        }
        return false;
    }

    final boolean j(int param0) {
        wj var2 = ra.field_c;
        if (hc.field_c == 59) {
          this.e(false);
          this.a((byte) -110, (ec) (var2), false);
          return true;
        }
        if (hc.field_c == 66) {
          this.e(false);
          this.a(false, var2, this.field_Y.field_B, 4743);
          return true;
        }
        if (hc.field_c == 65) {
          this.e(false);
          this.a(-67, var2, false);
          return true;
        }
        if (hc.field_c == 70) {
          this.e(false);
          this.field_Y.a(false, 8);
          return true;
        }
        if (hc.field_c == 67) {
          this.e(false);
          this.field_Y.field_o = ((ec) ((Object) var2)).f(-118);
          this.field_Y.field_y = ((ec) ((Object) var2)).f(-97);
          this.field_Y.field_l = ((ec) ((Object) var2)).f(-119);
          this.i(104);
          return true;
        }
        if (hc.field_c == 68) {
          this.e(false);
          this.a(false, var2, -33);
          return true;
        }
        if (param0 != 0) {
          this.field_H = 90;
          return false;
        }
        return false;
    }

    final void c(byte param0) {
        this.a(jk.a(new String[]{Integer.toString(this.field_C)}, wi.field_qb, 30496), -8963);
        if (param0 >= -107) {
          go.b((byte) 51);
        }
        gd.a(64, qm.field_n);
        this.e((byte) -119);
    }

    private final void a(int param0, hb param1) {
        try {
          param1.field_b.a(95, param1.field_n.field_t);
          if (param0 != 4) {
            this.field_N = (pp) null;
          }
          t.a(64, g.field_Lb, true, true);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.VC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(long param0, int param1) {
        l.field_a.setTime(new Date(param0));
        int var3 = l.field_a.get(7);
        int var4 = l.field_a.get(5);
        int var5 = l.field_a.get(2);
        int var6 = l.field_a.get(1);
        int var8 = 66 % ((param1 + 54) / 54);
        int var7 = l.field_a.get(11);
        int var9 = l.field_a.get(12);
        int var10 = l.field_a.get(13);
        return tl.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + pp.field_F[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    private final void d(int param0) {
        ai stackIn_8_0 = null;
        String[] var2;
        ai var2_ref;
        String var3_ref_String;
        int var3;
        int var4;
        String[] var5;
        ai var6;
        var4 = DungeonAssault.field_K;
        if (null != this.field_Y.field_u &&
          this.field_Y.field_u.field_n.field_s != -1) {
          var5 = this.field_Y.field_u.field_n.field_d;
          var2 = var5;
          var3_ref_String = jk.a(new String[]{this.field_Y.field_u.field_n.field_F.toUpperCase()}, "<col=178B8B><%0></col>", 30496);
          this.field_O.field_n = (en) ((Object) new qf(jk.a(new String[]{var5[0]}, vo.field_m, 30496), jk.a(new String[]{var3_ref_String}, var5[1], 30496)));
        } else {
          this.field_O.field_n = null;
        }
        if (this.field_Y.field_B != -1) {
          stackIn_8_0 = this.field_Y.field_h[this.field_Y.field_B];
        } else {
          stackIn_8_0 = null;
        }
        var6 = stackIn_8_0;
        var2_ref = var6;
        if (var2_ref != null) {
          if (var6.field_h.field_g != 1) {
            if (3 != var6.field_h.field_g) {
              if (!var6.field_h.a((byte) -123, 15)) {
                this.field_N.field_n = (en) ((Object) new qf(dn.field_L, hm.field_l, gi.field_Q));
              } else {
                this.field_N.field_n = (en) ((Object) new qf(dn.field_L, a.field_k, gi.field_Q));
              }
            } else {
              this.field_N.field_n = (en) ((Object) new qf(u.field_S, kg.field_k, rb.field_I));
            }
          } else {
            this.field_N.field_n = (en) ((Object) new qf(vd.field_b, ai.field_d, vo.field_o));
          }
        }
        this.field_r.field_n = (en) ((Object) new qf(lh.field_b, mo.field_f, fp.field_e));
        this.field_t.field_n = (en) ((Object) new qf(qa.field_d, eb.field_I, jc.field_b));
        var3 = 14 / ((9 - param0) / 56);
        if (32 == this.field_Y.field_k) {
          this.field_N.field_n = (en) ((Object) new e(pb.field_H));
        }
    }

    private final void a(ec param0, int param1) {
        if (this.field_w) {
          if (!this.h(56)) {
            return;
          }
          ac.field_B.d((byte) -114, 64);
          ac.field_B.a(6, param0.field_o);
          ac.field_B.a(param0.field_m, 1, param0.field_o, 0);
          return;
        }
        try {
          if (param1 < 106) {
            this.a(false);
          }
          param0.field_o = 0;
          this.a(-67, param0, true);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.UC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    go(boolean param0, pj param1, go param2) {
        this(param0, param1);
        try {
          if (gl.field_Lb) {
            this.field_R = (cl) ((Object) new sf(this, 320, 240));
          } else {
            if (param2.field_R instanceof lj) {
              this.field_R = (cl) ((Object) new lj(this, (lj) (param2.field_R)));
            } else {
              this.field_R = (cl) ((Object) new lj(this, 320, 210));
            }
          }
          this.field_P = param2.field_P;
          this.field_L = param2.field_L;
          this.field_T = param2.field_T;
          this.field_B = param2.field_B;
          this.field_D = param2.field_D;
          this.field_U = param2.field_U;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, ec param1, int param2) {
        ro dupTemp$3 = null;
        int var4_int = 0;
        int var5 = 0;
        ro var6 = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = DungeonAssault.field_K;
        try {
          var4_int = 18 % ((71 - param2) / 49);
          this.field_C = param1.k(0);
          var5 = param1.c(true);
          if (this.field_b instanceof ro) {
            var6 = (ro) (this.field_b);
          } else {
            dupTemp$3 = new ro(this);
            var6 = dupTemp$3;
            this.field_b = (kl) ((Object) dupTemp$3);
          }
          if (var5 != 0) {
            if (!param0) {
              this.field_Y.a(32768, 2);
            }
            var6.a(15 & var5, this.field_C, (byte) 1);
          } else {
            if (!param0) {
              this.field_Y.a(32768, 1);
            }
            var6.a((byte) 101, this.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("go.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(boolean param0) {
        int var3_int = 0;
        int var2 = 0;
        hb var4_ref_hb;
        int var5;
        hb[] var6;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        ai var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        var5 = DungeonAssault.field_K;
        var6 = this.field_Y.field_A;
        for (var3_int = 0; var6.length > var3_int; var3_int++) {
          var4_ref_hb = var6[var3_int];
          if (var4_ref_hb != null) {
            var4_ref_hb.field_i = go.a(var4_ref_hb, this.field_Y.field_i);
          }
        }
        if (param0) {
          this.field_W = (String) null;
        }
        for (var2 = 0; 49 > var2; var2++) {
          var3 = this.field_Y.field_h[var2];
          if (var3 != null) {
            var4 = 0;
            if (0 != (1 & this.field_Y.field_t)) {
              var4 = 1;
            }
            if (this.field_Y.field_u != null &&
              0 != (4 & this.field_Y.field_u.field_d)) {
              var4 = 1;
            }
            stackIn_22_0 = var4;
            if (this.field_Y.field_B != var2) {
              stackIn_23_1 = 0;
            } else {
              stackIn_23_1 = 1;
            }
            var4Lifetime1 = stackIn_22_0 & stackIn_23_1;
            stackIn_25_0 = var4Lifetime1;
            if (var3.field_h.field_g != 2) {
              stackIn_26_1 = 0;
            } else {
              stackIn_26_1 = 1;
            }
            var4Lifetime2 = stackIn_25_0 & stackIn_26_1;
            var3.field_f = go.a(var3, this.field_Y.field_j.a(var2, (byte) 79), var4Lifetime2 != 0, this.field_Y.field_i);
          }
        }
    }

    private final void e(int param0) {
        if (this.field_w) {
          if (!this.h(105)) {
            return;
          }
          ac.field_B.d((byte) -78, 68);
          return;
        }
        this.field_Y.a(false, 8);
        if (param0 != 68) {
          hb var3 = (hb) null;
          this.a((hb) null, (hb) null, -76, (byte) -21);
        }
    }

    private final void a(String param0, int param1) {
        try {
          if (param1 != -8963) {
            this.field_U = (int[]) null;
          }
          this.field_W = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "go.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void l(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        tf stackIn_13_1 = null;
        var5 = DungeonAssault.field_K;
        if (param0 != 18014) {
          return;
        }
        this.b();
        var2 = -gh.field_g[0].field_v + 888 >> 1;
        this.field_r = ke.a(var2, (byte) -115, gh.field_g[0], 506);
        this.field_N = ke.a(var2, (byte) -123, gh.field_g[1], 464);
        this.field_t = ke.a(var2, (byte) -125, gh.field_g[2], 548);
        this.field_O = ke.a(var2, (byte) -114, gh.field_g[3], 590);
        this.field_J = tn.a(-jm.field_i.field_y + 164 >> 1, (32 - jm.field_i.field_v >> 1) + 8, ne.field_c, jm.field_i, param0 - 18125, l.field_d);
        this.field_K = tn.a(476 + (-jm.field_i.field_y + 164 >> 1), 8 + (32 - jm.field_i.field_v >> 1), ne.field_c, jm.field_i, -109, r.field_a);
        var3 = 424;
        this.field_M = new nn(false);
        this.field_z = new hj[4];
        for (var4 = 0; 4 > var4; var4++) {
          if (null != this.field_Y.field_A[var4]) {
            this.field_z[var4] = new hj(this.field_Y, this.field_Y.field_A[var4], 10 + 42 * var4, var3);
            this.field_M.a((gd) (this.field_z[var4]), (byte) -20);
            this.field_p.a(this.field_z[var4], false);
          }
        }
        this.field_p.a(this.field_r, false);
        this.field_p.a(this.field_N, false);
        this.field_p.a(this.field_t, false);
        this.field_p.a(this.field_O, false);
        this.field_p.a(this.field_J, false);
        this.field_p.a(this.field_K, false);
        if (null == this.field_Y.field_f) {
          stackIn_13_1 = null;
        } else {
          stackIn_13_1 = new tf(ne.field_c, this.field_Y.field_f, ag.field_c);
        }
        this.field_x = stackIn_13_1;
        this.field_q = new sa(180, 401, 280, 79);
        this.d((byte) -70);
    }

    private final void a(boolean param0, ec param1, int param2, int param3) {
        int stackIn_17_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_95_0 = null;
        boolean stackIn_96_1 = false;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ai var6 = null;
        hb var7 = null;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var18Lifetime1;
        String var18Lifetime2;
        int var8Lifetime1;
        var17 = DungeonAssault.field_K;
        try {
          var5_int = param1.k(param3 - 4743);
          if (param3 != 4743) {
            field_V = (String) null;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          var6 = this.field_Y.field_h[param2];
          var7 = this.field_Y.field_u;
          var8 = 0;
          if (var6.field_h.field_g == 1) {
            if (36864 != var5_int) {
              if (20480 == var5_int) {
                var9 = new oc(var7, var6, true, ba.field_d);
              } else {
                if (0 != (var5_int & 2048)) {
                  var9 = new oc(var7, var6, false, vb.field_a);
                } else {
                  var9 = new oc(var7, var6, false, bp.field_c);
                }
              }
            } else {
              var9 = new oc(var7, var6, true, ch.field_l);
            }
          } else {
            if (2 == var6.field_h.field_g) {
              stackIn_17_0 = ((var5_int & 32768) == 0) ? 0 : 1;
              var8Lifetime1 = stackIn_17_0;
              if (var6.field_h.a((byte) -54, 7) &&
                var8Lifetime1 != 0) {
                var9 = new oc(var7, var6, false, jk.a(new String[]{var6.field_h.field_z}, ep.field_i, 30496));
                decompiledFrameRemainder0 = false;
              }
              else {
                if ((16384 & var5_int) != 0 &&
                  !param0) {
                  this.field_Y.a(param2, true, param3 - 17074);
                }
                if ((16384 & var5_int) == 0 &&
                  var8Lifetime1 == 0) {
                  var10 = mo.field_h;
                } else {
                  var10 = uo.field_d;
                }
                if ((1024 & var5_int) != 0 &&
                  var7.field_n.a(ob.field_jc, -120)) {
                  var10 = var10 + " <col=FF8000>" + jk.a(new String[]{var7.field_n.field_F}, ia.field_N, 30496) + "</col> ";
                  var18 = var10;
                  var10 = var18;
                  var18Lifetime2 = var10;
                  var10 = var18Lifetime2;
                }
                if (var6.field_h.a((byte) -74, 3) &&
                  (var5_int & 16384) == 0) {
                  if ((4096 & var5_int) != 0) {
                    var9 = new oc(var7, var6, true, var10 + " " + fc.field_e);
                  } else {
                    if ((var5_int & 2048) == 0) {
                      var9 = new oc(var7, var6, false, var10 + " " + bp.field_c);
                    } else {
                      var9 = new oc(var7, var6, false, var10 + " " + vb.field_a);
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var6.field_h.a((byte) -107, 15) &&
                    0 == (16384 & var5_int)) {
                    var9 = new oc(var7, var6, true, var10 + " " + qj.field_d);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    stackIn_41_0 = ((var5_int & 8192) == 0) ? 0 : 1;
                    var11 = stackIn_41_0;
                    stackIn_44_0 = (0 == (4096 & var5_int)) ? 0 : 1;
                    var12 = stackIn_44_0;
                    var13 = 7 & var5_int;
                    var14 = -1;
                    if (0 != (var5_int & 1024) &&
                      var7.field_n.a(ob.field_mc, 89)) {
                      var14 = ji.a(-1 + var13, false, 1);
                    }
                    var15 = -1;
                    if ((512 & var5_int) != 0) {
                      if (var6.field_h.a((byte) -83, 17)) {
                        var16 = 1;
                        if (var12 == 0) {
                          var16 = 0;
                        }
                        var15 = ji.a(-1 + var13, false, var16);
                        var13--;
                      } else {
                        var13--;
                      }
                    } else {
                      var13--;
                    }
                    while (true) {
                      if (var11 != 0) {
                        if (var8Lifetime1 != 0) {
                          var19 = var10 + " " + al.field_m;
                          var10 = var19;
                          if (var13 <= 0 &&
                            var12 != 0) {
                            var9 = new oc(var7, var6, true, var19 + " " + cm.field_K);
                            decompiledFrameCompleted2 = false;
                            break;
                          }
                        } else {
                          var18Lifetime1 = var10 + " " + ri.field_c;
                          var10 = var18Lifetime1;
                          if (var15 == var13) {
                            var10 = var18Lifetime1 + " <col=FF8000>" + jk.a(new String[]{var6.field_h.field_z}, qi.field_h, 30496) + "</col>";
                          }
                          if (var13 == 0 &&
                            var12 != 0) {
                            var9 = new oc(var7, var6, true, var10 + " " + lj.field_p);
                            decompiledFrameCompleted1 = false;
                            break;
                          }
                        }
                      }
                      var20 = var10 + " " + u.field_R;
                      var10 = var20;
                      var11 = 1;
                      if (var13 == var14) {
                        var10 = var20 + " <col=FF8000>" + jk.a(new String[]{var7.field_n.field_F}, le.field_e, param3 ^ 26023) + "</col>";
                      }
                      if (var13 <= 0 &&
                        var12 == 0) {
                        var9 = new oc(var7, var6, false, var10 + " " + h.field_i);
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      var13--;
                    }
                  }
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              if (var6.field_h.field_g == 3) {
                if (var6.field_h.a((byte) -122, 10)) {
                  if (var5_int == 36864) {
                    var9 = new oc(var7, var6, true, np.field_G);
                  } else {
                    var9 = new oc(var7, var6, false, ah.field_a);
                  }
                } else {
                  if (var5_int != 36864) {
                    var9 = new oc(var7, var6, false, nh.field_b);
                  } else {
                    var9 = new oc(var7, var6, true, c.field_c);
                  }
                }
              } else {
                var9 = null;
              }
            }
          }
          if (var9 != null) {
            if (this.field_b != null) {
              this.field_b.c(-117);
              this.field_b = null;
            }
            stackIn_95_0 = var9;
            stackIn_96_1 = (param0);
            ((oc) (stackIn_95_0)).field_t = stackIn_96_1;
            ((oc) (var9)).field_B = var5_int;
            this.field_b = (kl) (var9);
            ((oc) (var9)).field_w = this;
            ((oc) (var9)).field_q = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_100_0 = var5;
          stackIn_100_1 = new StringBuilder().append("go.GC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var3;
        var3 = DungeonAssault.field_K;
        if (param0 != 27989) {
          this.field_E = (String) null;
        }
        if (4 != this.field_Y.field_k) {
          if (this.field_Y.field_k != 8) {
            if (this.field_Y.field_k == 16) {
              this.a(rn.field_d, -8963);
            } else {
              if (this.field_Y.field_k == 32) {
                this.a(co.field_E, -8963);
              }
            }
          } else {
            if (this.field_Y.field_u != null) {
              this.a(pi.field_g, -8963);
            } else {
              this.a(ho.field_b, param0 ^ -20056);
            }
          }
        } else {
          this.a(bj.field_I, param0 - 36952);
        }
    }

    go(boolean param0, pj param1) {
        e dupTemp$1 = null;
        e dupTemp$2 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int var4 = 0;
        hb[] var4_ref_hb__ = null;
        int var5 = 0;
        int[] var6 = null;
        hb var6_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        hb[] var10 = null;
        hb var11 = null;
        int[] var12 = null;
        hb[] var13 = null;
        ai var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        md discarded$0 = new md();
        hb[] var4_ref_hb__Lifetime1;
        hb var6_refLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        this.field_v = true;
        this.field_y = null;
        this.field_Q = true;
        this.field_W = bj.field_I;
        this.field_X = 0;
        try {
          stackIn_4_1 = (param0);
          this.field_w = stackIn_4_1;
          var15 = bp.field_e;
          var9 = var15;
          var8 = var9;
          var3 = var8;
          for (var4 = 0; 8 > var4; var4++) {
            var15[var4] = 0;
          }
          this.field_Y = param1;
          this.a(27989);
          this.g(false);
          this.c(7872);
          this.l(18014);
          if (kn.field_g) {
            cc.field_d = 0;
            qa.field_a = new int[this.field_Y.field_A.length][];
            var10 = this.field_Y.field_A;
            for (var4Lifetime1 = 0; var10.length > var4Lifetime1; var4Lifetime1++) {
              var11 = var10[var4Lifetime1];
              if (var11 != null) {
                var16 = new int[4];
                var12 = var16;
                var6 = var12;
                var6[1] = var11.field_n.field_r;
                var6[0] = var11.field_n.field_m;
                var6[2] = var11.field_n.field_b;
                var6[3] = var11.field_n.field_o;
                qa.field_a[var11.field_j] = var16;
              }
            }
            fm.a(60, 0);
          }
          this.d(false);
          if (null == fi.field_r) {
            rd.field_F = new en[4];
            fi.field_r = new en[4];
            dupTemp$1 = new e(ck.field_H.a("attack", -53));
            rd.field_F[0] = (en) ((Object) dupTemp$1);
            fi.field_r[0] = (en) ((Object) dupTemp$1);
            dupTemp$2 = new e(ck.field_H.a("defence", -126));
            rd.field_F[1] = (en) ((Object) dupTemp$2);
            fi.field_r[1] = (en) ((Object) dupTemp$2);
            fi.field_r[2] = (en) ((Object) new e(ck.field_H.a("dodge", -96)));
            fi.field_r[3] = (en) ((Object) new e(ck.field_H.a("sneak", -48)));
            rd.field_F[2] = (en) ((Object) new e(ck.field_H.a("snare", -115)));
            rd.field_F[3] = (en) ((Object) new e(ck.field_H.a("detect", -89)));
          }
          var3_int = 0;
          var13 = this.field_Y.field_A;
          var4_ref_hb__ = var13;
          for (var5 = 0; var5 < var13.length; var5++) {
            var6_ref = var13[var5];
            if (null != var6_ref) {
              var3_int++;
            }
          }
          if (var3_int == 1) {
            var4_ref_hb__Lifetime1 = this.field_Y.field_A;
            for (var5Lifetime1 = 0; var5Lifetime1 < var4_ref_hb__Lifetime1.length; var5Lifetime1++) {
              var6_refLifetime1 = var4_ref_hb__Lifetime1[var5Lifetime1];
              if (null != var6_refLifetime1) {
                this.field_Y.field_u = var6_refLifetime1;
              }
            }
          }
          if (this.field_Y.field_u != null) {
            this.b((byte) 70, this.field_Y.field_u);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < 49; var4Lifetime2++) {
            if (this.field_Y.field_p.a(var4Lifetime2, (byte) 96)) {
              var14 = this.field_Y.field_h[var4Lifetime2];
              var14.field_c = new wd(var14.field_h.field_d);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_37_0 = var3_ref;
          stackIn_37_1 = new StringBuilder().append("go.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_F = "Pit";
        field_V = "TOP DOWN";
    }
}
