/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends id {
    private int field_Lb;
    private int field_ec;
    private gk field_Fb;
    private int field_Sb;
    static jk field_Ub;
    private boolean field_Rb;
    static nf[] field_nc;
    static int field_Ob;
    private int field_Tb;
    private kh[] field_ic;
    private boolean field_Jb;
    private int field_lc;
    static int field_hc;
    private int field_mc;
    private int field_Mb;
    private gk field_cc;
    private int field_Ib;
    private int field_Vb;
    private gk field_Kb;
    private int field_fc;
    private int field_Zb;
    private int field_Xb;
    static String field_jc;
    private int field_Nb;
    private int field_kc;
    private int field_Hb;
    private boolean field_ac;
    private int field_gc;
    private int field_Pb;
    private int field_Yb;
    private gk field_Gb;
    private int field_Qb;
    private double[] field_bc;
    private boolean field_dc;
    static mi field_Wb;

    public static void n(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          wc.a((String) null, 83);
        }
        field_Wb = null;
        field_jc = null;
        field_nc = null;
        field_Ub = null;
    }

    private final void f(int param0, int param1) {
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        boolean stackIn_11_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_1 = false;
        boolean stackIn_25_1 = false;
        ek stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        int stackIn_31_1 = 0;
        this.field_Nb = param1;
        this.field_Ib = 250;
        stackIn_3_1 = ((1 << param1 & this.field_mc) != 0);
        this.field_Jb = stackIn_3_1;
        stackIn_6_1 = ((1 << param1 & this.field_Vb) != 0);
        this.field_dc = stackIn_6_1;
        if (!this.field_Jb) {
          this.field_Bb = 0;
          this.field_wb = 0;
        }
        stackIn_11_1 = ((1 << param1 & this.field_gc) != 0);
        this.field_kb = stackIn_11_1;
        if (!this.field_dc) {
          this.field_sb = 0;
          this.field_W = 0;
        }
        stackIn_16_1 = ((this.field_Pb & 1 << param1) != 0);
        this.field_ac = stackIn_16_1;
        stackIn_19_1 = (param0 != ~(this.field_Yb & 1 << param1));
        this.field_vb = stackIn_19_1;
        stackIn_22_1 = !(this.field_ac);
        this.field_yb = stackIn_22_1;
        stackIn_25_1 = (0 != (1 << param1 & this.field_ec));
        this.field_Rb = stackIn_25_1;
        stackIn_27_0 = this.field_fb;
        stackIn_28_1 = (0 == (1 << param1 & this.field_lc)) ? false : true;
        stackIn_27_0.field_l = stackIn_28_1;
        if ((1 << param1 & this.field_Lb) != 0) {
          stackIn_31_1 = 40;
        } else {
          stackIn_31_1 = 0;
        }
        this.field_Sb = stackIn_31_1;
        if (this.field_Rb) {
          this.field_Db = 0.0;
          this.field_qb = 0.0;
        }
        if (this.field_ac) {
          this.field_A.field_B.field_X = false;
        }
    }

    private final void a(boolean param0, int param1) {
        if (!param0) {
          return;
        }
        this.a((byte) 125, param1);
        this.f(-1, (this.field_Nb + 1) % this.field_Hb);
    }

    private final void e(int param0, int param1) {
        int var3 = 117 / ((param0 - 57) / 56);
        this.field_Xb = param1;
        this.field_kc = -1 + tf.field_c[this.field_Zb][param1];
        if (null != this.field_Fb) {
          this.field_Fb.field_m = this.field_Xb * 192 / tf.field_b[this.field_Zb];
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        od var9 = null;
        od var10 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          var9 = new od(gg.field_n[this.field_Zb], false, true, true, true);
          var10 = var9;
          if ((1 << this.field_Zb & 7) != 0) {
            var10.a(li.field_m, ee.field_H[this.field_Zb][this.field_Qb]);
            var10.a(li.field_m, tf.field_n[this.field_Zb][this.field_Xb]);
          } else {
            if (this.field_Xb != 0) {
              var10.a(li.field_m, tf.field_n[this.field_Zb][this.field_Xb]);
            } else {
              var9.a(li.field_m, ee.field_H[this.field_Zb][this.field_Qb]);
            }
          }
          if (param2 > -5) {
            return;
          }
          this.a(this.field_ob, var10, 27902, this.field_Eb, 128, param4, param1, param3, param0);
          this.field_fb.a(param3, param1, (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_12_0 = var7;
          stackIn_12_1 = new StringBuilder().append("wc.QA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    wc(hn param0, int param1, double param2, int param3, int param4) {
        super(param0, param2, 1.5, 5.0, param4, 14.0, 0.001);
        int fieldTemp$0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8_int = 0;
        bi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        int var10Lifetime1;
        int var7_intLifetime1;
        this.field_Tb = 0;
        this.field_fc = 0;
        try {
          this.a(Math.random(), param0.field_J.field_b, Math.random(), Math.random(), Math.random(), (byte) 27, Math.random(), param0.field_x.a((byte) 78, this.field_C), Math.random());
          this.d(param1, -96);
          this.field_nb.b(118);
          this.field_Zb = param3;
          this.a(va.field_c[3 * param3], va.field_c[2 + 3 * param3], false, va.field_c[1 + 3 * param3]);
          var7_int = vl.field_c[param3].length / 3;
          this.field_bc = new double[3 * var7_int];
          this.field_ic = new kh[var7_int];
          for (var8_int = 0; var8_int < var7_int; var8_int++) {
            this.field_ic[var8_int] = new kh((pm) (this), we.field_b, 117 * var8_int);
            this.field_bc[2 + 3 * var8_int] = -1.0;
          }
          this.g(-122, 0);
          this.e(115, 0);
          this.field_Y = param0.field_J.field_B;
          this.field_gc = 0;
          this.field_Yb = 0;
          this.field_lc = 0;
          this.field_Vb = 0;
          this.field_ab = true;
          this.field_mc = 0;
          if ((param0.field_J.field_n & 1024) == 0) {
            if ((param0.field_J.field_n & 512) != 0) {
              stackIn_9_1 = 1;
            } else {
              stackIn_9_1 = 0;
            }
          } else {
            stackIn_9_1 = 2;
          }
          this.field_Ab = stackIn_9_1;
          this.field_Pb = 0;
          this.field_Lb = 0;
          this.field_ec = 0;
          this.field_Hb = 0;
          var7_intLifetime1 = 63 & param0.field_J.field_n;
          while (var7_intLifetime1 != 0) {
            var8_intLifetime1 = 0;
            var9 = 0;
            for (var10 = 0; var10 < 6; var10++) {
              if ((1 << var10 & var7_intLifetime1) != 0) {
                var9++;
                if (var9 == 1 ||
                  1.0 > Math.random() * (double)var9) {
                  var8_intLifetime1 = var10;
                }
              }
            }
            var7_intLifetime1 = var7_intLifetime1 & ~(1 << var8_intLifetime1);
            fieldTemp$0 = this.field_Hb;
            this.field_Hb = this.field_Hb + 1;
            var10Lifetime1 = fieldTemp$0;
            var11 = var8_intLifetime1;
            if (var11 == 0) {
              this.field_mc = this.field_mc | 1 << var10Lifetime1;
              continue;
            }
            if (var11 == 1) {
              this.field_ec = this.field_ec | 1 << var10Lifetime1;
              continue;
            }
            if (var11 == 3) {
              this.field_Pb = this.field_Pb | 1 << var10Lifetime1;
              continue;
            }
            if (var11 == 2) {
              this.field_Vb = this.field_Vb | 1 << var10Lifetime1;
              continue;
            }
            if (5 == var11) {
              this.field_Lb = this.field_Lb | 1 << var10Lifetime1;
              continue;
            }
            if (var11 != 4) {
              continue;
            }
            this.field_gc = this.field_gc | 1 << var10Lifetime1;
          }
          if ((param0.field_J.field_n & 64) != 0) {
            this.field_Yb = this.field_Yb | this.field_Pb;
          }
          if ((param0.field_J.field_n & 256) != 0) {
            for (var8_intLifetime2 = 0; this.field_Hb > var8_intLifetime2; var8_intLifetime2++) {
              if ((1 << var8_intLifetime2 & (this.field_Lb | (this.field_ec | (this.field_Vb | this.field_mc)))) == 0) {
                this.field_gc = this.field_gc | 1 << var8_intLifetime2;
              }
            }
          }
          if ((128 & param0.field_J.field_n) != 0) {
            for (var8_intLifetime3 = 0; this.field_Hb > var8_intLifetime3; var8_intLifetime3++) {
              if (0 == (1 << var8_intLifetime3 & (this.field_Lb | this.field_gc))) {
                this.field_lc = this.field_lc | 1 << var8_intLifetime3;
              }
            }
          }
          this.field_zb = param0.field_J.field_p;
          this.f(-1, 0);
          if (h.field_R != null) {
            h.field_R.b(lf.field_m[param3], 32);
          }
          this.field_cc = new gk((pm) (this), mi.field_b[param3]);
          this.field_cc.field_w = this.field_C;
          this.field_cc.field_m = 192;
          var8 = sc.field_h[param3];
          if (var8 != null) {
            this.field_Fb = new gk((pm) (this), var8);
            this.field_Fb.field_w = this.field_C;
            this.field_Fb.field_m = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_52_0 = var7;
          stackIn_52_1 = new StringBuilder().append("wc.<init>(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final pm i(byte param0) {
        double[] var2;
        Object var3;
        int var4;
        double[] var5;
        double[] var6;
        double[] var7;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 != 96) {
          this.field_Lb = -59;
        }
        var7 = new double[12];
        var6 = var7;
        var5 = var6;
        var2 = var5;
        this.field_Eb.a((byte) 91, var7);
        if (this.field_zb == 0) {
          var3 = new th(this.field_A, (ee) (this), var7, vl.field_c[this.field_Zb][this.field_Tb], vl.field_c[this.field_Zb][this.field_Tb + 1], vl.field_c[this.field_Zb][2 + this.field_Tb]);
        } else {
          if (this.field_zb == 1) {
            var3 = new gm(this.field_A, (ee) (this), var7, vl.field_c[this.field_Zb][this.field_Tb], vl.field_c[this.field_Zb][1 + this.field_Tb], vl.field_c[this.field_Zb][this.field_Tb + 2]);
          } else {
            var3 = new ik(this.field_A, (ee) (this), var7, vl.field_c[this.field_Zb][this.field_Tb], vl.field_c[this.field_Zb][this.field_Tb + 1], vl.field_c[this.field_Zb][this.field_Tb + 2]);
          }
        }
        this.field_Tb = (this.field_Tb + 3) % vl.field_c[this.field_Zb].length;
        return (pm) (var3);
    }

    final void a(int param0, int param1) {
        int var12 = 0;
        double var3;
        bi var3_ref_bi;
        int var3_int;
        int var4;
        double var5;
        double var7;
        int var7_int;
        rd var8;
        double var9;
        int var9_int;
        double var11;
        double var13_double;
        kh var13;
        int var15;
        mb var16;
        bi var17;
        double[] var21;
        double var3Lifetime1;
        double var5Lifetime1;
        double var5Lifetime2;
        double var7Lifetime1;
        double var9Lifetime1;
        var15 = Confined.field_J ? 1 : 0;
        if (this.field_fc > 0) {
          this.field_fc = this.field_fc - 1;
          if (this.field_fc != 0) {
            if (0 == (this.field_fc & 4)) {
              var3 = this.field_C * 0.8 * Math.pow(Math.random(), 0.3333333333333333);
              var5 = Math.random() * 1.998 - 0.999;
              var7 = var3 * Math.sqrt(-(var5 * var5) + 1.0);
              var5 = var5 * var3;
              var9 = Math.random() * 6.283185307179586;
              var11 = Math.sin(var9) * var7;
              var13_double = Math.cos(var9) * var7;
              ri.a((rk) (this), 0, new ka(this.field_A, this.field_E + var11, var13_double + this.field_t, this.field_D + var5, 0.5, (bi) null));
            }
            this.c((byte) -24, param1);
            return;
          }
          this.field_Kb.field_t = null;
          this.field_Gb.field_t = null;
          var16 = new mb((pm) (this), 2.0, 0.2, 0.0003, lk.field_e[this.field_Zb]);
          var16.field_M.field_w = this.field_C * 2.0;
          var16.field_M.field_m = 192;
          ri.a((rk) (this), param0 - 11878, var16);
          this.field_z = true;
          this.field_A.a((byte) 50, 5000);
          this.field_A.field_J.field_j = true;
          if (this.field_A.field_J.field_o == 3) {
            di.a(param0 ^ -22261, 255, 0);
          }
          if (7 == this.field_A.field_J.field_o) {
            di.a(-30867, 254, 1);
          }
          if (this.field_A.field_J.field_o == 11) {
            di.a(param0 - 42745, 253, 2);
          }
          if (this.field_A.field_J.field_o == 15) {
            di.a(-30867, 252, 3);
          }
          if (this.field_A.field_J.field_o == 19) {
            di.a(-30867, 251, 4);
          }
          if (this.field_A.field_J.field_o == 24) {
            di.a(param0 ^ -22261, 250, 5);
          }
          return;
        }
        if (0 != this.field_Mb) {
          this.field_Mb = this.field_Mb - 1;
        } else {
          this.g(-124, (1 + this.field_Qb) % ee.field_I[this.field_Zb]);
        }
        if (param0 != 11878) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_kc != 0) {
          this.field_kc = this.field_kc - 1;
        } else {
          if (!this.field_Jb &&
            !this.field_dc &&
            !this.field_Rb) {
            if (!(0 >= this.field_Xb)) {
              if ((7 & 1 << this.field_Zb) != 0) {
                this.e(115, -1 + this.field_Xb);
              } else {
                this.e(param0 - 11752, (this.field_Xb + 1) % tf.field_b[this.field_Zb]);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (pi.field_U[this.field_Zb] <= this.field_Xb) {
              if (this.field_Jb) {
                if (this.field_wb == 0) {
                  this.field_Bb = 1;
                  this.field_wb = 6;
                  if (this.field_dc &&
                    this.field_sb == 0) {
                    this.field_sb = 40;
                    this.field_W = 1;
                  }
                } else {
                  if (this.field_dc &&
                    this.field_sb == 0) {
                    this.field_sb = 40;
                    this.field_W = 1;
                  }
                }
              } else {
                if (this.field_dc &&
                  this.field_sb == 0) {
                  this.field_sb = 40;
                  this.field_W = 1;
                }
              }
            } else {
              if (this.field_Xb == 0) {
                var17 = bk.field_j[this.field_Zb];
                var3_ref_bi = var17;
                if (var3_ref_bi != null) {
                  new gk((pm) (this), var17, 0).field_w = 4.0 * this.field_C;
                }
              }
              this.e(114, 1 + this.field_Xb);
            }
          }
        }
        this.a(this.field_bc, this.field_A.field_B, 0.08, this.field_Eb, vl.field_c[this.field_Zb], -105);
        if (!this.field_ac) {
          this.field_S = false;
          if (this.field_Sb <= 0) {
            if (this.field_Ib == 0) {
              this.a(true, param1);
            }
          } else {
            this.field_Sb = this.field_Sb - 1;
            if (this.field_Sb == 0) {
              if (this.field_Ib > 0) {
                var3_int = 0;
                if ((1 & this.field_A.field_J.field_q) != 0) {
                  var3_int += 2;
                }
                if ((2 & this.field_A.field_J.field_q) != 0) {
                  var3_int += 2;
                }
                if ((4 & this.field_A.field_J.field_q) != 0) {
                  var3_int++;
                }
                if ((8 & this.field_A.field_J.field_q) != 0) {
                  var3_int += 4;
                }
                var4 = (int)(Math.random() * (-0.01 + (double)var3_int));
                if (0 == (this.field_A.field_J.field_q & 1)) {
                  var4 += 2;
                }
                if (0 == (2 & this.field_A.field_J.field_q) &&
                  2 <= var4) {
                  var4 += 2;
                }
                if ((this.field_A.field_J.field_q & 4) == 0 &&
                  var4 >= 4) {
                  var4++;
                }
                if (5 > var4) {
                  if (var4 >= 4) {
                    var4 = 2;
                  } else {
                    var4 = (var4 < 2) ? 0 : 1;
                  }
                } else {
                  var4 = 3;
                }
                var5Lifetime1 = this.field_D - this.field_C;
                var7_int = (int)(Math.random() * (double)bf.field_L[var4].length);
                var8 = this.field_A.field_J.a(var5Lifetime1, 0, this.field_E, this.field_t, true, bf.field_L[var4][var7_int], (u) null, this.field_A.field_J.field_o, 583, var4, (rd) null, true, new boolean[]{true});
                for (var9_int = param1; var9_int > 0; var9_int--) {
                  if (this.field_A.field_x.field_r[var9_int] > var5Lifetime1) {
                    continue;
                  }
                  break;
                }
                var8.a((byte) 126, var9_int);
                ri.a((rk) (this), 0, var8);
                this.field_A.field_o = this.field_A.field_o + 1;
                this.field_Sb = 40;
              } else {
                this.a(true, param1);
              }
            }
          }
        } else {
          if (this.field_A.field_B.field_Lb.field_j > this.field_D) {
            this.field_Ib = 0;
            this.field_S = false;
          } else {
            if (this.field_D > this.field_xb * 0.5 + this.field_A.field_B.field_Lb.field_j) {
              if (this.field_Ib > 0) {
                this.field_S = true;
              } else {
                if (!this.field_A.field_B.field_X) {
                  di.a(-30867, 241, 14);
                }
                this.a(true, param1);
              }
            }
          }
        }
        super.a(param0 ^ 0, param1);
        if (this.field_Rb &&
          pi.field_U[this.field_Zb] == this.field_Xb) {
          var3Lifetime1 = this.field_E - this.field_A.field_B.field_E;
          var5Lifetime2 = -this.field_A.field_B.field_t + this.field_t;
          var7Lifetime1 = -this.field_A.field_B.field_D + this.field_D;
          var9Lifetime1 = this.field_xb * 1.5;
          if (var9Lifetime1 * var9Lifetime1 > var7Lifetime1 * var7Lifetime1 + (var5Lifetime2 * var5Lifetime2 + var3Lifetime1 * var3Lifetime1)) {
            var21 = new double[12];
            this.field_Eb.a((byte) 95, var21);
            for (var12 = 0; vl.field_c[this.field_Zb].length > var12; var12 += 3) {
              this.a(false, var21, var12, vl.field_c[this.field_Zb]);
              this.field_ib.field_t = rn.field_c;
              this.field_ib.field_o = ud.field_o;
              this.field_ib.field_p = dh.field_sb;
              var13 = this.field_ic[var12 / 3];
              var13.a(ud.field_o, 16744512, this.field_bc[2 + var12], 0.5, 1.0, dh.field_sb, rn.field_c, this.field_bc[var12], false, this.field_bc[1 + var12]);
              this.field_A.field_b.a((rk) (var13), (byte) 123);
            }
          }
        }
        if (this.field_Ib > 0) {
          this.field_Ib = this.field_Ib - 1;
        }
    }

    final void g(int param0) {
        double var2;
        double var4;
        if (0 == this.field_fc &&
          !of.field_a) {
          this.field_fc = 200;
          this.field_cc.f(128);
          this.field_cc = null;
          this.field_Gb = new gk((pm) (this), ne.field_b, 0);
          this.field_Gb.field_m = 192;
          this.field_Gb.field_w = this.field_C * 2.0;
          this.field_Kb = new gk((pm) (this), ja.field_b[this.field_Zb], 0);
          this.field_Kb.field_w = 2.0 * this.field_C;
          this.field_Kb.field_m = 192;
          if (null != h.field_R) {
            h.field_R.b(ig.field_j[1 + this.field_A.field_J.field_o], 32);
          }
          if (this.field_A.field_J.field_o == 24) {
            this.field_A.field_i = true;
          }
          var2 = -this.field_D + (this.field_A.field_B.field_D + 38.0);
          if (this.field_D < this.field_A.field_B.field_D) {
            var2 = var2 + (this.field_A.field_B.field_D - this.field_D);
          }
          var4 = var2 * 0.006061554119591299;
          if (var4 > this.field_L) {
            this.field_L = var4;
          }
        }
        if (param0 != 26402) {
          this.g(-4, 112);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 < 94) {
          return;
        }
        this.b((byte) -30, param0);
    }

    private final void g(int param0, int param1) {
        this.field_Qb = param1;
        if (param0 > -28) {
          this.field_Yb = 70;
        }
        this.field_Mb = -1 + ee.field_O[this.field_Zb][param1];
        if (this.field_Zb == 2) {
          if (1 == this.field_Qb) {
            new gk((pm) (this), ol.field_c, 0).field_w = 4.0 * this.field_C;
          }
          if (1 == this.field_Qb) {
            new gk((pm) (this), gk.field_q, 0).field_w = this.field_C * 4.0;
          }
        }
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param1 >= -11) {
            var5 = (String) null;
            wc.a((String) null, 26);
          }
          var2_int = param0.charAt(0);
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wc.N(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, ee param1) {
        try {
          if (param1 instanceof dj) {
            this.field_A.field_B.field_X = true;
          }
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final pm h(byte param0) {
        if (param0 <= 15) {
          return (pm) null;
        }
        double[] var4 = new double[12];
        double[] var2 = var4;
        this.field_Eb.a((byte) 26, var4);
        vm var3 = new vm(this.field_A, (ee) (this), var4, vl.field_c[this.field_Zb][this.field_Tb], vl.field_c[this.field_Zb][1 + this.field_Tb], vl.field_c[this.field_Zb][this.field_Tb + 2], this.field_Y, this.field_db);
        this.field_Tb = (3 + this.field_Tb) % vl.field_c[this.field_Zb].length;
        return (pm) ((Object) var3);
    }

    static {
        field_jc = "Connection lost - attempting to reconnect";
    }
}
