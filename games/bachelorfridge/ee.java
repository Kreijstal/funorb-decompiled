/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends th {
    byte[] field_g;
    int[] field_h;

    final void d() {
        int var3 = 0;
        int var4 = 0;
        int incrementValue$0 = 0;
        byte[] var1 = new byte[this.field_d * this.field_e];
        int var2 = 0;
        for (var3 = this.field_e - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_d; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_g[var4 + var3 * this.field_d];
          }
        }
        this.field_g = var1;
        this.field_c = this.field_b - this.field_e - this.field_c;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var13 = 0;
        int var15 = 0;
        int var5 = this.field_d;
        int var6 = this.field_e;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field_a;
        int var10 = this.field_b;
        int var11 = (var9 << 16) / param2;
        int var12 = (var10 << 16) / param3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (this.field_f > 0) {
          var13 = ((this.field_f << 16) + var11 - 1) / var11;
          param0 = param0 + var13;
          var7 = var7 + (var13 * var11 - (this.field_f << 16));
        }
        if (this.field_c > 0) {
          var13Lifetime1 = ((this.field_c << 16) + var12 - 1) / var12;
          param1 = param1 + var13Lifetime1;
          var8 = var8 + (var13Lifetime1 * var12 - (this.field_c << 16));
        }
        if (var5 < var9) {
          param2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
          param3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        var13Lifetime2 = param0 + param1 * dg.field_i;
        int var14 = dg.field_i - param2;
        if (param1 + param3 > dg.field_k) {
          param3 = param3 - (param1 + param3 - dg.field_k);
        }
        if (param1 < dg.field_j) {
          var15 = dg.field_j - param1;
          param3 = param3 - var15;
          var13Lifetime2 = var13Lifetime2 + var15 * dg.field_i;
          var8 = var8 + var12 * var15;
        }
        if (param0 + param2 > dg.field_h) {
          var15Lifetime1 = param0 + param2 - dg.field_h;
          param2 = param2 - var15Lifetime1;
          var14 = var14 + var15Lifetime1;
        }
        if (param0 < dg.field_f) {
          var15Lifetime2 = dg.field_f - param0;
          param2 = param2 - var15Lifetime2;
          var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
          var7 = var7 + var11 * var15Lifetime2;
          var14 = var14 + var15Lifetime2;
        }
        ee.a(dg.field_e, this.field_g, this.field_h, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
    }

    final void a(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_c;
        int var3 = param0 + param1 * dg.field_i;
        int var4 = 0;
        int var5 = this.field_e;
        int var6 = this.field_d;
        int var7 = dg.field_i - var6;
        int var8 = 0;
        if (param1 < dg.field_j) {
          var9 = dg.field_j - param1;
          var5 = var5 - var9;
          param1 = dg.field_j;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * dg.field_i;
        }
        if (param1 + var5 > dg.field_k) {
          var5 = var5 - (param1 + var5 - dg.field_k);
        }
        if (param0 < dg.field_f) {
          var9Lifetime1 = dg.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = dg.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > dg.field_h) {
          var9Lifetime2 = param0 + var6 - dg.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ee.b(dg.field_e, this.field_g, this.field_h, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
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
        int var11 = 0;
        int var9 = -(param5 >> 2);
        int var11Lifetime1;
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            incrementValue$0 = param4;
            param4++;
            incrementValue$1 = param3;
            param3++;
            param0[incrementValue$0] = param2[param1[incrementValue$1] & 255];
            incrementValue$2 = param4;
            param4++;
            incrementValue$3 = param3;
            param3++;
            param0[incrementValue$2] = param2[param1[incrementValue$3] & 255];
            incrementValue$4 = param4;
            param4++;
            incrementValue$5 = param3;
            param3++;
            param0[incrementValue$4] = param2[param1[incrementValue$5] & 255];
            incrementValue$6 = param4;
            param4++;
            incrementValue$7 = param3;
            param3++;
            param0[incrementValue$6] = param2[param1[incrementValue$7] & 255];
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            incrementValue$8 = param4;
            param4++;
            incrementValue$9 = param3;
            param3++;
            param0[incrementValue$8] = param2[param1[incrementValue$9] & 255];
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_c;
        int var4 = param0 + param1 * dg.field_i;
        int var5 = 0;
        int var6 = this.field_e;
        int var7 = this.field_d;
        int var8 = dg.field_i - var7;
        int var9 = 0;
        if (param1 < dg.field_j) {
          var10 = dg.field_j - param1;
          var6 = var6 - var10;
          param1 = dg.field_j;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * dg.field_i;
        }
        if (param1 + var6 > dg.field_k) {
          var6 = var6 - (param1 + var6 - dg.field_k);
        }
        if (param0 < dg.field_f) {
          var10Lifetime1 = dg.field_f - param0;
          var7 = var7 - var10Lifetime1;
          param0 = dg.field_f;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > dg.field_h) {
          var10Lifetime2 = param0 + var7 - dg.field_h;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ee.a(dg.field_e, this.field_g, this.field_h, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final ee b() {
        int var4 = 0;
        int var3 = 0;
        ee var1 = new ee(this.field_d, this.field_e, this.field_h.length);
        int var3Lifetime1;
        var1.field_a = this.field_a;
        var1.field_b = this.field_b;
        var1.field_f = this.field_a - this.field_d - this.field_f;
        var1.field_c = this.field_c;
        int var2 = this.field_h.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_h[var3] = this.field_h[var3];
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < this.field_e; var3Lifetime1++) {
          for (var4 = 0; var4 < this.field_d; var4++) {
            var1.field_g[var3Lifetime1 * this.field_d + var4] = this.field_g[var3Lifetime1 * this.field_d + this.field_d - 1 - var4];
          }
        }
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$8 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$5 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        double var7;
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
        double var24;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var32Lifetime1;
        int var32Lifetime2;
        int var32Lifetime3;
        int var32Lifetime4;
        int var33Lifetime1;
        int var33Lifetime2;
        int var33Lifetime3;
        int var33Lifetime4;
        int var34Lifetime1;
        int var34Lifetime2;
        int var34Lifetime3;
        int var34Lifetime4;
        int var35Lifetime1;
        int var35Lifetime2;
        int var35Lifetime3;
        int var35Lifetime4;
        int var36Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var36Lifetime4;
        int var37Lifetime1;
        int var37Lifetime2;
        int var37Lifetime3;
        int var37Lifetime4;
        int var38Lifetime1;
        int var38Lifetime2;
        int var38Lifetime3;
        int var38Lifetime4;
        int var32Lifetime5;
        int var33Lifetime5;
        int var33Lifetime6;
        int var34Lifetime5;
        int var34Lifetime6;
        int var35Lifetime5;
        int var35Lifetime6;
        int var36Lifetime5;
        int var36Lifetime6;
        int var37Lifetime5;
        int var37Lifetime6;
        int var38Lifetime5;
        int var38Lifetime6;
        int var32Lifetime1Lifetime1;
        int var32Lifetime1Lifetime2;
        int var32Lifetime2Lifetime1;
        int var32Lifetime3Lifetime1;
        int var32Lifetime3Lifetime2;
        int var32Lifetime3Lifetime3;
        int var32Lifetime4Lifetime1;
        int var32Lifetime4Lifetime2;
        int var32Lifetime4Lifetime3;
        int var33Lifetime1Lifetime1;
        int var33Lifetime1Lifetime2;
        int var34Lifetime1Lifetime1;
        int var34Lifetime1Lifetime2;
        int var35Lifetime1Lifetime1;
        int var35Lifetime1Lifetime2;
        int var36Lifetime1Lifetime1;
        int var36Lifetime1Lifetime2;
        int var37Lifetime1Lifetime1;
        int var37Lifetime1Lifetime2;
        int var38Lifetime1Lifetime1;
        int var38Lifetime1Lifetime2;
        int var32Lifetime6;
        int var32Lifetime1Lifetime3;
        int var32Lifetime5Lifetime1;
        int var32Lifetime1Lifetime1Lifetime1;
        int var32Lifetime1Lifetime1Lifetime2;
        int var32Lifetime1Lifetime1Lifetime3;
        int var32Lifetime1Lifetime2Lifetime1;
        int var32Lifetime1Lifetime2Lifetime2;
        int var32Lifetime1Lifetime2Lifetime3;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.field_f << 4);
        param1 = param1 - (this.field_c << 4);
        var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        var11 = -param0 * var10 + -param1 * var9;
        var12 = -(-param0) * var9 + -param1 * var10;
        var13 = ((this.field_d << 4) - param0) * var10 + -param1 * var9;
        var14 = -((this.field_d << 4) - param0) * var9 + -param1 * var10;
        var15 = -param0 * var10 + ((this.field_e << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_e << 4) - param1) * var10;
        var17 = ((this.field_d << 4) - param0) * var10 + ((this.field_e << 4) - param1) * var9;
        var18 = -((this.field_d << 4) - param0) * var9 + ((this.field_e << 4) - param1) * var10;
        if (var11 >= var13) {
          var19 = var13;
          var20 = var11;
        } else {
          var19 = var11;
          var20 = var13;
        }
        if (var15 < var19) {
          var19 = var15;
        }
        if (var17 < var19) {
          var19 = var17;
        }
        if (var15 > var20) {
          var20 = var15;
        }
        if (var17 > var20) {
          var20 = var17;
        }
        if (var12 >= var14) {
          var21 = var14;
          var22 = var12;
        } else {
          var21 = var12;
          var22 = var14;
        }
        if (var16 < var21) {
          var21 = var16;
        }
        if (var18 < var21) {
          var21 = var18;
        }
        if (var16 > var22) {
          var22 = var16;
        }
        if (var18 > var22) {
          var22 = var18;
        }
        var19 = var19 >> 12;
        var20 = var20 + 4095 >> 12;
        var21 = var21 >> 12;
        var22 = var22 + 4095 >> 12;
        var19 = var19 + param2;
        var20 = var20 + param2;
        var21 = var21 + param3;
        var22 = var22 + param3;
        var19 = var19 >> 4;
        var20 = var20 + 15 >> 4;
        var21 = var21 >> 4;
        var22 = var22 + 15 >> 4;
        if (var19 < dg.field_f) {
          var19 = dg.field_f;
        }
        if (var20 > dg.field_h) {
          var20 = dg.field_h;
        }
        if (var21 < dg.field_j) {
          var21 = dg.field_j;
        }
        if (var22 > dg.field_k) {
          var22 = dg.field_k;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * dg.field_i + var19;
        var24 = 16777216.0 / (double)param5;
        var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5);
        var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5);
        var28 = (var19 << 4) + 8 - param2;
        var29 = (var21 << 4) + 8 - param3;
        var30 = (param0 << 8) - (var29 * var26 >> 4);
        var31 = (param1 << 8) + (var29 * var27 >> 4);
        if (var27 == 0) {
          if (var26 == 0) {
            var33 = var22;
            while (var33 < 0) {
              var34 = var23;
              var35 = var30;
              var36 = var31;
              var37 = var20;
              if (var35 < 0) {
                var33++;
                var23 = var23 + dg.field_i;
                continue;
              }
              if (var36 >= 0 &&
                var35 - (this.field_d << 12) < 0 &&
                var36 - (this.field_e << 12) < 0) {
                while (var37 < 0) {
                  var38 = this.field_h[this.field_g[(var36 >> 12) * this.field_d + (var35 >> 12)]];
                  if (var38 == 0) {
                    var34++;
                  } else {
                    incrementValue$8 = var34;
                    var34++;
                    dg.field_e[incrementValue$8] = var38;
                  }
                  var37++;
                }
              }
              var33++;
              var23 = var23 + dg.field_i;
            }
            return;
          }
          if (var26 >= 0) {
            var33Lifetime5 = var22;
            while (var33Lifetime5 < 0) {
              var34Lifetime5 = var23;
              var35Lifetime5 = var30;
              var36Lifetime5 = var31 + (var28 * var26 >> 4);
              var37Lifetime5 = var20;
              if (var35Lifetime5 >= 0 &&
                var35Lifetime5 - (this.field_d << 12) < 0) {
                if (var36Lifetime5 < 0) {
                  var32 = (var26 - 1 - var36Lifetime5) / var26;
                  var37Lifetime5 = var37Lifetime5 + var32;
                  var36Lifetime5 = var36Lifetime5 + var26 * var32;
                  var34Lifetime5 = var34Lifetime5 + var32;
                }
                var32Lifetime6 = (1 + var36Lifetime5 - (this.field_e << 12) - var26) / var26;
                if ((1 + var36Lifetime5 - (this.field_e << 12) - var26) / var26 > var37Lifetime5) {
                  var37Lifetime5 = var32Lifetime6;
                }
                while (var37Lifetime5 < 0) {
                  var38Lifetime5 = this.field_h[this.field_g[(var36Lifetime5 >> 12) * this.field_d + (var35Lifetime5 >> 12)]];
                  if (var38Lifetime5 == 0) {
                    var34Lifetime5++;
                  } else {
                    incrementValue$6 = var34Lifetime5;
                    var34Lifetime5++;
                    dg.field_e[incrementValue$6] = var38Lifetime5;
                  }
                  var36Lifetime5 = var36Lifetime5 + var26;
                  var37Lifetime5++;
                }
              }
              var33Lifetime5++;
              var30 = var30 - var26;
              var23 = var23 + dg.field_i;
            }
            return;
          }
          var33Lifetime6 = var22;
          while (var33Lifetime6 < 0) {
            var34Lifetime6 = var23;
            var35Lifetime6 = var30;
            var36Lifetime6 = var31 + (var28 * var26 >> 4);
            var37Lifetime6 = var20;
            if (var35Lifetime6 >= 0) {
              if (var35Lifetime6 - (this.field_d << 12) >= 0) {
                var33Lifetime6++;
                var30 = var30 - var26;
                var23 = var23 + dg.field_i;
                continue;
              }
              var32Lifetime5 = var36Lifetime6 - (this.field_e << 12);
              if (var36Lifetime6 - (this.field_e << 12) >= 0) {
                var32Lifetime5 = (var26 - var32Lifetime5) / var26;
                var37Lifetime6 = var37Lifetime6 + var32Lifetime5;
                var36Lifetime6 = var36Lifetime6 + var26 * var32Lifetime5;
                var34Lifetime6 = var34Lifetime6 + var32Lifetime5;
              }
              var32Lifetime5Lifetime1 = (var36Lifetime6 - var26) / var26;
              if ((var36Lifetime6 - var26) / var26 > var37Lifetime6) {
                var37Lifetime6 = var32Lifetime5Lifetime1;
              }
              while (var37Lifetime6 < 0) {
                var38Lifetime6 = this.field_h[this.field_g[(var36Lifetime6 >> 12) * this.field_d + (var35Lifetime6 >> 12)]];
                if (var38Lifetime6 == 0) {
                  var34Lifetime6++;
                } else {
                  incrementValue$7 = var34Lifetime6;
                  var34Lifetime6++;
                  dg.field_e[incrementValue$7] = var38Lifetime6;
                }
                var36Lifetime6 = var36Lifetime6 + var26;
                var37Lifetime6++;
              }
            }
            var33Lifetime6++;
            var30 = var30 - var26;
            var23 = var23 + dg.field_i;
          }
          return;
        }
        if (var27 >= 0) {
          if (var26 == 0) {
            var33Lifetime1 = var22;
            while (var33Lifetime1 < 0) {
              var34Lifetime1 = var23;
              var35Lifetime1 = var30 + (var28 * var27 >> 4);
              var36Lifetime1 = var31;
              var37Lifetime1 = var20;
              if (var36Lifetime1 >= 0 &&
                var36Lifetime1 - (this.field_e << 12) < 0) {
                if (var35Lifetime1 < 0) {
                  var32Lifetime1 = (var27 - 1 - var35Lifetime1) / var27;
                  var37Lifetime1 = var37Lifetime1 + var32Lifetime1;
                  var35Lifetime1 = var35Lifetime1 + var27 * var32Lifetime1;
                  var34Lifetime1 = var34Lifetime1 + var32Lifetime1;
                }
                var32Lifetime1Lifetime3 = (1 + var35Lifetime1 - (this.field_d << 12) - var27) / var27;
                if ((1 + var35Lifetime1 - (this.field_d << 12) - var27) / var27 > var37Lifetime1) {
                  var37Lifetime1 = var32Lifetime1Lifetime3;
                }
                while (var37Lifetime1 < 0) {
                  var38Lifetime1 = this.field_h[this.field_g[(var36Lifetime1 >> 12) * this.field_d + (var35Lifetime1 >> 12)]];
                  if (var38Lifetime1 == 0) {
                    var34Lifetime1++;
                  } else {
                    incrementValue$2 = var34Lifetime1;
                    var34Lifetime1++;
                    dg.field_e[incrementValue$2] = var38Lifetime1;
                  }
                  var35Lifetime1 = var35Lifetime1 + var27;
                  var37Lifetime1++;
                }
              }
              var33Lifetime1++;
              var31 = var31 + var27;
              var23 = var23 + dg.field_i;
            }
            return;
          }
          if (var26 >= 0) {
            var33Lifetime1Lifetime1 = var22;
            while (var33Lifetime1Lifetime1 < 0) {
              var34Lifetime1Lifetime1 = var23;
              var35Lifetime1Lifetime1 = var30 + (var28 * var27 >> 4);
              var36Lifetime1Lifetime1 = var31 + (var28 * var26 >> 4);
              var37Lifetime1Lifetime1 = var20;
              if (var35Lifetime1Lifetime1 < 0) {
                var32Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1;
              }
              var32Lifetime1Lifetime1Lifetime1 = (1 + var35Lifetime1Lifetime1 - (this.field_d << 12) - var27) / var27;
              if ((1 + var35Lifetime1Lifetime1 - (this.field_d << 12) - var27) / var27 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime1;
              }
              if (var36Lifetime1Lifetime1 < 0) {
                var32Lifetime1Lifetime1Lifetime2 = (var26 - 1 - var36Lifetime1Lifetime1) / var26;
                var37Lifetime1Lifetime1 = var37Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27 * var32Lifetime1Lifetime1Lifetime2;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26 * var32Lifetime1Lifetime1Lifetime2;
                var34Lifetime1Lifetime1 = var34Lifetime1Lifetime1 + var32Lifetime1Lifetime1Lifetime2;
              }
              var32Lifetime1Lifetime1Lifetime3 = (1 + var36Lifetime1Lifetime1 - (this.field_e << 12) - var26) / var26;
              if ((1 + var36Lifetime1Lifetime1 - (this.field_e << 12) - var26) / var26 > var37Lifetime1Lifetime1) {
                var37Lifetime1Lifetime1 = var32Lifetime1Lifetime1Lifetime3;
              }
              while (var37Lifetime1Lifetime1 < 0) {
                var38Lifetime1Lifetime1 = this.field_h[this.field_g[(var36Lifetime1Lifetime1 >> 12) * this.field_d + (var35Lifetime1Lifetime1 >> 12)]];
                if (var38Lifetime1Lifetime1 == 0) {
                  var34Lifetime1Lifetime1++;
                } else {
                  incrementValue$0 = var34Lifetime1Lifetime1;
                  var34Lifetime1Lifetime1++;
                  dg.field_e[incrementValue$0] = var38Lifetime1Lifetime1;
                }
                var35Lifetime1Lifetime1 = var35Lifetime1Lifetime1 + var27;
                var36Lifetime1Lifetime1 = var36Lifetime1Lifetime1 + var26;
                var37Lifetime1Lifetime1++;
              }
              var33Lifetime1Lifetime1++;
              var30 = var30 - var26;
              var31 = var31 + var27;
              var23 = var23 + dg.field_i;
            }
            return;
          }
          var33Lifetime1Lifetime2 = var22;
          while (var33Lifetime1Lifetime2 < 0) {
            var34Lifetime1Lifetime2 = var23;
            var35Lifetime1Lifetime2 = var30 + (var28 * var27 >> 4);
            var36Lifetime1Lifetime2 = var31 + (var28 * var26 >> 4);
            var37Lifetime1Lifetime2 = var20;
            if (var35Lifetime1Lifetime2 < 0) {
              var32Lifetime1Lifetime2 = (var27 - 1 - var35Lifetime1Lifetime2) / var27;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2;
            }
            var32Lifetime1Lifetime2Lifetime1 = (1 + var35Lifetime1Lifetime2 - (this.field_d << 12) - var27) / var27;
            if ((1 + var35Lifetime1Lifetime2 - (this.field_d << 12) - var27) / var27 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime1;
            }
            var32Lifetime1Lifetime2Lifetime2 = var36Lifetime1Lifetime2 - (this.field_e << 12);
            if (var36Lifetime1Lifetime2 - (this.field_e << 12) >= 0) {
              var32Lifetime1Lifetime2Lifetime2 = (var26 - var32Lifetime1Lifetime2Lifetime2) / var26;
              var37Lifetime1Lifetime2 = var37Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27 * var32Lifetime1Lifetime2Lifetime2;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26 * var32Lifetime1Lifetime2Lifetime2;
              var34Lifetime1Lifetime2 = var34Lifetime1Lifetime2 + var32Lifetime1Lifetime2Lifetime2;
            }
            var32Lifetime1Lifetime2Lifetime3 = (var36Lifetime1Lifetime2 - var26) / var26;
            if ((var36Lifetime1Lifetime2 - var26) / var26 > var37Lifetime1Lifetime2) {
              var37Lifetime1Lifetime2 = var32Lifetime1Lifetime2Lifetime3;
            }
            while (var37Lifetime1Lifetime2 < 0) {
              var38Lifetime1Lifetime2 = this.field_h[this.field_g[(var36Lifetime1Lifetime2 >> 12) * this.field_d + (var35Lifetime1Lifetime2 >> 12)]];
              if (var38Lifetime1Lifetime2 == 0) {
                var34Lifetime1Lifetime2++;
              } else {
                incrementValue$1 = var34Lifetime1Lifetime2;
                var34Lifetime1Lifetime2++;
                dg.field_e[incrementValue$1] = var38Lifetime1Lifetime2;
              }
              var35Lifetime1Lifetime2 = var35Lifetime1Lifetime2 + var27;
              var36Lifetime1Lifetime2 = var36Lifetime1Lifetime2 + var26;
              var37Lifetime1Lifetime2++;
            }
            var33Lifetime1Lifetime2++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + dg.field_i;
          }
          return;
        }
        if (var26 == 0) {
          var33Lifetime2 = var22;
          while (var33Lifetime2 < 0) {
            var34Lifetime2 = var23;
            var35Lifetime2 = var30 + (var28 * var27 >> 4);
            var36Lifetime2 = var31;
            var37Lifetime2 = var20;
            if (var36Lifetime2 >= 0 &&
              var36Lifetime2 - (this.field_e << 12) < 0) {
              var32Lifetime2 = var35Lifetime2 - (this.field_d << 12);
              if (var35Lifetime2 - (this.field_d << 12) >= 0) {
                var32Lifetime2 = (var27 - var32Lifetime2) / var27;
                var37Lifetime2 = var37Lifetime2 + var32Lifetime2;
                var35Lifetime2 = var35Lifetime2 + var27 * var32Lifetime2;
                var34Lifetime2 = var34Lifetime2 + var32Lifetime2;
              }
              var32Lifetime2Lifetime1 = (var35Lifetime2 - var27) / var27;
              if ((var35Lifetime2 - var27) / var27 > var37Lifetime2) {
                var37Lifetime2 = var32Lifetime2Lifetime1;
              }
              while (var37Lifetime2 < 0) {
                var38Lifetime2 = this.field_h[this.field_g[(var36Lifetime2 >> 12) * this.field_d + (var35Lifetime2 >> 12)]];
                if (var38Lifetime2 == 0) {
                  var34Lifetime2++;
                } else {
                  incrementValue$5 = var34Lifetime2;
                  var34Lifetime2++;
                  dg.field_e[incrementValue$5] = var38Lifetime2;
                }
                var35Lifetime2 = var35Lifetime2 + var27;
                var37Lifetime2++;
              }
            }
            var33Lifetime2++;
            var31 = var31 + var27;
            var23 = var23 + dg.field_i;
          }
          return;
        }
        if (var26 >= 0) {
          var33Lifetime3 = var22;
          while (var33Lifetime3 < 0) {
            var34Lifetime3 = var23;
            var35Lifetime3 = var30 + (var28 * var27 >> 4);
            var36Lifetime3 = var31 + (var28 * var26 >> 4);
            var37Lifetime3 = var20;
            var32Lifetime3 = var35Lifetime3 - (this.field_d << 12);
            if (var35Lifetime3 - (this.field_d << 12) >= 0) {
              var32Lifetime3 = (var27 - var32Lifetime3) / var27;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3;
            }
            var32Lifetime3Lifetime1 = (var35Lifetime3 - var27) / var27;
            if ((var35Lifetime3 - var27) / var27 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime1;
            }
            if (var36Lifetime3 < 0) {
              var32Lifetime3Lifetime2 = (var26 - 1 - var36Lifetime3) / var26;
              var37Lifetime3 = var37Lifetime3 + var32Lifetime3Lifetime2;
              var35Lifetime3 = var35Lifetime3 + var27 * var32Lifetime3Lifetime2;
              var36Lifetime3 = var36Lifetime3 + var26 * var32Lifetime3Lifetime2;
              var34Lifetime3 = var34Lifetime3 + var32Lifetime3Lifetime2;
            }
            var32Lifetime3Lifetime3 = (1 + var36Lifetime3 - (this.field_e << 12) - var26) / var26;
            if ((1 + var36Lifetime3 - (this.field_e << 12) - var26) / var26 > var37Lifetime3) {
              var37Lifetime3 = var32Lifetime3Lifetime3;
            }
            while (var37Lifetime3 < 0) {
              var38Lifetime3 = this.field_h[this.field_g[(var36Lifetime3 >> 12) * this.field_d + (var35Lifetime3 >> 12)]];
              if (var38Lifetime3 == 0) {
                var34Lifetime3++;
              } else {
                incrementValue$3 = var34Lifetime3;
                var34Lifetime3++;
                dg.field_e[incrementValue$3] = var38Lifetime3;
              }
              var35Lifetime3 = var35Lifetime3 + var27;
              var36Lifetime3 = var36Lifetime3 + var26;
              var37Lifetime3++;
            }
            var33Lifetime3++;
            var30 = var30 - var26;
            var31 = var31 + var27;
            var23 = var23 + dg.field_i;
          }
          return;
        }
        var33Lifetime4 = var22;
        while (var33Lifetime4 < 0) {
          var34Lifetime4 = var23;
          var35Lifetime4 = var30 + (var28 * var27 >> 4);
          var36Lifetime4 = var31 + (var28 * var26 >> 4);
          var37Lifetime4 = var20;
          var32Lifetime4 = var35Lifetime4 - (this.field_d << 12);
          if (var35Lifetime4 - (this.field_d << 12) >= 0) {
            var32Lifetime4 = (var27 - var32Lifetime4) / var27;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4;
          }
          var32Lifetime4Lifetime1 = (var35Lifetime4 - var27) / var27;
          if ((var35Lifetime4 - var27) / var27 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime1;
          }
          var32Lifetime4Lifetime2 = var36Lifetime4 - (this.field_e << 12);
          if (var36Lifetime4 - (this.field_e << 12) >= 0) {
            var32Lifetime4Lifetime2 = (var26 - var32Lifetime4Lifetime2) / var26;
            var37Lifetime4 = var37Lifetime4 + var32Lifetime4Lifetime2;
            var35Lifetime4 = var35Lifetime4 + var27 * var32Lifetime4Lifetime2;
            var36Lifetime4 = var36Lifetime4 + var26 * var32Lifetime4Lifetime2;
            var34Lifetime4 = var34Lifetime4 + var32Lifetime4Lifetime2;
          }
          var32Lifetime4Lifetime3 = (var36Lifetime4 - var26) / var26;
          if ((var36Lifetime4 - var26) / var26 > var37Lifetime4) {
            var37Lifetime4 = var32Lifetime4Lifetime3;
          }
          while (var37Lifetime4 < 0) {
            var38Lifetime4 = this.field_h[this.field_g[(var36Lifetime4 >> 12) * this.field_d + (var35Lifetime4 >> 12)]];
            if (var38Lifetime4 == 0) {
              var34Lifetime4++;
            } else {
              incrementValue$4 = var34Lifetime4;
              var34Lifetime4++;
              dg.field_e[incrementValue$4] = var38Lifetime4;
            }
            var35Lifetime4 = var35Lifetime4 + var27;
            var36Lifetime4 = var36Lifetime4 + var26;
            var37Lifetime4++;
          }
          var33Lifetime4++;
          var30 = var30 - var26;
          var31 = var31 + var27;
          var23 = var23 + dg.field_i;
        }
        return;
    }

    final void b(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_c;
        int var4 = param0 + param1 * dg.field_i;
        int var5 = 0;
        int var6 = this.field_e;
        int var7 = this.field_d;
        int var8 = dg.field_i - var7;
        int var9 = 0;
        if (param1 < dg.field_j) {
          var10 = dg.field_j - param1;
          var6 = var6 - var10;
          param1 = dg.field_j;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * dg.field_i;
        }
        if (param1 + var6 > dg.field_k) {
          var6 = var6 - (param1 + var6 - dg.field_k);
        }
        if (param0 < dg.field_f) {
          var10Lifetime1 = dg.field_f - param0;
          var7 = var7 - var10Lifetime1;
          param0 = dg.field_f;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > dg.field_h) {
          var10Lifetime2 = param0 + var7 - dg.field_h;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          ee.c(dg.field_e, this.field_g, this.field_h, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final kv a() {
        int var3 = 0;
        int var1 = this.field_d * this.field_e;
        int[] var2 = new int[var1];
        for (var3 = 0; var3 < var1; var3++) {
          var2[var3] = this.field_h[this.field_g[var3] & 255];
        }
        return new kv(this.field_a, this.field_b, this.field_f, this.field_c, this.field_d, this.field_e, var2);
    }

    final void b(int param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        int var17 = 0;
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
        int[] var18;
        int[] var19;
        var3 = this.field_d >> 1;
        var4 = this.field_e >> 1;
        param0 = param0 + this.field_f / 2;
        param1 = param1 + this.field_c / 2;
        if (param0 >= dg.field_f) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = dg.field_f - param0 << 1;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= dg.field_h) {
          stackIn_6_0 = this.field_d - 2;
        } else {
          stackIn_6_0 = (dg.field_h - param0 << 1) - 2;
        }
        var6 = stackIn_6_0;
        if (param1 >= dg.field_j) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = dg.field_j - param1 << 1;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= dg.field_k) {
          stackIn_12_0 = this.field_e - 2;
        } else {
          stackIn_12_0 = (dg.field_k - param1 << 1) - 2;
        }
        var8 = stackIn_12_0;
        var19 = new int[4];
        var18 = var19;
        var9 = var18;
        for (var10 = var7; var10 <= var8; var10 += 2) {
          for (var11 = var5; var11 <= var6; var11 += 2) {
            var12 = var10 * this.field_d + var11;
            var13 = (param1 + (var10 >> 1)) * dg.field_i + (param0 + (var11 >> 1));
            var9[0] = this.field_h[this.field_g[var12] & 255];
            var9[1] = this.field_h[this.field_g[var12 + 1] & 255];
            var9[2] = this.field_h[this.field_g[var12 + this.field_d] & 255];
            var9[3] = this.field_h[this.field_g[var12 + 1] & 255];
            var14 = 0;
            var15 = 0;
            var16 = 0;
            for (var17 = 0; var17 < 4; var17++) {
              if (var19[var17] == 0) {
                var9[var17] = dg.field_e[var13];
              }
              var14 = var14 + (var19[var17] >> 16 & 255);
              var15 = var15 + (var19[var17] >> 8 & 255);
              var16 = var16 + (var19[var17] & 255);
            }
            dg.field_e[var13] = var14 >> 2 << 16 | var15 >> 2 << 8 | var16 >> 2;
          }
        }
    }

    final ee c() {
        int var3 = 0;
        ee var1 = new ee(this.field_d, this.field_e, this.field_h.length);
        int var3Lifetime1;
        var1.field_a = this.field_a;
        var1.field_b = this.field_b;
        var1.field_f = this.field_f;
        var1.field_c = this.field_c;
        int var2 = this.field_g.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_g[var3] = this.field_g[var3];
        }
        var2 = this.field_h.length;
        int var4 = 0;
        var3Lifetime1 = var4;
        while (var4 < var2) {
          var1.field_h[var4] = this.field_h[var4];
          var4++;
        }
        return var1;
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            var16 = param1[(param3 >> 16) + var14];
            if (var16 != 0) {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[var16 & 255];
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

    private final static void b(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        int incrementValue$7 = 0;
        int incrementValue$9 = 0;
        int incrementValue$1 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$3 = param5;
              param5++;
              param0[incrementValue$3] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$5 = param5;
              param5++;
              param0[incrementValue$5] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$7 = param5;
              param5++;
              param0[incrementValue$7] = param2[param3 & 255];
            }
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$9 = param5;
              param5++;
              param0[incrementValue$9] = param2[param3 & 255];
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            param3 = param1[param4++];
            if (param3 == 0) {
              param5++;
            } else {
              incrementValue$1 = param5;
              param5++;
              param0[incrementValue$1] = param2[param3 & 255];
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    final void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + (this.field_a - this.field_d - this.field_f);
        param1 = param1 + this.field_c;
        int var3 = param0 + param1 * dg.field_i;
        int var4 = this.field_d - 1;
        int var5 = this.field_e;
        int var6 = this.field_d;
        int var7 = dg.field_i - var6;
        int var8 = var6 + var6;
        if (param1 < dg.field_j) {
          var9 = dg.field_j - param1;
          var5 = var5 - var9;
          param1 = dg.field_j;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * dg.field_i;
        }
        if (param1 + var5 > dg.field_k) {
          var5 = var5 - (param1 + var5 - dg.field_k);
        }
        if (param0 < dg.field_f) {
          var9Lifetime1 = dg.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = dg.field_f;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > dg.field_h) {
          var9Lifetime2 = param0 + var6 - dg.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ee.d(dg.field_e, this.field_g, this.field_h, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void c(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var13 = 0;
        int var14 = 0;
        int incrementValue$14 = 0;
        int var10;
        int var11;
        int var12;
        int var15;
        int var16;
        int var17;
        int var18;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        for (var13 = -param6; var13 < 0; var13++) {
          for (var14 = -param5; var14 < 0; var14++) {
            var15 = param1[param3++];
            if (var15 == 0) {
              param4++;
            } else {
              var15 = param2[var15 & 255];
              var16 = var15 >> 16 & 255;
              var17 = var15 >> 8 & 255;
              var18 = var15 & 255;
              if (var16 == var17 &&
                var17 == var18) {
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = (var16 * var10 >> 8 << 16) + (var17 * var11 >> 8 << 8) + (var18 * var12 >> 8);
              } else {
                param0[param4++] = var15;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void d(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_f;
        param1 = param1 + this.field_c;
        int var3 = param0 + param1 * dg.field_i;
        int var4 = 0;
        int var5 = this.field_e;
        int var6 = this.field_d;
        int var7 = dg.field_i - var6;
        int var8 = 0;
        if (param1 < dg.field_j) {
          var9 = dg.field_j - param1;
          var5 = var5 - var9;
          param1 = dg.field_j;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * dg.field_i;
        }
        if (param1 + var5 > dg.field_k) {
          var5 = var5 - (param1 + var5 - dg.field_k);
        }
        if (param0 < dg.field_f) {
          var9Lifetime1 = dg.field_f - param0;
          var6 = var6 - var9Lifetime1;
          param0 = dg.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > dg.field_h) {
          var9Lifetime2 = param0 + var6 - dg.field_h;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          ee.a(dg.field_e, this.field_g, this.field_h, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void d(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int incrementValue$2 = 0;
        int incrementValue$4 = 0;
        int incrementValue$6 = 0;
        int incrementValue$8 = 0;
        int incrementValue$0 = 0;
        int var10;
        int var12;
        int var12Lifetime1;
        var10 = -(param6 >> 2);
        param6 = -(param6 & 3);
        for (var11 = -param7; var11 < 0; var11++) {
          for (var12 = var10; var12 < 0; var12++) {
            incrementValue$2 = param4;
            param4--;
            param3 = param2[param1[incrementValue$2] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$4 = param4;
            param4--;
            param3 = param2[param1[incrementValue$4] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$6 = param4;
            param4--;
            param3 = param2[param1[incrementValue$6] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
            incrementValue$8 = param4;
            param4--;
            param3 = param2[param1[incrementValue$8] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          for (var12Lifetime1 = param6; var12Lifetime1 < 0; var12Lifetime1++) {
            incrementValue$0 = param4;
            param4--;
            param3 = param2[param1[incrementValue$0] & 255];
            if (param3 == 0) {
              param5++;
            } else {
              param0[param5++] = param3;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    ee(int param0, int param1, int param2, int param3, int param4, int param5, byte[] param6, int[] param7) {
        this.field_a = param0;
        this.field_b = param1;
        this.field_f = param2;
        this.field_c = param3;
        this.field_d = param4;
        this.field_e = param5;
        this.field_g = param6;
        this.field_h = param7;
    }

    private final static void a(int[] param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        int var14;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            var13 = param1[param3++];
            if (var13 == 0) {
              param4++;
            } else {
              var13 = param2[var13 & 255];
              var14 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((var13 & 16711935) * param9 + (var14 & 16711935) * var10 & -16711936) + ((var13 & 65280) * param9 + (var14 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    ee(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_a = param0;
        this.field_e = param1;
        this.field_b = param1;
        this.field_c = 0;
        this.field_f = 0;
        this.field_g = new byte[param0 * param1];
        this.field_h = new int[param2];
    }
}
