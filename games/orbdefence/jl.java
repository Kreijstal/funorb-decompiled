/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl {
    static int field_d;
    static long[] field_b;
    private static int[] field_c;
    static String field_a;
    static String field_f;
    static String field_e;

    final static ba[] a(byte param0) {
        if (param0 <= 25) {
          field_e = (String) null;
        }
        return new ba[]{rc.field_m, fb.field_i, ia.field_a, cj.field_a, aj.field_a, tl.field_c, hd.field_q, gl.field_j, id.field_a, jd.field_d, ol.field_f, ue.field_G, nd.field_e, bd.field_q};
    }

    abstract int b(int param0, int param1);

    abstract hd a(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9) {
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int[] var11 = null;
        int[] var12 = null;
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
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int var14Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var21Lifetime3;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime2Lifetime1;
        int var22Lifetime1Lifetime1;
        var25 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null == field_c ||
            !(field_c.length >= param1)) {
            ef.field_j = new int[param1];
            field_c = new int[param1];
            tl.field_b = new int[param1];
          }
          var31 = field_c;
          var27 = var31;
          var26 = var27;
          var34 = var26;
          var30 = var34;
          var10 = var30;
          var32 = tl.field_b;
          var28 = var32;
          var11 = var28;
          var33 = ef.field_j;
          var29 = var33;
          var12 = var29;
          mk.a(var31, 0, param1);
          mk.a(var32, 0, param1);
          mk.a(var33, 0, param1);
          var13 = 16384 / (1 + 2 * param2);
          var14 = param0 - param2;
          if (var14 < 0) {
            var14 = 0;
          }
          var15 = ul.field_f * var14 + param9;
          var16 = param0 + param2;
          var17 = 0;
          if (ul.field_l <= var16) {
            var17 = 1 + (var16 - ul.field_l);
            var16 = ul.field_l - 1;
          }
          var18 = 1 + var16 - var14;
          while (var16 >= var14) {
            for (var19 = 0; param1 > var19; var19++) {
              param7 = param8[var15++];
              var10[var19] = var10[var19] + (vi.a(16771310, param7) >> 16);
              var11[var19] = var11[var19] + (vi.a(65293, param7) >> 8);
              var12[var19] = var12[var19] + vi.a(255, param7);
            }
            var15 = var15 + param6;
            var14++;
          }
          var15 = var15 + ul.field_f * var17;
          for (var19Lifetime1 = 0; var19Lifetime1 < param1; var19Lifetime1++) {
            incrementValue$7 = param3;
            param3++;
            param8[incrementValue$7] = var33[var19Lifetime1] / var18 + (var32[var19Lifetime1] / var18 << 8) + (var34[var19Lifetime1] / var18 << 16);
          }
          var14Lifetime1 = -param5 + 1;
          param3 = param3 + param6;
          var19Lifetime2 = -param5 + (param2 + 1) - param0;
          if (var19Lifetime2 > 0) {
            var19Lifetime2 = 0;
          }
          var20 = param9 + ul.field_f * (-param2 + param0);
          if (var19Lifetime2 > var14Lifetime1) {
            var20 = var20 + (-var14Lifetime1 + var19Lifetime2) * ul.field_f;
          }
          while (var14Lifetime1 < var19Lifetime2) {
            if (param0 + (var14Lifetime1 + param5 + param2) < ul.field_a) {
              for (var21 = 0; var21 < param1; var21++) {
                param7 = param8[var15++];
                var10[var21] = var10[var21] + (vi.a(16738842, param7) >> 16);
                var11[var21] = var11[var21] + (vi.a(param7, 65525) >> 8);
                var12[var21] = var12[var21] + vi.a(255, param7);
              }
              var15 = var15 + param6;
              var18++;
            } else {
              var15 = var15 + ul.field_f;
            }
            for (var21Lifetime3 = 0; var21Lifetime3 < param1; var21Lifetime3++) {
              var22 = var34[var21Lifetime3] / var18;
              var23 = var32[var21Lifetime3] / var18;
              var24 = var33[var21Lifetime3] / var18;
              incrementValue$6 = param3;
              param3++;
              param8[incrementValue$6] = var24 + ((var22 << 16) + (var23 << 8));
            }
            param3 = param3 + param6;
            var14Lifetime1++;
          }
          var19Lifetime3 = -param2 - param0 + ul.field_l - param5;
          if (~var19Lifetime3 < param4) {
            var19Lifetime3 = 0;
          }
          while (var19Lifetime3 > var14Lifetime1) {
            for (var21Lifetime1 = 0; param1 > var21Lifetime1; var21Lifetime1++) {
              param7 = param8[var20++];
              var22Lifetime1 = var34[var21Lifetime1] - ((16769585 & param7) >> 16);
              stackIn_44_0 = var10;
              stackIn_44_1 = var21Lifetime1;
              if (var22Lifetime1 >= 0) {
                stackIn_45_2 = var22Lifetime1;
              } else {
                stackIn_45_2 = 0;
              }
              stackIn_44_0[stackIn_44_1] = stackIn_45_2;
              var22Lifetime1 = var32[var21Lifetime1] - ((param7 & 65309) >> 8);
              stackIn_47_0 = var11;
              stackIn_47_1 = var21Lifetime1;
              if (var22Lifetime1 < 0) {
                stackIn_48_2 = 0;
              } else {
                stackIn_48_2 = var22Lifetime1;
              }
              stackIn_47_0[stackIn_47_1] = stackIn_48_2;
              var22Lifetime1 = var33[var21Lifetime1] - (param7 & 255);
              stackIn_50_0 = var12;
              stackIn_50_1 = var21Lifetime1;
              if (var22Lifetime1 < 0) {
                stackIn_51_2 = 0;
              } else {
                stackIn_51_2 = var22Lifetime1;
              }
              stackIn_50_0[stackIn_50_1] = stackIn_51_2;
            }
            for (var21Lifetime1Lifetime1 = 0; param1 > var21Lifetime1Lifetime1; var21Lifetime1Lifetime1++) {
              param7 = param8[var15++];
              var10[var21Lifetime1Lifetime1] = var10[var21Lifetime1Lifetime1] + (vi.a(16758132, param7) >> 16);
              var11[var21Lifetime1Lifetime1] = var11[var21Lifetime1Lifetime1] + vi.a(255, param7 >> 8);
              var12[var21Lifetime1Lifetime1] = var12[var21Lifetime1Lifetime1] + vi.a(param7, 255);
            }
            var20 = var20 + param6;
            for (var21Lifetime1Lifetime2 = 0; var21Lifetime1Lifetime2 < param1; var21Lifetime1Lifetime2++) {
              var22Lifetime1Lifetime1 = var34[var21Lifetime1Lifetime2] * var13 >> 14;
              var23Lifetime1 = var32[var21Lifetime1Lifetime2] * var13 >> 14;
              var24Lifetime1 = var33[var21Lifetime1Lifetime2] * var13 >> 14;
              if (var22Lifetime1Lifetime1 > 255) {
                var22Lifetime1Lifetime1 = 255;
              }
              if (255 < var23Lifetime1) {
                var23Lifetime1 = 255;
              }
              if (var24Lifetime1 > 255) {
                var24Lifetime1 = 255;
              }
              incrementValue$2 = param3;
              param3++;
              param8[incrementValue$2] = (var22Lifetime1Lifetime1 << 16) + ((var23Lifetime1 << 8) + var24Lifetime1);
            }
            var15 = var15 + param6;
            param3 = param3 + param6;
            var14Lifetime1++;
          }
          while (0 > var14Lifetime1) {
            for (var21Lifetime2 = 0; var21Lifetime2 < param1; var21Lifetime2++) {
              param7 = param8[var20++];
              var10[var21Lifetime2] = var10[var21Lifetime2] - (vi.a(param7, 16757155) >> 16);
              var11[var21Lifetime2] = var11[var21Lifetime2] - (vi.a(65471, param7) >> 8);
              var12[var21Lifetime2] = var12[var21Lifetime2] - vi.a(param7, 255);
            }
            var20 = var20 + param6;
            var18--;
            for (var21Lifetime2Lifetime1 = 0; param1 > var21Lifetime2Lifetime1; var21Lifetime2Lifetime1++) {
              var22Lifetime2 = var34[var21Lifetime2Lifetime1] / var18;
              var23Lifetime2 = var32[var21Lifetime2Lifetime1] / var18;
              if (var22Lifetime2 >= 0) {
                if (255 < var22Lifetime2) {
                  var22Lifetime2 = 255;
                }
              } else {
                var22Lifetime2 = 0;
              }
              if (var23Lifetime2 < 0) {
                var23Lifetime2 = 0;
              } else {
                if (var23Lifetime2 > 255) {
                  var23Lifetime2 = 255;
                }
              }
              var24Lifetime2 = var33[var21Lifetime2Lifetime1] / var18;
              if (0 > var24Lifetime2) {
                var24Lifetime2 = 0;
              } else {
                if (255 < var24Lifetime2) {
                  var24Lifetime2 = 255;
                }
              }
              incrementValue$0 = param3;
              param3++;
              param8[incrementValue$0] = var24Lifetime2 + ((var23Lifetime2 << 8) + (var22Lifetime2 << 16));
            }
            param3 = param3 + param6;
            var14Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_90_0 = var10_ref;
          stackIn_90_1 = new StringBuilder().append("jl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param9).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 != 9) {
          return;
        }
        field_e = null;
        field_c = null;
        field_b = null;
        field_f = null;
    }

    static {
        field_b = new long[32];
        field_a = "Menu";
        field_f = "GHOSTO";
    }
}
