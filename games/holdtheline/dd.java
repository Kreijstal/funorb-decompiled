/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends wd {
    qm field_P;
    float field_G;
    static String field_H;
    int field_I;
    int field_A;
    int field_z;
    float field_y;
    float field_D;
    int field_K;
    int field_L;
    static int[] field_E;
    int field_N;
    int field_M;
    int field_C;
    int field_O;
    float field_J;
    float field_B;
    qm field_R;
    int field_Q;

    final qm l(int param0) {
        if (param0 != 8421504) {
          this.field_C = 36;
        }
        if (3.141592653589793 == (double)this.field_y) {
          return new qm((int)((float)this.field_P.field_h + (float)this.field_L * this.field_D), (int)((float)this.field_P.field_f + (float)this.field_L * this.field_B));
        }
        return this.c(1.0f, 94);
    }

    final qm a(int param0, float param1) {
        float var3 = (float)this.c(36, param1);
        if (param0 != -851) {
          this.a(0.5826309323310852f, true);
        }
        float var4 = var3 * this.field_D + (param1 * (float)(this.field_P.field_h - this.field_R.field_h) + (float)this.field_R.field_h);
        float var5 = var3 * this.field_B + ((float)this.field_R.field_f + (float)(this.field_P.field_f - this.field_R.field_f) * param1);
        return new qm((int)var4, (int)var5);
    }

    final qm p(int param0) {
        float var2 = -((float)this.field_Q * this.field_D) + (float)this.field_R.field_h;
        if (param0 != -1) {
          this.a((byte) -67);
        }
        float var3 = (float)this.field_R.field_f - (float)this.field_Q * this.field_B;
        return new qm((int)var2, (int)var3);
    }

    final qm a(boolean param0, float param1) {
        float var3 = (float)this.field_R.field_h + (float)(-this.field_R.field_h + this.field_P.field_h) * param1;
        float var4 = (float)this.field_R.field_f + (float)(this.field_P.field_f - this.field_R.field_f) * param1;
        if (param0) {
          this.a(-19, -1.8915660381317139f);
        }
        return new qm((int)var3, (int)var4);
    }

    final qm a(byte param0) {
        if (3.141592653589793 == (double)this.field_y) {
          return new qm((int)((float)this.field_P.field_h + (float)this.field_C * this.field_D), (int)((float)this.field_P.field_f + this.field_B * (float)this.field_C));
        }
        if (param0 != 29) {
          this.o(-11);
        }
        return this.a(1.0f, false);
    }

    final qm a(float param0, int param1) {
        float var3 = (float)this.b((byte) -125, param0);
        if (param1 != 255) {
          this.field_J = 0.6247459650039673f;
        }
        float var4 = (float)(-this.field_R.field_h + this.field_P.field_h) * param0 + (float)this.field_R.field_h + this.field_D * var3;
        float var5 = this.field_B * var3 + (param0 * (float)(this.field_P.field_f - this.field_R.field_f) + (float)this.field_R.field_f);
        return new qm((int)var4, (int)var5);
    }

    final void b(int param0, float param1) {
        if (param0 <= 12) {
          return;
        }
        this.field_D = (float)Math.cos((double)param1);
        this.field_B = -(float)Math.sin((double)param1);
    }

    private final int b(byte param0, float param1) {
        if (param0 > -120) {
          byte[] var4 = (byte[]) null;
          dd.a((byte) -17, (byte[]) null);
        }
        return (int)((float)this.field_O + this.e(param1, 6) * (float)(-this.field_O + this.field_N));
    }

    private final float e(float param0, int param1) {
        int var3 = -12 / ((86 - param1) / 38);
        return (1.0f - (float)Math.cos((double)((-this.field_G + this.field_y) * param0 + this.field_G))) / 2.0f;
    }

    final int c(int param0, float param1) {
        if (param0 < 33) {
          dd.a(55, (byte) -61);
        }
        return (int)((float)this.field_z + this.e(param1, 124) * (float)(this.field_A - this.field_z));
    }

    final static ql a(byte param0, byte[] param1) {
        ql var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ql stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new ql(param1, la.field_j, wb.field_g, nk.field_K, ad.field_d, field_E, lk.field_e);
          var3 = 26 / ((param0 - 56) / 51);
          tk.a(false);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("dd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final qm c(float param0, int param1) {
        float var3 = (float)this.d(param0, 0);
        float var4 = var3 * this.field_D + ((float)this.field_R.field_h + (float)(-this.field_R.field_h + this.field_P.field_h) * param0);
        if (param1 < 90) {
          this.field_Q = 69;
        }
        float var5 = this.field_B * var3 + (param0 * (float)(-this.field_R.field_f + this.field_P.field_f) + (float)this.field_R.field_f);
        return new qm((int)var4, (int)var5);
    }

    final qm m(int param0) {
        if ((double)this.field_y == 3.141592653589793) {
          return new qm((int)((float)this.field_A * this.field_D + (float)this.field_P.field_h), (int)((float)this.field_P.field_f + this.field_B * (float)this.field_A));
        }
        if (param0 != -14) {
          dd.a(-103, -92, 89, -67, (byte) -96);
        }
        return this.a(-851, 1.0f);
    }

    final qm h(int param0) {
        if (3.141592653589793 == (double)this.field_y) {
          return new qm((int)((float)this.field_P.field_h + this.field_D * (float)this.field_N), (int)(this.field_B * (float)this.field_N + (float)this.field_P.field_f));
        }
        if (param0 != 7560980) {
          this.field_A = 66;
        }
        return this.a(1.0f, 255);
    }

    final static void a(int param0, int param1, boolean param2, sd param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          gb.field_x[0] = ha.field_n.nextInt();
          gb.field_x[1] = ha.field_n.nextInt();
          vl.field_a.field_l = 0;
          gb.field_x[2] = (int)(qj.field_H >> 32);
          gb.field_x[3] = (int)qj.field_H;
          vl.field_a.a((byte) -58, gb.field_x[0]);
          vl.field_a.a((byte) -58, gb.field_x[1]);
          vl.field_a.a((byte) -58, gb.field_x[2]);
          vl.field_a.a((byte) -58, gb.field_x[3]);
          q.a(125, vl.field_a);
          vl.field_a.b(-652561784, param1);
          param3.a(0, vl.field_a);
          da.field_p.field_l = 0;
          if (param4) {
            da.field_p.f(param0 ^ 111, 18);
          } else {
            da.field_p.f(111, 16);
          }
          da.field_p.field_l = da.field_p.field_l + 2;
          var5_int = da.field_p.field_l;
          da.field_p.a((byte) -58, oi.field_b);
          da.field_p.a((byte) -84, ih.field_i);
          var6 = param0;
          if (hc.field_b) {
            var6 = var6 | 1;
          }
          if (mi.field_f) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (null != ok.field_f) {
            var6 = var6 | 16;
          }
          da.field_p.f(111, var6);
          var7 = ph.a((byte) -48, en.a(113));
          if (var7 == null) {
            var7 = "";
          }
          da.field_p.c(-74, var7);
          if (ok.field_f != null) {
            da.field_p.a(29336, ok.field_f);
          }
          dg.a(false, ff.field_a, vl.field_a, da.field_p, ho.field_k);
          da.field_p.g(-29190, da.field_p.field_l - var5_int);
          qn.a(-1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final qm a(int param0) {
        if (param0 != 0) {
          return (qm) null;
        }
        return this.field_P;
    }

    final static void a(int param0, int param1, hj param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var5_int = param3 + (param1 * tc.field_j - 1);
          var6 = 0;
          if (param0 != 7090) {
            return;
          }
          for (var7 = param2.field_y; var7 > 0; var7--) {
            for (var8 = param2.field_s; var8 > 0; var8--) {
              if (param2.field_z[var6] != 0) {
                if (param2.field_z[var6] == 16777215) {
                  var5_int++;
                  tc.field_b[var5_int] = param4;
                } else {
                  var5_int++;
                  tc.field_b[var5_int] = param2.field_z[var6];
                }
              } else {
                var5_int++;
              }
              var6++;
            }
            var5_int = var5_int + (tc.field_j - param2.field_s);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("dd.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        hn.field_M = param3;
        if (param4 > -55) {
          byte[] var6 = (byte[]) null;
          dd.a((byte) -63, (byte[]) null);
        }
        gh.field_i = param0;
        wg.field_b = param1;
        w.field_b = param2;
    }

    final qm c(boolean param0) {
        if (!param0) {
          this.g(34);
        }
        if (0.0f == this.field_G) {
          return new qm((int)(this.field_D * (float)this.field_O + (float)this.field_R.field_h), (int)((float)this.field_R.field_f + (float)this.field_O * this.field_B));
        }
        return this.a(0.0f, 255);
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        fo var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          var4 = (fo) (ji.field_a.b((byte) 91));
          if (param1 < 8) {
            field_H = (String) null;
          }
          while (var4 != null) {
            v.a(3, param0, var4);
            var4 = (fo) (ji.field_a.c((byte) -120));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "dd.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final qm n(int param0) {
        if (this.field_G == 0.0f) {
          return new qm((int)((float)this.field_z * this.field_D + (float)this.field_R.field_h), (int)((float)this.field_z * this.field_B + (float)this.field_R.field_f));
        }
        if (param0 != 3337) {
          this.field_K = -37;
        }
        return this.a(-851, 0.0f);
    }

    final qm k(int param0) {
        if (param0 != 255) {
          return (qm) null;
        }
        if (0.0f == this.field_G) {
          return new qm((int)((float)this.field_R.field_h + this.field_D * (float)this.field_K), (int)((float)this.field_R.field_f + (float)this.field_K * this.field_B));
        }
        return this.c(0.0f, 112);
    }

    final qm b(byte param0) {
        float var2 = (float)this.field_P.field_h - (float)this.field_M * this.field_D;
        float var3 = (float)this.field_P.field_f - this.field_B * (float)this.field_M;
        if (param0 >= -65) {
          this.field_Q = -102;
        }
        return new qm((int)var2, (int)var3);
    }

    final qm a(float param0, boolean param1) {
        float var3 = (float)this.b(param0, true);
        float var4 = (float)this.field_R.field_h + param0 * (float)(this.field_P.field_h - this.field_R.field_h) + this.field_D * var3;
        if (param1) {
          field_H = (String) null;
        }
        float var5 = (float)this.field_R.field_f + (float)(-this.field_R.field_f + this.field_P.field_f) * param0 + this.field_B * var3;
        return new qm((int)var4, (int)var5);
    }

    final in a(boolean param0) {
        if (param0) {
          this.c(93, -0.584915816783905f);
        }
        return this.g(-1);
    }

    private final int b(float param0, boolean param1) {
        if (!param1) {
          this.field_G = -0.8879954218864441f;
        }
        return (int)((float)this.field_I + this.e(param0, 124) * (float)(-this.field_I + this.field_C));
    }

    public static void c(byte param0) {
        field_H = null;
        field_E = null;
        if (param0 > -14) {
          dd.a(-28, -9, -41, 91, (byte) 43);
        }
    }

    final qm o(int param0) {
        if (param0 != -14) {
          return (qm) null;
        }
        if (0.0f == this.field_G) {
          return new qm((int)((float)this.field_R.field_h + this.field_D * (float)this.field_I), (int)(this.field_B * (float)this.field_I + (float)this.field_R.field_f));
        }
        return this.a(0.0f, false);
    }

    final in a(byte param0, float param1) {
        if (param0 <= 117) {
          return (in) null;
        }
        return this.g(-1);
    }

    final int d(float param0, int param1) {
        if (param1 != 0) {
          return -16;
        }
        return (int)((float)this.field_K + this.e(param0, param1 + 35) * (float)(this.field_L - this.field_K));
    }

    final static qm a(int param0, in param1, ei param2, int param3, qm param4) {
        int var7 = 0;
        int var9 = 0;
        qm stackIn_19_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        Object var6 = null;
        ei var8 = null;
        lb var10 = null;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var15 = 0;
        in var16 = null;
        in var17 = null;
        float var13Lifetime1;
        var15 = HoldTheLine.field_D;
        try {
          var5_float = 0.0f;
          var6 = null;
          for (var7 = param0; param2.field_e > var7; var7++) {
            var8 = (ei) (param2.field_b[var7]);
            for (var9 = 0; var9 < var8.field_e; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = (lb) (var8.field_b[var9]);
              if (-var10.field_k + param3 >= -1 &&
                param3 - var10.field_k <= 1) {
                var11 = (-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + var10.field_s.field_f) + (param4.field_h - var10.field_r.field_h) * (var10.field_s.field_h - var10.field_r.field_h);
                if (0 <= var11 &&
                  var10.i(-120) >= var11) {
                  var17 = var10.g(-1).a((byte) 64);
                  var12 = Math.abs(var17.a(new in(var10.field_r, param4), (byte) -10));
                  var13 = var12 * var12;
                  if ((var6 == null ||
                    (var5_float > var13))) {
                    var5_float = var13;
                    var6 = var10.a(false, (float)var11 / (float)var10.i(-125));
                    if ((param1 != null)) {
                      param1.field_g = var17.field_g;
                      param1.field_j = var17.field_j;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var11 >= 0) {
                    var13Lifetime1 = (float)((param4.field_h - var10.field_s.field_h) * (param4.field_h - var10.field_s.field_h) + (param4.field_f - var10.field_s.field_f) * (-var10.field_s.field_f + param4.field_f));
                  } else {
                    var13Lifetime1 = (float)((param4.field_h - var10.field_r.field_h) * (-var10.field_r.field_h + param4.field_h) + (-var10.field_r.field_f + param4.field_f) * (-var10.field_r.field_f + param4.field_f));
                  }
                  if (var6 == null ||
                    var13Lifetime1 < var5_float) {
                    var5_float = var13Lifetime1;
                    if (var11 < 0) {
                      stackIn_19_0 = var10.field_r;
                    } else {
                      stackIn_19_0 = var10.field_s;
                    }
                    var6 = stackIn_19_0;
                    var16 = var10.g(-1).a((byte) -111);
                    if (param1 != null) {
                      param1.field_j = var16.field_j;
                      param1.field_g = var16.field_g;
                    }
                  }
                }
              }
            }
          }
          stackIn_30_0 = var6;
          return (qm) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("dd.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final qm b(float param0, int param1) {
        if (param1 != 7560980) {
          this.field_A = -56;
        }
        float var3 = (float)(this.field_M - this.field_Q) * param0 + (float)this.field_Q;
        float var4 = (float)(-this.field_R.field_h + this.field_P.field_h) * param0 + (float)this.field_R.field_h - var3 * this.field_D;
        float var5 = (float)this.field_R.field_f + param0 * (float)(this.field_P.field_f - this.field_R.field_f) - this.field_B * var3;
        return new qm((int)var4, (int)var5);
    }

    final float f(int param0) {
        if (param0 != 50) {
          return 1.8018358945846558f;
        }
        return this.field_J;
    }

    final in g(int param0) {
        if (param0 != -1) {
          this.field_M = 97;
        }
        return new in(this.field_B, -this.field_D);
    }

    dd(qm param0, qm param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17, boolean param18, float param19, float param20, float param21) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var23 = null;
        try {
          this.field_o = 0.0f;
          this.field_R = param0;
          this.field_L = param9;
          this.field_z = param8;
          this.field_N = param5;
          this.field_Q = param11;
          this.field_A = param10;
          this.field_C = param6;
          stackIn_4_1 = (param18);
          this.field_q = stackIn_4_1;
          stackIn_7_1 = (param16);
          this.field_x = stackIn_7_1;
          this.field_y = param21;
          stackIn_10_1 = (param14);
          this.field_s = stackIn_10_1;
          stackIn_13_1 = (param17);
          this.field_t = stackIn_13_1;
          this.field_G = param20;
          this.field_K = param7;
          this.field_P = param1;
          stackIn_16_1 = (param13);
          this.field_w = stackIn_16_1;
          this.field_I = param4;
          this.field_O = param3;
          this.field_M = param12;
          this.field_k = param2;
          stackIn_19_1 = (param15);
          this.field_m = stackIn_19_1;
          this.field_J = (float)Math.sqrt((double)((this.field_P.field_f - this.field_R.field_f) * (-this.field_R.field_f + this.field_P.field_f) + (-this.field_R.field_h + this.field_P.field_h) * (this.field_P.field_h - this.field_R.field_h)));
          this.b(51, param19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var23 = decompiledCaughtException;
          stackIn_23_0 = var23;
          stackIn_23_1 = new StringBuilder().append("dd.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(',').append(param21).append(')').toString());
        }
    }

    static {
        field_H = "Highscores";
    }
}
