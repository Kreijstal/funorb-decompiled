/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gj extends dfa {
    int field_L;
    int field_db;
    fs field_e;
    jo field_s;
    sfa field_Z;
    private int[] field_v;
    private boolean field_eb;
    int field_u;
    private ng field_W;
    int[] field_T;
    eaa field_fb;
    private int field_B;
    eaa field_j;
    private int field_t;
    static kv field_F;
    int field_U;
    private boolean field_d;
    private sna field_bb;
    private eaa field_X;
    int field_p;
    ad field_P;
    sfa[] field_Y;
    private boolean field_Q;
    private int field_f;
    private pfa field_A;
    boolean field_l;
    ad[][] field_o;
    private int field_H;
    boolean field_m;
    private int field_I;
    boolean field_w;
    int field_g;
    int field_k;
    private int field_R;
    private sna field_C;
    private kv field_x;
    private int field_q;
    ad[] field_G;
    boolean field_J;
    boolean field_r;
    int field_M;
    kj[][] field_D;
    private sna field_z;
    int field_n;
    op field_h;
    boolean field_ab;
    private int field_K;
    int field_V;
    boolean field_cb;
    private int field_N;
    private sna field_O;
    private eaa field_S;
    private int field_i;
    private up field_y;
    private int field_E;

    final void a(ad param0, byte param1) {
        if (param0 == null) {
          return;
        }
        try {
          if (param1 != -52) {
            ad var4 = (ad) null;
            this.a(-9, (ad) null, -49);
          }
          this.a(param1 + 8007);
          if (this.field_A == null) {
            this.field_A = new pfa(this, this.field_z, param0);
          }
          this.field_A.a(0, param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        kj var4;
        int var5;
        var5 = BachelorFridge.field_y;
        for (var2 = 0; this.field_h.field_z > var2; var2++) {
          for (var3 = 0; var3 < this.field_h.field_B; var3++) {
            var4 = this.field_D[var2][var3];
            if (var4 != null &&
              var4.b(74)) {
              this.field_D[var2][var3] = var4.field_b;
            }
          }
        }
        if (param0 != 32307) {
          this.field_K = -53;
        }
    }

    final void m(int param0) {
        qm.a(param0, 7758);
        this.field_l = false;
        lf.field_c = 1;
        this.field_J = false;
        this.field_ab = false;
        this.field_P = null;
        this.field_w = false;
        this.field_Z = null;
    }

    final int a(int param0, int param1, int param2) {
        if (param0 != -18254) {
          this.b(-102, 39);
        }
        return this.field_h.field_a[param2][param1].field_n;
    }

    private final void q(int param0) {
        int var6 = 0;
        int var9 = 0;
        at var3;
        vca var4;
        ad[][] var5;
        ad[] var7;
        ad[] var8;
        ad var10;
        int var11;
        int var12;
        tia var13;
        var12 = BachelorFridge.field_y;
        this.s(32307);
        var13 = (tia) (this.field_fb.b((byte) 90));
        while (var13 != null) {
          if (!var13.a(-59)) {
            var13.a(false);
          }
          var13 = (tia) (this.field_fb.c(0));
        }
        var3 = (at) (this.field_j.b((byte) 90));
        if (var3 != null &&
          var3.b(21807)) {
          var3.a(false);
        }
        var4 = (vca) (this.field_S.b((byte) 90));
        while (var4 != null) {
          if (var4.b(false)) {
            var4.a(false);
          }
          var4 = (vca) (this.field_S.c(0));
        }
        if (null == this.field_o) {
          return;
        }
        var5 = this.field_o;
        if (param0 != 17) {
          return;
        }
        for (var6 = 0; var5.length > var6; var6++) {
          var7 = var5[var6];
          if (var7 != null) {
            var8 = var7;
            for (var9 = 0; var9 < var8.length; var9++) {
              var10 = var8[var9];
              if (var10 != null) {
                var10.a(104);
                var11 = 1;
                if (39 == var10.field_s.field_y) {
                  var11 = 0;
                }
                if (17 == var10.field_s.field_y) {
                  var11 = 2;
                }
                if (28 == var10.field_s.field_y) {
                  var11 = 3;
                }
                while (true) {
                  var11--;
                  if (0 > var11) {
                    break;
                  }
                  var10.field_f.c(11);
                  if (!var10.field_f.field_u.field_e) {
                    continue;
                  }
                  var10.b(false);
                }
              }
            }
          }
        }
        return;
    }

    private final void a(boolean param0, ad param1) {
        aj var5 = null;
        try {
          this.m(10);
          if (param0) {
            op var4 = (op) null;
            this.a((rk[]) null, (op) null, -93, 119);
          }
          this.field_P = param1;
          if (this.field_P != null) {
            qm.a(33, 7758);
            this.field_q = param1.field_s.field_x;
            this.field_E = param1.field_s.field_J;
            this.field_s.a((byte) -57, param1.field_s.field_J, param1.field_s.field_x);
            var5 = this.field_s.a(param1.field_s.field_J, (byte) -91, param1.field_s.field_x);
            this.field_W.c(-80 + var5.field_a, -40 + var5.field_c, -40);
            this.field_J = true;
            this.field_f = 5;
            uca.a(20, (byte) -63);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, ad param1, int param2, int param3, ad param4) {
        int var8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var9 = 0;
        ema var10 = null;
        var9 = BachelorFridge.field_y;
        try {
          var6_int = param4.field_s.field_x;
          var7 = param4.field_s.field_J;
          if (param4.field_s.field_y == 43) {
            for (var8 = 0; param2 > var8; var8++) {
              if (2 != param3) {
                if (param3 != 4) {
                  if (1 != param3) {
                    if (3 == param3) {
                      this.field_h.b((byte) -72, 29, param4.field_s.field_x, param4.field_s.field_J + var8);
                    }
                  } else {
                    this.field_h.b((byte) -122, 29, param4.field_s.field_x, param4.field_s.field_J - var8);
                  }
                } else {
                  this.field_h.b((byte) 66, 29, param4.field_s.field_x + var8, param4.field_s.field_J);
                }
              } else {
                this.field_h.b((byte) -76, 29, param4.field_s.field_x - var8, param4.field_s.field_J);
              }
            }
          }
          if (2 == param3) {
            var6_int = var6_int - param2;
          } else {
            if (param3 == 4) {
              var6_int = var6_int + param2;
            } else {
              if (param3 == 1) {
                var7 = var7 - param2;
              } else {
                if (param3 == 3) {
                  var7 = var7 + param2;
                }
              }
            }
          }
          if (param0 != 132) {
            var10 = (ema) null;
            gj.a((byte) 117, (ema) null);
          }
          if (param4.field_s.field_y == 40) {
            param4.field_s.field_y = 0;
          }
          this.a(param4, var7, param1, var6_int, (byte) -97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("gj.PB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void a(int param0, kv param1) {
        try {
          if (param0 != 3) {
            this.field_K = 121;
          }
          this.field_S.a(new vca(param1, 20, 30, 50), true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ad b(aga param0, int param1) {
        ad var3 = null;
        RuntimeException var3_ref = null;
        ad stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var3 = this.field_o[param0.field_D][param0.field_u];
          if (param1 != -23990) {
            this.field_m = true;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("gj.LB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        int var5 = 0;
        Object stackIn_17_0 = null;
        ad stackIn_17_1 = null;
        fea stackIn_65_0;
        String stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_4;
        int var3;
        int var4;
        int var6;
        aga var7;
        vca var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = BachelorFridge.field_y;
        dg.d();
        dg.a(0, 0, 640, i.field_a.field_rb);
        if (param0 < 29) {
          var7 = (aga) null;
          this.a((aga) null, -122);
        }
        if (0 == this.field_h.field_A &&
          0 == this.field_K) {
          if (this.field_n >= 0) {
            this.field_y.a(65793);
          } else {
            ew.field_r.e(120, 100);
            jha.field_g.a(cba.field_b, 230, 160, 200, 200, 16777215, -1, 1, 0, 14);
          }
          if (null != this.field_A) {
            this.field_A.a(false);
          }
        } else {
          if (null != this.field_s) {
            this.field_s.c(-32095);
          }
          this.g((byte) -86);
          if (this.field_M != 0) {
            qn.field_g.e(-qn.field_g.field_q + 640, 0);
            if (this.field_n >= 0 &&
              !this.field_cb) {
              var3 = (int)(Math.sin((double)dj.field_c.field_L / 10.0 * 0.5) * 5.0);
              var4 = 1;
              for (var5 = 0; var5 < this.field_G.length; var5++) {
                stackIn_17_0 = null;
                stackIn_17_1 = this.field_G[var5];
                if (stackIn_17_0 != stackIn_17_1 &&
                  !this.field_G[var5].field_l) {
                  var4 = 0;
                }
              }
              if (var4 != 0) {
                this.field_x.e(-8 + (this.field_C.field_kb - (var3 >> 1)), -(var3 >> 1) + this.field_C.field_rb - 7, var3 + 16 + this.field_C.field_sb, this.field_C.field_p + (16 + var3), 256);
              }
              ica.field_t.e(574, 64);
              if (this.field_C.field_T) {
                fla.field_s.e(574, 64);
              }
              b.field_t.a(ms.field_q, 580, 41, 40, 30, 0, -1, 1, 0, 10);
            }
            if (null != this.field_G) {
              this.g(-1);
            }
            if (this.field_n < 0) {
              fb.field_r.e(-fb.field_r.field_q + b.field_t.a(pj.field_a) + 20, 5);
              b.field_t.c(pj.field_a, 5, -8 + b.field_t.field_u, 0, -1);
            }
            if (this.field_Y != null &&
              this.field_Y[0] != null) {
              this.e((byte) 93);
            }
          }
          if (this.field_M != 0) {
            this.b(-92);
          }
          this.g((byte) -63);
          dg.a(0, 0, 640, i.field_a.field_rb);
          if (this.field_eb) {
            this.field_O.a(true, 7802);
          }
          if (null != this.field_P &&
            this.field_J &&
            this.field_P.field_s.field_I > 0) {
            this.field_W.a(0, -98, -10);
          }
          var8 = (vca) (this.field_S.b((byte) 90));
          while (var8 != null) {
            var8.a(240, 320, false);
            var8 = (vca) (this.field_S.c(0));
          }
          if (this.field_e.field_a) {
            nna.field_w.e(0, -nna.field_w.field_p + i.field_a.field_rb);
            var4Lifetime2 = 16776960;
            if (wma.field_b > 0 &&
              this.field_L % 40 > 20) {
              var4Lifetime2 = 16711680;
            }
            ej.a(38, var4Lifetime2, pn.field_e, true, 12 + (-nna.field_w.field_p + i.field_a.field_rb + jha.field_g.field_u), -100);
          }
        }
        if (hea.field_r >= 2) {
          var3Lifetime1 = this.field_h.c((byte) -10);
          jha.field_g.a("Client: " + Integer.toHexString(var3Lifetime1), 320, 20, 8421631, -1);
          jha.field_g.a("Server: " + Integer.toHexString(this.field_g), 320, 40, 8421504, -1);
          var4Lifetime1 = var3Lifetime1 ^ this.field_g;
          stackIn_65_0 = jha.field_g;
          stackIn_65_1 = "Diff: " + Integer.toHexString(var4Lifetime1);
          stackIn_65_2 = 320;
          stackIn_65_3 = 60;
          stackIn_66_4 = (var4Lifetime1 == 0) ? 8421504 : 16711680;
          ((fea) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_66_4, -1);
        }
        dg.c();
        if (this.field_d) {
          this.f(8910);
        }
        if (null != this.field_A) {
          this.field_A.a(false);
        }
        if (af.field_a) {
          kla.b(true);
        }
    }

    final void c(boolean param0) {
        this.field_M = !this.field_h.field_N ? 1 : 2;
        uca.a(23, (byte) -54);
        if (!(this.field_h.field_e > 0)) {
          uca.a(29, (byte) 111);
        }
        this.d((byte) 52);
        if (param0) {
          ad var3 = (ad) null;
          this.b((ad) null, false);
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 30996) {
          return;
        }
        this.field_h.field_a[param1][param2].field_m = true;
        uea var4 = new uea(this, param1, param2, 16711680);
        ((kj) ((Object) var4)).a(0);
    }

    private final boolean a(ad param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.field_o != 3) {
            return true;
          }
          if (!this.field_h.a((byte) -124, param0.field_s.field_D, param0.field_s.field_x, param0.field_s.field_J)) {
            return true;
          }
          if (!param1) {
            this.n(-89);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gj.EB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        t var8;
        int var9;
        ad var10;
        int var7Lifetime1;
        var9 = BachelorFridge.field_y;
        var10 = this.field_G[this.field_Z.field_h.field_f];
        this.field_H = this.field_s.field_h;
        this.field_N = this.field_s.field_s;
        if (0 > this.field_N) {
          return;
        }
        if (this.field_h.field_z > this.field_N &&
          this.field_H >= 0 &&
          this.field_h.field_B > this.field_H) {
          var3 = 124 % ((-58 - param0) / 54);
          var4 = var10.field_s.field_x;
          var5 = var10.field_s.field_J;
          var6 = un.a(126, this.field_H - var5, this.field_N - var4);
          var7 = 0;
          if (this.field_N - var4 == 0) {
            var7Lifetime1 = Math.abs(-var5 + this.field_H);
          } else {
            if (0 != -var5 + this.field_H) {
              var7Lifetime1 = 255;
            } else {
              var7Lifetime1 = Math.abs(this.field_N - var4);
            }
          }
          var8 = (t) (al.a(-98, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
          if (var7Lifetime1 >= var8.field_w) {
            if (var10.field_s.c(87, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]) < var7Lifetime1) {
              this.m(10);
            } else {
              if ((var8.field_j == 80 ||
                var8.field_j == 81) &&
                this.field_h.field_a[this.field_N][this.field_H].field_l != null) {
                this.m(10);
                lf.field_c = 0;
                this.field_f = 5;
                return;
              }
              if (var8.field_p == 2) {
                var7Lifetime1++;
              }
              if (var8.field_p == 3) {
                var7Lifetime1++;
              }
              if (0 != var6) {
                this.field_P.field_s.field_s = var6;
              }
              ((hia) (this.field_Z)).field_j = var6;
              ((hia) (this.field_Z)).field_k = var7Lifetime1 - 1;
              this.k(-1);
              this.field_ab = false;
              uca.a(25, (byte) 114);
            }
          } else {
            this.m(10);
          }
          lf.field_c = 0;
          this.field_f = 5;
          return;
        }
    }

    private final boolean i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0 <= 76) {
          ad var5 = (ad) null;
          this.a(28, (ad) null);
        }
        for (var2 = 0; this.field_h.field_z > var2; var2++) {
          for (var3 = 0; var3 < this.field_h.field_B; var3++) {
            if (null != this.field_D[var2][var3]) {
              return true;
            }
          }
        }
        return false;
    }

    private final void e(byte param0) {
        int var2 = 0;
        sfa var3;
        oha var4;
        int var9;
        int var5;
        int var6;
        int var7;
        int var8;
        var9 = BachelorFridge.field_y;
        if (param0 <= 90) {
          return;
        }
        if (this.field_K > 0 &&
          this.field_Y[0] != null) {
          for (var2 = 0; var2 < this.field_Y.length; var2++) {
            var3 = this.field_Y[var2];
            if (var3 == null) {
              break;
            }
            var4 = al.a(-110, var3.field_g);
            hh.field_b[var4.field_h].e(var3.field_h.field_f * 39 + 16, 28);
            if (hh.field_b[var4.field_h].a(39 * var3.field_h.field_f + 16, 28, mk.field_p, gd.field_m)) {
              var5 = 640;
              var6 = 480;
              var7 = 4 + mk.field_p;
              var8 = gd.field_m + 4;
              sd.a(this.field_G[var3.field_h.field_f].field_s.a(var4, -5313), var7, var4, (byte) 74, var8, var5, var6);
            }
          }
        }
    }

    private final void g(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        ad var8;
        int var2Lifetime1;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        if (this.field_h.field_J > this.field_h.field_A) {
          var2Lifetime1 = ad.field_h.a(cd.field_o[this.field_h.field_o - 1]);
        } else {
          var2Lifetime1 = Math.max(ad.field_h.a(cd.field_o[this.field_h.field_o - 1]), ad.field_h.a(tw.field_b));
        }
        dg.a(635 + (-var2Lifetime1 - 10), -eja.field_w.field_p + i.field_a.field_rb - 26, var2Lifetime1 + 20, 32, 7, 65793, 128);
        if (this.field_h.field_J <= this.field_h.field_A) {
          ad.field_h.b(tw.field_b, 630, i.field_a.field_rb - eja.field_w.field_p - 12, 0, -1);
        } else {
          ad.field_h.b(lga.a(true, new String[]{Integer.toString((this.field_h.field_A - 1) / 2 + 1), Integer.toString(this.field_h.field_J / 2)}, eb.field_q), 630, -12 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
        }
        if (param0 > -61) {
          var8 = (ad) null;
          this.b((ad) null, true);
        }
        ad.field_h.b(cd.field_o[-1 + this.field_h.field_o], 630, -eja.field_w.field_p + i.field_a.field_rb, 0, -1);
        var3 = -(this.field_h.field_d * 132) + 592;
        eja.field_w.e(var3, 4 - eja.field_w.field_p + i.field_a.field_rb);
        for (var4 = 0; var4 < this.field_h.field_d; var4++) {
          var5 = var4 * 132 + 40;
          b.field_t.a(this.field_h.field_y[var4], var3 + (var5 + 67), 10 - eja.field_w.field_p + (i.field_a.field_rb + 12), var4 + 2, -1);
          dg.a(7 + (var3 + var5), 14 - eja.field_w.field_p + i.field_a.field_rb + 10, 130, 16, 7, 65793, 128);
          if (this.field_h.field_o == 1) {
            for (var6 = 0; 7 > var6; var6++) {
              if (this.field_h.field_S[var4].field_b[var6] != null) {
                if (this.field_h.field_S[var4].field_b[var6].i(-124)) {
                  kn.field_g.c(18 * var6 + (var3 + var5 + 12), 27 - eja.field_w.field_p + i.field_a.field_rb, kn.field_g.field_q >> 1, kn.field_g.field_p >> 1, 192);
                } else {
                  this.field_o[var4][var6].field_f.a(1024, 10 + (-eja.field_w.field_p + i.field_a.field_rb - 12), 256, 8, 1024, 18 * var6 + var3 + var5 - 20);
                }
              }
            }
          } else if (this.field_h.field_o == 2) {
            for (var6 = 0; var6 < this.field_T[var4]; var6++) {
              sj.field_k[0].a(10 + var5 + var3 + var6 * 14, -eja.field_w.field_p + i.field_a.field_rb + 22);
            }
          } else {
            if (3 == this.field_h.field_o) {
              for (var6 = 0; var6 < this.field_h.field_C[var4]; var6++) {
                ela.field_j[0].a(var6 * 14 + var3 + (var5 + 10), 12 + i.field_a.field_rb + (-eja.field_w.field_p + 10));
              }
            }
          }
          if (this.field_h.a((byte) -60, var4)) {
            b.field_t.a(lga.a(true, new String[]{this.field_h.field_y[var4]}, ts.field_p), 72 + var3 + (var5 - 5), 50 + i.field_a.field_rb - eja.field_w.field_p, 0, -1);
          } else {
            if (this.field_h.b((byte) 106, var4)) {
              b.field_t.a(cka.field_w, 72 + (-5 + var5 + var3), 26 + (-eja.field_w.field_p + (i.field_a.field_rb + 24)), 0, -1);
            } else {
              if (this.field_h.field_S[var4].field_c) {
                b.field_t.a(cf.field_a, 72 + (-5 + var3 + var5), 50 + (i.field_a.field_rb - eja.field_w.field_p), 0, -1);
              }
            }
          }
        }
    }

    private final void a(int param0, rk[] param1) {
        try {
          this.field_z = mka.a(13558251, param0, 13558251, (byte) -128, jha.field_g, 13558251, 16777215, 13558251);
          this.field_z.field_db = op.field_I;
          this.field_z.field_eb = wd.field_w;
          this.field_z.field_A = bla.field_p;
          this.field_z.field_N = 1;
          this.field_z.field_B = 12;
          this.field_W = new ng(this, this.field_z);
          if (param1 != null) {
            this.field_y = new up(this, this.field_z, param1);
          }
          this.field_C = new sna("endturn", this.field_z, 574, 64, 50, 24, ms.field_q);
          this.field_O = new sna("cancelorder", (sna) null, 15, 125, 32, 32, "");
          this.field_O.field_v = hh.field_b[2];
          this.field_bb = new sna("abortorder", (sna) null, 15, 125, 16, 16, "");
          this.field_bb.field_v = fe.field_j;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, byte param1, gm param2, int param3) {
        if (param1 != -88) {
          return;
        }
        try {
          if (param0) {
            param2.field_i = param3 > 0 ? 3 : 1;
          } else {
            param2.field_i = param3 > 0 ? 4 : 2;
          }
          param2.field_l = Math.abs(param3);
          this.field_P.field_s.field_s = param2.field_i;
          this.k(-1);
          this.field_l = false;
          uca.a(21, (byte) 122);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.TA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        eaa stackIn_25_0 = null;
        at stackIn_25_1 = null;
        boolean stackIn_26_2 = false;
        boolean stackIn_51_0 = false;
        boolean stackIn_60_1 = false;
        int var3;
        at var4_ref_at;
        int var4;
        int var5;
        cj var6;
        var5 = BachelorFridge.field_y;
        if (3 == kaa.field_m) {
          return;
        }
        if (kaa.field_m == -5) {
          return;
        }
        if (af.field_a) {
          ic.a(69);
        }
        if (this.field_e.field_a) {
          this.field_p = this.field_p - 1;
          this.field_u = this.field_u - 1;
        }
        if (null != this.field_s) {
          this.field_s.b((byte) 81);
        }
        if (param1) {
          this.h((byte) 126);
        }
        this.q(17);
        if (this.field_h.field_A == 0) {
          if (this.field_A != null &&
            !this.field_A.a(-214844415)) {
            this.field_A = null;
          }
          if (this.field_n >= 0) {
            this.field_y.a((byte) 108);
          }
        } else {
          if (this.field_h.field_r &&
            null != this.field_h.field_p &&
            !this.field_Q) {
            this.field_X.a(this.field_h.field_p, true);
            this.field_Q = true;
          }
          if (this.field_j.e(12917) &&
            this.field_fb.e(12917)) {
            if (this.field_X.e(12917)) {
              if (!this.i(108)) {
                if (this.field_h.field_r) {
                  this.e(-122);
                }
                this.field_e.d((byte) -16);
              }
            } else {
              var6 = (cj) (this.field_X.a(false));
              var4_ref_at = var6.a(5, this);
              stackIn_25_0 = this.field_j;
              stackIn_25_1 = var4_ref_at;
              stackIn_26_2 = (param1) ? false : true;
              ((eaa) (Object) stackIn_25_0).a(stackIn_25_1, stackIn_26_2);
            }
          }
          this.field_L = this.field_L + 1;
          if (!param0) {
            return;
          }
          var3 = 1;
          if (this.field_e.field_a) {
            if ((!vs.field_d ||
              !lna.field_q) &&
              !lb.g((byte) -59)) {
              if (!(mk.field_p <= 0) &&
                !(mk.field_p >= nna.field_w.field_q) &&
                !(i.field_a.field_rb - nna.field_w.field_p >= gd.field_m) &&
                !(i.field_a.field_rb <= gd.field_m) &&
                lf.field_c == 1) {
                stackIn_51_0 = !(wj.field_g);
                wj.field_g = stackIn_51_0;
                lf.field_c = 0;
              }
            } else {
              var3 = 0;
            }
            if (wj.field_g) {
              var3 = 0;
            }
          }
          if (this.field_M == 1 ||
            this.field_M == 2) {
            stackIn_60_1 = !(param1);
            this.d(stackIn_60_1);
          }
          if (0 == this.field_M) {
            this.field_P = null;
          }
          if (this.field_s != null &&
            this.field_fb.e(12917) &&
            this.field_j.e(12917)) {
            var4 = 0;
            if (var3 != 0) {
              if (wga.field_q[98] ||
                wga.field_q[sm.field_r]) {
                this.field_s.a(0, 8, 2962);
                var4 = 1;
              }
              if (wga.field_q[99] ||
                wga.field_q[rq.field_g]) {
                var4 = 1;
                this.field_s.a(0, -8, 2962);
              }
              if (wga.field_q[96] ||
                wga.field_q[oq.field_a]) {
                var4 = 1;
                this.field_s.a(8, 0, 2962);
              }
              if (wga.field_q[97] ||
                wga.field_q[vk.field_s]) {
                this.field_s.a(-8, 0, 2962);
                var4 = 1;
              }
            }
            if (nd.field_h == 4) {
              this.field_s.a(mk.field_p - this.field_R, gd.field_m - this.field_t, 2962);
              this.field_t = gd.field_m;
              var4 = 1;
              this.field_R = mk.field_p;
            }
            if (var4 != 0) {
              uca.a(40, (byte) -126);
            }
          }
          if (this.field_f > 0) {
            this.field_f = this.field_f - 1;
          }
        }
    }

    final void a(int param0, ad param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_s.a(32, (byte) 109) ? 1 : 0;
          param1.field_s.k(-2049, param2);
          param1.a(24831, 45, kna.field_g[param2]);
          if (param0 != -16007) {
            this.field_g = -44;
          }
          if (var4_int != 0) {
            if (param1.field_s.a(32, (byte) -110)) {
              return;
            }
            this.b(param1, (ad) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("gj.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void k(int param0) {
        int var3 = 0;
        int[] var2;
        sfa var4;
        int var5;
        int[] var6;
        int[] var7;
        var5 = BachelorFridge.field_y;
        qm.a(10, 7758);
        int fieldTemp$1 = this.field_U;
        this.field_U = this.field_U + 1;
        this.field_Y[fieldTemp$1] = this.field_Z;
        this.field_G[this.field_Z.field_h.field_f].field_l = true;
        this.field_w = false;
        this.field_P = null;
        this.field_ab = false;
        this.field_l = false;
        this.field_Z = null;
        this.field_J = false;
        var7 = new int[7];
        var6 = var7;
        var2 = var6;
        for (var3 = 0; var3 < 7; var3++) {
          var4 = this.field_Y[var3];
          if (var4 != null) {
            var2[var3] = -this.field_G[var4.field_h.field_f].field_s.field_v;
          } else {
            var2[var3] = 2147483646;
          }
        }
        if (param0 != -1) {
          this.field_x = (kv) null;
        }
        dk.$cfr$intArgs$a$e46325ef0b7e(this.field_Y, 94, var7);
        this.field_f = 5;
    }

    private final boolean r(int param0) {
        boolean stackIn_32_0 = false;
        rk[] var3;
        hd var4;
        if (param0 != 2) {
          var3 = (rk[]) null;
          this.a(28, (rk[]) null);
        }
        var4 = (hd) (ur.field_e[this.field_Z.field_g]);
        if (var4.c(0) == 0) {
          if (var4.field_j != 130) {
            return true;
          }
          stackIn_32_0 = (this.field_h.field_a[this.field_N][this.field_H].field_l == null) && (this.field_h.field_a[this.field_N][this.field_H].e(-123));
          return stackIn_32_0;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var4.c(0) != 1) {
          if (var4.c(0) == 3) {
            if (93 == var4.field_j &&
              this.field_h.c(this.field_N, this.field_H, -123) != null &&
              this.field_h.c(this.field_N, this.field_H, 127).field_A) {
              return true;
            }
            if (this.field_h.field_a[this.field_N][this.field_H].field_l != null) {
              return true;
            }
            return false;
          }
          if (var4.c(0) == 2) {
            if (this.field_N == this.field_P.field_s.field_x + 1 &&
              this.field_P.field_s.field_J == this.field_H) {
              return true;
            }
            if (this.field_N == -1 + this.field_P.field_s.field_x &&
              this.field_P.field_s.field_J == this.field_H) {
              return true;
            }
            decompiledFrameRemainder0 = (this.field_P.field_s.field_x != this.field_N ||
              1 + this.field_P.field_s.field_J != this.field_H);
            if ((decompiledFrameRemainder0) && (this.field_P.field_s.field_x == this.field_N &&
              this.field_H == this.field_P.field_s.field_J - 1)) {
              return true;
            }
          }
          if (decompiledFrameRemainder0) {
            return false;
          }
        }
        return true;
    }

    private final void g(int param0) {
        int var5 = 0;
        int var2;
        int var3;
        ad[] var4;
        ad var6;
        aga var7;
        int var8;
        int var9;
        int var10;
        var10 = BachelorFridge.field_y;
        var2 = 14;
        var3 = this.field_h.field_S[this.field_n].a((byte) -43);
        fb.field_r.e(var3 * 39 - fb.field_r.field_q, 5);
        if (param0 != -1) {
          this.field_n = 83;
        }
        var4 = this.field_G;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (var6 != null) {
            var7 = var6.field_s;
            uga.field_C.e(-17 + var2, 6);
            if (null != this.field_P &&
              this.field_P.field_s.field_u == var7.field_u &&
              this.field_P.field_s.field_D == var7.field_D) {
              this.field_x.d(var2 - 17, 1, 128);
            }
            if (!var6.field_s.i(100)) {
              var6.field_f.a(2048, -43, 255, 8, 2048, var2 - 66);
            } else {
              kn.field_g.a(var2, 15, 192);
            }
            var8 = -7 + var2;
            var9 = 11;
            if (!var6.field_s.i(param0 ^ -111)) {
              b.field_t.c("" + var7.field_v, var8 - 4, 6 + var9, 2 + this.field_n, -1);
            }
            var2 += 40;
          }
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var5_int = 0;
        sfa var3;
        int var4;
        ad var5;
        sfa[] var7;
        int var8;
        int var9;
        gm var10;
        aga var11;
        sfa var12;
        gm var13;
        aga var14;
        sfa[] var15;
        var9 = BachelorFridge.field_y;
        fieldTemp$0 = this.field_U - 1;
        this.field_U = this.field_U - 1;
        var3 = this.field_Y[fieldTemp$0];
        var4 = this.field_U;
        if (param0 != -1) {
          for (var5_int = 0; this.field_Y.length > var5_int; var5_int++) {
            var12 = this.field_Y[var5_int];
            if (var12 != null &&
              param0 == var12.field_h.field_f) {
              var3 = var12;
              var4 = var5_int;
            }
          }
        }
        var5 = this.field_G[var3.field_h.field_f];
        var5.field_l = false;
        var11 = var5.field_s;
        var14 = var11;
        if (var3 instanceof gm) {
          var10 = (gm) (var3);
          var13 = var10;
          if (var13.field_i == 2) {
            this.field_h.field_a[-var13.field_l + var14.field_x][var14.field_J].field_g = false;
          } else {
            if (var13.field_i != 4) {
              if (var13.field_i == 3) {
                this.field_h.field_a[var14.field_x][var14.field_J + var13.field_l].field_g = false;
              } else {
                if (1 == var13.field_i) {
                  this.field_h.field_a[var14.field_x][-var13.field_l + var14.field_J].field_g = false;
                }
              }
            } else {
              this.field_h.field_a[var10.field_l + var11.field_x][var11.field_J].field_g = false;
            }
          }
        }
        var8 = 25 / ((param1 - 70) / 54);
        var4++;
        var15 = new sfa[this.field_Y.length];
        var7 = var15;
        if (var4 > 0) {
          bl.a(this.field_Y, 0, var15, 0, -1 + var4);
          bl.a(this.field_Y, var4, var7, var4 - 1, -var4 + this.field_Y.length - 1);
        }
        this.field_Y = var7;
        if (this.field_P == var5) {
          this.field_W.a(-95);
        }
        this.field_ab = false;
        this.field_w = false;
        this.field_l = false;
    }

    private final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field_s != null && this.field_s.field_q >= 0 && this.field_s.field_q < this.field_h.field_z && this.field_s.field_r >= 0 &&
          !(this.field_h.field_B <= this.field_s.field_r)) {
          var2 = mk.field_p;
          var3 = gd.field_m;
          var4 = this.a(-18254, this.field_s.field_r, this.field_s.field_q);
          var5 = ad.field_h.c(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_d, 100) + 20;
          var6 = 20 + ad.field_h.c(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_a, 100);
          var5 = Math.max(var5, var6);
          if (640 < var2 + var5) {
            var2 = var2 + (640 - var2 - var5);
          }
          var7 = 20 + ad.field_h.a(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_d, 100, 12) + ad.field_h.a(od.field_w[this.a(-18254, this.field_s.field_r, this.field_s.field_q)].field_a, 100, 12);
          if (i.field_a.field_rb < var7 + var3) {
            var3 = var3 + (i.field_a.field_rb - var3 - var7);
          }
          dg.a(var2, var3, var5, var7, 5, 65793, 192);
          ad.field_h.a(od.field_w[var4].field_a, var2 + (var5 >> 1), var3 + 15, 0, -1);
          ad.field_h.a(od.field_w[var4].field_d, 10 + var2, var3 + 20, -20 + var5, 80, 0, -1, 1, 0, 12);
        }
        if (param0 != 8910) {
          this.field_q = 34;
        }
    }

    final ad a(int param0, ad param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        ad var4 = null;
        aga var5 = null;
        aga var6 = null;
        aga var7 = null;
        Object stackIn_4_0 = null;
        ad stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_h.a((byte) -120, param1.field_s);
          var7 = var6;
          if (param0 != 21915) {
            var5 = (aga) null;
            discarded$1 = this.a((aga) null, (byte) 21);
          }
          if (var7 == null) {
            stackIn_4_0 = null;
            return (ad) (stackIn_4_0);
          }
          var4 = new ad(var7);
          param1.c((byte) -73);
          var4.c((byte) -102);
          if (var7.field_D == this.field_n) {
            this.field_G[var6.field_u] = var4;
            if (this.field_K < var7.field_u + 1) {
              this.field_K = var7.field_u + 1;
            }
          }
          this.field_o[var6.field_D][var6.field_u] = var4;
          stackIn_9_0 = var4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean a(aga param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 101 % ((param1 + 59) / 36);
          stackIn_3_0 = (this.field_n == param0.field_D);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gj.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final sfa b(ad param0, boolean param1) {
        int var4 = 0;
        sfa[] var3 = null;
        sfa var5 = null;
        int var6 = 0;
        sfa stackIn_10_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BachelorFridge.field_y;
        try {
          if (!param1) {
            this.field_bb = (sna) null;
          }
          var3 = this.field_Y;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null &&
              param0.field_s.field_u == var5.field_h.field_f) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("gj.JA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ad param0, ad param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        if (!param0.field_s.a(this.field_h.field_a[param1.field_s.field_x][param1.field_s.field_J].field_n, param2)) {
          return;
        }
        if (!param1.field_s.a(this.field_h.field_a[param0.field_s.field_x][param0.field_s.field_J].field_n, false)) {
          return;
        }
        try {
          var4_int = param0.field_s.field_x;
          var5 = param0.field_s.field_J;
          param0.field_s.field_x = param1.field_s.field_x;
          param0.field_s.field_J = param1.field_s.field_J;
          param1.field_s.field_x = var4_int;
          param1.field_s.field_J = var5;
          this.b(param0, param1, true);
          this.b(param1, param0, !param2 ? true : false);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.PA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 62 / ((param0 + 16) / 44);
        eaa var3 = this.field_h.field_U;
        var3.a(this.field_X, 12632256);
    }

    final void b(ad param0, ad param1, boolean param2) {
        int var8 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        wia var4 = null;
        RuntimeException var4_ref = null;
        jha var5_ref_jha = null;
        nj var5_ref_nj = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var7_int = 0;
        ek var8_ref_ek = null;
        jha var10 = null;
        int var11 = 0;
        wia var13 = null;
        eda var14 = null;
        wia var15 = null;
        int[][] var22 = null;
        int[] var23 = null;
        Object var7Lifetime1;
        var11 = BachelorFridge.field_y;
        try {
          var13 = param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J];
          var15 = var13;
          var4 = var15;
          var4.field_l = param0.field_s;
          if (param0.field_s.a(32, (byte) 61)) {
            return;
          }
          if (!param2) {
            this.field_x = (kv) null;
          }
          if (21 == var15.field_n) {
            var14 = new eda(this, param0.field_s.field_x, param0.field_s.field_J, param0.field_f, this.field_s.field_k.field_b[93]);
            var14 = var14;
            ((kj) ((Object) var14)).a(0);
          }
          if (od.field_w[var13.field_n].field_b &&
            var15.field_m &&
            this.a(param0, param2) &&
            33 != param0.field_s.field_y) {
            if (var15.a(-36) != 16 &&
              var15.a(-36) != 18 &&
              17 != var15.a(-36) &&
              19 != var15.a(-36)) {
              if (var15.a(-36) != 4 &&
                var15.a(-36) != 6 &&
                5 != var15.a(-36) &&
                var15.a(-36) != 7) {
                var5_ref_jha = new jha(this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
                ((kj) ((Object) var5_ref_jha)).a(0);
              } else {
                aba.a((byte) -52, 15);
              }
            } else {
              aba.a((byte) -53, 16);
              var5_ref_nj = new nj(this, param0.field_s.field_x, param0.field_s.field_J, od.field_w[var13.field_n].field_f);
              ((kj) ((Object) var5_ref_nj)).a(0);
            }
            param0.a(24831, 11, kna.field_g[var15.a(-36)]);
          }
          stackIn_30_0 = (var15.field_n != 38) ? 0 : 1;
          var5 = stackIn_30_0;
          stackIn_33_0 = (var15.field_j != 0) ? 0 : 1;
          var6 = stackIn_33_0;
          param0.field_s.a(var15, -122);
          if (var5 != 0) {
            if (var6 != 0) {
              var7 = new bn(this, param0.field_s.field_x, param0.field_s.field_J);
              var8_ref_ek = new ek(this, param0, -30);
              this.field_j.a(var8_ref_ek, true);
            } else {
              var7 = new oia(this, param0.field_s.field_x, param0.field_s.field_J);
              var8_ref_ek = new ek(this, param0, 75);
              this.field_j.a(var8_ref_ek, param2);
            }
            ((kj) (var7)).a(0);
          }
          var22 = param0.field_s.field_w.field_i;
          for (var8 = 0; var8 < var22.length; var8++) {
            var23 = var22[var8];
            if (param0.field_s.field_x == var23[0] &&
              var23[1] == param0.field_s.field_J) {
              var10 = new jha(this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
              ((kj) ((Object) var10)).a(0);
              if (param0.field_s.field_D != this.field_n) {
                aba.a((byte) -117, 18);
              } else {
                aba.a((byte) 43, 17);
              }
            }
          }
          if (3 == this.field_h.field_o) {
            if (param0.field_s.g((byte) 85)) {
              var7_int = this.field_h.b((byte) 99, param0.field_s);
              this.field_h.field_c[var7_int] = new int[]{param0.field_s.field_x, param0.field_s.field_J};
            }
            if (this.a((byte) -87, param0)) {
              var7Lifetime1 = new bu(this, param0.field_s.field_x, param0.field_s.field_J, param0.field_s.field_D);
              ((kj) (var7Lifetime1)).a(0);
              this.field_h.a(this.field_h.b((byte) 121, param0.field_s), (byte) 97);
              this.field_h.field_C[param0.field_s.field_D] = this.field_h.field_C[param0.field_s.field_D] + 1;
              param0.field_s.field_y = 0;
              param0.a(this.c(param0.field_s.field_D, 2271), 46, gka.field_r);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_57_0 = var4_ref;
          stackIn_57_1 = new StringBuilder().append("gj.F(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param1 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int var4 = 0;
        int var3;
        sfa var5;
        ad var6;
        aga var7;
        gm var8;
        int var9;
        sfa[] var10;
        var9 = BachelorFridge.field_y;
        var10 = this.field_Y;
        var3 = -17 % ((-79 - param0) / 47);
        for (var4 = 0; var4 < var10.length; var4++) {
          var5 = var10[var4];
          if (var5 != null) {
            var6 = this.field_G[var5.field_h.field_f];
            var7 = var6.field_s;
            var6.field_l = false;
            if (var5 instanceof gm) {
              var8 = (gm) (var5);
              if (var8.field_i != 2) {
                if (4 == var8.field_i) {
                  this.field_h.field_a[var7.field_x + var8.field_l][var7.field_J].field_g = false;
                } else {
                  if (3 != var8.field_i) {
                    if (var8.field_i == 1) {
                      this.field_h.field_a[var7.field_x][var7.field_J - var8.field_l].field_g = false;
                    }
                  } else {
                    this.field_h.field_a[var7.field_x][var8.field_l + var7.field_J].field_g = false;
                  }
                }
              } else {
                this.field_h.field_a[-var8.field_l + var7.field_x][var7.field_J].field_g = false;
              }
            }
          }
        }
    }

    private final void a(ad param0, int param1, ad param2, int param3, byte param4) {
        try {
          param0.field_s.field_w.field_a[param0.field_s.field_x][param0.field_s.field_J].field_l = null;
          if (param4 > -35) {
            ad var7 = (ad) null;
            this.a(-101, (ad) null);
          }
          param0.field_s.field_J = param1;
          param0.field_s.field_x = param3;
          this.b(param0, param2, true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void f(byte param0) {
        if (param0 != 50) {
          this.field_L = 11;
        }
    }

    private final void a(int param0, String param1, int param2) {
        boolean discarded$0 = false;
        try {
          this.field_S.a(new vca(taa.field_u, param1, param0, 8192, 20, 30, 50, 80), true);
          if (param2 != -22468) {
            ad var5 = (ad) null;
            discarded$0 = this.a((byte) -101, (ad) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.LA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        dg.g(0, 0, 640, 480);
        if (param0 >= -54) {
          return;
        }
        kv var2 = new kv(640, 480);
        fc.a(480, 640, var2, 0, (byte) 124, 0);
        eq.a(var2, this, (byte) -111);
        sia.field_h = false;
        lg.a(true, 3, false);
    }

    final void b(int param0, int param1) {
        t var5 = null;
        if (null != this.field_P) {
          if (!this.a(this.field_P.field_s, (byte) -107) ||
            this.field_P.field_s.a(9, (byte) -110)) {
            return;
          }
          this.field_l = false;
          this.field_w = false;
          if (param1 != -1) {
            ad var4 = (ad) null;
            this.a((ad) null, (byte) -47);
          }
          qm.a(10, param1 ^ -7759);
          this.field_db = param0;
          var5 = (t) (al.a(116, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
          this.field_P.a(16776960, 41, var5.field_f);
          this.field_Z = (sfa) ((Object) new hia(al.a(94, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]).field_j, this.field_P.field_s));
          this.field_ab = true;
          return;
        }
    }

    private final boolean a(byte param0, ad param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_h.field_o != 3) {
            return false;
          }
          var3_int = -37 % ((param0 - 30) / 32);
          if (this.field_h.b(param1.field_s, (byte) 114) &&
            param1.field_s.g((byte) 85)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gj.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(byte param0, eaa param1, Random param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        cia var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = BachelorFridge.field_y;
        try {
          var5 = -16 / ((param0 - 55) / 40);
          var7 = (cia) (param1.b((byte) 90));
          while (var7 != null) {
            var7.b(true);
            var7 = (cia) (param1.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gj.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0) {
        Object var2;
        int var3;
        int var4;
        int var5;
        var5 = BachelorFridge.field_y;
        if (param0 <= 2) {
          return;
        }
        if (this.field_h.field_r) {
          return;
        }
        this.field_s.a(-22048);
        if (this.field_h.field_J - 1 != this.field_h.field_A) {
          if (this.field_M != 1) {
            if (this.field_M == 2) {
              this.a(3, fv.field_y);
            }
          } else {
            this.a(3, ph.field_C);
          }
        } else {
          this.a(3, wga.field_r);
        }
        if (this.field_G != null) {
          var2 = null;
          var3 = 0;
          while (true) {
            if (var3 < 7) {
              if (null != this.field_G[var3] &&
                !this.field_G[var3].field_s.i(-102)) {
                var2 = this.field_G[var3];
              } else {
                var3++;
                continue;
              }
            }
            if (0 >= this.field_h.field_S[this.field_n].b((byte) 97)) {
              break;
            }
            var3 = -(128 * (((ad) (var2)).field_s.field_x - ((ad) (var2)).field_s.field_J) >> 1) + 256;
            var4 = 208 - ((((ad) (var2)).field_s.field_J + ((ad) (var2)).field_s.field_x) * 64 >> 1);
            this.field_j.a(new fu(this, this.field_s.field_b, this.field_s.field_B, var3, var4), true);
            break;
          }
        }
        this.field_h.j(-1);
        this.field_h.field_j = new sfa[this.field_h.field_d][7];
        this.j(-15503);
    }

    final static void a(byte param0, ema param1) {
        RuntimeException runtimeException = null;
        ema var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          param1.a(false);
          var2 = (ema) (aa.field_l.b((byte) 90));
          while (var2 != null) {
            if (var2.a(0, param1)) {
              var2 = (ema) (aa.field_l.c(0));
              continue;
            }
            break;
          }
          if (var2 != null) {
            stackIn_8_0 = -106;
            nr.$cfr$intArgs$a$94cfdbf41ae0(stackIn_8_0, var2, param1);
          } else {
            aa.field_l.a(param1, true);
          }
          var3 = 113 % ((param0 + 10) / 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("gj.OB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ad param2, int param3) {
        try {
          if (param0 >= -118) {
            this.b((byte) -56);
          }
          this.a(132, (ad) null, param1, param3, param2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1) {
        hd var6 = null;
        hd var3 = null;
        int var4 = 0;
        int var5 = 0;
        hd var7 = null;
        if (null != this.field_P) {
          if (!this.a(this.field_P.field_s, (byte) -124)) {
            return;
          }
          this.field_l = false;
          this.field_ab = false;
          qm.a(10, 7758);
          this.field_db = param1;
          var6 = (hd) (al.a(-103, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
          var3 = var6;
          if (param0 != 16776960) {
            return;
          }
          var4 = 0;
          if (119 == var6.field_j) {
            var5 = this.field_h.field_O;
            var4 = 1;
            if (var5 >= 31) {
              var5++;
            }
            var7 = (hd) (al.a(94, var5 + 88));
            var3 = var7;
            this.field_P.a(16776960, param0 ^ 16777086, var7.field_f);
          }
          this.field_Z = (sfa) ((Object) new td(var3.field_j, this.field_P.field_s, var4 != 0));
          if (var3.e(-2)) {
            this.field_w = true;
          } else {
            this.k(-1);
          }
          return;
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        aga var4;
        int var5;
        var5 = BachelorFridge.field_y;
        this.field_y = null;
        this.field_K = 0;
        if (param0 > -56) {
          return;
        }
        for (var2 = 0; var2 < this.field_h.field_d; var2++) {
          for (var3 = 0; var3 < 7; var3++) {
            var4 = this.field_h.field_S[var2].field_b[var3];
            if (var4 != null) {
              this.field_o[var2][var3] = new ad(var4);
              if (var2 == this.field_n) {
                this.field_K = this.field_K + 1;
              }
              if (0 >= var4.field_I) {
                this.field_o[var2][var3].b(-1, 5);
                this.field_o[var2][var3].field_f.field_u.a((byte) -84);
              }
            }
          }
        }
        this.field_h.j(-1);
        this.field_s = new jo(this);
        this.j(-15503);
        if (af.field_a) {
          this.field_h.field_a[3][6].field_h = 20;
          this.field_h.field_a[3][6].field_n = 39;
          this.field_h.field_a[4][5].field_n = 39;
          this.field_h.field_a[4][5].field_h = 20;
          this.field_h.field_a[0][2].field_n = 39;
          this.field_h.field_a[0][2].field_h = 20;
          this.field_h.field_e = 3;
        }
        aq.a(1 + this.field_h.field_E, -1);
        return;
    }

    final void c(int param0, int param1, int param2) {
        String var4 = null;
        if (param1 == -1) {
          return;
        }
        if (2 != this.field_M) {
          return;
        }
        if (this.field_n != param1) {
          var4 = lga.a(true, new String[]{this.field_h.field_y[param1], Integer.toString(param2)}, pja.field_c);
          this.a(16711680, var4, -22468);
        } else {
          var4 = lga.a(true, new String[]{Integer.toString(param2)}, nu.field_g);
          this.a(65280, var4, -22468);
        }
        if (param0 != 640) {
          this.field_P = (ad) null;
        }
    }

    private final void o(int param0) {
        int var3;
        int var4;
        int var5;
        Object var6;
        hd var7;
        td var8;
        ad var9;
        var9 = this.field_G[this.field_Z.field_h.field_f];
        this.field_H = this.field_s.field_h;
        this.field_N = this.field_s.field_s;
        if (this.field_N < 0) {
          return;
        }
        if (this.field_N < this.field_h.field_z &&
          this.field_H >= 0 &&
          this.field_H < this.field_h.field_B) {
          var3 = var9.field_s.field_x;
          if (param0 != -17) {
            this.field_K = -53;
          }
          var4 = var9.field_s.field_J;
          var5 = un.a(param0 + 105, -var4 + this.field_H, -var3 + this.field_N);
          if (this.r(param0 + 19)) {
            var6 = null;
            var7 = (hd) (ur.field_e[this.field_Z.field_g]);
            if (var7.c(0) == 3) {
              var6 = this.field_h.field_a[this.field_N][this.field_H].field_l;
              if (var7.field_j == 93) {
                var6 = this.field_h.c(this.field_N, this.field_H, param0 + 19);
              }
            }
            if (var5 != 0) {
              this.field_P.field_s.field_s = var5;
            }
            var8 = (td) (this.field_Z);
            var8.field_i = var5;
            var8.field_k = this.field_N;
            var8.field_n = this.field_H;
            if (var6 != null) {
              var8.field_j = new nq((aga) (var6));
            }
            this.k(-1);
            this.field_w = false;
          } else {
            this.m(param0 + 27);
          }
          this.field_f = 5;
          lf.field_c = 0;
          return;
        }
    }

    final void a(int param0, ad param1, byte param2, int param3) {
        try {
          this.a(param1, param3, (ad) null, param0, (byte) -126);
          int var5_int = 108 % ((-45 - param2) / 42);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ad[] param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] var4 = null;
        RuntimeException var4_ref = null;
        ad var6 = null;
        aga var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[][] var11 = null;
        int[][] var12 = null;
        int[][] var13 = null;
        var10 = BachelorFridge.field_y;
        try {
          for (var4_int = 0; var4_int < param1.length; var4_int++) {
            this.field_G[var4_int] = param1[var4_int];
            this.field_G[var4_int].field_s.field_u = var4_int;
          }
          if (param2) {
            this.field_v = (int[]) null;
          }
          var13 = this.field_h.field_L.b(this.field_n, -73);
          var12 = var13;
          var11 = var12;
          var4 = var11;
          for (var5 = 0; 7 > var5; var5++) {
            var6 = this.field_G[var5];
            if (var6 != null &&
              var13.length > var5) {
              var7 = var6.field_s;
              var8 = var13[var5][0];
              var9 = var13[var5][1];
              var7.field_J = var9;
              var7.field_x = var8;
              var7.field_u = var5;
              this.field_h.a(var7, 1, this.field_n, var5);
            }
          }
          this.field_h.g(127);
          this.j(-15503);
          this.field_e.a(0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("gj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(aga param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            this.h(-33);
          }
          stackIn_5_0 = (param0.field_D == this.field_n);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gj.S(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(rk[] param0, op param1, int param2, int param3) {
        try {
          this.field_h = param1;
          this.field_n = param3;
          this.a(13558251, param0);
          this.field_o = new ad[this.field_h.field_d][7];
          if (this.field_n >= 0) {
            this.field_G = this.field_o[this.field_n];
          }
          this.field_K = 0;
          if (0 != this.field_h.field_A) {
            this.l(param2 ^ -19211);
          }
          if (param2 != 19273) {
            this.e(-67);
          }
          this.field_D = new kj[this.field_h.field_z][this.field_h.field_B];
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "gj.MA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean c(int param0) {
        int var2 = this.field_B - mk.field_p;
        if (param0 != -3985) {
          ad var4 = (ad) null;
          this.a(117, (ad) null);
        }
        int var3 = -gd.field_m + this.field_I;
        return var2 * var2 + var3 * var3 > 64 ? true : false;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var2 = 4;
        int var3Lifetime1;
        if (this.field_cb) {
          return;
        }
        if (null != this.field_A) {
          return;
        }
        if (jc.field_r > 3 && jc.field_r < 50 && nfa.field_a > var2 &&
          !(8 + this.field_h.field_k * 39 <= nfa.field_a)) {
          var3 = -1;
          var3Lifetime1 = (nfa.field_a - 4) / 39;
          if (lf.field_c != 0 &&
            !(this.field_h.field_k <= var3Lifetime1)) {
            if (null == this.field_G[var3Lifetime1]) {
              return;
            }
            this.field_q = this.field_G[var3Lifetime1].field_s.field_x;
            this.field_E = this.field_G[var3Lifetime1].field_s.field_J;
            this.a(false, this.a(this.field_E, false, this.field_q));
            if (nd.field_h == 4) {
              this.a(this.field_P, (byte) -52);
            }
          }
        }
        if (!param0) {
          this.field_g = 103;
        }
    }

    private final void d(boolean param0) {
        int stackIn_73_0 = 0;
        Object stackIn_113_0;
        boolean stackIn_113_1;
        Object stackIn_113_2;
        int stackIn_113_3;
        Object stackIn_114_0;
        Object stackIn_114_2;
        boolean stackIn_114_4;
        int var2;
        int var3;
        aj var4;
        aj var5;
        var3 = BachelorFridge.field_y;
        if (this.field_n >= 0) {
          this.field_C.a(19842, true);
        }
        this.field_W.a(param0);
        if (this.field_P != null &&
          this.field_J) {
          var4 = this.field_s.a(this.field_P.field_s.field_J, (byte) 56, this.field_P.field_s.field_x);
          this.field_W.b(-3, var4.field_c - 40, -90 + var4.field_a);
        }
        if (lf.field_c == 1 &&
          !this.field_C.field_T &&
          !this.field_O.field_T) {
          if (this.field_M == 1 &&
            this.field_l) {
            this.c((byte) 122);
          }
          if (this.field_M == 2 &&
            this.field_ab) {
            this.d(18);
          }
          if (this.field_w) {
            this.o(-17);
          }
        }
        if (lf.field_c == 2) {
          this.field_R = mk.field_p;
          this.field_B = mk.field_p;
          this.field_t = gd.field_m;
          this.field_I = gd.field_m;
        }
        if (!this.field_cb &&
          null == this.field_A &&
          this.field_s != null &&
          !this.field_l &&
          !this.field_ab &&
          !this.field_O.field_T &&
          this.field_f <= 0 &&
          (nd.field_h & 4) == 0 &&
          -1 != this.field_B &&
          !this.field_J) {
          if (!this.c(-3985)) {
            var5 = this.field_s.b(mk.field_p, 9, gd.field_m);
            if (var5 != null) {
              this.field_q = var5.field_c;
              this.field_E = var5.field_a;
            }
            if (this.field_q >= 0 &&
              this.field_q < this.field_h.field_z &&
              this.field_E >= 0 &&
              this.field_E < this.field_h.field_B &&
              this.field_h.field_a[this.field_q][this.field_E].field_l != null &&
              this.field_h.field_a[this.field_q][this.field_E].field_l.field_D == this.field_n) {
              this.a(this.a(this.field_E, false, this.field_q), (byte) -52);
            } else {
              this.field_d = true;
              this.field_i = 150;
            }
          }
          this.field_B = -1;
        }
        if (null != this.field_P &&
          0 == (4 & nd.field_h) &&
          this.field_B != -1 &&
          this.field_J) {
          if (!this.c(-3985)) {
            this.m(10);
            qm.a(34, 7758);
            this.field_f = 5;
          }
          this.field_B = -1;
        }
        if (null != this.field_A &&
          !this.field_A.a(-214844415)) {
          this.field_A = null;
        }
        if (null != this.field_Y[0]) {
          if (this.field_eb) {
            this.field_O.a(19842, true);
          }
          if (this.field_eb &&
            this.field_O.field_R == 1) {
            if (null != this.field_P &&
              this.field_P.field_s.field_D == this.field_n) {
              stackIn_73_0 = this.field_P.field_s.field_u;
            } else {
              stackIn_73_0 = -1;
            }
            var2 = stackIn_73_0;
            this.a(var2, (byte) 127);
          }
        } else {
          this.field_O.field_T = false;
        }
        if (!this.field_cb &&
          this.field_m &&
          this.field_A == null) {
          if (this.field_J) {
            if (this.field_P != null &&
              !this.field_P.field_s.a(10, (byte) -82) &&
              !this.field_P.field_s.a(2, (byte) 122)) {
              this.field_W.b((byte) 118);
            }
            if (this.field_W.field_l.field_R == 1) {
              this.a(this.field_P, (byte) -52);
              this.field_J = false;
              lf.field_c = 0;
            }
          }
          if (this.field_C.field_R == 1 &&
            !this.field_l &&
            !this.field_ab &&
            !this.field_w &&
            !this.field_cb &&
            cm.field_v) {
            this.a((byte) -126);
            this.field_cb = true;
            this.field_J = false;
            this.field_e.a(false, this.field_Y, this.field_h.field_A);
            uca.a(22, (byte) 103);
            qm.a(35, 7758);
          }
          this.field_k = this.field_k - 1;
        }
        if (1 < this.field_k) {
        }
        if (!this.field_cb &&
          this.field_A == null &&
          this.field_s != null &&
          !this.field_l &&
          !this.field_ab &&
          !this.field_O.field_T &&
          this.field_f <= 0 &&
          !this.field_J &&
          1 == lf.field_c) {
          this.field_E = this.field_s.field_h;
          this.field_q = this.field_s.field_s;
          if (nd.field_h == 1 &&
            0 <= this.field_q &&
            this.field_h.field_z > this.field_q &&
            this.field_E >= 0 &&
            this.field_E < this.field_h.field_B &&
            null != this.field_h.field_a[this.field_q][this.field_E].field_l &&
            this.field_n == this.field_h.field_a[this.field_q][this.field_E].field_l.field_D) {
            stackIn_113_0 = this;
            stackIn_113_1 = false;
            stackIn_113_2 = this;
            stackIn_113_3 = this.field_E;
            if (param0) {
              stackIn_114_0 = this;
              stackIn_114_2 = this;
              stackIn_114_4 = false;
            } else {
              stackIn_114_0 = this;
              stackIn_114_2 = this;
              stackIn_114_4 = true;
            }
            this.a(stackIn_113_1, this.a(stackIn_113_3, stackIn_114_4, this.field_q));
          }
        }
        if (this.field_d) {
          this.field_i = this.field_i - 1;
          if (this.field_i <= 0) {
            this.field_d = false;
          }
        }
        if (this.field_n >= 0) {
          this.b(true);
        }
        if (this.field_e.field_a &&
          !this.field_cb &&
          this.field_u <= 500) {
          if (null != this.field_Z) {
            this.m(10);
          }
          this.a((byte) 126);
          this.field_cb = true;
          this.field_J = false;
          this.field_e.a(false, this.field_Y, this.field_h.field_A);
        }
        if (this.field_p == 250) {
          qm.a(36, 7758);
        }
        if (this.field_n >= 0 &&
          (this.field_h.field_S[this.field_n].field_c ||
          this.field_h.b((byte) 61, this.field_n)) &&
          !this.field_cb) {
          this.a((byte) 54);
          this.field_cb = true;
          this.field_J = false;
        }
    }

    public static void p(int param0) {
        field_F = null;
        if (param0 != -1) {
          field_F = (kv) null;
        }
    }

    private final void c(byte param0) {
        ad var3;
        int var4;
        tv var5;
        int var6;
        int var7;
        int var8;
        gm var9;
        gm var10;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = BachelorFridge.field_y;
        var9 = (gm) (this.field_Z);
        var10 = var9;
        var3 = this.field_G[this.field_Z.field_h.field_f];
        this.field_N = this.field_s.field_s;
        this.field_H = this.field_s.field_h;
        if (this.field_N < 0) {
          return;
        }
        if (this.field_h.field_z > this.field_N &&
          this.field_H >= 0 &&
          this.field_h.field_B > this.field_H) {
          var4 = var3.field_s.f((byte) 127);
          var5 = (tv) (ur.field_e[var9.field_g]);
          if (param0 <= 103) {
            this.b(102, -121);
          }
          if (32 != var3.field_s.field_y &&
            this.field_h.field_E == 0 &&
            !this.field_h.field_a[var3.field_s.field_x][var3.field_s.field_J].field_i) {
            var4 = var4 >> 1;
          }
          if (hl.a((byte) 100, var10.field_g)) {
            var4 = var4 << 1;
            var4 = var4 + var5.field_l;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var3.field_s.field_x == this.field_N &&
            !this.field_h.field_a[this.field_N][this.field_H].field_g) {
            this.field_h.field_a[this.field_N][this.field_H].field_g = true;
            var6 = this.field_H - var3.field_s.field_J;
            var7 = Math.abs(var6);
            L7: while (true) {
              if (var7 > 0) {
                if (var6 > 0) {
                  if (!(this.field_h.field_B > var3.field_s.field_J + var7) ||
                    !var3.field_s.a(this.field_h.field_a[var3.field_s.field_x][var7 + var3.field_s.field_J].field_n, false)) {
                    var6 = -1 + var7;
                    if (this.field_h.field_B <= var3.field_s.field_J + var7) {
                      break L7;
                    }
                  }
                } else {
                  if (var6 >= 0) {
                    continue;
                  }
                  if (!(var3.field_s.field_J - var7 >= 0) ||
                    !var3.field_s.a(this.field_h.field_a[var3.field_s.field_x][-var7 + var3.field_s.field_J].field_n, false)) {
                    var6 = -(-1 + var7);
                    if (var3.field_s.field_J - var7 <= 0) {
                      break L7;
                    }
                  }
                }
                var7--;
                continue;
              }
              break;
            }
            if (var6 != 0 &&
              Math.abs(var6) <= var4) {
              this.a(true, (byte) -88, var10, var6);
            } else {
              this.m(10);
              this.field_h.field_a[this.field_N][this.field_H].field_g = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_H == var3.field_s.field_J &&
              !this.field_h.field_a[this.field_N][this.field_H].field_g) {
              var6Lifetime1 = -var3.field_s.field_x + this.field_N;
              this.field_h.field_a[this.field_N][this.field_H].field_g = true;
              var7Lifetime1 = Math.abs(var6Lifetime1);
              L14: while (true) {
                if (var7Lifetime1 > 0) {
                  if (var6Lifetime1 > 0) {
                    if (!(var3.field_s.field_x + var7Lifetime1 < this.field_h.field_z) ||
                      !var3.field_s.a(this.field_h.field_a[var7Lifetime1 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                      var6Lifetime1 = var7Lifetime1 - 1;
                      if (this.field_q + var7Lifetime1 >= -1 + this.field_h.field_z) {
                        break L14;
                      }
                    }
                  } else {
                    if (var6Lifetime1 >= 0) {
                      continue;
                    }
                    if (!(0 <= -var7Lifetime1 + var3.field_s.field_x) ||
                      !var3.field_s.a(this.field_h.field_a[-var7Lifetime1 + var3.field_s.field_x][var3.field_s.field_J].field_n, false)) {
                      var6Lifetime1 = -(var7Lifetime1 - 1);
                      if (-var7Lifetime1 + this.field_q <= 0) {
                        break L14;
                      }
                    }
                  }
                  var7Lifetime1--;
                  continue;
                }
                break;
              }
              if (0 != var6Lifetime1 &&
                Math.abs(var6Lifetime1) <= var4) {
                this.a(false, (byte) -88, var10, var6Lifetime1);
              } else {
                this.m(10);
                this.field_h.field_a[this.field_N][this.field_H].field_g = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.m(10);
              this.field_h.field_a[this.field_N][this.field_H].field_g = false;
            }
          }
          this.field_N = -1;
          this.field_H = -1;
          return;
        }
    }

    private final void b(int param0) {
        ej.a(592, 16776960, fha.field_j[-1 + this.field_M][0], true, 16, 86);
        ej.a(592, 16776960, fha.field_j[-1 + this.field_M][1], true, 30, -66);
        if (this.field_e.field_a) {
          ika.a(3, 2, 563, 16777215, -54, 52, this.field_p / 50, 256);
          ika.a(3, 1, 597, 16777215, -120, 52, this.field_p / 50, 256);
        }
        int var2 = 63 / ((param0 - 66) / 46);
    }

    final void a(int param0) {
        if (param0 != 7955) {
          return;
        }
        if (this.field_A != null) {
          this.field_A.d(15204352);
        }
    }

    final void n(int param0) {
        int var3 = 0;
        int dupTemp$0 = 0;
        int var2;
        int var4;
        var4 = BachelorFridge.field_y;
        var2 = -90 % ((47 - param0) / 50);
        if (this.field_h.field_o != 2) {
          return;
        }
        for (var3 = 0; var3 < this.field_h.field_i.length; var3++) {
          if (-1 != this.field_h.field_i[var3][2]) {
            dupTemp$0 = this.field_h.field_i[var3][2];
            this.field_T[dupTemp$0] = this.field_T[dupTemp$0] + 1;
          }
        }
    }

    gj(op param0, int param1, rk[] param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int[] var9 = null;
        int[] var16 = null;
        int[] var17 = null;
        this.field_B = -1;
        this.field_I = -1;
        this.field_r = true;
        this.field_d = false;
        try {
          this.a(param2, param0, 19273, param1);
          this.field_e = new fs(this, param3);
          this.field_j = new eaa();
          this.field_X = new eaa();
          this.j(-15503);
          this.field_S = new eaa();
          this.field_fb = new eaa();
          this.field_v = new int[255];
          for (var5_int = 0; var5_int < 255; var5_int++) {
            this.field_v[var5_int] = 256 * var5_int;
          }
          this.field_T = new int[param0.field_d];
          if (0 == param0.field_A) {
            lna.field_q = false;
          }
          wj.field_g = lna.field_q;
          var9 = new int[256];
          var16 = var9;
          for (var6 = 0; var6 < 256; var6++) {
            var9[var6] = 65793 * var6;
          }
          this.field_x = new kv(45, 45);
          this.field_x.b();
          dg.a(352, 352, 352, 255, var16);
          hga.field_U.a((byte) 120);
          var17 = nga.field_i;
          for (var7 = 0; var7 < 8; var7++) {
            var17[var7] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("gj.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 115) {
          return true;
        }
        stackIn_6_0 = (null != this.field_A) && (this.field_A.field_b);
        return stackIn_6_0;
    }

    final void h(int param0) {
        int var2;
        kv var3;
        int var4;
        ad var5;
        var4 = BachelorFridge.field_y;
        if (13 != gf.field_k) {
          if (param0 != 480) {
            var5 = (ad) null;
            this.a(96, (ad) null, -66);
          }
          if (gf.field_k == 102) {
            this.field_s.a((byte) -57, this.field_E, this.field_q);
          }
          if (hea.field_r >= 2 &&
            gf.field_k == 50 &&
            wga.field_q[82]) {
            sja.field_fb.c(93, (byte) 113);
            System.out.println("--- STATE DUMP REQUESTED ---");
            System.out.println(this.field_h.k((byte) -72));
            System.out.println("--- STATE DUMP ENDS ---");
            return;
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = 1;
        if (this.field_e.field_a) {
          if (this.field_n >= 0 &&
            (1 << this.field_n & this.field_h.field_s) == 0) {
            if (!this.field_h.field_r) {
              var2 = 2;
            } else {
              dg.g(0, 0, 640, 480);
              var3 = new kv(640, 480);
              fc.a(480, 640, var3, 0, (byte) -90, 0);
              eq.a(var3, this, (byte) -111);
              sia.field_h = false;
              var2 = 3;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var2 = 4;
          }
        }
        lg.a(true, var2, false);
    }

    final ad a(int param0, boolean param1, int param2) {
        if (param1) {
          this.field_X = (eaa) null;
        }
        return this.b(this.field_h.field_a[param2][param0].field_l, -23990);
    }

    final void a(byte param0, int param1) {
        boolean discarded$0 = false;
        tv var4 = null;
        if (this.field_P != null) {
          if (!this.a(this.field_P.field_s, (byte) 19) ||
            this.field_P.field_s.a(8, (byte) 55)) {
            return;
          }
          qm.a(10, 7758);
          this.field_ab = false;
          this.field_w = false;
          this.field_l = true;
          if (param0 > -28) {
            discarded$0 = this.c(107);
          }
          this.field_db = param1;
          var4 = (tv) (al.a(-113, this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]]));
          this.field_P.a(16776960, 89, var4.field_f);
          this.field_Z = (sfa) ((Object) new gm(this.field_P.field_s.field_o.field_g.field_b[this.field_P.field_s.field_m[this.field_db]], this.field_P.field_s));
          return;
        }
    }

    private final void j(int param0) {
        int var3 = 0;
        int var6 = 0;
        ad[][] var2;
        ad[] var4;
        ad[] var5;
        ad var7;
        int var8;
        ad[][] var10;
        ad var9;
        var8 = BachelorFridge.field_y;
        this.field_U = 0;
        this.field_Y = new sfa[7];
        if (null != this.field_o) {
          var10 = this.field_o;
          var2 = var10;
          for (var3 = 0; var10.length > var3; var3++) {
            var4 = var10[var3];
            var5 = var4;
            for (var6 = 0; var6 < var5.length; var6++) {
              var7 = var5[var6];
              if (var7 != null) {
                var7.field_l = false;
                if (var7.field_s.field_I > 0) {
                  var7.b(false);
                }
              }
            }
          }
        }
        if (param0 != -15503) {
          var9 = (ad) null;
          this.a((ad) null, -22, (ad) null, -20, (byte) -100);
        }
    }

    final int c(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        int var3 = 8421504;
        if (param1 != 2271) {
          this.field_I = 87;
        }
        if (param0 != -1) {
          if (param0 == 0) {
            var3 = 16711680;
          } else {
            if (param0 == 1) {
              var3 = 6735384;
            } else {
              if (param0 == 2) {
                var3 = 16776960;
              } else {
                if (param0 == 3) {
                  var3 = 33243;
                }
              }
            }
          }
        }
        return var3;
    }

    static {
    }
}
