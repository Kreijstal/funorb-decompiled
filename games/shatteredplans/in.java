/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    private df[] field_b;
    private df field_h;
    private int field_k;
    private int field_c;
    private df field_j;
    private long field_d;
    static bi field_i;
    static String field_l;
    static String field_e;
    static String field_a;
    static km field_g;
    static bi field_f;

    final df b(byte param0) {
        int fieldTemp$0 = 0;
        df var2;
        int var3;
        df var4;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_c > 0 &&
          this.field_b[this.field_c - 1] != this.field_h) {
          var2 = this.field_h;
          this.field_h = var2.field_h;
          return var2;
        }
        do {
          if (this.field_k <= this.field_c) {
            if (param0 == -107) {
              return null;
            }
            return (df) null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var4 = this.field_b[fieldTemp$0].field_h;
          var2 = var4;
        } while (var4 == this.field_b[this.field_c - 1]);
        this.field_h = var2.field_h;
        return var2;
    }

    final static th a(int param0, byte[] param1) {
        th var2 = null;
        RuntimeException var2_ref = null;
        th stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 != 15) {
            field_f = (bi) null;
          }
          var2 = new th(param1, cf.field_H, sj.field_a, mc.field_s, cm.field_g, eo.field_fb, hd.field_q);
          pd.a(param0 - 15);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("in.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var6_intLifetime2;
        int var17Lifetime4Lifetime1;
        int var18Lifetime4Lifetime1;
        int var19Lifetime4Lifetime1;
        int var20Lifetime4Lifetime1;
        int var21Lifetime3Lifetime1;
        int var22Lifetime2Lifetime1;
        int var23Lifetime2Lifetime1;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 > param3) {
            var6_int = param3;
            param3 = param1;
            param1 = var6_int;
            var6_intLifetime2 = param5;
            param5 = param4;
            param4 = var6_intLifetime2;
          }
          var6_intLifetime1 = -param4 + param5;
          var7 = -param1 + param3;
          if (0 == var7) {
            if (16 <= var6_intLifetime1) {
              var8 = param4 >> 4;
              var9 = param1 >> 4;
              var10 = param0;
              var11 = (16 - (15 & param4)) * (16 - (param1 & 15));
              if (var8 >= gf.field_i &&
                var8 < gf.field_l &&
                var9 >= gf.field_a &&
                var9 < gf.field_f) {
                var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                var12 = var10 & 65280;
                var12 = var12 * var11;
                var10 = var10 & 16711935;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = 640 * var9 + var8;
                var14 = gf.field_h[var13];
                var10 = var10 + (-16711936 & (16711935 & var14) * (-var11 + 256));
                var12 = var12 + (16711680 & (var14 & 65280) * (256 - var11));
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
              var8 = param5 >> 4;
              var9 = param1 >> 4;
              var10 = param0;
              var11 = (param5 & 15) * (16 - (15 & param1));
              if (gf.field_i <= var8 &&
                var8 < gf.field_l &&
                var9 >= gf.field_a &&
                gf.field_f > var9) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = 65280 & var10;
                var12 = var12 * var11;
                var10 = var10 & 16711935;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = var8 + 640 * var9;
                var14 = gf.field_h[var13];
                var10 = var10 + (-16711936 & (16711935 & var14) * (256 - var11));
                var12 = var12 + (16711680 & (var14 & 65280) * (-var11 + 256));
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
              gf.f((param4 >> 4) + 1, param1 >> 4, (var6_intLifetime1 >> 4) - 2, param0, (16 - (15 & param1)) * 16);
              var8 = param4 >> 4;
              var9 = (param1 >> 4) + 1;
              var10 = param0;
              var11 = (param4 & 15) * (16 - (15 & param1));
              if (gf.field_i <= var8 &&
                gf.field_l > var8 &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var10 = var10 + ((var14 & 16711935) * (-var11 + 256) & -16711936);
                var12 = var12 + (16711680 & (-var11 + 256) * (65280 & var14));
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
              var8 = param5 >> 4;
              var9 = 1 + (param1 >> 4);
              var10 = param0;
              var11 = (15 & param4) * (15 & param3);
              if (var8 >= gf.field_i &&
                gf.field_l > var8 &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var10 = var10 + ((256 - var11) * (var14 & 16711935) & -16711936);
                var12 = var12 + ((-var11 + 256) * (var14 & 65280) & 16711680);
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
              gf.f((param4 >> 4) + 1, (param1 >> 4) + 1, -2 + (var6_intLifetime1 >> 4), param0, 16 * (15 & param1));
            } else {
              var8 = param4 >> 4;
              var9 = param1 >> 4;
              var10 = param0;
              var11 = (16 - (param1 & 15)) * var6_intLifetime1;
              if (var8 >= gf.field_i &&
                var8 < gf.field_l &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = 640 * var9 + var8;
                var14 = gf.field_h[var13];
                var12 = var12 + (16711680 & (65280 & var14) * (256 - var11));
                var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
              var8 = param4 >> 4;
              var9 = (param1 >> 4) + 1;
              var10 = param0;
              var11 = var6_intLifetime1 * (param1 & 15);
              if (var8 >= gf.field_i &&
                var8 < gf.field_l &&
                var9 >= gf.field_a) {
                if (var9 >= gf.field_f) {
                  return;
                }
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = var8 + 640 * var9;
                var14 = gf.field_h[var13];
                var12 = var12 + ((var14 & 65280) * (-var11 + 256) & 16711680);
                var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
            }
            return;
          }
          var8Lifetime1 = (var6_intLifetime1 << 12) / var7;
          var9Lifetime1 = param1 + 7 >> 4;
          var10Lifetime1 = ((var9Lifetime1 << 4) - param1) * var8Lifetime1 + (param4 << 12);
          var11Lifetime1 = -(7 + param1 & 15) + 16;
          var12Lifetime1 = var9Lifetime1;
          var13Lifetime1 = var10Lifetime1 >> 16;
          var14Lifetime1 = var13Lifetime1;
          var15 = var12Lifetime1;
          var16 = param0;
          var17 = (-((var10Lifetime1 & 65015) >> 12) + 16) * var11Lifetime1;
          if (var14Lifetime1 >= gf.field_i &&
            gf.field_l > var14Lifetime1 &&
            gf.field_a <= var15 &&
            var15 < gf.field_f) {
            var17 = (int)(256.0 * Math.pow((double)var17 / 256.0, 0.55));
            var18 = var16 & 65280;
            var16 = var16 & 16711935;
            var18 = var18 * var17;
            var16 = var16 * var17;
            var18 = var18 & 16711680;
            var16 = var16 & -16711936;
            var19 = var15 * 640 + var14Lifetime1;
            var20 = gf.field_h[var19];
            var16 = var16 + ((16711935 & var20) * (-var17 + 256) & -16711936);
            var18 = var18 + ((-var17 + 256) * (65280 & var20) & 16711680);
            gf.field_h[var19] = ee.a(var16, var18) >>> 8;
          }
          var14Lifetime2 = 1 + var13Lifetime1;
          var16Lifetime1 = 57 / ((param2 - 20) / 42);
          var15Lifetime1 = var12Lifetime1;
          var17Lifetime1 = param0;
          var18Lifetime1 = var11Lifetime1 * (15 & var10Lifetime1 >> 12);
          if (var14Lifetime2 >= gf.field_i &&
            var14Lifetime2 < gf.field_l &&
            gf.field_a <= var15Lifetime1 &&
            gf.field_f > var15Lifetime1) {
            var18Lifetime1 = (int)(Math.pow((double)var18Lifetime1 / 256.0, 0.55) * 256.0);
            var19Lifetime1 = var17Lifetime1 & 65280;
            var19Lifetime1 = var19Lifetime1 * var18Lifetime1;
            var17Lifetime1 = var17Lifetime1 & 16711935;
            var17Lifetime1 = var17Lifetime1 * var18Lifetime1;
            var19Lifetime1 = var19Lifetime1 & 16711680;
            var17Lifetime1 = var17Lifetime1 & -16711936;
            var20Lifetime1 = var15Lifetime1 * 640 + var14Lifetime2;
            var21 = gf.field_h[var20Lifetime1];
            var17Lifetime1 = var17Lifetime1 + (-16711936 & (var21 & 16711935) * (256 - var18Lifetime1));
            var19Lifetime1 = var19Lifetime1 + ((-var18Lifetime1 + 256) * (65280 & var21) & 16711680);
            gf.field_h[var20Lifetime1] = ee.a(var19Lifetime1, var17Lifetime1) >>> 8;
          }
          var9Lifetime2 = param3 + 7 >> 4;
          var14Lifetime3 = var10Lifetime1 + var8Lifetime1;
          var10Lifetime2 = (param5 << 12) + (-param3 + (var9Lifetime2 << 4)) * var8Lifetime1;
          var11Lifetime2 = -(param3 + 7 & 15) + 16;
          var15Lifetime2 = var10Lifetime2 >> 16;
          var16Lifetime2 = var9Lifetime2;
          var17Lifetime2 = var15Lifetime2;
          var18Lifetime2 = var16Lifetime2;
          var19Lifetime2 = param0;
          var20Lifetime2 = (16 - ((63052 & var10Lifetime2) >> 12)) * var11Lifetime2;
          if (var17Lifetime2 >= gf.field_i &&
            gf.field_l > var17Lifetime2 &&
            var18Lifetime2 >= gf.field_a &&
            gf.field_f > var18Lifetime2) {
            var20Lifetime2 = (int)(256.0 * Math.pow((double)var20Lifetime2 / 256.0, 0.55));
            var21Lifetime1 = var19Lifetime2 & 65280;
            var21Lifetime1 = var21Lifetime1 * var20Lifetime2;
            var19Lifetime2 = var19Lifetime2 & 16711935;
            var21Lifetime1 = var21Lifetime1 & 16711680;
            var19Lifetime2 = var19Lifetime2 * var20Lifetime2;
            var19Lifetime2 = var19Lifetime2 & -16711936;
            var22 = 640 * var18Lifetime2 + var17Lifetime2;
            var23 = gf.field_h[var22];
            var19Lifetime2 = var19Lifetime2 + ((var23 & 16711935) * (256 - var20Lifetime2) & -16711936);
            var21Lifetime1 = var21Lifetime1 + ((-var20Lifetime2 + 256) * (var23 & 65280) & 16711680);
            gf.field_h[var22] = ee.a(var19Lifetime2, var21Lifetime1) >>> 8;
          }
          var17Lifetime3 = 1 + var15Lifetime2;
          var18Lifetime3 = var16Lifetime2;
          var19Lifetime3 = param0;
          var20Lifetime3 = var11Lifetime2 * (15 & var10Lifetime2 >> 12);
          if (var17Lifetime3 >= gf.field_i &&
            gf.field_l > var17Lifetime3 &&
            gf.field_a <= var18Lifetime3 &&
            gf.field_f > var18Lifetime3) {
            var20Lifetime3 = (int)(Math.pow((double)var20Lifetime3 / 256.0, 0.55) * 256.0);
            var21Lifetime2 = var19Lifetime3 & 65280;
            var21Lifetime2 = var21Lifetime2 * var20Lifetime3;
            var19Lifetime3 = var19Lifetime3 & 16711935;
            var19Lifetime3 = var19Lifetime3 * var20Lifetime3;
            var21Lifetime2 = var21Lifetime2 & 16711680;
            var19Lifetime3 = var19Lifetime3 & -16711936;
            var22Lifetime1 = var17Lifetime3 + 640 * var18Lifetime3;
            var23Lifetime1 = gf.field_h[var22Lifetime1];
            var19Lifetime3 = var19Lifetime3 + ((-var20Lifetime3 + 256) * (var23Lifetime1 & 16711935) & -16711936);
            var21Lifetime2 = var21Lifetime2 + ((var23Lifetime1 & 65280) * (256 - var20Lifetime3) & 16711680);
            gf.field_h[var22Lifetime1] = ee.a(var21Lifetime2, var19Lifetime3) >>> 8;
          }
          var8Lifetime1 = var8Lifetime1 << 4;
          var12Lifetime1++;
          while (var16Lifetime2 > var12Lifetime1) {
            var17Lifetime4 = var14Lifetime3 >> 16;
            var18Lifetime4 = var12Lifetime1;
            var19Lifetime4 = param0;
            var20Lifetime4 = 256 - (var14Lifetime3 >> 8 & 255);
            if (var17Lifetime4 >= gf.field_i &&
              gf.field_l > var17Lifetime4 &&
              var18Lifetime4 >= gf.field_a &&
              gf.field_f > var18Lifetime4) {
              var20Lifetime4 = (int)(256.0 * Math.pow((double)var20Lifetime4 / 256.0, 0.55));
              var21Lifetime3 = 65280 & var19Lifetime4;
              var19Lifetime4 = var19Lifetime4 & 16711935;
              var21Lifetime3 = var21Lifetime3 * var20Lifetime4;
              var19Lifetime4 = var19Lifetime4 * var20Lifetime4;
              var21Lifetime3 = var21Lifetime3 & 16711680;
              var19Lifetime4 = var19Lifetime4 & -16711936;
              var22Lifetime2 = var17Lifetime4 + 640 * var18Lifetime4;
              var23Lifetime2 = gf.field_h[var22Lifetime2];
              var19Lifetime4 = var19Lifetime4 + (-16711936 & (16711935 & var23Lifetime2) * (256 - var20Lifetime4));
              var21Lifetime3 = var21Lifetime3 + ((65280 & var23Lifetime2) * (256 - var20Lifetime4) & 16711680);
              gf.field_h[var22Lifetime2] = ee.a(var19Lifetime4, var21Lifetime3) >>> 8;
            }
            var17Lifetime4Lifetime1 = (var14Lifetime3 >> 16) + 1;
            var18Lifetime4Lifetime1 = var12Lifetime1;
            var19Lifetime4Lifetime1 = param0;
            var20Lifetime4Lifetime1 = 255 & var14Lifetime3 >> 8;
            if (gf.field_i <= var17Lifetime4Lifetime1 &&
              var17Lifetime4Lifetime1 < gf.field_l &&
              gf.field_a <= var18Lifetime4Lifetime1 &&
              var18Lifetime4Lifetime1 < gf.field_f) {
              var20Lifetime4Lifetime1 = (int)(256.0 * Math.pow((double)var20Lifetime4Lifetime1 / 256.0, 0.55));
              var21Lifetime3Lifetime1 = 65280 & var19Lifetime4Lifetime1;
              var21Lifetime3Lifetime1 = var21Lifetime3Lifetime1 * var20Lifetime4Lifetime1;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 & 16711935;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 * var20Lifetime4Lifetime1;
              var21Lifetime3Lifetime1 = var21Lifetime3Lifetime1 & 16711680;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 & -16711936;
              var22Lifetime2Lifetime1 = var18Lifetime4Lifetime1 * 640 + var17Lifetime4Lifetime1;
              var23Lifetime2Lifetime1 = gf.field_h[var22Lifetime2Lifetime1];
              var21Lifetime3Lifetime1 = var21Lifetime3Lifetime1 + (16711680 & (-var20Lifetime4Lifetime1 + 256) * (var23Lifetime2Lifetime1 & 65280));
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 + ((var23Lifetime2Lifetime1 & 16711935) * (-var20Lifetime4Lifetime1 + 256) & -16711936);
              gf.field_h[var22Lifetime2Lifetime1] = ee.a(var21Lifetime3Lifetime1, var19Lifetime4Lifetime1) >>> 8;
            }
            var14Lifetime3 = var14Lifetime3 + var8Lifetime1;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "in.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static qh a(int param0, boolean param1) {
        fe var2 = null;
        lp var3 = null;
        tq.field_j = new qh(320, -param0 + 479 - 28, 200, param0 + 28, ih.field_a.toUpperCase());
        if (param1) {
          var2 = new fe(tq.field_j.field_k + 200 - 16, 2 + tq.field_j.field_t, 11, 11, -1, (bi) null, "X", 16711680);
          var2.field_h = tq.field_j;
          tq.field_j.a(var2, 8);
          var3 = new lp(tq.field_j.field_k + 9, tq.field_j.field_t + 20, 182, param0);
          tq.field_j.a(var3, 8);
          tq.field_j.field_z = var3;
          return tq.field_j;
        }
        return (qh) null;
    }

    final void a(long param0, df param1, boolean param2) {
        df var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param1.field_j) {
            param1.a(16);
          }
          var5 = this.field_b[(int)((long)(this.field_k - 1) & param0)];
          param1.field_j = var5.field_j;
          param1.field_h = var5;
          param1.field_j.field_h = param1;
          param1.field_h.field_j = param1;
          param1.field_l = param0;
          if (!param2) {
            this.field_j = (df) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("in.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static qd a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          qd var5 = null;
          ge var5_ref = null;
          qd stackIn_2_0 = null;
          qd stackIn_4_0 = null;
          ge stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("bl");
              if (param1 != 16) {
                stackIn_2_0 = (qd) null;
                return stackIn_2_0;
              }
              var5 = (qd) (var4.newInstance());
              var5.a(param3, param0, (byte) -111, param2);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new ge();
              ((qd) ((Object) var5_ref)).a(param3, param0, (byte) -99, param2);
              stackIn_6_0 = var5_ref;
              return (qd) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("in.K(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df d(byte param0) {
        int var2;
        df var3;
        df var4;
        int var5;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 24 / ((-73 - param0) / 35);
        if (this.field_j == null) {
          return null;
        }
        var3 = this.field_b[(int)((long)(this.field_k - 1) & this.field_d)];
        while (true) {
          if (this.field_j == var3) {
            this.field_j = null;
            return null;
          }
          if (this.field_j.field_l != this.field_d) {
            this.field_j = this.field_j.field_h;
            continue;
          }
          break;
        }
        var4 = this.field_j;
        this.field_j = this.field_j.field_h;
        return var4;
    }

    final static void a(byte param0) {
        cp.field_a = new qr(0L, (qr) null);
        if (ns.field_pb) {
          cp.field_a.a(4, nm.field_c);
        }
        cp.field_a.a(4, lp.field_v);
        bc.field_g = new wh(ds.field_a, cp.field_a);
        if (param0 != -83) {
          field_i = (bi) null;
        }
        ia.field_j = new qr(0L, (qr) null);
        ia.field_j.a(param0 + 87, bc.field_g.field_d);
        ia.field_j.a(4, vm.field_Ab);
        tc.j(96);
    }

    final df c(byte param0) {
        if (param0 > -66) {
          this.field_c = -75;
        }
        this.field_c = 0;
        return this.b((byte) -107);
    }

    final df a(int param0, long param1) {
        df var4;
        df var5;
        int var6;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_d = param1;
        if (param0 != 65280) {
          in.a(20, 67, -77, 2, 1, -87);
        }
        var4 = this.field_b[(int)(param1 & (long)(-1 + this.field_k))];
        this.field_j = var4.field_h;
        while (true) {
          if (var4 == this.field_j) {
            this.field_j = null;
            return null;
          }
          if (this.field_j.field_l != param1) {
            this.field_j = this.field_j.field_h;
            continue;
          }
          break;
        }
        var5 = this.field_j;
        this.field_j = this.field_j.field_h;
        return var5;
    }

    public static void a(boolean param0) {
        field_i = null;
        field_e = null;
        if (!param0) {
          field_g = (km) null;
        }
        field_l = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    in(int param0) {
        int var2 = 0;
        df dupTemp$0 = null;
        df var3 = null;
        this.field_c = 0;
        this.field_k = param0;
        this.field_b = new df[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new df();
          var3 = dupTemp$0;
          this.field_b[var2] = dupTemp$0;
          var3.field_h = var3;
          var3.field_j = var3;
        }
    }

    static {
        field_i = new bi(540, 140);
        field_l = "Connection lost. <%0>";
        field_e = "Capture all the systems on the map";
        field_a = "Failed attacks";
    }
}
