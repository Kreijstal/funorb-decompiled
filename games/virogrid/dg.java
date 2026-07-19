/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends fi {
    static int field_x;
    private mg[] field_D;
    private int field_K;
    private int field_H;
    boolean field_z;
    private int field_y;
    private mg field_I;
    static km field_E;
    static String field_G;
    private mg field_B;
    private int field_J;
    private int field_F;
    private mg field_A;
    int field_C;
    private int field_L;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 407260353 & 8355711, param6 >> 384825825 & 8355711);
    }

    final static bk a(String param0, int param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        bk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 16711935) {
                break L1;
              } else {
                dg.a((byte) 84);
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if ((param0.indexOf('@') ^ -1) == 0) {
                var7 = (CharSequence) ((Object) param0);
                var4_long = jc.a(var7, (byte) -105);
                break L2;
              } else {
                var6 = param0;
                break L2;
              }
            }
            stackOut_5_0 = pl.a(var4_long, (String) (var6), 127, param2, param3);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("dg.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final mg e(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Virogrid.field_F ? 1 : 0;
        int var2 = this.field_m >> 878667105;
        mg var3 = new mg(var2, this.field_m);
        kb.a(var3, 16865);
        if (param0 < 63) {
            return (mg) null;
        }
        for (var4 = 0; this.field_m > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((this.field_m - var4) * var4);
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                df.a(var5, var4, var8 << 388355696 | (var8 | var8 << 761983656));
            }
        }
        ai.a(true);
        return var3;
    }

    private final void a(int param0, mg param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param2 - -this.field_g;
            uk.a(param0 + this.field_m, 6, param2 - -this.field_A.field_w, -this.field_A.field_w + var5_int, param0);
            var6 = -this.field_L + param2;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  if (param3) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                ai.a(stackIn_7_0 != 0);
                if (!param3) {
                  L3: {
                    if (df.field_i <= this.field_A.field_w + param2) {
                      kb.a(this.field_I, 16865);
                      param1.d(-this.field_L, 0);
                      param1.d(2 * this.field_J - this.field_L, 0);
                      this.field_B.c(0, 0);
                      ai.a(true);
                      this.field_I.d(param2, param0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-this.field_A.field_w + var5_int <= df.field_k) {
                      kb.a(this.field_I, 16865);
                      var7 = this.field_L + (-this.field_A.field_w + this.field_g);
                      L5: while (true) {
                        if (this.field_J * 2 >= var7) {
                          param1.d(-var7, 0);
                          param1.d(-var7 + 2 * this.field_J, 0);
                          this.field_A.c(0, 0);
                          ai.a(true);
                          this.field_I.d(-this.field_A.field_w + var5_int, param0);
                          break L4;
                        } else {
                          var7 = var7 - this.field_J * 2;
                          continue L5;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                param1.d(var6, param0);
                var6 = var6 + param1.field_w;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var5);
            stackOut_19_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        mg discarded$0 = null;
        if (!(param3 == 0)) {
            return;
        }
        int var5 = this.field_l + param1;
        int var6 = param2 - -this.field_u;
        this.a(var6, this.field_D[0], var5, false);
        if (!(this.field_C >= 65536)) {
            uk.a(var6 + this.field_m, 6, (this.field_C * this.field_g >> 49496464) + var5, var5 + this.field_g, var6);
            this.a(var6, this.field_D[1], var5, false);
            ai.a(true);
        }
        if (param0 != 37) {
            discarded$0 = this.c(-103, -91, 31);
        }
    }

    private final void a(int param0) {
        this.field_D = new mg[]{this.c(this.field_F, this.field_H, -17), this.c(this.field_K, this.field_y, param0 ^ -46)};
        this.field_A = this.e(127);
        this.field_B = this.field_A.c();
        this.field_I = new mg(this.field_m >> -1249187103, this.field_m);
        if (param0 != 10) {
            field_G = (String) null;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(10);
    }

    public static void a(byte param0) {
        field_G = null;
        if (param0 <= 13) {
            return;
        }
        field_E = null;
    }

    private final mg c(int param0, int param1, int param2) {
        mg discarded$1 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mg var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = Virogrid.field_F ? 1 : 0;
          if (param2 <= -15) {
            break L0;
          } else {
            discarded$1 = this.e(93);
            break L0;
          }
        }
        var14 = new mg(this.field_J * 2, this.field_m);
        kb.a(var14, 16865);
        var5 = this.field_m >> 1547430305;
        var6 = 0;
        L1: while (true) {
          if (var6 >= this.field_m) {
            ai.a(true);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -1159110911) * (-1 + 2 * this.field_J) % (2 * this.field_J);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = var6 - var5;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
              if ((var11 ^ -1) > -257) {
                stackOut_6_0 = (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 1616609768;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = var8 | var9;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              df.b(var7, var6, this.field_J, var12);
              var8 = param0 & 16711935;
              df.b(var7 + -(2 * this.field_J), var6, this.field_J, var12);
              var9 = 65280 & param0;
              if (-257 >= (var11 ^ -1)) {
                stackOut_9_0 = var9 | var8;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (var9 * var11 & 16711680 | -16711936 & var8 * var11) >>> 814377800;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            df.b(var7 + this.field_J, var6, this.field_J, var12);
            df.b(var7 - this.field_J, var6, this.field_J, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void d(int param0, int param1, int param2) {
        this.field_H = param1;
        this.field_y = 8355711 & param1 >> -985797695;
        this.field_K = (16711422 & param0) >> 286897985;
        if (param2 < 101) {
            this.field_L = 41;
        }
        this.field_F = param0;
        this.a(10);
    }

    final static void a(byte param0, int param1) {
        fe.field_Lb = jg.field_g[param1];
        if (param0 != -53) {
            field_x = -72;
        }
        aa.field_d = ve.field_r[param1];
        jd.field_b = o.field_b[param1];
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_K = param8;
        this.field_J = param4;
        this.field_H = param5;
        this.field_y = param7;
        this.field_F = param6;
        this.a(param3, true, param1, param0, param2);
    }

    final static void b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        try {
            var3_int = 320;
            var4 = 240;
            param0 = param0 / 2;
            param2 = param2 / 2;
            var5 = 2 + (int)((Math.cos((double)((float)id.field_r / 20.0f)) + 1.0) * 8.0);
            if (param1 > -123) {
                field_G = (String) null;
            }
            for (var6 = 0; 9 > var6; var6++) {
                var7 = (-var6 + 9) * var5 >>> -38989341;
                df.a(var3_int + (-param2 + -var7), var4 - param0 - var7, param2 - -var7 << 1395215649, var7 + param0 << -1398436383, 10, 1141646, 26);
            }
            df.a(-param2 + var3_int, -param0 + var4, param2 << 1628823137, param0 << -1688161055, 10, 0, 180);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "dg.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, fi param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 >= 113) {
              L1: {
                if (!this.field_z) {
                  break L1;
                } else {
                  this.field_L = this.field_L + 1;
                  if (this.field_J * 2 < this.field_L) {
                    this.field_L = this.field_L - this.field_J * 2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("dg.E(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_G = "Achievements can only be obtained by playing Rated games";
    }
}
