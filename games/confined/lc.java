/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private int field_s;
    private int[][] field_p;
    double field_G;
    private double[] field_w;
    double field_i;
    private double[] field_d;
    int field_a;
    double field_c;
    private double[] field_F;
    int field_D;
    private int field_C;
    private double field_h;
    static bj field_J;
    private double[] field_m;
    static int field_z;
    double[] field_x;
    private int[][] field_b;
    double field_H;
    int field_f;
    double field_B;
    double[] field_r;
    double[][] field_n;
    private int[][] field_E;
    double field_u;
    private int field_q;
    private double field_j;
    static String[] field_l;
    double[][] field_v;
    double[] field_g;
    private double[] field_A;
    private double field_e;
    private int field_I;
    int field_t;
    pm[] field_y;
    private int[][] field_k;
    private double[][] field_o;

    public static void a(byte param0) {
        field_J = null;
        if (param0 != 83) {
          lc.b((byte) 64);
        }
        field_l = null;
    }

    private final void a(double param0, int param1, int param2, int param3, double param4) {
        int var8 = 0;
        int var10 = 0;
        int var9;
        int var11;
        var11 = Confined.field_J ? 1 : 0;
        this.field_q = param2;
        this.field_t = -1 + this.field_a;
        if (param3 > this.field_f) {
          for (var8 = -1 + param3; var8 > 0; var8--) {
            var9 = (1 + var8 * 2) * this.field_f / param3 >> 1;
            if (~var9 != ~var8) {
              for (var10 = 0; this.field_a > var10; var10++) {
                this.field_v[var10][var8] = this.field_v[var10][var9];
                this.field_n[var10][var8] = this.field_n[var10][var9];
              }
              continue;
            }
            break;
          }
          this.field_f = param3;
          this.field_s = param3;
        } else {
          this.field_s = param3;
          if (this.field_f > param3) {
            this.field_I = this.field_a;
          }
        }
        this.field_H = this.field_i;
        this.field_D = this.field_a;
        this.field_e = param4;
        this.field_i = param0;
        if (param1 != 2) {
          this.field_x = (double[]) null;
        }
    }

    final boolean a(double param0, double param1, byte param2, int param3) {
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int incrementValue$0 = 0;
        int var19 = Confined.field_J ? 1 : 0;
        double[] var23 = this.field_v[param3];
        double[] var21 = var23;
        double[] var20 = var21;
        double[] var7 = var20;
        double[] var24 = this.field_n[param3];
        int var9 = -1 + this.field_f;
        if (param2 <= 4) {
          return false;
        }
        int var10 = 0;
        while (this.field_f > var10) {
          var11 = var23[var9];
          var13 = var24[var9];
          var15 = -var11 + var23[var10];
          var17 = -var13 + var24[var10];
          if (0.0 > var17 * (-var11 + param1) - var15 * (param0 - var13)) {
            return true;
          }
          incrementValue$0 = var10;
          var10++;
          var9 = incrementValue$0;
        }
        return false;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13684) {
            stackIn_4_0 = ck.a(false, param0, false);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lc.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (!param0) {
            lc.b((byte) -58);
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!ih.a(param0, (char) var3) &&
              !hc.a((char) var3, -58)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kg var16 = null;
        kg var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Confined.field_J ? 1 : 0;
        try {
          var16 = new kg(param1);
          var17 = var16;
          var17.field_n = -2 + param1.length;
          wc.field_hc = var17.a((byte) 25);
          rj.field_f = new byte[wc.field_hc][];
          un.field_i = new byte[wc.field_hc][];
          jl.field_p = new int[wc.field_hc];
          ij.field_r = new int[wc.field_hc];
          sd.field_f = new int[wc.field_hc];
          rg.field_I = new int[wc.field_hc];
          pa.field_e = new boolean[wc.field_hc];
          var17.field_n = -(8 * wc.field_hc) + param1.length - 7;
          kb.field_a = var17.a((byte) 25);
          em.field_e = var17.a((byte) 25);
          var3 = 1 + (255 & var17.c(32));
          for (var4 = 0; wc.field_hc > var4; var4++) {
            jl.field_p[var4] = var16.a((byte) 25);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < wc.field_hc; var4Lifetime1++) {
            ij.field_r[var4Lifetime1] = var17.a((byte) 25);
          }
          for (var4Lifetime2 = 0; wc.field_hc > var4Lifetime2; var4Lifetime2++) {
            rg.field_I[var4Lifetime2] = var17.a((byte) 25);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < wc.field_hc; var4Lifetime3++) {
            sd.field_f[var4Lifetime3] = var17.a((byte) 25);
          }
          var17.field_n = 3 - (3 * var3 - (-(8 * wc.field_hc) + param1.length) + 7);
          an.field_p = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            an.field_p[var4Lifetime4] = var17.f(-48);
            if (an.field_p[var4Lifetime4] == 0) {
              an.field_p[var4Lifetime4] = 1;
            }
          }
          var17.field_n = 0;
          if (param0) {
            field_l = (String[]) null;
          }
          for (var4Lifetime5 = 0; wc.field_hc > var4Lifetime5; var4Lifetime5++) {
            var5 = rg.field_I[var4Lifetime5];
            var6 = sd.field_f[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            rj.field_f[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            un.field_i[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.c(32);
            if ((1 & var11) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.b(true);
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var17.b(true);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (var13 == -1) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var17.b(true);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var17.b(true);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (-1 == var14) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            pa.field_e[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = Confined.field_J ? 1 : 0;
        if (param0 > ~this.field_a) {
          this.field_a = this.field_a - 1;
          for (var2 = 0; var2 < this.field_a; var2++) {
            this.field_m[var2] = this.field_m[1 + var2];
            this.field_A[var2] = this.field_A[1 + var2];
            this.field_r[var2] = this.field_r[var2 + 1];
            this.field_v[var2] = this.field_v[var2 + 1];
            this.field_n[var2] = this.field_n[var2 + 1];
          }
        }
    }

    final void c(byte param0) {
        int var5 = 0;
        int var7 = 0;
        int var2;
        int var6;
        int var8;
        double[] var15;
        double[] var16;
        var8 = Confined.field_J ? 1 : 0;
        var15 = this.field_v[0];
        var16 = this.field_n[0];
        for (var2 = 0; this.field_a - 1 > var2; var2++) {
          this.field_m[var2] = this.field_m[var2 + 1];
          this.field_A[var2] = this.field_A[1 + var2];
          this.field_r[var2] = this.field_r[1 + var2];
          this.field_v[var2] = this.field_v[var2 + 1];
          this.field_n[var2] = this.field_n[var2 + 1];
        }
        if (param0 > -11) {
          return;
        }
        this.field_v[var2] = var15;
        this.field_n[var2] = var16;
        if (this.field_t > 0) {
          this.field_t = this.field_t - 1;
          if (0 == this.field_t) {
            this.field_C = this.field_q;
          }
        }
        if (this.field_I > 0) {
          this.field_I = this.field_I - 1;
          if (this.field_I == 0) {
            for (var5 = 0; var5 < this.field_s; var5++) {
              var6 = (1 + var5 * 2) * this.field_f / this.field_s >> 1;
              if (~var5 != ~var6) {
                for (var7 = 0; this.field_a > var7; var7++) {
                  this.field_v[var7][var5] = this.field_v[var7][var6];
                  this.field_n[var7][var5] = this.field_n[var7][var6];
                }
              }
            }
            this.field_f = this.field_s;
          }
        }
        if (this.field_D > 0) {
          this.field_D = this.field_D - 1;
        }
        this.a((byte) -99, this.field_r[var2 - 1] + this.field_j, var2);
    }

    final void a(double param0, double param1, int param2, int param3) {
        int var16_int = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = Confined.field_J ? 1 : 0;
        double var8Lifetime1;
        this.b(3, param3, param0);
        this.a(param2 + 18081, param3, param0);
        int var7 = 0;
        double var8 = 0.0;
        double var10 = -this.field_B + this.field_x[-1 + this.field_f];
        double var12 = this.field_g[this.field_f - 1] - this.field_G;
        double var14 = Math.sqrt(var12 * var12 + var10 * var10);
        var14 = 1.0 - param1 / var14;
        var12 = var12 * var14;
        var10 = var10 * var14;
        for (var16_int = param2; this.field_f > var16_int; var16_int++) {
          var17 = -this.field_B + this.field_x[var16_int];
          var19 = this.field_g[var16_int] - this.field_G;
          var14 = Math.sqrt(var19 * var19 + var17 * var17);
          var14 = 1.0 - param1 / var14;
          var19 = var19 * var14;
          var17 = var17 * var14;
          var21 = (var17 * var12 - var10 * var19) * 0.5;
          if (Math.random() * (var8 + var21) >= var8) {
            var7 = var16_int;
          }
          var8 = var8 + var21;
          var12 = var19;
          var10 = var17;
        }
        if (var7 != 0) {
          var10 = this.field_g[var7 - 1] - this.field_G;
          var8Lifetime1 = this.field_x[-1 + var7] - this.field_B;
        } else {
          var10 = this.field_g[-1 + this.field_f] - this.field_G;
          var8Lifetime1 = -this.field_B + this.field_x[-1 + this.field_f];
        }
        var12 = this.field_x[var7] - this.field_B;
        var14 = -this.field_G + this.field_g[var7];
        double var16 = Math.sqrt(var8Lifetime1 * var8Lifetime1 + var10 * var10);
        var16 = -(param1 / var16) + 1.0;
        var10 = var10 * var16;
        var8Lifetime1 = var8Lifetime1 * var16;
        var16 = Math.sqrt(var12 * var12 + var14 * var14);
        var16 = -(param1 / var16) + 1.0;
        var14 = var14 * var16;
        var12 = var12 * var16;
        double var18 = Math.sqrt(Math.random());
        double var20 = var18 * Math.random();
        var18 = 1.0 - var18;
        pn.field_h = this.field_B + var8Lifetime1 * var18 + var12 * var20;
        fa.field_R = this.field_G + var10 * var18 + var20 * var14;
    }

    final static in b(byte param0) {
        if (param0 > -36) {
          field_l = (String[]) null;
        }
        if (ml.field_a == oe.field_Q) {
          throw new IllegalStateException();
        }
        if (oe.field_Q == b.field_a) {
          oe.field_Q = ml.field_a;
          return ji.field_d;
        }
        return null;
    }

    final double a(byte param0, double param1) {
        double var4 = this.field_w[0];
        if (param0 != 78) {
          return 0.30774124675712633;
        }
        double var6 = this.field_w[1];
        if (var6 > var4) {
          var4 = var6;
        }
        return (-(2.0 * var4) + 1.0) * (this.field_i * rk.field_l[this.field_f]) - param1;
    }

    private final void a(byte param0, double param1, int param2) {
        int var38 = 0;
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
        double var24;
        double var26;
        double var28;
        double var30;
        double var32;
        double var34;
        int var36;
        int var37;
        int var39;
        int var40;
        int var23Lifetime1;
        double var24Lifetime1;
        var39 = Confined.field_J ? 1 : 0;
        this.field_r[param2] = param1;
        var5 = this.field_w[0];
        var5 = -var5 + 1.0 + Math.cos(this.field_d[0]) * var5;
        var7 = this.field_w[1];
        var7 = -var7 + 1.0 + Math.cos(this.field_d[1]) * var7;
        var9 = this.field_w[2] * Math.sin(this.field_d[2]);
        var11 = this.field_w[3] * Math.sin(this.field_d[3]);
        var13 = this.field_h + this.field_w[4] * Math.sin(this.field_d[4]);
        var15 = Math.sin(var13);
        var17 = Math.cos(var13);
        this.field_m[param2] = var9 * var17 - var11 * var15;
        this.field_A[param2] = var9 * var15 + var17 * var11;
        var19 = Math.cos(6.283185307179586 / (double)this.field_s);
        var21 = this.field_e * (this.field_i * 2.0) * (-var19 + 1.0) / (1.0 + var19);
        for (var23 = 0; var23 < this.field_s; var23++) {
          var24 = ((double)(1 + 2 * var23) + (Math.random() - 0.5) * this.field_e) / (double)this.field_s * 3.141592653589793;
          var26 = this.field_i + var21 * (-0.5 + Math.random());
          var28 = Math.sin(var24) * var26 * var5 + var9;
          var30 = Math.cos(var24) * var26 * var7 + var11;
          var32 = -(var30 * var15) + var17 * var28;
          var34 = var30 * var17 + var15 * var28;
          if (this.field_I > 0) {
            var36 = (2 * (var23 * this.field_f) + this.field_s) / (this.field_s << 1);
            var37 = (this.field_f * (var23 + 1) * 2 + this.field_s) / (this.field_s << 1);
            for (var38 = var36; var38 < var37; var38++) {
              this.field_v[param2][var38] = var32;
              this.field_n[param2][var38] = var34;
            }
          } else {
            this.field_v[param2][var23] = var32;
            this.field_n[param2][var23] = var34;
          }
        }
        if (param0 != -99) {
          this.a(126);
        }
        var40 = 0;
        var23Lifetime1 = var40;
        while (5 > var40) {
          var24Lifetime1 = this.field_d[var40] + this.field_F[var40];
          if (var24Lifetime1 >= 6.283185307179586) {
            var24Lifetime1 = var24Lifetime1 - 6.283185307179586;
          }
          this.field_d[var40] = var24Lifetime1;
          var40++;
        }
    }

    final void a(int param0, int param1, double param2) {
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        if (param0 != 18081) {
          return;
        }
        double var5 = (-this.field_r[param1] + param2) / (this.field_r[param1 + 1] - this.field_r[param1]);
        for (var7 = 0; var7 < this.field_f; var7++) {
          this.field_x[var7] = this.field_v[param1][var7] + (-this.field_v[param1][var7] + this.field_v[param1 + 1][var7]) * var5;
          this.field_g[var7] = this.field_n[param1][var7] + var5 * (-this.field_n[param1][var7] + this.field_n[1 + param1][var7]);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        mk.b(128);
        fn.f(param0, param3, param1, param2);
        if (param4 != 14907) {
          CharSequence var6 = (CharSequence) null;
          lc.a((CharSequence) null, -78);
        }
    }

    final void a(boolean param0, double param1, mn param2, vg param3) {
        int var6_int = 0;
        int var8 = 0;
        int var11 = 0;
        int var10 = 0;
        double[] dupTemp$0 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi var6 = null;
        double var6_double = 0.0;
        RuntimeException var6_ref = null;
        int var7 = 0;
        double var8_double = 0.0;
        double var9 = 0.0;
        double var11_double = 0.0;
        double var12 = 0.0;
        double var13 = 0.0;
        double var14 = 0.0;
        double var15 = 0.0;
        double var16 = 0.0;
        double var17 = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var19_double = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int var7Lifetime1;
        var23 = Confined.field_J ? 1 : 0;
        try {
          for (var6_int = 0; this.field_a > var6_int; var6_int++) {
            for (var7 = 0; this.field_f > var7; var7++) {
              this.field_o[var6_int][var7] = 0.0;
            }
          }
          if (param0) {
            this.field_H = -0.12402089679050932;
          }
          var6 = (oi) (param2.a(-118));
          while (true) {
            if (var6 == null) {
              var6_double = (double)ua.a(true);
              for (var8 = 0; var8 < this.field_a; var8++) {
                var9 = -param3.field_O + this.field_r[var8];
                for (var11 = 0; this.field_f > var11; var11++) {
                  var12 = this.field_v[var8][var11] - param3.field_T;
                  var14 = -param3.field_L + this.field_n[var8][var11];
                  this.field_b[var8][var11] = (int)(32.0 * (var14 * param3.field_ab + param3.field_R * var12 + var9 * param3.field_M));
                  this.field_p[var8][var11] = (int)((var14 * param3.field_U + var12 * param3.field_V + param3.field_F * var9) * 32.0);
                  this.field_k[var8][var11] = (int)(32.0 * (param3.field_H * var14 + var12 * param3.field_P + param3.field_N * var9) * 0.8);
                  var16 = (48.0 + 16.0 * this.field_o[var8][var11]) * (-(var9 / param1) + 1.0);
                  if (var16 < 0.0) {
                    var16 = 0.0;
                  }
                  var16 = qn.field_v.a(var16, 0, this.field_r[var8]);
                  var16 = 128.0 * Math.pow(var16 / 128.0, var6_double);
                  var18 = (int)var16;
                  if (126 < var18) {
                    var18 = 126;
                  } else {
                    if (var18 < 2) {
                      var18 = 2;
                    }
                  }
                  var19 = 32 - (int)(var9 * 2.0);
                  if (var18 < var19) {
                    var18 = var19;
                  }
                  this.field_E[var8][var11] = var18;
                }
              }
              return;
            }
            for (var7Lifetime1 = 0; this.field_a > var7Lifetime1; var7Lifetime1++) {
              if (var6.field_p - var6.field_n > this.field_r[var7Lifetime1]) {
                continue;
              }
              break;
            }
            while (true) {
              stackIn_17_0 = ~this.field_a;
              if (stackIn_17_0 < ~var7Lifetime1 &&
                var6.field_n + var6.field_p > this.field_r[var7Lifetime1]) {
                var8_double = var6.field_p - this.field_r[var7Lifetime1];
                for (var10 = 0; var10 < this.field_f; var10++) {
                  var11_double = var6.field_t - this.field_v[var7Lifetime1][var10];
                  var13 = var6.field_o - this.field_n[var7Lifetime1][var10];
                  var15 = var8_double * var8_double + (var11_double * var11_double + var13 * var13);
                  if (var15 < 0.01) {
                    var15 = 0.01;
                  }
                  var17 = Math.sqrt(var15);
                  var19_double = var6.field_u;
                  if (var6.field_w) {
                    var19_double = var19_double * (-(var6.field_m * var11_double + var13 * var6.field_x + var8_double * var6.field_v) / var17);
                    if (!(0.0 >= var19_double)) {
                      var21 = var19_double / var15;
                      dupTemp$0 = this.field_o[var7Lifetime1];
                      dupTemp$0[var10] = dupTemp$0[var10] + var21;
                    }
                  } else {
                    var21 = var19_double / var15;
                    dupTemp$0 = this.field_o[var7Lifetime1];
                    dupTemp$0[var10] = dupTemp$0[var10] + var21;
                  }
                }
                var7Lifetime1++;
                continue;
              }
              break;
            }
            var6 = (oi) (param2.d(2123));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_49_0 = var6_ref;
          stackIn_49_1 = new StringBuilder().append("lc.S(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param3 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, double param2) {
        double var5 = (param2 - this.field_r[param1]) / (-this.field_r[param1] + this.field_r[param1 + 1]);
        if (param0 != 3) {
          this.b(-19, 17, -0.38255538627726915);
        }
        this.field_B = this.field_m[param1] + (-this.field_m[param1] + this.field_m[1 + param1]) * var5;
        this.field_G = (this.field_A[1 + param1] - this.field_A[param1]) * var5 + this.field_A[param1];
    }

    final void a(byte param0, ql param1) {
        int var3_int = 0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = Confined.field_J ? 1 : 0;
        double var7Lifetime1;
        double var9Lifetime1;
        double var11Lifetime1;
        try {
          var3_int = param1.field_o;
          int var4 = 105 / ((-46 - param0) / 53);
          this.a(vb.field_a[var3_int], 2, h.field_V[var3_int], ag.field_g[var3_int], ej.field_a[var3_int]);
          var5 = this.field_h;
          var7 = this.field_w[2] * Math.sin(this.field_d[2]);
          var9 = this.field_w[3] * Math.sin(this.field_d[3]);
          var11 = this.field_w[4] * Math.sin(this.field_d[4]) + var5;
          var13 = Math.sin(var11);
          var15 = Math.cos(var11);
          this.field_u = this.field_u + (var15 * var7 - var9 * var13);
          this.field_c = this.field_c + (var7 * var13 + var15 * var9);
          this.field_h = this.field_h + var11;
          for (var17 = 0; var17 < 5; var17++) {
            this.field_w[var17] = ag.field_a[10 * var3_int + 2 * var17];
            this.field_F[var17] = ag.field_a[1 + (2 * var17 + 10 * var3_int)];
          }
          var7Lifetime1 = this.field_w[2] * Math.sin(this.field_d[2]);
          var9Lifetime1 = this.field_w[3] * Math.sin(this.field_d[3]);
          var11Lifetime1 = var5 + this.field_w[4] * Math.sin(this.field_d[4]);
          this.field_c = this.field_c - (var13 * var7Lifetime1 + var9Lifetime1 * var15);
          this.field_h = this.field_h - var11Lifetime1;
          this.field_u = this.field_u - (var7Lifetime1 * var15 - var13 * var9Lifetime1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "lc.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, vg param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        byte[] var26 = null;
        int[] stackIn_3_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var25 = Confined.field_J ? 1 : 0;
        try {
          stackIn_3_0 = rc.field_b;
          if (param0 >= this.field_t) {
            stackIn_4_1 = this.field_q;
          } else {
            stackIn_4_1 = this.field_C;
          }
          var4_int = stackIn_3_0[stackIn_4_1];
          var5 = -1 + this.field_f;
          for (var6 = 0; this.field_f > var6; var6++) {
            var7 = new int[]{this.field_b[param0][var6], this.field_b[1 + param0][var6], this.field_b[1 + param0][var5], this.field_b[param0][var5]};
            var8 = new int[]{this.field_p[param0][var6], this.field_p[1 + param0][var6], this.field_p[1 + param0][var5], this.field_p[param0][var5]};
            var9 = new int[]{this.field_k[param0][var6], this.field_k[1 + param0][var6], this.field_k[1 + param0][var5], this.field_k[param0][var5]};
            var10 = new int[]{this.field_E[param0][var6], this.field_E[param0 + 1][var6], this.field_E[param0 + 1][var5], this.field_E[param0][var5]};
            var11 = this.field_v[1 + param0][var5] - this.field_v[param0 + 1][var6];
            var13 = -this.field_n[1 + param0][var6] + this.field_n[param0 + 1][var5];
            var15 = -this.field_v[param0][var5] + this.field_v[param0 + 1][var5];
            var17 = this.field_n[param0 + 1][var5] - this.field_n[param0][var5];
            var19 = this.field_r[param0 + 1] - this.field_r[param0];
            var21 = -this.field_v[1 + param0][var6] + this.field_v[param0][var6];
            var23 = this.field_n[param0][var6] - this.field_n[1 + param0][var6];
            if (var19 * (-(var11 * (var17 + var23)) + var13 * (var21 + var15)) >= 0.0) {
              t.field_h[0] = var7[2] + (var7[0] - var7[1]);
              t.field_g[0] = -var8[1] + (var8[2] + var8[0]);
              t.field_o[0] = -var9[1] + var9[0] + var9[2];
              t.field_h[1] = var7[2];
              t.field_g[1] = var8[2];
              t.field_o[1] = var9[2];
              t.field_h[2] = var7[0];
              t.field_g[2] = var8[0];
              t.field_o[2] = var9[0];
              t.a(0, 2, var4_int, new int[]{var7[0], var7[1], var7[2]}, new int[]{var8[0], var8[1], var8[2]}, new int[]{var9[0], var9[1], var9[2]}, var10[0], var10[1], var10[2]);
              t.field_h[0] = var7[3];
              t.field_g[0] = var8[3];
              t.field_o[0] = var9[3];
              t.a(0, 2, var4_int, new int[]{var7[2], var7[3], var7[0]}, new int[]{var8[2], var8[3], var8[0]}, new int[]{var9[2], var9[3], var9[0]}, var10[2], var10[3], var10[0]);
            } else {
              t.field_h[0] = var7[3];
              t.field_g[0] = var8[3];
              t.field_o[0] = var9[3];
              t.field_h[1] = var7[1] + var7[3] - var7[0];
              t.field_g[1] = -var8[0] + (var8[1] + var8[3]);
              t.field_o[1] = var9[1] - (-var9[3] + var9[0]);
              t.field_h[2] = var7[0];
              t.field_g[2] = var8[0];
              t.field_o[2] = var9[0];
              t.a(0, 2, var4_int, new int[]{var7[3], var7[0], var7[1]}, new int[]{var8[3], var8[0], var8[1]}, new int[]{var9[3], var9[0], var9[1]}, var10[3], var10[0], var10[1]);
              t.field_h[1] = var7[2];
              t.field_g[1] = var8[2];
              t.field_o[1] = var9[2];
              t.field_h[2] = var7[3] + (var7[1] - var7[2]);
              t.field_g[2] = -var8[2] + (var8[1] + var8[3]);
              t.field_o[2] = -var9[2] + (var9[1] + var9[3]);
              t.a(0, 2, var4_int, new int[]{var7[1], var7[2], var7[3]}, new int[]{var8[1], var8[2], var8[3]}, new int[]{var9[1], var9[2], var9[3]}, var10[1], var10[2], var10[3]);
            }
            var5 = var6;
          }
          if (param2 != 3) {
            var26 = (byte[]) null;
            lc.a(true, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lc.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(double param0, double param1, double param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        double[] dupTemp$0 = null;
        double[] dupTemp$1 = null;
        int var10 = Confined.field_J ? 1 : 0;
        if (param3 != 14497) {
          field_J = (bj) null;
        }
        for (var8 = 0; this.field_a > var8; var8++) {
          this.field_m[var8] = this.field_m[var8] - param1;
          this.field_A[var8] = this.field_A[var8] - param0;
          this.field_r[var8] = this.field_r[var8] - param2;
          for (var9 = 0; this.field_f > var9; var9++) {
            dupTemp$0 = this.field_v[var8];
            dupTemp$0[var9] = dupTemp$0[var9] - param1;
            dupTemp$1 = this.field_n[var8];
            dupTemp$1[var9] = dupTemp$1[var9] - param0;
          }
        }
    }

    lc(int param0, int param1, int param2, double param3, double param4, double param5) {
        int var10 = 0;
        int var10Lifetime1;
        this.field_w = new double[5];
        this.field_F = new double[5];
        this.field_d = new double[5];
        this.field_y = new pm[param2];
        this.field_n = new double[param2][7];
        this.field_r = new double[param2];
        this.field_k = new int[param2][7];
        this.field_p = new int[param2][7];
        this.field_A = new double[param2];
        this.field_b = new int[param2][7];
        this.field_v = new double[param2][7];
        this.field_j = param3;
        this.field_o = new double[param2][7];
        this.field_i = param4;
        this.field_H = param4;
        this.field_x = new double[7];
        this.field_m = new double[param2];
        this.field_E = new int[param2][7];
        this.field_e = param5;
        this.field_g = new double[7];
        this.field_f = param1;
        this.field_s = param1;
        this.field_a = param2;
        this.field_C = param0;
        this.field_q = param0;
        this.field_D = 0;
        for (var10 = 0; var10 < 5; var10++) {
          this.field_w[var10] = ag.field_a[2 * var10];
          this.field_F[var10] = ag.field_a[var10 * 2 + 1];
        }
        for (var10Lifetime1 = 0; param2 > var10Lifetime1; var10Lifetime1++) {
          this.a((byte) -99, (double)var10Lifetime1 * param3, var10Lifetime1);
        }
    }

    static {
    }
}
