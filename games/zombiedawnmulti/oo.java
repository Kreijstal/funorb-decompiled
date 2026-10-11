/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    static int field_g;
    static int field_b;
    private static int[] field_j;
    static int[] field_h;
    static int field_f;
    private static int[] field_c;
    private static int[] field_k;
    static int[] field_a;
    static int field_l;
    static int field_d;
    static int field_e;
    static int[] field_i;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int var5 = param2 * param2;
        int var6 = param0 - param2 >> 4;
        int var7 = param0 + param2 + 15 >> 4;
        int var8 = param1 - param2 >> 4;
        int var9 = param1 + param2 + 15 >> 4;
        if (var6 < field_f) {
          var6 = field_f;
        }
        if (var7 > field_g) {
          var7 = field_g;
        }
        if (var8 < field_e) {
          var8 = field_e;
        }
        if (var9 > field_d) {
          var9 = field_d;
        }
        int var10 = (var6 << 4) - param0;
        var10 = var10 * var10;
        int var11 = (var6 + 1 << 4) - param0;
        var11 = var11 * var11;
        int var12 = (var6 + 2 << 4) - param0;
        var12 = var12 * var12;
        int var13 = var11 - var10;
        int var14 = var12 - var11;
        int var15 = var14 - var13;
        int var16 = (var8 << 4) - param1;
        var16 = var16 * var16;
        int var17 = (var8 + 1 << 4) - param1;
        var17 = var17 * var17;
        int var18 = (var8 + 2 << 4) - param1;
        var18 = var18 * var18;
        int var19 = var17 - var16;
        int var20 = var18 - var17;
        int var21 = var20 - var19;
        int var22 = var6 + var8 * field_b;
        int var23 = field_b + var6 - var7;
        oo.a(0, 0, 0, 0, 0, var15, var5, var22, field_i, param3, param4, var23, var13, var6 - var7, var16 + var10, var19, var21, var8 - var9);
    }

    final static void b(int[] param0) {
        field_f = param0[0];
        field_e = param0[1];
        field_g = param0[2];
        field_d = param0[3];
        oo.d();
    }

    final static void g(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var5Lifetime1;
        int var6Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            oo.b(param0 + param2, param1, -param2 + 1, param4);
          } else {
            oo.b(param0, param1, param2 + 1, param4);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            oo.g(param0, param1 + param3, -param3 + 1, param4);
          } else {
            oo.g(param0, param1, param3 + 1, param4);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var5 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < field_e) {
            param0 = param0 + var5 * (field_e - param1);
            param1 = field_e;
          }
          if (param3 >= field_d) {
            param3 = field_d - 1;
          }
          while (param1 <= param3) {
            var6 = param0 >> 16;
            if (var6 >= field_f &&
              var6 < field_g) {
              field_i[var6 + param1 * field_b] = param4;
            }
            param0 = param0 + var5;
            param1++;
          }
          return;
        }
        param1 = param1 << 16;
        param1 = param1 + 32768;
        param3 = param3 << 16;
        var5Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
        param2 = param2 + param0;
        if (param0 < field_f) {
          param1 = param1 + var5Lifetime1 * (field_f - param0);
          param0 = field_f;
        }
        if (param2 >= field_g) {
          param2 = field_g - 1;
        }
        while (param0 <= param2) {
          var6Lifetime1 = param1 >> 16;
          if (var6Lifetime1 >= field_e &&
            var6Lifetime1 < field_d) {
            field_i[param0 + var6Lifetime1 * field_b] = param4;
          }
          param1 = param1 + var5Lifetime1;
          param0++;
        }
    }

    final static void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        var6 = param2 - param0;
        var7 = param3 - param1;
        if (var6 < 0) {
          stackIn_3_0 = -var6;
        } else {
          stackIn_3_0 = var6;
        }
        var8 = stackIn_3_0;
        if (var7 < 0) {
          stackIn_6_0 = -var7;
        } else {
          stackIn_6_0 = var7;
        }
        var9 = stackIn_6_0;
        var10 = var8;
        if (var10 < var9) {
          var10 = var9;
        }
        if (var10 == 0) {
          return;
        }
        var11 = (var6 << 16) / var10;
        var12 = (var7 << 16) / var10;
        if (var12 > var11) {
          var12 = -var12;
        } else {
          var11 = -var11;
        }
        var13 = param5 * var12 >> 17;
        var14 = param5 * var12 + 1 >> 17;
        var15 = param5 * var11 >> 17;
        var16 = param5 * var11 + 1 >> 17;
        param0 = param0 - ep.a();
        param1 = param1 - ep.d();
        var17 = param0 + var13;
        var18 = param0 - var14;
        var19 = param0 + var6 - var14;
        var20 = param0 + var6 + var13;
        var21 = param1 + var15;
        var22 = param1 - var16;
        var23 = param1 + var7 - var16;
        var24 = param1 + var7 + var15;
        ep.a(var17, var18, var19);
        ep.a(var21, var22, var23, var17, var18, var19, param4);
        ep.a(var17, var19, var20);
        ep.a(var21, var23, var24, var17, var19, var20, param4);
        return;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8, int param9, int[] param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17) {
        int var18 = 0;
        while (param17 < 0) {
          param3 = param14;
          param4 = param12;
          for (var18 = param13; var18 < 0; var18++) {
            if (param3 < param6) {
              param0 = param10[(param6 - param3) * param9 / param6];
              param1 = param8[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              param8[param7] = param2 - param1 | param1 - (param1 >>> 8);
            }
            param7++;
            param3 = param3 + param4;
            param4 = param4 + param5;
          }
          param7 = param7 + param11;
          param14 = param14 + param15;
          param15 = param15 + param16;
          param17++;
        }
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        if (param1 >= field_e) {
          if (param1 >= field_d) {
            return;
          }
          if (param0 < field_f) {
            param2 = param2 - (field_f - param0);
            param0 = field_f;
          }
          if (param0 + param2 > field_g) {
            param2 = field_g - param0;
          }
          var5 = 256 - param4;
          var6 = (param3 >> 16 & 255) * param4;
          var7 = (param3 >> 8 & 255) * param4;
          var8 = (param3 & 255) * param4;
          var12 = param0 + param1 * field_b;
          for (var13 = 0; var13 < param2; var13++) {
            var9 = (field_i[var12] >> 16 & 255) * var5;
            var10 = (field_i[var12] >> 8 & 255) * var5;
            var11 = (field_i[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            incrementValue$0 = var12;
            var12++;
            field_i[incrementValue$0] = var14;
          }
          return;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var13 = 0;
        int incrementValue$0 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$2 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var19Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        var8 = 16384 / (2 * param3 + 1);
        var9 = 1 + param3 - param5 - param4;
        if (0 < var9) {
          var9 = 0;
        }
        var10 = field_b - param4 - param5 - param3;
        if (0 < var10) {
          var10 = 0;
        }
        var11 = 0;
        var12 = param4 + param3 + 1;
        if (field_b < var12) {
          var11 = var12 - field_b;
          var12 = field_b;
        }
        for (var13 = -param7; var13 < 0; var13++) {
          var14 = 0;
          var15 = 0;
          var16 = 0;
          var17 = param2 - param3;
          var18 = var17 - (param3 << 1) - 1;
          var19 = param4 - param3;
          if (var19 < 0) {
            var17 = var17 - var19;
            var18 = var18 - var19;
            var19 = 0;
          }
          var20 = var12 - var19;
          while (var19 < var12) {
            param1 = param0[var17];
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var17++;
            var18++;
            var19++;
          }
          var18 = var18 + var11;
          incrementValue$0 = param2;
          param2++;
          param0[incrementValue$0] = (var14 / var20 << 16) + (var15 / var20 << 8) + var16 / var20;
          for (var19Lifetime1 = 1 - param5; var19Lifetime1 < var9; var19Lifetime1++) {
            var18++;
            if (param4 + param5 + var19Lifetime1 + param3 < field_g) {
              param1 = param0[var17];
              var17++;
              var14 = var14 + (param1 >> 16 & 255);
              var15 = var15 + (param1 >> 8 & 255);
              var16 = var16 + (param1 & 255);
              var20++;
            }
            var21 = var14 / var20;
            var22 = var15 / var20;
            var23 = var16 / var20;
            incrementValue$5 = param2;
            param2++;
            param0[incrementValue$5] = (var21 << 16) + (var22 << 8) + var23;
          }
          while (var19Lifetime1 < var10) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            if (var14 < 0) {
              var14 = 0;
            }
            var15 = var15 - (param1 >> 8 & 255);
            if (var15 < 0) {
              var15 = 0;
            }
            var16 = var16 - (param1 & 255);
            if (var16 < 0) {
              var16 = 0;
            }
            param1 = param0[var17];
            var17++;
            var14 = var14 + (param1 >> 16 & 255);
            var15 = var15 + (param1 >> 8 & 255);
            var16 = var16 + (param1 & 255);
            var21Lifetime1 = var14 * var8 >> 14;
            var22Lifetime1 = var15 * var8 >> 14;
            var23Lifetime1 = var16 * var8 >> 14;
            if (var21Lifetime1 > 255) {
              var21Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$4 = param2;
            param2++;
            param0[incrementValue$4] = (var21Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
            var19Lifetime1++;
          }
          while (var19Lifetime1 < 0) {
            param1 = param0[var18++];
            var14 = var14 - (param1 >> 16 & 255);
            var15 = var15 - (param1 >> 8 & 255);
            var16 = var16 - (param1 & 255);
            var20--;
            var21Lifetime2 = var14 / var20;
            var22Lifetime2 = var15 / var20;
            var23Lifetime2 = var16 / var20;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
            var19Lifetime1++;
          }
          param2 = param2 + param6;
        }
    }

    final static void f(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var11;
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param1 < field_e) {
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        param4 = ((param4 & 16711935) * param5 >> 8 & 16711935) + ((param4 & 65280) * param5 >> 8 & 65280);
        var6 = 256 - param5;
        var7 = field_b - param2;
        var8 = param0 + param1 * field_b;
        for (var9 = 0; var9 < param3; var9++) {
          for (var10 = -param2; var10 < 0; var10++) {
            var11 = field_i[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + ((var11 & 65280) * var6 >> 8 & 65280);
            incrementValue$0 = var8;
            var8++;
            field_i[incrementValue$0] = param4 + var11;
          }
          var8 = var8 + var7;
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int incrementValue$7 = 0;
        int incrementValue$6 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int[] var9;
        int[] var10;
        int[] var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int var13Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var20Lifetime3;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var20Lifetime2Lifetime1;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime1Lifetime3;
        if (field_c == null ||
          !(field_c.length >= param8)) {
          field_c = new int[param8];
          field_k = new int[param8];
          field_j = new int[param8];
        }
        var27 = field_c;
        var24 = var27;
        var9 = var24;
        var28 = field_k;
        var25 = var28;
        var10 = var25;
        var29 = field_j;
        var26 = var29;
        var11 = var26;
        d.a(var27, 0, param8);
        d.a(var28, 0, param8);
        d.a(var29, 0, param8);
        var12 = 16384 / (2 * param3 + 1);
        var13 = param4 - param3;
        if (var13 < 0) {
          var13 = 0;
        }
        var14 = param7 + var13 * field_b;
        var15 = param4 + param3;
        var16 = 0;
        if (var15 >= field_l) {
          var16 = var15 - field_l + 1;
          var15 = field_l - 1;
        }
        var17 = var15 - var13 + 1;
        while (var13 <= var15) {
          for (var18 = 0; var18 < param8; var18++) {
            param1 = param0[var14++];
            var9[var18] = var9[var18] + (param1 >> 16 & 255);
            var10[var18] = var10[var18] + (param1 >> 8 & 255);
            var11[var18] = var11[var18] + (param1 & 255);
          }
          var14 = var14 + param6;
          var13++;
        }
        var14 = var14 + var16 * field_b;
        for (var18Lifetime1 = 0; var18Lifetime1 < param8; var18Lifetime1++) {
          incrementValue$7 = param2;
          param2++;
          param0[incrementValue$7] = (var27[var18Lifetime1] / var17 << 16) + (var28[var18Lifetime1] / var17 << 8) + var29[var18Lifetime1] / var17;
        }
        param2 = param2 + param6;
        var13Lifetime1 = 1 - param5;
        var18Lifetime2 = 1 + param3 - param5 - param4;
        if (0 < var18Lifetime2) {
          var18Lifetime2 = 0;
        }
        var19 = param7 + (param4 - param3) * field_b;
        if (var13Lifetime1 < var18Lifetime2) {
          var19 = var19 + (var18Lifetime2 - var13Lifetime1) * field_b;
        }
        while (var13Lifetime1 < var18Lifetime2) {
          if (var13Lifetime1 + param4 + param5 + param3 < field_d) {
            for (var20 = 0; var20 < param8; var20++) {
              param1 = param0[var14++];
              var9[var20] = var9[var20] + (param1 >> 16 & 255);
              var10[var20] = var10[var20] + (param1 >> 8 & 255);
              var11[var20] = var11[var20] + (param1 & 255);
            }
            var14 = var14 + param6;
            var17++;
          } else {
            var14 = var14 + field_b;
          }
          for (var20Lifetime3 = 0; var20Lifetime3 < param8; var20Lifetime3++) {
            var21 = var27[var20Lifetime3] / var17;
            var22 = var28[var20Lifetime3] / var17;
            var23 = var29[var20Lifetime3] / var17;
            incrementValue$6 = param2;
            param2++;
            param0[incrementValue$6] = (var21 << 16) + (var22 << 8) + var23;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        var18Lifetime3 = field_l - param4 - param5 - param3;
        if (0 < var18Lifetime3) {
          var18Lifetime3 = 0;
        }
        while (var13Lifetime1 < var18Lifetime3) {
          for (var20Lifetime1 = 0; var20Lifetime1 < param8; var20Lifetime1++) {
            param1 = param0[var19++];
            var21Lifetime1 = var27[var20Lifetime1] - (param1 >> 16 & 255);
            stackIn_38_0 = var9;
            stackIn_38_1 = var20Lifetime1;
            if (var21Lifetime1 >= 0) {
              stackIn_39_2 = var21Lifetime1;
            } else {
              stackIn_39_2 = 0;
            }
            stackIn_38_0[stackIn_38_1] = stackIn_39_2;
            var21Lifetime1Lifetime2 = var28[var20Lifetime1] - (param1 >> 8 & 255);
            stackIn_41_0 = var10;
            stackIn_41_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime2 >= 0) {
              stackIn_42_2 = var21Lifetime1Lifetime2;
            } else {
              stackIn_42_2 = 0;
            }
            stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            var21Lifetime1Lifetime3 = var29[var20Lifetime1] - (param1 & 255);
            stackIn_44_0 = var11;
            stackIn_44_1 = var20Lifetime1;
            if (var21Lifetime1Lifetime3 >= 0) {
              stackIn_45_2 = var21Lifetime1Lifetime3;
            } else {
              stackIn_45_2 = 0;
            }
            stackIn_44_0[stackIn_44_1] = stackIn_45_2;
          }
          var19 = var19 + param6;
          for (var20Lifetime1Lifetime1 = 0; var20Lifetime1Lifetime1 < param8; var20Lifetime1Lifetime1++) {
            param1 = param0[var14++];
            var9[var20Lifetime1Lifetime1] = var9[var20Lifetime1Lifetime1] + (param1 >> 16 & 255);
            var10[var20Lifetime1Lifetime1] = var10[var20Lifetime1Lifetime1] + (param1 >> 8 & 255);
            var11[var20Lifetime1Lifetime1] = var11[var20Lifetime1Lifetime1] + (param1 & 255);
          }
          var14 = var14 + param6;
          for (var20Lifetime1Lifetime2 = 0; var20Lifetime1Lifetime2 < param8; var20Lifetime1Lifetime2++) {
            var21Lifetime1Lifetime1 = var27[var20Lifetime1Lifetime2] * var12 >> 14;
            var22Lifetime1 = var28[var20Lifetime1Lifetime2] * var12 >> 14;
            var23Lifetime1 = var29[var20Lifetime1Lifetime2] * var12 >> 14;
            if (var21Lifetime1Lifetime1 > 255) {
              var21Lifetime1Lifetime1 = 255;
            }
            if (var22Lifetime1 > 255) {
              var22Lifetime1 = 255;
            }
            if (var23Lifetime1 > 255) {
              var23Lifetime1 = 255;
            }
            incrementValue$2 = param2;
            param2++;
            param0[incrementValue$2] = (var21Lifetime1Lifetime1 << 16) + (var22Lifetime1 << 8) + var23Lifetime1;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
        while (var13Lifetime1 < 0) {
          for (var20Lifetime2 = 0; var20Lifetime2 < param8; var20Lifetime2++) {
            param1 = param0[var19++];
            var9[var20Lifetime2] = var9[var20Lifetime2] - (param1 >> 16 & 255);
            var10[var20Lifetime2] = var10[var20Lifetime2] - (param1 >> 8 & 255);
            var11[var20Lifetime2] = var11[var20Lifetime2] - (param1 & 255);
          }
          var19 = var19 + param6;
          var17--;
          for (var20Lifetime2Lifetime1 = 0; var20Lifetime2Lifetime1 < param8; var20Lifetime2Lifetime1++) {
            var21Lifetime2 = var27[var20Lifetime2Lifetime1] / var17;
            var22Lifetime2 = var28[var20Lifetime2Lifetime1] / var17;
            var23Lifetime2 = var29[var20Lifetime2Lifetime1] / var17;
            if (var21Lifetime2 >= 0) {
              if (var21Lifetime2 > 255) {
                var21Lifetime2 = 255;
              }
            } else {
              var21Lifetime2 = 0;
            }
            if (var22Lifetime2 >= 0) {
              if (var22Lifetime2 > 255) {
                var22Lifetime2 = 255;
              }
            } else {
              var22Lifetime2 = 0;
            }
            if (var23Lifetime2 >= 0) {
              if (var23Lifetime2 > 255) {
                var23Lifetime2 = 255;
              }
            } else {
              var23Lifetime2 = 0;
            }
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (var21Lifetime2 << 16) + (var22Lifetime2 << 8) + var23Lifetime2;
          }
          param2 = param2 + param6;
          var13Lifetime1++;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var14 = 0;
        int incrementValue$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        var6 = 0;
        var7 = 65536 / param3;
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param1 < field_e) {
          var6 = var6 + (field_e - param1) * var7;
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        var8 = field_b - param2;
        var9 = param0 + param1 * field_b;
        for (var10 = -param3; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -param2; var14 < 0; var14++) {
            incrementValue$0 = var9;
            var9++;
            field_i[incrementValue$0] = var13;
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    private final static void d() {
        field_h = null;
        field_a = null;
    }

    final static void e(int param0, int param1, int param2, int param3) {
        if (field_f < param0) {
          field_f = param0;
        }
        if (field_e < param1) {
          field_e = param1;
        }
        if (field_g > param2) {
          field_g = param2;
        }
        if (field_d > param3) {
          field_d = param3;
        }
        oo.d();
    }

    final static void d(int param0, int param1, int param2, int param3) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        if (param2 == 0) {
          oo.a(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        var4 = param1 - param2;
        if (var4 < field_e) {
          var4 = field_e;
        }
        var5 = param1 + param2 + 1;
        if (var5 > field_d) {
          var5 = field_d;
        }
        var6 = var4;
        var7 = param2 * param2;
        var8 = 0;
        var9 = param1 - var6;
        var10 = var9 * var9;
        var11 = var10 - var9;
        if (param1 > var5) {
          param1 = var5;
        }
        while (var6 < param1) {
          while (true) {
            if (var11 > var7 &&
              var10 > var7) {
              var12 = param0 - var8 + 1;
              if (var12 < field_f) {
                var12 = field_f;
              }
              var13 = param0 + var8;
              if (var13 > field_g) {
                var13 = field_g;
              }
              var14 = var12 + var6 * field_b;
              for (var15 = var12; var15 < var13; var15++) {
                incrementValue$4 = var14;
                var14++;
                field_i[incrementValue$4] = param3;
              }
              var6++;
              incrementValue$3 = var9;
              var9--;
              var10 = var10 - (incrementValue$3 + var9);
              var11 = var11 - (var9 + var9);
              break;
            }
            var10 = var10 + (var8 + var8);
            incrementValue$5 = var8;
            var8++;
            var11 = var11 + (incrementValue$5 + var8);
          }
        }
        var8Lifetime1 = param2;
        var9Lifetime1 = var6 - param1;
        var11Lifetime1 = var9Lifetime1 * var9Lifetime1 + var7;
        var10Lifetime1 = var11Lifetime1 - var8Lifetime1;
        var11Lifetime1 = var11Lifetime1 - var9Lifetime1;
        while (var6 < var5) {
          while (var11Lifetime1 > var7) {
            if (var10Lifetime1 > var7) {
              incrementValue$0 = var8Lifetime1;
              var8Lifetime1--;
              var11Lifetime1 = var11Lifetime1 - (incrementValue$0 + var8Lifetime1);
              var10Lifetime1 = var10Lifetime1 - (var8Lifetime1 + var8Lifetime1);
              continue;
            }
            break;
          }
          var12Lifetime1 = param0 - var8Lifetime1;
          if (var12Lifetime1 < field_f) {
            var12Lifetime1 = field_f;
          }
          var13Lifetime1 = param0 + var8Lifetime1;
          if (var13Lifetime1 > field_g - 1) {
            var13Lifetime1 = field_g - 1;
          }
          var14Lifetime1 = var12Lifetime1 + var6 * field_b;
          for (var15Lifetime1 = var12Lifetime1; var15Lifetime1 <= var13Lifetime1; var15Lifetime1++) {
            incrementValue$2 = var14Lifetime1;
            var14Lifetime1++;
            field_i[incrementValue$2] = param3;
          }
          var6++;
          var11Lifetime1 = var11Lifetime1 + (var9Lifetime1 + var9Lifetime1);
          incrementValue$1 = var9Lifetime1;
          var9Lifetime1++;
          var10Lifetime1 = var10Lifetime1 + (incrementValue$1 + var9Lifetime1);
        }
        return;
    }

    final static void g(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        param2 = param2 - param0;
        param3 = param3 - param1;
        if (param3 == 0) {
          if (param2 < 0) {
            oo.c(param0 + param2, param1, -param2 + 1, param4, param5);
          } else {
            oo.c(param0, param1, param2 + 1, param4, param5);
          }
          return;
        }
        if (param2 == 0) {
          if (param3 < 0) {
            oo.b(param0, param1 + param3, -param3 + 1, param4, param5);
          } else {
            oo.b(param0, param1, param3 + 1, param4, param5);
          }
          return;
        }
        if (param2 + param3 < 0) {
          param0 = param0 + param2;
          param2 = -param2;
          param1 = param1 + param3;
          param3 = -param3;
        }
        var6 = 256 - param5;
        var7 = (param4 >> 16 & 255) * param5;
        var8 = (param4 >> 8 & 255) * param5;
        var9 = (param4 & 255) * param5;
        if (param2 <= param3) {
          param0 = param0 << 16;
          param0 = param0 + 32768;
          param2 = param2 << 16;
          var10 = (int)Math.floor((double)param2 / (double)param3 + 0.5);
          param3 = param3 + param1;
          if (param1 < field_e) {
            param0 = param0 + var10 * (field_e - param1);
            param1 = field_e;
          }
          if (param3 >= field_d) {
            param3 = field_d - 1;
          }
          while (param1 <= param3) {
            var11 = param0 >> 16;
            if (var11 >= field_f &&
              var11 < field_g) {
              var12 = var11 + param1 * field_b;
              var13 = (field_i[var12] >> 16 & 255) * var6;
              var14 = (field_i[var12] >> 8 & 255) * var6;
              var15 = (field_i[var12] & 255) * var6;
              var16 = (var7 + var13 >> 8 << 16) + (var8 + var14 >> 8 << 8) + (var9 + var15 >> 8);
              field_i[var12] = var16;
            }
            param0 = param0 + var10;
            param1++;
          }
          return;
        }
        param1 = param1 << 16;
        param1 = param1 + 32768;
        param3 = param3 << 16;
        var10Lifetime1 = (int)Math.floor((double)param3 / (double)param2 + 0.5);
        param2 = param2 + param0;
        if (param0 < field_f) {
          param1 = param1 + var10Lifetime1 * (field_f - param0);
          param0 = field_f;
        }
        if (param2 >= field_g) {
          param2 = field_g - 1;
        }
        while (param0 <= param2) {
          var11Lifetime1 = param1 >> 16;
          if (var11Lifetime1 >= field_e &&
            var11Lifetime1 < field_d) {
            var12Lifetime1 = param0 + var11Lifetime1 * field_b;
            var13Lifetime1 = (field_i[var12Lifetime1] >> 16 & 255) * var6;
            var14Lifetime1 = (field_i[var12Lifetime1] >> 8 & 255) * var6;
            var15Lifetime1 = (field_i[var12Lifetime1] & 255) * var6;
            var16Lifetime1 = (var7 + var13Lifetime1 >> 8 << 16) + (var8 + var14Lifetime1 >> 8 << 8) + (var9 + var15Lifetime1 >> 8);
            field_i[var12Lifetime1] = var16Lifetime1;
          }
          param1 = param1 + var10Lifetime1;
          param0++;
        }
        return;
    }

    final static void g(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= field_f) {
          if (param0 >= field_g) {
            return;
          }
          if (param1 < field_e) {
            param2 = param2 - (field_e - param1);
            param1 = field_e;
          }
          if (param1 + param2 > field_d) {
            param2 = field_d - param1;
          }
          var4 = param0 + param1 * field_b;
          var5 = 0;
          while (var5 < param2) {
            field_i[var4] = param3;
            var5++;
            var4 = var4 + field_b;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        oo.b(param0, param1, param2, param4);
        oo.b(param0, param1 + param3 - 1, param2, param4);
        oo.g(param0, param1, param3, param4);
        oo.g(param0 + param2 - 1, param1, param3, param4);
    }

    final static void d(int param0, int param1, int param2, int param3, int param4) {
        int incrementValue$4 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        if (param4 == 0) {
          return;
        }
        if (param4 == 256) {
          oo.d(param0, param1, param2, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        var5 = 256 - param4;
        var6 = (param3 >> 16 & 255) * param4;
        var7 = (param3 >> 8 & 255) * param4;
        var8 = (param3 & 255) * param4;
        var12 = param1 - param2;
        if (var12 < field_e) {
          var12 = field_e;
        }
        var13 = param1 + param2 + 1;
        if (var13 > field_d) {
          var13 = field_d;
        }
        var14 = var12;
        var15 = param2 * param2;
        var16 = 0;
        var17 = param1 - var14;
        var18 = var17 * var17;
        var19 = var18 - var17;
        if (param1 > var13) {
          param1 = var13;
        }
        while (var14 < param1) {
          while (true) {
            if (var19 > var15 &&
              var18 > var15) {
              var20 = param0 - var16 + 1;
              if (var20 < field_f) {
                var20 = field_f;
              }
              var21 = param0 + var16;
              if (var21 > field_g) {
                var21 = field_g;
              }
              var22 = var20 + var14 * field_b;
              for (var23 = var20; var23 < var21; var23++) {
                var9 = (field_i[var22] >> 16 & 255) * var5;
                var10 = (field_i[var22] >> 8 & 255) * var5;
                var11 = (field_i[var22] & 255) * var5;
                var24 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
                incrementValue$4 = var22;
                var22++;
                field_i[incrementValue$4] = var24;
              }
              var14++;
              incrementValue$3 = var17;
              var17--;
              var18 = var18 - (incrementValue$3 + var17);
              var19 = var19 - (var17 + var17);
              break;
            }
            var18 = var18 + (var16 + var16);
            incrementValue$5 = var16;
            var16++;
            var19 = var19 + (incrementValue$5 + var16);
          }
        }
        var16Lifetime1 = param2;
        var17 = -var17;
        var19Lifetime1 = var17 * var17 + var15;
        var18Lifetime1 = var19Lifetime1 - var16Lifetime1;
        var19Lifetime1 = var19Lifetime1 - var17;
        while (var14 < var13) {
          while (var19Lifetime1 > var15) {
            if (var18Lifetime1 > var15) {
              incrementValue$0 = var16Lifetime1;
              var16Lifetime1--;
              var19Lifetime1 = var19Lifetime1 - (incrementValue$0 + var16Lifetime1);
              var18Lifetime1 = var18Lifetime1 - (var16Lifetime1 + var16Lifetime1);
              continue;
            }
            break;
          }
          var20Lifetime1 = param0 - var16Lifetime1;
          if (var20Lifetime1 < field_f) {
            var20Lifetime1 = field_f;
          }
          var21Lifetime1 = param0 + var16Lifetime1;
          if (var21Lifetime1 > field_g - 1) {
            var21Lifetime1 = field_g - 1;
          }
          var25 = var20Lifetime1 + var14 * field_b;
          var22Lifetime1 = var25;
          for (var23Lifetime1 = var20Lifetime1; var23Lifetime1 <= var21Lifetime1; var23Lifetime1++) {
            var9Lifetime1 = (field_i[var25] >> 16 & 255) * var5;
            var10Lifetime1 = (field_i[var25] >> 8 & 255) * var5;
            var11Lifetime1 = (field_i[var25] & 255) * var5;
            var24Lifetime1 = (var6 + var9Lifetime1 >> 8 << 16) + (var7 + var10Lifetime1 >> 8 << 8) + (var8 + var11Lifetime1 >> 8);
            incrementValue$2 = var25;
            var25++;
            field_i[incrementValue$2] = var24Lifetime1;
          }
          var14++;
          var19Lifetime1 = var19Lifetime1 + (var17 + var17);
          incrementValue$1 = var17;
          var17++;
          var18Lifetime1 = var18Lifetime1 + (incrementValue$1 + var17);
        }
        return;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var22Lifetime1;
        int var22Lifetime2;
        int var22Lifetime3;
        if (param4 == 0) {
          oo.a(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param0 + param2 - param4 - 1;
        var9 = param1 + param3 - param4 - 1;
        if (field_g > field_f) {
          if (field_d <= field_e) {
            return;
          }
          if (param0 + param2 > field_f) {
            if (param0 < field_g &&
              param1 + param3 >= field_e &&
              param1 < field_d) {
              var10 = var6 + (var7 - param4) * field_b;
              var11 = var8 + (var7 - param4) * field_b;
              var12 = var6 + var7 * field_b;
              var13 = var8 + var7 * field_b;
              var14 = var6 + var9 * field_b;
              var15 = var8 + var9 * field_b;
              var16 = var6 + (var9 + param4) * field_b;
              var17 = var8 + (var9 + param4) * field_b;
              var18 = param4;
              var19 = 0;
              var20 = param4 * param4;
              var21 = var20 - var18;
              if (param0 >= field_f &&
                param0 + param2 < field_g &&
                param1 >= field_e &&
                param1 + param3 < field_d) {
                for (var22 = var12; var22 <= var14; var22 = var22 + field_b) {
                  field_i[var22 - var18] = param5;
                }
                for (var22Lifetime1 = var13; var22Lifetime1 <= var15; var22Lifetime1 = var22Lifetime1 + field_b) {
                  field_i[var22Lifetime1 + var18] = param5;
                }
                for (var22Lifetime2 = var10; var22Lifetime2 <= var11; var22Lifetime2++) {
                  field_i[var22Lifetime2] = param5;
                }
                for (var22Lifetime3 = var16; var22Lifetime3 <= var17; var22Lifetime3++) {
                  field_i[var22Lifetime3] = param5;
                }
                while (true) {
                  incrementValue$0 = var19;
                  var19++;
                  var21 = var21 + (incrementValue$0 + var19);
                  var12 = var12 - field_b;
                  var13 = var13 - field_b;
                  var14 = var14 + field_b;
                  var15 = var15 + field_b;
                  if (var21 > var20) {
                    var18--;
                    var21 = var21 - (var18 + var18);
                    var10 = var10 + field_b;
                    var11 = var11 + field_b;
                    var16 = var16 - field_b;
                    var17 = var17 - field_b;
                  }
                  if (var18 < var19) {
                    return;
                  }
                  field_i[var10 - var19] = param5;
                  field_i[var11 + var19] = param5;
                  field_i[var12 - var18] = param5;
                  field_i[var13 + var18] = param5;
                  field_i[var14 - var18] = param5;
                  field_i[var15 + var18] = param5;
                  field_i[var16 - var19] = param5;
                  field_i[var17 + var19] = param5;
                }
              }
              oo.g(param0, param1 + var18, param3 - var18 - var18, param5);
              oo.g(param0 + param2 - 1, param1 + var18, param3 - var18 - var18, param5);
              oo.b(param0 + var18, param1, param2 - var18 - var18, param5);
              oo.b(param0 + var18, param1 + param3 - 1, param2 - var18 - var18, param5);
              while (true) {
                incrementValue$1 = var19;
                var19++;
                var21 = var21 + (incrementValue$1 + var19);
                var12 = var12 - field_b;
                var13 = var13 - field_b;
                var14 = var14 + field_b;
                var15 = var15 + field_b;
                if (var21 > var20) {
                  var18--;
                  var21 = var21 - (var18 + var18);
                  var10 = var10 + field_b;
                  var11 = var11 + field_b;
                  var16 = var16 - field_b;
                  var17 = var17 - field_b;
                }
                if (var18 < var19) {
                  return;
                }
                if (var7 - var18 >= field_e &&
                  var7 - var18 < field_d) {
                  if (var6 - var19 >= field_f &&
                    var6 - var19 < field_g) {
                    field_i[var10 - var19] = param5;
                  }
                  if (var8 + var19 >= field_f &&
                    var8 + var19 < field_g) {
                    field_i[var11 + var19] = param5;
                  }
                }
                if (var7 - var19 >= field_e &&
                  var7 - var19 < field_d) {
                  if (var6 - var18 >= field_f &&
                    var6 - var18 < field_g) {
                    field_i[var12 - var18] = param5;
                  }
                  if (var8 + var18 >= field_f &&
                    var8 + var18 < field_g) {
                    field_i[var13 + var18] = param5;
                  }
                }
                if (var9 + var19 >= field_e &&
                  var9 + var19 < field_d) {
                  if (var6 - var18 >= field_f &&
                    var6 - var18 < field_g) {
                    field_i[var14 - var18] = param5;
                  }
                  if (var8 + var18 >= field_f &&
                    var8 + var18 < field_g) {
                    field_i[var15 + var18] = param5;
                  }
                }
                if (var9 + var18 < field_e) {
                  continue;
                }
                if (var9 + var18 >= field_d) {
                  continue;
                }
                if (var6 - var19 >= field_f &&
                  var6 - var19 < field_g) {
                  field_i[var16 - var19] = param5;
                }
                if (var8 + var19 < field_f) {
                  continue;
                }
                if (var8 + var19 >= field_g) {
                  continue;
                }
                field_i[var17 + var19] = param5;
              }
            }
            return;
          }
        }
        return;
    }

    final static void b() {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int var0 = 0;
        int var1 = field_b * field_l - 7;
        while (var0 < var1) {
          incrementValue$0 = var0;
          var0++;
          field_i[incrementValue$0] = 0;
          incrementValue$1 = var0;
          var0++;
          field_i[incrementValue$1] = 0;
          incrementValue$2 = var0;
          var0++;
          field_i[incrementValue$2] = 0;
          incrementValue$3 = var0;
          var0++;
          field_i[incrementValue$3] = 0;
          incrementValue$4 = var0;
          var0++;
          field_i[incrementValue$4] = 0;
          incrementValue$5 = var0;
          var0++;
          field_i[incrementValue$5] = 0;
          incrementValue$6 = var0;
          var0++;
          field_i[incrementValue$6] = 0;
          incrementValue$7 = var0;
          var0++;
          field_i[incrementValue$7] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
          incrementValue$8 = var0;
          var0++;
          field_i[incrementValue$8] = 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var28 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        if (param4 == 0) {
          oo.c(param0, param1, param2, param3, param5, param6);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var7 = 0;
        var8 = 65536 / param3;
        var9 = param0 + param4;
        var10 = param1 + param4;
        var11 = param1;
        if (var11 < field_e) {
          var7 = var7 + (field_e - param1) * var8;
          param3 = param3 - (field_e - param1);
          var11 = field_e;
          param1 = field_e;
        }
        var12 = param1 + param3;
        if (var12 > field_d) {
          var12 = field_d;
        }
        var13 = param2 - param4 - param4 - 1;
        var14 = var11;
        var15 = param4 * param4;
        var16 = 0;
        var17 = var10 - var14;
        var18 = var17 * var17;
        var19 = var18 - var17;
        if (var10 > var12) {
          var10 = var12;
        }
        while (var14 < var10) {
          while (true) {
            if (var19 > var15 &&
              var18 > var15) {
              var20 = var9 - var16 + 1;
              if (var20 < field_f) {
                var20 = field_f;
              }
              var21 = var9 + var13 + var16;
              if (var21 > field_g) {
                var21 = field_g;
              }
              var22 = var20 + var14 * field_b;
              var23 = 65536 - var7 >> 8;
              var24 = var7 >> 8;
              var25 = ((param5 & 16711935) * var23 + (param6 & 16711935) * var24 & -16711936) + ((param5 & 65280) * var23 + (param6 & 65280) * var24 & 16711680) >>> 8;
              for (var26 = var20; var26 < var21; var26++) {
                incrementValue$5 = var22;
                var22++;
                field_i[incrementValue$5] = var25;
              }
              var14++;
              incrementValue$4 = var17;
              var17--;
              var18 = var18 - (incrementValue$4 + var17);
              var19 = var19 - (var17 + var17);
              var7 = var7 + var8;
              break;
            }
            var18 = var18 + (var16 + var16);
            incrementValue$6 = var16;
            var16++;
            var19 = var19 + (incrementValue$6 + var16);
          }
        }
        var17Lifetime1 = var14 - var10;
        var20Lifetime1 = param0;
        if (var20Lifetime1 < field_f) {
          var20Lifetime1 = field_f;
        }
        var21Lifetime1 = param0 + param2;
        if (var21Lifetime1 > field_g) {
          var21Lifetime1 = field_g;
        }
        var22Lifetime1 = var20Lifetime1 + var14 * field_b;
        var23Lifetime1 = field_b + var20Lifetime1 - var21Lifetime1;
        var24Lifetime1 = param1 + param3 - param4 - 1;
        if (var24Lifetime1 > field_d) {
          var24Lifetime1 = field_d;
        }
        while (var14 < var24Lifetime1) {
          var25Lifetime1 = 65536 - var7 >> 8;
          var26Lifetime1 = var7 >> 8;
          var27 = ((param5 & 16711935) * var25Lifetime1 + (param6 & 16711935) * var26Lifetime1 & -16711936) + ((param5 & 65280) * var25Lifetime1 + (param6 & 65280) * var26Lifetime1 & 16711680) >>> 8;
          for (var28 = var20Lifetime1; var28 < var21Lifetime1; var28++) {
            incrementValue$3 = var22Lifetime1;
            var22Lifetime1++;
            field_i[incrementValue$3] = var27;
          }
          var14++;
          var22Lifetime1 = var22Lifetime1 + var23Lifetime1;
          var7 = var7 + var8;
        }
        var17Lifetime2 = 0;
        var16Lifetime1 = param4;
        var19Lifetime1 = var17Lifetime2 * var17Lifetime2 + var15;
        var18Lifetime1 = var19Lifetime1 - var16Lifetime1;
        var19Lifetime1 = var19Lifetime1 - var17Lifetime2;
        while (var14 < var12) {
          while (var19Lifetime1 > var15) {
            if (var18Lifetime1 > var15) {
              incrementValue$0 = var16Lifetime1;
              var16Lifetime1--;
              var19Lifetime1 = var19Lifetime1 - (incrementValue$0 + var16Lifetime1);
              var18Lifetime1 = var18Lifetime1 - (var16Lifetime1 + var16Lifetime1);
              continue;
            }
            break;
          }
          var20Lifetime2 = var9 - var16Lifetime1;
          if (var20Lifetime2 < field_f) {
            var20Lifetime2 = field_f;
          }
          var21Lifetime2 = var9 + var13 + var16Lifetime1;
          if (var21Lifetime2 > field_g - 1) {
            var21Lifetime2 = field_g - 1;
          }
          var22Lifetime2 = var20Lifetime2 + var14 * field_b;
          var23Lifetime2 = 65536 - var7 >> 8;
          var24Lifetime2 = var7 >> 8;
          var25Lifetime2 = ((param5 & 16711935) * var23Lifetime2 + (param6 & 16711935) * var24Lifetime2 & -16711936) + ((param5 & 65280) * var23Lifetime2 + (param6 & 65280) * var24Lifetime2 & 16711680) >>> 8;
          for (var26Lifetime2 = var20Lifetime2; var26Lifetime2 <= var21Lifetime2; var26Lifetime2++) {
            incrementValue$2 = var22Lifetime2;
            var22Lifetime2++;
            field_i[incrementValue$2] = var25Lifetime2;
          }
          var14++;
          var19Lifetime1 = var19Lifetime1 + (var17Lifetime2 + var17Lifetime2);
          incrementValue$1 = var17Lifetime2;
          var17Lifetime2++;
          var18Lifetime1 = var18Lifetime1 + (incrementValue$1 + var17Lifetime2);
          var7 = var7 + var8;
        }
        return;
    }

    final static void e(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param1 < field_e) {
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        int var5 = field_b - param2;
        int var6 = param0 + param1 * field_b;
        for (var7 = -param3; var7 < 0; var7++) {
          for (var8 = -param2; var8 < 0; var8++) {
            incrementValue$0 = var6;
            var6++;
            field_i[incrementValue$0] = param4;
          }
          var6 = var6 + var5;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        int var13 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        if (param0 >= field_f) {
          if (param0 >= field_g) {
            return;
          }
          if (param1 < field_e) {
            param2 = param2 - (field_e - param1);
            param1 = field_e;
          }
          if (param1 + param2 > field_d) {
            param2 = field_d - param1;
          }
          var5 = 256 - param4;
          var6 = (param3 >> 16 & 255) * param4;
          var7 = (param3 >> 8 & 255) * param4;
          var8 = (param3 & 255) * param4;
          var12 = param0 + param1 * field_b;
          for (var13 = 0; var13 < param2; var13++) {
            var9 = (field_i[var12] >> 16 & 255) * var5;
            var10 = (field_i[var12] >> 8 & 255) * var5;
            var11 = (field_i[var12] & 255) * var5;
            var14 = (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8) + (var8 + var11 >> 8);
            field_i[var12] = var14;
            var12 = var12 + field_b;
          }
          return;
        }
    }

    public static void a() {
        field_i = null;
        field_h = null;
        field_a = null;
        field_c = null;
        field_k = null;
        field_j = null;
    }

    final static void f(int param0, int param1, int param2, int param3) {
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param1 < field_e) {
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        int var4 = field_b - param2;
        int var5 = param0 + param1 * field_b;
        oo.a(var5, field_i, 0, param2, -param3, var4);
    }

    private final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5) {
        while (param4 < 0) {
          param2 = param0 + param3 - 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param2 += 7;
          while (param0 < param2) {
            param1[param0] = (param1[param0] & 16711422) >> 1;
            param0++;
          }
          param0 = param0 + param5;
          param4++;
        }
    }

    private final static void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var6 = 0;
        int var7 = 65536 / param3;
        int var15Lifetime1;
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param1 < field_e) {
          var6 = var6 + (field_e - param1) * var7;
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        int var8 = field_b - param2;
        int var9 = param0 + param1 * field_b;
        for (var10 = -param3; var10 < 0; var10++) {
          var11 = 65536 - var6 >> 8;
          var12 = var6 >> 8;
          var13 = ((param4 & 16711935) * var11 + (param5 & 16711935) * var12 & -16711936) + ((param4 & 65280) * var11 + (param5 & 65280) * var12 & 16711680) >>> 8;
          for (var14 = -param2; var14 < 0; var14++) {
            var15 = field_i[var9];
            var16 = var13 + var15;
            var17 = (var13 & 16711935) + (var15 & 16711935);
            var15Lifetime1 = (var17 & 16777472) + (var16 - var17 & 65536);
            incrementValue$0 = var9;
            var9++;
            field_i[incrementValue$0] = var16 - var15Lifetime1 | var15Lifetime1 - (var15Lifetime1 >>> 8);
          }
          var9 = var9 + var8;
          var6 = var6 + var7;
        }
    }

    final static void b(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        if (param1 >= field_e) {
          if (param1 >= field_d) {
            return;
          }
          if (param0 < field_f) {
            param2 = param2 - (field_f - param0);
            param0 = field_f;
          }
          if (param0 + param2 > field_g) {
            param2 = field_g - param0;
          }
          var4 = param0 + param1 * field_b;
          for (var5 = 0; var5 < param2; var5++) {
            field_i[var4 + var5] = param3;
          }
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2) {
        field_i = param0;
        field_b = param1;
        field_l = param2;
        oo.h(0, 0, param1, param2);
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 >= field_f) {
          if (param1 < field_e ||
            param0 >= field_g ||
            param1 >= field_d) {
            return;
          }
          field_i[param0 + param1 * field_b] = param2;
          return;
        }
    }

    final static void h(int param0, int param1, int param2, int param3) {
        if (param0 < 0) {
          param0 = 0;
        }
        if (param1 < 0) {
          param1 = 0;
        }
        if (param2 > field_b) {
          param2 = field_b;
        }
        if (param3 > field_l) {
          param3 = field_l;
        }
        field_f = param0;
        field_e = param1;
        field_g = param2;
        field_d = param3;
        oo.d();
    }

    final static void f(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var5 = 0;
        for (var6 = 0; var6 < 4; var6++) {
          var5 = 128 - (var6 << 5);
          oo.c(param0 + var6, param1 + param3 + var6, param2, param4, var5);
          oo.b(param0 + param2 + var6, param1 + var6, param3 + 1, param4, var5);
        }
    }

    final static void i(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.a(field_i, 0, param2 + param3 * field_b, param0, param2, param4, field_b - param4, param5);
        oo.a(field_i, 0, param2 + param3 * field_b, param1, param3, param5, field_b - param4, param2, param4);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int incrementValue$0 = 0;
        if (param0 < field_f) {
          param2 = param2 - (field_f - param0);
          param0 = field_f;
        }
        if (param0 + param2 > field_g) {
          param2 = field_g - param0;
        }
        if (param1 < field_e) {
          param3 = param3 - (field_e - param1);
          param1 = field_e;
        }
        if (param1 + param3 > field_d) {
          param3 = field_d - param1;
        }
        int var4 = param0 + param1 * field_b;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          for (var5 = 0; var5 < param3; var5++) {
            for (var6 = 0; var6 < param2; var6++) {
              var7 = field_i[var4];
              var8 = var7 >> 15 & 510;
              var9 = var7 >> 8 & 255;
              var10 = var7 & 255;
              var11 = (var10 + var8) / 3 + var9 >> 1;
              incrementValue$0 = var4;
              var4++;
              field_i[incrementValue$0] = (var11 << 16) + (var11 << 8) + var11;
            }
            var4 = var4 + (field_b - param2);
          }
          return;
        }
    }

    final static void e(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var22 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        if (param4 == 0) {
          oo.e(param0, param1, param2, param3, param5);
          return;
        }
        if (param4 < 0) {
          param4 = -param4;
        }
        var6 = param0 + param4;
        var7 = param1 + param4;
        var8 = param1;
        if (var8 < field_e) {
          var8 = field_e;
        }
        var9 = param1 + param3;
        if (var9 > field_d) {
          var9 = field_d;
        }
        var10 = param2 - param4 - param4 - 1;
        var11 = var8;
        var12 = param4 * param4;
        var13 = 0;
        var14 = var7 - var11;
        var15 = var14 * var14;
        var16 = var15 - var14;
        if (var7 > var9) {
          var7 = var9;
        }
        while (var11 < var7) {
          while (true) {
            if (var16 > var12 &&
              var15 > var12) {
              var17 = var6 - var13 + 1;
              if (var17 < field_f) {
                var17 = field_f;
              }
              var18 = var6 + var10 + var13;
              if (var18 > field_g) {
                var18 = field_g;
              }
              var19 = var17 + var11 * field_b;
              for (var20 = var17; var20 < var18; var20++) {
                incrementValue$5 = var19;
                var19++;
                field_i[incrementValue$5] = param5;
              }
              var11++;
              incrementValue$4 = var14;
              var14--;
              var15 = var15 - (incrementValue$4 + var14);
              var16 = var16 - (var14 + var14);
              break;
            }
            var15 = var15 + (var13 + var13);
            incrementValue$6 = var13;
            var13++;
            var16 = var16 + (incrementValue$6 + var13);
          }
        }
        var14Lifetime1 = var11 - var7;
        var17Lifetime1 = param0;
        if (var17Lifetime1 < field_f) {
          var17Lifetime1 = field_f;
        }
        var18Lifetime1 = param0 + param2;
        if (var18Lifetime1 > field_g) {
          var18Lifetime1 = field_g;
        }
        var19Lifetime1 = var17Lifetime1 + var11 * field_b;
        var20Lifetime1 = field_b + var17Lifetime1 - var18Lifetime1;
        var21 = param1 + param3 - param4 - 1;
        if (var21 > field_d) {
          var21 = field_d;
        }
        while (var11 < var21) {
          for (var22 = var17Lifetime1; var22 < var18Lifetime1; var22++) {
            incrementValue$3 = var19Lifetime1;
            var19Lifetime1++;
            field_i[incrementValue$3] = param5;
          }
          var11++;
          var19Lifetime1 = var19Lifetime1 + var20Lifetime1;
        }
        var14Lifetime2 = 0;
        var13Lifetime1 = param4;
        var16Lifetime1 = var14Lifetime2 * var14Lifetime2 + var12;
        var15Lifetime1 = var16Lifetime1 - var13Lifetime1;
        var16Lifetime1 = var16Lifetime1 - var14Lifetime2;
        while (var11 < var9) {
          while (var16Lifetime1 > var12) {
            if (var15Lifetime1 > var12) {
              incrementValue$0 = var13Lifetime1;
              var13Lifetime1--;
              var16Lifetime1 = var16Lifetime1 - (incrementValue$0 + var13Lifetime1);
              var15Lifetime1 = var15Lifetime1 - (var13Lifetime1 + var13Lifetime1);
              continue;
            }
            break;
          }
          var17Lifetime2 = var6 - var13Lifetime1;
          if (var17Lifetime2 < field_f) {
            var17Lifetime2 = field_f;
          }
          var18Lifetime2 = var6 + var10 + var13Lifetime1;
          if (var18Lifetime2 > field_g - 1) {
            var18Lifetime2 = field_g - 1;
          }
          var19Lifetime2 = var17Lifetime2 + var11 * field_b;
          for (var20Lifetime2 = var17Lifetime2; var20Lifetime2 <= var18Lifetime2; var20Lifetime2++) {
            incrementValue$2 = var19Lifetime2;
            var19Lifetime2++;
            field_i[incrementValue$2] = param5;
          }
          var11++;
          var16Lifetime1 = var16Lifetime1 + (var14Lifetime2 + var14Lifetime2);
          incrementValue$1 = var14Lifetime2;
          var14Lifetime2++;
          var15Lifetime1 = var15Lifetime1 + (incrementValue$1 + var14Lifetime2);
        }
        return;
    }

    final static void a(int[] param0) {
        param0[0] = field_f;
        param0[1] = field_e;
        param0[2] = field_g;
        param0[3] = field_d;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int var24 = 0;
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
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
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        if (param6 == 256) {
          oo.e(param0, param1, param2, param3, param4, param5);
          return;
        }
        if (param4 == 0) {
          oo.f(param0, param1, param2, param3, param5, param6);
          return;
        }
        var7 = 256 - param6;
        param5 = ((param5 & 16711935) * param6 >> 8 & 16711935) + ((param5 & 65280) * param6 >> 8 & 65280);
        if (param4 < 0) {
          param4 = -param4;
        }
        var8 = param0 + param4;
        var9 = param1 + param4;
        var10 = param1;
        if (var10 < field_e) {
          var10 = field_e;
        }
        var11 = param1 + param3;
        if (var11 > field_d) {
          var11 = field_d;
        }
        var12 = param2 - param4 - param4 - 1;
        var13 = var10;
        var14 = param4 * param4;
        var15 = 0;
        var16 = var9 - var13;
        var17 = var16 * var16;
        var18 = var17 - var16;
        if (var9 > var11) {
          var9 = var11;
        }
        while (var13 < var9) {
          while (true) {
            if (var18 > var14 &&
              var17 > var14) {
              var19 = var8 - var15 + 1;
              if (var19 < field_f) {
                var19 = field_f;
              }
              var20 = var8 + var12 + var15;
              if (var20 > field_g) {
                var20 = field_g;
              }
              var21 = var19 + var13 * field_b;
              for (var22 = var19; var22 < var20; var22++) {
                var23 = field_i[var21];
                var23 = ((var23 & 16711935) * var7 >> 8 & 16711935) + ((var23 & 65280) * var7 >> 8 & 65280);
                incrementValue$5 = var21;
                var21++;
                field_i[incrementValue$5] = param5 + var23;
              }
              var13++;
              incrementValue$4 = var16;
              var16--;
              var17 = var17 - (incrementValue$4 + var16);
              var18 = var18 - (var16 + var16);
              break;
            }
            var17 = var17 + (var15 + var15);
            incrementValue$6 = var15;
            var15++;
            var18 = var18 + (incrementValue$6 + var15);
          }
        }
        var16Lifetime1 = var13 - var9;
        var19Lifetime1 = param0;
        if (var19Lifetime1 < field_f) {
          var19Lifetime1 = field_f;
        }
        var20Lifetime1 = param0 + param2;
        if (var20Lifetime1 > field_g) {
          var20Lifetime1 = field_g;
        }
        var21Lifetime1 = var19Lifetime1 + var13 * field_b;
        var22Lifetime1 = field_b + var19Lifetime1 - var20Lifetime1;
        var23Lifetime1 = param1 + param3 - param4 - 1;
        if (var23Lifetime1 > field_d) {
          var23Lifetime1 = field_d;
        }
        while (var13 < var23Lifetime1) {
          for (var24 = var19Lifetime1; var24 < var20Lifetime1; var24++) {
            var25 = field_i[var21Lifetime1];
            var25 = ((var25 & 16711935) * var7 >> 8 & 16711935) + ((var25 & 65280) * var7 >> 8 & 65280);
            incrementValue$3 = var21Lifetime1;
            var21Lifetime1++;
            field_i[incrementValue$3] = param5 + var25;
          }
          var13++;
          var21Lifetime1 = var21Lifetime1 + var22Lifetime1;
        }
        var16Lifetime2 = 0;
        var15Lifetime1 = param4;
        var18Lifetime1 = var16Lifetime2 * var16Lifetime2 + var14;
        var17Lifetime1 = var18Lifetime1 - var15Lifetime1;
        var18Lifetime1 = var18Lifetime1 - var16Lifetime2;
        while (var13 < var11) {
          while (var18Lifetime1 > var14) {
            if (var17Lifetime1 > var14) {
              incrementValue$0 = var15Lifetime1;
              var15Lifetime1--;
              var18Lifetime1 = var18Lifetime1 - (incrementValue$0 + var15Lifetime1);
              var17Lifetime1 = var17Lifetime1 - (var15Lifetime1 + var15Lifetime1);
              continue;
            }
            break;
          }
          var19Lifetime2 = var8 - var15Lifetime1;
          if (var19Lifetime2 < field_f) {
            var19Lifetime2 = field_f;
          }
          var20Lifetime2 = var8 + var12 + var15Lifetime1;
          if (var20Lifetime2 > field_g - 1) {
            var20Lifetime2 = field_g - 1;
          }
          var21Lifetime2 = var19Lifetime2 + var13 * field_b;
          for (var22Lifetime2 = var19Lifetime2; var22Lifetime2 <= var20Lifetime2; var22Lifetime2++) {
            var23Lifetime2 = field_i[var21Lifetime2];
            var23Lifetime2 = ((var23Lifetime2 & 16711935) * var7 >> 8 & 16711935) + ((var23Lifetime2 & 65280) * var7 >> 8 & 65280);
            incrementValue$2 = var21Lifetime2;
            var21Lifetime2++;
            field_i[incrementValue$2] = param5 + var23Lifetime2;
          }
          var13++;
          var18Lifetime1 = var18Lifetime1 + (var16Lifetime2 + var16Lifetime2);
          incrementValue$1 = var16Lifetime2;
          var16Lifetime2++;
          var17Lifetime1 = var17Lifetime1 + (incrementValue$1 + var16Lifetime2);
        }
        return;
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (param2 == 0) {
          oo.a(param0, param1, param3);
          return;
        }
        if (param2 < 0) {
          param2 = -param2;
        }
        if (field_g > field_f) {
          if (field_d <= field_e) {
            return;
          }
          if (param0 + param2 >= field_f) {
            if (param0 - param2 < field_g &&
              param1 + param2 >= field_e &&
              param1 - param2 < field_d) {
              var4 = param0 + param1 * field_b;
              var5 = var4;
              var6 = var4 - param2 * field_b;
              var7 = var4 + param2 * field_b;
              var8 = param2;
              var9 = 0;
              param2 = param2 * param2;
              var10 = param2 - var8;
              if (param0 - var8 >= field_f &&
                param0 + var8 < field_g &&
                param1 - var8 >= field_e &&
                param1 + var8 < field_d) {
                field_i[var4 - var8] = param3;
                field_i[var4 + var8] = param3;
                field_i[var6] = param3;
                field_i[var7] = param3;
                while (true) {
                  incrementValue$0 = var9;
                  var9++;
                  var10 = var10 + (incrementValue$0 + var9);
                  var4 = var4 - field_b;
                  var5 = var5 + field_b;
                  if (var10 > param2) {
                    var8--;
                    var10 = var10 - (var8 + var8);
                    var6 = var6 + field_b;
                    var7 = var7 - field_b;
                  }
                  if (var8 < var9) {
                    return;
                  }
                  field_i[var6 - var9] = param3;
                  field_i[var6 + var9] = param3;
                  field_i[var4 - var8] = param3;
                  field_i[var4 + var8] = param3;
                  field_i[var5 - var8] = param3;
                  field_i[var5 + var8] = param3;
                  field_i[var7 - var9] = param3;
                  field_i[var7 + var9] = param3;
                }
              }
              if (param0 - var8 >= field_f &&
                param1 >= field_e &&
                param1 < field_d) {
                field_i[var4 - var8] = param3;
              }
              if (param0 + var8 < field_g &&
                param1 >= field_e &&
                param1 < field_d) {
                field_i[var4 + var8] = param3;
              }
              if (param1 - var8 >= field_e) {
                if (param0 >= field_f) {
                  if (param0 < field_g) {
                    field_i[var6] = param3;
                    if (param1 + var8 < field_d &&
                      param0 >= field_f &&
                      param0 < field_g) {
                      field_i[var7] = param3;
                    }
                  } else {
                    if (param1 + var8 < field_d &&
                      param0 >= field_f &&
                      param0 < field_g) {
                      field_i[var7] = param3;
                    }
                  }
                } else {
                  if (param1 + var8 < field_d &&
                    param0 >= field_f &&
                    param0 < field_g) {
                    field_i[var7] = param3;
                  }
                }
              } else {
                if (param1 + var8 < field_d &&
                  param0 >= field_f &&
                  param0 < field_g) {
                  field_i[var7] = param3;
                }
              }
              while (true) {
                incrementValue$1 = var9;
                var9++;
                var10 = var10 + (incrementValue$1 + var9);
                var4 = var4 - field_b;
                var5 = var5 + field_b;
                if (var10 > param2) {
                  var8--;
                  var10 = var10 - (var8 + var8);
                  var6 = var6 + field_b;
                  var7 = var7 - field_b;
                }
                if (var8 < var9) {
                  return;
                }
                if (param1 - var8 >= field_e &&
                  param1 - var8 < field_d) {
                  if (param0 - var9 >= field_f &&
                    param0 - var9 < field_g) {
                    field_i[var6 - var9] = param3;
                  }
                  if (param0 + var9 >= field_f &&
                    param0 + var9 < field_g) {
                    field_i[var6 + var9] = param3;
                  }
                }
                if (param1 - var9 >= field_e &&
                  param1 - var9 < field_d) {
                  if (param0 - var8 >= field_f &&
                    param0 - var8 < field_g) {
                    field_i[var4 - var8] = param3;
                  }
                  if (param0 + var8 >= field_f &&
                    param0 + var8 < field_g) {
                    field_i[var4 + var8] = param3;
                  }
                }
                if (param1 + var9 >= field_e &&
                  param1 + var9 < field_d) {
                  if (param0 - var8 >= field_f &&
                    param0 - var8 < field_g) {
                    field_i[var5 - var8] = param3;
                  }
                  if (param0 + var8 >= field_f &&
                    param0 + var8 < field_g) {
                    field_i[var5 + var8] = param3;
                  }
                }
                if (param1 + var8 < field_e) {
                  continue;
                }
                if (param1 + var8 >= field_d) {
                  continue;
                }
                if (param0 - var9 >= field_f &&
                  param0 - var9 < field_g) {
                  field_i[var7 - var9] = param3;
                }
                if (param0 + var9 < field_f) {
                  continue;
                }
                if (param0 + var9 >= field_g) {
                  continue;
                }
                field_i[var7 + var9] = param3;
              }
            }
            return;
          }
        }
    }

    final static void c() {
        field_f = 0;
        field_e = 0;
        field_g = field_b;
        field_d = field_l;
        oo.d();
    }

    final static void h(int param0, int param1, int param2, int param3, int param4, int param5) {
        oo.c(param0, param1, param2, param4, param5);
        oo.c(param0, param1 + param3 - 1, param2, param4, param5);
        if (param3 >= 3) {
          oo.b(param0, param1 + 1, param3 - 2, param4, param5);
          oo.b(param0 + param2 - 1, param1 + 1, param3 - 2, param4, param5);
          return;
        }
    }

    static {
        field_g = 0;
        field_f = 0;
        field_d = 0;
        field_e = 0;
    }
}
