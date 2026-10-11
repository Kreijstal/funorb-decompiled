/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends ee {
    static String field_W;
    static int field_gb;
    static String field_Ib;
    da field_jb;
    private da field_Jb;
    int field_yb;
    ek field_Bb;
    tf field_Lb;
    int field_R;
    int field_Hb;
    int field_ib;
    boolean field_mb;
    private int field_Qb;
    boolean field_eb;
    boolean field_Eb;
    boolean field_Sb;
    boolean field_Rb;
    int field_tb;
    int field_ub;
    private kh[] field_Ab;
    h[] field_Nb;
    private double[] field_bb;
    boolean field_cb;
    boolean field_hb;
    int field_Pb;
    boolean field_T;
    private int field_kb;
    private int field_Kb;
    private gk field_wb;
    private gk field_Y;
    boolean field_Ob;
    int field_ab;
    private int field_Z;
    boolean field_rb;
    private gk field_Cb;
    int field_zb;
    private boolean field_Mb;
    boolean field_nb;
    boolean field_sb;
    int field_U;
    boolean field_X;
    int field_Gb;
    double field_Db;
    private gk field_V;
    private int field_Q;
    private hm field_S;
    private gk field_db;
    private int field_fb;
    private int field_lb;
    private oi field_qb;
    private oi field_pb;
    private int field_ob;
    private int field_xb;
    private boolean field_Fb;
    private boolean field_vb;

    final boolean o(int param0) {
        int stackIn_21_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        h var5 = null;
        int var6 = 0;
        int var4Lifetime1;
        var6 = Confined.field_J ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          if (param0 > -84) {
            return true;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= 5))) {
            stackIn_21_0 = var2_int;
            if (var6 == 0) {
              if (stackIn_21_0 == 0 &&
                this.field_Nb[var4] == null) {
                var5 = new h(this.field_A, this, var4);
                ri.a((rk) (this), 0, var5);
                this.field_Nb[var4] = var5;
                var2_int = 1;
              }
              if (null != this.field_Nb[var4]) {
                var3++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = var2_int;
          }
          if (stackIn_21_0 != 0 &&
            var3 == 5) {
            var4Lifetime1 = this.field_A.field_J.field_o;
            if (this.field_A.field_x.field_t > 0 &&
              this.field_A.field_B.field_D < this.field_A.field_x.field_r[this.field_A.field_x.field_t]) {
              var4Lifetime1--;
            }
            if (var4Lifetime1 <= 8) {
              di.a(-30867, 246, 9);
            }
            if (!(var4Lifetime1 <= 8) ||
              var6 != 0) {
              if (12 < var4Lifetime1) {
                if (var4Lifetime1 <= 16) {
                  di.a(-30867, 248, 7);
                  if (var6 != 0) {
                    di.a(-30867, 247, 8);
                  }
                }
              } else {
                di.a(-30867, 247, 8);
              }
            }}
          stackIn_47_0 = var2_int;
          return stackIn_47_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.H(" + param0 + ')');
        }
    }

    dj(hn param0) {
        super(param0, 0.0, 0.0, 5.0, 0.3, 0.1);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_jb = new da();
        this.field_Jb = new da();
        this.field_yb = 2;
        this.field_Bb = new ek((ee) (this), true, false, 8);
        this.field_Lb = new tf((ee) (this));
        this.field_Hb = 65536;
        this.field_Rb = true;
        this.field_R = 0;
        this.field_T = true;
        this.field_cb = false;
        this.field_Kb = 0;
        this.field_ub = -1;
        this.field_Sb = false;
        this.field_Z = 0;
        this.field_bb = new double[12];
        this.field_ib = 0;
        this.field_Pb = 0;
        this.field_Eb = false;
        this.field_rb = false;
        this.field_mb = false;
        this.field_ab = -1;
        this.field_kb = 0;
        this.field_tb = -1;
        this.field_hb = true;
        this.field_Y = null;
        this.field_Qb = 0;
        this.field_eb = false;
        this.field_wb = null;
        this.field_zb = -1;
        this.field_Ob = true;
        this.field_Nb = new h[5];
        this.field_sb = true;
        this.field_nb = true;
        this.field_Mb = false;
        this.field_Gb = 0;
        this.field_U = 0;
        this.field_Ab = new kh[]{new kh((pm) (this), hf.field_T, 0), new kh((pm) (this), hf.field_T, 53), new kh((pm) (this), hf.field_T, 134), new kh((pm) (this), hf.field_T, 231)};
        this.field_Db = 0.0;
        this.field_Q = 0;
        this.field_S = new hm((pm) (this), ki.field_a);
        this.field_fb = 0;
        this.field_lb = 0;
        this.field_qb = new oi((pm) (this));
        this.field_pb = new oi((pm) (this));
        this.field_ob = 0;
        this.field_vb = false;
        this.field_Fb = false;
        try {
          this.field_db = new gk((pm) (this), se.field_a);
          this.field_db.field_m = 0;
          this.field_V = new gk((pm) (this), nm.field_F);
          this.field_V.field_m = 0;
          this.field_Cb = new gk((pm) (this), di.field_a);
          this.field_Cb.field_m = 12;
          this.field_Bb.field_d = 0;
          this.field_L = 0.0;
          this.field_Lb.b(118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("dj.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        if (param0 != -1) {
          return;
        }
        try {
          field_W = null;
          field_Ib = null;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dj.J(" + param0 + ')');
        }
    }

    final static Boolean i(byte param0) {
        Boolean var1 = null;
        RuntimeException var1_ref = null;
        Boolean stackIn_2_0 = null;
        Boolean stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = ca.field_o;
          ca.field_o = null;
          if (param0 >= 106) {
            stackIn_4_0 = var1;
            return stackIn_4_0;
          }
          stackIn_2_0 = (Boolean) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "dj.B(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        Object stackIn_148_0;
        Object stackIn_148_5;
        Object stackIn_150_0;
        int stackIn_150_1;
        cf stackIn_150_2;
        cf stackIn_150_3;
        hn stackIn_150_4;
        Object stackIn_150_5;
        double[] stackIn_150_6;
        double[] stackIn_150_7;
        double stackIn_150_8;
        double stackIn_150_9;
        cf stackIn_151_2 = null;
        cf stackIn_151_3 = null;
        boolean stackIn_151_10 = false;
        Object stackIn_153_0;
        Object stackIn_153_5;
        boolean stackIn_153_11;
        boolean stackIn_154_12 = false;
        int stackIn_157_1 = 0;
        Object stackIn_163_0;
        int stackIn_163_1;
        cf stackIn_163_2;
        cf stackIn_163_3;
        hn stackIn_163_4;
        Object stackIn_163_5;
        double[] stackIn_163_6;
        double[] stackIn_163_7;
        double stackIn_163_8;
        double stackIn_163_9;
        cf stackIn_164_2 = null;
        cf stackIn_164_3 = null;
        boolean stackIn_164_10 = false;
        Object stackIn_166_0;
        Object stackIn_166_5;
        boolean stackIn_166_11;
        boolean stackIn_167_12 = false;
        Object stackIn_169_0;
        int stackIn_169_1;
        cf stackIn_169_2;
        cf stackIn_169_3;
        hn stackIn_169_4;
        Object stackIn_169_5;
        double[] stackIn_169_6;
        double[] stackIn_169_7;
        double stackIn_169_8;
        double stackIn_169_9;
        cf stackIn_170_2 = null;
        cf stackIn_170_3 = null;
        boolean stackIn_170_10 = false;
        Object stackIn_172_0;
        Object stackIn_172_5;
        boolean stackIn_172_11;
        boolean stackIn_173_12 = false;
        Object stackIn_175_0;
        int stackIn_175_1;
        cf stackIn_175_2;
        cf stackIn_175_3;
        hn stackIn_175_4;
        Object stackIn_175_5;
        double[] stackIn_175_6;
        double[] stackIn_175_7;
        double stackIn_175_8;
        double stackIn_175_9;
        cf stackIn_176_2 = null;
        cf stackIn_176_3 = null;
        boolean stackIn_176_10 = false;
        Object stackIn_178_0;
        Object stackIn_178_5;
        boolean stackIn_178_11;
        boolean stackIn_179_12 = false;
        Object stackIn_181_0;
        int stackIn_181_1;
        cf stackIn_181_2;
        cf stackIn_181_3;
        hn stackIn_181_4;
        Object stackIn_181_5;
        double[] stackIn_181_6;
        double[] stackIn_181_7;
        double stackIn_181_8;
        double stackIn_181_9;
        cf stackIn_182_2 = null;
        cf stackIn_182_3 = null;
        boolean stackIn_182_10 = false;
        Object stackIn_184_0;
        Object stackIn_184_5;
        boolean stackIn_184_11;
        Object stackIn_185_0;
        Object stackIn_185_5;
        boolean stackIn_185_12;
        h stackIn_189_0 = null;
        Object stackIn_196_0;
        int stackIn_196_1;
        cf stackIn_196_2;
        cf stackIn_196_3;
        hn stackIn_196_4;
        h stackIn_196_5;
        double[] stackIn_196_6;
        double[] stackIn_196_7;
        double stackIn_196_8;
        double stackIn_196_9;
        cf stackIn_197_2 = null;
        cf stackIn_197_3 = null;
        boolean stackIn_197_10 = false;
        Object stackIn_199_0;
        boolean stackIn_199_11;
        Object stackIn_200_0;
        boolean stackIn_200_12;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        bi stackIn_206_2 = null;
        int stackIn_222_0 = 0;
        Object stackIn_239_0;
        Object stackIn_239_5;
        Object stackIn_241_0;
        int stackIn_241_1;
        wm stackIn_241_2;
        wm stackIn_241_3;
        hn stackIn_241_4;
        Object stackIn_241_5;
        double[] stackIn_241_6;
        double stackIn_241_7;
        wm stackIn_242_2 = null;
        wm stackIn_242_3 = null;
        boolean stackIn_242_8 = false;
        int stackIn_273_0 = 0;
        Object stackIn_296_0;
        Object stackIn_296_5;
        Object stackIn_298_0;
        int stackIn_298_1;
        il stackIn_298_2;
        il stackIn_298_3;
        hn stackIn_298_4;
        Object stackIn_298_5;
        double[] stackIn_298_6;
        double stackIn_298_7;
        il stackIn_299_2 = null;
        il stackIn_299_3 = null;
        boolean stackIn_299_8 = false;
        Object stackIn_340_0 = null;
        Object stackIn_524_0 = null;
        h stackIn_524_1 = null;
        h stackIn_527_0 = null;
        Throwable decompiledCaughtException = null;
        h stackOut_188_0;
        double[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        double var12_double = 0.0;
        int var12 = 0;
        Object var12_ref_Object = null;
        double var13_double = 0.0;
        int var13_int = 0;
        h var13 = null;
        double var14 = 0.0;
        h var14_ref_h = null;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        double var18_double = 0.0;
        int var18 = 0;
        h var19 = null;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        int var32 = 0;
        cf stackIn_151_2Lifetime1;
        cf stackIn_151_3Lifetime1;
        cf stackIn_164_2Lifetime1;
        cf stackIn_164_3Lifetime1;
        cf stackIn_170_2Lifetime1;
        cf stackIn_170_3Lifetime1;
        cf stackIn_176_2Lifetime1;
        cf stackIn_176_3Lifetime1;
        cf stackIn_182_2Lifetime1;
        cf stackIn_182_3Lifetime1;
        cf stackIn_197_2Lifetime1;
        cf stackIn_197_3Lifetime1;
        double var10_doubleLifetime1;
        double var10_doubleLifetime2;
        double var18_doubleLifetime1;
        double var20Lifetime1;
        double var22Lifetime1;
        double var24Lifetime1;
        var32 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_Qb > 0) {
            this.field_Qb = this.field_Qb - 1;
          }
          this.field_Bb.a(this.field_Lb, 3);
          this.field_Hb = this.field_Hb + 1024;
          if (this.field_Hb > 65536) {
            this.field_Hb = 65536;
          }
          if (this.field_kb > 0) {
            this.field_kb = this.field_kb - 1;
          }
          if (this.field_Hb >= 32768) {
            this.field_Mb = false;
          }
          var3 = new double[12];
          this.field_jb.a((byte) 68, var3);
          var4 = 0;
          if (mc.field_e[96]) {
            var4--;
          }
          var5 = 0;
          if (mc.field_e[98]) {
            var5--;
          }
          if (mc.field_e[97]) {
            var4++;
          }
          if (mc.field_e[99]) {
            var5++;
          }
          if (mk.field_l) {
            var5 = -var5;
          }
          boolean decompiledFrameRemainder2 = true;
          var6 = (double)var4;
          var8 = (double)var5;
          if (this.field_A.field_M) {
            if (this.field_A.field_y ||
              null != this.field_A.field_K ||
              0 == (var5 | var4) &&
              rh.field_X == 0) {
              if (this.field_A.field_x.field_a < 2) {
                var8 = 0.0;
                var6 = 0.0;
                decompiledFrameRemainder2 = (var32 != 0);
              }
              if (decompiledFrameRemainder2) {
                this.field_A.field_x.b(3, param1, this.field_D + 2.0);
                var10_double = -this.field_A.field_x.field_B + this.field_E;
                var12_double = this.field_t - this.field_A.field_x.field_G;
                var14 = Math.sqrt(-(var3[5] * var3[5]) + 1.0);
                var16 = var3[3] / var14;
                var18_double = var3[4] / var14;
                var20 = Math.sqrt(1.0 - var3[8] * var3[8]);
                var22 = var3[6] / var20;
                var24 = var3[7] / var20;
                var26 = var12_double * var18_double + var10_double * var16;
                var28 = var12_double * var24 + var10_double * var22;
                var6 = -var26;
                var8 = -var28;
                if (-1.0 > var6) {
                  var6 = -1.0;
                }
                if (var6 > 1.0) {
                  var6 = 1.0;
                }
                if (var8 < -1.0) {
                  var8 = -1.0;
                }
                if (var8 > 1.0) {
                  var8 = 1.0;
                }
                if (var32 != 0) {
                  this.field_A.field_M = false;
                }
              }
            } else {
              this.field_A.field_M = false;
            }
          }
          if (!this.field_A.field_M) {
            if (0 != rh.field_X) {
              if (this.field_vb) {
                this.field_Fb = true;
                if (var32 != 0) {
                  this.field_vb = true;
                }
              } else {
                this.field_vb = true;
              }
            }
            if (0 != var4 ||
              var5 != 0) {
              this.field_vb = false;
            }
            if (this.field_vb && (-1 != ld.field_l ||
              b.field_f != 0)) {
              var10_doubleLifetime1 = 320.0;
              var12_double = 188.0;
              if (!qc.field_n) {
                var14 = -this.field_A.field_m.field_T + this.field_E;
                var16 = -this.field_A.field_m.field_L + this.field_t;
                var18_doubleLifetime1 = this.field_D - this.field_A.field_m.field_O;
                var20Lifetime1 = this.field_A.field_m.field_M * var18_doubleLifetime1 + (this.field_A.field_m.field_R * var14 + this.field_A.field_m.field_ab * var16);
                var22Lifetime1 = var16 * this.field_A.field_m.field_U + this.field_A.field_m.field_V * var14 + this.field_A.field_m.field_F * var18_doubleLifetime1;
                var24Lifetime1 = this.field_A.field_m.field_P * var14 + this.field_A.field_m.field_H * var16 + this.field_A.field_m.field_N * var18_doubleLifetime1;
                if (var24Lifetime1 >= 0.01) {
                  var10_doubleLifetime1 = 320.0 + 640.0 * (var20Lifetime1 / var24Lifetime1);
                  var12_double = 188.0 + 640.0 * (var22Lifetime1 / var24Lifetime1);
                }
                if (var32 != 0) {
                  var10_doubleLifetime1 = var10_doubleLifetime1 + (this.field_L * var3[5] + (var3[4] * this.field_G + var3[3] * this.field_K)) * 1280.0;
                  var12_double = var12_double + (this.field_L * var3[8] + (this.field_G * var3[7] + var3[6] * this.field_K)) * 1280.0;
                }
              } else {
                var10_doubleLifetime1 = var10_doubleLifetime1 + (this.field_L * var3[5] + (var3[4] * this.field_G + var3[3] * this.field_K)) * 1280.0;
                var12_double = var12_double + (this.field_L * var3[8] + (this.field_G * var3[7] + var3[6] * this.field_K)) * 1280.0;
              }
              var6 = ((double)ld.field_l - var10_doubleLifetime1) * 0.02127659574468085;
              var8 = 0.02127659574468085 * ((double)jh.field_R - var12_double);
              if (var6 < -1.0) {
                var8 = var8 / -var6;
                var6 = -1.0;
              }
              if (1.0 < var6) {
                var8 = var8 / var6;
                var6 = 1.0;
              }
              if (var8 < -1.0) {
                var6 = var6 / -var8;
                var8 = -1.0;
              }
              if (var8 > 1.0) {
                var6 = var6 / var8;
                var8 = 1.0;
              }
            }
          }
          if (var6 != 0.0) {
            this.field_G = this.field_G + var6 * 0.005 * var3[4];
            this.field_L = this.field_L + var3[5] * (0.005 * var6);
            this.field_K = this.field_K + var3[3] * (var6 * 0.005);
            hd.field_e.a(var6 * 0.001, var3[8], var3[6], var3[7], 7);
            this.field_Jb.a(-117, hd.field_e);
          }
          if (var8 != 0.0) {
            this.field_L = this.field_L + var3[8] * (0.005 * var8);
            this.field_G = this.field_G + var8 * 0.005 * var3[7];
            this.field_K = this.field_K + 0.005 * var8 * var3[6];
            hd.field_e.a(-0.001 * var8, var3[5], var3[3], var3[4], 7);
            this.field_Jb.a(param0 - 11895, hd.field_e);
          }
          this.field_Jb.a(0.9, (byte) -65);
          this.field_jb.a(-84, this.field_Jb);
          this.field_jb.a((byte) 27, var3);
          if (var3[11] < 0.8660254037844386) {
            var10_doubleLifetime2 = Math.sqrt(-(var3[11] * var3[11]) + 1.0);
            var12_double = var3[10] / var10_doubleLifetime2;
            var14 = -var3[9] / var10_doubleLifetime2;
            var16 = -Math.asin(var3[11]) + 1.0471975511965976;
            hd.field_e.a(var16, 0.0, var12_double, var14, 7);
            this.field_jb.a(-33, hd.field_e);
            this.field_jb.a((byte) 75, var3);
          }
          this.field_G = (this.field_G + 0.01 * var3[10]) * 0.95;
          this.field_L = (this.field_L + var3[11] * 0.01) * 0.95;
          this.field_K = (this.field_K + var3[9] * 0.01) * 0.95;
          super.a(param0, param1);
          this.field_Lb.c(16777215);
          var10 = mc.field_e[82] ? 1 : 0;
          if (!this.field_vb ||
            !this.field_Fb ||
            b.field_f == 0) {
            this.field_Fb = false;
            if (var32 != 0) {
              var10 = 1;
            }
          } else {
            var10 = 1;
          }
          L35: {
            if (!this.field_A.field_M &&
              !this.field_Mb &&
              var10 != 0 &&
              0 == this.field_kb) {
              var11 = 5120;
              if (this.field_Hb >= var11) {
                this.field_A.field_v = true;
                this.field_A.field_t = true;
                this.field_Lb.b(118);
                stackIn_150_0 = this;
                stackIn_150_1 = 0;
                stackIn_150_2 = null;
                stackIn_150_3 = null;
                stackIn_150_4 = this.field_A;
                stackIn_150_5 = this;
                stackIn_150_6 = var3;
                stackIn_150_7 = me.field_J;
                stackIn_150_8 = 0.0;
                stackIn_150_9 = 0.0;
                if (0 >= this.field_Pb) {
                  stackIn_151_2 = null;
                  stackIn_151_3 = null;
                  stackIn_151_10 = false;
                } else {
                  stackIn_148_0 = this;
                  stackIn_148_5 = this;
                  stackIn_151_2 = null;
                  stackIn_151_3 = null;
                  stackIn_151_10 = true;
                }
                stackIn_153_0 = this;
                stackIn_153_5 = this;
                stackIn_153_11 = this.field_Eb;
                if (this.field_U <= 0) {
                  stackIn_151_2Lifetime1 = null;
                  stackIn_151_3Lifetime1 = null;
                  stackIn_154_12 = false;
                } else {
                  stackIn_151_2Lifetime1 = null;
                  stackIn_151_3Lifetime1 = null;
                  stackIn_154_12 = true;
                }
                ri.a((rk) (this), stackIn_150_1, new cf(stackIn_150_4, (ee) (this), stackIn_150_6, stackIn_150_7, stackIn_150_8, stackIn_150_9, stackIn_151_10, stackIn_153_11, stackIn_154_12));
                if (this.field_mb) {
                  stackIn_157_1 = 3;
                } else {
                  stackIn_157_1 = 12;
                }
                this.field_kb = stackIn_157_1;
                var12 = 4;
                if (this.field_Eb) {
                  var13_double = (double)this.field_Z * 0.09817477042468103;
                  var15 = Math.sin(var13_double);
                  var17 = Math.cos(var13_double);
                  stackIn_163_0 = this;
                  stackIn_163_1 = param0 ^ 11878;
                  stackIn_163_2 = null;
                  stackIn_163_3 = null;
                  stackIn_163_4 = this.field_A;
                  stackIn_163_5 = this;
                  stackIn_163_6 = var3;
                  stackIn_163_7 = me.field_J;
                  stackIn_163_8 = -0.04 * var17;
                  stackIn_163_9 = -0.04 * var15;
                  if (0 >= this.field_Pb) {
                    stackIn_164_2 = null;
                    stackIn_164_3 = null;
                    stackIn_164_10 = false;
                  } else {
                    stackIn_164_2 = null;
                    stackIn_164_3 = null;
                    stackIn_164_10 = true;
                  }
                  stackIn_166_0 = this;
                  stackIn_166_5 = this;
                  stackIn_166_11 = true;
                  if (this.field_U <= 0) {
                    stackIn_164_2Lifetime1 = null;
                    stackIn_164_3Lifetime1 = null;
                    stackIn_167_12 = false;
                  } else {
                    stackIn_164_2Lifetime1 = null;
                    stackIn_164_3Lifetime1 = null;
                    stackIn_167_12 = true;
                  }
                  ri.a((rk) (this), stackIn_163_1, new cf(stackIn_163_4, (ee) (this), stackIn_163_6, stackIn_163_7, stackIn_163_8, stackIn_163_9, stackIn_164_10, stackIn_166_11, stackIn_167_12));
                  stackIn_169_0 = this;
                  stackIn_169_1 = 0;
                  stackIn_169_2 = null;
                  stackIn_169_3 = null;
                  stackIn_169_4 = this.field_A;
                  stackIn_169_5 = this;
                  stackIn_169_6 = var3;
                  stackIn_169_7 = me.field_J;
                  stackIn_169_8 = -0.02 * var17;
                  stackIn_169_9 = var15 * -0.02;
                  if (this.field_Pb <= 0) {
                    stackIn_170_2 = null;
                    stackIn_170_3 = null;
                    stackIn_170_10 = false;
                  } else {
                    stackIn_170_2 = null;
                    stackIn_170_3 = null;
                    stackIn_170_10 = true;
                  }
                  stackIn_172_0 = this;
                  stackIn_172_5 = this;
                  stackIn_172_11 = true;
                  if (this.field_U <= 0) {
                    stackIn_170_2Lifetime1 = null;
                    stackIn_170_3Lifetime1 = null;
                    stackIn_173_12 = false;
                  } else {
                    stackIn_170_2Lifetime1 = null;
                    stackIn_170_3Lifetime1 = null;
                    stackIn_173_12 = true;
                  }
                  ri.a((rk) (this), stackIn_169_1, new cf(stackIn_169_4, (ee) (this), stackIn_169_6, stackIn_169_7, stackIn_169_8, stackIn_169_9, stackIn_170_10, stackIn_172_11, stackIn_173_12));
                  stackIn_175_0 = this;
                  stackIn_175_1 = 0;
                  stackIn_175_2 = null;
                  stackIn_175_3 = null;
                  stackIn_175_4 = this.field_A;
                  stackIn_175_5 = this;
                  stackIn_175_6 = var3;
                  stackIn_175_7 = me.field_J;
                  stackIn_175_8 = 0.02 * var17;
                  stackIn_175_9 = 0.02 * var15;
                  if (this.field_Pb <= 0) {
                    stackIn_176_2 = null;
                    stackIn_176_3 = null;
                    stackIn_176_10 = false;
                  } else {
                    stackIn_176_2 = null;
                    stackIn_176_3 = null;
                    stackIn_176_10 = true;
                  }
                  stackIn_178_0 = this;
                  stackIn_178_5 = this;
                  stackIn_178_11 = true;
                  if (this.field_U <= 0) {
                    stackIn_176_2Lifetime1 = null;
                    stackIn_176_3Lifetime1 = null;
                    stackIn_179_12 = false;
                  } else {
                    stackIn_176_2Lifetime1 = null;
                    stackIn_176_3Lifetime1 = null;
                    stackIn_179_12 = true;
                  }
                  ri.a((rk) (this), stackIn_175_1, new cf(stackIn_175_4, (ee) (this), stackIn_175_6, stackIn_175_7, stackIn_175_8, stackIn_175_9, stackIn_176_10, stackIn_178_11, stackIn_179_12));
                  stackIn_181_0 = this;
                  stackIn_181_1 = 0;
                  stackIn_181_2 = null;
                  stackIn_181_3 = null;
                  stackIn_181_4 = this.field_A;
                  stackIn_181_5 = this;
                  stackIn_181_6 = var3;
                  stackIn_181_7 = me.field_J;
                  stackIn_181_8 = var17 * 0.04;
                  stackIn_181_9 = 0.04 * var15;
                  if (0 >= this.field_Pb) {
                    stackIn_182_2 = null;
                    stackIn_182_3 = null;
                    stackIn_182_10 = false;
                  } else {
                    stackIn_182_2 = null;
                    stackIn_182_3 = null;
                    stackIn_182_10 = true;
                  }
                  stackIn_184_0 = this;
                  stackIn_184_5 = this;
                  stackIn_184_11 = true;
                  if (this.field_U <= 0) {
                    stackIn_185_0 = this;
                    stackIn_182_2Lifetime1 = null;
                    stackIn_182_3Lifetime1 = null;
                    stackIn_185_5 = this;
                    stackIn_185_12 = false;
                  } else {
                    stackIn_185_0 = this;
                    stackIn_182_2Lifetime1 = null;
                    stackIn_182_3Lifetime1 = null;
                    stackIn_185_5 = this;
                    stackIn_185_12 = true;
                  }
                  ri.a((rk) (this), stackIn_181_1, new cf(stackIn_181_4, (ee) (this), stackIn_181_6, stackIn_181_7, stackIn_181_8, stackIn_181_9, stackIn_182_10, stackIn_184_11, stackIn_185_12));
                  this.field_Z = 63 & this.field_Z + this.field_kb;
                  var12 += 4;
                }
                var13_int = 0;
                while (5 > var13_int) {
                  var14_ref_h = this.field_Nb[var13_int];
                  stackOut_188_0 = var14_ref_h;
                  stackIn_340_0 = stackOut_188_0;
                  stackIn_189_0 = stackOut_188_0;
                  if (var32 != 0) {
                    break L35;
                  }
                  if (stackIn_189_0 != null) {
                    var14_ref_h.field_Z.b(118);
                    var12++;
                    stackIn_196_0 = this;
                    stackIn_196_1 = 0;
                    stackIn_196_2 = null;
                    stackIn_196_3 = null;
                    stackIn_196_4 = this.field_A;
                    stackIn_196_5 = var14_ref_h;
                    stackIn_196_6 = var3;
                    stackIn_196_7 = og.field_g;
                    stackIn_196_8 = 0.0;
                    stackIn_196_9 = 0.0;
                    if (this.field_Pb <= 0) {
                      stackIn_197_2 = null;
                      stackIn_197_3 = null;
                      stackIn_197_10 = false;
                    } else {
                      stackIn_197_2 = null;
                      stackIn_197_3 = null;
                      stackIn_197_10 = true;
                    }
                    stackIn_199_0 = this;
                    stackIn_199_11 = false;
                    if (0 >= this.field_U) {
                      stackIn_200_0 = this;
                      stackIn_197_2Lifetime1 = null;
                      stackIn_197_3Lifetime1 = null;
                      stackIn_200_12 = false;
                    } else {
                      stackIn_200_0 = this;
                      stackIn_197_2Lifetime1 = null;
                      stackIn_197_3Lifetime1 = null;
                      stackIn_200_12 = true;
                    }
                    ri.a((rk) (this), stackIn_196_1, new cf(stackIn_196_4, stackIn_196_5, stackIn_196_6, stackIn_196_7, stackIn_196_8, stackIn_196_9, stackIn_197_10, stackIn_199_11, stackIn_200_12));
                  }
                  var13_int++;
                }
                this.field_Hb = this.field_Hb - var11;
                stackIn_205_0 = (int)(24.0 * Math.sqrt((double)var12));
                stackIn_205_1 = 0;
                if (this.field_U <= 0) {
                  stackIn_206_2 = d.field_g;
                } else {
                  stackIn_206_2 = qj.field_b;
                }
                da.a(stackIn_205_0, stackIn_205_1, stackIn_206_2, true, (pm) (this));
                if (var32 != 0) {
                  this.field_Mb = true;
                }
              } else {
                this.field_Mb = true;
              }
            }
            if (this.field_cb &&
              !this.field_A.field_M &&
              !this.field_Mb &&
              mc.field_e[ql.field_u]) {
              stackIn_222_0 = 1;
            } else {
              stackIn_222_0 = 0;
            }
            var11 = stackIn_222_0;
            if (var11 == 0 ||
              this.field_Hb < 2048) {
              if (var11 != 0) {
                this.field_Mb = true;
              }
              if (this.field_cb &&
                16 <= this.field_fb) {
                this.field_A.field_t = true;
                this.field_A.field_v = true;
                this.field_Lb.b(118);
                stackIn_241_0 = this;
                stackIn_241_1 = 0;
                stackIn_241_2 = null;
                stackIn_241_3 = null;
                stackIn_241_4 = this.field_A;
                stackIn_241_5 = this;
                stackIn_241_6 = var3;
                stackIn_241_7 = 0.015625 * (double)this.field_fb;
                if (0 >= this.field_Pb) {
                  stackIn_242_2 = null;
                  stackIn_242_3 = null;
                  stackIn_242_8 = false;
                } else {
                  stackIn_239_0 = this;
                  stackIn_239_5 = this;
                  stackIn_242_2 = null;
                  stackIn_242_3 = null;
                  stackIn_242_8 = true;
                }
                ri.a((rk) (this), stackIn_241_1, new wm(stackIn_241_4, this, stackIn_241_6, stackIn_241_7, stackIn_242_8));
                this.field_fb = 0;
                if (var32 != 0 &&
                  0 < this.field_fb) {
                  this.field_fb = this.field_fb - 1;
                }
              } else {
                if (0 < this.field_fb) {
                  this.field_fb = this.field_fb - 1;
                }
              }
              if (null != this.field_wb) {
                var12_ref_Object = cb.field_a;
                synchronized (var12_ref_Object) {
                  this.field_wb.field_n.b(true);
                  this.field_wb.field_n.c(0);
                }
                this.field_wb = null;
                if (var32 != 0) {
                  this.field_fb = this.field_fb + 1;
                  this.field_Hb = this.field_Hb - 2048;
                  if (null == this.field_wb) {
                    this.field_wb = new gk((pm) (this), sf.field_p, 1, true);
                  }
                }
              }
            } else {
              this.field_fb = this.field_fb + 1;
              this.field_Hb = this.field_Hb - 2048;
              if (null == this.field_wb) {
                this.field_wb = new gk((pm) (this), sf.field_p, 1, true);
              }
            }
            if (this.field_eb &&
              !this.field_A.field_M &&
              !this.field_Mb &&
              mc.field_e[nl.field_b]) {
              stackIn_273_0 = 1;
            } else {
              stackIn_273_0 = 0;
            }
            L68: {
              var11 = stackIn_273_0;
              if (var11 != 0 &&
                this.field_Hb >= 2048) {
                this.field_Hb = this.field_Hb - 2048;
                this.field_lb = this.field_lb + 1;
                if (null != this.field_Y) {
                  break L68;
                }
                this.field_Y = new gk((pm) (this), th.field_bb, 1, true);
                if (var32 == 0) {
                  break L68;
                }
              }
              if (var11 != 0) {
                this.field_Mb = true;
              }
              if (this.field_eb &&
                this.field_lb >= 16) {
                this.field_A.field_v = true;
                this.field_A.field_t = true;
                this.field_Lb.b(118);
                stackIn_298_0 = this;
                stackIn_298_1 = 0;
                stackIn_298_2 = null;
                stackIn_298_3 = null;
                stackIn_298_4 = this.field_A;
                stackIn_298_5 = this;
                stackIn_298_6 = var3;
                stackIn_298_7 = (double)this.field_lb * 0.015625;
                if (this.field_Pb <= 0) {
                  stackIn_299_2 = null;
                  stackIn_299_3 = null;
                  stackIn_299_8 = false;
                } else {
                  stackIn_296_0 = this;
                  stackIn_296_5 = this;
                  stackIn_299_2 = null;
                  stackIn_299_3 = null;
                  stackIn_299_8 = true;
                }
                ri.a((rk) (this), stackIn_298_1, new il(stackIn_298_4, this, stackIn_298_6, stackIn_298_7, stackIn_299_8));
                this.field_lb = 0;
                if (var32 != 0 &&
                  this.field_lb > 0) {
                  this.field_lb = this.field_lb - 1;
                }
              } else {
                if (this.field_lb > 0) {
                  this.field_lb = this.field_lb - 1;
                }
              }
              if (null != this.field_Y) {
                var12_ref_Object = cb.field_a;
                synchronized (var12_ref_Object) {
                  this.field_Y.field_n.b(true);
                  this.field_Y.field_n.c(0);
                }
                this.field_Y = null;
              }
            }
            if (!this.field_Sb ||
              this.field_A.field_M ||
              this.field_Mb ||
              !mc.field_e[ln.field_b]) {
              if (!(this.field_Q <= 0)) {
                this.field_Q = this.field_Q - 1;
                if (var32 != 0) {
                  if (this.field_Hb < 2048) {
                    this.field_Q = this.field_Q - 1;
                    this.field_Mb = true;
                    this.field_A.field_v = true;
                    this.field_A.field_t = true;
                    this.field_Q = 8;
                  } else {
                    this.field_A.field_v = true;
                    this.field_A.field_t = true;
                    this.field_Q = 8;
                  }
                }
              }
            } else {
              if (this.field_Hb < 2048) {
                this.field_Q = this.field_Q - 1;
                this.field_Mb = true;
                if (var32 != 0) {
                  this.field_A.field_v = true;
                  this.field_A.field_t = true;
                  this.field_Q = 8;
                }
              } else {
                this.field_A.field_v = true;
                this.field_A.field_t = true;
                this.field_Q = 8;
              }
            }
            if (this.field_Pb <= 0) {
              stackIn_340_0 = null;
            } else {
              stackIn_340_0 = this.a(var3[9], var3[10], var3[11], false);
            }
          }
          L80: {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameCompleted3 = true;
            var11_ref = stackIn_340_0;
            if (null != var11_ref) {
              this.a(this.field_bb, (pm) (var11_ref), 0.2, this.field_jb, ac.field_c, -115);
              var12 = 0;
              while (var12 < 5) {
                var13 = this.field_Nb[var12];
                if (var32 != 0) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
                if (var13 != null) {
                  this.a(var13.field_T, (pm) (var11_ref), 0.2, this.field_jb, og.field_g, param0 ^ 11780);
                }
                var12++;
              }
              if (decompiledFrameCompleted3) {
                decompiledFrameRemainder3 = (var32 != 0);
              }
            }
            if ((decompiledFrameRemainder3) &&
              (decompiledFrameCompleted3)) {
              var12 = 0;
              do {
                if (this.field_bb.length <= var12) {
                  var12 = 0;
                  break;
                }
                this.field_bb[var12] = var3[9];
                this.field_bb[1 + var12] = var3[10];
                this.field_bb[var12 + 2] = var3[11];
                var12 += 3;
              } while (var32 == 0);
              while (var12 < 5) {
                var13 = this.field_Nb[var12];
                if (var32 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (null != var13) {
                  var13.field_T[2] = var3[11];
                  var13.field_T[0] = var3[9];
                  var13.field_T[1] = var3[10];
                }
                var12++;
              }
            }
            if (decompiledFrameCompleted2) {
              if (this.field_Q > 0) {
                this.field_Lb.b(118);
                this.field_Hb = this.field_Hb - 256 * this.field_Q;
                if (this.field_Hb < 0) {
                  this.field_Hb = 0;
                  this.field_Mb = true;
                }
                var11 = -1610547456 & 32768 * this.field_Q >>> 3 | (this.field_Q * 4194559 & 133695480) >>> 3;
                var12_double = (double)(this.field_Q / 8);
                var14 = 1.0 * var12_double;
                var16 = var12_double;
                var18 = 0;
                do {
                  if (var18 >= 4) {
                    var18 = 0;
                    break;
                  }
                  this.a(false, var3, var18 * 3, ac.field_c);
                  this.field_Ab[var18].a(ud.field_o, var11, this.field_bb[2 + var18 * 3], var14, var16, dh.field_sb, rn.field_c, this.field_bb[var18 * 3], false, this.field_bb[1 + 3 * var18]);
                  this.field_Ab[var18].field_Q.field_m = this.field_Q * 96 >> 3;
                  this.field_A.field_b.a((rk) (this.field_Ab[var18]), (byte) -64);
                  var18++;
                } while (var32 == 0);
                while (var18 < 5) {
                  var19 = this.field_Nb[var18];
                  stackIn_527_0 = var19;
                  if (var32 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_527_0 != null) {
                    var19.field_Z.b(param0 ^ 11792);
                    var19.a(false, var3, 0, og.field_g);
                    var19.field_Q.a(ud.field_o, var11, var19.field_T[2], var14, var12_double, dh.field_sb, rn.field_c, var19.field_T[0], false, var19.field_T[1]);
                    if (null != var19.field_Q.field_Q) {
                      var19.field_Q.field_Q.field_m = this.field_Q * 96 >> 3;
                    }
                    this.field_A.field_b.a((rk) (var19.field_Q), (byte) 79);
                  }
                  var18++;
                }
              }
              if (decompiledFrameCompleted1) {
                this.field_Db = this.field_Db * 0.92;
                this.field_db.field_m = 0;
              }
            }
            if (decompiledFrameCompleted1) {
              boolean decompiledFrameRemainder1 = true;
              if (this.field_rb &&
                !this.field_A.field_M &&
                !this.field_Mb &&
                mc.field_e[oc.field_e]) {
                this.field_Hb = this.field_Hb - 2048;
                if (0 > this.field_Hb) {
                  this.field_Mb = true;
                  this.field_Hb = 0;
                  decompiledFrameRemainder1 = (var32 != 0);
                }
                if (decompiledFrameRemainder1) {
                  this.field_db.field_m = 48;
                  var11 = 0;
                  this.field_S.a(12607743, 0, 50.0, 8.0);
                  if (this.field_S.a((hm[]) null, false, 10.0)) {
                    this.field_A.field_t = true;
                    var11 += 4;
                    this.field_Lb.b(118);
                    this.field_S.field_Q.field_m = 48;
                    this.field_A.field_F.a((rk) (this.field_S), (byte) 116);
                  }
                  var12 = 0;
                  while (var12 < 5) {
                    var13 = this.field_Nb[var12];
                    stackIn_527_0 = var13;
                    if (var32 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_527_0 != null) {
                      var13.field_X.a(12607743, param0 ^ 11878, 50.0, 8.0);
                      if (var13.field_X.a((hm[]) null, false, 3.0)) {
                        var13.field_X.field_Q.field_m = 32;
                        this.field_A.field_t = true;
                        this.field_A.field_F.a((rk) (var13.field_X), (byte) -95);
                        var13.field_Z.b(118);
                        var11++;
                      }
                    }
                    var12++;
                  }
                  if (decompiledFrameCompleted0) {
                    this.field_Db = this.field_Db + (double)var11;
                  }
                }
              }
              if (decompiledFrameCompleted0) {
                boolean decompiledFrameRemainder0 = true;
                this.field_V.field_m = (int)(8.0 * Math.sqrt(this.field_Db));
                if (this.field_ob == 0) {
                  if (this.field_ub <= 0 ||
                    this.field_A.field_M ||
                    !mc.field_e[ja.field_d]) {
                    if (0 >= this.field_tb ||
                      this.field_A.field_M ||
                      !mc.field_e[ib.field_W]) {
                      if ((this.field_zb <= 0 ||
                        this.field_A.field_M ||
                        !mc.field_e[vf.field_l]) &&
                        (decompiledFrameRemainder0 = !(this.field_ab <= 0)) &&
                        (decompiledFrameRemainder0 = !(this.field_A.field_M)) &&
                        (decompiledFrameRemainder0 = !(!mc.field_e[sb.field_f])) &&
                        (decompiledFrameRemainder0 = !(this.field_A.field_P)) &&
                        (decompiledFrameRemainder0 = (0 == this.field_A.field_L))) {
                        this.field_Lb.b(118);
                        ri.a((rk) (this), 0, new gi(this.field_A, this));
                        this.field_ob = 16;
                        this.field_A.field_P = true;
                        this.field_ab = this.field_ab - 1;
                        decompiledFrameRemainder0 = (var32 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        this.field_Lb.b(118);
                        ri.a((rk) (this), 0, new ik(this.field_A, this));
                        this.field_zb = this.field_zb - 1;
                        this.field_ob = 16;
                        decompiledFrameRemainder0 = (var32 != 0);
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      this.field_Lb.b(118);
                      ri.a((rk) (this), 0, new gm(this.field_A, this));
                      this.field_tb = this.field_tb - 1;
                      this.field_ob = 16;
                      if (var32 != 0) {
                        this.field_Lb.b(118);
                        ri.a((rk) (this), 0, new th(this.field_A, this));
                        this.field_ob = 16;
                        this.field_ub = this.field_ub - 1;
                        this.field_ob = this.field_ob - 1;
                      }
                    }
                  } else {
                    this.field_Lb.b(118);
                    ri.a((rk) (this), 0, new th(this.field_A, this));
                    this.field_ob = 16;
                    this.field_ub = this.field_ub - 1;
                    if (var32 != 0) {
                      this.field_ob = this.field_ob - 1;
                    }
                  }
                } else {
                  this.field_ob = this.field_ob - 1;
                }
                if (0 < this.field_U) {
                  this.field_U = this.field_U - 1;
                }
                if (0 < this.field_Pb) {
                  this.field_Pb = this.field_Pb - 1;
                }
                if (0 < this.field_ib) {
                  this.field_ib = this.field_ib - 1;
                  if (this.field_ib == 0) {
                    this.field_Bb.field_l = false;
                    var11 = 0;
                    while (var11 < 5) {
                      stackIn_524_0 = null;
                      stackIn_524_1 = this.field_Nb[var11];
                      if (var32 == 0) {
                        if (stackIn_524_0 != stackIn_524_1) {
                          this.field_Nb[var11].field_ab.field_l = false;
                        }
                        var11++;
                        continue;
                      }
                      while (true) {
                        if (stackIn_524_0 != stackIn_524_1) {
                          stackIn_527_0 = this.field_Nb[var11];
                          ((tf) (Object) stackIn_527_0.field_Z).b(118);
                        }
                        var11++;
                        break L80;
                      }
                    }
                  }
                }
                if (this.field_Gb > 0) {
                  this.field_Gb = this.field_Gb - 1;
                }
                if (this.field_Gb > 0) {
                  if (256 > this.field_Kb) {
                    this.field_Kb = this.field_Kb + 16;
                    if (var32 != 0 &&
                      this.field_Kb > 0) {
                      this.field_Kb = this.field_Kb - 16;
                    }
                  }
                } else {
                  if (this.field_Kb > 0) {
                    this.field_Kb = this.field_Kb - 16;
                  }
                }
                if (!(128 <= this.field_Kb)) {
                  this.field_Lb.b(param0 ^ 11792);
                  var11 = 0;
                  while (var11 < 5) {
                    if (var32 != 0) {
                      return;
                    }
                    stackIn_524_0 = null;
                    stackIn_524_1 = this.field_Nb[var11];
                    if (stackIn_524_0 != stackIn_524_1) {
                      stackIn_527_0 = this.field_Nb[var11];
                      ((tf) (Object) stackIn_527_0.field_Z).b(118);
                    }
                    var11++;
                  }
                }
                break L80;
              }
            }
            while (true) {
              ((tf) (Object) stackIn_527_0.field_Z).b(118);
              do {
                var11++;
                if (var32 != 0) {
                  break L80;
                }
                if (var11 >= 5) {
                  break L80;
                }
                stackIn_524_0 = null;
                stackIn_524_1 = this.field_Nb[var11];
              } while (stackIn_524_0 == stackIn_524_1);
              stackIn_527_0 = this.field_Nb[var11];
            }
          }
          if (this.field_R > 0) {
            this.field_R = this.field_R - 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3_ref), "dj.S(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 8) {
            this.a(-87, -78);
          }
          stackIn_10_0 = (this.field_A.field_K == null) || !(this.field_A.field_x.field_r[-1 + this.field_A.field_x.field_a] < this.field_D);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.JA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException runtimeException = null;
        ka var2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        try {
          this.field_A.field_m.m(10959);
          this.field_A.field_m.field_D = this.field_A.field_m.field_O;
          this.field_A.field_m.field_E = this.field_A.field_m.field_T;
          this.field_A.field_m.field_t = this.field_A.field_m.field_L;
          this.field_A.field_m.field_X = new da(this.field_A.field_m.field_W);
          var2 = this.a((byte) 107, ri.field_b, 2.0);
          var2.field_M.field_w = this.field_C * 2.0;
          this.m(-1);
          this.h((byte) 94);
          this.d(false);
          if (this.field_A.field_L > 0) {
            var3 = this.field_A.field_A * this.field_A.field_A;
            var5 = this.field_E - this.field_A.field_s;
            var7 = this.field_t - this.field_A.field_r;
            var9 = -this.field_A.field_E + this.field_D;
            var11 = var7 * var7 + var5 * var5 + var9 * var9;
            if (var11 <= var3) {
              di.a(-30867, 245, 10);
            }
          }
          if (param0 != 26402) {
            this.field_Sb = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "dj.PA(" + param0 + ')');
        }
    }

    final void a(double param0, byte param1, double param2, double param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_Lb.a(param0, param3, param2, 47);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dj.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(mn param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var3 = null;
        RuntimeException var3_ref = null;
        double[] var3Lifetime1;
        try {
          if (this.field_fb >= 16) {
            var3 = new double[12];
            this.field_jb.a((byte) 47, var3);
            ak.a((double)this.field_fb * 0.015625, var3, this, 4825, this.field_qb, param0);
          }
          if (this.field_lb >= 16) {
            var3Lifetime1 = new double[12];
            this.field_jb.a((byte) 34, var3Lifetime1);
            rf.a(param0, 0.015625 * (double)this.field_lb, this.field_pb, this, var3Lifetime1, false);
          }
          this.field_Bb.a(-96, param0);
          var3_int = 81 % ((param1 + 2) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("dj.OA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean l(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          var2_int = 29 / ((60 - param0) / 61);
          var3 = 0;
          while (var3 < 5) {
            if (null == this.field_Nb[var3]) {
              return true;
            }
            var3++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.K(" + param0 + ')');
        }
    }

    final double a(int param0, boolean param1, double param2) {
        RuntimeException var5 = null;
        double stackIn_13_0 = 0.0;
        double stackIn_15_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 14170) {
            this.a((pm) null, 126);
          }
          if (!this.field_A.field_y &&
            !this.field_A.field_i &&
            this.field_Qb == 0) {
            stackIn_13_0 = this.field_Bb.a(0, true, param1, param2);
            return stackIn_13_0;
          }
          stackIn_15_0 = 0.0;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var5), "dj.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(boolean param0) {
        int fieldTemp$0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var2_intLifetime1;
        var9 = Confined.field_J ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          this.field_X = true;
          if (!this.field_A.field_y &&
            null == this.field_A.field_K) {
            if (this.field_yb > 0) {
              fieldTemp$0 = this.field_xb - 1;
              this.field_xb = this.field_xb - 1;
              decompiledFrameRemainder0 = !(fieldTemp$0 <= 0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder1 = !(this.field_yb <= 0))) {
              var2_int = 0;
              while ((this.field_A.field_x.field_a - 2) > var2_int) {
                stackIn_40_0 = $cfr$dcmpg(this.field_A.field_x.field_r[1 + var2_int], this.field_D);
                if (var9 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_40_0 <= 0) {
                  var2_int++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted0) {
                this.field_A.field_x.b(3, var2_int, this.field_D);
                var3 = 0.5 * (-Math.cos(0.026399938265460447 * (double)this.field_xb) + 1.0);
                var5 = 0.5 * (1.0 - Math.cos(0.026399938265460447 * (double)(-1 + this.field_xb)));
                var7 = var5 / var3;
                this.field_E = this.field_A.field_x.field_B + (this.field_E - this.field_A.field_x.field_B) * var7;
                this.field_t = this.field_A.field_x.field_G + var7 * (-this.field_A.field_x.field_G + this.field_t);
                decompiledFrameRemainder1 = (var9 != 0);
              }
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameCompleted0)) {
            if (this.field_Bb.field_b > 8) {
              this.field_Bb.field_d = 65536;
            }
            this.field_Jb.a(0);
            this.field_G = 0.0;
            this.field_K = 0.0;
            this.field_L = 0.0;
            this.field_z = false;
            this.field_Bb.field_i.d(209);
            this.field_Bb.field_g.d(209);
            var2_intLifetime1 = 0;
            while (true) {
              if (4 > var2_intLifetime1) {
                this.field_Ab[var2_intLifetime1].field_Q.d(209);
                var2_intLifetime1++;
                if (var9 == 0) {
                  continue;
                }
              } else {
                this.field_S.field_Q.d(209);
                this.field_V.d(209);
                this.field_db.d(209);
                this.field_Cb.d(209);
                this.field_yb = this.field_yb - 1;
                rc.field_i = rc.field_i + 1;
                this.field_Qb = 400;
              }
              break;
            }
            this.field_A.field_g.a((rk) (this), -1);
          }
          if (decompiledFrameCompleted0) {
            stackIn_40_0 = param0 ? 1 : 0;
          }
          if (stackIn_40_0 != 0) {
            this.a(-73, false, 0.5439863261272376);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.RA(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.TA(" + param0 + ')');
        }
    }

    final void a(cl param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -66 / ((param1 + 35) / 60);
          param0.a(this, (byte) 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dj.I(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_X = true;
          if (param0) {
            this.field_Pb = 71;
          }
          if (this.field_yb > 0) {
            this.field_xb = 120;
            if (!Confined.field_J) {
              return;
            }
          }
          hc.field_u = null;
          we.field_a = 0;
          of.field_a = true;
          sg.f((byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.N(" + param0 + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 72) {
            stackIn_7_0 = !(param0.f(-96));
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dj.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void h(byte param0) {
        this.field_Bb.b(-790952351);
        this.field_Z = 0;
        this.field_lb = 0;
        this.field_fb = 0;
        this.field_Mb = false;
        this.field_Q = 0;
        if (param0 < 44) {
          return;
        }
        try {
          this.field_kb = 0;
          this.field_ob = 0;
          this.field_Hb = 65536;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dj.NA(" + param0 + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0) {
            return;
          }
          if (param1 instanceof wc) {
            this.field_A.field_B.field_X = true;
          }
          super.a(param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("dj.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        try {
          this.field_X = true;
          super.a(param0, param1, param2, param3, param4, param5, param6);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dj.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean f(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -54) {
            this.f(10);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.EB(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int stackIn_82_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var5 = Confined.field_J ? 1 : 0;
        try {
          var2_int = 0;
          if (this.field_mb) {
            var2_int++;
          }
          if (this.field_Eb) {
            var2_int++;
          }
          if (this.field_Sb) {
            var2_int++;
          }
          if (this.field_cb) {
            var2_int++;
          }
          if (this.field_eb) {
            var2_int++;
          }
          if (this.field_rb) {
            var2_int++;
          }
          var2_int = var2_int + (this.field_ub + 3 >> 2);
          var2_int = var2_int + (3 + this.field_tb >> 2);
          var2_int = var2_int + (3 + this.field_zb >> 2);
          var2_int = var2_int + this.field_ab;
          var2_int = var2_int + (this.field_Bb.field_b - 8);
          var3 = 3;
          if (this.field_mb) {
            incrementValue$0 = var2_int;
            var2_int--;
            if ((double)var3 > Math.random() * (double)incrementValue$0) {
              this.field_mb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, this, 0));
            }
          }
          if (this.field_Eb) {
            incrementValue$1 = var2_int;
            var2_int--;
            if ((double)var3 > Math.random() * (double)incrementValue$1) {
              this.field_Eb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, this, 1));
            }
          }
          if (this.field_Sb) {
            incrementValue$2 = var2_int;
            var2_int--;
            if (Math.random() * (double)incrementValue$2 < (double)var3) {
              var3--;
              this.field_Sb = false;
              ri.a((rk) (this), 0, new cl(this.field_A, this, 2));
            }
          }
          if (this.field_cb) {
            incrementValue$3 = var2_int;
            var2_int--;
            if ((double)incrementValue$3 * Math.random() < (double)var3) {
              var3--;
              this.field_cb = false;
              ri.a((rk) (this), 0, new cl(this.field_A, this, 3));
            }
          }
          if (this.field_eb) {
            incrementValue$4 = var2_int;
            var2_int--;
            if ((double)incrementValue$4 * Math.random() < (double)var3) {
              this.field_eb = false;
              var3--;
              ri.a((rk) (this), param0 + 1, new cl(this.field_A, this, 5));
            }
          }
          if (this.field_rb) {
            incrementValue$5 = var2_int;
            var2_int--;
            if ((double)var3 > (double)incrementValue$5 * Math.random()) {
              var3--;
              this.field_rb = false;
              ri.a((rk) (this), ~param0, new cl(this.field_A, this, 4));
            }
          }
          if (this.field_U > 0) {
            this.field_U = 0;
            ri.a((rk) (this), 0, new cl(this.field_A, this, 8));
          }
          if (0 < this.field_Pb) {
            this.field_Pb = 0;
            ri.a((rk) (this), param0 + 1, new cl(this.field_A, this, 7));
          }
          var4 = this.field_ub;
          boolean decompiledNaturalLoopExit4 = false;
          while (!(decompiledNaturalLoopExit4 = (var4 <= 0))) {
            incrementValue$6 = var2_int;
            var2_int--;
            stackIn_82_0 = $cfr$dcmpg(Math.random() * (double)incrementValue$6, (double)var3);
            if (var5 == 0) {
              if (stackIn_82_0 < 0) {
                this.field_ub = this.field_ub - 4;
                var3--;
                if (this.field_ub < 0) {
                  this.field_ub = 0;
                }
                ri.a((rk) (this), 0, new cl(this.field_A, this, 10));
              }
              var4 -= 4;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit4) {
            stackIn_82_0 = this.field_tb;
          }
          var4Lifetime1 = stackIn_82_0;
          boolean decompiledNaturalLoopExit3 = false;
          while (!(decompiledNaturalLoopExit3 = (0 >= var4Lifetime1))) {
            incrementValue$7 = var2_int;
            var2_int--;
            stackIn_97_0 = $cfr$dcmpl((double)var3, (double)incrementValue$7 * Math.random());
            if (var5 == 0) {
              if (stackIn_97_0 > 0) {
                var3--;
                this.field_tb = this.field_tb - 4;
                if (this.field_tb < 0) {
                  this.field_tb = 0;
                }
                ri.a((rk) (this), ~param0, new cl(this.field_A, this, 11));
              }
              var4Lifetime1 -= 4;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit3) {
            stackIn_97_0 = this.field_zb;
          }
          var4Lifetime2 = stackIn_97_0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (0 >= var4Lifetime2))) {
            incrementValue$8 = var2_int;
            var2_int--;
            stackIn_110_0 = $cfr$dcmpl((double)var3, Math.random() * (double)incrementValue$8);
            if (var5 == 0) {
              if (stackIn_110_0 > 0) {
                this.field_zb = this.field_zb - 4;
                var3--;
                if (0 > this.field_zb) {
                  this.field_zb = 0;
                }
                ri.a((rk) (this), 0, new cl(this.field_A, this, 12));
              }
              var4Lifetime2 -= 4;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_110_0 = this.field_ab;
          }
          var4Lifetime3 = stackIn_110_0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4Lifetime3 <= 0))) {
            incrementValue$9 = var2_int;
            var2_int--;
            stackIn_120_0 = $cfr$dcmpg(Math.random() * (double)incrementValue$9, (double)var3);
            if (var5 == 0) {
              if (stackIn_120_0 < 0) {
                this.field_ab = this.field_ab - 1;
                var3--;
                ri.a((rk) (this), 0, new cl(this.field_A, this, 13));
              }
              var4Lifetime3--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_120_0 = this.field_Bb.field_b;
          }
          var4Lifetime4 = stackIn_120_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4Lifetime4 <= 8))) {
            incrementValue$10 = var2_int;
            var2_int--;
            stackIn_130_0 = $cfr$dcmpl((double)var3, (double)incrementValue$10 * Math.random());
            if (var5 == 0) {
              if (stackIn_130_0 > 0) {
                this.field_Bb.field_b = this.field_Bb.field_b - 1;
                var3--;
                ri.a((rk) (this), 0, new cl(this.field_A, this, 14));
              }
              var4Lifetime4--;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_130_0 = -9;
          }
          if (stackIn_130_0 == ~this.field_Bb.field_b) {
            this.field_Bb.field_d = 0;
          }
          if (this.field_ib > 0) {
            this.field_ib = 0;
            this.field_Bb.field_l = false;
            var4Lifetime5 = 0;
            while (true) {
              if (var4Lifetime5 < 5 &&
                var5 == 0) {
                if (this.field_Nb[var4Lifetime5] != null) {
                  this.field_Nb[var4Lifetime5].field_ab.field_l = false;
                }
                var4Lifetime5++;
                continue;
              }
              break;
            }
            ri.a((rk) (this), 0, new cl(this.field_A, this, 15));
          }
          if (this.field_Gb > 0) {
            this.field_Gb = 0;
            this.field_Kb = 0;
            ri.a((rk) (this), ~param0, new cl(this.field_A, this, 16));
          }
          if (param0 > ~this.field_R) {
            this.field_R = 0;
            ri.a((rk) (this), 0, new cl(this.field_A, this, 9));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.MA(" + param0 + ')');
        }
    }

    final double[] e(int param0) {
        RuntimeException var2 = null;
        double[] stackIn_2_0 = null;
        double[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3008) {
            stackIn_4_0 = this.field_Lb.a(16777215);
            return stackIn_4_0;
          }
          stackIn_2_0 = (double[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "dj.R(" + param0 + ')');
        }
    }

    final void a(pm param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -81) {
            this.a((mn) null, (byte) 65);
          }
          param0.a(this, (byte) 80);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("dj.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_Gb = 61;
          }
          stackIn_10_0 = (!param1.f(-91)) && (this.field_Kb < 128);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("dj.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] var7 = null;
        int var7_int = 0;
        RuntimeException var7_ref = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double[] var14 = null;
        double[] var7Lifetime1;
        try {
          if (16 <= this.field_fb) {
            var7 = new double[12];
            this.field_jb.a((byte) 37, var7);
            qg.a(param1, this.field_fb, var7, (double)this.field_fb * 0.015625, param3, this, 64);
          }
          if (this.field_lb >= 16) {
            var7Lifetime1 = new double[12];
            this.field_jb.a((byte) 114, var7Lifetime1);
            se.a(param3, false, var7Lifetime1, true, 0.015625 * (double)this.field_lb, param1, this);
          }
          var7_int = md.a(-123) ? 1 : 0;
          if (this.field_N &&
            var7_int == 0) {
            return;
          }
          if (var7_int != 0) {
            this.field_Bb.a(-96);
          }
          if (null != this.field_A.field_a &&
            var7_int != 0) {
            var8 = this.field_A.field_a.field_E;
            var10 = this.field_A.field_a.field_t;
            var12 = this.field_A.field_a.field_D;
            var14 = new double[12];
            this.field_jb.a((byte) 90, var14);
            this.field_A.field_a.field_t = this.field_t + this.field_C * var14[10] * 2.0;
            this.field_A.field_a.field_D = (this.field_D + 2.0 * (this.field_C * var14[11])) * 0.9 + var12 * 0.1;
            this.field_A.field_a.field_E = this.field_E + 2.0 * (this.field_C * var14[9]);
            this.field_A.field_a.a(param0, param1, -33, param3, param4);
            this.field_A.field_a.field_D = var12;
            this.field_A.field_a.field_t = var10;
            this.field_A.field_a.field_E = var8;
          }
          if ((4 & this.field_Qb) == 0) {
            this.a(512, true, param1, (byte) 44, fc.field_d, this.field_jb, param3, param4, param0, this.field_Kb);
          }
          if (var7_int == 0) {
            this.field_Bb.a(param3, param1, (byte) 125);
          }
          if (param2 >= -5) {
            this.a((mn) null, (byte) -40);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_35_0 = var7_ref;
          stackIn_35_1 = new StringBuilder().append("dj.QA(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param4 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    static {
        field_W = "Power-up attractor";
        field_Ib = "Shield";
    }

    private static int $cfr$dcmpg(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }

    private static int $cfr$dcmpl(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
