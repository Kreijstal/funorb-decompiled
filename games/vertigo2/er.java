/*
 * Decompiled by CFR-JS 0.4.0.
 */
class er extends fb {
    int[] field_F;

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
            var11 = bi.field_l[param2] & 16711935;
            var12 = bi.field_l[param2] & 65280;
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
            bi.field_l[incrementValue$4] = (var13 & 66847740 | var14 & 261120) >> 2;
            var9++;
            param1 += 2;
          }
          var8++;
          param1 = param1 + param3;
          param2 = param2 + param4;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    void d(int param0, int param1, int param2) {
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          if (param2 == 256) {
            er.a(0, 0, 0, bi.field_l, this.field_F, var5, 0, var4, 0, var7, var6, var8, var9);
          } else {
            er.a(0, 0, 0, bi.field_l, this.field_F, var5, 0, var4, 0, var7, var6, var8, var9, param2);
          }
          return;
        }
    }

    void b(int param0, int param1) {
        param0 = param0 + (this.field_C >> 1);
        param1 = param1 + (this.field_z >> 1);
        int var3 = param0 < bi.field_d ? bi.field_d - param0 << 1 : 0;
        int var4 = param0 + (this.field_y >> 1) > bi.field_i ? bi.field_i - param0 << 1 : this.field_y;
        int var5 = param1 < bi.field_f ? bi.field_f - param1 << 1 : 0;
        int var6 = param1 + (this.field_t >> 1) > bi.field_c ? bi.field_c - param1 << 1 : this.field_t;
        er.a(this.field_F, var5 * this.field_y + var3, (param1 + (var5 >> 1)) * bi.field_e + (param0 + (var3 >> 1)), (this.field_y << 1) - (var4 - var3) + (this.field_y & 1), bi.field_e - (var4 - var3 >> 1), this.field_y, var4 - var3 >> 1, var6 - var5 >> 1);
    }

    final void b() {
        int var4 = 0;
        int incrementValue$0 = 0;
        int var3 = 0;
        int[] var1 = new int[this.field_y * this.field_t];
        int var2 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        for (var3 = 0; var3 < this.field_y; var3++) {
          for (var4 = this.field_t - 1; var4 >= 0; var4--) {
            incrementValue$0 = var2;
            var2++;
            var1[incrementValue$0] = this.field_F[var3 + var4 * this.field_y];
          }
        }
        this.field_F = var1;
        var3Lifetime1 = this.field_z;
        this.field_z = this.field_C;
        this.field_C = this.field_B - this.field_t - var3Lifetime1;
        var3Lifetime2 = this.field_t;
        this.field_t = this.field_y;
        this.field_y = var3Lifetime2;
        var3Lifetime3 = this.field_B;
        this.field_B = this.field_x;
        this.field_x = var3Lifetime3;
    }

    void c(int param0, int param1, int param2) {
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          er.a(bi.field_l, this.field_F, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
        }
    }

    final void d() {
        bi.a(this.field_F, this.field_y, this.field_t);
    }

    final void b(int param0, int param1, int param2, int param3) {
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
        if (param2 <= this.field_x &&
          param3 <= this.field_B) {
          var5 = param0 + this.field_C * param2 / this.field_x;
          var6 = param0 + ((this.field_C + this.field_y) * param2 + this.field_x - 1) / this.field_x;
          var7 = param1 + this.field_z * param3 / this.field_B;
          var8 = param1 + ((this.field_z + this.field_t) * param3 + this.field_B - 1) / this.field_B;
          if (var5 < bi.field_d) {
            var5 = bi.field_d;
          }
          if (var6 > bi.field_i) {
            var6 = bi.field_i;
          }
          if (var7 < bi.field_f) {
            var7 = bi.field_f;
          }
          if (var8 > bi.field_c) {
            var8 = bi.field_c;
          }
          if (var5 >= var6) {
            return;
          }
          if (var7 >= var8) {
            return;
          }
          var9 = var7 * bi.field_e + var5;
          var10 = bi.field_e - (var6 - var5);
          for (var11 = var7; var11 < var8; var11++) {
            for (var12 = var5; var12 < var6; var12++) {
              var13 = var12 - param0 << 4;
              var14 = var11 - param1 << 4;
              var15 = var13 * this.field_x / param2 - (this.field_C << 4);
              var16 = (var13 + 16) * this.field_x / param2 - (this.field_C << 4);
              var17 = var14 * this.field_B / param3 - (this.field_z << 4);
              var18 = (var14 + 16) * this.field_B / param3 - (this.field_z << 4);
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
                if (var18 > this.field_t << 4) {
                  var18 = this.field_t << 4;
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
                    var31 = this.field_F[var28 * this.field_y + var30];
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
                  bi.field_l[var9] = var28Lifetime1;
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

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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

    void c(int param0, int param1) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          er.a(bi.field_l, this.field_F, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void g(int param0, int param1) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          er.a(bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
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
            var7 = this.field_F[var6];
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
            var8 = this.field_F[var6 + 1];
            if (var8 == 0) {
              stackIn_11_0 = 0;
            } else {
              stackIn_11_0 = param3 * (4096 - param4);
            }
            var12 = stackIn_11_0;
          }
        }
        if (param2 >= this.field_t - 1) {
          var14 = 0;
          var13 = 0;
          var10 = 0;
          var9 = 0;
        } else {
          if (param1 < 0) {
            var13 = 0;
            var9 = 0;
          } else {
            var9 = this.field_F[var6 + this.field_y];
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
            var10 = this.field_F[var6 + this.field_y + 1];
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
          bi.field_l[param0] = var18;
        } else {
          var16 = (var7 & 16711935) * var11 + (var8 & 16711935) * var12;
          var16 = var16 + ((var9 & 16711935) * var13 + (var10 & 16711935) * var14);
          var17 = (var7 & 65280) * var11 + (var8 & 65280) * var12;
          var17 = var17 + ((var9 & 65280) * var13 + (var10 & 65280) * var14);
          var18 = (var16 >>> 8 & 16711935) + (var17 >>> 8 & 65280);
          if (var18 == 0) {
            var18 = 1;
          }
          bi.field_l[param0] = var18;
        }
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

    void e(int param0, int param1) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          er.a(bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    void a(int param0, int param1, int param2) {
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          er.b(bi.field_l, this.field_F, 0, var5, var4, var7, var6, var8, var9, param2);
          return;
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

    void a(int param0, int param1, int param2, int param3, int param4) {
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
          var7 = this.field_t;
          var8 = 0;
          var9 = 0;
          var10 = this.field_x;
          var11 = this.field_B;
          var12 = (var10 << 16) / param2;
          var13 = (var11 << 16) / param3;
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
          var15 = bi.field_e - param2;
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
          er.a(bi.field_l, this.field_F, 0, var8, var9, var14Lifetime2, var15, param2, param3, var12, var13, var6, param4);
          return;
        }
    }

    final er a() {
        int var2 = 0;
        int var3 = 0;
        er var1 = new er(this.field_y, this.field_t);
        var1.field_x = this.field_x;
        var1.field_B = this.field_B;
        var1.field_C = this.field_x - this.field_y - this.field_C;
        var1.field_z = this.field_z;
        for (var2 = 0; var2 < this.field_t; var2++) {
          for (var3 = 0; var3 < this.field_y; var3++) {
            var1.field_F[var2 * this.field_y + var3] = this.field_F[var2 * this.field_y + this.field_y - 1 - var3];
          }
        }
        return var1;
    }

    void d(int param0, int param1) {
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
        for (var9 = var7; var9 <= var8; var9 += 4) {
          var10 = var9 * this.field_y + var5;
          var11 = (param1 + (var9 >> 2)) * bi.field_e + (param0 + (var5 >> 2));
          var12 = var5;
          while (var12 <= var6) {
            var13 = 0;
            var14 = 0;
            var15 = 0;
            for (var16 = 0; var16 < 4; var16++) {
              for (var17 = 0; var17 < 4; var17++) {
                var13Lifetime1 = this.field_F[var10 + var16 * this.field_y + var17];
                if (var13Lifetime1 == 0) {
                  var13Lifetime1 = bi.field_l[var11];
                }
                var14 = var14 + (var13Lifetime1 & 16711935);
                var15 = var15 + (var13Lifetime1 & 65280);
              }
            }
            bi.field_l[var11] = (var14 & 267390960 | var15 & 1044480) >> 4;
            var12 += 4;
            var10 += 4;
            var11++;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
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
        if (var7 > 0) {
          if (var6 <= 0) {
            return;
          }
          er.b(bi.field_l, this.field_F, param2, var5, var4, var7, var6, var8, var9);
          return;
        }
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
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

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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

    void a(int param0, int param1, int param2, int param3) {
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
          var6 = this.field_t;
          var7 = 0;
          var8 = 0;
          var9 = this.field_x;
          var10 = this.field_B;
          var11 = (var9 << 16) / param2;
          var12 = (var10 << 16) / param3;
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
          var14 = bi.field_e - param2;
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
          er.a(bi.field_l, this.field_F, 0, var7, var8, var13Lifetime2, var14, param2, param3, var11, var12, var5);
          return;
        }
    }

    final er c() {
        int var3 = 0;
        er var1 = new er(this.field_y, this.field_t);
        var1.field_x = this.field_x;
        var1.field_B = this.field_B;
        var1.field_C = this.field_C;
        var1.field_z = this.field_z;
        int var2 = this.field_F.length;
        for (var3 = 0; var3 < var2; var3++) {
          var1.field_F[var3] = this.field_F[var3];
        }
        return var1;
    }

    final void f(int param0, int param1) {
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
        if (var6 > 0) {
          if (var5 <= 0) {
            return;
          }
          er.a(0, bi.field_l, this.field_F, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
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
        param0 = param0 - (this.field_C << 4);
        param1 = param1 - (this.field_z << 4);
        var7 = (double)(param4 & 65535) * 0.00009587379924285257;
        var9 = (int)Math.floor(Math.sin(var7) * (double)param5 + 0.5);
        var10 = (int)Math.floor(Math.cos(var7) * (double)param5 + 0.5);
        var11 = -param0 * var10 + -param1 * var9;
        var12 = -(-param0) * var9 + -param1 * var10;
        var13 = ((this.field_y << 4) - param0) * var10 + -param1 * var9;
        var14 = -((this.field_y << 4) - param0) * var9 + -param1 * var10;
        var15 = -param0 * var10 + ((this.field_t << 4) - param1) * var9;
        var16 = -(-param0) * var9 + ((this.field_t << 4) - param1) * var10;
        var17 = ((this.field_y << 4) - param0) * var10 + ((this.field_t << 4) - param1) * var9;
        var18 = -((this.field_y << 4) - param0) * var9 + ((this.field_t << 4) - param1) * var10;
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
        if (var19 < bi.field_d) {
          var19 = bi.field_d;
        }
        if (var20 > bi.field_i) {
          var20 = bi.field_i;
        }
        if (var21 < bi.field_f) {
          var21 = bi.field_f;
        }
        if (var22 > bi.field_c) {
          var22 = bi.field_c;
        }
        var20 = var19 - var20;
        if (var20 >= 0) {
          return;
        }
        var22 = var21 - var22;
        if (var22 >= 0) {
          return;
        }
        var23 = var21 * bi.field_e + var19;
        var24 = bi.field_e + var20;
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
                      if (var38 >> 12 < this.field_t) {
                        this.b(var23, var33, var34, var37, var38);
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
              var35Lifetime3Lifetime1 = var38Lifetime3 - (this.field_t << 12);
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
                      this.b(var23, var33Lifetime3, var34Lifetime3, var37Lifetime3, var38Lifetime3);
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
                    if (var38Lifetime1 >> 12 < this.field_t) {
                      var33Lifetime1 = var37Lifetime1 >> 12;
                      this.b(var23, var33Lifetime1, var34Lifetime1, var37Lifetime1, var38Lifetime1);
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
            var35Lifetime2Lifetime1 = var38Lifetime2 - (this.field_t << 12);
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
                  this.b(var23, var33Lifetime2, var34Lifetime2, var37Lifetime2, var38Lifetime2);
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

    er(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        this.field_x = param0;
        this.field_B = param1;
        this.field_C = param2;
        this.field_z = param3;
        this.field_y = param4;
        this.field_t = param5;
        this.field_F = param6;
    }

    er(int param0, int param1) {
        this.field_F = new int[param0 * param1];
        this.field_x = param0;
        this.field_y = param0;
        this.field_B = param1;
        this.field_t = param1;
        this.field_z = 0;
        this.field_C = 0;
    }

    er(byte[] param0, java.awt.Component param1) {
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
          this.field_t = var3.getHeight((java.awt.image.ImageObserver) ((Object) param1));
          this.field_x = this.field_y;
          this.field_B = this.field_t;
          this.field_C = 0;
          this.field_z = 0;
          this.field_F = new int[this.field_y * this.field_t];
          var5 = new java.awt.image.PixelGrabber(var3, 0, 0, this.field_y, this.field_t, this.field_F, 0, this.field_y);
          var5.grabPixels();
        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (InterruptedException) (Object) decompiledCaughtException;
        }
    }
}
