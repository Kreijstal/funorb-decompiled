/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends l {
    static String field_q;
    int field_F;
    boolean[] field_y;
    int field_I;
    String field_K;
    static String field_o;
    private int field_O;
    private int field_L;
    private int field_E;
    private boolean field_v;
    private wn field_l;
    static int field_C;
    int field_t;
    private int field_p;
    int field_P;
    int field_m;
    private er field_G;
    private boolean field_w;
    private int field_B;
    int field_x;
    boolean field_u;
    int field_J;
    private er field_M;
    private boolean field_n;
    private er field_A;
    static String[] field_z;
    static cc field_N;
    private boolean field_H;
    static int[] field_r;
    private int field_D;
    String[] field_k;
    private int field_s;

    public static void a(byte param0) {
        field_N = null;
        if (param0 != -50) {
          field_o = (String) null;
        }
        field_r = null;
        field_q = null;
        field_z = null;
        field_o = null;
    }

    final static ug c(boolean param0) {
        if (!param0) {
          return (ug) null;
        }
        return (ug) ((Object) new nl());
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        String stackIn_47_2 = null;
        String stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          nm.field_J = true;
          da.field_j = param1;
          if (0 == da.field_j) {
            var3_int = dc.a(bc.field_c, qr.field_o, (byte) 101, rn.field_w, mf.field_c);
            var4 = 3 + var3_int;
            gd.field_s = new int[var4];
            mn.field_q = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              gd.field_s[var5] = -1;
            }
            gi.field_n = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              mn.field_q[var5] = rn.field_w[var5];
            }
            mn.field_q[-3 + var4] = "";
            mn.field_q[var4 - 2] = dc.field_M;
            gd.field_s[var4 - 2] = 0;
            gi.field_n[0] = 4;
            mn.field_q[var4 - 1] = lr.field_N;
            gd.field_s[var4 - 1] = 1;
            gi.field_n[1] = 5;
          } else if (da.field_j == 1) {
            var3_int = dc.a(bc.field_c, qr.field_o, (byte) 33, rn.field_w, mf.field_c);
            var4 = var3_int + 2;
            gd.field_s = new int[var4];
            mn.field_q = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              gd.field_s[var5] = -1;
            }
            gi.field_n = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              mn.field_q[var5] = rn.field_w[var5];
            }
            mn.field_q[var4 - 2] = "";
            mn.field_q[-1 + var4] = lr.field_N;
            gd.field_s[var4 - 1] = 0;
            gi.field_n[0] = 5;
          } else if (2 != da.field_j) {
            if (da.field_j == 3) {
              if (!gi.field_s.field_p) {
                var3_int = dc.a(bc.field_c, ko.field_U, (byte) 110, rn.field_w, mf.field_c);
              } else {
                var3_int = dc.a(bc.field_c, tk.field_p, (byte) 91, rn.field_w, mf.field_c);
              }
              var4 = 2 + var3_int;
              gd.field_s = new int[var4];
              mn.field_q = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                gd.field_s[var5] = -1;
              }
              gi.field_n = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                mn.field_q[var5] = rn.field_w[var5];
              }
              mn.field_q[var4 - 2] = "";
              mn.field_q[var4 - 1] = lr.field_N;
              gd.field_s[-1 + var4] = 0;
              gi.field_n[0] = 5;
            } else if (da.field_j == 4) {
              var3_int = dc.a(bc.field_c, lh.field_a, (byte) 50, rn.field_w, mf.field_c);
              var4 = 2 + var3_int;
              gd.field_s = new int[var4];
              mn.field_q = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                gd.field_s[var5] = -1;
              }
              gi.field_n = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                mn.field_q[var5] = rn.field_w[var5];
              }
              mn.field_q[-2 + var4] = "";
              mn.field_q[var4 - 1] = lr.field_N;
              gd.field_s[-1 + var4] = 0;
              gi.field_n[0] = 5;
            } else {
              if (da.field_j != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = dc.a(bc.field_c, w.field_D, (byte) 28, rn.field_w, mf.field_c);
              var4 = 3 + var3_int;
              mn.field_q = new String[var4];
              gd.field_s = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                gd.field_s[var5] = -1;
              }
              gi.field_n = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                mn.field_q[var5] = rn.field_w[var5];
              }
              mn.field_q[var4 - 3] = "";
              mn.field_q[var4 - 2] = eo.field_n;
              gd.field_s[-2 + var4] = 0;
              gi.field_n[0] = 3;
              mn.field_q[-1 + var4] = lr.field_N;
              gd.field_s[var4 - 1] = 1;
              gi.field_n[1] = 5;
            }
          } else {
            var3_int = dc.a(bc.field_c, Vertigo2.a(new String[]{"<br><%0><br>"}, bc.field_a, -112), (byte) 36, rn.field_w, mf.field_c);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(rn.field_w[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            jo.field_g = new String[var4];
            qq.a(rn.field_w, 0, jo.field_g, 0, var4);
            field_z = new String[var3_int - var4 - 1];
            qq.a(rn.field_w, 1 + var4, field_z, 0, -1 - var4 + var3_int);
            var3_int = dc.a(bc.field_c, Vertigo2.a(new String[]{"<br><%0><br>"}, ro.field_f, -113), (byte) 102, rn.field_w, mf.field_c);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(rn.field_w[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (-1 == var4) {
              throw new IllegalStateException();
            }
            rp.field_e = new String[var4];
            qq.a(rn.field_w, 0, rp.field_e, 0, var4);
            ba.field_b = new String[-1 - var4 + var3_int];
            qq.a(rn.field_w, var4 + 1, ba.field_b, 0, -var4 + var3_int - 1);
            if (jo.field_g.length >= rp.field_e.length) {
              stackIn_29_0 = jo.field_g.length;
            } else {
              stackIn_29_0 = rp.field_e.length;
            }
            var5 = stackIn_29_0;
            if (ba.field_b.length <= field_z.length) {
              stackIn_32_0 = field_z.length;
            } else {
              stackIn_32_0 = ba.field_b.length;
            }
            var6 = stackIn_32_0;
            var7 = var5 + 7 + var6;
            gd.field_s = new int[var7];
            mn.field_q = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              gd.field_s[var8] = -1;
            }
            gd.field_s[1] = 0;
            gi.field_n = new int[2];
            mn.field_q[1] = ca.field_d;
            mn.field_q[0] = am.field_e;
            gd.field_s[3] = 1;
            gi.field_n[1] = 2;
            gi.field_n[0] = 5;
            mn.field_q[3] = wn.field_i;
            mn.field_q[2] = lf.field_E;
            mn.field_q[5] = "";
            mn.field_q[4] = dc.field_K;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_39_0 = mn.field_q;
              stackIn_39_1 = var8Lifetime2 + 6;
              if (-var5 + (var8Lifetime2 + rp.field_e.length) >= 0) {
                stackIn_40_2 = rp.field_e[var8Lifetime2 - (-rp.field_e.length + var5)];
              } else {
                stackIn_40_2 = "";
              }
              stackIn_39_0[stackIn_39_1] = stackIn_40_2;
            }
            mn.field_q[var5 + 6] = null;
            gd.field_s[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_44_0 = mn.field_q;
              stackIn_44_1 = var8Lifetime3 + (7 + var5);
              stackIn_44_2 = ~ba.field_b.length;
              stackIn_44_3 = ~var8Lifetime3;
              if (stackIn_44_2 >= stackIn_44_3) {
                stackIn_47_2 = "";
              } else {
                stackIn_47_2 = ba.field_b[var8Lifetime3];
              }
              stackIn_44_0[stackIn_44_1] = stackIn_47_2;
            }
            qe.field_cb = gk.a(95);
          }
          ve.field_d.field_b = gi.field_n.length;
          var3_intLifetime1 = 0;
          if (param2 != -30962) {
            field_r = (int[]) null;
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < mn.field_q.length; var4Lifetime1++) {
            stackIn_90_0 = mn.field_q[var4Lifetime1];
            stackIn_91_1 = !(gd.field_s[var4Lifetime1] < 0);
            var5Lifetime1 = uc.a(stackIn_90_0, stackIn_91_1, false);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (da.field_j == 2) {
            var10 = jo.field_g;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = uc.a(var11, false, false);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = field_z;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = uc.a(var12, false, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          jp.field_o = ve.field_d.field_b * (qc.field_z + al.field_z << 1);
          sg.field_d = -(var3_intLifetime1 >> 1) + vm.field_c;
          c.field_e = -(var3_intLifetime1 >> 1) + var3_intLifetime1 + vm.field_c;
          for (var4Lifetime2 = 0; var4Lifetime2 < mn.field_q.length; var4Lifetime2++) {
            stackIn_115_0 = jp.field_o;
            if (0 <= gd.field_s[var4Lifetime2]) {
              stackIn_116_1 = kd.field_z;
            } else {
              stackIn_116_1 = gd.field_k;
            }
            jp.field_o = stackIn_115_0 + stackIn_116_1;
          }
          be.field_t = -(jp.field_o >> 1) + s.field_u;
          vi.field_C = new int[mn.field_q.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = be.field_t;
          while (var4Lifetime3 < mn.field_q.length) {
            var6Lifetime1 = gd.field_s[var4Lifetime3];
            if (0 > var6Lifetime1) {
              var5Lifetime3 = var5Lifetime3 + gd.field_k;
            } else {
              var7Lifetime2 = uc.a(mn.field_q[var4Lifetime3], true, false);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + vm.field_c;
              var5Lifetime3 = var5Lifetime3 + al.field_z;
              vi.field_C[var4Lifetime3] = new int[4];
              vi.field_C[var4Lifetime3][0] = -gl.field_l + var8Lifetime1;
              vi.field_C[var4Lifetime3][1] = var5Lifetime3;
              vi.field_C[var4Lifetime3][2] = (gl.field_l << 1) + var7Lifetime2;
              vi.field_C[var4Lifetime3][3] = (qc.field_z << 1) + kd.field_z;
              var5Lifetime3 = var5Lifetime3 + (kd.field_z + (qc.field_z << 1) + al.field_z);
            }
            var4Lifetime3++;
          }
          if (da.field_j != 2) {
            ve.field_d.a(param0, fk.b(gb.field_d, 1282642017, ed.field_n), 0, (byte) 80);
          } else {
            ve.field_d.a(param0, -1, -1, (byte) 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "bl.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        String stackIn_13_0 = null;
        int stackIn_20_0 = 0;
        er stackIn_48_0 = null;
        er stackIn_51_0 = null;
        int var2;
        int var3;
        int var4;
        String var4_ref_String;
        float var5;
        int var5_int;
        int var6;
        int var7;
        er[] var7_ref_er__;
        int var8;
        er var9;
        int var9_int;
        er var10;
        int var10_int;
        int var11;
        int var13;
        int var6Lifetime1;
        int var8Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        bi.a(bm.field_E);
        bi.g(this.field_g, this.field_c + 4, -this.field_E + this.field_g + this.field_f, -4 + this.field_l.field_k + this.field_j + this.field_c);
        if (!this.field_n) {
          this.field_D = 0;
          this.field_L = 0;
        }
        var2 = this.field_l.field_k + this.field_c;
        var3 = 0;
        while (true) {
          if (this.field_k.length <= var3 &&
            this.field_j + this.field_c < var2) {
            bi.b(bm.field_E);
            var3 = param0 + (-this.field_E + (this.field_f + this.field_g));
            var4 = this.field_l.field_k + this.field_c;
            if (this.field_n) {
              bi.b(var3, var4, this.field_E, -this.field_l.field_k + this.field_j, ir.field_f & this.field_J, this.field_J >>> uq.field_d);
              bi.b(var3, var4, this.field_E, this.field_E, this.field_J & ir.field_f, this.field_J >>> uq.field_d);
              bi.b(var3, -this.field_E + (this.field_j + this.field_c), this.field_E, this.field_E, this.field_J & ir.field_f, this.field_J >>> uq.field_d);
              var5 = (float)(this.field_L - 3) / (float)(this.field_k.length - 8);
              var6 = 0;
              if (this.field_A != null) {
                var6 = this.field_A.field_t;
              }
              var7 = -var6 + (-16 - 2 * this.field_M.field_t) + (this.field_j - this.field_l.field_k);
              var8 = (int)(var5 * (float)var7) - (-this.field_M.field_t + (-8 - var6 / 2));
              if (null != this.field_M &&
                this.field_G != null) {
                if (!this.field_v) {
                  stackIn_48_0 = this.field_M;
                } else {
                  stackIn_48_0 = this.field_G;
                }
                var9 = stackIn_48_0;
                if (!this.field_H) {
                  stackIn_51_0 = this.field_M;
                } else {
                  stackIn_51_0 = this.field_G;
                }
                var10 = stackIn_51_0;
                var9.e(var3, var4);
                var10.g(var3, -var10.field_B + this.field_c + this.field_j);
              }
              bi.f(var3, 2 + (var4 + this.field_E), this.field_E, this.field_j - (this.field_l.field_k - (-(2 * this.field_M.field_t) - 4)), 3, 4013373);
              bi.f(var3 + 2, this.field_E + var4 + 4, -4 + this.field_E, -8 + (-this.field_l.field_k + this.field_j - 2 * this.field_M.field_t), 3, 5921370);
              this.field_A.e(-(this.field_A.field_x / 2) + this.field_E / 2 + var3, -(this.field_A.field_t / 2) + var8 + var4);
            }
            this.field_l.b(param0 ^ 109);
            if (this.field_n) {
              bi.b(this.field_g, this.field_c + 2, this.field_f, this.field_m);
              bi.b(this.field_g, 3 + this.field_c, this.field_f, this.field_m);
              bi.b(this.field_g, -4 + (this.field_j + (this.field_c + this.field_l.field_k)), this.field_f, this.field_m);
              bi.b(this.field_g, -3 + this.field_l.field_k + (this.field_j + this.field_c), this.field_f, this.field_m);
            }
            return;
          }
          stackIn_7_0 = ~this.field_k.length;
          stackIn_7_1 = ~var3;
          if (stackIn_7_0 < stackIn_7_1) {
            if (!this.field_y[var3] &&
              null != this.field_K) {
              stackIn_13_0 = this.field_K;
            } else {
              stackIn_13_0 = this.field_k[var3];
            }
            var4_ref_String = stackIn_13_0;
            if (!this.field_y[var3]) {
              if (var3 == this.field_t) {
                stackIn_20_0 = this.field_I;
              } else {
                stackIn_20_0 = this.field_P;
              }
            } else {
              if (var3 != this.field_t) {
                stackIn_20_0 = this.field_F;
              } else {
                stackIn_20_0 = this.field_x;
              }
            }
            var5_int = stackIn_20_0;
            var6Lifetime1 = this.field_l.a(1, var4_ref_String);
            var7_ref_er__ = mn.field_o;
            if (var3 != this.field_t) {
              if (!this.field_y[var3]) {
                var7_ref_er__ = sq.field_a;
              }
            } else {
              var7_ref_er__ = ln.field_b;
            }
            var8Lifetime1 = var7_ref_er__[0].field_y + var7_ref_er__[2].field_y;
            var9_int = (this.field_f - var8Lifetime1) / var7_ref_er__[1].field_y - 1;
            var8Lifetime1 = var8Lifetime1 + var9_int * var7_ref_er__[1].field_y;
            var10_int = -this.field_D + (this.field_l.field_k + var2 - 2 * this.field_l.field_c) - var7_ref_er__[0].field_t / 2;
            var11 = -10 + this.field_g + (-var8Lifetime1 + this.field_f) / 2;
            var7_ref_er__[0].e(var11, var10_int);
            var11 = var11 + var7_ref_er__[0].field_y;
            for (var12 = 0; var9_int > var12; var12++) {
              var7_ref_er__[1].e(var11, var10_int);
              var11 = var11 + var7_ref_er__[1].field_y;
            }
            var7_ref_er__[2].e(var11, var10_int);
            this.field_l.a(var5_int, (byte) 78, -1, -10 + (this.field_g + this.field_f / 2 - var6Lifetime1 / 2), var4_ref_String, (-this.field_l.field_c + (-this.field_l.field_g + var7_ref_er__[1].field_t)) / 2 + var10_int + var7_ref_er__[0].field_t / 2);
            if (ig.field_c != null &&
              this.field_u) {
              if (te.field_B[var3] >= ig.field_c[var3]) {
                il.field_c.c(42, var10_int - 2);
              } else {
                if (sf.field_e[var3] >= ig.field_c[var3]) {
                  kq.field_Kb.c(42, var10_int - 2);
                } else {
                  if (!(ig.field_c[var3] > bp.field_E[var3])) {
                    hh.field_a.c(42, var10_int - 2);
                  }
                }
              }
            }
          }
          var3++;
          var2 = var2 + (this.field_l.field_k + this.field_B);
        }
    }

    final boolean c(int param0) {
        int var3 = -28 / ((-11 - param0) / 60);
        int var2 = this.field_w ? 1 : 0;
        this.field_w = false;
        return var2 != 0;
    }

    final void b(boolean param0) {
        boolean stackIn_3_1 = false;
        boolean stackIn_10_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        double var9;
        int var11;
        int var4Lifetime1;
        int var5Lifetime1;
        int var4Lifetime2;
        int var5Lifetime2;
        var11 = Vertigo2.field_L ? 1 : 0;
        stackIn_3_1 = (param0);
        this.field_H = stackIn_3_1;
        this.field_v = false;
        var2 = -1 + this.field_j / (this.field_B + this.field_l.field_k);
        var3 = (this.field_l.field_k + this.field_B) * (-var2 + this.field_k.length);
        if (!this.field_d) {
          this.field_p = 0;
          this.field_s = 0;
          this.field_O = 0;
          this.field_i = false;
          return;
        }
        if (!this.field_n) {
          this.field_D = 0;
        }
        this.field_s = this.field_s - 1;
        stackIn_10_1 = (1 == q.field_v);
        this.field_i = stackIn_10_1;
        this.field_p = this.field_p - 1;
        this.field_e = true;
        this.field_O = this.field_O - 1;
        if (this.field_e) {
          this.field_L = this.field_L + uo.field_h;
          if (0 <= this.field_t &&
            this.field_t < this.field_k.length) {
            if (cr.field_eb[98]) {
              if (this.field_O < 0) {
                this.field_t = this.field_t - 1;
                this.field_L = this.field_t;
                this.field_O = wj.field_b;
              }
            } else {
              if (!cr.field_eb[99]) {
                this.field_O = -1;
              } else {
                if (this.field_O < 0) {
                  this.field_t = this.field_t + 1;
                  {
                    while ((!(this.field_t < this.field_y.length) ||
                      !(this.field_y[this.field_t]))) {
                      this.field_t = this.field_t - 1;
                    }
                    {
                      this.field_L = this.field_t;
                      this.field_O = wj.field_b;
                    }
                  }
                }
              }
            }
            if (this.field_t < 0) {
              this.field_t = 0;
            }
            if (this.field_t >= this.field_k.length) {
              this.field_t = this.field_k.length - 1;
            }
            if (this.field_L < 3) {
              this.field_L = 3;
            }
            if (this.field_L >= -4 + this.field_k.length) {
              this.field_L = -5 + this.field_k.length;
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_e = false;
        if (!this.field_i) {
          if (q.field_v == 1) {
            this.field_e = false;
          }
        } else {
          this.field_e = true;
          if (this.field_c + this.field_l.field_k >= gb.field_d) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_g + (this.field_f - this.field_E) <= ed.field_n &&
            this.field_n &&
            ed.field_n < this.field_g + (this.field_f + this.field_E)) {
            if (gb.field_d <= this.field_l.field_k + (this.field_c + this.field_E)) {
              if (this.field_s < 0) {
                this.field_s = wj.field_b;
                this.field_L = this.field_L - 1;
              }
              this.field_v = true;
            } else {
              if (gb.field_d >= -this.field_E + (this.field_j + this.field_c)) {
                this.field_H = true;
                if (this.field_s < 0) {
                  this.field_L = this.field_L + 1;
                  this.field_s = wj.field_b;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if ((!(var3 >= this.field_D)) &&
                    ((this.field_n))) {
                    this.field_D = var3;
                  }
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.field_s = -1;
                var4 = gb.field_d - this.field_c;
                var5 = var4 - this.field_l.field_k;
                var6 = var5 + (-(this.field_A.field_t / 2) - this.field_M.field_t);
                if (var6 < 0) {
                  var6 = 0;
                }
                var7 = -this.field_M.field_t + (this.field_j + this.field_A.field_t / 2);
                if (var6 > var7) {
                  var6 = var7;
                }
                var8 = -(2 * this.field_M.field_t) - this.field_l.field_k + this.field_j - this.field_A.field_t;
                var9 = (double)var6 / (double)var8;
                this.field_L = (int)(var9 * (double)(-1 + this.field_k.length));
              }
            }
            if (decompiledFrameRemainder1) {
              decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            if (kf.field_c == 0) {
              if ((!(var3 >= this.field_D)) &&
                ((this.field_n))) {
                this.field_D = var3;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (ed.field_n < this.field_f + (this.field_g + this.field_E)) {
                var4Lifetime2 = this.field_D - this.field_l.field_k - this.field_c + gb.field_d;
                var5Lifetime2 = this.field_t;
                this.field_t = var4Lifetime2 / (this.field_l.field_k + this.field_B);
                if (this.field_t == var5Lifetime2 &&
                  this.field_p > 0) {
                  this.field_w = true;
                }
                this.field_p = wj.field_b;
              }
            }
          }
          if ((decompiledFrameRemainder0) && (var3 < this.field_D &&
            this.field_n)) {
            this.field_D = var3;
          }
        }
        if (this.field_t < 0) {
          this.field_t = 0;
        }
        if (this.field_k.length <= this.field_t) {
          this.field_t = -1 + this.field_k.length;
        }
        if (3 > this.field_L) {
          this.field_L = 3;
        }
        if (-4 + this.field_k.length <= this.field_L) {
          this.field_L = -5 + this.field_k.length;
        }
        while (true) {
          if (this.field_t < this.field_y.length &&
            this.field_y[this.field_t]) {
            if (this.field_n) {
              if (var2 / 2 <= this.field_L) {
                if (var2 / 2 <= this.field_k.length - this.field_L) {
                  var4Lifetime1 = (-(var2 / 2) + this.field_L) * var3 / (this.field_k.length - var2);
                } else {
                  var4Lifetime1 = var3;
                }
              } else {
                var4Lifetime1 = 0;
              }
              if (this.field_D != var4Lifetime1) {
                var5Lifetime1 = this.field_D - var4Lifetime1;
                if (var5Lifetime1 / 4 != 0) {
                  this.field_D = this.field_D - var5Lifetime1 / 4;
                } else {
                  if (0 == var5Lifetime1 / 2) {
                    this.field_D = this.field_D - var5Lifetime1;
                  } else {
                    this.field_D = this.field_D - var5Lifetime1 / 2;
                  }
                }
              }
            }
            return;
          }
          this.field_t = this.field_t - 1;
        }
    }

    bl(int param0, int param1, int param2, int param3, wn param4, er param5, er param6, er param7, er param8) {
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_I = -8388608;
        this.field_K = null;
        this.field_P = -8355712;
        this.field_w = false;
        this.field_t = -1;
        this.field_F = -16777215;
        this.field_m = 0;
        this.field_y = new boolean[]{};
        this.field_L = -1;
        this.field_O = 0;
        this.field_p = 0;
        this.field_x = -65535;
        this.field_J = -257908576;
        this.field_v = false;
        this.field_B = 16;
        this.field_H = false;
        this.field_n = true;
        this.field_k = new String[]{};
        this.field_s = 0;
        try {
          this.field_f = param2;
          this.field_l = param4;
          this.field_c = param1;
          this.field_j = param3;
          this.field_g = param0;
          if (param5 == null) {
            stackIn_4_1 = this.field_l.field_k;
          } else {
            stackIn_4_1 = param5.field_x;
          }
          this.field_E = stackIn_4_1;
          this.field_G = param6;
          this.field_A = param7;
          this.field_M = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_8_0 = var10;
          stackIn_8_1 = new StringBuilder().append("bl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_q = "Show chat";
        field_o = "Level <%0>";
    }
}
