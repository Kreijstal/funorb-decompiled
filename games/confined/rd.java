/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends id {
    private u field_Pb;
    boolean field_Ob;
    static bi field_Hb;
    static String field_Jb;
    rd field_Tb;
    private int field_Sb;
    int field_Qb;
    static volatile int field_Nb;
    private int field_Mb;
    private int field_Fb;
    boolean field_Rb;
    private int field_Gb;
    static String field_Ib;
    private boolean[] field_Kb;
    private int field_Lb;

    final void a(double param0, double param1, int param2, int param3, double param4, double param5, int param6, double param7, double param8, double param9) {
        int var18 = 0;
        int var19 = Confined.field_J ? 1 : 0;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        if (param3 == 0) {
          this.a(this.field_A.field_x.a((byte) 78, this.field_C), param9, (byte) 99, 6.283185307179586 * param5);
          var18 = -15 % ((-3 - param6) / 32);
          return;
        }
        if (param3 == 1) {
          this.a(this.field_A.field_x.a((byte) 78, this.field_C), param9, param5 * 6.283185307179586, (byte) 107);
          var18Lifetime1 = -15 % ((-3 - param6) / 32);
          return;
        }
        if (2 == param3) {
          this.a(param5 * 6.283185307179586, 0.5 * param9, 2.0, this.field_A.field_x.a((byte) 78, this.field_C), (byte) -68);
          var18Lifetime2 = -15 % ((-3 - param6) / 32);
          return;
        }
        this.a(param8, param9, param7, param0, param5, (byte) 89, param1, this.field_A.field_x.a((byte) 78, this.field_C), param4);
        var18Lifetime3 = -15 % ((-3 - param6) / 32);
    }

    private final void a(double param0, double param1, byte param2, double param3) {
        this.field_qb = param1;
        this.field_Db = 0.0;
        this.field_ub = 0.0;
        this.field_X = 0.0;
        this.field_hb = param3;
        this.field_R = 0.0;
        this.field_Z = param0;
        if (param2 > 55) {
          this.field_cb = 0.0;
          return;
        }
        field_Jb = (String) null;
        this.field_cb = 0.0;
    }

    private final void a(double param0, double param1, double param2, byte param3) {
        this.field_Z = 0.0;
        this.field_ub = param0;
        this.field_cb = 0.0;
        this.field_R = 0.0;
        this.field_qb = 0.0;
        this.field_hb = param2;
        if (param3 == 107) {
          this.field_Db = param1;
          this.field_X = 1.5707963267948966;
          return;
        }
        this.field_Gb = -106;
        this.field_Db = param1;
        this.field_X = 1.5707963267948966;
    }

    final void a(vg param0, boolean param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        int var18 = 0;
        sk var19 = null;
        var17 = null;
        var18 = Confined.field_J ? 1 : 0;
        try {
          if (this.field_ab &&
            this.field_xb * 2.0 > -this.field_A.field_B.field_Lb.field_j + this.field_D) {
            var3_double = -param0.field_T + this.field_E;
            var5 = this.field_t - param0.field_L;
            var7 = -param0.field_O + this.field_D;
            var9 = var7 * param0.field_M + (var5 * param0.field_ab + var3_double * param0.field_R);
            var11 = param0.field_F * var7 + (var3_double * param0.field_V + param0.field_U * var5);
            var13 = param0.field_N * var7 + (var3_double * param0.field_P + var5 * param0.field_H);
            if (var9 < -var13 * 0.5 ||
              var9 > 0.5 * var13 ||
              var11 < 0.29375 * -var13 ||
              var11 > 0.29375 * var13) {
              if (-0.001 > var9 &&
                var11 > var9 * 0.5416666666666666 &&
                0.5416666666666666 * var9 < -var11) {
                var11 = var11 * (-288.0 / var9);
                var9 = -288.0;
              } else if (var9 > 0.001 &&
                var11 < var9 * 0.5416666666666666 &&
                -var11 < var9 * 0.5416666666666666) {
                var11 = var11 * (288.0 / var9);
                var9 = 288.0;
              } else {
                if (var11 < -0.001) {
                  var9 = var9 * (-156.0 / var11);
                  var11 = -156.0;
                } else {
                  if (!(var11 > 0.001)) {
                    return;
                  }
                  var9 = var9 * (156.0 / var11);
                  var11 = 156.0;
                }
              }
              var15 = 320 + (int)Math.floor(var9 + 0.5);
              var16 = 188 + (int)Math.floor(0.5 + var11);
              ti.a(var15, var16);
              var19 = (sk) (jk.field_c[this.field_Sb].a(96, 455, 0, 0, 256));
              jc.field_f[2] = (int)(8192.0 * this.field_C);
              var19.a(tj.field_A, jc.field_f);
              ti.a();
            }
          }
          if (param1) {
            this.f((byte) 63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("rd.IC(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final pm i(byte param0) {
        double[] var12 = new double[12];
        double[] var11 = var12;
        double[] var10 = var11;
        double[] var2 = var10;
        this.field_Eb.a((byte) 20, var12);
        double[] var3 = tl.field_a[this.field_Sb];
        if (param0 != 96) {
          rd.n(-108);
        }
        double var4 = var3[this.field_Fb];
        double var6 = var3[1 + this.field_Fb];
        double var8 = var3[2 + this.field_Fb];
        this.field_Fb = (3 + this.field_Fb) % var3.length;
        if (this.field_zb == 0) {
          return (pm) ((Object) new th(this.field_A, (ee) (this), var12, var4, var6, var8));
        }
        if (this.field_zb != 1) {
          return (pm) ((Object) new ik(this.field_A, (ee) (this), var12, var4, var6, var8));
        }
        return (pm) ((Object) new gm(this.field_A, (ee) (this), var12, var4, var6, var8));
    }

    private final void a(double param0, double param1, double param2, double param3, byte param4) {
        this.field_hb = param0;
        this.field_Db = param1 * param2;
        this.field_qb = param1;
        if (param4 <= -58) {
          this.field_ub = 0.0;
          this.field_Z = param3;
          this.field_cb = 0.0;
          this.field_R = param1;
          this.field_X = 0.0;
          return;
        }
        field_Jb = (String) null;
        this.field_ub = 0.0;
        this.field_Z = param3;
        this.field_cb = 0.0;
        this.field_R = param1;
        this.field_X = 0.0;
    }

    final static int a(String param0, int param1, int param2, String param3, boolean param4, String param5, int param6) {
        bn var7 = null;
        RuntimeException var7_ref = null;
        bn var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new bn(param0);
          var8 = new bn(param3);
          if (param2 != 28406) {
            field_Jb = (String) null;
          }
          stackIn_3_0 = ai.a(param1, param5, var8, param4, param6, 125, var7);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("rd.NC(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final void d(byte param0, int param1) {
        int var4 = 0;
        Object var3;
        rd var4_ref_rd;
        int var5;
        var5 = Confined.field_J ? 1 : 0;
        var3 = this;
        while (true) {
          var4_ref_rd = ((rd) (var3)).field_Tb;
          if (var4_ref_rd != null) {
            ((rd) (var3)).field_ub = var4_ref_rd.field_ub;
            ((rd) (var3)).field_cb = var4_ref_rd.field_cb;
            ((rd) (var3)).field_Db = var4_ref_rd.field_Db;
            ((rd) (var3)).field_X = var4_ref_rd.field_X;
            ((rd) (var3)).field_qb = var4_ref_rd.field_qb;
            ((rd) (var3)).field_hb = var4_ref_rd.field_hb;
            ((rd) (var3)).field_R = var4_ref_rd.field_R;
            ((rd) (var3)).field_Z = var4_ref_rd.field_Z;
            var3 = var4_ref_rd;
            continue;
          }
          break;
        }
        for (var4 = 0; this.field_Gb > var4; var4++) {
          ((rd) (var3)).m(12);
        }
        if (param0 == -123) {
          return;
        }
        this.h(-114);
        return;
    }

    final void a(mn param0, byte param1) {
        int var3_int = 0;
        double[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, (byte) -84);
          var3_int = -89 % ((-2 - param1) / 62);
          if (this.field_ob < 256 &&
            (this.field_Sb == 0 ||
            this.field_Sb == 4)) {
            var8 = new double[12];
            this.field_Eb.a((byte) 110, var8);
            this.a(false, var8, 0, mc.field_b);
            this.field_ib.field_o = ud.field_o;
            this.field_ib.field_t = rn.field_c;
            this.field_ib.field_p = dh.field_sb;
            this.field_ib.field_m = -var8[6];
            this.field_ib.field_w = true;
            this.field_ib.field_v = -var8[8];
            this.field_ib.field_u = (double)(-this.field_ob + 256) * 0.390625;
            this.field_ib.field_x = -var8[7];
            param0.a((rk) (this.field_ib), (byte) 86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rd.OA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void h(int param0) {
        this.field_Lb = this.field_Lb + 1;
        if (param0 == 17086) {
          return;
        }
        this.field_Mb = -128;
    }

    private rd(hn param0, double param1, double param2, double param3, double param4, double param5, int param6, int param7, boolean param8, int param9, boolean param10, double param11, int param12, boolean param13, double param14, boolean param15, boolean param16, int param17, boolean param18, rd param19, int param20, u param21, boolean param22, boolean[] param23) {
        super(param0, param1, param2, param3, Math.random() * 0.4 - 0.2, -0.2 + Math.random() * 0.4, -0.2 + 0.4 * Math.random(), param4, param5, false, param9, param11, 0.005);
        gk discarded$0 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_12_1 = false;
        boolean stackIn_15_1 = false;
        boolean stackIn_20_1 = false;
        double stackIn_28_0 = 0.0;
        boolean stackIn_32_1 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var32_double = 0.0;
        RuntimeException var32 = null;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var38Lifetime1;
        this.field_Fb = 0;
        try {
          this.field_wb = param12;
          this.field_Bb = param12;
          stackIn_4_1 = (param13);
          this.field_db = stackIn_4_1;
          this.field_Qb = param6;
          if (!param8) {
            this.field_fb.field_d = 0;
          }
          stackIn_9_1 = (param15);
          this.field_kb = stackIn_9_1;
          this.field_S = false;
          this.field_Y = param14;
          stackIn_12_1 = (param10);
          this.field_ab = stackIn_12_1;
          this.field_Ab = param17;
          stackIn_15_1 = (param16);
          this.field_Ob = stackIn_15_1;
          this.field_Sb = param7;
          if (param15) {
            this.field_ob = 256;
          }
          stackIn_20_1 = (param18);
          this.field_vb = stackIn_20_1;
          if (param18) {
            this.l(22475);
          }
          this.field_Tb = param19;
          this.field_Pb = param21;
          this.field_Gb = param20;
          if (param19 != null) {
            param19.field_eb = this;
          }
          if (param21 != null) {
            var32_double = param21.field_E - param0.field_B.field_Lb.field_i;
            var34 = param21.field_t - param0.field_B.field_Lb.field_f;
            var36 = param21.field_D - param0.field_B.field_Lb.field_j;
            var38 = Math.sqrt(var32_double * var32_double + var34 * var34 + var36 * var36);
            if (var38 >= 0.01) {
              stackIn_28_0 = 2.0 / var38;
            } else {
              stackIn_28_0 = 200.0;
            }
            var38Lifetime1 = stackIn_28_0;
            var38Lifetime1 = var38Lifetime1 * (param21.field_C + param4);
            var32_double = var32_double * var38Lifetime1;
            var36 = var36 * var38Lifetime1;
            var34 = var34 * var38Lifetime1;
            this.field_G = param21.field_G;
            this.field_L = param21.field_L;
            this.field_t = param21.field_t + var34;
            this.field_D = param21.field_D + var36;
            this.field_E = var32_double + param21.field_E;
            this.field_K = param21.field_K;
          }
          this.field_Kb = param23;
          stackIn_32_1 = (param22);
          this.field_Rb = stackIn_32_1;
          discarded$0 = new gk((pm) (this), tk.field_c[param7]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var32 = decompiledCaughtException;
          stackIn_36_0 = var32;
          stackIn_36_1 = new StringBuilder().append("rd.<init>(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param20).append(',');
          if (param21 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param22).append(',');
          if (param23 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        field_Hb = null;
        field_Jb = null;
        field_Ib = null;
        if (param0 <= -107) {
          return;
        }
        field_Jb = (String) null;
    }

    final void f(byte param0) {
        this.field_Lb = this.field_Lb - 1;
        if (param0 <= -112) {
          return;
        }
        this.field_Fb = 56;
    }

    final pm h(byte param0) {
        double[] var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double[] var10 = new double[12];
        double[] var2 = var10;
        double[] var3Lifetime1;
        double var4Lifetime1;
        double var6Lifetime1;
        double var8Lifetime1;
        this.field_Eb.a((byte) 49, var10);
        if (param0 > 15) {
          var3 = tl.field_a[this.field_Sb];
          var4 = var3[this.field_Fb];
          var6 = var3[this.field_Fb + 1];
          var8 = var3[this.field_Fb + 2];
          this.field_Fb = (this.field_Fb + 3) % var3.length;
          return (pm) ((Object) new vm(this.field_A, (ee) (this), var10, var4, var6, var8, this.field_Y, this.field_db));
        }
        this.a(-0.20656177354580776, 0.5060040522939452, 0.05774250501221265, 0.8961713050329917, (byte) 20);
        var3Lifetime1 = tl.field_a[this.field_Sb];
        var4Lifetime1 = var3Lifetime1[this.field_Fb];
        var6Lifetime1 = var3Lifetime1[this.field_Fb + 1];
        var8Lifetime1 = var3Lifetime1[this.field_Fb + 2];
        this.field_Fb = (this.field_Fb + 3) % var3Lifetime1.length;
        return (pm) ((Object) new vm(this.field_A, (ee) (this), var10, var4Lifetime1, var6Lifetime1, var8Lifetime1, this.field_Y, this.field_db));
    }

    final boolean o(int param0) {
        if (param0 != 640) {
          this.h((byte) -101);
          if (!this.field_z) {
            return this.field_S ? true : false;
          }
          return true;
        }
        if (this.field_z) {
          return true;
        }
        if (!this.field_S) {
          return false;
        }
        return true;
    }

    rd(hn param0, double param1, double param2, double param3, boolean param4, int param5, int param6, rd param7, int param8, boolean param9, int param10, int param11, boolean param12, boolean param13, double param14, boolean param15, boolean param16, u param17, boolean param18, boolean[] param19, int param20) {
        this(null, 0.0, 0.0, 0.0, 0.0, 0.0, 0, 0, false, 0, false, 0.0, 0, false, 0.0, false, false, 0, false, param7, param8, param17, param18, param19);
        Object stackIn_2_0;
        hn stackIn_2_1;
        double stackIn_2_2;
        double stackIn_2_3;
        double stackIn_2_4;
        double stackIn_2_5;
        double stackIn_2_6;
        int stackIn_2_7;
        int stackIn_2_8;
        boolean stackIn_2_9;
        int stackIn_2_10;
        boolean stackIn_2_11;
        double stackIn_2_12;
        int stackIn_2_13;
        boolean stackIn_2_14;
        double stackIn_2_15;
        int stackIn_2_16;
        boolean stackIn_2_17;
        int stackIn_2_18;
        Object stackIn_3_0;
        Object stackIn_4_0;
        int stackIn_4_19;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var26_int = 0;
        double var26_double = 0.0;
        RuntimeException var26 = null;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        int var38 = 0;
        Object stackIn_2_0Lifetime1;
        Object stackIn_4_0Lifetime1;
        int stackIn_4_19Lifetime1;
        double var26_doubleLifetime1;
        double var28Lifetime1;
        double var30Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var38 = Confined.field_J ? 1 : 0;
        stackIn_2_0 = this;
        stackIn_2_1 = (hn) (param0);
        stackIn_2_2 = param1;
        stackIn_2_3 = param2;
        stackIn_2_4 = param3;
        stackIn_2_5 = rf.field_a[param5];
        stackIn_2_6 = tg.field_R[param5];
        stackIn_2_7 = param5;
        stackIn_2_8 = param6;
        stackIn_2_9 = param9;
        stackIn_2_10 = param10;
        stackIn_2_11 = param12;
        stackIn_2_12 = sb.field_a[param5];
        stackIn_2_13 = cd.field_j[param5];
        stackIn_2_14 = param13;
        stackIn_2_15 = param14;
        stackIn_2_16 = 0;
        stackIn_2_17 = param15;
        stackIn_2_18 = param11;
        if (!param16) {
          stackIn_3_0 = this;
          stackIn_2_0Lifetime1 = stackIn_3_0;
          if (param5 != 2) {
            stackIn_4_0 = this;
            stackIn_4_19 = 0;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_0Lifetime1 = this;
          stackIn_4_19Lifetime1 = 1;
        }
        try {
          this.field_Mb = param20;
          var26_int = param6;
          if (var26_int != 0 &&
            var26_int != 1) {
            if (var26_int != 2 &&
              var26_int != 3) {
              if (4 != var26_int &&
                var26_int != 5 &&
                var26_int != 6 &&
                var26_int != 7 &&
                var26_int != 9 &&
                var26_int != 10 &&
                var26_int != 11 &&
                var26_int != 12) {
                if (var26_int == 8) {
                  var26_double = 1.998 * Math.random() - 0.999;
                  var28 = Math.sqrt(1.0 - var26_double * var26_double);
                  var30 = 2.0 * (Math.random() * 3.141592653589793);
                  this.field_tb.a(Math.random() * 0.2, var26_double, var28 * Math.sin(var30), var28 * Math.cos(var30), 7);
                }
                return;
              }
              this.field_Bb = 1 + (int)(Math.random() * (double)this.field_wb);
              if (!param4) {
                this.field_yb = true;
                return;
              }
              this.a(0.0, 1.0, false, 0.0);
              return;
            }
            if (param4) {
              this.b(0.0, true, 0.0, 1.0);
              return;
            }
            this.field_gb = true;
            return;
          }
          var26_doubleLifetime1 = 1.998 * Math.random() - 0.999;
          var28Lifetime1 = Math.sqrt(1.0 - var26_doubleLifetime1 * var26_doubleLifetime1);
          var30Lifetime1 = 6.283185307179586 * Math.random();
          var32 = var28Lifetime1 * Math.cos(var30Lifetime1);
          var34 = Math.sin(var30Lifetime1) * var28Lifetime1;
          this.field_tb.a(0.2, var26_doubleLifetime1, var32, var34, 7);
          var36 = Math.sqrt(var32 * var32 + var26_doubleLifetime1 * var26_doubleLifetime1);
          if (0.0001 > var36) {
            var26_doubleLifetime1 = 0.0;
            var32 = 1.0;
          } else {
            var26_doubleLifetime1 = var26_doubleLifetime1 / var36;
            var32 = var32 / var36;
          }
          this.field_Eb.a(-Math.atan2(var36, var34), var32, -var26_doubleLifetime1, 0.0, 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var26 = decompiledCaughtException;
          stackIn_33_0 = var26;
          stackIn_33_1 = new StringBuilder().append("rd.<init>(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param20).append(')').toString());
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        oi var28 = null;
        try {
          if (this.field_N) {
            return;
          }
          this.a(this.field_ob, jk.field_c[this.field_Sb], 27902, this.field_Eb, 512, param4, param1, param3, param0);
          if (param2 >= -5) {
            var28 = (oi) null;
            this.a((mn) null, 0.8438752622488864, -63, (vg) null, (oi) null);
          }
          this.field_fb.a(param3, param1, (byte) 125);
          if (this.field_V >= 10) {
            var7_double = this.field_E - this.field_A.field_B.field_E;
            var9 = -this.field_A.field_B.field_t + this.field_t;
            var11 = this.field_D - this.field_A.field_B.field_D;
            if (!(400.0 > var11 * var11 + (var7_double * var7_double + var9 * var9))) {
              return;
            }
            var13 = -param3.field_T + this.field_E;
            var15 = -param3.field_L + this.field_t;
            var17 = -param3.field_O + this.field_D;
            var19 = var17 * param3.field_M + (var15 * param3.field_ab + param3.field_R * var13);
            var21 = var17 * param3.field_F + (var15 * param3.field_U + param3.field_V * var13);
            var23 = var15 * param3.field_H + var13 * param3.field_P + param3.field_N * var17;
            if (0.15 <= var23) {
              var25 = (int)(var19 / var23 * 640.0) + 320;
              var26 = 188 + (int)(640.0 * (var21 / var23));
              var27 = (int)(this.field_C / var23 * 640.0);
              if ((6 & this.field_V) != 0) {
                fn.g(var25 - 1, -1 + var26, var27, 16711680);
                fn.g(var25, var26 - 1, var27, 16711680);
                fn.g(-1 + var25, var26, var27, 16711680);
                fn.g(var25, var26, var27, 16711680);
              }
              pn.field_a.b(di.field_f, var25, -8 + var26 - var27, 16711680, -1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("rd.QA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final double j(int param0) {
        if (param0 != -7672) {
          field_Hb = (bi) null;
          return (double)(this.field_Lb << 16);
        }
        return (double)(this.field_Lb << 16);
    }

    final void g(int param0) {
        int var4;
        ka var6;
        int stackIn_17_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_107_0 = 0;
        int var3;
        ka var7;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = Confined.field_J ? 1 : 0;
        if (param0 != 26402) {
          this.h((byte) -69);
          var6 = this.a((byte) -71, ic.field_c[this.field_Sb], 1.5);
          var6.field_M.field_w = this.field_C * 2.0;
          if (this.field_A.field_K == null) {
            while (null != this.field_Tb) {
              if (this.field_Tb.o(640)) {
                this.field_Tb = this.field_Tb.field_Tb;
                continue;
              }
              break;
            }
            while (this.field_eb != null) {
              if (this.field_eb.o(640)) {
                this.field_eb = this.field_eb.field_eb;
                continue;
              }
              break;
            }
            if (!pa.field_c) {
              var3 = this.field_Kb[0] ? 1 : 0;
              this.field_Kb[0] = false;
            } else {
              if (this.field_eb == null) {
                stackIn_17_0 = (null == this.field_Tb) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
              var3 = stackIn_17_0;
            }
            if (var3 != 0) {
              ri.a((rk) (this), 0, new cl(this.field_A, this));
            }
            if (!this.field_Rb) {
              this.field_A.a((byte) 50, si.a(107, this));
            }
          }
          if (this.field_Mb <= 2) {
            this.field_A.field_c = this.field_A.field_c - 1;
          }
          if (this.field_Mb <= 1) {
            this.field_A.field_j = this.field_A.field_j - 1;
          }
          if (this.field_Rb) {
            this.field_A.field_o = this.field_A.field_o - 1;
            if (this.field_A.field_o == 0 &&
              null == this.field_A.field_Q &&
              this.field_A.field_J.field_o <= 12) {
              di.a(param0 - 57269, 242, 13);
              return;
            }
          }
          return;
        }
        var7 = this.a((byte) -71, ic.field_c[this.field_Sb], 1.5);
        var7.field_M.field_w = this.field_C * 2.0;
        if (this.field_A.field_K != null) {
          if (this.field_Mb > 2) {
            if (this.field_Mb <= 1) {
              this.field_A.field_j = this.field_A.field_j - 1;
            }
            if (!this.field_Rb) {
              return;
            }
            this.field_A.field_o = this.field_A.field_o - 1;
            if (this.field_A.field_o != 0) {
              return;
            }
            if (null != this.field_A.field_Q) {
              return;
            }
            if (this.field_A.field_J.field_o > 12) {
              return;
            }
            di.a(param0 - 57269, 242, 13);
            return;
          }
          this.field_A.field_c = this.field_A.field_c - 1;
          if (this.field_Mb <= 1) {
            this.field_A.field_j = this.field_A.field_j - 1;
          }
          if (this.field_Rb) {
            this.field_A.field_o = this.field_A.field_o - 1;
            if (this.field_A.field_o == 0 &&
              null == this.field_A.field_Q &&
              this.field_A.field_J.field_o <= 12) {
              di.a(param0 - 57269, 242, 13);
              return;
            }
          }
          return;
        }
        while (true) {
          if (null == this.field_Tb) {
            while (this.field_eb != null) {
              if (this.field_eb.o(640)) {
                this.field_eb = this.field_eb.field_eb;
                continue;
              }
              break;
            }
            if (!pa.field_c) {
              var3Lifetime1 = this.field_Kb[0] ? 1 : 0;
              this.field_Kb[0] = false;
            } else {
              if (this.field_eb == null) {
                stackIn_76_0 = (null == this.field_Tb) ? 1 : 0;
              } else {
                stackIn_76_0 = 0;
              }
              var3Lifetime1 = stackIn_76_0;
            }
            if (var3Lifetime1 != 0) {
              ri.a((rk) (this), 0, new cl(this.field_A, this));
            }
            if (!this.field_Rb) {
              this.field_A.a((byte) 50, si.a(107, this));
            }
            if (this.field_Mb <= 2) {
              this.field_A.field_c = this.field_A.field_c - 1;
            }
            if (this.field_Mb <= 1) {
              this.field_A.field_j = this.field_A.field_j - 1;
            }
            if (this.field_Rb) {
              this.field_A.field_o = this.field_A.field_o - 1;
              if (this.field_A.field_o == 0 &&
                null == this.field_A.field_Q &&
                this.field_A.field_J.field_o <= 12) {
                di.a(param0 - 57269, 242, 13);
                return;
              }
            }
            return;
          }
          if (this.field_Tb.o(640)) {
            this.field_Tb = this.field_Tb.field_Tb;
            continue;
          }
          break;
        }
        while (this.field_eb != null) {
          if (this.field_eb.o(640)) {
            this.field_eb = this.field_eb.field_eb;
            continue;
          }
          break;
        }
        if (!pa.field_c) {
          var3Lifetime2 = this.field_Kb[0] ? 1 : 0;
          this.field_Kb[0] = false;
        } else {
          if (this.field_eb == null) {
            stackIn_107_0 = (null == this.field_Tb) ? 1 : 0;
          } else {
            stackIn_107_0 = 0;
          }
          var3Lifetime2 = stackIn_107_0;
        }
        if (var3Lifetime2 != 0) {
          ri.a((rk) (this), 0, new cl(this.field_A, this));
        }
        if (!this.field_Rb) {
          this.field_A.a((byte) 50, si.a(107, this));
        }
        if (this.field_Mb <= 2) {
          this.field_A.field_c = this.field_A.field_c - 1;
        }
        if (this.field_Mb <= 1) {
          this.field_A.field_j = this.field_A.field_j - 1;
        }
        if (this.field_Rb) {
          this.field_A.field_o = this.field_A.field_o - 1;
          if (this.field_A.field_o == 0 &&
            null == this.field_A.field_Q &&
            this.field_A.field_J.field_o <= 12) {
            di.a(param0 - 57269, 242, 13);
            return;
          }
        }
        return;
    }

    final void a(int param0, byte param1) {
        double stackIn_12_1 = 0.0;
        double stackIn_13_2 = 0.0;
        double stackIn_21_0 = 0.0;
        double stackIn_36_1 = 0.0;
        double stackIn_37_2 = 0.0;
        double stackIn_43_0 = 0.0;
        double stackIn_62_0 = 0.0;
        double stackIn_73_0 = 0.0;
        double var3;
        double var5;
        double var7;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        double var19;
        double var21;
        int var23;
        double var3Lifetime1;
        double var3Lifetime2;
        double var5Lifetime1;
        double var5Lifetime2;
        double var7Lifetime1;
        double var9Lifetime1;
        double var11Lifetime1;
        double var13Lifetime1;
        double var15Lifetime1;
        double var17Lifetime1;
        double var19Lifetime1;
        double var21Lifetime1;
        double var3Lifetime3;
        double var5Lifetime3;
        double var9Lifetime2;
        double var9Lifetime3;
        var23 = Confined.field_J ? 1 : 0;
        while (this.field_Tb != null) {
          if (this.field_Tb.o(640)) {
            this.field_Gb = this.field_Gb + this.field_Tb.field_Gb;
            this.field_Tb = this.field_Tb.field_Tb;
            continue;
          }
          break;
        }
        if (null != this.field_Pb) {
          if (!this.field_Pb.field_z) {
            if (null != this.field_Tb) {
              var3 = this.field_Tb.field_D + (double)this.field_Gb * (this.field_Tb.field_C + this.field_C) * 0.2;
              var5 = 0.1 * (var3 - this.field_D) + this.field_Tb.field_L;
              var5 = var5 - this.field_L;
              stackIn_12_1 = this.field_L;
              if (0.04 < var5) {
                stackIn_13_2 = 0.04;
              } else {
                if (var5 < -0.04) {
                  stackIn_13_2 = -0.04;
                } else {
                  stackIn_13_2 = var5;
                }
              }
              this.field_L = stackIn_12_1 + stackIn_13_2;
            }
            if (this.field_Rb &&
              null != this.field_A.field_Q) {
              this.field_L = this.field_L + this.field_A.field_Q.field_L * 0.01;
            }
            if (this.field_Pb == null) {
              this.b((byte) 108, param0);
            } else {
              var3Lifetime3 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
              var5Lifetime3 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
              var7 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
              var9 = Math.sqrt(var5Lifetime3 * var5Lifetime3 + var3Lifetime3 * var3Lifetime3 + var7 * var7);
              if (var9 >= 0.01) {
                stackIn_21_0 = 2.0 / var9;
              } else {
                stackIn_21_0 = 200.0;
              }
              var9Lifetime2 = stackIn_21_0;
              var9Lifetime2 = var9Lifetime2 * (this.field_C + this.field_Pb.field_C);
              var7 = var7 * var9Lifetime2;
              var3Lifetime3 = var3Lifetime3 * var9Lifetime2;
              var5Lifetime3 = var5Lifetime3 * var9Lifetime2;
              var11 = this.field_Pb.field_E + var3Lifetime3;
              var13 = var5Lifetime3 + this.field_Pb.field_t;
              var15 = var7 + this.field_Pb.field_D;
              var17 = this.field_Pb.field_K + (var11 - this.field_E) * 0.1;
              var19 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13);
              var17 = var17 - this.field_K;
              var19 = var19 - this.field_G;
              var21 = this.field_Pb.field_L + 0.1 * (var15 - this.field_D);
              var21 = var21 - this.field_L;
              var9Lifetime3 = Math.sqrt(var21 * var21 + (var17 * var17 + var19 * var19));
              if (var9Lifetime3 > 0.04) {
                var9Lifetime3 = 0.04 / var9Lifetime3;
              } else {
                var9Lifetime3 = 1.0;
              }
              this.field_K = this.field_K + var9Lifetime3 * var17;
              this.field_G = this.field_G + var9Lifetime3 * var19;
              this.field_L = this.field_L + var9Lifetime3 * var21;
            }
            if (param1 < 94) {
              this.j(-120);
            }
            return;
          }
          this.field_Pb = null;
          this.a((byte) 125, param0);
        }
        if (null != this.field_Tb) {
          var3Lifetime1 = this.field_Tb.field_D + (double)this.field_Gb * (this.field_Tb.field_C + this.field_C) * 0.2;
          var5Lifetime1 = 0.1 * (var3Lifetime1 - this.field_D) + this.field_Tb.field_L;
          var5Lifetime1 = var5Lifetime1 - this.field_L;
          stackIn_36_1 = this.field_L;
          if (0.04 < var5Lifetime1) {
            stackIn_37_2 = 0.04;
          } else {
            if (var5Lifetime1 < -0.04) {
              stackIn_37_2 = -0.04;
            } else {
              stackIn_37_2 = var5Lifetime1;
            }
          }
          this.field_L = stackIn_36_1 + stackIn_37_2;
        }
        if (!this.field_Rb) {
          if (this.field_Pb == null) {
            this.b((byte) 108, param0);
            if (param1 < 94) {
              this.j(-120);
            }
            return;
          }
          var3Lifetime2 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
          var5Lifetime2 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
          var7Lifetime1 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
          var9Lifetime1 = Math.sqrt(var5Lifetime2 * var5Lifetime2 + var3Lifetime2 * var3Lifetime2 + var7Lifetime1 * var7Lifetime1);
          if (var9Lifetime1 >= 0.01) {
            stackIn_43_0 = 2.0 / var9Lifetime1;
          } else {
            stackIn_43_0 = 200.0;
          }
          var9Lifetime1 = stackIn_43_0;
          var9Lifetime1 = var9Lifetime1 * (this.field_C + this.field_Pb.field_C);
          var7Lifetime1 = var7Lifetime1 * var9Lifetime1;
          var3Lifetime2 = var3Lifetime2 * var9Lifetime1;
          var5Lifetime2 = var5Lifetime2 * var9Lifetime1;
          var11Lifetime1 = this.field_Pb.field_E + var3Lifetime2;
          var13Lifetime1 = var5Lifetime2 + this.field_Pb.field_t;
          var15Lifetime1 = var7Lifetime1 + this.field_Pb.field_D;
          var17Lifetime1 = this.field_Pb.field_K + (var11Lifetime1 - this.field_E) * 0.1;
          var19Lifetime1 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13Lifetime1);
          var17Lifetime1 = var17Lifetime1 - this.field_K;
          var19Lifetime1 = var19Lifetime1 - this.field_G;
          var21Lifetime1 = this.field_Pb.field_L + 0.1 * (var15Lifetime1 - this.field_D);
          var21Lifetime1 = var21Lifetime1 - this.field_L;
          var9Lifetime1 = Math.sqrt(var21Lifetime1 * var21Lifetime1 + (var17Lifetime1 * var17Lifetime1 + var19Lifetime1 * var19Lifetime1));
          if (var9Lifetime1 > 0.04) {
            var9Lifetime1 = 0.04 / var9Lifetime1;
          } else {
            var9Lifetime1 = 1.0;
          }
          this.field_K = this.field_K + var9Lifetime1 * var17Lifetime1;
          this.field_G = this.field_G + var9Lifetime1 * var19Lifetime1;
          this.field_L = this.field_L + var9Lifetime1 * var21Lifetime1;
        } else {
          if (null == this.field_A.field_Q) {
            if (this.field_Pb == null) {
              this.b((byte) 108, param0);
            } else {
              var3Lifetime2 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
              var5Lifetime2 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
              var7Lifetime1 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
              var9Lifetime1 = Math.sqrt(var5Lifetime2 * var5Lifetime2 + var3Lifetime2 * var3Lifetime2 + var7Lifetime1 * var7Lifetime1);
              if (var9Lifetime1 >= 0.01) {
                stackIn_62_0 = 2.0 / var9Lifetime1;
              } else {
                stackIn_62_0 = 200.0;
              }
              var9Lifetime1 = stackIn_62_0;
              var9Lifetime1 = var9Lifetime1 * (this.field_C + this.field_Pb.field_C);
              var7Lifetime1 = var7Lifetime1 * var9Lifetime1;
              var3Lifetime2 = var3Lifetime2 * var9Lifetime1;
              var5Lifetime2 = var5Lifetime2 * var9Lifetime1;
              var11Lifetime1 = this.field_Pb.field_E + var3Lifetime2;
              var13Lifetime1 = var5Lifetime2 + this.field_Pb.field_t;
              var15Lifetime1 = var7Lifetime1 + this.field_Pb.field_D;
              var17Lifetime1 = this.field_Pb.field_K + (var11Lifetime1 - this.field_E) * 0.1;
              var19Lifetime1 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13Lifetime1);
              var17Lifetime1 = var17Lifetime1 - this.field_K;
              var19Lifetime1 = var19Lifetime1 - this.field_G;
              var21Lifetime1 = this.field_Pb.field_L + 0.1 * (var15Lifetime1 - this.field_D);
              var21Lifetime1 = var21Lifetime1 - this.field_L;
              var9Lifetime1 = Math.sqrt(var21Lifetime1 * var21Lifetime1 + (var17Lifetime1 * var17Lifetime1 + var19Lifetime1 * var19Lifetime1));
              if (var9Lifetime1 > 0.04) {
                var9Lifetime1 = 0.04 / var9Lifetime1;
              } else {
                var9Lifetime1 = 1.0;
              }
              this.field_K = this.field_K + var9Lifetime1 * var17Lifetime1;
              this.field_G = this.field_G + var9Lifetime1 * var19Lifetime1;
              this.field_L = this.field_L + var9Lifetime1 * var21Lifetime1;
            }
            if (param1 < 94) {
              this.j(-120);
            }
            return;
          }
          this.field_L = this.field_L + this.field_A.field_Q.field_L * 0.01;
          if (this.field_Pb == null) {
            this.b((byte) 108, param0);
          } else {
            var3Lifetime2 = this.field_Pb.field_E - this.field_A.field_B.field_Lb.field_i;
            var5Lifetime2 = -this.field_A.field_B.field_Lb.field_f + this.field_Pb.field_t;
            var7Lifetime1 = this.field_Pb.field_D - this.field_A.field_B.field_Lb.field_j;
            var9Lifetime1 = Math.sqrt(var5Lifetime2 * var5Lifetime2 + var3Lifetime2 * var3Lifetime2 + var7Lifetime1 * var7Lifetime1);
            if (var9Lifetime1 >= 0.01) {
              stackIn_73_0 = 2.0 / var9Lifetime1;
            } else {
              stackIn_73_0 = 200.0;
            }
            var9Lifetime1 = stackIn_73_0;
            var9Lifetime1 = var9Lifetime1 * (this.field_C + this.field_Pb.field_C);
            var7Lifetime1 = var7Lifetime1 * var9Lifetime1;
            var3Lifetime2 = var3Lifetime2 * var9Lifetime1;
            var5Lifetime2 = var5Lifetime2 * var9Lifetime1;
            var11Lifetime1 = this.field_Pb.field_E + var3Lifetime2;
            var13Lifetime1 = var5Lifetime2 + this.field_Pb.field_t;
            var15Lifetime1 = var7Lifetime1 + this.field_Pb.field_D;
            var17Lifetime1 = this.field_Pb.field_K + (var11Lifetime1 - this.field_E) * 0.1;
            var19Lifetime1 = this.field_Pb.field_G + 0.1 * (-this.field_t + var13Lifetime1);
            var17Lifetime1 = var17Lifetime1 - this.field_K;
            var19Lifetime1 = var19Lifetime1 - this.field_G;
            var21Lifetime1 = this.field_Pb.field_L + 0.1 * (var15Lifetime1 - this.field_D);
            var21Lifetime1 = var21Lifetime1 - this.field_L;
            var9Lifetime1 = Math.sqrt(var21Lifetime1 * var21Lifetime1 + (var17Lifetime1 * var17Lifetime1 + var19Lifetime1 * var19Lifetime1));
            if (var9Lifetime1 > 0.04) {
              var9Lifetime1 = 0.04 / var9Lifetime1;
            } else {
              var9Lifetime1 = 1.0;
            }
            this.field_K = this.field_K + var9Lifetime1 * var17Lifetime1;
            this.field_G = this.field_G + var9Lifetime1 * var19Lifetime1;
            this.field_L = this.field_L + var9Lifetime1 * var21Lifetime1;
          }
        }
        if (param1 >= 94) {
          return;
        }
        this.j(-120);
    }

    final void a(int param0, int param1) {
        if (!this.field_Ob) {
          super.a(param0, param1);
          return;
        }
        if (this.field_fb.field_d == 0) {
          this.field_S = true;
          super.a(param0, param1);
          return;
        }
        super.a(param0, param1);
    }

    static {
        field_Nb = -1;
        field_Ib = "<col=FFFFFF>Extra life:</col> gives you another chance if you die! Always look out for these, as you can stockpile as many as you want, and you may need them later in the game. You start with two.";
    }
}
