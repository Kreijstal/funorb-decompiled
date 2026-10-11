/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pm extends jl {
    double field_D;
    hn field_A;
    static nf[] field_w;
    double field_E;
    oi field_v;
    static bi field_x;
    static String[] field_B;
    double field_t;
    double field_C;
    pm field_y;
    boolean field_z;
    static String field_u;
    int field_s;

    final void d(int param0) {
        if (param0 != 10797) {
          this.f(90);
        }
        if (!this.field_z) {
          this.g(26402);
        }
    }

    void g(int param0) {
        this.field_z = true;
        if (param0 != 26402) {
          field_x = (bi) null;
        }
    }

    abstract void a(boolean param0, ee param1);

    abstract void a(int param0, ah param1);

    final ka a(byte param0, bi param1, double param2) {
        ka var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        ka stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 14 / ((-15 - param0) / 53);
          var5 = new ka(this, param2, param1);
          ri.a((rk) (this), 0, var5);
          this.field_z = true;
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("pm.JD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void a(int param0, vg param1);

    final void a(int param0, boolean param1, double param2, byte param3, od param4, da param5, vg param6, oi param7, mn param8, int param9) {
        od stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk var12 = null;
        RuntimeException var12_ref = null;
        double var13_double = 0.0;
        int[] var13 = null;
        int[] var14 = null;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        int var23 = 0;
        int[] var25 = null;
        int[] var27 = null;
        double[] var29 = null;
        try {
          if (param9 == 0) {
            this.a(param4, param5, param7, (byte) 64, param2, param8, param6, param0);
            return;
          }
          if (param9 != 256) {
            var29 = new double[12];
            param5.a((byte) 77, var29);
            var12 = this.a((double)(256 - param9) * 0.00390625, param4, var29, 2, param6, param2, param7, param8);
          } else {
            var13_double = -((this.field_D - param6.field_O) / param2) + 1.0;
            var13_double = qn.field_v.a(var13_double, 0, this.field_D);
            stackIn_6_0 = (od) (param4);
            if (!(var13_double > 0.0)) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = (int)(16.0 * var13_double);
            }
            var12 = (sk) (((od) (Object) stackIn_6_0).a(stackIn_7_1, 65536, 0, 0, -256));
          }
          var27 = new int[12];
          var25 = var27;
          var13 = var25;
          if (param3 != 44) {
            return;
          }
          var13[0] = (int)(this.field_E * (double)param0);
          var13[2] = (int)(this.field_D * (double)param0);
          var13[1] = (int)((double)param0 * this.field_t);
          param5.a(var27, -99);
          var14 = fn.field_h;
          fn.field_h = fd.field_e.field_z;
          var12.a(param6.a(param0, false), var27);
          fn.field_h = var14;
          var12.a();
          if (param1) {
            var15 = -param6.field_T + this.field_E;
            var17 = -param6.field_L + this.field_t;
            var19 = this.field_D - param6.field_O;
            var21 = param6.field_H * var17 + param6.field_P * var15 + var19 * param6.field_N;
            var23 = 8;
            if (0.15 <= var21) {
              var23 = (int)(0.02 / var21 * 640.0);
              if (var23 > 8) {
                var23 = 8;
              }
            }
            pm.b((int)qn.field_v.a((double)param9, param3 ^ 44, this.field_D) >> 2, var23);
          }
          fn.h(sk.field_u, sk.field_j, sk.field_h, sk.field_G);
          fd.field_e.a(0, 0, -(param9 >> 1) + 256);
          fn.field_h = fd.field_e.field_z;
          fn.e(0, 0, 640, 376, 0);
          fn.field_h = var14;
          fn.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_21_0 = var12_ref;
          stackIn_21_1 = new StringBuilder().append("pm.WD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param7 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param8 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param9).append(')').toString());
        }
    }

    abstract void a(boolean param0, il param1);

    final static void b(int param0, int param1) {
        int[] var2;
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
        int var14;
        int var15;
        int var16;
        int[] var17;
        int[] var19;
        byte[] var22;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        if (sk.field_u >= sk.field_h) {
          return;
        }
        if (sk.field_j >= sk.field_G) {
          return;
        }
        wb.field_b = param0;
        rk.field_j = param1;
        var19 = fd.field_e.field_z;
        var17 = var19;
        var2 = var17;
        var22 = wm.field_gb;
        var4 = sk.field_u - 1;
        var5 = sk.field_j - 1;
        var6 = sk.field_h + 1;
        var7 = sk.field_G + 1;
        if (var4 < 0) {
          var4 = 0;
        }
        if (var6 > 640) {
          var6 = 640;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var7 > 376) {
          var7 = 376;
        }
        var8 = var5 * 640 + var4;
        var9 = 640 - (var6 - var4) + 1;
        var4++;
        var6--;
        var5++;
        var7--;
        if (var19[var8] == 0 &&
          (var2[var8 + 1] | var2[var8 + 640]) != 0) {
          pm.a(var8, var4 - 1, var5 - 1);
        }
        var8++;
        for (var10 = var4; var10 < var6; var10++) {
          if (var19[var8] == 0 &&
            (var2[var8 - 1] | var2[var8 + 1] | var2[var8 + 640]) != 0) {
            pm.a(var8, var10, var5 - 1);
          }
          var8++;
        }
        if (var19[var8] == 0 &&
          (var2[var8 - 1] | var2[var8 + 640]) != 0) {
          pm.a(var8, var6, var5 - 1);
        }
        var8 = var8 + var9;
        for (var10Lifetime1 = var5; var10Lifetime1 < var7; var10Lifetime1++) {
          if (var19[var8] == 0 &&
            (var2[var8 + 1] | var2[var8 - 640] | var2[var8 + 640]) != 0) {
            pm.a(var8, var4 - 1, var10Lifetime1);
          }
          var8++;
          for (var11 = var4; var11 < var6; var11++) {
            if (var19[var8] == 0 &&
              (var2[var8 - 1] | var2[var8 + 1] | var2[var8 - 640] | var2[var8 + 640]) != 0) {
              pm.a(var8, var11, var10Lifetime1);
            }
            var8++;
          }
          if (var19[var8] == 0 &&
            (var2[var8 - 1] | var2[var8 - 640] | var2[var8 + 640]) != 0) {
            pm.a(var8, var6, var10Lifetime1);
          }
          var8 = var8 + var9;
        }
        if (var19[var8] == 0 &&
          (var2[var8 + 1] | var2[var8 - 640]) != 0) {
          pm.a(var8, var4 - 1, var7);
        }
        var8++;
        for (var10Lifetime2 = var4; var10Lifetime2 < var6; var10Lifetime2++) {
          if (var19[var8] == 0 &&
            (var2[var8 - 1] | var2[var8 + 1] | var2[var8 - 640]) != 0) {
            pm.a(var8, var10Lifetime2, var7);
          }
          var8++;
        }
        if (var19[var8] == 0 &&
          (var2[var8 - 1] | var2[var8 - 640]) != 0) {
          pm.a(var8, var6, var7);
        }
        var4 = var4 - rk.field_j;
        var6 = var6 + rk.field_j;
        var5 = var5 - rk.field_j;
        var7 = var7 + rk.field_j;
        if (var4 < 0) {
          var4 = 0;
        }
        if (var6 > 640) {
          var6 = 640;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var7 > 376) {
          var7 = 376;
        }
        var8Lifetime1 = var5 * 640 + var4;
        var9Lifetime1 = 640 - (var6 - var4);
        for (var10Lifetime3 = var5; var10Lifetime3 < var7; var10Lifetime3++) {
          for (var11Lifetime1 = var4; var11Lifetime1 < var6; var11Lifetime1++) {
            var12 = var22[var8Lifetime1] & 255;
            if (var12 != 0) {
              var22[var8Lifetime1] = (byte) 0;
              var13 = fn.field_h[var8Lifetime1];
              var14 = ~var13 & 16711935;
              var15 = ~var13 & 65280;
              var16 = var14 * var12 & -16711936 | var15 * var12 & 16711680;
              fn.field_h[var8Lifetime1] = var13 + (var16 >>> 8);
            }
            var8Lifetime1++;
          }
          var8Lifetime1 = var8Lifetime1 + var9Lifetime1;
        }
        return;
    }

    abstract boolean c(int param0);

    abstract void a(kh param0, int param1);

    void a(vg param0, boolean param1) {
        try {
          if (param1) {
            this.field_A = (hn) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.IC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, double[] param1, int param2, double[] param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          rn.field_c = param3[2 + param2] * param1[9] + (param3[1 + param2] * param1[6] + (this.field_E + param1[3] * param3[param2]));
          if (param0) {
            field_x = (bi) null;
          }
          ud.field_o = param1[7] * param3[1 + param2] + (param1[4] * param3[param2] + this.field_t) + param1[10] * param3[param2 + 2];
          dh.field_sb = param1[5] * param3[param2] + this.field_D + param1[8] * param3[param2 + 1] + param3[2 + param2] * param1[11];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("pm.HD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(double[] param0, pm param1, double param2, da param3, double[] param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        int var37 = 0;
        double[] var38 = null;
        double[] var39 = null;
        double[] var43 = null;
        double[] var50 = null;
        double[] var51 = null;
        double[] var52 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        double var34Lifetime1;
        var37 = Confined.field_J ? 1 : 0;
        try {
          var43 = new double[12];
          var39 = var43;
          var38 = var39;
          var50 = var38;
          param3.a((byte) 62, var43);
          var9 = 0;
          var10 = -125 % ((param5 + 73) / 32);
          while (var9 < param0.length) {
            var11 = param0[var9];
            var13 = param0[var9 + 1];
            var15 = param0[2 + var9];
            this.a(false, var50, var9, param4);
            var51 = param1.e(3008);
            var18 = var51[0] - rn.field_c;
            var20 = -ud.field_o + var51[1];
            var22 = -dh.field_sb + var51[2];
            var24 = Math.sqrt(var22 * var22 + (var20 * var20 + var18 * var18));
            if (!(var24 < 0.001)) {
              var24 = 1.0 / var24;
              var20 = var20 * var24;
              var18 = var18 * var24;
              var22 = var22 * var24;
              var24 = var15 * var22 + (var11 * var18 + var13 * var20);
              if (-0.99999 < var24 &&
                var24 < 0.99999) {
                var26 = Math.acos(var24) * param2;
                var28 = -(var20 * var15) + var22 * var13;
                var30 = var18 * var15 - var11 * var22;
                var32 = var11 * var20 - var18 * var13;
                var34 = 1.0 / Math.sqrt(var30 * var30 + var28 * var28 + var32 * var32);
                hd.field_e.a(var26, var34 * var32, var28 * var34, var34 * var30, 7);
                var52 = new double[12];
                hd.field_e.a((byte) 72, var52);
                var20 = var11 * var52[4] + var52[7] * var13 + var15 * var52[10];
                var22 = var52[5] * var11 + var52[8] * var13 + var52[11] * var15;
                var18 = var52[6] * var13 + var52[3] * var11 + var52[9] * var15;
                var34Lifetime1 = 1.0 / Math.sqrt(var18 * var18 + var20 * var20 + var22 * var22);
                var22 = var22 * var34Lifetime1;
                var18 = var18 * var34Lifetime1;
                var20 = var20 * var34Lifetime1;
              }
              param0[var9] = var18;
              param0[1 + var9] = var20;
              param0[2 + var9] = var22;
            }
            var9 += 3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("pm.VD(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    private final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        double var8;
        int var10;
        int var11;
        int var12;
        var3 = param1 - rk.field_j + 1;
        var4 = param1 + rk.field_j;
        var5 = param2 - rk.field_j + 1;
        var6 = param2 + rk.field_j;
        if (var3 < 0) {
          var3 = 0;
        }
        if (var4 > 640) {
          var4 = 640;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var6 > 376) {
          var6 = 376;
        }
        param0 = param0 + ((var5 - param2) * 640 + (var3 - param1));
        var7 = 640 - (var4 - var3);
        var8 = (double)wb.field_b / (double)rk.field_j;
        var10 = var5;
        while (var10 < var6) {
          var11 = var3;
          while (var11 < var4) {
            if (fd.field_e.field_z[param0] == 0) {
              var12 = wb.field_b - (int)(Math.sqrt((double)((var11 - param1) * (var11 - param1) + (var10 - param2) * (var10 - param2))) * var8);
              if (var12 > (wm.field_gb[param0] & 255)) {
                wm.field_gb[param0] = (byte)var12;
              }
            }
            var11++;
            param0++;
          }
          var10++;
          param0 = param0 + var7;
        }
    }

    final void a(od param0, da param1, oi param2, byte param3, double param4, mn param5, vg param6, int param7) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        sk var10 = null;
        RuntimeException var10_ref = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var17 = null;
        double[] var19 = null;
        try {
          var19 = new double[12];
          param1.a((byte) 41, var19);
          var10 = this.a(param5, param2, param6, param0, var19, 3036, param4);
          var17 = new int[12];
          var15 = var17;
          var13 = var15;
          var13[0] = (int)((double)param7 * this.field_E);
          if (param3 != 64) {
            return;
          }
          var13[1] = (int)((double)param7 * this.field_t);
          var13[2] = (int)(this.field_D * (double)param7);
          param1.a(var17, -127);
          var10.a(param6.a(param7, false), var17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_6_0 = var10_ref;
          stackIn_6_1 = new StringBuilder().append("pm.MD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(')').toString());
        }
    }

    abstract boolean i(int param0);

    double[] e(int param0) {
        if (param0 != 3008) {
          return (double[]) null;
        }
        return new double[]{this.field_E, this.field_t, this.field_D, 0.0, 0.0, 0.0};
    }

    final void a(nf param0, int param1, vg param2, byte param3, double param4) {
        try {
          pa.a(this.field_E, this.field_C, (byte) -11, param1, this.field_D, this.field_t, param0, param4, param2);
          if (param3 != 91) {
            this.j(9);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.TD(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, od param1, int param2, da param3, int param4, oi param5, double param6, vg param7, mn param8) {
        try {
          this.a(param4, false, param6, (byte) 44, param1, param3, param7, param5, param8, param0);
          if (param2 != 27902) {
            String var12 = (String) null;
            pm.a((String) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.AE(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    void a(mm param0, boolean param1) {
        try {
          this.a(102, param0);
          if (param1) {
            sa var4 = (sa) null;
            this.a((byte) -43, (sa) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.DC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final sk a(double param0, od param1, double[] param2, int param3, vg param4, double param5, oi param6, mn param7) {
        double localTemp$0 = 0.0;
        sk stackIn_20_0 = null;
        sk stackIn_25_0 = null;
        sk stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var11_double = 0.0;
        RuntimeException var11 = null;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        vb var21 = null;
        Object var22_ref = null;
        oi var22_ref_oi = null;
        double var22 = 0.0;
        double var23 = 0.0;
        int var24 = 0;
        double var25_double = 0.0;
        int var25 = 0;
        int var26_int = 0;
        double var26 = 0.0;
        double var27_double = 0.0;
        int var27 = 0;
        double var28 = 0.0;
        double var29 = 0.0;
        double var30 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        int var37 = 0;
        double var15Lifetime1;
        double var17Lifetime1;
        var22_ref = null;
        var37 = Confined.field_J ? 1 : 0;
        try {
          var11_double = -((this.field_D - param4.field_O) / param5) + 1.0;
          var11_double = qn.field_v.a(var11_double, param3 ^ param3, this.field_D);
          if (!(0.0 < var11_double)) {
            stackIn_27_0 = (sk) (param1.a(0, 65536, 0, 0, -256));
            return stackIn_27_0;
          }
          var13 = 4.0;
          var15 = lm.field_a;
          var17 = ke.field_Z;
          var19 = sb.field_g;
          var21 = new vb(param7);
          var22_ref_oi = (oi) (var21.b(param6, 6));
          while (var22_ref_oi != null) {
            if (var22_ref_oi != this.field_v) {
              boolean decompiledFrameRemainder0 = true;
              var23 = var22_ref_oi.field_t - this.field_E;
              var25_double = var22_ref_oi.field_o - this.field_t;
              var27_double = -this.field_D + var22_ref_oi.field_p;
              var29 = var27_double * var27_double + (var23 * var23 + var25_double * var25_double);
              var31 = var22_ref_oi.field_u;
              if (0.01 <= var29) {
                if (!(var29 >= var31 * 1e-8 * var31)) {
                  var22_ref_oi = (oi) (var21.b(param3 ^ -109));
                  continue;
                }
                var33 = Math.sqrt(var29);
                if (var22_ref_oi.field_w &&
                  this != var22_ref_oi.field_r) {
                  localTemp$0 = var31 * (-(var23 * var22_ref_oi.field_m + var22_ref_oi.field_x * var25_double + var27_double * var22_ref_oi.field_v) / var33);
                  var31 = localTemp$0;
                  decompiledFrameRemainder0 = !(!(0.0 < localTemp$0));
                }
                if (decompiledFrameRemainder0) {
                  var35 = var31 / var29;
                  if (var35 > 16.0) {
                    var35 = 16.0;
                  }
                  var33 = var35 / var33;
                  var13 = var13 + var35;
                  var23 = var23 * var33;
                  var27_double = var27_double * var33;
                  var25_double = var25_double * var33;
                  var19 = var19 + var27_double;
                  var17 = var17 + var25_double;
                  var15 = var15 + var23;
                }
              }
              var22_ref_oi = (oi) (var21.b(param3 ^ -109));
              continue;
            }
            break;
          }
          var17 = var17 * param0;
          var19 = var19 * param0;
          var15 = var15 * param0;
          var13 = var13 * param0;
          var22 = Math.sqrt(var19 * var19 + (var17 * var17 + var15 * var15));
          var24 = (int)(var11_double * (var22 * 8.0));
          var25 = (int)(var11_double * (16.0 + 8.0 * var13));
          if (var24 + var25 > 256) {
            var26_int = var25 - var24;
            var27 = 256;
            var25 = (var27 + var26_int) / 2;
            var24 = (var27 - var26_int) / 2;
          }
          if (var24 <= 0) {
            stackIn_20_0 = (sk) (param1.a(var25, 65536, 0, 0, -256));
            return stackIn_20_0;
          }
          if (var24 > 1024) {
            var24 = 1024;
          }
          var28 = var17 * param2[4] + param2[3] * var15 + var19 * param2[5];
          var30 = param2[8] * var19 + (var15 * param2[6] + var17 * param2[7]);
          var19 = var19 * param2[11] + (param2[9] * var15 + var17 * param2[10]);
          var17Lifetime1 = var30;
          var15Lifetime1 = var28;
          var26 = 256.0 / var22;
          stackIn_25_0 = (sk) (param1.a(var25, 131072 / (3 * var24), (int)(var26 * var15Lifetime1), (int)(var26 * var17Lifetime1), (int)(var19 * var26)));
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_30_0 = var11;
          stackIn_30_1 = new StringBuilder().append("pm.LD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param7 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    abstract void a(hm param0, boolean param1);

    abstract void a(cl param0, byte param1);

    final ka a(int param0, bi param1, double param2, double param3, double param4) {
        sk discarded$1 = null;
        mb var9 = null;
        RuntimeException var9_ref = null;
        mb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2384) {
            discarded$1 = this.a((mn) null, (oi) null, (vg) null, (od) null, (double[]) null, -98, -0.5432285346715034);
          }
          var9 = new mb(this, param2, param4, param3, param1);
          ri.a((rk) (this), 0, var9);
          this.field_z = true;
          stackIn_3_0 = var9;
          return (ka) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("pm.ID(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    void a(mn param0, byte param1) {
        try {
          int var3_int = 26 / ((-2 - param1) / 62);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final sk a(mn param0, oi param1, vg param2, od param3, double[] param4, int param5, double param6) {
        RuntimeException var9 = null;
        sk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 3036) {
            this.field_t = 1.0649507571035113;
          }
          stackIn_3_0 = this.a(1.0, param3, param4, 2, param2, param6, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_6_0 = var9;
          stackIn_6_1 = new StringBuilder().append("pm.PD(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, nf param1, double param2, vg param3) {
        try {
          int var6_int = -120 % ((-70 - param0) / 41);
          pa.a(this.field_E, this.field_C, (byte) -11, 256, this.field_D, this.field_t, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.KD(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    void a(double param0, byte param1, double param2, double param3) {
        this.field_E = this.field_E - param0;
        this.field_D = this.field_D - param2;
        if (param1 != 46) {
          return;
        }
        this.field_t = this.field_t - param3;
    }

    abstract void a(int param0, mb param1);

    abstract void a(mn param0, double param1, int param2, vg param3, oi param4);

    final void a(nf param0, boolean param1, double param2, vg param3) {
        nf stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var6_double = 0.0;
        RuntimeException var6 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var21 = 0.0;
        int var23 = 0;
        try {
          var6_double = -param3.field_T + this.field_E;
          if (!param1) {
            field_B = (String[]) null;
          }
          var8 = this.field_t - param3.field_L;
          var10 = -param3.field_O + this.field_D;
          var12 = param3.field_R * var6_double + param3.field_ab * var8 + var10 * param3.field_M;
          var14 = var10 * param3.field_F + (var6_double * param3.field_V + var8 * param3.field_U);
          var16 = param3.field_N * var10 + (param3.field_H * var8 + var6_double * param3.field_P);
          if (0.15 <= var16) {
            var18 = (int)(640.0 * (var12 / var16)) + 320;
            var19 = (int)(640.0 * (var14 / var16)) + 188;
            var20 = (int)(640.0 * (this.field_C / var16));
            var21 = 512.0 * (1.0 - var10 / param2);
            var23 = (int)qn.field_v.a(var21, 0, this.field_D);
            stackIn_6_0 = (nf) (param0);
            stackIn_6_1 = -var20 + var18;
            stackIn_6_2 = -var20 + var19;
            stackIn_6_3 = var20 * 2;
            stackIn_6_4 = var20 * 2;
            if (var23 > 256) {
              stackIn_7_5 = 256;
            } else {
              stackIn_7_5 = var23;
            }
            ((nf) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("pm.GD(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static fg a(String param0, boolean param1) {
        String var2 = null;
        fg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        fg stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (v.field_Db == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            stackIn_7_0 = null;
            return (fg) (stackIn_7_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = hh.a(0, var6);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (fg) (stackIn_10_0);
          }
          var3 = (fg) (v.field_Db.a((long)var2.hashCode(), -1));
          if (!param1) {
            field_x = (bi) null;
          }
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = hh.a(0, var7);
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (fg) (v.field_Db.a(-11));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("pm.RD(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean a(boolean param0, pm param1);

    abstract boolean a(pm param0, byte param1);

    void f(byte param0) {
        if (param0 >= -112) {
          field_u = (String) null;
        }
    }

    abstract void a(pm param0, int param1);

    final static bm a(mi param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bm stackIn_2_0 = null;
        bm stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param3 ^ -12, param1);
          var5 = param0.a(var4_int, param2, -91);
          if (param3 == 112) {
            stackIn_4_0 = a.a(param0, var4_int, var5, (byte) -99);
            return stackIn_4_0;
          }
          stackIn_2_0 = (bm) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pm.OD(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract boolean g(byte param0);

    double j(int param0) {
        if (param0 != -7672) {
          this.field_E = 1.278893838032176;
        }
        return 0.0;
    }

    abstract void a(int param0, hf param1);

    public static void e(byte param0) {
        int var1 = 48 % ((param0 + 80) / 43);
        field_w = null;
        field_u = null;
        field_x = null;
        field_B = null;
    }

    abstract boolean f(int param0);

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        if (param0 != 256) {
          this.field_y = (pm) null;
        }
    }

    void a(int param0, int param1) {
        if (param0 != 11878) {
          this.field_E = 1.1697982632706019;
        }
    }

    abstract void a(byte param0, sa param1);

    void h(int param0) {
        if (param0 != 17086) {
          field_u = (String) null;
        }
    }

    void a(dj param0, byte param1) {
        try {
          this.a(true, (ee) (param0));
          if (param1 != 80) {
            this.a(-85, 27);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.GB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, h param1) {
        try {
          this.a(true, (ee) (param1));
          if (param0 != 640) {
            mn var4 = (mn) null;
            this.a(107, (od) null, 5, (da) null, -102, (oi) null, -0.8503192618374721, (vg) null, (mn) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.VA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pm(hn param0, double param1, double param2, double param3, double param4) {
        this.field_z = false;
        try {
          this.field_A = param0;
          this.field_t = param2;
          this.field_E = param1;
          this.field_C = param4;
          this.field_D = param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "pm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_B = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_u = "Brightness: ";
    }
}
