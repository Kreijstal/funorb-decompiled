/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends qg {
    int[] field_B;

    void d(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + (this.field_A - this.field_y - this.field_w);
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = this.field_y - 1;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = var6 + var6;
        if (param1 < qn.field_a) {
          var9 = qn.field_a - param1;
          var5 = var5 - var9;
          param1 = qn.field_a;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
          var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qn.field_j;
          var4 = var4 - var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 - var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qn.field_e) {
          var9Lifetime2 = param0 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 - var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          wk.b(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void b(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          wk.a(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          if (param4 == 256) {
            this.c(param0, param1, param2, param3);
            return;
          }
          var6 = this.field_y;
          var7 = this.field_v;
          var8 = 0;
          var9 = 0;
          var10 = this.field_A;
          var11 = this.field_x;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
          if (this.field_w > 0) {
            var14 = ((this.field_w << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.field_w << 16));
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
          var14Lifetime2 = param0 + param1 * qn.field_l;
          var15 = qn.field_l - param2;
          if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
          }
          if (param1 < qn.field_a) {
            var16 = qn.field_a - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * qn.field_l;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > qn.field_e) {
            var16Lifetime1 = param0 + param2 - qn.field_e;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < qn.field_j) {
            var16Lifetime2 = qn.field_j - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          wk.b(qn.field_d, this.field_B, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int incrementValue$0 = 0;
        int var18 = 0;
        int var13 = 256 - param12;
        int var14 = param3;
        for (var15 = -param8; var15 < 0; var15++) {
          var16 = (param4 >> 16) * param11;
          for (var17 = -param7; var17 < 0; var17++) {
            param2 = param1[(param3 >> 16) + var16];
            if (param2 != 0) {
              var18 = param0[param5];
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = ((param2 & 16711935) * param12 + (var18 & 16711935) * var13 & -16711936) + ((param2 & 65280) * param12 + (var18 & 65280) * var13 & 16711680) >> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var14;
          param5 = param5 + param6;
        }
    }

    final void d() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.field_y * this.field_v];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.field_y; var3++) {
          for (var4 = this.field_v - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_B[var3 + var4 * this.field_y];
          }
        }
        this.field_B = var1;
        var3Lifetime1 = this.field_z;
        this.field_z = this.field_w;
        this.field_w = this.field_x - this.field_v - var3Lifetime1;
        var3Lifetime2 = this.field_v;
        this.field_v = this.field_y;
        this.field_y = var3Lifetime2;
        var3Lifetime3 = this.field_x;
        this.field_x = this.field_A;
        this.field_A = var3Lifetime3;
    }

    final void a(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          wk.c(qn.field_d, this.field_B, param2, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    final void a() {
        int var8 = 0;
        int var9 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var1 = this.field_v - 1;
        L1: while (true) {
          if (var1 >= 0) {
            var2 = var1 * this.field_y;
            for (var3 = 0; var3 < this.field_y; var3++) {
              if (this.field_B[var2 + var3] != 0) {
                break L1;
              }
            }
            var1--;
            continue;
          }
          break;
        }
        var2Lifetime1 = 0;
        L4: while (true) {
          if (var2Lifetime1 < var1) {
            var3Lifetime1 = var2Lifetime1 * this.field_y;
            for (var4 = 0; var4 < this.field_y; var4++) {
              if (this.field_B[var3Lifetime1 + var4] != 0) {
                break L4;
              }
            }
            var2Lifetime1++;
            continue;
          }
          break;
        }
        var3Lifetime2 = this.field_y - 1;
        L7: while (true) {
          if (var3Lifetime2 >= 0) {
            for (var4Lifetime1 = var2Lifetime1; var4Lifetime1 <= var1; var4Lifetime1++) {
              if (this.field_B[var4Lifetime1 * this.field_y + var3Lifetime2] != 0) {
                break L7;
              }
            }
            var3Lifetime2--;
            continue;
          }
          break;
        }
        var4Lifetime2 = 0;
        L10: while (true) {
          if (var4Lifetime2 < var3Lifetime2) {
            for (var5 = var2Lifetime1; var5 <= var1; var5++) {
              if (this.field_B[var5 * this.field_y + var4Lifetime2] != 0) {
                break L10;
              }
            }
            var4Lifetime2++;
            continue;
          }
          break;
        }
        if (var4Lifetime2 == 0 &&
          var3Lifetime2 == this.field_y - 1 &&
          var2Lifetime1 == 0 &&
          var1 == this.field_v - 1) {
          return;
        }
        var5Lifetime1 = var3Lifetime2 + 1 - var4Lifetime2;
        var6 = var1 + 1 - var2Lifetime1;
        var7 = new int[var5Lifetime1 * var6];
        for (var8 = 0; var8 < var6; var8++) {
          for (var9 = 0; var9 < var5Lifetime1; var9++) {
            var7[var8 * var5Lifetime1 + var9] = this.field_B[(var8 + var2Lifetime1) * this.field_y + (var9 + var4Lifetime2)];
          }
        }
        this.field_B = var7;
        this.field_y = var5Lifetime1;
        this.field_v = var6;
        this.field_w = this.field_w + var4Lifetime2;
        this.field_z = this.field_z + var2Lifetime1;
        return;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        int var24;
        double var25;
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
        int var39;
        int var40;
        int var33Lifetime1;
        int var33Lifetime2;
        int var34Lifetime1;
        int var34Lifetime2;
        int var35Lifetime1;
        int var35Lifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38Lifetime1;
        int var38Lifetime2;
        int var39Lifetime1;
        int var39Lifetime2;
        int var40Lifetime1;
        int var40Lifetime2;
        int var33Lifetime3;
        int var34Lifetime3;
        int var35Lifetime3;
        int var36Lifetime3;
        int var37Lifetime3;
        int var38Lifetime3;
        int var39Lifetime3;
        int var40Lifetime3;
        int var35Lifetime1Lifetime1;
        int var35Lifetime2Lifetime1;
        int var35Lifetime4;
        int var35Lifetime3Lifetime1;
        if (param5 == 0) {
          return;
        }
        param0 = param0 - (this.field_w << 4);
        param1 = param1 - (this.field_z << 4);
        var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        var11 = -param0 * var10 + -param1 * var9;
        var12 = -(-param0) * var9 + -param1 * var10;
        var13 = ((this.field_y << 4) - param0) * var10 + -param1 * var9;
        var14 = -((this.field_y << 4) - param0) * var9 + -param1 * var10;
        var15 = -param0 * var10 + ((this.field_v << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_v << 4) - param1) * var10;
        var17 = ((this.field_y << 4) - param0) * var10 + ((this.field_v << 4) - param1) * var9;
        var18 = -((this.field_y << 4) - param0) * var9 + ((this.field_v << 4) - param1) * var10;
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
        if (var19 < qn.field_j) {
          var19 = qn.field_j;
        }
        if (var20 > qn.field_e) {
          var20 = qn.field_e;
        }
        if (var21 < qn.field_a) {
          var21 = qn.field_a;
        }
        if (var22 > qn.field_f) {
          var22 = qn.field_f;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * qn.field_l + var19;
        var24 = qn.field_l + var20;
        var25 = 16777216.0 / (double)param5;
        var27 = (int)Math.floor(Math.sin(var7) * var25 + 0.5);
        var28 = (int)Math.floor(Math.cos(var7) * var25 + 0.5);
        var29 = (var19 << 4) + 8 - param2;
        var30 = (var21 << 4) + 8 - param3;
        var31 = (param0 << 8) - 2048 - (var30 * var27 >> 4);
        var32 = (param1 << 8) - 2048 + (var30 * var28 >> 4);
        if (var28 >= 0) {
          if (var27 >= 0) {
            var36 = var22;
            while (var36 < 0) {
              var37 = var31 + (var29 * var28 >> 4);
              var38 = var32 + (var29 * var27 >> 4);
              var39 = var20;
              var40 = 0;
              var35 = var37 + 4096;
              if (var35 < 0) {
                if (var28 != 0) {
                  var35 = (var28 - 1 - var35) / var28;
                  var39 = var39 + var35;
                  var37 = var37 + var28 * var35;
                  var38 = var38 + var27 * var35;
                  var23 = var23 + var35;
                  var40 = 1;
                } else {
                  var23 = var23 - var39;
                }
              } else {
                var40 = 1;
              }
              if (var40 != 0) {
                var40 = 0;
                var35Lifetime4 = var38 + 4096;
                if (var35Lifetime4 < 0) {
                  if (var27 != 0) {
                    var35Lifetime4 = (var27 - 1 - var35Lifetime4) / var27;
                    var39 = var39 + var35Lifetime4;
                    var37 = var37 + var28 * var35Lifetime4;
                    var38 = var38 + var27 * var35Lifetime4;
                    var23 = var23 + var35Lifetime4;
                    var40 = 1;
                  } else {
                    var23 = var23 - var39;
                  }
                } else {
                  var40 = 1;
                }
                if (var40 != 0) {
                  while (var39 < 0) {
                    var33 = var37 >> 12;
                    if (var37 >> 12 < this.field_y) {
                      var34 = var38 >> 12;
                      if (var38 >> 12 < this.field_v) {
                        this.a(var23, var33, var34, var37, var38);
                        var39++;
                        var37 = var37 + var28;
                        var38 = var38 + var27;
                        var23++;
                        continue;
                      }
                    }
                    break;
                  }
                  var23 = var23 - var39;
                }
              }
              var36++;
              var31 = var31 - var27;
              var32 = var32 + var28;
              var23 = var23 + var24;
            }
            return;
          }
          var36Lifetime3 = var22;
          while (var36Lifetime3 < 0) {
            var37Lifetime3 = var31 + (var29 * var28 >> 4);
            var38Lifetime3 = var32 + (var29 * var27 >> 4);
            var39Lifetime3 = var20;
            var40Lifetime3 = 0;
            var35Lifetime3 = var37Lifetime3 + 4096;
            if (var35Lifetime3 < 0) {
              if (var28 != 0) {
                var35Lifetime3 = (var28 - 1 - var35Lifetime3) / var28;
                var39Lifetime3 = var39Lifetime3 + var35Lifetime3;
                var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3;
                var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3;
                var23 = var23 + var35Lifetime3;
                var40Lifetime3 = 1;
              } else {
                var23 = var23 - var39Lifetime3;
              }
            } else {
              var40Lifetime3 = 1;
            }
            if (var40Lifetime3 != 0) {
              var40Lifetime3 = 0;
              var35Lifetime3Lifetime1 = var38Lifetime3 - (this.field_v << 12);
              if (var35Lifetime3Lifetime1 >= 0) {
                if (var27 != 0) {
                  var35Lifetime3Lifetime1 = (var27 - var35Lifetime3Lifetime1) / var27;
                  var39Lifetime3 = var39Lifetime3 + var35Lifetime3Lifetime1;
                  var37Lifetime3 = var37Lifetime3 + var28 * var35Lifetime3Lifetime1;
                  var38Lifetime3 = var38Lifetime3 + var27 * var35Lifetime3Lifetime1;
                  var23 = var23 + var35Lifetime3Lifetime1;
                  var40Lifetime3 = 1;
                } else {
                  var23 = var23 - var39Lifetime3;
                }
              } else {
                var40Lifetime3 = 1;
              }
              if (var40Lifetime3 != 0) {
                while (var39Lifetime3 < 0) {
                  if (var38Lifetime3 >= -4096) {
                    var33Lifetime3 = var37Lifetime3 >> 12;
                    if (var37Lifetime3 >> 12 < this.field_y) {
                      var34Lifetime3 = var38Lifetime3 >> 12;
                      this.a(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
                      var39Lifetime3++;
                      var37Lifetime3 = var37Lifetime3 + var28;
                      var38Lifetime3 = var38Lifetime3 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime3;
              }
            }
            var36Lifetime3++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        if (var27 >= 0) {
          var36Lifetime1 = var22;
          while (var36Lifetime1 < 0) {
            var37Lifetime1 = var31 + (var29 * var28 >> 4);
            var38Lifetime1 = var32 + (var29 * var27 >> 4);
            var39Lifetime1 = var20;
            var40Lifetime1 = 0;
            var35Lifetime1 = var37Lifetime1 - (this.field_y << 12);
            if (var35Lifetime1 >= 0) {
              if (var28 != 0) {
                var35Lifetime1 = (var28 - var35Lifetime1) / var28;
                var39Lifetime1 = var39Lifetime1 + var35Lifetime1;
                var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1;
                var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1;
                var23 = var23 + var35Lifetime1;
                var40Lifetime1 = 1;
              } else {
                var23 = var23 - var39Lifetime1;
              }
            } else {
              var40Lifetime1 = 1;
            }
            if (var40Lifetime1 != 0) {
              var40Lifetime1 = 0;
              var35Lifetime1Lifetime1 = var38Lifetime1 + 4096;
              if (var35Lifetime1Lifetime1 < 0) {
                if (var27 != 0) {
                  var35Lifetime1Lifetime1 = (var27 - 1 - var35Lifetime1Lifetime1) / var27;
                  var39Lifetime1 = var39Lifetime1 + var35Lifetime1Lifetime1;
                  var37Lifetime1 = var37Lifetime1 + var28 * var35Lifetime1Lifetime1;
                  var38Lifetime1 = var38Lifetime1 + var27 * var35Lifetime1Lifetime1;
                  var23 = var23 + var35Lifetime1Lifetime1;
                  var40Lifetime1 = 1;
                } else {
                  var23 = var23 - var39Lifetime1;
                }
              } else {
                var40Lifetime1 = 1;
              }
              if (var40Lifetime1 != 0) {
                while (var39Lifetime1 < 0) {
                  if (var37Lifetime1 >= -4096) {
                    var34Lifetime1 = var38Lifetime1 >> 12;
                    if (var38Lifetime1 >> 12 < this.field_v) {
                      var33Lifetime1 = var37Lifetime1 >> 12;
                      this.a(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
                      var39Lifetime1++;
                      var37Lifetime1 = var37Lifetime1 + var28;
                      var38Lifetime1 = var38Lifetime1 + var27;
                      var23++;
                      continue;
                    }
                  }
                  break;
                }
                var23 = var23 - var39Lifetime1;
              }
            }
            var36Lifetime1++;
            var31 = var31 - var27;
            var32 = var32 + var28;
            var23 = var23 + var24;
          }
          return;
        }
        var36Lifetime2 = var22;
        while (var36Lifetime2 < 0) {
          var37Lifetime2 = var31 + (var29 * var28 >> 4);
          var38Lifetime2 = var32 + (var29 * var27 >> 4);
          var39Lifetime2 = var20;
          var40Lifetime2 = 0;
          var35Lifetime2 = var37Lifetime2 - (this.field_y << 12);
          if (var35Lifetime2 >= 0) {
            if (var28 != 0) {
              var35Lifetime2 = (var28 - var35Lifetime2) / var28;
              var39Lifetime2 = var39Lifetime2 + var35Lifetime2;
              var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2;
              var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2;
              var23 = var23 + var35Lifetime2;
              var40Lifetime2 = 1;
            } else {
              var23 = var23 - var39Lifetime2;
            }
          } else {
            var40Lifetime2 = 1;
          }
          if (var40Lifetime2 != 0) {
            var40Lifetime2 = 0;
            var35Lifetime2Lifetime1 = var38Lifetime2 - (this.field_v << 12);
            if (var35Lifetime2Lifetime1 >= 0) {
              if (var27 != 0) {
                var35Lifetime2Lifetime1 = (var27 - var35Lifetime2Lifetime1) / var27;
                var39Lifetime2 = var39Lifetime2 + var35Lifetime2Lifetime1;
                var37Lifetime2 = var37Lifetime2 + var28 * var35Lifetime2Lifetime1;
                var38Lifetime2 = var38Lifetime2 + var27 * var35Lifetime2Lifetime1;
                var23 = var23 + var35Lifetime2Lifetime1;
                var40Lifetime2 = 1;
              } else {
                var23 = var23 - var39Lifetime2;
              }
            } else {
              var40Lifetime2 = 1;
            }
            if (var40Lifetime2 != 0) {
              while (var39Lifetime2 < 0) {
                if (var37Lifetime2 >= -4096 &&
                  var38Lifetime2 >= -4096) {
                  var33Lifetime2 = var37Lifetime2 >> 12;
                  var34Lifetime2 = var38Lifetime2 >> 12;
                  this.a(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
                  var39Lifetime2++;
                  var37Lifetime2 = var37Lifetime2 + var28;
                  var38Lifetime2 = var38Lifetime2 + var27;
                  var23++;
                  continue;
                }
                break;
              }
              var23 = var23 - var39Lifetime2;
            }
          }
          var36Lifetime2++;
          var31 = var31 - var27;
          var32 = var32 + var28;
          var23 = var23 + var24;
        }
        return;
    }

    final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var1 = this.field_B;
        for (var2 = (this.field_v >> 1) - 1; var2 >= 0; var2--) {
          var3 = var2 * this.field_y;
          var4 = (this.field_v - var2 - 1) * this.field_y;
          for (var5 = -this.field_y; var5 < 0; var5++) {
            var6 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var6;
            var3++;
            var4++;
          }
        }
        this.field_z = this.field_x - this.field_v - this.field_z;
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        for (var4 = 0; var4 < this.field_B.length; var4++) {
          var5 = this.field_B[var4];
          if (var5 != 0) {
            var6 = var5 >> 16 & 255;
            var6 = var6 + param0;
            if (var6 >= 1) {
              if (var6 > 255) {
                var6 = 255;
              }
            } else {
              var6 = 1;
            }
            var7 = var5 >> 8 & 255;
            var7 = var7 + param1;
            if (var7 >= 1) {
              if (var7 > 255) {
                var7 = 255;
              }
            } else {
              var7 = 1;
            }
            var8 = var5 & 255;
            var8 = var8 + param2;
            if (var8 >= 1) {
              if (var8 > 255) {
                var8 = 255;
              }
            } else {
              var8 = 1;
            }
            this.field_B[var4] = (var6 << 16) + (var7 << 8) + var8;
          }
        }
    }

    final void d(int param0, int param1, int param2, int param3) {
        int var11 = 0;
        int var12 = 0;
        int var30 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
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
        int var28;
        int var29;
        int var31;
        int var32;
        int var28Lifetime1;
        if (param2 <= this.field_A &&
          param3 <= this.field_x) {
          var5 = param0 + this.field_w * param2 / this.field_A;
          var6 = param0 + ((this.field_w + this.field_y) * param2 + this.field_A - 1) / this.field_A;
          var7 = param1 + this.field_z * param3 / this.field_x;
          var8 = param1 + ((this.field_z + this.field_v) * param3 + this.field_x - 1) / this.field_x;
          if (var5 < qn.field_j) {
            var5 = qn.field_j;
          }
          if (var6 > qn.field_e) {
            var6 = qn.field_e;
          }
          if (var7 < qn.field_a) {
            var7 = qn.field_a;
          }
          if (var8 > qn.field_f) {
            var8 = qn.field_f;
          }
          if (var5 >= var6) {
            return;
          }
          if (var7 >= var8) {
            return;
          }
          var9 = var7 * qn.field_l + var5;
          var10 = qn.field_l - (var6 - var5);
          for (var11 = var7; var11 < var8; var11++) {
            for (var12 = var5; var12 < var6; var12++) {
              var13 = var12 - param0 << 4;
              var14 = var11 - param1 << 4;
              var15 = var13 * this.field_A / param2 - (this.field_w << 4);
              var16 = (var13 + 16) * this.field_A / param2 - (this.field_w << 4);
              var17 = var14 * this.field_x / param3 - (this.field_z << 4);
              var18 = (var14 + 16) * this.field_x / param3 - (this.field_z << 4);
              var19 = (var16 - var15) * (var18 - var17) >> 1;
              if (var19 != 0) {
                if (var15 < 0) {
                  var15 = 0;
                }
                if (var16 > this.field_y << 4) {
                  var16 = this.field_y << 4;
                }
                if (var17 < 0) {
                  var17 = 0;
                }
                if (var18 > this.field_v << 4) {
                  var18 = this.field_v << 4;
                }
                var16--;
                var18--;
                var20 = 16 - (var15 & 15);
                var21 = (var16 & 15) + 1;
                var22 = 16 - (var17 & 15);
                var23 = (var18 & 15) + 1;
                var15 = var15 >> 4;
                var16 = var16 >> 4;
                var17 = var17 >> 4;
                var18 = var18 >> 4;
                var24 = 0;
                var25 = 0;
                var26 = 0;
                var27 = 0;
                for (var28 = var17; var28 <= var18; var28++) {
                  var29 = 16;
                  if (var28 == var17) {
                    var29 = var22;
                  }
                  if (var28 == var18) {
                    var29 = var23;
                  }
                  for (var30 = var15; var30 <= var16; var30++) {
                    var31 = this.field_B[var28 * this.field_y + var30];
                    if (var31 != 0) {
                      var32 = var29;
                      if (var30 != var15) {
                        if (var30 != var16) {
                          var32 = var32 << 4;
                        } else {
                          var32 = var32 * var21;
                        }
                      } else {
                        var32 = var32 * var20;
                      }
                      var27 = var27 + var32;
                      var24 = var24 + (var31 >> 16 & 255) * var32;
                      var25 = var25 + (var31 >> 8 & 255) * var32;
                      var26 = var26 + (var31 & 255) * var32;
                    }
                  }
                }
                if (var27 >= var19) {
                  var28Lifetime1 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                  if (var28Lifetime1 == 0) {
                    var28Lifetime1 = 1;
                  }
                  qn.field_d[var9] = var28Lifetime1;
                }
                var9++;
              }
            }
            var9 = var9 + var10;
          }
          return;
        }
        throw new IllegalArgumentException();
    }

    final void i() {
        int var2 = 0;
        int var3 = 0;
        if (this.field_y == this.field_A &&
          this.field_v == this.field_x) {
          return;
        }
        int[] var1 = new int[this.field_A * this.field_x];
        for (var2 = 0; var2 < this.field_v; var2++) {
          for (var3 = 0; var3 < this.field_y; var3++) {
            var1[(var2 + this.field_z) * this.field_A + (var3 + this.field_w)] = this.field_B[var2 * this.field_y + var3];
          }
        }
        this.field_B = var1;
        this.field_y = this.field_A;
        this.field_v = this.field_x;
        this.field_w = 0;
        this.field_z = 0;
    }

    void h(int param0, int param1) {
        param0 = param0 + (this.field_w >> 1);
        param1 = param1 + (this.field_z >> 1);
        int var3 = param0 < qn.field_j ? qn.field_j - param0 << 1 : 0;
        int var4 = param0 + (this.field_y >> 1) > qn.field_e ? qn.field_e - param0 << 1 : this.field_y;
        int var5 = param1 < qn.field_a ? qn.field_a - param1 << 1 : 0;
        int var6 = param1 + (this.field_v >> 1) > qn.field_f ? qn.field_f - param1 << 1 : this.field_v;
        wk.a(this.field_B, var5 * this.field_y + var3, (param1 + (var5 >> 1)) * qn.field_l + (param0 + (var3 >> 1)), (this.field_y << 1) - (var4 - var3) + (this.field_y & 1), qn.field_l - (var4 - var3 >> 1), this.field_y, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    final void g(int param0) {
        int var4 = 0;
        int var5 = 0;
        int[] var2;
        int var3;
        int var6;
        var2 = new int[this.field_y * this.field_v];
        var3 = 0;
        for (var4 = 0; var4 < this.field_v; var4++) {
          for (var5 = 0; var5 < this.field_y; var5++) {
            var6 = this.field_B[var3];
            if (var6 == 0) {
              if (var5 > 0 &&
                this.field_B[var3 - 1] != 0) {
                var6 = param0;
              } else {
                if (var4 > 0 &&
                  this.field_B[var3 - this.field_y] != 0) {
                  var6 = param0;
                } else {
                  if (var5 < this.field_y - 1 &&
                    this.field_B[var3 + 1] != 0) {
                    var6 = param0;
                  } else {
                    if (var4 < this.field_v - 1 &&
                      this.field_B[var3 + this.field_y] != 0) {
                      var6 = param0;
                    }
                  }
                }
              }
            }
            var2[var3++] = var6;
          }
        }
        this.field_B = var2;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int incrementValue$14 = 0;
        int var12;
        int var13;
        var12 = param11 & 16711935;
        var13 = param11 >> 8 & 255;
        for (param6 = -param8; param6 < 0; param6++) {
          for (param5 = -param7; param5 < 0; param5++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              if (param2 >> 8 != (param2 & 65535)) {
                param0[param4++] = param2;
              } else {
                param2 = param2 & 255;
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = (param2 * var12 >> 8 & 16711934) + (param2 * var13 & 65280) + 1;
              }
            }
          }
          param4 = param4 + param9;
          param3 = param3 + param10;
        }
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var13;
        var10 = 256 - param9;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var13 = param0[param4];
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = ((param2 & 16711935) * param9 + (var13 & 16711935) * var10 & -16711936) + ((param2 & 65280) * param9 + (var13 & 65280) * var10 & 16711680) >> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$5 = 0;
        int var12;
        int var13;
        int var14;
        for (var10 = -param7; var10 < 0; var10++) {
          for (var11 = -param6; var11 < 0; var11++) {
            param3 = param2[param4++];
            if (param3 != 0) {
              param0 = param1[param5];
              if (param0 != 0) {
                var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                var14 = (param3 & 255) * (param0 & 255) >>> 8;
                incrementValue$5 = param5;
                param5++;
                param1[incrementValue$5] = (var12 << 16) + (var13 << 8) + var14;
              } else {
                param5++;
              }
            } else {
              param5++;
            }
          }
          param5 = param5 + param8;
          param4 = param4 + param9;
        }
    }

    void f(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
          var9 = qn.field_a - param1;
          var5 = var5 - var9;
          param1 = qn.field_a;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
          var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qn.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qn.field_e) {
          var9Lifetime2 = param0 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          wk.a(qn.field_d, this.field_B, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void e(int param0, int param1) {
        int var9 = 0;
        int var16 = 0;
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
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var13Lifetime1;
        var3 = this.field_y >> 2;
        var4 = this.field_v >> 2;
        param0 = param0 + this.field_w / 4;
        param1 = param1 + this.field_z / 4;
        if (param0 >= qn.field_j) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = qn.field_j - param0 << 2;
        }
        var5 = stackIn_3_0;
        if (param0 + var3 <= qn.field_e) {
          stackIn_6_0 = this.field_y - 4;
        } else {
          stackIn_6_0 = (qn.field_e - param0 << 2) - 4;
        }
        var6 = stackIn_6_0;
        if (param1 >= qn.field_a) {
          stackIn_9_0 = 0;
        } else {
          stackIn_9_0 = qn.field_a - param1 << 2;
        }
        var7 = stackIn_9_0;
        if (param1 + var4 <= qn.field_f) {
          stackIn_12_0 = this.field_v - 4;
        } else {
          stackIn_12_0 = (qn.field_f - param1 << 2) - 4;
        }
        var8 = stackIn_12_0;
        for (var9 = var7; var9 <= var8; var9 += 4) {
          var10 = var9 * this.field_y + var5;
          var11 = (param1 + (var9 >> 2)) * qn.field_l + (param0 + (var5 >> 2));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.field_B[var10 + var16 * this.field_y + var17];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = qn.field_d[var11];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            qn.field_d[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
            var11++;
          }
        }
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void b() {
        qn.a(this.field_B, this.field_y, this.field_v);
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
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

    final void h() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var1 = this.field_B;
        for (var2 = this.field_v - 1; var2 >= 0; var2--) {
          var3 = var2 * this.field_y;
          var4 = (var2 + 1) * this.field_y;
          while (var3 < var4) {
            var4--;
            var5 = var1[var3];
            var1[var3] = var1[var4];
            var1[var4] = var5;
            var3++;
          }
        }
        this.field_w = this.field_A - this.field_y - this.field_w;
    }

    private final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$12 = 0;
        for (param8 = -param10; param8 < 0; param8++) {
          for (param6 = -param9; param6 < 0; param6++) {
            param0 = param4[param5++];
            if (param0 == 0) {
              param7++;
            } else {
              param1 = (param0 & 16711935) * param13;
              param0 = (param1 & -16711936) + (param0 * param13 - param1 & 16711680) >>> 8;
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

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var12 = param3;
        for (var13 = -param8; var13 < 0; var13++) {
          var14 = (param4 >> 16) * param11;
          for (var15 = -param7; var15 < 0; var15++) {
            param2 = param1[(param3 >> 16) + var14];
            if (param2 != 0) {
              param0[param5++] = param2;
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

    final void b(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
          var9 = qn.field_a - param1;
          var5 = var5 - var9;
          param1 = qn.field_a;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
          var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qn.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qn.field_e) {
          var9Lifetime2 = param0 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          wk.a(0, qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var15 = 0;
        int var16 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var17;
        int var18;
        int var19;
        var10 = param9 >> 16 & 255;
        var11 = param9 >> 8 & 255;
        var12 = param9 & 255;
        var13 = -(param5 >> 2);
        param5 = -(param5 & 3);
        var14 = var13 + var13 + var13 + var13 + param5;
        for (var15 = -param6; var15 < 0; var15++) {
          for (var16 = var14; var16 < 0; var16++) {
            boolean decompiledFrameRemainder0 = true;
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var17 = param2 >> 16 & 255;
              var18 = param2 >> 8 & 255;
              var19 = param2 & 255;
              if (var17 == var18 &&
                var18 == var19) {
                if (var17 > 128) {
                  incrementValue$1 = param4;
                  param4++;
                  param0[incrementValue$1] = (var10 * (256 - var17) + 255 * (var17 - 128) >> 7 << 16) + (var11 * (256 - var18) + 255 * (var18 - 128) >> 7 << 8) + (var12 * (256 - var19) + 255 * (var19 - 128) >> 7);
                } else {
                  incrementValue$2 = param4;
                  param4++;
                  param0[incrementValue$2] = (var17 * var10 >> 7 << 16) + (var18 * var11 >> 7 << 8) + (var19 * var12 >> 7);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                param0[param4++] = param2;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int incrementValue$0 = 0;
        int var16 = param3;
        while (param8 < 0) {
          param7 = (param9 >> 16) * param15;
          for (param6 = -param12; param6 < 0; param6++) {
            param0 = param4[(param3 >> 16) + param7];
            if (param0 != 0) {
              param1 = param5[param10];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$0 = param10;
              param10++;
              param5[incrementValue$0] = param2 - param1 | param1 - (param1 >>> 8);
            } else {
              param10++;
            }
            param3 = param3 + param13;
          }
          param9 = param9 + param14;
          param3 = var16;
          param10 = param10 + param11;
          param8++;
        }
    }

    void f(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (param2 == 256) {
            wk.a(0, 0, 0, qn.field_d, this.field_B, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            wk.a(0, 0, 0, qn.field_d, this.field_B, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_A << 3;
        int var6 = this.field_x << 3;
        param0 = (param0 << 4) + (var5 & 15);
        param1 = (param1 << 4) + (var6 & 15);
        this.b(var5, var6, param0, param1, param2, param3);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int dupTemp$3 = 0;
        int incrementValue$4 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var8 = 0;
        while (var8 < param7) {
          var9 = 0;
          while (var9 < param6) {
            var11 = qn.field_d[param2] & 16711935;
            var12 = qn.field_d[param2] & 65280;
            var13 = 0;
            var14 = 0;
            dupTemp$0 = param0[param1];
            var10 = dupTemp$0;
            if (dupTemp$0 != 0) {
              var13 = var13 + (var10 & 16711935);
              var14 = var14 + (var10 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$1 = param0[param1 + 1];
            var10Lifetime1 = dupTemp$1;
            if (dupTemp$1 != 0) {
              var13 = var13 + (var10Lifetime1 & 16711935);
              var14 = var14 + (var10Lifetime1 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$2 = param0[param1 + param5];
            var10Lifetime2 = dupTemp$2;
            if (dupTemp$2 != 0) {
              var13 = var13 + (var10Lifetime2 & 16711935);
              var14 = var14 + (var10Lifetime2 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            dupTemp$3 = param0[param1 + param5 + 1];
            var10Lifetime3 = dupTemp$3;
            if (dupTemp$3 != 0) {
              var13 = var13 + (var10Lifetime3 & 16711935);
              var14 = var14 + (var10Lifetime3 & 65280);
            } else {
              var13 = var13 + var11;
              var14 = var14 + var12;
            }
            incrementValue$4 = param2;
            param2++;
            qn.field_d[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
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
        var6 = param2 * this.field_y + param1;
        param3 = param3 & 4095;
        param4 = param4 & 4095;
        if (param2 < 0) {
          var12 = 0;
          var11 = 0;
          var8 = 0;
          var7 = 0;
        } else {
          if (param1 < 0) {
            var11 = 0;
            var7 = 0;
          } else {
            var7 = this.field_B[var6];
            if (var7 == 0) {
              stackIn_5_0 = 0;
            } else {
              stackIn_5_0 = (4096 - param3) * (4096 - param4);
            }
            var11 = stackIn_5_0;
          }
          if (param1 >= this.field_y - 1) {
            var12 = 0;
            var8 = 0;
          } else {
            var8 = this.field_B[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.field_v - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.field_B[var6 + this.field_y];
            if (var9 == 0) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = (4096 - param3) * param4;
            }
            var13 = stackIn_19_0;
          }
          if (param1 >= this.field_y - 1) {
            var14 = 0;
            var10 = 0;
          } else {
            var10 = this.field_B[var6 + this.field_y + 1];
            if (var10 == 0) {
              stackIn_25_0 = 0;
            } else {
              stackIn_25_0 = param3 * param4;
            }
            var14 = stackIn_25_0;
          }
        }
        var11 = var11 >> 16;
        var12 = var12 >> 16;
        var13 = var13 >> 16;
        var14 = var14 >> 16;
        var15 = var11 + var12 + var13 + var14;
        if (var15 < 256) {
          if (var15 < 128) {
            return;
          }
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = ((var16 >>> 16) / var15 << 16) + (var17 / var15 & 65280) + (var16 & 65535) / var15;
          if (var18 == 0) {
            var18 = 1;
          }
          qn.field_d[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          qn.field_d[param0] = var18;
        }
    }

    void d(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          wk.a(qn.field_d, this.field_B, 0, var5, var4, 0, 0, var7, var6, var8, var9, param2);
          return;
        }
    }

    void c(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var6 = this.field_y;
          var7 = this.field_v;
          var8 = 0;
          var9 = 0;
          var10 = this.field_A;
          var11 = this.field_x;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
          if (this.field_w > 0) {
            var14 = ((this.field_w << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.field_w << 16));
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
          var14Lifetime2 = param0 + param1 * qn.field_l;
          var15 = qn.field_l - param2;
          if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
          }
          if (param1 < qn.field_a) {
            var16 = qn.field_a - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * qn.field_l;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > qn.field_e) {
            var16Lifetime1 = param0 + param2 - qn.field_e;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < qn.field_j) {
            var16Lifetime2 = qn.field_j - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          wk.a(qn.field_d, this.field_B, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var13 = 0;
        int var15 = 0;
        int var13Lifetime1;
        int var13Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var5 = this.field_y;
          var6 = this.field_v;
          var7 = 0;
          var8 = 0;
          var9 = this.field_A;
          var10 = this.field_x;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
          if (this.field_w > 0) {
            var13 = ((this.field_w << 16) + var11 - 1) / var11;
            param0 = param0 + var13;
            var7 = var7 + (var13 * var11 - (this.field_w << 16));
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
          var13Lifetime2 = param0 + param1 * qn.field_l;
          var14 = qn.field_l - param2;
          if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
          }
          if (param1 < qn.field_a) {
            var15 = qn.field_a - param1;
            param3 = param3 - var15;
            var13Lifetime2 = var13Lifetime2 + var15 * qn.field_l;
            var8 = var8 + var12 * var15;
          }
          if (param0 + param2 > qn.field_e) {
            var15Lifetime1 = param0 + param2 - qn.field_e;
            param2 = param2 - var15Lifetime1;
            var14 = var14 + var15Lifetime1;
          }
          if (param0 < qn.field_j) {
            var15Lifetime2 = qn.field_j - param0;
            param2 = param2 - var15Lifetime2;
            var13Lifetime2 = var13Lifetime2 + var15Lifetime2;
            var7 = var7 + var11 * var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          wk.b(qn.field_d, this.field_B, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
          return;
        }
    }

    final void d(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var14 = 0;
        int var16 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        if (param2 > 0) {
          if (param3 <= 0) {
            return;
          }
          var6 = this.field_y;
          var7 = this.field_v;
          var8 = 0;
          var9 = 0;
          var10 = this.field_A;
          var11 = this.field_x;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
          if (this.field_w > 0) {
            var14 = ((this.field_w << 16) + var12 - 1) / var12;
            param0 = param0 + var14;
            var8 = var8 + (var14 * var12 - (this.field_w << 16));
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
          var14Lifetime2 = param0 + param1 * qn.field_l;
          var15 = qn.field_l - param2;
          if (param1 + param3 > qn.field_f) {
            param3 = param3 - (param1 + param3 - qn.field_f);
          }
          if (param1 < qn.field_a) {
            var16 = qn.field_a - param1;
            param3 = param3 - var16;
            var14Lifetime2 = var14Lifetime2 + var16 * qn.field_l;
            var9 = var9 + var13 * var16;
          }
          if (param0 + param2 > qn.field_e) {
            var16Lifetime1 = param0 + param2 - qn.field_e;
            param2 = param2 - var16Lifetime1;
            var15 = var15 + var16Lifetime1;
          }
          if (param0 < qn.field_j) {
            var16Lifetime2 = qn.field_j - param0;
            param2 = param2 - var16Lifetime2;
            var14Lifetime2 = var14Lifetime2 + var16Lifetime2;
            var8 = var8 + var12 * var16Lifetime2;
            var15 = var15 + var16Lifetime2;
          }
          if (param4 == 256) {
            wk.a(0, 0, 0, var8, this.field_B, qn.field_d, 0, 0, -param3, var9, var14Lifetime2, var15, param2, var12, var13, var6);
          } else {
            wk.a(0, 0, 0, var8, this.field_B, qn.field_d, 0, 0, -param3, var9, var14Lifetime2, var15, param2, var12, var13, var6, param4);
          }
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final void f() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.field_y * this.field_v];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = this.field_y - 1; var3 >= 0; var3--) {
          for (var4 = 0; var4 < this.field_v; var4++) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_B[var3 + var4 * this.field_y];
          }
        }
        this.field_B = var1;
        var3Lifetime1 = this.field_w;
        this.field_w = this.field_z;
        this.field_z = this.field_A - this.field_y - var3Lifetime1;
        var3Lifetime2 = this.field_v;
        this.field_v = this.field_y;
        this.field_y = var3Lifetime2;
        var3Lifetime3 = this.field_x;
        this.field_x = this.field_A;
        this.field_A = var3Lifetime3;
    }

    private final static void c(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        int var9;
        int var11;
        int var11Lifetime1;
        var9 = -(param5 >> 2);
        param5 = -(param5 & 3);
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = var9; var11 < 0; var11++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          for (var11Lifetime1 = param5; var11Lifetime1 < 0; var11Lifetime1++) {
            if (param1[param3++] == 0) {
              param4++;
            } else {
              param0[param4++] = param2;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    void g(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param2 == 256) {
          this.g(param0, param1);
          return;
        }
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          wk.b(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int incrementValue$0 = 0;
        int var17 = param3;
        while (param8 < 0) {
          param7 = (param9 >> 16) * param15;
          for (param6 = -param12; param6 < 0; param6++) {
            param0 = param4[(param3 >> 16) + param7];
            if (param0 != 0) {
              param1 = (param0 & 16711935) * param16;
              param0 = (param1 & -16711936) + (param0 * param16 - param1 & 16711680) >>> 8;
              param1 = param5[param10];
              param2 = param0 + param1;
              param0 = (param0 & 16711935) + (param1 & 16711935);
              param1 = (param0 & 16777472) + (param2 - param0 & 65536);
              incrementValue$0 = param10;
              param10++;
              param5[incrementValue$0] = param2 - param1 | param1 - (param1 >>> 8);
            } else {
              param10++;
            }
            param3 = param3 + param13;
          }
          param9 = param9 + param14;
          param3 = var17;
          param10 = param10 + param11;
          param8++;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        for (var8 = -param5; var8 < 0; var8++) {
          var9 = param3 + param4 - 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
            param0[param3++] = param1[param2++];
          }
          var9 += 3;
          while (param3 < var9) {
            param0[param3++] = param1[param2++];
          }
          param3 = param3 + param6;
          param2 = param2 + param7;
        }
    }

    final wk g() {
        int var3 = 0;
        wk var1 = new wk(this.field_y, this.field_v);
        var1.field_A = this.field_A;
        var1.field_x = this.field_x;
        var1.field_w = this.field_w;
        var1.field_z = this.field_z;
        int var2 = this.field_B.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_B[var3] = this.field_B[var3];
        }
        return var1;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int incrementValue$0 = 0;
        int var17 = 0;
        int var13 = param3;
        for (var14 = -param8; var14 < 0; var14++) {
          var15 = (param4 >> 16) * param11;
          for (var16 = -param7; var16 < 0; var16++) {
            param2 = param1[(param3 >> 16) + var15];
            if (param2 != 0) {
              var17 = (param2 & 16711935) * param12 & -16711936;
              var18 = (param2 & 65280) * param12 & 16711680;
              incrementValue$0 = param5;
              param5++;
              param0[incrementValue$0] = (var17 | var18) >>> 8;
            } else {
              param5++;
            }
            param3 = param3 + param9;
          }
          param4 = param4 + param10;
          param3 = var13;
          param5 = param5 + param6;
        }
    }

    final wk e() {
        int var2 = 0;
        int var3 = 0;
        wk var1 = new wk(this.field_y, this.field_v);
        var1.field_A = this.field_A;
        var1.field_x = this.field_x;
        var1.field_w = this.field_A - this.field_y - this.field_w;
        var1.field_z = this.field_z;
        for (var2 = 0; var2 < this.field_v; var2++) {
          for (var3 = 0; var3 < this.field_y; var3++) {
            var1.field_B[var2 * this.field_y + var3] = this.field_B[var2 * this.field_y + this.field_y - 1 - var3];
          }
        }
        return var1;
    }

    wk(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_A = param0;
        this.field_x = param1;
        this.field_w = param2;
        this.field_z = param3;
        this.field_y = param4;
        this.field_v = param5;
        this.field_B = param6;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int incrementValue$12 = 0;
        int var12;
        int var13;
        for (var10 = -param6; var10 < 0; var10++) {
          for (var11 = -param5; var11 < 0; var11++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var12 = (param2 & 16711935) * param9 & -16711936;
              var13 = (param2 & 65280) * param9 & 16711680;
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var12 | var13) >>> 8;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    void e(int param0, int param1, int param2) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var4 = param0 + param1 * qn.field_l;
        int var5 = 0;
        int var6 = this.field_v;
        int var7 = this.field_y;
        int var8 = qn.field_l - var7;
        int var9 = 0;
        if (param1 < qn.field_a) {
          var10 = qn.field_a - param1;
          var6 = var6 - var10;
          param1 = qn.field_a;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * qn.field_l;
        }
        if (param1 + var6 > qn.field_f) {
          var6 = var6 - (param1 + var6 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var10Lifetime1 = qn.field_j - param0;
          var7 = var7 - var10Lifetime1;
          param0 = qn.field_j;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param0 + var7 > qn.field_e) {
          var10Lifetime2 = param0 + var7 - qn.field_e;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          wk.c(qn.field_d, this.field_B, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    void c(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + (this.field_x - this.field_v - this.field_z);
        int var3 = param0 + (param1 + this.field_v - 1) * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = -qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
          var5 = var5 - (qn.field_a - param1);
          param1 = qn.field_a;
        }
        if (param1 + var5 > qn.field_f) {
          var9 = param1 + var5 - qn.field_f;
          var5 = var5 - var9;
          var3 = var3 - var9 * qn.field_l;
          var4 = var4 + var9 * var6;
        }
        if (param0 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qn.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qn.field_e) {
          var9Lifetime2 = param0 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          wk.a(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    wk(int param0, int param1) {
        this.field_B = new int[param0 * param1];
        this.field_A = param0;
        this.field_y = param0;
        this.field_x = param1;
        this.field_v = param1;
        this.field_z = 0;
        this.field_w = 0;
    }

    wk(byte[] param0, java.awt.Component param1) {
        Throwable decompiledCaughtException = null;
        java.awt.Image var3 = null;
        InterruptedException var3_ref = null;
        java.awt.MediaTracker var4 = null;
        java.awt.image.PixelGrabber var5 = null;
        try {
          var3 = java.awt.Toolkit.getDefaultToolkit().createImage(param0);
          var4 = new java.awt.MediaTracker(param1);
          var4.addImage(var3, 0);
          var4.waitForAll();
          this.field_y = var3.getWidth((java.awt.image.ImageObserver) ((Object) param1));
          this.field_v = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.field_A = this.field_y;
          this.field_x = this.field_v;
          this.field_w = 0;
          this.field_z = 0;
          this.field_B = new int[this.field_y * this.field_v];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.field_y, this.field_v, this.field_B, 0, this.field_y);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        boolean stackIn_11_0 = false;
        param2 = param2 - (param0 + this.field_w);
        if (param2 < 0) {
          return false;
        }
        if (param2 >= this.field_y) {
          return false;
        }
        param3 = param3 - (param1 + this.field_z);
        if (param3 >= 0 &&
          param3 < this.field_v) {
          stackIn_11_0 = (this.field_B[param3 * this.field_y + param2] != 0);
          return stackIn_11_0;
        }
        return false;
    }

    void g(int param0, int param1) {
        int var9 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        param0 = param0 + this.field_w;
        param1 = param1 + this.field_z;
        int var3 = param0 + param1 * qn.field_l;
        int var4 = 0;
        int var5 = this.field_v;
        int var6 = this.field_y;
        int var7 = qn.field_l - var6;
        int var8 = 0;
        if (param1 < qn.field_a) {
          var9 = qn.field_a - param1;
          var5 = var5 - var9;
          param1 = qn.field_a;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * qn.field_l;
        }
        if (param1 + var5 > qn.field_f) {
          var5 = var5 - (param1 + var5 - qn.field_f);
        }
        if (param0 < qn.field_j) {
          var9Lifetime1 = qn.field_j - param0;
          var6 = var6 - var9Lifetime1;
          param0 = qn.field_j;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param0 + var6 > qn.field_e) {
          var9Lifetime2 = param0 + var6 - qn.field_e;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          wk.a(qn.field_d, this.field_B, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }
}
