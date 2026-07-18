/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l extends cg {
    private ji field_r;
    int[] field_M;
    int[] field_q;
    private int[] field_l;
    private int[] field_k;
    private int[] field_D;
    private int[] field_J;
    private int[] field_O;
    private int[] field_A;
    private int[] field_z;
    private rta[][] field_n;
    private int[] field_F;
    private int[] field_m;
    private maa field_w;
    private int[] field_o;
    private int field_G;
    private int[] field_y;
    int[] field_u;
    private int field_H;
    static jea field_K;
    private rta[][] field_I;
    private int[] field_N;
    private int[] field_L;
    private int field_j;
    private int field_p;
    private long field_E;
    private long field_B;
    private et field_v;
    private boolean field_t;
    private int field_C;
    private boolean field_s;
    private qua field_x;

    final synchronized void d(int param0, int param1, int param2) {
        try {
            this.c(param1, 125, param0);
            if (param2 != 32460) {
                ((l) this).field_E = -39L;
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(int param0, rta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2421) {
                break L1;
              } else {
                ((l) this).field_t = true;
                break L1;
              }
            }
            var3_int = ((l) this).field_A[param1.field_k];
            if (var3_int >= 8192) {
              stackOut_6_0 = 16384 - ((128 + -param1.field_h) * (-var3_int + 16384) + 32 >> 930921414);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3_int * param1.field_h + 32 >> 536272166;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("l.VA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 <= -70) {
                break L1;
              } else {
                ((l) this).a((byte) -3, 35, 27);
                break L1;
              }
            }
            stackOut_3_0 = ((l) this).field_w.g();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "l.L(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(rta param0, int param1) {
        RuntimeException var3 = null;
        bq var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (0 == ((l) this).field_N[param0.field_k]) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_ref = param0.field_v;
              var4 = 4096 + ((l) this).field_L[param0.field_k] * ((l) this).field_y[param0.field_k] >> 2142953485;
              var4 = 16384 + var4 * var4 >> 1165242863;
              var4 = param0.field_s * var4 - -16384 >> 1147635983;
              if (param1 >= 71) {
                L1: {
                  var4 = ((l) this).field_G * var4 + 128 >> 1726470600;
                  var4 = var4 * ((l) this).field_N[param0.field_k] + 128 >> 1564133480;
                  if (var3_ref.field_n > 0) {
                    var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_f * (double)var3_ref.field_n) * (double)var4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != var3_ref.field_m) {
                    L3: {
                      var5 = param0.field_A;
                      var6 = var3_ref.field_m[param0.field_w + 1];
                      if (~param0.field_w <= ~(var3_ref.field_m.length - 2)) {
                        break L3;
                      } else {
                        var7 = 65280 & var3_ref.field_m[param0.field_w] << 545752456;
                        var8 = var3_ref.field_m[2 + param0.field_w] << -1923086264 & 65280;
                        var6 = var6 + (var5 - var7) * (-var6 + var3_ref.field_m[3 + param0.field_w]) / (var8 - var7);
                        break L3;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 708002598;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (0 >= param0.field_t) {
                    break L4;
                  } else {
                    if (null == var3_ref.field_g) {
                      break L4;
                    } else {
                      L5: {
                        var5 = param0.field_t;
                        var6 = var3_ref.field_g[1 + param0.field_i];
                        if (~(-2 + var3_ref.field_g.length) >= ~param0.field_i) {
                          break L5;
                        } else {
                          var7 = (var3_ref.field_g[param0.field_i] & 255) << 128787848;
                          var8 = (var3_ref.field_g[param0.field_i - -2] & 255) << -1160193112;
                          var6 = var6 + (var5 + -var7) * (var3_ref.field_g[param0.field_i + 3] - var6) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> 5484518;
                      break L4;
                    }
                  }
                }
                stackOut_25_0 = var4;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                stackOut_6_0 = -110;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("l.KA(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    final synchronized void a(int param0, int param1) {
        try {
            int var3_int = 87 / ((param1 - 53) / 54);
            ((l) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.J(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean c(int param0, rta param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (param1.field_x != null) {
              L1: {
                if (param0 == 15) {
                  break L1;
                } else {
                  ((l) this).field_y = null;
                  break L1;
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              L2: {
                if (param1.field_t >= 0) {
                  param1.p(70);
                  if (param1.field_z <= 0) {
                    break L2;
                  } else {
                    if (((l) this).field_n[param1.field_k][param1.field_z] != param1) {
                      break L2;
                    } else {
                      ((l) this).field_n[param1.field_k][param1.field_z] = null;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("l.H(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    public static void c(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ha discarded$2 = l.a(8, -95, (java.awt.Canvas) null, (d) null, -74);
                break L1;
              }
            }
            field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "l.W(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        rta var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((((l) this).field_M[param1] & 2) == 0) {
                  break L2;
                } else {
                  var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
                  L3: while (true) {
                    if (null == var3) {
                      break L2;
                    } else {
                      stackOut_4_0 = param1;
                      stackOut_4_1 = var3.field_k;
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_19_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L4;
                          } else {
                            if (((l) this).field_I[param1][var3.field_m] != null) {
                              break L4;
                            } else {
                              if (0 > var3.field_t) {
                                var3.field_t = 0;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var3 = (rta) (Object) ((l) this).field_v.field_l.e(123);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_18_0 = param0;
              stackOut_18_1 = -44;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L1;
            }
            L5: {
              if (stackIn_19_0 <= stackIn_19_1) {
                break L5;
              } else {
                boolean discarded$2 = ((l) this).a((byte) -62);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final static ha a(int param0, int param1, java.awt.Canvas param2, d param3, int param4) {
        RuntimeException var5 = null;
        sfa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sfa stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 127) {
                break L1;
              } else {
                l.c(-1);
                break L1;
              }
            }
            stackOut_3_0 = new sfa(param2, param3, param4, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("l.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param4 + ')');
        }
        return (ha) (Object) stackIn_4_0;
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 240 & param0;
            if (var3_int != param1) {
              if (144 == var3_int) {
                L1: {
                  L2: {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> 319810664;
                    var6 = (param0 & 8342499) >> -1781627344;
                    if (var6 > 0) {
                      break L2;
                    } else {
                      this.a(var5, var4, 64, 0);
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.b(var5, 0, var4, var6);
                  break L1;
                }
                return;
              } else {
                if (var3_int != 160) {
                  if (var3_int == 176) {
                    L3: {
                      var4 = 15 & param0;
                      var5 = 127 & param0 >> -252458360;
                      var6 = (param0 & 8338047) >> 1496635216;
                      if (var5 == 0) {
                        ((l) this).field_l[var4] = sea.c(((l) this).field_l[var4], -2080769) + (var6 << -254918226);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var5 != 32) {
                        break L4;
                      } else {
                        ((l) this).field_l[var4] = sea.c(-16257, ((l) this).field_l[var4]) + (var6 << -2075111449);
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 != 1) {
                        break L5;
                      } else {
                        ((l) this).field_m[var4] = sea.c(((l) this).field_m[var4], -16257) - -(var6 << 164820807);
                        break L5;
                      }
                    }
                    L6: {
                      if (var5 != 33) {
                        break L6;
                      } else {
                        ((l) this).field_m[var4] = sea.c(((l) this).field_m[var4], -128) + var6;
                        break L6;
                      }
                    }
                    L7: {
                      if (5 != var5) {
                        break L7;
                      } else {
                        ((l) this).field_z[var4] = sea.c(-16257, ((l) this).field_z[var4]) + (var6 << 1304862823);
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 != 37) {
                        break L8;
                      } else {
                        ((l) this).field_z[var4] = sea.c(-128, ((l) this).field_z[var4]) + var6;
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 != 7) {
                        break L9;
                      } else {
                        ((l) this).field_L[var4] = sea.c(-16257, ((l) this).field_L[var4]) - -(var6 << 947120423);
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 39) {
                        break L10;
                      } else {
                        ((l) this).field_L[var4] = var6 + sea.c(((l) this).field_L[var4], -128);
                        break L10;
                      }
                    }
                    L11: {
                      if (10 == var5) {
                        ((l) this).field_A[var4] = (var6 << 1378075559) + sea.c(-16257, ((l) this).field_A[var4]);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 42) {
                        break L12;
                      } else {
                        ((l) this).field_A[var4] = var6 + sea.c(-128, ((l) this).field_A[var4]);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 11) {
                        break L13;
                      } else {
                        ((l) this).field_y[var4] = sea.c(((l) this).field_y[var4], -16257) + (var6 << -27385433);
                        break L13;
                      }
                    }
                    L14: {
                      if (var5 == 43) {
                        ((l) this).field_y[var4] = var6 + sea.c(-128, ((l) this).field_y[var4]);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (var5 == 64) {
                        L16: {
                          if (var6 >= 64) {
                            break L16;
                          } else {
                            ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -2);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 1);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      if (var5 == 65) {
                        L18: {
                          if (var6 >= 64) {
                            break L18;
                          } else {
                            this.d(-108, var4);
                            ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -3);
                            if (var8 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 2);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L19: {
                      if (var5 != 99) {
                        break L19;
                      } else {
                        ((l) this).field_J[var4] = sea.c(127, ((l) this).field_J[var4]) - -(var6 << -553288505);
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 != 98) {
                        break L20;
                      } else {
                        ((l) this).field_J[var4] = var6 + sea.c(((l) this).field_J[var4], 16256);
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 != 101) {
                        break L21;
                      } else {
                        ((l) this).field_J[var4] = (var6 << -1897740761) + sea.c(((l) this).field_J[var4], 127) + 16384;
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 != 100) {
                        break L22;
                      } else {
                        ((l) this).field_J[var4] = 16384 + (sea.c(((l) this).field_J[var4], 16256) + var6);
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 != 120) {
                        break L23;
                      } else {
                        this.b(true, var4);
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 != 121) {
                        break L24;
                      } else {
                        this.a((byte) 101, var4);
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 == 123) {
                        this.b(var4, 92);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var5 != 6) {
                        break L26;
                      } else {
                        var7 = ((l) this).field_J[var4];
                        if (var7 != 16384) {
                          break L26;
                        } else {
                          ((l) this).field_F[var4] = (var6 << -1418123097) + sea.c(((l) this).field_F[var4], -16257);
                          break L26;
                        }
                      }
                    }
                    L27: {
                      if (var5 == 38) {
                        var7 = ((l) this).field_J[var4];
                        if (16384 != var7) {
                          break L27;
                        } else {
                          ((l) this).field_F[var4] = sea.c(((l) this).field_F[var4], -128) - -var6;
                          break L27;
                        }
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (var5 == 16) {
                        ((l) this).field_q[var4] = (var6 << -265445209) + sea.c(-16257, ((l) this).field_q[var4]);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (48 != var5) {
                        break L29;
                      } else {
                        ((l) this).field_q[var4] = var6 + sea.c(((l) this).field_q[var4], -128);
                        break L29;
                      }
                    }
                    L30: {
                      if (81 != var5) {
                        break L30;
                      } else {
                        L31: {
                          if (var6 >= 64) {
                            break L31;
                          } else {
                            this.e(28583, var4);
                            ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -5);
                            if (var8 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 4);
                        break L30;
                      }
                    }
                    L32: {
                      if (var5 == 17) {
                        this.a(var4, (-16257 & ((l) this).field_o[var4]) + (var6 << -27648857), (byte) -78);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    L33: {
                      if (var5 != 49) {
                        break L33;
                      } else {
                        this.a(var4, (-128 & ((l) this).field_o[var4]) - -var6, (byte) -78);
                        break L33;
                      }
                    }
                    return;
                  } else {
                    if (var3_int == 192) {
                      var4 = 15 & param0;
                      var5 = (32618 & param0) >> -191040664;
                      this.a(var4, true, ((l) this).field_l[var4] + var5);
                      return;
                    } else {
                      if (208 != var3_int) {
                        if (var3_int == 224) {
                          var4 = 15 & param0;
                          var5 = (16256 & param0 >> -552766903) - -((param0 & 32646) >> 1410708424);
                          this.a(var4, (byte) 109, var5);
                          return;
                        } else {
                          var3_int = param0 & 255;
                          if (var3_int == 255) {
                            this.a(true, -121);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      } else {
                        var4 = 15 & param0;
                        var5 = (32632 & param0) >> 782248;
                        this.b(var4, var5, 98);
                        return;
                      }
                    }
                  }
                } else {
                  var4 = param0 & 15;
                  var5 = (32529 & param0) >> 1562020776;
                  var6 = (param0 & 8342767) >> -1285687664;
                  this.a(var6, (byte) -104, var4, var5);
                  return;
                }
              }
            } else {
              var4 = 15 & param0;
              var5 = 127 & param0 >> 1905501992;
              var6 = (8386231 & param0) >> -194080496;
              this.a(var5, var4, var6, 0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "l.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 < 0) {
              param1 = 0;
              L1: while (true) {
                L2: {
                  if (16 <= param1) {
                    break L2;
                  } else {
                    this.a((byte) 91, param1);
                    param1++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              L3: {
                ((l) this).field_L[param1] = 12800;
                ((l) this).field_A[param1] = 8192;
                if (param0 > 86) {
                  break L3;
                } else {
                  this.e(27, 5);
                  break L3;
                }
              }
              ((l) this).field_y[param1] = 16383;
              ((l) this).field_D[param1] = 8192;
              ((l) this).field_m[param1] = 0;
              ((l) this).field_z[param1] = 8192;
              this.d(-50, param1);
              this.e(28583, param1);
              ((l) this).field_M[param1] = 0;
              ((l) this).field_J[param1] = 32767;
              ((l) this).field_F[param1] = 256;
              ((l) this).field_q[param1] = 0;
              this.a(param1, 8192, (byte) -78);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "l.P(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 55) {
                break L1;
              } else {
                this.e(61, 49);
                break L1;
              }
            }
            ((l) this).field_H = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "l.N(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(qua param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param2 == 80) {
              ((l) this).a(param1, param0, (byte) 40, true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("l.RA(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -78) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            ((l) this).field_o[param0] = param1;
            ((l) this).field_u[param0] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "l.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        rta var5 = null;
        rta var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = ((l) this).field_I[param1][param0];
            if (null != var5) {
              L1: {
                L2: {
                  ((l) this).field_I[param1][param0] = null;
                  if ((((l) this).field_M[param1] & 2) == param3) {
                    break L2;
                  } else {
                    var6 = (rta) (Object) ((l) this).field_v.field_l.f(param3 ^ -80);
                    L3: while (true) {
                      L4: {
                        if (var6 == null) {
                          break L4;
                        } else {
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L5: {
                              if (var6.field_k != var5.field_k) {
                                break L5;
                              } else {
                                if (var6.field_t >= 0) {
                                  break L5;
                                } else {
                                  if (var6 != var5) {
                                    var5.field_t = 0;
                                    if (var7 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            var6 = (rta) (Object) ((l) this).field_v.field_l.e(param3 ^ 113);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5.field_t = 0;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param2 == 20048) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            var3_int = param0 >>> 668604952;
            var4 = 255 - var3_int;
            param0 = (var3_int * (param0 & 16711935) & -16711936 | var3_int * (65280 & param0) & 16711680) >>> 558960136;
            stackOut_3_0 = ((var4 * (param1 & 65280) & 16711680 | -16711936 & var4 * (16711935 & param1)) >>> 1407866984) + param0;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "l.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.b(-1, 47);
                break L1;
              }
            }
            L2: {
              L3: {
                if (~((l) this).field_k[param0] == ~param2) {
                  break L3;
                } else {
                  ((l) this).field_k[param0] = param2;
                  var4_int = 0;
                  L4: while (true) {
                    if (var4_int >= 128) {
                      break L3;
                    } else {
                      ((l) this).field_n[param0][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "l.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 < -114) {
              L1: {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    this.b(true, -1);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(-1, 117);
                break L1;
              }
              this.a((byte) 110, -1);
              var3_int = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (var3_int >= 16) {
                      break L5;
                    } else {
                      ((l) this).field_k[var3_int] = ((l) this).field_O[var3_int];
                      var3_int++;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3_int = 0;
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var3_int >= 16) {
                        break L8;
                      } else {
                        ((l) this).field_l[var3_int] = sea.c(((l) this).field_O[var3_int], -128);
                        var3_int++;
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (var4 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    break L7;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "l.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void b(int param0) {
        try {
            this.a(-191040664, true);
            if (param0 != 2) {
                ((l) this).e(110);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.EA(" + param0 + ')');
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((l) this).field_w.g()) {
                break L1;
              } else {
                var4_int = ((l) this).field_w.field_e * ((l) this).field_H / kta.field_d;
                L2: while (true) {
                  L3: {
                    var5 = (long)var4_int * (long)param2 + ((l) this).field_E;
                    if (((l) this).field_B + -var5 >= 0L) {
                      ((l) this).field_E = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (int)((-1L + -((l) this).field_E + (((l) this).field_B - -(long)var4_int)) / (long)var4_int);
                  ((l) this).field_E = ((l) this).field_E + (long)var4_int * (long)var7;
                  ((l) this).field_v.b(param0, param1, var7);
                  param2 = param2 - var7;
                  this.d(125);
                  param1 = param1 + var7;
                  if (!((l) this).field_w.g()) {
                    break L1;
                  } else {
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            ((l) this).field_v.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("l.D(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 118) {
              stackOut_3_0 = ((l) this).field_G;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 11;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "l.UA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        rta var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_25_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackIn_26_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            if (param1 != var3.field_k) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (null == var3.field_x) {
                            break L6;
                          } else {
                            L7: {
                              var3.field_x.d(kta.field_d / 100);
                              if (!var3.field_x.m()) {
                                break L7;
                              } else {
                                ((l) this).field_v.field_m.a((cg) (Object) var3.field_x);
                                break L7;
                              }
                            }
                            var3.a(5806);
                            break L6;
                          }
                        }
                        L8: {
                          if (var3.field_t < 0) {
                            ((l) this).field_I[var3.field_k][var3.field_m] = null;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var3.p(100);
                        break L4;
                      }
                      var3 = (rta) (Object) ((l) this).field_v.field_l.e(118);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_25_0 = param0;
                stackIn_26_0 = stackOut_25_0 ? 1 : 0;
                break L2;
              }
              L9: {
                if (stackIn_26_0 == 1) {
                  break L9;
                } else {
                  this.a(-124, (byte) 75, -116, -85);
                  break L9;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((l) this).field_w.g()) {
                var2_int = ((l) this).field_H * ((l) this).field_w.field_e / kta.field_d;
                L2: while (true) {
                  L3: {
                    var3 = ((l) this).field_E + (long)var2_int * (long)param0;
                    if (-var3 + ((l) this).field_B >= 0L) {
                      ((l) this).field_E = var3;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var5 = (int)((-1L + (long)var2_int + (-((l) this).field_E + ((l) this).field_B)) / (long)var2_int);
                    ((l) this).field_E = ((l) this).field_E + (long)var5 * (long)var2_int;
                    param0 = param0 - var5;
                    ((l) this).field_v.a(var5);
                    this.d(124);
                    if (((l) this).field_w.g()) {
                      break L4;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((l) this).field_v.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "l.OA(" + param0 + ')');
        }
    }

    private final int a(int param0, rta param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -60) {
                break L1;
              } else {
                ((l) this).field_n = null;
                break L1;
              }
            }
            L2: {
              var3_int = (param1.field_u * param1.field_o >> -958014868) + param1.field_q;
              var3_int = var3_int + (((l) this).field_F[param1.field_k] * (-8192 + ((l) this).field_D[param1.field_k]) >> -1395067156);
              var4 = param1.field_v;
              if (0 >= var4.field_d) {
                break L2;
              } else {
                L3: {
                  if (var4.field_l > 0) {
                    break L3;
                  } else {
                    if (((l) this).field_m[param1.field_k] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_l << 1047049634;
                  var6 = var4.field_j << 947915329;
                  if (var6 > param1.field_l) {
                    var5 = param1.field_l * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((l) this).field_m[param1.field_k] >> 116899527);
                var7 = Math.sin((double)(511 & param1.field_p) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_n.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)kta.field_d + 0.5);
              if (var5 < 1) {
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_18_0 = var5;
                stackIn_21_0 = stackOut_18_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("l.NA(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_21_0;
    }

    private final void e(int param0, int param1) {
        RuntimeException runtimeException = null;
        rta var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((4 & ((l) this).field_M[param1]) == 0) {
                  break L2;
                } else {
                  var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
                  L3: while (true) {
                    if (null == var3) {
                      break L2;
                    } else {
                      stackOut_4_0 = ~var3.field_k;
                      stackOut_4_1 = ~param1;
                      stackIn_12_0 = stackOut_4_0;
                      stackIn_12_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L4;
                          } else {
                            var3.field_r = 0;
                            break L4;
                          }
                        }
                        var3 = (rta) (Object) ((l) this).field_v.field_l.e(126);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = param0;
              stackOut_11_1 = 28583;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L1;
            }
            L5: {
              if (stackIn_12_0 == stackIn_12_1) {
                break L5;
              } else {
                ((l) this).field_u = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        rta var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
              if (param1 >= 57) {
                break L1;
              } else {
                ((l) this).field_t = true;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (0 > param0) {
                            break L6;
                          } else {
                            if (param0 != var3.field_k) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (0 > var3.field_t) {
                          ((l) this).field_I[var3.field_k][var3.field_m] = null;
                          var3.field_t = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3 = (rta) (Object) ((l) this).field_v.field_l.e(110);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        try {
            int var5_int = -31 % ((-47 - param1) / 56);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "l.R()");
        }
        return stackIn_1_0;
    }

    final boolean a(rta param0, int[] param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        bq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_122_0 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_121_0 = 0;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_B = kta.field_d / 100;
              if (param0.field_t < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param0.field_x) {
                    break L2;
                  } else {
                    if (param0.field_x.e()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param0.a(5806);
                  param0.p(39);
                  if (param0.field_z <= 0) {
                    break L3;
                  } else {
                    if (param0 != ((l) this).field_n[param0.field_k][param0.field_z]) {
                      break L3;
                    } else {
                      ((l) this).field_n[param0.field_k][param0.field_z] = null;
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
            L4: {
              var6_int = param0.field_u;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((l) this).field_z[param0.field_k]) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param0.field_u = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param0.field_x.f(this.a(-74, param0));
              var7 = param0.field_v;
              param0.field_p = param0.field_p + var7.field_d;
              if (param3 == 6) {
                break L6;
              } else {
                this.c(94, 39);
                break L6;
              }
            }
            L7: {
              var8 = 0;
              param0.field_l = param0.field_l + 1;
              var9 = (double)((param0.field_m - 60 << -170084184) + (param0.field_u * param0.field_o >> 1032410028)) * 0.000005086263020833333;
              if (var7.field_n > 0) {
                L8: {
                  L9: {
                    if (var7.field_c <= 0) {
                      break L9;
                    } else {
                      param0.field_f = param0.field_f + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  param0.field_f = param0.field_f + 128;
                  break L8;
                }
                if (param0.field_f * var7.field_n >= 819200) {
                  var8 = 1;
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L10: {
              if (null != var7.field_m) {
                L11: {
                  L12: {
                    if (var7.field_i > 0) {
                      break L12;
                    } else {
                      param0.field_A = param0.field_A + 128;
                      if (var11 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  param0.field_A = param0.field_A + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_i) + 0.5);
                  break L11;
                }
                L13: while (true) {
                  L14: {
                    L15: {
                      if (var7.field_m.length + -2 <= param0.field_w) {
                        break L15;
                      } else {
                        stackOut_50_0 = ~param0.field_A;
                        stackOut_50_1 = ~((255 & var7.field_m[param0.field_w + 2]) << 714759784);
                        stackIn_58_0 = stackOut_50_0;
                        stackIn_58_1 = stackOut_50_1;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        if (var11 != 0) {
                          break L14;
                        } else {
                          if (stackIn_51_0 >= stackIn_51_1) {
                            break L15;
                          } else {
                            param0.field_w = param0.field_w + 2;
                            if (var11 == 0) {
                              continue L13;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    stackOut_57_0 = -2 + var7.field_m.length;
                    stackOut_57_1 = param0.field_w;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    break L14;
                  }
                  if (stackIn_58_0 != stackIn_58_1) {
                    break L10;
                  } else {
                    if (0 != var7.field_m[1 + param0.field_w]) {
                      break L10;
                    } else {
                      var8 = 1;
                      break L10;
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L16: {
              if (param0.field_t < 0) {
                break L16;
              } else {
                if (var7.field_g == null) {
                  break L16;
                } else {
                  if (0 != (1 & ((l) this).field_M[param0.field_k])) {
                    break L16;
                  } else {
                    L17: {
                      if (0 > param0.field_z) {
                        break L17;
                      } else {
                        if (param0 != ((l) this).field_n[param0.field_k][param0.field_z]) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (var7.field_f <= 0) {
                          break L19;
                        } else {
                          param0.field_t = param0.field_t + (int)(128.0 * Math.pow(2.0, (double)var7.field_f * var9) + 0.5);
                          if (var11 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      param0.field_t = param0.field_t + 128;
                      break L18;
                    }
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (-2 + var7.field_g.length <= param0.field_i) {
                            break L22;
                          } else {
                            stackOut_85_0 = 65280 & var7.field_g[param0.field_i + 2] << -1769636408;
                            stackOut_85_1 = param0.field_t;
                            stackIn_93_0 = stackOut_85_0;
                            stackIn_93_1 = stackOut_85_1;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (stackIn_86_0 >= stackIn_86_1) {
                                break L22;
                              } else {
                                param0.field_i = param0.field_i + 2;
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        stackOut_92_0 = param0.field_i;
                        stackOut_92_1 = -2 + var7.field_g.length;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        break L21;
                      }
                      if (stackIn_93_0 == stackIn_93_1) {
                        var8 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L23: {
                L24: {
                  param0.field_x.d(param0.field_B);
                  if (param1 != null) {
                    break L24;
                  } else {
                    param0.field_x.a(param4);
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                param0.field_x.b(param1, param2, param4);
                break L23;
              }
              L25: {
                if (param0.field_x.m()) {
                  ((l) this).field_v.field_m.a((cg) (Object) param0.field_x);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                param0.a(param3 ^ 5800);
                if (param0.field_t >= 0) {
                  param0.p(69);
                  if (param0.field_z <= 0) {
                    break L26;
                  } else {
                    if (param0 == ((l) this).field_n[param0.field_k][param0.field_z]) {
                      ((l) this).field_n[param0.field_k][param0.field_z] = null;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                } else {
                  break L26;
                }
              }
              stackOut_119_0 = 1;
              stackIn_120_0 = stackOut_119_0;
              return stackIn_120_0 != 0;
            } else {
              param0.field_x.a(param0.field_B, this.a(param0, 83), this.b(-2421, param0));
              stackOut_121_0 = 0;
              stackIn_122_0 = stackOut_121_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var6;
            stackOut_123_1 = new StringBuilder().append("l.MA(");
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param0 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L27;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L27;
            }
          }
          L28: {
            stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
            stackOut_127_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_127_2).append(',');
            stackIn_130_0 = stackOut_127_0;
            stackIn_130_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param1 == null) {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "null";
              stackIn_131_0 = stackOut_130_0;
              stackIn_131_1 = stackOut_130_1;
              stackIn_131_2 = stackOut_130_2;
              break L28;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_131_0 = stackOut_128_0;
              stackIn_131_1 = stackOut_128_1;
              stackIn_131_2 = stackOut_128_2;
              break L28;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_131_0, stackIn_131_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_122_0 != 0;
    }

    final synchronized cg b() {
        RuntimeException var1 = null;
        et stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        et stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((l) this).field_v;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "l.G()");
        }
        return (cg) (Object) stackIn_1_0;
    }

    final synchronized void e(int param0) {
        RuntimeException runtimeException = null;
        tn var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = (tn) (Object) ((l) this).field_r.d(param0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.a(false);
                    var2 = (tn) (Object) ((l) this).field_r.c(param0 ^ 20806);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "l.TA(" + param0 + ')');
        }
    }

    final synchronized boolean a(int param0, qua param1, cn param2, nda param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        jk var8 = null;
        int var9 = 0;
        tn var10 = null;
        int var11 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (0 < param0) {
                var7 = (Object) (Object) new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (jk) (Object) param1.field_f.d(param4);
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var8 == null) {
                      break L5;
                    } else {
                      var9 = (int)var8.field_d;
                      var10 = (tn) (Object) ((l) this).field_r.a((byte) -97, (long)var9);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (null != var10) {
                              break L7;
                            } else {
                              L8: {
                                var10 = rb.a(param2, var9, 15);
                                if (null == var10) {
                                  var6_int = 0;
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              ((l) this).field_r.a((long)var9, 102, (vg) (Object) var10);
                              break L7;
                            }
                          }
                          if (!var10.a(param4 + -5853, var8.field_f, param3, (int[]) var7)) {
                            var6_int = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 = (jk) (Object) param1.field_f.c(param4 ^ 20806);
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
                param1.a();
                break L3;
              }
              stackOut_26_0 = var6_int;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("l.HA(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param4 + ')');
        }
        return stackIn_27_0 != 0;
    }

    synchronized void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -105) {
                break L1;
              } else {
                this.b(-101, 68);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param2 < 0) {
                    break L4;
                  } else {
                    ((l) this).field_N[param2] = param1;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_int = 0;
                L5: while (true) {
                  if (var4_int >= 16) {
                    break L3;
                  } else {
                    ((l) this).field_N[var4_int] = param1;
                    var4_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "l.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        try {
            ((l) this).field_D[param0] = param2;
            if (param1 <= 75) {
                int discarded$0 = this.b(-126, (rta) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 109) {
                break L1;
              } else {
                ((l) this).field_s = false;
                break L1;
              }
            }
            L2: {
              var2_int = ((l) this).field_j;
              var3 = ((l) this).field_p;
              var4 = ((l) this).field_B;
              if (((l) this).field_x == null) {
                break L2;
              } else {
                if (~var3 != ~((l) this).field_C) {
                  break L2;
                } else {
                  ((l) this).a(((l) this).field_t, ((l) this).field_x, (byte) 40, ((l) this).field_s);
                  this.d(111);
                  return;
                }
              }
            }
            L3: while (true) {
              stackOut_10_0 = var3;
              stackOut_10_1 = ((l) this).field_p;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_12_0 = ((l) this).field_w.field_a[var2_int];
                          stackOut_12_1 = var3;
                          stackIn_44_0 = stackOut_12_0;
                          stackIn_44_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L9;
                              } else {
                                ((l) this).field_w.e(var2_int);
                                var6 = ((l) this).field_w.b(var2_int);
                                stackOut_14_0 = var6;
                                stackOut_14_1 = 1;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_15_0 == stackIn_15_1) {
                                    L10: {
                                      ((l) this).field_w.e();
                                      ((l) this).field_w.f(var2_int);
                                      if (((l) this).field_w.d()) {
                                        break L10;
                                      } else {
                                        if (var7 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (((l) this).field_x == null) {
                                      L11: {
                                        if (!((l) this).field_t) {
                                          break L11;
                                        } else {
                                          if (var3 != 0) {
                                            ((l) this).field_w.a(var4);
                                            if (var7 == 0) {
                                              break L9;
                                            } else {
                                              break L11;
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      this.a(true, -127);
                                      ((l) this).field_w.a();
                                      return;
                                    } else {
                                      ((l) this).a(((l) this).field_x, ((l) this).field_t, (byte) 80);
                                      this.d(119);
                                      return;
                                    }
                                  } else {
                                    L12: {
                                      if (0 != (var6 & 128)) {
                                        this.c(var6, 128);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    ((l) this).field_w.c(var2_int);
                                    ((l) this).field_w.f(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((l) this).field_w.f();
                            var3 = ((l) this).field_w.field_a[var2_int];
                            var4 = ((l) this).field_w.d(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((l) this).field_p = var3;
                    ((l) this).field_B = var4;
                    ((l) this).field_j = var2_int;
                    if (((l) this).field_x == null) {
                      break L5;
                    } else {
                      stackOut_42_0 = ~((l) this).field_C;
                      stackOut_42_1 = ~var3;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      break L6;
                    }
                  }
                  if (stackIn_44_0 > stackIn_44_1) {
                    ((l) this).field_j = -1;
                    ((l) this).field_p = ((l) this).field_C;
                    ((l) this).field_B = ((l) this).field_w.d(((l) this).field_p);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "l.I(" + param0 + ')');
        }
    }

    final synchronized cg c() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "l.Q()");
        }
        return (cg) (Object) stackIn_1_0;
    }

    private final void b(int param0, int param1, int param2) {
        try {
            if (param2 != 98) {
                boolean discarded$0 = ((l) this).a((byte) 90);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            this.a(-191040664, param3);
            ((l) this).field_w.a(param1.field_g);
            ((l) this).field_E = 0L;
            ((l) this).field_t = param0;
            var5_int = ((l) this).field_w.c();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var5_int >= ~var6) {
                    break L3;
                  } else {
                    ((l) this).field_w.e(var6);
                    ((l) this).field_w.c(var6);
                    ((l) this).field_w.f(var6);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((l) this).field_j = ((l) this).field_w.f();
                ((l) this).field_p = ((l) this).field_w.field_a[((l) this).field_j];
                break L2;
              }
              if (param2 == 40) {
                ((l) this).field_B = ((l) this).field_w.d(((l) this).field_p);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("l.B(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 101) {
                break L1;
              } else {
                ((l) this).field_u = null;
                break L1;
              }
            }
            ((l) this).field_O[param0] = param2;
            ((l) this).field_l[param0] = sea.c(-128, param2);
            this.a(param0, true, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var4, "l.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        tn var5_ref = null;
        rta var5_ref2 = null;
        u var6 = null;
        int var6_int = 0;
        rta var7 = null;
        rta var8 = null;
        int var9 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        rta stackIn_21_2 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        rta stackIn_23_2 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        rta stackIn_25_2 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        rta stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        rta stackOut_20_2 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        rta stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        rta stackOut_21_2 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        rta stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param0, param2, 64, 0);
              if ((((l) this).field_M[param2] & 2) == 0) {
                break L1;
              } else {
                var5_ref2 = (rta) (Object) ((l) this).field_v.field_l.b(param1 + 3);
                L2: while (true) {
                  if (null == var5_ref2) {
                    break L1;
                  } else {
                    L3: {
                      if (~param2 != ~var5_ref2.field_k) {
                        break L3;
                      } else {
                        if (var5_ref2.field_t < 0) {
                          ((l) this).field_I[param2][var5_ref2.field_m] = null;
                          ((l) this).field_I[param2][param0] = var5_ref2;
                          var6_int = (var5_ref2.field_o * var5_ref2.field_u >> 1566704172) + var5_ref2.field_q;
                          var5_ref2.field_q = var5_ref2.field_q + (-var5_ref2.field_m + param0 << 1667267208);
                          var5_ref2.field_o = var6_int + -var5_ref2.field_q;
                          var5_ref2.field_m = param0;
                          var5_ref2.field_u = 4096;
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5_ref2 = (rta) (Object) ((l) this).field_v.field_l.a(-1);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var5_ref = (tn) (Object) ((l) this).field_r.a((byte) -117, (long)((l) this).field_k[param2]);
            if (var5_ref == null) {
              return;
            } else {
              var6 = var5_ref.field_h[param0];
              if (null != var6) {
                L4: {
                  L5: {
                    var7 = new rta();
                    var7.field_k = param2;
                    var7.field_y = var5_ref;
                    var7.field_n = var6;
                    var7.field_v = var5_ref.field_m[param0];
                    var7.field_z = var5_ref.field_f[param0];
                    var7.field_m = param0;
                    var7.field_s = 1024 + var5_ref.field_j[param0] * var5_ref.field_i * (param3 * param3) >> 755563179;
                    var7.field_h = var5_ref.field_l[param0] & 255;
                    var7.field_q = (param0 << -1935695896) + -(32767 & var5_ref.field_g[param0]);
                    var7.field_t = -1;
                    var7.field_i = 0;
                    var7.field_w = param1;
                    var7.field_A = 0;
                    var7.field_f = 0;
                    if (0 == ((l) this).field_q[param2]) {
                      break L5;
                    } else {
                      L6: {
                        var7.field_x = qia.a(var6, this.a(-101, var7), 0, this.b(-2421, var7));
                        stackOut_20_0 = this;
                        stackOut_20_1 = 95;
                        stackOut_20_2 = (rta) var7;
                        stackIn_25_0 = stackOut_20_0;
                        stackIn_25_1 = stackOut_20_1;
                        stackIn_25_2 = stackOut_20_2;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        if (0 <= var5_ref.field_g[param0]) {
                          stackOut_25_0 = this;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = (rta) (Object) stackIn_25_2;
                          stackOut_25_3 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          stackIn_26_3 = stackOut_25_3;
                          break L6;
                        } else {
                          stackOut_21_0 = this;
                          stackOut_21_1 = stackIn_21_1;
                          stackOut_21_2 = (rta) (Object) stackIn_21_2;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          stackIn_23_2 = stackOut_21_2;
                          stackOut_23_0 = this;
                          stackOut_23_1 = stackIn_23_1;
                          stackOut_23_2 = (rta) (Object) stackIn_23_2;
                          stackOut_23_3 = 1;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_26_1 = stackOut_23_1;
                          stackIn_26_2 = stackOut_23_2;
                          stackIn_26_3 = stackOut_23_3;
                          break L6;
                        }
                      }
                      ((l) this).a((byte) stackIn_26_1, stackIn_26_2, stackIn_26_3 != 0);
                      if (var9 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7.field_x = qia.a(var6, this.a(param1 + -71, var7), this.a(var7, 113), this.b(-2421, var7));
                  break L4;
                }
                L7: {
                  if (0 <= var5_ref.field_g[param0]) {
                    break L7;
                  } else {
                    var7.field_x.b(-1);
                    break L7;
                  }
                }
                L8: {
                  if (var7.field_z < 0) {
                    break L8;
                  } else {
                    L9: {
                      var8 = ((l) this).field_n[param2][var7.field_z];
                      if (var8 == null) {
                        break L9;
                      } else {
                        if (0 > var8.field_t) {
                          ((l) this).field_I[param2][var8.field_m] = null;
                          var8.field_t = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((l) this).field_n[param2][var7.field_z] = var7;
                    break L8;
                  }
                }
                ((l) this).field_v.field_l.b((byte) -68, (vg) (Object) var7);
                ((l) this).field_I[param2][param0] = var7;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "l.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        ((l) this).field_w.a();
        if (param0 != -191040664) {
            return;
        }
        try {
            ((l) this).field_x = null;
            this.a(param1, -124);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, rta param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_n.field_i.length;
                var6 = -81 / ((param0 - 45) / 49);
                if (!param2) {
                  break L2;
                } else {
                  if (!param1.field_n.field_h) {
                    break L2;
                  } else {
                    L3: {
                      var7 = -param1.field_n.field_k + var4_int + var4_int;
                      var5 = (int)((long)((l) this).field_q[param1.field_k] * (long)var7 >> 1942271174);
                      var4_int = var4_int << 8;
                      if (var5 >= var4_int) {
                        var5 = -var5 + (var4_int + (var4_int - 1));
                        param1.field_x.a(true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)((l) this).field_q[param1.field_k] * (long)var4_int >> 1881930054);
              break L1;
            }
            param1.field_x.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("l.S(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    protected l() {
        ((l) this).field_l = new int[16];
        ((l) this).field_q = new int[16];
        ((l) this).field_J = new int[16];
        ((l) this).field_F = new int[16];
        ((l) this).field_M = new int[16];
        ((l) this).field_o = new int[16];
        ((l) this).field_n = new rta[16][128];
        ((l) this).field_k = new int[16];
        ((l) this).field_z = new int[16];
        ((l) this).field_m = new int[16];
        ((l) this).field_y = new int[16];
        ((l) this).field_u = new int[16];
        ((l) this).field_A = new int[16];
        ((l) this).field_I = new rta[16][128];
        ((l) this).field_D = new int[16];
        ((l) this).field_N = new int[16];
        ((l) this).field_G = 256;
        ((l) this).field_O = new int[16];
        ((l) this).field_H = 1000000;
        ((l) this).field_L = new int[16];
        ((l) this).field_w = new maa();
        ((l) this).field_v = new et((l) this);
        try {
            ((l) this).field_r = new ji(128);
            ((l) this).a((byte) -105, 256, -1);
            this.a(true, -116);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.<init>()");
        }
    }

    l(l param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((l) this).field_l = new int[16];
        ((l) this).field_q = new int[16];
        ((l) this).field_J = new int[16];
        ((l) this).field_F = new int[16];
        ((l) this).field_M = new int[16];
        ((l) this).field_o = new int[16];
        ((l) this).field_n = new rta[16][128];
        ((l) this).field_k = new int[16];
        ((l) this).field_z = new int[16];
        ((l) this).field_m = new int[16];
        ((l) this).field_y = new int[16];
        ((l) this).field_u = new int[16];
        ((l) this).field_A = new int[16];
        ((l) this).field_I = new rta[16][128];
        ((l) this).field_D = new int[16];
        ((l) this).field_N = new int[16];
        ((l) this).field_G = 256;
        ((l) this).field_O = new int[16];
        ((l) this).field_H = 1000000;
        ((l) this).field_L = new int[16];
        ((l) this).field_w = new maa();
        ((l) this).field_v = new et((l) this);
        try {
          L0: {
            ((l) this).field_r = param0.field_r;
            ((l) this).a((byte) -105, 256, -1);
            this.a(true, -119);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("l.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
    }
}
