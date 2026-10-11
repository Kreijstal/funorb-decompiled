/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends js {
    private boolean field_z;
    private int[] field_J;
    private boolean field_K;
    private int[] field_H;
    private kp[] field_S;
    private int field_h;
    private int[][] field_Y;
    private int field_A;
    private int field_m;
    private int field_q;
    private String field_r;
    private tv field_g;
    private int field_v;
    private kp[] field_T;
    private int[][] field_D;
    private ko field_Z;
    private int[] field_P;
    private int[] field_t;
    private int field_L;
    private bl[] field_y;
    private int[] field_B;
    private int[] field_I;
    private boolean field_U;
    private String[] field_Q;
    private int[][] field_O;
    static an field_j;
    private int field_W;
    private io[] field_X;
    private int[] field_M;
    private int field_C;
    private int[] field_p;
    private int field_x;
    private int field_R;
    private int[] field_o;
    private boolean field_i;
    private int field_s;
    private int[] field_w;
    private int[] field_l;
    private int field_G;
    private int field_E;
    private int field_u;
    static int field_V;
    static r field_N;
    private int field_n;
    private int field_k;
    static ld field_F;

    private final void a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = Kickabout.field_G;
        if (null == this.field_X) {
          return;
        }
        on.a(40, g.field_a.field_J - 42, 140 * this.field_X.length, 50, 8, 65793, 128);
        var2 = -9 / ((param0 - 35) / 36);
        for (var3 = 0; var3 < this.field_X.length; var3++) {
          if (this.a(var3, -1)) {
            this.field_X[var3].a(this.b(8, var3), this.c(var3, 96), 13800);
          }
        }
    }

    final static vl a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        vl[] var3 = null;
        vl var5 = null;
        int var6 = 0;
        vl stackIn_5_0 = null;
        vl stackIn_11_0 = null;
        vl stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param1 != -7465) {
            field_N = (r) null;
          }
          var2 = nj.a(0, "jagex-last-login-method", param0);
          if (var2 == null) {
            stackIn_5_0 = rd.field_h;
            return stackIn_5_0;
          }
          var3 = pb.a(true);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, -97)) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
          }
          stackIn_14_0 = rd.field_h;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("lm.R(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, boolean param1) {
        if (param0 == 54) {
          ph.field_a = 0;
        }
        if (param0 == 53) {
          ph.field_a = 1;
        }
        if (param1) {
          return;
        }
        if (param0 == 52) {
          ph.field_a = 2;
        }
        ii.a((byte) -121);
    }

    final void a(ml param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = Kickabout.field_G;
        try {
          var3_int = param0.h((byte) -125);
          this.field_Q = new String[var3_int];
          this.field_H = new int[var3_int];
          if (param1) {
            field_F = (ld) null;
          }
          for (var4 = 0; this.field_Q.length > var4; var4++) {
            this.field_Q[var4] = param0.a(47);
            this.field_H[var4] = param0.h((byte) -120);
          }
          this.field_R = param0.h((byte) -112);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        var4 = 0;
        if (param1 < 63) {
          this.field_Z = (ko) null;
        }
        while (var4 < this.field_Z.field_a) {
          var5 = this.field_X[var4].field_d;
          var6 = this.field_X[var4].field_h;
          var7 = -(var5 >> 1) + this.c(var4, 96);
          var8 = -(var6 >> 1) + this.b(8, var4);
          if (this.a(var4, -1) &&
            var7 <= param0 &&
            param0 < var7 + var5 &&
            var8 <= param2 &&
            var8 + var6 > param2) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          this.field_w = (int[]) null;
        }
        return this.field_R > 0 ? true : false;
    }

    private final int c(int param0, int param1) {
        if (param1 != 96) {
          return 37;
        }
        return 120 + param0 * 135;
    }

    private final void b(int param0) {
        int var2 = 20;
        on.a(-(this.field_A >> 1) + 320, var2, this.field_A, this.field_n, 8, 0, 128);
        on.a(-(-20 + this.field_A >> 1) + 320, var2 + 10, this.field_A - 20, 30, 8, 65793, 128);
        un.field_d.d("<u=ffffff>" + jc.field_e[2].toUpperCase() + "</u> " + (null != this.field_r ? this.field_r : ""), 320, var2 + 30, 16777215, -1);
        var2 = var2 + ii.field_l;
        int var3 = 22;
        int var4 = 80;
        int var5 = 618;
        int var6 = this.field_n;
        var2 += 60;
        pt.a(var5, -22914, var3, var6, var4);
        on.a(-(-60 + this.field_A >> 1) + 320, 10 + var2, -60 + this.field_A, 30, 8, 65793, 128);
        un.field_d.d(lw.field_f.toUpperCase(), 320, var2 + 30, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, qe.field_j, this.field_O, (String[]) null, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + 32 * this.field_O.length;
        var2 += 20;
        on.a(320 - (this.field_A - 60 >> 1), var2 + 10, -60 + this.field_A, 30, 8, 65793, 128);
        un.field_d.d(ad.field_b.toUpperCase(), 320, 30 + var2, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, d.field_c, this.field_D, (String[]) null, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + this.field_D.length * param0;
        var2 += 20;
        on.a(320 - (-60 + this.field_A >> 1), var2 + 10, this.field_A - 60, 30, 8, 65793, 128);
        un.field_d.d(oe.field_j.toUpperCase(), 320, var2 + 30, 16777215, -1);
        var2 += 120;
        eo.a(250, var2, sr.field_g, this.field_Y, new String[]{"", "%"}, 160, 21, this.field_Q.length, this.field_Q, -1);
        var2 = var2 + this.field_Y.length * 32;
        var2 += 20;
        ta.e(117);
        if (this.field_k != 0 &&
          this.field_h > this.field_k) {
          on.a(this.field_m, this.field_u, 570, 12, 3, this.field_i ? 11184810 : this.field_s, 128);
          un.field_d.d(qt.field_h, this.field_m + 285, -1 + this.field_u + 12, this.field_i ? 65793 : 11184810, -1);
        }
        if (this.field_h != 0) {
          on.a(this.field_G, this.field_q, 570, 12, 3, this.field_U ? 11184810 : this.field_s, 128);
          un.field_d.d(gu.field_Ib, this.field_G + 285, 12 + (this.field_q - 1), !this.field_U ? 11184810 : 65793, -1);
        }
    }

    final void a(byte param0, boolean param1) {
        boolean stackIn_12_1 = false;
        int stackIn_25_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_84_1 = false;
        boolean stackIn_97_1 = false;
        int var4;
        int var5_int;
        double var5;
        int var6;
        double var7;
        int var7_int;
        int var8;
        double var9;
        int var9_int;
        int var11;
        int var12;
        int var13;
        tv var14;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var5_intLifetime3;
        int var5_intLifetime4;
        int var5_intLifetime5;
        double var5Lifetime1;
        int var6Lifetime1;
        double var7Lifetime1;
        double var9Lifetime1;
        int var11Lifetime1;
        var12 = Kickabout.field_G;
        if (!param1) {
          return;
        }
        var14 = h.a(17475);
        var4 = -84 / ((param0 - 38) / 60);
        if (this.field_g != var14) {
          stackIn_12_1 = (!bt.field_e) && (this.field_g != var14) && (!hm.a((byte) -66, var14.field_q));
          this.field_K = stackIn_12_1;
          this.field_g = var14;
        } else {
          if (bt.field_e) {
            this.field_K = false;
          } else {
            this.field_r = null;
          }
        }
        if (0 != this.field_x) {
          this.field_r = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ks.field_f, new String[]{"<col=FF0000>" + Integer.toString(this.field_x / 50 + 1) + "</col>"});
        }
        if (0 == ph.field_a) {
          this.field_L = 400;
          this.field_C = 560;
        }
        en.field_o = -1;
        dc.field_c = -1;
        if (ph.field_a == 1) {
          if (-1 == en.field_o) {
            if (null != this.field_T) {
              stackIn_25_0 = this.field_T.length;
            } else {
              stackIn_25_0 = 0;
            }
          } else {
            stackIn_25_0 = en.field_o;
          }
          var5_int = stackIn_25_0;
          this.field_L = 400;
          if (7 < var5_int) {
            stackIn_28_1 = 140;
          } else {
            stackIn_28_1 = 0;
          }
          this.field_C = stackIn_28_1 + 440;
        }
        if (ph.field_a == 2) {
          this.field_C = 600;
          this.field_L = 400;
        }
        if (this.field_A != this.field_C) {
          var5_intLifetime1 = -this.field_A + this.field_C >> 3;
          if (0 == var5_intLifetime1) {
            this.field_A = this.field_C;
          } else {
            this.field_A = this.field_A + var5_intLifetime1;
          }
        }
        if (this.field_n != this.field_L) {
          var5_intLifetime2 = -this.field_n + this.field_L >> 3;
          if (0 != var5_intLifetime2) {
            this.field_n = this.field_n + var5_intLifetime2;
          } else {
            this.field_n = this.field_L;
          }
        }
        if (param1) {
          this.field_Z.a(-21174, this.a(wt.field_x, 77, us.field_j), this.a(dn.field_yb, 88, kf.field_Eb));
          if (this.field_Z.field_e >= 0 &&
            this.field_Z.c(-1)) {
            this.b(this.field_X[this.field_Z.field_e].field_m, false);
          }
        }
        for (var5_intLifetime3 = 0; var5_intLifetime3 < this.field_X.length; var5_intLifetime3++) {
          if (param1) {
            stackIn_52_0 = (this.field_Z.field_e == var5_intLifetime3) ? 1 : 0;
          } else {
            stackIn_52_0 = 0;
          }
          var6 = stackIn_52_0;
          if (param1) {
            if (var6 != 0) {
              stackIn_60_0 = (this.field_Z.c(-1)) ? 1 : 0;
            } else {
              stackIn_60_0 = 0;
            }
          } else {
            stackIn_60_0 = 0;
          }
          var7_int = stackIn_60_0;
          if (var6 != 0) {
            stackIn_66_0 = (this.field_Z.a(0)) ? 1 : 0;
          } else {
            stackIn_66_0 = 0;
          }
          var8 = stackIn_66_0;
          var9_int = wt.field_x - this.c(var5_intLifetime3, 96);
          this.field_X[var5_intLifetime3].a(var6 != 0, var7_int != 0, var8 != 0, 16, var9_int);
        }
        if (this.field_T == null) {
          this.field_T = new kp[this.field_S.length];
        }
        for (var5_intLifetime4 = 0; var5_intLifetime4 < this.field_T.length; var5_intLifetime4++) {
          if (null == this.field_T[var5_intLifetime4]) {
            this.field_T[var5_intLifetime4] = new kp();
            this.field_T[var5_intLifetime4].b(false, this.field_S[var5_intLifetime4]);
          }
          this.field_T[var5_intLifetime4].a(false, this.field_S[var5_intLifetime4]);
        }
        if (ph.field_a == 0) {
          if (null != this.field_y &&
            this.field_T != null) {
            var5_intLifetime5 = this.field_T.length - 1;
            if (this.field_W == 1) {
              var5_intLifetime5 -= 2;
            }
            if (2 == this.field_W) {
              var5_intLifetime5 -= 6;
            }
            if (this.field_W == 3) {
              var5_intLifetime5 -= 14;
            }
            if (dc.field_c != -1) {
              var5_intLifetime5 = 0;
            }
            var13 = 0;
            var6Lifetime1 = var13;
            while (var13 < this.field_y.length) {
              if (this.field_T.length > var5_intLifetime5) {
                if (null != this.field_y[var13] &&
                  this.field_z) {
                  this.field_y[var13].a(this.field_T[var5_intLifetime5], param1, -109);
                }
                if (-1 == dc.field_c) {
                  var5_intLifetime5++;
                }
              }
              var13++;
            }
          }
        } else {
          if (ph.field_a == 2) {
            stackIn_84_1 = (param1) && (el.field_A >= this.field_m) && (570 + this.field_m >= el.field_A) && (n.field_m >= this.field_u) && (12 + this.field_u >= n.field_m);
            this.field_i = stackIn_84_1;
            if (this.field_h != ii.field_l) {
              var5_intLifetime5 = this.field_h - ii.field_l >> 3;
              if (var5_intLifetime5 != 0) {
                ii.field_l = ii.field_l + var5_intLifetime5;
              } else {
                if (ii.field_l >= this.field_h) {
                  ii.field_l = ii.field_l - 1;
                } else {
                  ii.field_l = ii.field_l + 1;
                }
              }
            }
            stackIn_97_1 = (param1) && (el.field_A >= this.field_G) && (570 + this.field_G >= el.field_A) && (n.field_m >= this.field_q) && (this.field_q + 12 >= n.field_m);
            this.field_U = stackIn_97_1;
            if (this.field_i) {
              if (nl.field_p == 1) {
                if (this.field_k != 0) {
                  if (this.field_h > this.field_k) {
                    this.field_h = this.field_h - 32;
                    if (this.field_U &&
                      1 == nl.field_p &&
                      this.field_h < 0) {
                      this.field_h = this.field_h + 32;
                    }
                  } else {
                    if (this.field_U &&
                      1 == nl.field_p &&
                      this.field_h < 0) {
                      this.field_h = this.field_h + 32;
                    }
                  }
                } else {
                  if (this.field_U &&
                    1 == nl.field_p &&
                    this.field_h < 0) {
                    this.field_h = this.field_h + 32;
                  }
                }
              } else {
                if (this.field_U &&
                  1 == nl.field_p &&
                  this.field_h < 0) {
                  this.field_h = this.field_h + 32;
                }
              }
            } else {
              if (this.field_U &&
                1 == nl.field_p &&
                this.field_h < 0) {
                this.field_h = this.field_h + 32;
              }
            }
            this.field_h = this.field_h - id.field_v * 32;
            if (this.field_h > 0) {
              this.field_h = 0;
            }
            if (this.field_k <= this.field_h) {
              var5 = (double)(this.field_E % 151);
              var7 = var5 / 2.0;
              var9 = -37.5 + var7;
              var11 = (int)Math.abs(var9) << 2;
              this.field_s = var11 << 16 | (var11 << 8 | (var11 | 65793));
              this.field_E = this.field_E + 1;
              return;
            }
            this.field_h = this.field_k;
          } else {
            ii.field_l = 0;
            this.field_h = 0;
          }
        }
        var5Lifetime1 = (double)(this.field_E % 151);
        var7Lifetime1 = var5Lifetime1 / 2.0;
        var9Lifetime1 = -37.5 + var7Lifetime1;
        var11Lifetime1 = (int)Math.abs(var9Lifetime1) << 2;
        this.field_s = var11Lifetime1 << 16 | (var11Lifetime1 << 8 | (var11Lifetime1 | 65793));
        this.field_E = this.field_E + 1;
        return;
    }

    final boolean a(int param0, int param1, char param2) {
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int var4_int;
        boolean[] var4;
        int var5;
        int var6;
        int var7;
        boolean[] var8;
        var7 = Kickabout.field_G;
        if (param0 == 13) {
          stackIn_5_0 = (this.field_R == 2) ? 4 : 5;
          var4_int = stackIn_5_0;
          jm.a(var4_int, false, -2);
          return true;
        }
        if (param0 == il.field_h) {
          stackIn_10_0 = !(bt.field_e);
          bt.field_e = stackIn_10_0;
        }
        if (ph.field_a == 2) {
          var8 = ne.field_G;
          var4 = var8;
          if (!var8[rb.field_Kb]) {
            if (!var8[98]) {
              stackIn_20_0 = (param0 == 98) ? 1 : 0;
            } else {
              stackIn_20_0 = 1;
            }
          } else {
            stackIn_20_0 = 1;
          }
          var5 = stackIn_20_0;
          if (!var8[oc.field_e]) {
            if (!var8[99]) {
              stackIn_28_0 = (param0 == 99) ? 1 : 0;
            } else {
              stackIn_28_0 = 1;
            }
          } else {
            stackIn_28_0 = 1;
          }
          var6 = stackIn_28_0;
          if (0 != this.field_k &&
            this.field_h > this.field_k &&
            var6 != 0) {
            this.field_h = this.field_h - 32;
            return true;
          }
          if (0 > this.field_h &&
            var5 != 0) {
            this.field_h = this.field_h + 32;
            return true;
          }
        }
        if (param1 >= -5) {
          this.field_q = 93;
        }
        if (null == this.field_Z) {
          return false;
        }
        this.field_Z.a(0, true);
        if (0 <= this.field_Z.field_e) {
          while (!this.a(this.field_Z.field_e, -1)) {
            stackIn_47_0 = 96;
            stackIn_47_1 = param0;
            if (stackIn_47_0 != stackIn_47_1) {
              this.field_Z.field_e = (this.field_Z.field_e + 1) % this.field_Z.field_a;
              continue;
            }
            this.field_Z.field_e = (this.field_Z.field_a + (this.field_Z.field_e - 1)) % this.field_Z.field_a;
          }
        }
        if (this.field_Z.field_e >= 0 &&
          this.field_Z.c(-1)) {
          this.b(this.field_X[this.field_Z.field_e].field_m, false);
        }
        return true;
    }

    private final boolean a(int param0, int param1) {
        if (param1 != -1) {
          this.field_Y = (int[][]) null;
          return true;
        }
        return true;
    }

    lm(ml param0) {
        super(-2);
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        this.field_h = ii.field_l;
        this.field_C = 560;
        this.field_L = 400;
        this.field_m = 32;
        this.field_q = 63;
        this.field_E = 0;
        this.field_u = 403;
        this.field_n = 400;
        this.field_A = 560;
        this.field_G = 32;
        this.field_s = 0;
        try {
          bt.field_e = false;
          hr.b(22);
          op.a(-363021503);
          var5 = new int[]{54, 53, 52, 12};
          var2 = var5;
          if (var2 != null) {
            this.field_X = new io[var5.length];
            for (var3 = 0; var3 < var5.length; var3++) {
              this.field_X[var3] = new io(120, 7126504, var5[var3]);
            }
            this.field_Z = new ko(this.field_X.length);
            this.field_Z.a(true, this.a(wt.field_x, 98, us.field_j), (byte) -127);
          }
          this.a(param0, false);
          this.a(-85, param0);
          this.a(param0, (byte) 116);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        if (param0 <= 35) {
          return -3;
        }
        return this.field_W;
    }

    final void a(ml param0, byte param1) {
        boolean stackIn_7_1 = false;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        String stackIn_41_0 = null;
        String stackIn_44_0 = null;
        int stackIn_54_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_57_3 = 0;
        String stackIn_60_0 = null;
        String stackIn_63_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var13Lifetime1;
        String var14Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var5Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var3_int = param0.h((byte) -119);
          var4 = 17 % ((50 - param1) / 55);
          this.field_S = new kp[var3_int];
          for (var5 = 0; this.field_S.length > var5; var5++) {
            this.field_S[var5] = new kp();
            this.field_S[var5].a((byte) -119, param0);
          }
          this.field_W = param0.h((byte) -108);
          this.field_v = param0.a((byte) 81);
          this.field_x = param0.a((byte) 81);
          stackIn_7_1 = (param0.h((byte) -128) == 1);
          this.field_z = stackIn_7_1;
          if (dc.field_c == -1) {
            stackIn_10_0 = (int)Math.pow(2.0, (double)this.field_W);
          } else {
            stackIn_10_0 = dc.field_c;
          }
          var5Lifetime1 = stackIn_10_0;
          if (this.field_y == null ||
            this.field_y.length != var5Lifetime1) {
            this.field_y = new bl[var5Lifetime1];
          }
          var6 = 4;
          stackIn_17_0 = (4 < this.field_y.length) ? 20 : 79;
          var7 = stackIn_17_0;
          if (this.field_T != null) {
            var8 = this.field_T.length - 1;
            if (this.field_W == 1) {
              var8 -= 2;
            }
            if (this.field_W == 2) {
              var8 -= 6;
            }
            if (this.field_W == 3) {
              var8 -= 14;
            }
            if (dc.field_c != -1) {
              var8 = 0;
            }
            for (var9 = 0; var9 < var6; var9++) {
              if (var5Lifetime1 > var9) {
                stackIn_35_0 = (var6 <= var5Lifetime1) ? var6 : var5Lifetime1;
                var10 = stackIn_35_0;
                stackIn_38_0 = (0 == var10 % 2) ? 45 : 0;
                var11 = stackIn_38_0 + (-(90 * (var10 >> 1)) + 90 * var9) + 410 - (jt.field_yb >> 1);
                var12 = 90 + var7;
                if (this.field_T[var8].field_c[0] != -1) {
                  stackIn_41_0 = this.field_Q[this.field_T[var8].field_c[0]];
                } else {
                  stackIn_41_0 = "";
                }
                var16 = stackIn_41_0;
                var13 = var16;
                if (-1 == this.field_T[var8].field_c[1]) {
                  stackIn_44_0 = "";
                } else {
                  stackIn_44_0 = this.field_Q[this.field_T[var8].field_c[1]];
                }
                var17 = stackIn_44_0;
                var14 = var17;
                this.field_y[var9] = new bl(this.field_T[var8], new String[]{var16, var17}, var11, -15 + var12, var8);
                if (dc.field_c == -1) {
                  var8++;
                }
              }
            }
            for (var9Lifetime1 = 0; var9Lifetime1 < var6; var9Lifetime1++) {
              if (var9Lifetime1 + var6 < var5Lifetime1) {
                if (var5Lifetime1 == 8) {
                  stackIn_54_0 = var6;
                } else {
                  stackIn_54_0 = -var6 + var5Lifetime1;
                }
                var10Lifetime1 = stackIn_54_0;
                stackIn_56_0 = -(jt.field_yb >> 1);
                stackIn_56_1 = 410 + 90 * var9Lifetime1;
                stackIn_56_2 = 90 * (var10Lifetime1 >> 1);
                if (var10Lifetime1 % 2 != 0) {
                  stackIn_57_3 = 0;
                } else {
                  stackIn_57_3 = 45;
                }
                var11Lifetime1 = stackIn_56_0 + (stackIn_56_1 - (stackIn_56_2 - stackIn_57_3));
                var12Lifetime1 = 268;
                if (-1 != this.field_T[var8].field_c[0]) {
                  stackIn_60_0 = this.field_Q[this.field_T[var8].field_c[0]];
                } else {
                  stackIn_60_0 = "";
                }
                var18 = stackIn_60_0;
                var13Lifetime1 = var18;
                if (-1 != this.field_T[var8].field_c[1]) {
                  stackIn_63_0 = this.field_Q[this.field_T[var8].field_c[1]];
                } else {
                  stackIn_63_0 = "";
                }
                var19 = stackIn_63_0;
                var14Lifetime1 = var19;
                this.field_y[var9Lifetime1 + var6] = new bl(this.field_T[var8], new String[]{var18, var19}, var11Lifetime1, var12Lifetime1 - 15, var8);
                if (dc.field_c == -1) {
                  var8++;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_69_0 = var3;
          stackIn_69_1 = new StringBuilder().append("lm.C(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 8) {
          this.field_x = -76;
        }
        return -20 + g.field_a.field_J;
    }

    private final void e(int param0) {
        cn stackIn_2_0 = null;
        StringBuilder stackIn_2_1 = null;
        String stackIn_3_2 = null;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        double var10;
        int var12;
        int var13;
        String var14;
        int var6Lifetime1;
        int var6Lifetime2;
        var13 = Kickabout.field_G;
        on.a(-(this.field_A >> 1) + 320, 20, this.field_A, this.field_n, 8, 0, 128);
        on.a(320 - (this.field_A - 20 >> 1), 30, -20 + this.field_A, 30, 8, 65793, 128);
        stackIn_2_0 = un.field_d;
        stackIn_2_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[0].toUpperCase()).append("</u> ");
        if (this.field_r == null) {
          stackIn_3_2 = "";
        } else {
          stackIn_3_2 = this.field_r;
        }
        ((cn) (Object) stackIn_2_0).d(((StringBuilder) (Object) stackIn_2_1).append(stackIn_3_2).toString(), 320, 50, 16777215, -1);
        pt.a(640, -22914, 0, 88, 60);
        on.a(224, 66, 372, 50, 8, 65793, 196);
        un.field_d.d(vo.$cfr$intArgs$a$53ce4ab4c593(-18, wk.field_e, new String[]{kp.field_g[this.field_W].toLowerCase()}), 410, 82, 16777215, -1);
        var2 = 46;
        on.a(var2, 66, 175, 50, 8, 65793, 196);
        un.field_d.d(nk.field_g, var2 + 87, 82, 16777215, -1);
        ta.e(120);
        var3 = 17;
        var4 = -var3 + 88;
        var5 = 175;
        for (var6 = 0; this.field_Q.length > var6; var6++) {
          var4 = var4 + (var3 + 2);
          on.a(var2, var4, var5, var3, 65793, 96);
          if (this.field_Q.length > var6) {
            var14 = this.field_Q[var6].toLowerCase();
            var7 = var14;
            stackIn_11_0 = ((this.field_v >> var6 & 1) != 1) ? 0 : 1;
            var8 = stackIn_11_0;
            if (var8 != 0) {
              var14 = var7;
              var7 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ig.field_e, new String[]{var14});
            }
            stackIn_17_0 = (var8 != 0) ? 5592405 : 16777215;
            var9 = stackIn_17_0;
            pt.a(var2 + var5, -22914, 20 + var2, var4 + 20, var4);
            if (-20 + var5 >= un.field_d.a(var7)) {
              un.field_d.d(var7, var2 + (var5 >> 1), var4 + 13, var9, -1);
            } else {
              var10 = (double)(un.field_d.a(var7) + 20 - var5);
              var12 = -(int)(var10 * Math.sin((double)this.field_E / 50.0) - 5.0);
              un.field_d.d(var7, var2 + (var5 >> 1) + var12, 13 + var4, var9, -1);
            }
            ta.e(param0 + 21236);
            if (var8 != 0) {
              on.e(-(un.field_d.a(var7) >> 1) + (var5 >> 1) + (var2 - 8), 8 + var4, 8 + ((var5 >> 1) + var2) + (un.field_d.a(var7) >> 1), var4 + 8, 11141377, 196);
              on.e(-(un.field_d.a(var7) >> 1) + ((var5 >> 1) + var2 - 8), var4 + 9, (var5 >> 1) + (var2 + (un.field_d.a(var7) >> 1)) + 8, var4 + 9, 11141377, 196);
            }
            b.field_U[this.field_H[var6]].c(var2, var4 - 1);
          }
        }
        if (param0 != -21109) {
          this.field_L = -119;
        }
        for (var6Lifetime1 = 0; var6Lifetime1 < 16; var6Lifetime1++) {
          on.c(var2, 2 + var3 + var6Lifetime1 + var4, 175, 65793, -(var6Lifetime1 << 3) + 128);
        }
        on.a(224, 90, 372, 320, 65793, 96);
        if (this.field_z) {
          if (null != this.field_y) {
            for (var6Lifetime2 = 0; var6Lifetime2 < this.field_y.length; var6Lifetime2++) {
              if (null == this.field_y[var6Lifetime2]) {
                jr.a(410, -89, 250);
              } else {
                this.field_y[var6Lifetime2].a(98);
              }
            }
          }
        } else {
          un.field_d.a(vo.$cfr$intArgs$a$53ce4ab4c593(-18, rv.field_a, new String[]{"<col=FF0000>" + Integer.toString(1 + this.field_x / 50) + "</col>"}), 224, 90, 372, 320, 16777215, -1, 1, 1, 0);
        }
    }

    private final void b(byte param0) {
        int var14_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        cn stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_1 = 0;
        kp[] stackIn_49_0 = null;
        int stackIn_50_1 = 0;
        kp[] stackIn_53_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int[] stackIn_56_1 = null;
        int stackIn_57_2 = 0;
        String[] stackIn_60_0 = null;
        int[] stackIn_60_1 = null;
        int stackIn_61_2 = 0;
        String stackIn_63_0 = null;
        int[] stackIn_65_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_69_0 = null;
        int[] stackIn_69_1 = null;
        int stackIn_70_2 = 0;
        String stackIn_72_0 = null;
        int stackIn_76_0;
        int stackIn_76_1;
        int stackIn_76_2;
        int stackIn_76_3;
        int stackIn_77_4 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_82_0;
        int stackIn_82_1;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_82_4;
        int stackIn_83_5;
        int[] stackIn_103_0 = null;
        int stackIn_104_1 = 0;
        String stackIn_107_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        kp var14;
        int var15;
        kp var15_ref_kp;
        int var16;
        String var16_ref_String;
        int var17;
        String var17_ref_String;
        String var18;
        int var19;
        var19 = Kickabout.field_G;
        if (en.field_o != -1) {
          stackIn_5_0 = en.field_o;
        } else {
          if (this.field_T == null) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = this.field_T.length;
          }
        }
        var2 = stackIn_5_0;
        stackIn_8_0 = (var2 <= 7) ? 20 : 300;
        var3 = stackIn_8_0;
        var4 = 48 % ((-30 - param0) / 45);
        on.a(-(this.field_A >> 1) + 320, 20, this.field_A, this.field_n, 8, 0, 128);
        on.a(-(-var3 + this.field_A >> 1) + 320, 30, this.field_A - var3, 30, 8, 65793, 128);
        stackIn_10_0 = un.field_d;
        stackIn_10_1 = new StringBuilder().append("<u=ffffff>").append(jc.field_e[1].toUpperCase()).append("</u> ");
        if (null != this.field_r) {
          stackIn_11_2 = this.field_r;
        } else {
          stackIn_11_2 = "";
        }
        ((cn) (Object) stackIn_10_0).d(((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).toString(), 320, 50, 16777215, -1);
        var5 = 110;
        var6 = 40;
        var7 = (var5 << 1) / 3;
        stackIn_17_0 = var6;
        if (7 < var2) {
          stackIn_18_1 = 5;
        } else {
          if (var2 <= 3) {
            stackIn_18_1 = (var2 > 1) ? 20 : 0;
          } else {
            stackIn_18_1 = 10;
          }
        }
        var8 = stackIn_17_0 + stackIn_18_1;
        stackIn_21_0 = (var2 <= 7) ? 0 : var7;
        stackIn_23_0 = -stackIn_21_0;
        if (var2 <= 3) {
          stackIn_24_1 = 0;
        } else {
          stackIn_24_1 = var7;
        }
        stackIn_26_0 = stackIn_23_0 - stackIn_24_1;
        if (1 < var2) {
          stackIn_27_1 = var7;
        } else {
          stackIn_27_1 = 0;
        }
        var9 = stackIn_26_0 + (-stackIn_27_1 + 320);
        stackIn_30_0 = (7 < var2) ? var8 : 0;
        stackIn_32_0 = -stackIn_30_0;
        if (var2 > 1) {
          stackIn_33_1 = var8;
        } else {
          stackIn_33_1 = 0;
        }
        stackIn_35_0 = stackIn_32_0 - stackIn_33_1 + 210;
        if (var2 > 3) {
          stackIn_36_1 = var8;
        } else {
          stackIn_36_1 = 0;
        }
        var10 = stackIn_35_0 - stackIn_36_1;
        var11 = var9;
        var12 = var10;
        var13 = 3;
        if (var2 <= 7) {
          var13--;
        }
        if (var2 <= 3) {
          var13--;
        }
        if (var2 <= 1) {
          var13--;
        }
        un.field_d.d(kp.field_g[var13].toLowerCase(), var11, var12 + (-(var6 >> 1) - 4), 16777215, -1);
        for (var14_int = 0; var2 > var14_int; var14_int++) {
          if (null != this.field_T) {
            stackIn_49_0 = this.field_T;
            if (en.field_o != -1) {
              stackIn_50_1 = 0;
            } else {
              stackIn_50_1 = var14_int;
            }
            if (stackIn_49_0[stackIn_50_1] != null) {
              stackIn_53_0 = this.field_T;
              if (en.field_o == -1) {
                stackIn_54_1 = var14_int;
              } else {
                stackIn_54_1 = 0;
              }
              var15_ref_kp = stackIn_53_0[stackIn_54_1];
              stackIn_56_0 = -1;
              stackIn_56_1 = var15_ref_kp.field_c;
              if (!var15_ref_kp.field_d) {
                stackIn_57_2 = 0;
              } else {
                stackIn_57_2 = 1;
              }
              if (stackIn_56_0 == stackIn_56_1[stackIn_57_2]) {
                stackIn_63_0 = "";
              } else {
                stackIn_60_0 = this.field_Q;
                stackIn_60_1 = var15_ref_kp.field_c;
                if (var15_ref_kp.field_d) {
                  stackIn_61_2 = 1;
                } else {
                  stackIn_61_2 = 0;
                }
                stackIn_63_0 = stackIn_60_0[stackIn_60_1[stackIn_61_2]];
              }
              var16_ref_String = stackIn_63_0;
              stackIn_65_0 = var15_ref_kp.field_c;
              if (!var15_ref_kp.field_d) {
                stackIn_66_1 = 1;
              } else {
                stackIn_66_1 = 0;
              }
              if (stackIn_65_0[stackIn_66_1] == -1) {
                stackIn_72_0 = "";
              } else {
                stackIn_69_0 = this.field_Q;
                stackIn_69_1 = var15_ref_kp.field_c;
                if (var15_ref_kp.field_d) {
                  stackIn_70_2 = 0;
                } else {
                  stackIn_70_2 = 1;
                }
                stackIn_72_0 = stackIn_69_0[stackIn_69_1[stackIn_70_2]];
              }
              var17_ref_String = stackIn_72_0;
              eo.a(var15_ref_kp, var16_ref_String, var17_ref_String, var11 - (var5 >> 1), var12 - (var6 >> 1), var5, var6);
            }
          }
          if (var2 - 1 != var14_int) {
            stackIn_76_0 = (var5 >> 1) + var11;
            stackIn_76_1 = -1 + var12;
            stackIn_76_2 = -(var5 >> 1) + ((var7 << 1) + var11);
            stackIn_76_3 = var12 - 1;
            if (var14_int % 2 != 0) {
              stackIn_77_4 = -(var8 >> 1);
            } else {
              stackIn_77_4 = var8 >> 1;
            }
            on.b(stackIn_76_0, stackIn_76_1, stackIn_76_2, stackIn_76_3 + stackIn_77_4, 65793);
            stackIn_79_0 = (var5 >> 1) + var11;
            stackIn_79_1 = var12;
            stackIn_79_2 = var11 + ((var7 << 1) - (var5 >> 1));
            if (var14_int % 2 != 0) {
              stackIn_80_3 = -(var8 >> 1);
            } else {
              stackIn_80_3 = var8 >> 1;
            }
            on.b(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_80_3 + var12, 65793);
            stackIn_82_0 = var11 + (var5 >> 1);
            stackIn_82_1 = var12 + 1;
            stackIn_82_2 = -(var5 >> 1) + (var11 + (var7 << 1));
            stackIn_82_3 = var12;
            stackIn_82_4 = 1;
            if (var14_int % 2 == 0) {
              stackIn_83_5 = var8 >> 1;
            } else {
              stackIn_83_5 = -(var8 >> 1);
            }
            on.b(stackIn_82_0, stackIn_82_1, stackIn_82_2, stackIn_82_3 + (stackIn_82_4 + stackIn_83_5), 65793);
          }
          var12 = var12 + var8;
          if (var14_int == -8 + var2 ||
            -4 + var2 == var14_int ||
            var14_int == var2 - 2) {
            var10 = var10 + (var8 >> 1);
            var9 = var9 + (var7 << 1);
            var8 = var8 << 1;
            var11 = var9;
            var12 = var10;
            var13--;
            if (var13 >= 0) {
              un.field_d.d(kp.field_g[var13].toLowerCase(), var11, -4 + var12 - (var6 >> 1), 16777215, -1);
            }
          }
        }
        var12 = var12 - var8;
        if (null != this.field_T &&
          this.field_T[this.field_T.length - 1].field_f >= 5) {
          var14 = this.field_T[this.field_T.length - 1];
          var15 = (var6 << 1) + (var6 >> 1);
          var12 = var12 + var15;
          pt.a(var11 + var5, -22914, var11 - var5, -(var6 >> 1) + var12, -var6 + var12);
          on.a(-(un.field_d.a(eq.field_g) >> 1) + var11 - 10, var12 - var6, 20 + un.field_d.a(eq.field_g), var6, 8, 65793, 128);
          un.field_d.d(eq.field_g, var11, var12 + (-(var6 >> 1) - 4), -1, -1);
          ta.e(126);
          on.a(-(var5 >> 1) + var11, -(var6 >> 1) + var12, var5, var6, 65793, 128);
          kb.field_E[6].c(var11 + (var5 >> 1) - (kb.field_E[6].field_o - 4), -(kb.field_E[6].field_v >> 1) + var12);
          var16 = var14.field_o;
          if (var16 < 0 &&
            var14.field_f >= 5) {
            var16 = var14.field_k;
          }
          stackIn_103_0 = var14.field_c;
          if (var14.field_d) {
            stackIn_104_1 = 1 - var16;
          } else {
            stackIn_104_1 = var16;
          }
          var17 = stackIn_103_0[stackIn_104_1];
          if (var17 > -1) {
            stackIn_107_0 = this.field_Q[var17];
          } else {
            stackIn_107_0 = hi.field_w;
          }
          var18 = stackIn_107_0;
          un.field_d.d(var18, 10 - (kb.field_E[6].field_o >> 1) + var11, 4 + var12, 16777215, -1);
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        int discarded$0 = 0;
        try {
          if (param2 > -28) {
            discarded$0 = this.b(-108, -27);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        String var8;
        int var9;
        var9 = Kickabout.field_G;
        pt.a(-(this.field_A >> 1) + 320 + this.field_A, param0 - 22909, -(this.field_A >> 1) + 320, this.field_n + 20, 20);
        if (0 != ph.field_a) {
          if (ph.field_a != 1) {
            if (ph.field_a == 2) {
              this.b(32);
            }
          } else {
            this.b((byte) 111);
          }
        } else {
          this.e(-21109);
        }
        ta.e(121);
        this.a(param0 ^ 28);
        var3 = 70;
        var4 = -42 + g.field_a.field_J;
        if (param0 != -5) {
          return;
        }
        if (!this.field_K) {
          pt.a(du.field_n + var3 - 10, -22914, -10 + var3, var4, -18 + var4);
          cd.a((byte) -127, var4, var3);
          ta.e(123);
        } else {
          var5 = Math.abs(255 - (int)(nj.a(96) / 5L % 512L));
          var6 = 0;
          var7 = Math.abs(255 - var5) | Math.abs(-var5 + 255) << 8 | Math.abs(255 - var5) << 16;
          pt.a(40 + (du.field_n + var3), -22914, -2 + var3, var4, -16 + var4);
          on.a(var3, var4 - 11, 33 + du.field_n, 20, 6, var6, al.a(false, (byte) -96));
          np.a(var4, -123, 14 + var3);
          np.a(var4, param0 + 113, du.field_n + (30 + var3));
          var8 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, vi.field_o, new String[]{mk.field_b[il.field_h]});
          q.field_d.a(var8, var3 + 20, var4, var7, -1);
          ta.e(118);
        }
    }

    public static void a(boolean param0) {
        field_F = null;
        field_N = null;
        if (!param0) {
          field_F = (ld) null;
        }
        field_j = null;
    }

    final void a(int param0, ml param1) {
        int var3_int = 0;
        int var4 = 0;
        int var6 = Kickabout.field_G;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        try {
          var3_int = param1.h((byte) -106);
          this.field_o = new int[var3_int];
          this.field_p = new int[var3_int];
          this.field_P = new int[var3_int];
          this.field_I = new int[var3_int];
          this.field_l = new int[var3_int];
          this.field_B = new int[var3_int];
          this.field_M = new int[var3_int];
          this.field_w = new int[var3_int];
          this.field_J = new int[var3_int];
          this.field_t = new int[var3_int];
          var4 = 0;
          int var5 = 37 % ((param0 - 72) / 36);
          while (var4 < var3_int) {
            this.field_M[var4] = param1.a((byte) 81);
            this.field_p[var4] = param1.a((byte) 81);
            this.field_w[var4] = param1.a((byte) 81);
            this.field_B[var4] = param1.a((byte) 81);
            this.field_l[var4] = param1.a((byte) 81);
            this.field_o[var4] = param1.a((byte) 81);
            this.field_t[var4] = param1.a((byte) 81);
            this.field_P[var4] = param1.a((byte) 81);
            this.field_J[var4] = param1.a((byte) 81);
            this.field_I[var4] = param1.h((byte) -127);
            var4++;
          }
          this.field_O = new int[this.field_M.length][4];
          for (var4Lifetime1 = 0; var4Lifetime1 < this.field_M.length; var4Lifetime1++) {
            this.field_O[var4Lifetime1][0] = this.field_M[var4Lifetime1];
            this.field_O[var4Lifetime1][1] = this.field_p[var4Lifetime1];
            this.field_O[var4Lifetime1][2] = this.field_w[var4Lifetime1];
            this.field_O[var4Lifetime1][3] = this.field_B[var4Lifetime1];
          }
          this.field_D = new int[this.field_l.length][4];
          for (var4Lifetime2 = 0; this.field_l.length > var4Lifetime2; var4Lifetime2++) {
            this.field_D[var4Lifetime2][0] = this.field_l[var4Lifetime2];
            this.field_D[var4Lifetime2][1] = this.field_o[var4Lifetime2];
            this.field_D[var4Lifetime2][2] = this.field_t[var4Lifetime2];
            this.field_D[var4Lifetime2][3] = this.field_P[var4Lifetime2];
          }
          this.field_Y = new int[this.field_J.length][2];
          for (var4Lifetime3 = 0; this.field_J.length > var4Lifetime3; var4Lifetime3++) {
            this.field_Y[var4Lifetime3][0] = this.field_J[var4Lifetime3];
            this.field_Y[var4Lifetime3][1] = this.field_I[var4Lifetime3];
          }
          this.field_k = -(100 + 96 * this.field_M.length);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "lm.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        if (param0 != -1) {
          lm.a(false);
        }
    }

    static {
        field_N = new r();
        field_F = new ld();
    }
}
