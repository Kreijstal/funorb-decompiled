/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends er {
    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var17 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            var16 = param2 >>> 24;
            if (var16 != 0) {
              var17 = 256 - var16;
              var18 = param0[param5];
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((param2 & 16711935) * var16 + (var18 & 16711935) * var17 & -16711936) + ((param2 & 65280) * var16 + (var18 & 65280) * var17 & 16711680) >>> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var12;
          param5 = param5 + param6;
        }
    }

    private final static void d(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int incrementValue$1 = 0;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            var12 = (param1[param3] >>> 24) * param9 >> 8;
            var13 = 256 - var12;
            var14 = param1[param3++];
            var15 = param0[param4];
            incrementValue$1 = param4;
            param4++;
            param0[incrementValue$1] = ((var14 & 16711935) * var12 + (var15 & 16711935) * var13 & -16711936) + ((var14 & 65280) * var12 + (var15 & 65280) * var13 & 16711680) >>> 8;
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void b(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$12 = 0;
        int var14;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              var14 = param13 * (param0 >>> 24) >> 8 & 255;
              param1 = (param0 & 16711935) * var14;
              param0 = (param1 & -16711936) + (param0 * var14 - param1 & 16711680) >>> 8;
              param1 = param3[param7];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$12 = param7;
              param7++;
              param3[incrementValue$12] = param2 - param1 | param1 - (param1 >>> 8);
            }
          }
          param7 = param7 + param11;
          param5 = param5 + param12;
        }
    }

    final void c(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * bi.field_e;
        int var5 = 0;
        int var6 = this.field_t;
        int var7 = this.field_y;
        int var8 = bi.field_e - var7;
        int var9 = 0;
        if (param1 < bi.field_f) {
          var10 = bi.field_f - param1;
          var6 = var6 - var10;
          param1 = bi.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * bi.field_e;
        }
        if (param1 + var6 > bi.field_c) {
          var6 = var6 - (param1 + var6 - bi.field_c);
        }
        if (param0 < bi.field_d) {
          var10Lifetime1 = bi.field_d - param0;
          var7 = var7 - var10Lifetime1;
          param0 = bi.field_d;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > bi.field_i) {
          var10Lifetime2 = param0 + var7 - bi.field_i;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        fe.d(bi.field_l, this.field_F, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void b(int param0, int param1) {
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        int var19Lifetime1;
        var3 = this.field_y >> 1;
        var4 = this.field_t >> 1;
        param0 = param0 + this.field_C / 2;
        param1 = param1 + this.field_z / 2;
        if (param0 >= bi.field_d) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = bi.field_d - param0 << 1;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= bi.field_i) {
          stackIn_6_0 = this.field_y - 2;
        } else {
          stackIn_6_0 = (bi.field_i - param0 << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (param1 >= bi.field_f) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = bi.field_f - param1 << 1;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= bi.field_c) {
          stackIn_12_0 = this.field_t - 2;
        } else {
          stackIn_12_0 = (bi.field_c - param1 << 1) - 2;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 2) {
          var10 = var9 * this.field_y + var5;
          var11 = (param1 + (var9 >> 1)) * bi.field_e + (param0 + (var5 >> 1));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16 = 0;
            var17 = 0;
            var18 = 0;
            for (var19 = 0; var19 < 4; var19++) {
              stackIn_20_0 = this.field_F;
              stackIn_20_1 = var10 + (var19 & 1);
              if ((var19 & 2) != 0) {
                stackIn_21_2 = 0;
              } else {
                stackIn_21_2 = this.field_y;
              }
              var13Lifetime1 = stackIn_20_0[stackIn_20_1 + stackIn_21_2];
              var14Lifetime1 = var13Lifetime1 >>> 24;
              var18 = var18 + var14Lifetime1;
              var15 = var15 + var14Lifetime1 * (var13Lifetime1 >> 16 & 255);
              var16 = var16 + var14Lifetime1 * (var13Lifetime1 >> 8 & 255);
              var17 = var17 + var14Lifetime1 * (var13Lifetime1 & 255);
            }
            if (var18 != 0) {
              var15 = (var15 / var18 << 16) + var17 / var18;
              var16 = var16 / var18 << 8;
              var19Lifetime1 = var18 >> 2;
              var20 = 256 - var19Lifetime1;
              var21 = bi.field_l[var11];
              bi.field_l[var11] = (var19Lifetime1 * var15 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var16 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
            var12 += 2;
            var11++;
            var10 += 2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param2 <= 0 ||
          param3 <= 0) {
          return;
        }
        int var6 = this.field_y;
        int var7 = this.field_t;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field_x;
        int var11 = this.field_B;
        int var12 = (var10 << 16) / param2;
        int var13 = (var11 << 16) / param3;
        if (this.field_C > 0) {
          var14 = ((this.field_C << 16) + var12 - 1) / var12;
          param0 = param0 + var14;
          var8 = var8 + (var14 * var12 - (this.field_C << 16));
        }
        if (this.field_z > 0) {
          var14Lifetime1 = ((this.field_z << 16) + var13 - 1) / var13;
          param1 = param1 + var14Lifetime1;
          var9 = var9 + (var14Lifetime1 * var13 - (this.field_z << 16));
        }
        if (var6 < var10) {
          param2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
          param3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        var14Lifetime2 = param0 + param1 * bi.field_e;
        int var15 = bi.field_e - param2;
        if (param1 + param3 > bi.field_c) {
          param3 = param3 - (param1 + param3 - bi.field_c);
        }
        if (param1 < bi.field_f) {
          var16 = bi.field_f - param1;
          param3 = param3 - var16;
          var14Lifetime2 = var14Lifetime2 + var16 * bi.field_e;
          var9 = var9 + var13 * var16;
        }
        if (param0 + param2 > bi.field_i) {
          var16Lifetime1 = param0 + param2 - bi.field_i;
          param2 = param2 - var16Lifetime1;
          var15 = var15 + var16Lifetime1;
        }
        if (param0 < bi.field_d) {
          var16Lifetime2 = bi.field_d - param0;
          param2 = param2 - var16Lifetime2;
          var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
          var8 = var8 + var12 * var16Lifetime2;
          var15 = var15 + var16Lifetime2;
        }
        fe.b(bi.field_l, this.field_F, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
    }

    final void d(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
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
        int[] var22;
        int[] var23;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var19Lifetime1;
        int[] var23Lifetime1;
        var3 = this.field_y >> 2;
        var4 = this.field_t >> 2;
        param0 = param0 + this.field_C / 4;
        param1 = param1 + this.field_z / 4;
        if (param0 >= bi.field_d) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = bi.field_d - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= bi.field_i) {
          stackIn_6_0 = this.field_y - 4;
        } else {
          stackIn_6_0 = (bi.field_i - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= bi.field_f) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = bi.field_f - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= bi.field_c) {
          stackIn_12_0 = this.field_t - 4;
        } else {
          stackIn_12_0 = (bi.field_c - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        var23 = new int[16];
        var22 = var23;
        var9 = var22;
        for (var10 = var7; var10 <= var8; var10 += 4) {
          for (var11 = var5; var11 <= var6; var11 += 4) {
            var12 = var10 * this.field_y + var11;
            var13 = (param1 + (var10 >> 2)) * bi.field_e + (param0 + (var11 >> 2));
            for (var14 = 0; var14 < 4; var14++) {
              for (var15 = 0; var15 < 4; var15++) {
                var9[(var14 << 2) + var15] = this.field_F[var12 + var14 * this.field_y + var15];
              }
            }
            var23Lifetime1 = var22;
            var14Lifetime1 = 0;
            var15Lifetime1 = 0;
            var16 = 0;
            var17 = 0;
            var18 = 0;
            for (var19 = 0; var19 < 16; var19++) {
              var14Lifetime2 = var23Lifetime1[var19] >>> 24;
              var15Lifetime1 = var15Lifetime1 + var14Lifetime2;
              var16 = var16 + var14Lifetime2 * (var23Lifetime1[var19] >> 16 & 255);
              var17 = var17 + var14Lifetime2 * (var23Lifetime1[var19] >> 8 & 255);
              var18 = var18 + var14Lifetime2 * (var23Lifetime1[var19] & 255);
            }
            if (var15Lifetime1 != 0) {
              var16 = (var16 / var15Lifetime1 << 16) + var18 / var15Lifetime1;
              var17 = var17 / var15Lifetime1 << 8;
              var19Lifetime1 = var15Lifetime1 >> 4;
              var20 = 256 - var19Lifetime1;
              var21 = bi.field_l[var13];
              bi.field_l[var13] = (var19Lifetime1 * var16 + var20 * (var21 & 16711935) & -16711936) + (var19Lifetime1 * var17 + var20 * (var21 & 65280) & 16711680) >>> 8;
            }
          }
        }
    }

    final void g(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + (this.field_B - this.field_t - this.field_z);
        int var3 = param0 + (param1 + this.field_t - 1) * bi.field_e;
        int var4 = 0;
        int var5 = this.field_t;
        int var6 = this.field_y;
        int var7 = -bi.field_e - var6;
        int var8 = 0;
        if (param1 < bi.field_f) {
          var5 = var5 - (bi.field_f - param1);
          param1 = bi.field_f;
        }
        if (param1 + var5 > bi.field_c) {
          var9 = param1 + var5 - bi.field_c;
          var5 = var5 - var9;
          var3 = var3 - var9 * bi.field_e;
          var4 = var4 + var9 * var6;
        }
        if (param0 < bi.field_d) {
          var9Lifetime1 = bi.field_d - param0;
          var6 = var6 - var9Lifetime1;
          param0 = bi.field_d;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > bi.field_i) {
          var9Lifetime2 = param0 + var6 - bi.field_i;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        fe.c(bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$6 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        for (var15 = -param6; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            param2 = param1[param3++];
            var17 = param2 >>> 24;
            if (var17 == 0) {
              param4++;
            } else {
              var19 = param2 >> 16 & 255;
              var20 = param2 >> 8 & 255;
              var21 = param2 & 255;
              if (var19 == var20 &&
                var20 == var21) {
                if (var19 > 128) {
                  var18 = (var10 * (256 - var19) + 255 * (var19 - 128) >> 7 << 16) + (var11 * (256 - var20) + 255 * (var20 - 128) >> 7 << 8) + (var12 * (256 - var21) + 255 * (var21 - 128) >> 7);
                } else {
                  var18 = (var19 * var10 >> 7 << 16) + (var20 * var11 >> 7 << 8) + (var21 * var12 >> 7);
                }
              } else {
                var18 = param2;
              }
              var22 = 256 - var17;
              var23 = param0[param4];
              incrementValue$6 = param4;
              param4++;
              param0[incrementValue$6] = ((var18 & 16711935) * var17 + (var23 & 16711935) * var22 & -16711936) + ((var18 & 65280) * var17 + (var23 & 65280) * var22 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var12;
        int var13;
        int var14;
        var9 = -param5;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            var12 = param2 >>> 24;
            if (var12 == 0) {
              param4++;
            } else {
              var13 = 256 - var12;
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((param2 & 65280) * var12 + (var14 & 65280) * var13 & 16711680) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int incrementValue$0 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
          var15 = (param4 >> 16) * param11;
          for (var16 = -param7; var16 < 0; var16++) {
            var17 = param1[(param3 >> 16) + var15];
            var18 = param0[param5];
            var19 = (var17 >>> 24) * param12 >> 8;
            var20 = 256 - var19;
            incrementValue$0 = param5;
            param5++;
            param0[incrementValue$0] = ((var17 & 16711935) * var19 + (var18 & 16711935) * var20 & -16711936) + ((var17 & 65280) * var19 + (var18 & 65280) * var20 & 16711680) >>> 8;
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var13;
          param5 = param5 + param6;
        }
    }

    fe(int param0, int param1) {
        super(param0, param1);
    }

    final void e(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * bi.field_e;
        int var4 = 0;
        int var5 = this.field_t;
        int var6 = this.field_y;
        int var7 = bi.field_e - var6;
        int var8 = 0;
        if (param1 < bi.field_f) {
          var9 = bi.field_f - param1;
          var5 = var5 - var9;
          param1 = bi.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * bi.field_e;
        }
        if (param1 + var5 > bi.field_c) {
          var5 = var5 - (param1 + var5 - bi.field_c);
        }
        if (param0 < bi.field_d) {
          var9Lifetime1 = bi.field_d - param0;
          var6 = var6 - var9Lifetime1;
          param0 = bi.field_d;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > bi.field_i) {
          var9Lifetime2 = param0 + var6 - bi.field_i;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        fe.c(bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
    }

    fe(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * bi.field_e;
        int var4 = 0;
        int var5 = this.field_t;
        int var6 = this.field_y;
        int var7 = bi.field_e - var6;
        int var8 = 0;
        if (param1 < bi.field_f) {
          var9 = bi.field_f - param1;
          var5 = var5 - var9;
          param1 = bi.field_f;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * bi.field_e;
        }
        if (param1 + var5 > bi.field_c) {
          var5 = var5 - (param1 + var5 - bi.field_c);
        }
        if (param0 < bi.field_d) {
          var9Lifetime1 = bi.field_d - param0;
          var6 = var6 - var9Lifetime1;
          param0 = bi.field_d;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > bi.field_i) {
          var9Lifetime2 = param0 + var6 - bi.field_i;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        fe.c(bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * bi.field_e;
        int var5 = 0;
        int var6 = this.field_t;
        int var7 = this.field_y;
        int var8 = bi.field_e - var7;
        int var9 = 0;
        if (param1 < bi.field_f) {
          var10 = bi.field_f - param1;
          var6 = var6 - var10;
          param1 = bi.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * bi.field_e;
        }
        if (param1 + var6 > bi.field_c) {
          var6 = var6 - (param1 + var6 - bi.field_c);
        }
        if (param0 < bi.field_d) {
          var10Lifetime1 = bi.field_d - param0;
          var7 = var7 - var10Lifetime1;
          param0 = bi.field_d;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > bi.field_i) {
          var10Lifetime2 = param0 + var7 - bi.field_i;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        fe.c(bi.field_l, this.field_F, 0, var5, var4, var7, var6, var8, var9, param2);
    }

    final void d(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_C;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * bi.field_e;
        int var5 = 0;
        int var6 = this.field_t;
        int var7 = this.field_y;
        int var8 = bi.field_e - var7;
        int var9 = 0;
        if (param1 < bi.field_f) {
          var10 = bi.field_f - param1;
          var6 = var6 - var10;
          param1 = bi.field_f;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * bi.field_e;
        }
        if (param1 + var6 > bi.field_c) {
          var6 = var6 - (param1 + var6 - bi.field_c);
        }
        if (param0 < bi.field_d) {
          var10Lifetime1 = bi.field_d - param0;
          var7 = var7 - var10Lifetime1;
          param0 = bi.field_d;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > bi.field_i) {
          var10Lifetime2 = param0 + var7 - bi.field_i;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        fe.b(0, 0, 0, bi.field_l, this.field_F, var5, 0, var4, 0, var7, var6, var8, var9, param2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (param2 <= 0 ||
          param3 <= 0) {
          return;
        }
        int var5 = this.field_y;
        int var6 = this.field_t;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_x;
        int var10 = this.field_B;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        if (this.field_C > 0) {
          var13 = ((this.field_C << 16) + var11 - 1) / var11;
          param0 = param0 + var13;
          var7 = var7 + (var13 * var11 - (this.field_C << 16));
        }
        if (this.field_z > 0) {
          var13Lifetime1 = ((this.field_z << 16) + var12 - 1) / var12;
          param1 = param1 + var13Lifetime1;
          var8 = var8 + (var13Lifetime1 * var12 - (this.field_z << 16));
        }
        if (var5 < var9) {
          param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
          param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13Lifetime2 = param0 + param1 * bi.field_e;
        int var14 = bi.field_e - param2;
        if (param1 + param3 > bi.field_c) {
          param3 = param3 - (param1 + param3 - bi.field_c);
        }
        if (param1 < bi.field_f) {
          var15 = bi.field_f - param1;
          param3 = param3 - var15;
          var13Lifetime2 = var13Lifetime2 + var15 * bi.field_e;
          var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > bi.field_i) {
          var15Lifetime1 = param0 + param2 - bi.field_i;
          param2 = param2 - var15Lifetime1;
          var14 = var14 + var15Lifetime1;
        }
        if (param0 < bi.field_d) {
          var15Lifetime2 = bi.field_d - param0;
          param2 = param2 - var15Lifetime2;
          var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
          var7 = var7 + var11 * var15Lifetime2;
          var14 = var14 + var15Lifetime2;
        }
        fe.b(bi.field_l, this.field_F, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
    }
}
