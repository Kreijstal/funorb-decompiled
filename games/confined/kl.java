/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends pm {
    private int[] field_K;
    private int field_N;
    private int[] field_P;
    private int[] field_U;
    static String field_H;
    double[] field_I;
    static oc[] field_R;
    static vd field_G;
    double[] field_T;
    private int[] field_L;
    double[] field_S;
    double[] field_Q;
    double[] field_M;
    private int[] field_F;
    double[] field_O;
    gk field_J;

    final void a(int param0, hf param1) {
        try {
            if (param0 > -29) {
                this.c(-49);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, int param1) {
        try {
            if (param1 <= 122) {
                field_G = (vd) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, ah param1) {
        try {
            int var3_int = -96 / ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != -16420) {
            kl.k(119);
        }
        field_G = null;
        field_R = null;
        field_H = null;
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        hf var38 = null;
        var37 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              this.c(false);
              if (param2 <= -5) {
                break L1;
              } else {
                var38 = (hf) null;
                this.a(5, (hf) null);
                break L1;
              }
            }
            L2: {
              var7_double = this.field_E - param3.field_T;
              var9 = -param3.field_L + this.field_t;
              var11 = -param3.field_O + this.field_D;
              var13 = param3.field_R * var7_double + param3.field_ab * var9 + var11 * param3.field_M;
              var15 = var7_double * param3.field_V + var9 * param3.field_U + var11 * param3.field_F;
              var17 = param3.field_P * var7_double + param3.field_H * var9 + var11 * param3.field_N;
              if (0.15 <= var17) {
                L3: {
                  var19 = 640.0 * (var13 / var17) + 320.0;
                  var21 = 188.0 + var15 / var17 * 640.0;
                  var23 = 640.0 * (this.field_C / var17);
                  var25 = 2.0 * (1.0 - var11 / param1);
                  var25 = qn.field_v.a(var25, 0, this.field_D);
                  if (0.0 >= var25) {
                    break L3;
                  } else {
                    L4: {
                      if (var25 <= 1.0) {
                        break L4;
                      } else {
                        var25 = 1.0;
                        break L4;
                      }
                    }
                    var27 = this.field_Q.length;
                    var28 = 0;
                    L5: while (true) {
                      if (var27 <= var28) {
                        break L3;
                      } else {
                        if (this.field_P[var28] > 0) {
                          L6: {
                            var29 = (int)((this.field_Q[var28] * var23 + var19) * 16.0);
                            var30 = (int)(16.0 * (var23 * this.field_T[var28] + var21));
                            var31 = 16.0 * (0.02 / var17 * 640.0);
                            var33 = var25 * (double)this.field_P[var28];
                            if (16.0 <= var31) {
                              var36 = (int)var33;
                              var35 = (int)var31;
                              break L6;
                            } else {
                              var35 = 16;
                              var36 = (int)(var33 * var31 * var31) >> -500812696;
                              break L6;
                            }
                          }
                          fn.a(var29, var30, var35, var36, this.field_U);
                          var28++;
                          continue L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var7);

            stackIn_19_1 = new StringBuilder().append("kl.QA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    final void a(int param0, mb param1) {
        try {
            if (param0 != -23154) {
                this.field_O = (double[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, ee param1) {
        try {
            if (!param0) {
                this.field_K = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, il param1) {
        try {
            if (param0) {
                this.field_Q = (double[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean i(int param0) {
        if (param0 != 8) {
            return false;
        }
        return false;
    }

    private final double c(int param0, int param1) {
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        int var3 = 0;
        for (var4 = param0; (var4 ^ -1) > -10; var4++) {
            var3 = var3 + ti.field_j[2047 & this.field_L[9 * param1 - -var4]] * bh.field_b[var4];
            var3 = var3 + ti.field_m[2047 & this.field_L[param1 * 9 - -var4]] * bh.field_b[var4 + 9];
        }
        return (double)var3 * kd.field_r;
    }

    private final void c(boolean param0) {
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var2;
        int var3;
        int var4;
        double var5;
        double var7;
        int var9;
        double var10;
        double var12;
        double var14;
        double var16;
        int var18;
        pm var19;
        var18 = Confined.field_J ? 1 : 0;
        var2 = this.field_N;
        if (var2 == 0) {
          return;
        } else {
          this.field_N = 0;
          var3 = 1;
          var4 = this.field_Q.length;
          kd.field_r = (double)var2 * 9.313225746154785e-13;
          var5 = (double)var2 * 0.5;
          var7 = Math.pow(0.5, (double)var2);
          var9 = 0;
          L0: while (true) {
            L1: {
              if (var4 <= var9) {
                break L1;
              } else {
                if (this.field_P[var9] > 0) {
                  L2: {
                    ck.a(-1942300510, this.field_Q[var9], this.field_T[var9], this.field_S[var9]);
                    var10 = this.field_O[var9];
                    var12 = this.field_I[var9];
                    var14 = this.field_M[var9];
                    var10 = var10 + this.c(0, 0);
                    var12 = var12 + this.c(0, 1);
                    var14 = var14 + this.c(0, 2);
                    var16 = 1.0 - var5 * Math.sqrt(var14 * var14 + (var10 * var10 + var12 * var12));
                    if (var7 > var16) {
                      var16 = var7;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var12 = var12 * var16;
                  var10 = var10 * var16;
                  var14 = var14 * var16;
                  this.field_O[var9] = var10;
                  this.field_I[var9] = var12;
                  this.field_M[var9] = var14;
                  this.field_Q[var9] = this.field_Q[var9] + (double)var2 * var10;
                  this.field_T[var9] = this.field_T[var9] + (double)var2 * var12;
                  this.field_S[var9] = this.field_S[var9] + (double)var2 * var14;
                  this.field_P[var9] = this.field_P[var9] - var2 * this.field_K[var9];
                  if (-1 > (this.field_P[var9] ^ -1)) {
                    var3 = 0;
                    var9++;
                    continue L0;
                  } else {
                    this.field_P[var9] = 0;
                    var9++;
                    continue L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L3: {
              stackIn_15_0 = this;

              if (var3 == 0) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L3;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L3;
              }
            }
            L4: {
              ((kl) (this)).field_z = stackIn_16_1 != 0;
              var9 = 0;
              if (!param0) {
                break L4;
              } else {
                var19 = (pm) null;
                this.a(true, (pm) null);
                break L4;
              }
            }
            L5: while (true) {
              if (var9 >= 9) {
                return;
              } else {
                this.field_L[var9] = this.field_L[var9] + this.field_F[var9] * var2;
                var9++;
                continue L5;
              }
            }
          }
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 72) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kl.WA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0, sa param1) {
        try {
            if (param0 != 9) {
                this.field_Q = (double[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean f(int param0) {
        if (param0 > -54) {
            this.f(96);
            return false;
        }
        return false;
    }

    final void a(cl param0, byte param1) {
        try {
            int var3_int = -60 % ((param1 - -35) / 60);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean g(byte param0) {
        if (param0 < 64) {
            cl var3 = (cl) null;
            this.a((cl) null, (byte) -112);
        }
        return false;
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_R = (oc[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("kl.CB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return false;
    }

    kl(hn param0, double param1, double param2, double param3, double param4, int param5, int[] param6, boolean param7) {
        super(param0, param1, param2, param3, param4);
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        this.field_N = 0;
        this.field_L = new int[27];
        this.field_F = new int[27];
        try {
          L0: {
            this.field_M = new double[param5];
            this.field_K = new int[param5];
            this.field_U = param6;
            this.field_P = new int[param5];
            this.field_T = new double[param5];
            this.field_O = new double[param5];
            this.field_I = new double[param5];
            this.field_Q = new double[param5];
            this.field_S = new double[param5];
            var13_int = 0;
            L1: while (true) {
              if (var13_int >= param5) {
                var13_int = 0;
                L2: while (true) {
                  if (27 <= var13_int) {
                    L3: {
                      if (!param7) {
                        break L3;
                      } else {
                        param0.field_a = (kl) (this);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    this.field_L[var13_int] = (int)(2048.0 * Math.random());
                    this.field_F[var13_int] = (int)(64.99 * Math.random()) - 32;
                    var13_int++;
                    continue L2;
                  }
                }
              } else {
                this.field_P[var13_int] = 255;
                var14 = (int)Math.pow(4.0, (double)var13_int / (double)param5 + 1.0);
                this.field_K[var13_int] = var14;
                var13_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var13 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var13);

            stackIn_12_1 = new StringBuilder().append("kl.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param7 + ')');
        }
    }

    final void a(pm param0, int param1) {
        try {
            if (param1 >= -81) {
                this.field_O = (double[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(hm param0, boolean param1) {
        try {
            if (!param1) {
                pm var4 = (pm) null;
                this.a((pm) null, 92);
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, vg param1) {
        try {
            if (param0 != -1) {
                this.field_T = (double[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kl.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        if (this.field_z) {
            this.field_J.field_t = null;
        }
        if (param0 != 11878) {
            pm var4 = (pm) null;
            this.a((pm) null, 28);
        }
        this.field_N = this.field_N + 1;
    }

    static {
        field_H = "Service unavailable";
    }
}
