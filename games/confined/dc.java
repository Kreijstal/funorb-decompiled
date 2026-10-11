/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dc extends jl {
    double field_y;
    private int field_db;
    private int field_E;
    double field_x;
    int field_G;
    int field_w;
    double field_K;
    private int field_v;
    double field_X;
    double field_cb;
    static String field_M;
    double field_ab;
    private int field_U;
    double field_L;
    pm field_T;
    double field_s;
    int field_N;
    private int field_Z;
    double field_P;
    double field_eb;
    double field_D;
    nm field_Q;
    double field_A;
    double field_B;
    double field_bb;
    static String field_J;
    double field_F;
    private int field_O;
    double field_R;
    double field_C;
    pm field_S;
    boolean field_V;
    int field_H;
    int field_t;
    double field_I;
    double field_u;
    int field_z;
    double field_Y;

    double a(double param0, byte param1) {
        if (param1 >= -2) {
          dc.d(-51);
        }
        return 0.0;
    }

    final void a(int param0, int param1) {
        if (param1 > -39) {
          this.field_S = (pm) null;
        }
        this.a(true, 0, param0);
    }

    void a(int param0, int param1, int param2, int param3) {
        int localTemp$2 = 0;
        int localTemp$0 = 0;
        int localTemp$1 = 0;
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
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var25Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        int var29Lifetime1;
        int var29Lifetime2;
        int var30Lifetime1;
        int var30Lifetime2;
        int var20Lifetime1Lifetime1;
        int var20Lifetime1Lifetime2;
        int var21Lifetime1Lifetime1;
        int var21Lifetime1Lifetime2;
        int var21Lifetime1Lifetime3;
        int var22Lifetime1Lifetime1;
        int var22Lifetime1Lifetime2;
        int var22Lifetime1Lifetime3;
        var31 = Confined.field_J ? 1 : 0;
        if (!this.field_V) {
          return;
        }
        var5 = 6016;
        var6 = 0;
        var7 = 10240;
        var8 = 0;
        var9 = ((-this.field_G + this.field_t) * param1 >> 16) + this.field_G;
        var10 = (param1 * (this.field_w - this.field_z) >> 16) + this.field_z;
        var11 = this.field_v + ((-this.field_v + this.field_E) * param1 >> 16);
        var12 = (param3 * (-this.field_G + this.field_t) >> 16) + this.field_G;
        var13 = ((-this.field_z + this.field_w) * param3 >> 16) + this.field_z;
        var14 = ((-this.field_v + this.field_E) * param3 >> 16) + this.field_v;
        var15 = var9 - (this.field_Z * var11 >> 16);
        var16 = -(this.field_db * var11 >> 16) + var10;
        var17 = var9 + (var11 * this.field_Z >> 16);
        var18 = (var11 * this.field_db >> 16) + var10;
        var19 = -(var14 * this.field_Z >> 16) + var12;
        var20 = -(var14 * this.field_db >> 16) + var13;
        if (param2 != -14936) {
          this.field_V = false;
        }
        var21 = var12 + (this.field_Z * var14 >> 16);
        if (var7 > var15) {
          var7 = var15;
        }
        if (var8 <= var15) {
          var8 = var15 + 1;
        }
        var22 = var13 + (this.field_db * var14 >> 16);
        if (var7 > var17) {
          var7 = var17;
        }
        if (var17 >= var8) {
          var8 = 1 + var17;
        }
        if (var19 >= var8) {
          var8 = var19 + 1;
        }
        if (var19 < var7) {
          var7 = var19;
        }
        if (var16 < var5) {
          var5 = var16;
        }
        if (var7 > var21) {
          var7 = var21;
        }
        if (var16 >= var6) {
          var6 = var16 + 1;
        }
        if (var8 <= var21) {
          var8 = var21 + 1;
        }
        if (var18 < var5) {
          var5 = var18;
        }
        if (var18 >= var6) {
          var6 = 1 + var18;
        }
        if (var20 < var5) {
          var5 = var20;
        }
        if (var6 <= var20) {
          var6 = var20 + 1;
        }
        if (var22 < var5) {
          var5 = var22;
        }
        if (var22 >= var6) {
          var6 = var22 + 1;
        }
        var7 = var7 >> 4;
        var6 = var6 + 15 >> 4;
        var5 = var5 >> 4;
        var8 = 15 + var8 >> 4;
        if (var7 < 0) {
          var7 = 0;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var6 > 376) {
          var6 = 376;
        }
        if (var8 > 640) {
          var8 = 640;
        }
        var7 = var7 << 4;
        var9Lifetime1 = 640 * var5;
        var5 = var5 << 4;
        param3 = param3 << 12;
        var8 = var8 << 4;
        var6 = var6 << 4;
        param1 = param1 << 12;
        var10Lifetime1 = (param0 * (65280 & this.field_H) & 16711680) + ((16711935 & this.field_H) * param0 & -16711936) >> 8;
        var11Lifetime1 = var5;
        while (true) {
          if (var6 <= var11Lifetime1) {
            return;
          }
          var12Lifetime1 = var7;
          var13Lifetime1 = var8;
          var14Lifetime1 = (-this.field_z + var11Lifetime1) * this.field_O + this.field_U * (var7 - this.field_G) >> 12;
          var15Lifetime1 = ((this.field_E - this.field_v) * var14Lifetime1 >> 8) + (this.field_v << 8);
          var16Lifetime1 = (var11Lifetime1 - this.field_z) * this.field_db + this.field_Z * (var7 - this.field_G);
          if (var15Lifetime1 >= 1) {
            var16Lifetime1 = var16Lifetime1 / var15Lifetime1;
          }
          var17Lifetime1 = (var11Lifetime1 - this.field_z) * this.field_O + (var8 - this.field_G) * this.field_U >> 12;
          var18Lifetime1 = (this.field_v << 8) + (var17Lifetime1 * (-this.field_v + this.field_E) >> 8);
          var19Lifetime1 = this.field_Z * (var8 - this.field_G) + this.field_db * (-this.field_z + var11Lifetime1);
          if (var18Lifetime1 >= 1) {
            var19Lifetime1 = var19Lifetime1 / var18Lifetime1;
          }
          if (var16Lifetime1 < 0 &&
            var19Lifetime1 > 0) {
            while (var13Lifetime1 > var12Lifetime1 + 64) {
              var20Lifetime1 = (-31 & var13Lifetime1 + var12Lifetime1) >> 1;
              var21Lifetime1 = (-this.field_z + var11Lifetime1) * this.field_O + this.field_U * (var20Lifetime1 - this.field_G) >> 12;
              var22Lifetime1 = (var21Lifetime1 * (-this.field_v + this.field_E) >> 8) + (this.field_v << 8);
              var23 = this.field_Z * (var20Lifetime1 - this.field_G) + this.field_db * (-this.field_z + var11Lifetime1);
              if (var22Lifetime1 >= 1) {
                var23 = var23 / var22Lifetime1;
              }
              if (var23 > 0) {
                var13Lifetime1 = var20Lifetime1;
                continue;
              }
              var12Lifetime1 = var20Lifetime1;
            }
          } else if (var16Lifetime1 > 0 &&
            var19Lifetime1 < 0) {
            while (var13Lifetime1 > 64 + var12Lifetime1) {
              var20Lifetime1 = (-31 & var12Lifetime1 + var13Lifetime1) >> 1;
              var21Lifetime1 = (-this.field_z + var11Lifetime1) * this.field_O + (var20Lifetime1 - this.field_G) * this.field_U >> 12;
              var22Lifetime1 = ((-this.field_v + this.field_E) * var21Lifetime1 >> 8) + (this.field_v << 8);
              var23 = this.field_db * (-this.field_z + var11Lifetime1) + (-this.field_G + var20Lifetime1) * this.field_Z;
              if (1 <= var22Lifetime1) {
                var23 = var23 / var22Lifetime1;
              }
              if (0 <= var23) {
                var12Lifetime1 = var20Lifetime1;
                continue;
              }
              var13Lifetime1 = var20Lifetime1;
            }
          } else if (var16Lifetime1 >= 0 &&
            0 <= var19Lifetime1) {
            if (var19Lifetime1 >= var16Lifetime1) {
              var13Lifetime1 = var7;
            } else {
              var12Lifetime1 = var8;
            }
          } else {
            if (var16Lifetime1 < var19Lifetime1) {
              var12Lifetime1 = var8;
            } else {
              var13Lifetime1 = var7;
            }
          }
          var20Lifetime1Lifetime1 = var9Lifetime1 + (var12Lifetime1 >> 4);
          for (var21Lifetime1Lifetime1 = var12Lifetime1; var13Lifetime1 > var21Lifetime1Lifetime1; var21Lifetime1Lifetime1 += 16) {
            boolean decompiledFrameRemainder0 = true;
            var22Lifetime1Lifetime1 = this.field_U * (-this.field_G + var21Lifetime1Lifetime1) + (var11Lifetime1 - this.field_z) * this.field_O;
            if (var22Lifetime1Lifetime1 >= param1 &&
              param3 > var22Lifetime1Lifetime1) {
              var22Lifetime1Lifetime1 = var22Lifetime1Lifetime1 >> 12;
              var23Lifetime1 = (this.field_v << 8) + ((-this.field_v + this.field_E) * var22Lifetime1Lifetime1 >> 8);
              if (var23Lifetime1 > 0) {
                var24 = ((-this.field_z + var11Lifetime1) * this.field_db + this.field_Z * (var21Lifetime1Lifetime1 - this.field_G)) / var23Lifetime1;
                if (var24 < 256) {
                  if (0 > var24) {
                    localTemp$2 = -var24;
                    var24 = localTemp$2;
                    decompiledFrameRemainder0 = !(256 <= localTemp$2);
                  }
                  if (decompiledFrameRemainder0) {
                    var25 = -var24 + 256;
                    var26 = fn.field_h[var20Lifetime1Lifetime1];
                    var27 = (16711935 & var26) + (var25 * (var10Lifetime1 & 16711935) >>> 8 & -1895890689);
                    var28 = (16711935 & var27 >>> 8) * 255;
                    var27 = 16711935 & (var28 | var27);
                    var29 = (var26 & 65280) + (2063662848 & var25 * (65280 & var10Lifetime1) >>> 8);
                    var30 = 255 * (var29 >>> 8 & 65280);
                    var29 = (var30 | var29) & 65280;
                    fn.field_h[var20Lifetime1Lifetime1] = nl.a(var29, var27);
                  }
                }
              }
            }
            var20Lifetime1Lifetime1++;
          }
          var21Lifetime1Lifetime2 = var13Lifetime1;
          L34: while (true) {
            if (var21Lifetime1Lifetime2 < var8) {
              var22Lifetime1Lifetime2 = this.field_U * (-this.field_G + var21Lifetime1Lifetime2) + this.field_O * (-this.field_z + var11Lifetime1);
              if (var22Lifetime1Lifetime2 >= param1 &&
                param3 > var22Lifetime1Lifetime2) {
                var22Lifetime1Lifetime2 = var22Lifetime1Lifetime2 >> 12;
                var23Lifetime2 = (this.field_v << 8) + (var22Lifetime1Lifetime2 * (this.field_E - this.field_v) >> 8);
                if (var23Lifetime2 <= 0) {
                  break L34;
                }
                var24Lifetime1 = (this.field_Z * (var21Lifetime1Lifetime2 - this.field_G) + this.field_db * (var11Lifetime1 - this.field_z)) / var23Lifetime2;
                if (256 <= var24Lifetime1) {
                  break L34;
                }
                if (0 > var24Lifetime1) {
                  localTemp$0 = -var24Lifetime1;
                  var24Lifetime1 = localTemp$0;
                  if (localTemp$0 >= 256) {
                    break L34;
                  }
                }
                var25Lifetime1 = -var24Lifetime1 + 256;
                var26Lifetime1 = fn.field_h[var20Lifetime1Lifetime1];
                var27Lifetime1 = ((var10Lifetime1 & 16711935) * var25Lifetime1 >>> 8 & -1593900801) + (var26Lifetime1 & 16711935);
                var28Lifetime1 = (16711935 & var27Lifetime1 >>> 8) * 255;
                var27Lifetime1 = 16711935 & (var27Lifetime1 | var28Lifetime1);
                var29Lifetime1 = ((var10Lifetime1 & 65280) * var25Lifetime1 >>> 8 & -1392443648) + (65280 & var26Lifetime1);
                var30Lifetime1 = 255 * ((var29Lifetime1 & 16711680) >>> 8);
                var29Lifetime1 = 65280 & (var29Lifetime1 | var30Lifetime1);
                fn.field_h[var20Lifetime1Lifetime1] = nl.a(var27Lifetime1, var29Lifetime1);
              }
              var20Lifetime1Lifetime1++;
              var21Lifetime1Lifetime2 += 16;
              continue;
            }
            break;
          }
          var20Lifetime1Lifetime2 = var9Lifetime1 + (var12Lifetime1 >> 4);
          var9Lifetime1 += 640;
          var21Lifetime1Lifetime3 = -16 + var12Lifetime1;
          L38: while (true) {
            if (var21Lifetime1Lifetime3 >= var7) {
              var20Lifetime1Lifetime2--;
              var22Lifetime1Lifetime3 = this.field_O * (-this.field_z + var11Lifetime1) + (-this.field_G + var21Lifetime1Lifetime3) * this.field_U;
              if (var22Lifetime1Lifetime3 >= param1 &&
                var22Lifetime1Lifetime3 < param3) {
                var22Lifetime1Lifetime3 = var22Lifetime1Lifetime3 >> 12;
                var23Lifetime3 = ((this.field_E - this.field_v) * var22Lifetime1Lifetime3 >> 8) + (this.field_v << 8);
                if (var23Lifetime3 <= 0) {
                  break L38;
                }
                var24Lifetime2 = (this.field_Z * (-this.field_G + var21Lifetime1Lifetime3) + (var11Lifetime1 - this.field_z) * this.field_db) / var23Lifetime3;
                if (256 <= var24Lifetime2) {
                  break L38;
                }
                if (var24Lifetime2 < 0) {
                  localTemp$1 = -var24Lifetime2;
                  var24Lifetime2 = localTemp$1;
                  if (localTemp$1 >= 256) {
                    break L38;
                  }
                }
                var25Lifetime2 = 256 - var24Lifetime2;
                var26Lifetime2 = fn.field_h[var20Lifetime1Lifetime2];
                var27Lifetime2 = ((-16711840 & (16711935 & var10Lifetime1) * var25Lifetime2) >>> 8) + (var26Lifetime2 & 16711935);
                var28Lifetime2 = 255 * (var27Lifetime2 >>> 8 & 16711935);
                var27Lifetime2 = 16711935 & (var27Lifetime2 | var28Lifetime2);
                var29Lifetime2 = (65280 & var26Lifetime2) + ((65280 & var10Lifetime1) * var25Lifetime2 >>> 8 & -687800576);
                var30Lifetime2 = 255 * (65280 & var29Lifetime2 >>> 8);
                var29Lifetime2 = (var30Lifetime2 | var29Lifetime2) & 65280;
                fn.field_h[var20Lifetime1Lifetime2] = nl.a(var27Lifetime2, var29Lifetime2);
              }
              var21Lifetime1Lifetime3 -= 16;
              continue;
            }
            break;
          }
          var11Lifetime1 += 16;
        }
    }

    final boolean a(vg param0, int param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1073453180) {
            this.field_R = -0.7434725409770379;
          }
          if (this.field_eb >= this.field_X) {
            var3_double = this.field_cb;
            var9 = this.field_R;
            var11 = this.field_s;
            var13 = this.field_eb;
            var5 = this.field_L;
            var7 = this.field_X;
          } else {
            var9 = this.field_cb;
            var3_double = this.field_R;
            var7 = this.field_eb;
            var5 = this.field_s;
            var13 = this.field_X;
            var11 = this.field_L;
          }
          var15 = var7;
          var9 = var9 - param0.field_T;
          var3_double = var3_double - param0.field_T;
          var11 = var11 - param0.field_L;
          var7 = var7 - param0.field_O;
          var17 = var13;
          var5 = var5 - param0.field_L;
          var13 = var13 - param0.field_O;
          var19 = var7 * param0.field_M + (param0.field_R * var3_double + var5 * param0.field_ab);
          var21 = var7 * param0.field_F + (param0.field_V * var3_double + var5 * param0.field_U);
          var23 = var7 * param0.field_N + (var5 * param0.field_H + param0.field_P * var3_double);
          var25 = param0.field_R * var9 + param0.field_ab * var11 + param0.field_M * var13;
          var27 = var9 * param0.field_V + var11 * param0.field_U + var13 * param0.field_F;
          this.field_ab = var21;
          this.field_C = var23;
          this.field_bb = var19;
          var29 = var13 * param0.field_N + (param0.field_H * var11 + param0.field_P * var9);
          this.field_D = var27;
          this.field_Y = var25;
          this.field_I = var17;
          this.field_F = var15;
          this.field_A = var29;
          stackIn_9_0 = (this.c(false)) && (this.g(-10603));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dc.LA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -14) {
          field_M = (String) null;
        }
        stackIn_6_0 = (10 <= rk.field_e) && (we.field_c >= 13);
        return stackIn_6_0;
    }

    void c(int param0) {
        double var2 = 320.0 + this.field_Y / this.field_A * 640.0;
        double var4 = 640.0 * (this.field_D / this.field_A) + 188.0;
        double var6 = 12.8 / this.field_A;
        double var8 = 640.0 * (this.field_bb / this.field_C) + 320.0;
        double var10 = this.field_ab / this.field_C * 640.0 + 188.0;
        double var12 = 12.8 / this.field_C;
        this.field_z = (int)(var4 * 16.0);
        this.field_G = (int)(16.0 * var2);
        this.field_w = (int)(16.0 * var10);
        this.field_t = (int)(var8 * 16.0);
        this.field_v = (int)(var6 * 16.0);
        this.field_E = (int)(var12 * 16.0);
        double var14 = -var2 + var8;
        double var16 = var10 - var4;
        double var18 = var16;
        double var20 = -var14;
        double var22 = var16 * var16 + var14 * var14;
        if (var22 < var6 * var6) {
          this.field_V = false;
          return;
        }
        if (!(var22 < var12 * var12)) {
          this.field_V = true;
          var22 = 1.0 / var22;
          var16 = var16 * var22;
          if (param0 != -1704) {
            this.field_A = -0.048228806224869226;
          }
          var14 = var14 * var22;
          var22 = Math.sqrt(var22);
          this.field_U = (int)(16777216.0 * var14);
          this.field_O = (int)(16777216.0 * var16);
          var18 = var18 * var22;
          var20 = var20 * var22;
          this.field_Z = (int)(65536.0 * var18);
          this.field_db = (int)(65536.0 * var20);
          return;
        }
        this.field_V = false;
    }

    public static void e(int param0) {
        field_M = null;
        if (param0 != 12259) {
          return;
        }
        field_J = null;
    }

    final void a(boolean param0, int param1, int param2) {
        int var14 = 0;
        int var15 = 0;
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
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var23 = Confined.field_J ? 1 : 0;
        if (!this.field_V) {
          return;
        }
        var4 = this.field_G + ((this.field_t - this.field_G) * param1 >> 16);
        var5 = ((this.field_w - this.field_z) * param1 >> 16) + this.field_z;
        var6 = this.field_v + (param1 * (-this.field_v + this.field_E) >> 16);
        var7 = -var6 + var4 >> 4;
        var8 = var6 + (var4 + 15) >> 4;
        var9 = -var6 + var5 >> 4;
        if (0 > var7) {
          var7 = 0;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        if (var8 > 640) {
          var8 = 640;
        }
        var10 = var6 + (var5 + 15) >> 4;
        if (!param0) {
          this.field_H = 58;
        }
        if (var10 > 376) {
          var10 = 376;
        }
        var11 = var7 + 640 * var9;
        var12 = 640 + var7 - var8;
        var8 = var8 << 4;
        var10 = var10 << 4;
        var9 = var9 << 4;
        var7 = var7 << 4;
        param1 = param1 << 12;
        var13 = ((this.field_H & 16711935) * param2 & -16711936) + ((this.field_H & 65280) * param2 & 16711680) >> 8;
        for (var14 = var9; var10 > var14; var14 += 16) {
          for (var15 = var7; var15 < var8; var15 += 16) {
            if (param1 > (var15 - this.field_G) * this.field_U + (var14 - this.field_z) * this.field_O) {
              var16 = (int)(Math.sqrt((double)((var15 - var4) * (var15 - var4) + (var14 - var5) * (var14 - var5))) * 256.0) / var6;
              if (256 > var16) {
                var17 = -var16 + 256;
                var18 = fn.field_h[var11];
                var19 = ((-16711907 & var17 * (16711935 & var13)) >>> 8) + (var18 & 16711935);
                var20 = (16711935 & var19 >>> 8) * 255;
                var19 = 16711935 & (var19 | var20);
                var21 = (738262784 & (var13 & 65280) * var17 >>> 8) + (65280 & var18);
                var22 = 255 * (var21 >>> 8 & 65280);
                var21 = (var21 | var22) & 65280;
                fn.field_h[var11] = nl.a(var21, var19);
              }
            }
            var11++;
          }
          var11 = var11 + var12;
        }
        return;
    }

    final void b(int param0, byte param1) {
        this.a(-9867, param0, 65536);
        if (param1 != 27) {
          dc.e(-108);
        }
    }

    final void a(mn param0, int param1) {
        int var22_int = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_9_0 = 0;
        rk stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_40_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        oi var6 = null;
        Object var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        Object var23 = null;
        oi var23_ref = null;
        Object var24 = null;
        oi var24_ref = null;
        int var25 = 0;
        int var5Lifetime1;
        var23 = null;
        var24 = null;
        var25 = Confined.field_J ? 1 : 0;
        try {
          var3_int = (int)this.field_y;
          var4 = var3_int + ah.field_U + 1;
          if (ln.field_d.size() < var4) {
            ln.field_d.setSize(var4);
            for (var5 = ah.field_U; var4 > var5; var5++) {
              ln.field_d.setElementAt(new oi((pm) null), var5);
            }
          }
          stackIn_9_0 = (!(this.field_X > this.field_eb)) ? 0 : 1;
          var5Lifetime1 = stackIn_9_0;
          if (var5Lifetime1 != 0) {
            stackIn_12_0 = param0.a(-116);
          } else {
            stackIn_12_0 = param0.a(false);
          }
          var6 = (oi) (stackIn_12_0);
          var7 = param0.field_a;
          var8 = this.field_cb;
          var10 = this.field_L;
          var12 = this.field_X;
          var14 = this.field_y / (double)var3_int;
          if (param1 != 4) {
            this.field_v = 87;
          }
          var16 = this.field_x * var14;
          var18 = var14 * this.field_P;
          var20 = var14 * this.field_K;
          var8 = var8 + 0.5 * var16;
          var10 = var10 + 0.5 * var18;
          var12 = var12 + 0.5 * var20;
          for (var22_int = 0; var3_int > var22_int; var22_int++) {
            fieldTemp$1 = ah.field_U;
            ah.field_U = ah.field_U + 1;
            var23_ref = (oi) (ln.field_d.elementAt(fieldTemp$1));
            var23_ref.field_p = var12;
            var23_ref.field_o = var10;
            var23_ref.field_t = var8;
            var23_ref.field_u = this.field_B;
            var8 = var8 + var16;
            var10 = var10 + var18;
            if (var5Lifetime1 == 0) {
              while (var6 != null) {
                if (var12 > var6.field_p) {
                  var7 = var6;
                  var6 = (oi) (param0.a((byte) -90));
                  continue;
                }
                break;
              }
              ri.a((rk) (var7), 0, var23_ref);
              var7 = var23_ref;
            } else {
              while (var6 != null) {
                if (var6.field_p > var12) {
                  var6 = (oi) (param0.d(2123));
                  continue;
                }
                break;
              }
              if (var6 != null) {
                stackIn_23_0 = var6;
              } else {
                stackIn_23_0 = param0.field_a;
              }
              ri.a((rk) (stackIn_23_0), 0, var23_ref);
            }
            var12 = var12 + var20;
          }
          var22 = this.field_y - (double)var3_int;
          var8 = var8 + 0.5 * (var22 - 1.0) * var16;
          var10 = var10 - 0.5 * (-1.0 + var22) * var18;
          var12 = var12 - var20 * ((-1.0 + var22) * 0.5);
          fieldTemp$0 = ah.field_U;
          ah.field_U = ah.field_U + 1;
          var24_ref = (oi) (ln.field_d.elementAt(fieldTemp$0));
          var24_ref.field_t = var8;
          var24_ref.field_u = var22 * this.field_B;
          var24_ref.field_p = var12;
          var24_ref.field_o = var10;
          if (var5Lifetime1 == 0) {
            while (var6 != null) {
              if (var12 > var6.field_p) {
                var7 = var6;
                var6 = (oi) (param0.a((byte) 125));
                continue;
              }
              break;
            }
            ri.a((rk) (var7), 0, var24_ref);
            var7 = var24_ref;
            return;
          }
          while (var6 != null) {
            if (var12 < var6.field_p) {
              var6 = (oi) (param0.d(param1 ^ 2127));
              continue;
            }
            break;
          }
          if (var6 != null) {
            stackIn_40_0 = var6;
          } else {
            stackIn_40_0 = param0.field_a;
          }
          ri.a((rk) (stackIn_40_0), 0, var24_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("dc.DA(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(boolean param0) {
        double var2;
        double var4;
        double var6;
        double var8;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        var2 = this.field_bb;
        var4 = this.field_ab;
        var6 = this.field_C;
        var8 = this.field_Y;
        var10 = this.field_D;
        var12 = this.field_A;
        var14 = this.field_F;
        var16 = this.field_I;
        if (0.01 > var6) {
          if (0.02 > var12) {
            return false;
          }
          var18 = (-var6 + 0.01) / (-var6 + var12);
          var2 = var2 + (this.a(var18, (byte) -114) + (var8 - var2) * var18);
          var14 = var14 + (var16 - var14) * var18;
          var6 = 0.01;
          var4 = var4 + (var18 * (var10 - var4) + this.a(var18, (byte) -20));
        } else {
          if (0.01 > var12) {
            if (var6 < 0.02) {
              return false;
            }
            var18 = (0.01 - var12) / (-var12 + var6);
            var8 = var8 + ((-var8 + var2) * var18 + this.a(var18, (byte) -128));
            var16 = var16 + var18 * (var14 - var16);
            var12 = 0.01;
            var10 = var10 + (var18 * (-var10 + var4) + this.a(var18, (byte) -101));
          }
        }
        this.field_Y = var8;
        this.field_ab = var4;
        if (param0) {
          this.field_N = -30;
        }
        this.field_D = var10;
        this.field_bb = var2;
        this.field_I = var16;
        this.field_C = var6;
        this.field_F = var14;
        this.field_A = var12;
        return true;
    }

    final boolean g(int param0) {
        double var18 = 0.0;
        int var20 = Confined.field_J ? 1 : 0;
        double var2 = this.field_bb;
        double var4 = this.field_ab;
        double var6 = this.field_C;
        double var8 = this.field_Y;
        double var10 = this.field_D;
        double var12 = this.field_A;
        double var14 = this.field_F;
        double var16 = this.field_I;
        double var18Lifetime1;
        double var18Lifetime2;
        double var18Lifetime3;
        if (param0 != -10603) {
          dc.e(-43);
        }
        if (1.2 * var6 < -var2) {
          if (var12 * 1.1 < -var8) {
            return false;
          }
          var18 = (1.2 * var6 + var2) / ((var6 - var12) * 1.2 + (var2 - var8));
          var2 = var2 + (var18 * (-var2 + var8) + this.a(var18, (byte) -84));
          var4 = var4 + ((-var4 + var10) * var18 + this.a(var18, (byte) -80));
          var14 = var14 + var18 * (var16 - var14);
          var6 = var6 + var18 * (var12 - var6);
          this.field_y = this.field_y * (1.0 - var18);
        } else {
          if (-var8 > 1.2 * var12) {
            if (var6 * 1.1 < -var2) {
              return false;
            }
            var18 = (var8 + var12 * 1.2) / (1.2 * (var12 - var6) + (-var2 + var8));
            var8 = var8 + ((-var8 + var2) * var18 + this.a(var18, (byte) -120));
            var10 = var10 + ((var4 - var10) * var18 + this.a(var18, (byte) -12));
            var16 = var16 + var18 * (-var16 + var14);
            var12 = var12 + var18 * (var6 - var12);
            this.field_y = this.field_y * (-var18 + 1.0);
          }
        }
        if (1.2 * var6 < var2) {
          if (var12 * 1.1 < var8) {
            return false;
          }
          var18Lifetime1 = (var2 - 1.2 * var6) / (-var8 + var2 + (var12 - var6) * 1.2);
          var2 = var2 + (var18Lifetime1 * (var8 - var2) + this.a(var18Lifetime1, (byte) -29));
          var4 = var4 + (this.a(var18Lifetime1, (byte) -4) + var18Lifetime1 * (var10 - var4));
          var14 = var14 + (var16 - var14) * var18Lifetime1;
          var6 = var6 + (-var6 + var12) * var18Lifetime1;
          this.field_y = this.field_y * (1.0 - var18Lifetime1);
        } else {
          if (-var8 > 1.2 * var12) {
            if (var2 > var6 * 1.1) {
              return false;
            }
            var18Lifetime1 = (-(var12 * 1.2) + var8) / (var8 - var2 + (var6 - var12) * 1.2);
            var8 = var8 + (this.a(var18Lifetime1, (byte) -58) + (var2 - var8) * var18Lifetime1);
            var12 = var12 + var18Lifetime1 * (-var12 + var6);
            var10 = var10 + (var18Lifetime1 * (-var10 + var4) + this.a(var18Lifetime1, (byte) -3));
            var16 = var16 + var18Lifetime1 * (var14 - var16);
            this.field_y = this.field_y * (1.0 - var18Lifetime1);
          }
        }
        if (var6 * 1.2 < -var4) {
          if (var12 * 1.1 < -var10) {
            return false;
          }
          var18Lifetime2 = (var6 * 1.2 + var4) / (1.2 * (-var12 + var6) + (-var10 + var4));
          var2 = var2 + (var18Lifetime2 * (-var2 + var8) + this.a(var18Lifetime2, (byte) -9));
          var14 = var14 + (-var14 + var16) * var18Lifetime2;
          var6 = var6 + var18Lifetime2 * (-var6 + var12);
          var4 = var4 + (this.a(var18Lifetime2, (byte) -63) + var18Lifetime2 * (var10 - var4));
          this.field_y = this.field_y * (-var18Lifetime2 + 1.0);
        } else {
          if (1.2 * var12 < -var10) {
            if (1.1 * var6 < -var4) {
              return false;
            }
            var18Lifetime2 = (var12 * 1.2 + var10) / ((var12 - var6) * 1.2 + (-var4 + var10));
            var8 = var8 + (this.a(var18Lifetime2, (byte) -101) + var18Lifetime2 * (-var8 + var2));
            var16 = var16 + (var14 - var16) * var18Lifetime2;
            var10 = var10 + (var18Lifetime2 * (-var10 + var4) + this.a(var18Lifetime2, (byte) -124));
            var12 = var12 + (var6 - var12) * var18Lifetime2;
            this.field_y = this.field_y * (-var18Lifetime2 + 1.0);
          }
        }
        if (!(1.2 * var6 < var4)) {
          if (!(1.2 * var12 < -var10)) {
            this.field_I = var16;
            this.field_C = var6;
            this.field_bb = var2;
            this.field_F = var14;
            this.field_ab = var4;
            this.field_A = var12;
            this.field_Y = var8;
            this.field_D = var10;
            return true;
          }
          if (var6 * 1.1 < var4) {
            return false;
          }
          var18Lifetime3 = (-(var12 * 1.2) + var10) / (1.2 * (var6 - var12) - (var4 - var10));
          var8 = var8 + ((-var8 + var2) * var18Lifetime3 + this.a(var18Lifetime3, (byte) -64));
          var16 = var16 + (-var16 + var14) * var18Lifetime3;
          var10 = var10 + ((-var10 + var4) * var18Lifetime3 + this.a(var18Lifetime3, (byte) -58));
          var12 = var12 + var18Lifetime3 * (var6 - var12);
          this.field_y = this.field_y * (1.0 - var18Lifetime3);
        } else {
          if (!(var10 > 1.1 * var12)) {
            var18Lifetime3 = (var4 - var6 * 1.2) / ((var12 - var6) * 1.2 - (var10 - var4));
            var2 = var2 + (this.a(var18Lifetime3, (byte) -56) + var18Lifetime3 * (var8 - var2));
            var14 = var14 + (-var14 + var16) * var18Lifetime3;
            var6 = var6 + var18Lifetime3 * (-var6 + var12);
            var4 = var4 + (this.a(var18Lifetime3, (byte) -75) + var18Lifetime3 * (var10 - var4));
            this.field_y = this.field_y * (-var18Lifetime3 + 1.0);
            this.field_I = var16;
            this.field_C = var6;
            this.field_bb = var2;
            this.field_F = var14;
            this.field_ab = var4;
            this.field_A = var12;
            this.field_Y = var8;
            this.field_D = var10;
            return true;
          }
          return false;
        }
        this.field_I = var16;
        this.field_C = var6;
        this.field_bb = var2;
        this.field_F = var14;
        this.field_ab = var4;
        this.field_A = var12;
        this.field_Y = var8;
        this.field_D = var10;
        return true;
    }

    final void a(byte param0, double param1, double param2, double param3) {
        this.field_R = this.field_R - param1;
        this.field_eb = this.field_eb - param2;
        this.field_s = this.field_s - param3;
        this.field_cb = this.field_cb - param1;
        this.field_L = this.field_L - param3;
        this.field_X = this.field_X - param2;
        int var8 = -81 % ((-49 - param0) / 58);
    }

    final static void e(byte param0) {
        if (param0 >= -45) {
          dc.d(-76);
        }
    }

    int a(int param0, byte param1) {
        if (this.field_E == this.field_v) {
          return param0;
        }
        if (param1 != -63) {
          this.c(127);
        }
        double var3 = 65536.0 / ((double)(65536 - param0) / (double)this.field_v + (double)param0 / (double)this.field_E);
        int var5 = (int)(65536.0 * (((double)(-this.field_v) + var3) / (double)(-this.field_v + this.field_E)));
        if (0 > var5) {
          return 0;
        }
        if (var5 > 65536) {
          return 65536;
        }
        return var5;
    }

    private final void a(int param0, int param1, int param2) {
        int var14 = 0;
        int var15 = 0;
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
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        var23 = Confined.field_J ? 1 : 0;
        var4 = ((this.field_t - this.field_G) * param2 >> 16) + this.field_G;
        var5 = this.field_z + ((-this.field_z + this.field_w) * param2 >> 16);
        var6 = (param2 * (-this.field_v + this.field_E) >> 16) + this.field_v;
        var7 = var4 - var6 >> 4;
        var8 = var6 + var4 + 15 >> 4;
        if (param0 != -9867) {
          this.field_V = true;
        }
        var9 = var5 - var6 >> 4;
        if (var7 < 0) {
          var7 = 0;
        }
        if (var9 < 0) {
          var9 = 0;
        }
        var10 = var6 + (var5 + 15) >> 4;
        if (var8 > 640) {
          var8 = 640;
        }
        if (var10 > 376) {
          var10 = 376;
        }
        var11 = var7 + 640 * var9;
        var12 = 640 - var8 + var7;
        var9 = var9 << 4;
        var7 = var7 << 4;
        var8 = var8 << 4;
        param2 = param2 << 12;
        var10 = var10 << 4;
        var13 = ((this.field_H & 65280) * param1 & 16711680) + (-16711936 & (this.field_H & 16711935) * param1) >> 8;
        for (var14 = var9; var14 < var10; var14 += 16) {
          for (var15 = var7; var15 < var8; var15 += 16) {
            if (!this.field_V ||
              param2 <= this.field_U * (var15 - this.field_G) + (-this.field_z + var14) * this.field_O) {
              var16 = (int)(256.0 * Math.sqrt((double)((-var5 + var14) * (var14 - var5) + (var15 - var4) * (-var4 + var15)))) / var6;
              if (256 > var16) {
                var17 = 256 - var16;
                var18 = fn.field_h[var11];
                var19 = (16711935 & var18) + (((var13 & 16711935) * var17 & -16711820) >>> 8);
                var20 = 255 * ((var19 & -16711936) >>> 8);
                var19 = (var19 | var20) & 16711935;
                var21 = ((16711815 & (var13 & 65280) * var17) >>> 8) + (65280 & var18);
                var22 = 255 * (var21 >>> 8 & 65280);
                var21 = (var21 | var22) & 65280;
                fn.field_h[var11] = nl.a(var21, var19);
              }
            }
            var11++;
          }
          var11 = var11 + var12;
        }
    }

    final static void d(int param0) {
        if (param0 < 99) {
          dc.f(-117);
        }
        if (null != kl.field_G) {
          kl.field_G.a(1);
          kl.field_G = null;
        }
    }

    dc(pm param0, bi param1, int param2) {
        try {
          this.field_T = param0;
          if (param1 != null) {
            this.field_Q = new nm(param0, param1, this, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "dc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_M = "Press <%0> to fire concussion missiles";
    }
}
