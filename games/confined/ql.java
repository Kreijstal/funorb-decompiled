/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int field_d;
    private double[] field_z;
    private boolean field_c;
    boolean field_j;
    private int field_y;
    private int field_h;
    private int field_l;
    private hn field_i;
    private int field_w;
    private double field_r;
    private int field_v;
    int field_n;
    static va field_k;
    int field_q;
    double field_b;
    int field_e;
    static int field_u;
    int field_o;
    int field_p;
    static String field_t;
    private int field_f;
    static String field_A;
    private int field_x;
    private int field_s;
    private double[] field_g;
    int field_m;
    double field_B;
    private int[] field_a;

    public static void b(int param0) {
        if (param0 != 14293) {
          field_A = (String) null;
        }
        field_A = null;
        field_t = null;
        field_k = null;
    }

    final static void a(int param0, kg param1, int param2, byte param3, int param4) {
        try {
          param1.f(param3 ^ 119, 12);
          param1.c(17, param3 ^ 32);
          param1.c(param2, 8);
          if (param3 != 40) {
            field_u = 11;
          }
          param1.c(param0, 8);
          param1.f(127, param4);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ql.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        sd.field_f = null;
        if (param0) {
          return;
        }
        rj.field_f = (byte[][]) null;
        jl.field_p = null;
        ij.field_r = null;
        an.field_p = null;
        rg.field_I = null;
    }

    final void b(int param0, int param1) {
        if (8 == param0) {
          this.field_s = this.field_s + 1;
        }
        if (param0 == 16) {
          this.field_x = this.field_x + 1;
        }
        if (param0 == 17) {
          this.field_d = this.field_d + 1;
        }
        if (param1 < 43) {
          return;
        }
        if (param0 == 15) {
          this.field_w = this.field_w + 1;
        }
        if (param0 == 13) {
          this.field_j = false;
        }
        if (param0 == 7) {
          this.field_l = this.field_l + 1;
        }
        if (param0 == 9) {
          this.field_m = 1 + this.field_o;
          if (this.field_i.field_Q != null) {
            this.field_e = 1 + this.field_o;
          }
        }
    }

    final boolean a(int param0, int param1) {
        int var4 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_35_0 = false;
        boolean stackIn_51_0 = false;
        boolean stackIn_58_0 = false;
        boolean stackIn_63_0 = false;
        boolean stackIn_68_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_78_0 = false;
        boolean stackIn_84_0 = false;
        boolean stackIn_92_0 = false;
        int var3;
        int var5;
        int var3Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        if (this.field_o < wl.field_c[param1]) {
          return false;
        }
        if (param1 == 0) {
          stackIn_7_0 = !(this.field_i.field_B.field_mb);
          return stackIn_7_0;
        }
        if (param1 == 1) {
          stackIn_13_0 = !(this.field_i.field_B.field_Eb);
          return stackIn_13_0;
        }
        if (param1 == 2) {
          stackIn_18_0 = !(this.field_i.field_B.field_Sb);
          return stackIn_18_0;
        }
        if (param1 == 3) {
          stackIn_23_0 = !(this.field_i.field_B.field_cb);
          return stackIn_23_0;
        }
        if (5 == param1) {
          stackIn_29_0 = !(this.field_i.field_B.field_eb);
          return stackIn_29_0;
        }
        if (~param1 == param0) {
          stackIn_35_0 = !(this.field_i.field_B.field_rb);
          return stackIn_35_0;
        }
        if (param1 == 6) {
          var3 = 0;
          for (var4 = 0; 5 > var4; var4++) {
            if (this.field_i.field_B.field_Nb[var4] != null) {
              var3++;
            }
          }
          if (var3 >= 5) {
            stackIn_51_0 = false;
          } else {
            stackIn_51_0 = !(this.field_o < qi.field_h[var3]);
          }
          return stackIn_51_0;
        }
        if (param1 == 14) {
          if (16384 >= this.field_i.field_B.field_Bb.field_d) {
            return true;
          }
          var3Lifetime1 = -8 + this.field_i.field_B.field_Bb.field_b;
          stackIn_58_0 = !(var3Lifetime1 >= this.a(-2));
          return stackIn_58_0;
        }
        if (8 == param1) {
          stackIn_63_0 = !(this.field_i.field_h < 20000 + 20000 * this.field_s);
          return stackIn_63_0;
        }
        if (param1 == 7) {
          stackIn_68_0 = !(this.field_i.field_h < 40000 * this.field_l + 55000);
          return stackIn_68_0;
        }
        if (param1 == 15) {
          stackIn_73_0 = !(this.field_i.field_h < this.field_w * 40000 + 35000);
          return stackIn_73_0;
        }
        if (param1 == 16) {
          stackIn_78_0 = !(this.field_i.field_h < this.field_x * 20000 + 25000);
          return stackIn_78_0;
        }
        if (param1 == 17) {
          stackIn_84_0 = !(this.field_i.field_h < 10000 + 10000 * this.field_d);
          return stackIn_84_0;
        }
        if (param1 != 9) {
          if (param1 == 13) {
            return this.field_j;
          }
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_m > this.field_o && (this.field_i.field_Q == null ||
          this.field_e > this.field_o)) {
          stackIn_92_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_92_0 = true;
        }
        return stackIn_92_0;
    }

    final void a(int param0, boolean param1) {
        int var5_int = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        int[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_84_2 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_140_1 = 0;
        int var3;
        int var4;
        double[] var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        if (param1 &&
          h.field_R != null) {
          h.field_R.b(ig.field_j[this.field_o], 32);
        }
        if (this.field_o == 20 &&
          !this.field_i.field_t) {
          di.a(param0 - 43498, 238, 17);
        }
        if (this.field_o > 24) {
          this.field_i.field_K = new un(this.field_i);
          sg.f((byte) 122);
          if (!this.field_i.field_v) {
            di.a(-30867, 237, 18);
          }
          if (pa.field_c) {
            di.a(param0 - 43498, 249, 6);
          }
          if (this.field_i.field_B.field_ab < 4) {
            return;
          }
          di.a(-30867, 239, 16);
          return;
        }
        this.field_i.field_x.a((byte) -123, this);
        var3 = 0;
        var4 = 0;
        this.field_f = -1 + this.field_o >> 2;
        this.field_c = true;
        if (param0 != 12631) {
          return;
        }
        if (this.field_f >= 4) {
          this.field_f = 3;
        }
        this.field_b = 0.0020833333333333333 * (double)this.field_o + 0.02;
        if (this.field_o >= 16) {
          if (this.field_o != 16 &&
            this.field_o != 20 &&
            this.field_o != 23) {
            var3 = 50;
            var4 = 100;
          } else {
            var3 = 20;
            stackIn_36_0 = (pa.field_c) ? 1000 : 600;
            var4 = stackIn_36_0;
            this.field_c = false;
          }
        } else {
          if (0 == (3 & this.field_o)) {
            stackIn_28_0 = (!pa.field_c) ? 600 : 1000;
            var4 = stackIn_28_0;
          } else {
            var3 = 50;
          }
        }
        this.field_q = 1;
        if (this.field_o >= 3) {
          this.field_q = 2;
        }
        if (9 <= this.field_o &&
          this.field_o <= 11 ||
          (15 == this.field_o ||
          21 <= this.field_o)) {
          var3 = var3 >> 1;
        }
        if (11 > this.field_o) {
          if (this.field_o < 10) {
            if (this.field_o >= 9) {
              this.field_q = 8;
            }
          } else {
            this.field_q = 9;
          }
        } else {
          this.field_q = this.field_q | 8;
        }
        if (2 <= this.field_o) {
          this.field_q = this.field_q | 16384;
        }
        if (6 <= this.field_o) {
          this.field_q = this.field_q | 32768;
        }
        if (7 <= this.field_o) {
          this.field_q = this.field_q | 16;
        }
        if (this.field_o >= 13) {
          this.field_q = this.field_q | 64;
        }
        if (this.field_o >= 15) {
          this.field_q = this.field_q | 128;
        }
        if (this.field_o >= 16) {
          this.field_q = this.field_q | 4;
        }
        if (this.field_o >= 18) {
          this.field_q = this.field_q | 2048;
        }
        if (this.field_o >= 19) {
          this.field_q = this.field_q | 1024;
        }
        if (21 <= this.field_o) {
          this.field_q = this.field_q | 32;
        }
        if (this.field_o >= 22) {
          this.field_q = this.field_q | 256;
        }
        if (24 <= this.field_o) {
          this.field_q = this.field_q | 8192;
        }
        this.field_y = var4;
        this.field_r = 500.0;
        stackIn_83_0 = this.field_a;
        stackIn_83_1 = 2;
        if (va.a(this.field_q, 4) != 0) {
          stackIn_84_2 = var3 >> 3;
        } else {
          stackIn_84_2 = 0;
        }
        stackIn_83_0[stackIn_83_1] = stackIn_84_2;
        stackIn_86_0 = this.field_a;
        stackIn_86_1 = 1;
        if (va.a(this.field_q, 2) != 0) {
          stackIn_87_2 = var3;
        } else {
          stackIn_87_2 = 0;
        }
        stackIn_86_0[stackIn_86_1] = stackIn_87_2;
        stackIn_89_0 = this.field_a;
        stackIn_89_1 = 0;
        if (0 != va.a(1, this.field_q)) {
          stackIn_90_2 = var3;
        } else {
          stackIn_90_2 = 0;
        }
        stackIn_89_0[stackIn_89_1] = stackIn_90_2;
        stackIn_92_0 = this.field_a;
        stackIn_92_1 = 3;
        if (va.a(this.field_q, 8) == 0) {
          stackIn_93_2 = 0;
        } else {
          stackIn_93_2 = var3 << 1;
        }
        stackIn_92_0[stackIn_92_1] = stackIn_93_2;
        if (this.field_o < wl.field_c[4] + 1) {
          for (var5_int = 0; var5_int < 4; var5_int++) {
            if (0 != (gh.field_c[var5_int] & this.field_q)) {
              this.field_a[var5_int] = this.field_a[var5_int] >> 1;
            }
          }
        }
        boolean decompiledFrameRemainder0 = true;
        this.field_g[3] = this.field_r * 5.0 / (double)this.field_a[3];
        this.field_g[0] = this.field_r * 5.0 / (double)this.field_a[0];
        this.field_g[1] = 5.0 * this.field_r / (double)this.field_a[1];
        this.field_g[2] = this.field_r / (double)this.field_a[2];
        this.field_z[1] = 0.75 * this.field_g[1];
        this.field_z[0] = this.field_g[0] * 0.25;
        var5 = this.field_z;
        this.field_z[3] = 0.0;
        var5[2] = 0.0;
        this.field_B = (double)(-1 + this.field_o) * 0.043478260869565216;
        if (21 <= this.field_o) {
          decompiledFrameRemainder0 = (this.field_o == 24);
        } else {
          decompiledFrameRemainder0 = ((3 & this.field_o) == 3);
        }
        if (decompiledFrameRemainder0) {
          this.field_n = 2080;
          if (this.field_o >= 3) {
            this.field_n = this.field_n | 1;
          }
          if (5 <= this.field_o) {
            this.field_n = this.field_n | 4;
          }
          if (this.field_o >= 9) {
            this.field_n = this.field_n | 8;
          }
          if (10 <= this.field_o) {
            this.field_n = this.field_n | 16;
          }
          if (13 <= this.field_o) {
            this.field_n = this.field_n | 2;
          }
          if (this.field_o >= 19) {
            this.field_n = this.field_n | 64;
          }
          if (this.field_o >= 17) {
            this.field_n = -17 & (256 | this.field_n);
          }
          if (this.field_o >= 15) {
            this.field_n = this.field_n | 1024;
          } else {
            if (this.field_o >= 7) {
              this.field_n = this.field_n | 512;
            }
          }
          if (21 <= this.field_o) {
            this.field_n = this.field_n | 128;
          }
          if (this.field_o <= 7) {
            this.field_v = this.field_o >> 2;
          } else {
            if (this.field_o > 19) {
              this.field_v = 3;
            } else {
              this.field_v = this.field_o - 11 >> 2;
            }
          }
          if (this.field_o >= 19) {
            stackIn_140_1 = 2;
          } else {
            if (15 > this.field_o) {
              stackIn_140_1 = 0;
            } else {
              stackIn_140_1 = 1;
            }
          }
          this.field_p = stackIn_140_1;
          if (this.field_o == 24) {
            this.field_h = 35;
            return;
          }
          if (this.field_o == 19) {
            this.field_h = 35;
            return;
          }
          if (this.field_o == 15) {
            this.field_h = 28;
            return;
          }
          if (this.field_o == 11) {
            this.field_h = 27;
            return;
          }
          if (this.field_o == 7) {
            this.field_h = 22;
            return;
          }
          this.field_h = 17;
          return;
        }
        this.field_n = 0;
        return;
    }

    final int a(int param0) {
        if (param0 != -2) {
          return 4;
        }
        return (this.field_o + 3) / 4;
    }

    final void a(byte param0, double param1) {
        int var25 = 0;
        int var21 = 0;
        int var30 = 0;
        int stackIn_3_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        double var4;
        int var6;
        double var7;
        double var9;
        int var11;
        lc var12;
        int var13;
        double var14;
        double var16;
        int var18;
        int var19;
        double var19_double;
        int var20;
        u var21_ref_u;
        int var22;
        double var22_double;
        Object var23;
        double var24;
        int var24_int;
        int var26;
        int var27;
        rd var27_ref_rd;
        int var28;
        boolean[] var29;
        rd var31;
        int var32;
        int var11Lifetime1;
        int var18Lifetime1;
        int var26Lifetime1;
        var32 = Confined.field_J ? 1 : 0;
        var4 = this.field_r - param1;
        stackIn_3_0 = (!(var4 < 0.0)) ? 0 : 1;
        var6 = stackIn_3_0;
        if (param0 != -46) {
          this.a((byte) -6, -0.5374462764865461);
        }
        var7 = param1 / this.field_r;
        var12 = this.field_i.field_x;
        var13 = var12.field_a - 2;
        var14 = var12.field_r[var13];
        var16 = var12.field_r[1 + var13] - var14;
        if (var6 != 0) {
          var11 = this.field_y;
        } else {
          var9 = (double)this.field_y * var7;
          var11 = (int)var9;
          if (Math.random() < var9 - (double)var11) {
            var11++;
          }
          if (var11 > this.field_y) {
            var11 = this.field_y;
          }
        }
        for (var18 = 0; var18 < var11; var18++) {
          var19_double = var14 + var16 * Math.random();
          var12.a(var19_double, 0.4, 0, var13);
          var21_ref_u = new u(this.field_i, pn.field_h, fa.field_R, var19_double);
          this.field_i.field_g.a((rk) (var21_ref_u), (byte) 100);
          if (!this.field_c) {
            var22_double = Math.random() * (double)this.field_y;
            var24_int = 0;
            for (var25 = 0; var25 < 4; var25++) {
              if (this.field_a[var25] > 0) {
                var24_int = var24_int + this.field_a[var25];
                if ((double)var24_int > var22_double) {
                  var26 = (int)(Math.random() * (double)bf.field_L[var25].length);
                  var27_ref_rd = this.a(0.0, 0, 0.0, 0.0, false, bf.field_L[var25][var26], var21_ref_u, this.field_o, 583, var25, (rd) null, false, new boolean[]{true});
                  this.field_i.field_g.a((rk) (var27_ref_rd), (byte) -93);
                  this.field_a[var25] = this.field_a[var25] - 1;
                  break;
                }
              }
            }
          }
          this.field_y = this.field_y - 1;
        }
        if (this.field_c) {
          for (var18Lifetime1 = 0; 4 > var18Lifetime1; var18Lifetime1++) {
            stackIn_33_0 = (2 == var18Lifetime1) ? 1 : 5;
            var19 = stackIn_33_0;
            var20 = this.field_a[var18Lifetime1] / var19;
            if (var6 == 0) {
              this.field_z[var18Lifetime1] = this.field_z[var18Lifetime1] - param1;
              for (var11Lifetime1 = 0; var20 > var11Lifetime1; var11Lifetime1++) {
                if (this.field_z[var18Lifetime1] < 0.0) {
                  this.field_z[var18Lifetime1] = this.field_z[var18Lifetime1] + this.field_g[var18Lifetime1];
                  continue;
                }
                break;
              }
              if (this.field_z[var18Lifetime1] < 0.0) {
                this.field_z[var18Lifetime1] = 0.0;
              }
            } else {
              var11Lifetime1 = var20;
            }
            for (var21 = 0; var21 < var11Lifetime1; var21++) {
              L12: {
                var22 = var18Lifetime1;
                var23 = null;
                if (0 != (1024 & this.field_q) && (var22 == 1 ||
                  var22 == 3) && Math.random() < 0.1) {
                  var24 = -2.0;
                  var26Lifetime1 = 0;
                  break L12;
                }
                var26Lifetime1 = var13;
                var24 = var14 + Math.random() * var16;
              }
              var27 = (int)(0.6 / this.field_b);
              var28 = (int)(Math.random() * (double)bf.field_L[var22].length);
              var29 = new boolean[]{true};
              for (var30 = 0; var30 < var19; var30++) {
                var31 = this.a(var24, var27, 0.0, 0.0, false, bf.field_L[var22][var28], (u) null, this.field_o, 583, var22, (rd) (var23), false, var29);
                if (var23 == null) {
                  var31.a(Math.random(), Math.random(), var26Lifetime1, this.field_f, Math.random(), Math.random(), 76, Math.random(), Math.random(), this.field_b);
                } else {
                  var31.d((byte) -123, var26Lifetime1);
                }
                this.field_i.field_g.a((rk) (var31), (byte) 67);
                if (var22 == 1) {
                  if ((32768 & this.field_q) != 0) {
                    if (var23 != null) {
                      var31.field_Bb = (var31.field_wb >> 1) + ((rd) (var23)).field_Bb;
                    }
                    var31.field_wb = (var31.field_wb >> 1) * var19;
                  } else {
                    var22 = 0;
                  }
                }
                if (var22 != 3) {
                  var23 = var31;
                } else {
                  var31.d(var26Lifetime1, param0 ^ 65);
                }
                if (this.field_o <= 1) {
                  this.field_i.field_j = this.field_i.field_j + 1;
                }
                var24 = var24 + (double)var27 * var31.field_C * 0.4;
                if (this.field_o <= 2) {
                  this.field_i.field_c = this.field_i.field_c + 1;
                }
              }
              while (var23 != null) {
                ((rd) (var23)).d(var13, -53);
                var23 = ((rd) (var23)).field_Tb;
              }
            }
            this.field_a[var18Lifetime1] = this.field_a[var18Lifetime1] - var19 * var11Lifetime1;
          }
        }
        this.field_r = var4;
        if (var6 != 0) {
          stackIn_83_0 = 2048;
          stackIn_83_1 = this.field_n;
          if ((stackIn_83_0 & stackIn_83_1) == 0) {
            d.field_a = d.field_a - 1;
            this.field_o = this.field_o + 1;
            this.a(12631, true);
          } else {
            this.field_i.field_o = 0;
            this.field_i.field_Q = new wc(this.field_i, var13, var12.field_r[-1 + var12.field_a], this.field_v, this.field_h);
            this.field_i.field_g.a((rk) (this.field_i.field_Q), (byte) 97);
          }
        }
    }

    final rd a(double param0, int param1, double param2, double param3, boolean param4, int param5, u param6, int param7, int param8, int param9, rd param10, boolean param11, boolean[] param12) {
        rd stackIn_6_0;
        rd stackIn_6_1;
        hn stackIn_6_2;
        double stackIn_6_3;
        double stackIn_6_4;
        double stackIn_6_5;
        boolean stackIn_6_6;
        int stackIn_6_7;
        int stackIn_6_8;
        rd stackIn_6_9;
        int stackIn_6_10;
        rd stackIn_7_0 = null;
        rd stackIn_7_1 = null;
        boolean stackIn_7_11 = false;
        int stackIn_11_12;
        int stackIn_12_13 = 0;
        rd stackIn_16_0 = null;
        rd stackIn_16_1 = null;
        boolean stackIn_16_14 = false;
        boolean stackIn_19_15 = false;
        double stackIn_21_16;
        boolean stackIn_22_17 = false;
        boolean stackIn_25_18;
        rd stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        boolean[] var18 = null;
        rd stackIn_7_0Lifetime1;
        rd stackIn_7_0Lifetime2;
        rd stackIn_7_1Lifetime1;
        rd stackIn_7_1Lifetime2;
        rd stackIn_16_0Lifetime1;
        rd stackIn_16_0Lifetime2;
        rd stackIn_16_0Lifetime3;
        rd stackIn_16_1Lifetime1;
        rd stackIn_16_1Lifetime2;
        rd stackIn_16_1Lifetime3;
        rd stackIn_16_0Lifetime4;
        rd stackIn_16_1Lifetime4;
        rd stackIn_7_0Lifetime2Lifetime1;
        rd stackIn_7_1Lifetime2Lifetime1;
        try {
          var17_int = param7 - 20;
          if (param9 == 3) {
            var17_int -= 8;
          }
          if (param8 != 583) {
            var18 = (boolean[]) null;
            this.a(-0.8910612503013482, 106, 0.0031770300817687874, 0.5136535241639608, false, 7, (u) null, 105, -125, -6, (rd) null, true, (boolean[]) null);
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = this.field_i;
          stackIn_6_3 = param2;
          stackIn_6_4 = param3;
          stackIn_6_5 = param0;
          stackIn_6_6 = param4;
          stackIn_6_7 = param9;
          stackIn_6_8 = param5;
          stackIn_6_9 = (rd) (param10);
          stackIn_6_10 = param1;
          if ((this.field_q & 16384) == 0) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_11 = false;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_11 = true;
          }
          stackIn_11_12 = var17_int;
          if ((32 & this.field_q) != 0) {
            stackIn_7_0Lifetime1 = null;
            stackIn_7_1Lifetime1 = null;
            stackIn_12_13 = 2;
          } else {
            if ((16 & this.field_q) != 0) {
              stackIn_7_0Lifetime1 = null;
              stackIn_7_1Lifetime1 = null;
              stackIn_12_13 = 1;
            } else {
              stackIn_7_0Lifetime1 = null;
              stackIn_7_1Lifetime1 = null;
              stackIn_12_13 = 0;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          stackIn_7_0Lifetime2 = null;
          stackIn_7_1Lifetime2 = null;
          if ((this.field_q & gh.field_c[param9]) != 0) {
            stackIn_7_0Lifetime2Lifetime1 = null;
            stackIn_7_1Lifetime2Lifetime1 = null;
            if (param6 == null) {
              stackIn_16_0 = null;
              stackIn_16_1 = null;
              stackIn_16_14 = true;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_16_0Lifetime4 = null;
            stackIn_16_1Lifetime4 = null;
            stackIn_16_14 = false;
          }
          if ((8192 & this.field_q) == 0) {
            stackIn_16_0Lifetime1 = null;
            stackIn_16_1Lifetime1 = null;
            stackIn_19_15 = false;
          } else {
            stackIn_16_0Lifetime1 = null;
            stackIn_16_1Lifetime1 = null;
            stackIn_19_15 = true;
          }
          stackIn_21_16 = this.field_B;
          if (0 == (this.field_q & 2048)) {
            stackIn_16_0Lifetime2 = null;
            stackIn_16_1Lifetime2 = null;
            stackIn_22_17 = false;
          } else {
            stackIn_16_0Lifetime2 = null;
            stackIn_16_1Lifetime2 = null;
            stackIn_22_17 = true;
          }
          if (0 == (this.field_q & 4096)) {
            stackIn_16_0Lifetime3 = null;
            stackIn_16_1Lifetime3 = null;
            stackIn_25_18 = false;
          } else {
            stackIn_16_0Lifetime3 = null;
            stackIn_16_1Lifetime3 = null;
            stackIn_25_18 = true;
          }
          stackIn_26_0 = new rd(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5, stackIn_6_6, stackIn_6_7, stackIn_6_8, stackIn_6_9, stackIn_6_10, stackIn_7_11, stackIn_11_12, stackIn_12_13, stackIn_16_14, stackIn_19_15, stackIn_21_16, stackIn_22_17, stackIn_25_18, param6, param11, param12, param7);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_29_0 = var17;
          stackIn_29_1 = new StringBuilder().append("ql.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static bm[] a(String param0, byte param1, String param2, mi param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bm[] stackIn_2_0 = null;
        bm[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 90) {
            stackIn_2_0 = (bm[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.a(-118, param0);
          var5 = param3.a(var4_int, param2, -107);
          stackIn_4_0 = kj.a(param3, var4_int, var5, false);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ql.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ql(hn param0) {
        this.field_d = 0;
        this.field_j = false;
        this.field_z = new double[13];
        this.field_l = 0;
        this.field_e = 0;
        this.field_x = 0;
        this.field_s = 0;
        this.field_o = 0;
        this.field_m = 0;
        this.field_g = new double[13];
        this.field_a = new int[4];
        this.field_w = 0;
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ql.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new va();
        field_u = 64;
        field_A = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
