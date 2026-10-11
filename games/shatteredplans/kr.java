/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr extends Exception {
    static boolean field_b;
    static bi field_d;
    static int[] field_e;
    static String field_c;
    static v field_a;
    static String[] field_f;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 != 16) {
          kr.a(-128, -13, 12, 114, -121, -123);
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, ln param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mg var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pf var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1.field_T.g(112)) {
            return;
          }
          var11 = new pf();
          param1.field_T.a((byte) -90, var11);
          var4 = 65 / ((param0 + 1) / 60);
          param1.field_T.a((byte) -113, var11.h(88));
          var3 = (mg) (var11.d(0));
          while (var3 != null) {
            var5 = -var3.field_y.field_A + var3.field_B.field_A;
            var6 = -var3.field_y.field_S + var3.field_B.field_S;
            var7 = (mg) (param1.field_T.d(0));
            while (var7 != null) {
              var8 = -var7.field_y.field_A + var7.field_B.field_A;
              var9 = var7.field_B.field_S - var7.field_y.field_S;
              if (!ul.a(var8, var9, 0, var5, var6)) {
                var7 = (mg) (param1.field_T.a((byte) -71));
                continue;
              }
              wp.$cfr$intArgs$a$2661ebe01e52(-125, var3, var7);
              break;
            }
            if (var7 == null) {
              param1.field_T.a((byte) -113, var3);
            }
            var3 = (mg) (var11.a((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("kr.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6;
        int var7;
        int var8;
        int var9;
        int var10_int;
        long var10;
        long var12;
        int var14;
        int var10_intLifetime1;
        long var10Lifetime1;
        long var12Lifetime1;
        int var14Lifetime1;
        var6 = 0;
        var7 = 0;
        var8 = gf.field_i << 4;
        var9 = gf.field_l << 4;
        if (param3 > param2) {
          var10_int = param3;
          param3 = param2;
          param2 = var10_int;
          var10_intLifetime1 = param1;
          param1 = param5;
          param5 = var10_intLifetime1;
        }
        if (param2 >= var8 &&
          param3 <= var9) {
          if (param0 < 24) {
            field_c = (String) null;
          }
          var10 = (long)(-param3 + param2);
          if (param2 > var9) {
            var7 = (int)((long)(param2 - var9) * 65536L / var10);
          }
          var12 = (long)(param5 - param1);
          if (param3 < var8) {
            var6 = (int)((long)(-param3 + var8) * 65536L / var10);
          }
          var9 = gf.field_f << 4;
          param5 = param5 - (int)((long)var7 * var12 >> 16);
          param2 = param2 - (int)(var10 * (long)var7 >> 16);
          param1 = param1 + (int)(var12 * (long)var6 >> 16);
          var8 = gf.field_a << 4;
          param3 = param3 + (int)(var10 * (long)var6 >> 16);
          if (param5 < param1) {
            var14 = param3;
            param3 = param2;
            param2 = var14;
            var14Lifetime1 = param1;
            param1 = param5;
            param5 = var14Lifetime1;
          }
          if (param5 >= var8 &&
            param1 <= var9) {
            var7 = 0;
            var6 = 0;
            var12Lifetime1 = (long)(param5 - param1);
            if (var9 < param5) {
              var7 = (int)((long)(-var9 + param5) * 65536L / (long)(param5 - param1));
            }
            if (param1 < var8) {
              var6 = (int)(65536L * (long)(-param1 + var8) / (long)(param5 - param1));
            }
            var10Lifetime1 = (long)(-param3 + param2);
            param5 = param5 - (int)(var12Lifetime1 * (long)var7 >> 16);
            param2 = param2 - (int)(var10Lifetime1 * (long)var7 >> 16);
            param3 = param3 + (int)((long)var6 * var10Lifetime1 >> 16);
            param1 = param1 + (int)(var12Lifetime1 * (long)var6 >> 16);
            ar.$cfr$intArgs$a$c3a94e747ff6(param2, param3, param5, -1, param1, param4);
            return;
          }
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
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
        int var21Lifetime4;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var6_intLifetime2;
        int var17Lifetime4Lifetime1;
        int var18Lifetime4Lifetime1;
        int var19Lifetime4Lifetime1;
        int var20Lifetime4Lifetime1;
        int var21Lifetime4Lifetime1;
        int var22Lifetime2Lifetime1;
        int var23Lifetime2Lifetime1;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 < param2) {
            var6_int = param3;
            param3 = param2;
            param2 = var6_int;
            var6_intLifetime2 = param0;
            param0 = param5;
            param5 = var6_intLifetime2;
          }
          var6_intLifetime1 = -param2 + param3;
          var7 = -param5 + param0;
          if (var6_intLifetime1 == 0) {
            if (16 <= var7) {
              var8 = param2 >> 4;
              var9 = param5 >> 4;
              var10 = param4;
              var11 = (-(param2 & 15) + 16) * (16 - (param5 & 15));
              if (gf.field_i <= var8 &&
                var8 < gf.field_l &&
                var9 >= gf.field_a &&
                var9 < gf.field_f) {
                var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var12 = var12 + ((-var11 + 256) * (65280 & var14) & 16711680);
                var10 = var10 + (-16711936 & (var14 & 16711935) * (256 - var11));
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
              var8 = param2 >> 4;
              var9 = param0 >> 4;
              var10 = param4;
              var11 = (15 & param0) * (16 - (15 & param2));
              if (gf.field_i <= var8 &&
                gf.field_l > var8 &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = var10 & 65280;
                var12 = var12 * var11;
                var10 = var10 & 16711935;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var12 = var12 + ((-var11 + 256) * (var14 & 65280) & 16711680);
                var10 = var10 + (-16711936 & (-var11 + 256) * (var14 & 16711935));
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
              gf.e(param2 >> 4, 1 + (param5 >> 4), (var7 >> 4) - 2, param4, 256 - 16 * (15 & param2));
              var8 = (param2 >> 4) + 1;
              var9 = param5 >> 4;
              var10 = param4;
              var11 = (15 & param2) * (16 - (param5 & 15));
              if (var8 >= gf.field_i &&
                gf.field_l > var8 &&
                var9 >= gf.field_a &&
                var9 < gf.field_f) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = var10 & 65280;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var10 = var10 * var11;
                var12 = var12 & 16711680;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var12 = var12 + ((65280 & var14) * (256 - var11) & 16711680);
                var10 = var10 + ((16711935 & var14) * (-var11 + 256) & -16711936);
                gf.field_h[var13] = ee.a(var10, var12) >>> 8;
              }
              var8 = (param2 >> 4) + 1;
              var9 = param0 >> 4;
              var10 = param4;
              var11 = (15 & param2) * (15 & param0);
              if (gf.field_i <= var8 &&
                var8 < gf.field_l &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = var10 & 65280;
                var12 = var12 * var11;
                var10 = var10 & 16711935;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var10 = var10 + ((var14 & 16711935) * (-var11 + 256) & -16711936);
                var12 = var12 + (16711680 & (var14 & 65280) * (256 - var11));
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
              gf.e(1 + (param2 >> 4), 1 + (param5 >> 4), -2 + (var7 >> 4), param4, (15 & param2) * 16);
            } else {
              var8 = param2 >> 4;
              var9 = param5 >> 4;
              var10 = param4;
              var11 = (16 - (15 & param2)) * var7;
              if (gf.field_i <= var8 &&
                gf.field_l > var8 &&
                var9 >= gf.field_a &&
                var9 < gf.field_f) {
                var11 = (int)(256.0 * Math.pow((double)var11 / 256.0, 0.55));
                var12 = var10 & 65280;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = var8 + var9 * 640;
                var14 = gf.field_h[var13];
                var10 = var10 + (-16711936 & (var14 & 16711935) * (256 - var11));
                var12 = var12 + (16711680 & (-var11 + 256) * (65280 & var14));
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
              var8 = 1 + (param2 >> 4);
              var9 = param5 >> 4;
              var10 = param4;
              var11 = (15 & param2) * var7;
              if (gf.field_i <= var8 &&
                gf.field_l > var8 &&
                gf.field_a <= var9 &&
                gf.field_f > var9) {
                var11 = (int)(Math.pow((double)var11 / 256.0, 0.55) * 256.0);
                var12 = 65280 & var10;
                var10 = var10 & 16711935;
                var12 = var12 * var11;
                var12 = var12 & 16711680;
                var10 = var10 * var11;
                var10 = var10 & -16711936;
                var13 = var9 * 640 + var8;
                var14 = gf.field_h[var13];
                var12 = var12 + (16711680 & (-var11 + 256) * (var14 & 65280));
                var10 = var10 + (-16711936 & (16711935 & var14) * (-var11 + 256));
                gf.field_h[var13] = ee.a(var12, var10) >>> 8;
              }
            }
            return;
          }
          var8Lifetime1 = (var7 << 12) / var6_intLifetime1;
          var9Lifetime1 = param2 + 7 >> 4;
          var10Lifetime1 = var8Lifetime1 * (-param2 + (var9Lifetime1 << 4)) + (param5 << 12);
          var11Lifetime1 = 16 - (15 & param2 + 7);
          var12Lifetime1 = var9Lifetime1;
          var13Lifetime1 = var10Lifetime1 >> 16;
          var15 = var12Lifetime1;
          var16 = var13Lifetime1;
          var17 = param4;
          var18 = (16 - ((var10Lifetime1 & 62246) >> 12)) * var11Lifetime1;
          if (gf.field_i <= var15 &&
            var15 < gf.field_l &&
            gf.field_a <= var16 &&
            var16 < gf.field_f) {
            var18 = (int)(Math.pow((double)var18 / 256.0, 0.55) * 256.0);
            var19 = var17 & 65280;
            var17 = var17 & 16711935;
            var19 = var19 * var18;
            var17 = var17 * var18;
            var19 = var19 & 16711680;
            var17 = var17 & -16711936;
            var20 = var15 + 640 * var16;
            var21 = gf.field_h[var20];
            var19 = var19 + ((var21 & 65280) * (256 - var18) & 16711680);
            var17 = var17 + (-16711936 & (var21 & 16711935) * (-var18 + 256));
            gf.field_h[var20] = ee.a(var19, var17) >>> 8;
          }
          var14Lifetime1 = var8Lifetime1 + var10Lifetime1;
          var15Lifetime1 = var12Lifetime1;
          var16Lifetime1 = 1 + var13Lifetime1;
          var17Lifetime1 = param4;
          var18Lifetime1 = (15 & var10Lifetime1 >> 12) * var11Lifetime1;
          if (gf.field_i <= var15Lifetime1 &&
            gf.field_l > var15Lifetime1 &&
            gf.field_a <= var16Lifetime1 &&
            gf.field_f > var16Lifetime1) {
            var18Lifetime1 = (int)(Math.pow((double)var18Lifetime1 / 256.0, 0.55) * 256.0);
            var19Lifetime1 = var17Lifetime1 & 65280;
            var19Lifetime1 = var19Lifetime1 * var18Lifetime1;
            var17Lifetime1 = var17Lifetime1 & 16711935;
            var17Lifetime1 = var17Lifetime1 * var18Lifetime1;
            var19Lifetime1 = var19Lifetime1 & 16711680;
            var17Lifetime1 = var17Lifetime1 & -16711936;
            var20Lifetime1 = var15Lifetime1 + var16Lifetime1 * 640;
            var21Lifetime1 = gf.field_h[var20Lifetime1];
            var19Lifetime1 = var19Lifetime1 + ((var21Lifetime1 & 65280) * (-var18Lifetime1 + 256) & 16711680);
            var17Lifetime1 = var17Lifetime1 + ((-var18Lifetime1 + 256) * (16711935 & var21Lifetime1) & -16711936);
            gf.field_h[var20Lifetime1] = ee.a(var19Lifetime1, var17Lifetime1) >>> 8;
          }
          var9Lifetime2 = param3 + 7 >> 4;
          var10Lifetime2 = var8Lifetime1 * (-param3 + (var9Lifetime2 << 4)) + (param0 << 12);
          var11Lifetime2 = 16 - (param3 + 7 & 15);
          var15Lifetime2 = var9Lifetime2;
          var16Lifetime2 = var10Lifetime2 >> 16;
          var17Lifetime2 = var15Lifetime2;
          var18Lifetime2 = var16Lifetime2;
          var19Lifetime2 = param4;
          var20Lifetime2 = (16 - (var10Lifetime2 >> 12 & 15)) * var11Lifetime2;
          if (gf.field_i <= var17Lifetime2 &&
            gf.field_l > var17Lifetime2 &&
            var18Lifetime2 >= gf.field_a &&
            gf.field_f > var18Lifetime2) {
            var20Lifetime2 = (int)(Math.pow((double)var20Lifetime2 / 256.0, 0.55) * 256.0);
            var21Lifetime2 = 65280 & var19Lifetime2;
            var21Lifetime2 = var21Lifetime2 * var20Lifetime2;
            var19Lifetime2 = var19Lifetime2 & 16711935;
            var19Lifetime2 = var19Lifetime2 * var20Lifetime2;
            var21Lifetime2 = var21Lifetime2 & 16711680;
            var19Lifetime2 = var19Lifetime2 & -16711936;
            var22 = var18Lifetime2 * 640 + var17Lifetime2;
            var23 = gf.field_h[var22];
            var21Lifetime2 = var21Lifetime2 + ((65280 & var23) * (-var20Lifetime2 + 256) & 16711680);
            var19Lifetime2 = var19Lifetime2 + ((256 - var20Lifetime2) * (var23 & 16711935) & -16711936);
            gf.field_h[var22] = ee.a(var19Lifetime2, var21Lifetime2) >>> 8;
          }
          var17Lifetime3 = var15Lifetime2;
          var18Lifetime3 = 1 + var16Lifetime2;
          var19Lifetime3 = param4;
          var20Lifetime3 = var11Lifetime2 * (var10Lifetime2 >> 12 & 15);
          if (var17Lifetime3 >= gf.field_i &&
            gf.field_l > var17Lifetime3 &&
            gf.field_a <= var18Lifetime3 &&
            var18Lifetime3 < gf.field_f) {
            var20Lifetime3 = (int)(256.0 * Math.pow((double)var20Lifetime3 / 256.0, 0.55));
            var21Lifetime3 = 65280 & var19Lifetime3;
            var21Lifetime3 = var21Lifetime3 * var20Lifetime3;
            var19Lifetime3 = var19Lifetime3 & 16711935;
            var19Lifetime3 = var19Lifetime3 * var20Lifetime3;
            var21Lifetime3 = var21Lifetime3 & 16711680;
            var19Lifetime3 = var19Lifetime3 & -16711936;
            var22Lifetime1 = 640 * var18Lifetime3 + var17Lifetime3;
            var23Lifetime1 = gf.field_h[var22Lifetime1];
            var19Lifetime3 = var19Lifetime3 + ((var23Lifetime1 & 16711935) * (-var20Lifetime3 + 256) & -16711936);
            var21Lifetime3 = var21Lifetime3 + ((65280 & var23Lifetime1) * (256 - var20Lifetime3) & 16711680);
            gf.field_h[var22Lifetime1] = ee.a(var21Lifetime3, var19Lifetime3) >>> 8;
          }
          if (param1 != -55) {
            kr.b((byte) 124);
          }
          var8Lifetime1 = var8Lifetime1 << 4;
          var12Lifetime1++;
          while (var15Lifetime2 > var12Lifetime1) {
            var17Lifetime4 = var12Lifetime1;
            var18Lifetime4 = var14Lifetime1 >> 16;
            var19Lifetime4 = param4;
            var20Lifetime4 = 256 - (var14Lifetime1 >> 8 & 255);
            if (gf.field_i <= var17Lifetime4 &&
              var17Lifetime4 < gf.field_l &&
              var18Lifetime4 >= gf.field_a &&
              gf.field_f > var18Lifetime4) {
              var20Lifetime4 = (int)(Math.pow((double)var20Lifetime4 / 256.0, 0.55) * 256.0);
              var21Lifetime4 = var19Lifetime4 & 65280;
              var19Lifetime4 = var19Lifetime4 & 16711935;
              var21Lifetime4 = var21Lifetime4 * var20Lifetime4;
              var21Lifetime4 = var21Lifetime4 & 16711680;
              var19Lifetime4 = var19Lifetime4 * var20Lifetime4;
              var19Lifetime4 = var19Lifetime4 & -16711936;
              var22Lifetime2 = var17Lifetime4 + 640 * var18Lifetime4;
              var23Lifetime2 = gf.field_h[var22Lifetime2];
              var19Lifetime4 = var19Lifetime4 + (-16711936 & (-var20Lifetime4 + 256) * (16711935 & var23Lifetime2));
              var21Lifetime4 = var21Lifetime4 + (16711680 & (256 - var20Lifetime4) * (var23Lifetime2 & 65280));
              gf.field_h[var22Lifetime2] = ee.a(var21Lifetime4, var19Lifetime4) >>> 8;
            }
            var17Lifetime4Lifetime1 = var12Lifetime1;
            var18Lifetime4Lifetime1 = (var14Lifetime1 >> 16) + 1;
            var19Lifetime4Lifetime1 = param4;
            var20Lifetime4Lifetime1 = (var14Lifetime1 & 65489) >> 8;
            if (var17Lifetime4Lifetime1 >= gf.field_i &&
              gf.field_l > var17Lifetime4Lifetime1 &&
              var18Lifetime4Lifetime1 >= gf.field_a &&
              gf.field_f > var18Lifetime4Lifetime1) {
              var20Lifetime4Lifetime1 = (int)(256.0 * Math.pow((double)var20Lifetime4Lifetime1 / 256.0, 0.55));
              var21Lifetime4Lifetime1 = 65280 & var19Lifetime4Lifetime1;
              var21Lifetime4Lifetime1 = var21Lifetime4Lifetime1 * var20Lifetime4Lifetime1;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 & 16711935;
              var21Lifetime4Lifetime1 = var21Lifetime4Lifetime1 & 16711680;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 * var20Lifetime4Lifetime1;
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 & -16711936;
              var22Lifetime2Lifetime1 = var18Lifetime4Lifetime1 * 640 + var17Lifetime4Lifetime1;
              var23Lifetime2Lifetime1 = gf.field_h[var22Lifetime2Lifetime1];
              var21Lifetime4Lifetime1 = var21Lifetime4Lifetime1 + ((256 - var20Lifetime4Lifetime1) * (65280 & var23Lifetime2Lifetime1) & 16711680);
              var19Lifetime4Lifetime1 = var19Lifetime4Lifetime1 + (-16711936 & (16711935 & var23Lifetime2Lifetime1) * (256 - var20Lifetime4Lifetime1));
              gf.field_h[var22Lifetime2Lifetime1] = ee.a(var19Lifetime4Lifetime1, var21Lifetime4Lifetime1) >>> 8;
            }
            var14Lifetime1 = var14Lifetime1 + var8Lifetime1;
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var6), "kr.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    kr(String param0) {
        super(param0);
    }

    final static ik b(byte param0) {
        if (ed.field_c.g(69)) {
          return new ik();
        }
        if (param0 != -103) {
          kr.b((byte) -5);
        }
        return (ik) (ed.field_c.h(44));
    }

    static {
        field_e = new int[8192];
        field_c = "Please enter your date of birth to enable chat:";
    }
}
