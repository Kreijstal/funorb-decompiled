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
        this.c(param1, 125, param0);
        if (param2 != 32460) {
            this.field_E = -39L;
        }
    }

    private final int b(int param0, rta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param0 == -2421) {
                break L1;
              } else {
                this.field_t = true;
                break L1;
              }
            }
            var3_int = this.field_A[param1.field_k];
            if (-8193 >= (var3_int ^ -1)) {
              stackOut_5_0 = 16384 - ((128 + -param1.field_h) * (-var3_int + 16384) + 32 >> 930921414);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = var3_int * param1.field_h + 32 >> 536272166;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("l.VA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -70) {
            this.a((byte) -3, 35, 27);
        }
        return this.field_w.g();
    }

    private final int a(rta param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bq var9 = null;
        bq var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (0 == this.field_N[param0.field_k]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param0.field_v;
              var10 = var9;
              var4 = 4096 + this.field_L[param0.field_k] * this.field_y[param0.field_k] >> 2142953485;
              var4 = 16384 + var4 * var4 >> 1165242863;
              var4 = param0.field_s * var4 - -16384 >> 1147635983;
              if (param1 >= 71) {
                L1: {
                  var4 = this.field_G * var4 + 128 >> 1726470600;
                  var4 = var4 * this.field_N[param0.field_k] + 128 >> 1564133480;
                  if ((var10.field_n ^ -1) < -1) {
                    var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_f * (double)var10.field_n) * (double)var4);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != var10.field_m) {
                    L3: {
                      var5 = param0.field_A;
                      var6 = var10.field_m[param0.field_w + 1];
                      if ((param0.field_w ^ -1) <= (var10.field_m.length - 2 ^ -1)) {
                        break L3;
                      } else {
                        var7 = 65280 & var9.field_m[param0.field_w] << 545752456;
                        var8 = var10.field_m[2 + param0.field_w] << -1923086264 & 65280;
                        var6 = var6 + (var5 - var7) * (-var6 + var10.field_m[3 + param0.field_w]) / (var8 - var7);
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
                    if (null == var10.field_g) {
                      break L4;
                    } else {
                      L5: {
                        var5 = param0.field_t;
                        var6 = var10.field_g[1 + param0.field_i];
                        if ((-2 + var10.field_g.length ^ -1) >= (param0.field_i ^ -1)) {
                          break L5;
                        } else {
                          var7 = (var9.field_g[param0.field_i] & 255) << 128787848;
                          var8 = (var10.field_g[param0.field_i - -2] & 255) << -1160193112;
                          var6 = var6 + (var5 + -var7) * (var10.field_g[param0.field_i + 3] - var6) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> 5484518;
                      break L4;
                    }
                  }
                }
                stackOut_20_0 = var4;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = -110;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("l.KA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_21_0;
          }
        }
    }

    final synchronized void a(int param0, int param1) {
        int var3 = 87 / ((param1 - 53) / 54);
        this.field_G = param0;
    }

    final boolean c(int param0, rta param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1.field_x != null) {
              L1: {
                if (param0 == 15) {
                  break L1;
                } else {
                  this.field_y = (int[]) null;
                  break L1;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param1.field_t >= 0) {
                L2: {
                  param1.p(70);
                  if (param1.field_z <= 0) {
                    break L2;
                  } else {
                    if (this.field_n[param1.field_k][param1.field_z] != param1) {
                      break L2;
                    } else {
                      this.field_n[param1.field_k][param1.field_z] = null;
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("l.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void c(int param0) {
        ha discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = l.a(8, -95, (java.awt.Canvas) null, (d) null, -74);
        }
        field_K = null;
    }

    private final void d(int param0, int param1) {
        boolean discarded$2 = false;
        rta var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        L0: {
          L1: {
            var4 = TombRacer.field_G ? 1 : 0;
            if (-1 == (this.field_M[param1] & 2 ^ -1)) {
              break L1;
            } else {
              var3 = (rta) ((Object) this.field_v.field_l.f(-80));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = param1;
                  stackOut_3_1 = var3.field_k;
                  stackIn_11_0 = stackOut_3_0;
                  stackIn_11_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0 != stackIn_4_1) {
                        break L3;
                      } else {
                        if (this.field_I[param1][var3.field_m] != null) {
                          break L3;
                        } else {
                          if (0 > var3.field_t) {
                            var3.field_t = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var3 = (rta) ((Object) this.field_v.field_l.e(123));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_10_0 = param0;
          stackOut_10_1 = -44;
          stackIn_11_0 = stackOut_10_0;
          stackIn_11_1 = stackOut_10_1;
          break L0;
        }
        L4: {
          if (stackIn_11_0 <= stackIn_11_1) {
            break L4;
          } else {
            discarded$2 = this.a((byte) -62);
            break L4;
          }
        }
    }

    final static ha a(int param0, int param1, java.awt.Canvas param2, d param3, int param4) {
        RuntimeException var5 = null;
        sfa stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        sfa stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              if (param1 == 127) {
                break L1;
              } else {
                l.c(-1);
                break L1;
              }
            }
            stackOut_2_0 = new sfa(param2, param3, param4, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("l.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return (ha) ((Object) stackIn_3_0);
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var3 = 240 & param0;
        if (var3 != param1) {
          L0: {
            if (144 == var3) {
              L1: {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 319810664;
                var6 = (param0 & 8342499) >> -1781627344;
                if ((var6 ^ -1) < -1) {
                  break L1;
                } else {
                  this.a(var5, var4, 64, 0);
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.b(var5, 0, var4, var6);
              return;
            } else {
              if (var3 != 160) {
                if (var3 == 176) {
                  L2: {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> -252458360;
                    var6 = (param0 & 8338047) >> 1496635216;
                    if (-1 == (var5 ^ -1)) {
                      this.field_l[var4] = sea.c(this.field_l[var4], -2080769) + (var6 << -254918226);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 32) {
                      break L3;
                    } else {
                      this.field_l[var4] = sea.c(-16257, this.field_l[var4]) + (var6 << -2075111449);
                      break L3;
                    }
                  }
                  L4: {
                    if (-2 != (var5 ^ -1)) {
                      break L4;
                    } else {
                      this.field_m[var4] = sea.c(this.field_m[var4], -16257) - -(var6 << 164820807);
                      break L4;
                    }
                  }
                  L5: {
                    if (-34 != (var5 ^ -1)) {
                      break L5;
                    } else {
                      this.field_m[var4] = sea.c(this.field_m[var4], -128) + var6;
                      break L5;
                    }
                  }
                  L6: {
                    if (5 != var5) {
                      break L6;
                    } else {
                      this.field_z[var4] = sea.c(-16257, this.field_z[var4]) + (var6 << 1304862823);
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) != -38) {
                      break L7;
                    } else {
                      this.field_z[var4] = sea.c(-128, this.field_z[var4]) + var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (-8 != (var5 ^ -1)) {
                      break L8;
                    } else {
                      this.field_L[var4] = sea.c(-16257, this.field_L[var4]) - -(var6 << 947120423);
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 != 39) {
                      break L9;
                    } else {
                      this.field_L[var4] = var6 + sea.c(this.field_L[var4], -128);
                      break L9;
                    }
                  }
                  L10: {
                    if (10 == var5) {
                      this.field_A[var4] = (var6 << 1378075559) + sea.c(-16257, this.field_A[var4]);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) != -43) {
                      break L11;
                    } else {
                      this.field_A[var4] = var6 + sea.c(-128, this.field_A[var4]);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 != 11) {
                      break L12;
                    } else {
                      this.field_y[var4] = sea.c(this.field_y[var4], -16257) + (var6 << -27385433);
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 43) {
                      this.field_y[var4] = var6 + sea.c(-128, this.field_y[var4]);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-65 == (var5 ^ -1)) {
                      L15: {
                        if ((var6 ^ -1) <= -65) {
                          break L15;
                        } else {
                          this.field_M[var4] = sea.c(this.field_M[var4], -2);
                          if (var8 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_M[var4] = fh.a(this.field_M[var4], 1);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    if (var5 == 65) {
                      L17: {
                        if (var6 >= 64) {
                          break L17;
                        } else {
                          this.d(-108, var4);
                          this.field_M[var4] = sea.c(this.field_M[var4], -3);
                          if (var8 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      this.field_M[var4] = fh.a(this.field_M[var4], 2);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if ((var5 ^ -1) != -100) {
                      break L18;
                    } else {
                      this.field_J[var4] = sea.c(127, this.field_J[var4]) - -(var6 << -553288505);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 98) {
                      break L19;
                    } else {
                      this.field_J[var4] = var6 + sea.c(this.field_J[var4], 16256);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 101) {
                      break L20;
                    } else {
                      this.field_J[var4] = (var6 << -1897740761) + sea.c(this.field_J[var4], 127) + 16384;
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 != 100) {
                      break L21;
                    } else {
                      this.field_J[var4] = 16384 + (sea.c(this.field_J[var4], 16256) + var6);
                      break L21;
                    }
                  }
                  L22: {
                    if ((var5 ^ -1) != -121) {
                      break L22;
                    } else {
                      this.b(true, var4);
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 != 121) {
                      break L23;
                    } else {
                      this.a((byte) 101, var4);
                      break L23;
                    }
                  }
                  L24: {
                    if (var5 == 123) {
                      this.b(var4, 92);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if ((var5 ^ -1) != -7) {
                      break L25;
                    } else {
                      var7 = this.field_J[var4];
                      if (var7 != 16384) {
                        break L25;
                      } else {
                        this.field_F[var4] = (var6 << -1418123097) + sea.c(this.field_F[var4], -16257);
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) == -39) {
                      var7 = this.field_J[var4];
                      if (16384 != var7) {
                        break L26;
                      } else {
                        this.field_F[var4] = sea.c(this.field_F[var4], -128) - -var6;
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if ((var5 ^ -1) == -17) {
                      this.field_q[var4] = (var6 << -265445209) + sea.c(-16257, this.field_q[var4]);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (48 != var5) {
                      break L28;
                    } else {
                      this.field_q[var4] = var6 + sea.c(this.field_q[var4], -128);
                      break L28;
                    }
                  }
                  L29: {
                    if (81 != var5) {
                      break L29;
                    } else {
                      L30: {
                        if (var6 >= 64) {
                          break L30;
                        } else {
                          this.e(28583, var4);
                          this.field_M[var4] = sea.c(this.field_M[var4], -5);
                          if (var8 == 0) {
                            break L29;
                          } else {
                            break L30;
                          }
                        }
                      }
                      this.field_M[var4] = fh.a(this.field_M[var4], 4);
                      break L29;
                    }
                  }
                  L31: {
                    if (var5 == 17) {
                      this.a(var4, (-16257 & this.field_o[var4]) + (var6 << -27648857), (byte) -78);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  if (-50 != (var5 ^ -1)) {
                    break L0;
                  } else {
                    this.a(var4, (-128 & this.field_o[var4]) - -var6, (byte) -78);
                    return;
                  }
                } else {
                  if ((var3 ^ -1) == -193) {
                    var4 = 15 & param0;
                    var5 = (32618 & param0) >> -191040664;
                    this.a(var4, true, this.field_l[var4] + var5);
                    return;
                  } else {
                    if (208 != var3) {
                      if (-225 == (var3 ^ -1)) {
                        var4 = 15 & param0;
                        var5 = (16256 & param0 >> -552766903) - -((param0 & 32646) >> 1410708424);
                        this.a(var4, (byte) 109, var5);
                        return;
                      } else {
                        var3 = param0 & 255;
                        if ((var3 ^ -1) == -256) {
                          this.a(true, -121);
                          return;
                        } else {
                          return;
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
          }
          return;
        } else {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 1905501992;
          var6 = (8386231 & param0) >> -194080496;
          this.a(var5, var4, var6, 0);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) > -1) {
          param1 = 0;
          L0: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a((byte) 91, param1);
              param1++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          L1: {
            this.field_L[param1] = 12800;
            this.field_A[param1] = 8192;
            if (param0 > 86) {
              break L1;
            } else {
              this.e(27, 5);
              break L1;
            }
          }
          this.field_y[param1] = 16383;
          this.field_D[param1] = 8192;
          this.field_m[param1] = 0;
          this.field_z[param1] = 8192;
          this.d(-50, param1);
          this.e(28583, param1);
          this.field_M[param1] = 0;
          this.field_J[param1] = 32767;
          this.field_F[param1] = 256;
          this.field_q[param1] = 0;
          this.a(param1, 8192, (byte) -78);
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 55) {
            this.e(61, 49);
        }
        this.field_H = param0;
    }

    final synchronized void a(qua param0, boolean param1, byte param2) {
        if (param2 != 80) {
            return;
        }
        try {
            this.a(param1, param0, (byte) 40, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "l.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != -78) {
            field_K = (jea) null;
        }
        this.field_o[param0] = param1;
        this.field_u[param0] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        rta var6 = null;
        int var7 = 0;
        rta var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.field_I[param1][param0];
        if (var8 != null) {
          L0: {
            L1: {
              this.field_I[param1][param0] = null;
              if ((this.field_M[param1] & 2) == param3) {
                break L1;
              } else {
                var6 = (rta) ((Object) this.field_v.field_l.f(param3 ^ -80));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L0;
                      } else {
                        L4: {
                          if (var6.field_k != var8.field_k) {
                            break L4;
                          } else {
                            if ((var6.field_t ^ -1) <= -1) {
                              break L4;
                            } else {
                              if (var6 != var8) {
                                var8.field_t = 0;
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var6 = (rta) ((Object) this.field_v.field_l.e(param3 ^ 113));
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8.field_t = 0;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 20048) {
            field_K = (jea) null;
        }
        int var3 = param0 >>> 668604952;
        int var4 = 255 - var3;
        param0 = (var3 * (param0 & 16711935) & -16711936 | var3 * (65280 & param0) & 16711680) >>> 558960136;
        return ((var4 * (param1 & 65280) & 16711680 | -16711936 & var4 * (16711935 & param1)) >>> 1407866984) + param0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            this.b(-1, 47);
            break L0;
          }
        }
        L1: {
          if ((this.field_k[param0] ^ -1) == (param2 ^ -1)) {
            break L1;
          } else {
            this.field_k[param0] = param2;
            var4 = 0;
            L2: while (true) {
              if (-129 >= (var4 ^ -1)) {
                break L1;
              } else {
                this.field_n[param0][var4] = null;
                var4++;
                if (var5 != 0) {
                  break L1;
                } else {
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < -114) {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                this.b(true, -1);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.b(-1, 117);
            break L0;
          }
          this.a((byte) 110, -1);
          var3 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if (var3 >= 16) {
                  break L4;
                } else {
                  this.field_k[var3] = this.field_O[var3];
                  var3++;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var3 = 0;
              break L3;
            }
            L5: while (true) {
              L6: {
                if ((var3 ^ -1) <= -17) {
                  break L6;
                } else {
                  this.field_l[var3] = sea.c(this.field_O[var3], -128);
                  var3++;
                  if (var4 != 0) {
                    break L6;
                  } else {
                    if (var4 == 0) {
                      continue L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void b(int param0) {
        this.a(-191040664, true);
        if (param0 != 2) {
            this.e(110);
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_w.g()) {
                  break L2;
                } else {
                  var4_int = this.field_w.field_e * this.field_H / kta.field_d;
                  L3: while (true) {
                    L4: {
                      var5 = (long)var4_int * (long)param2 + this.field_E;
                      if (this.field_B + -var5 >= 0L) {
                        this.field_E = var5;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var7 = (int)((-1L + -this.field_E + (this.field_B - -(long)var4_int)) / (long)var4_int);
                    this.field_E = this.field_E + (long)var4_int * (long)var7;
                    this.field_v.b(param0, param1, var7);
                    param2 = param2 - var7;
                    this.d(125);
                    param1 = param1 + var7;
                    if (!this.field_w.g()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        this.field_v.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_v.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("l.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 <= 118) {
            return 11;
        }
        return this.field_G;
    }

    private final void b(boolean param0, int param1) {
        rta var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_15_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (rta) ((Object) this.field_v.field_l.f(-80));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = param1;
                stackIn_16_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 < 0) {
                        break L4;
                      } else {
                        if (param1 != var3.field_k) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (null == var3.field_x) {
                        break L5;
                      } else {
                        L6: {
                          var3.field_x.d(kta.field_d / 100);
                          if (!var3.field_x.m()) {
                            break L6;
                          } else {
                            this.field_v.field_m.a(var3.field_x);
                            break L6;
                          }
                        }
                        var3.a(5806);
                        break L5;
                      }
                    }
                    L7: {
                      if (-1 < (var3.field_t ^ -1)) {
                        this.field_I[var3.field_k][var3.field_m] = null;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var3.p(100);
                    break L3;
                  }
                  var3 = (rta) ((Object) this.field_v.field_l.e(118));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_15_0 = param0;
            stackIn_16_0 = stackOut_15_0 ? 1 : 0;
            break L1;
          }
          L8: {
            if (stackIn_16_0 == 1) {
              break L8;
            } else {
              this.a(-124, (byte) 75, -116, -85);
              break L8;
            }
          }
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            if (this.field_w.g()) {
              var2 = this.field_H * this.field_w.field_e / kta.field_d;
              L2: while (true) {
                L3: {
                  var3 = this.field_E + (long)var2 * (long)param0;
                  if ((-var3 + this.field_B ^ -1L) <= -1L) {
                    this.field_E = var3;
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
                  var5 = (int)((-1L + (long)var2 + (-this.field_E + this.field_B)) / (long)var2);
                  this.field_E = this.field_E + (long)var5 * (long)var2;
                  param0 = param0 - var5;
                  this.field_v.a(var5);
                  this.d(124);
                  if (this.field_w.g()) {
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
                  this.field_v.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_v.a(param0);
          break L0;
        }
    }

    private final int a(int param0, rta param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        bq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -60) {
                break L1;
              } else {
                this.field_n = (rta[][]) null;
                break L1;
              }
            }
            L2: {
              var3_int = (param1.field_u * param1.field_o >> -958014868) + param1.field_q;
              var3_int = var3_int + (this.field_F[param1.field_k] * (-8192 + this.field_D[param1.field_k]) >> -1395067156);
              var4 = param1.field_v;
              if (0 >= var4.field_d) {
                break L2;
              } else {
                L3: {
                  if (-1 > (var4.field_l ^ -1)) {
                    break L3;
                  } else {
                    if (-1 > (this.field_m[param1.field_k] ^ -1)) {
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
                var5 = var5 + (this.field_m[param1.field_k] >> 116899527);
                var7 = Math.sin((double)(511 & param1.field_p) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_n.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)kta.field_d + 0.5);
              if (-2 < (var5 ^ -1)) {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = var5;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("l.NA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void e(int param0, int param1) {
        rta var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        L0: {
          L1: {
            var4 = TombRacer.field_G ? 1 : 0;
            if (-1 == (4 & this.field_M[param1] ^ -1)) {
              break L1;
            } else {
              var3 = (rta) ((Object) this.field_v.field_l.f(-80));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = var3.field_k ^ -1;
                  stackOut_3_1 = param1 ^ -1;
                  stackIn_8_0 = stackOut_3_0;
                  stackIn_8_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0 != stackIn_4_1) {
                        break L3;
                      } else {
                        var3.field_r = 0;
                        break L3;
                      }
                    }
                    var3 = (rta) ((Object) this.field_v.field_l.e(126));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_7_0 = param0;
          stackOut_7_1 = 28583;
          stackIn_8_0 = stackOut_7_0;
          stackIn_8_1 = stackOut_7_1;
          break L0;
        }
        L4: {
          if (stackIn_8_0 == stackIn_8_1) {
            break L4;
          } else {
            this.field_u = (int[]) null;
            break L4;
          }
        }
    }

    private final void b(int param0, int param1) {
        rta var3 = null;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = (rta) ((Object) this.field_v.field_l.f(-80));
          if (param1 >= 57) {
            break L0;
          } else {
            this.field_t = true;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (0 > param0) {
                      break L4;
                    } else {
                      if (param0 != var3.field_k) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (0 > var3.field_t) {
                    this.field_I[var3.field_k][var3.field_m] = null;
                    var3.field_t = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (rta) ((Object) this.field_v.field_l.e(110));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = -31 % ((-47 - param1) / 56);
    }

    final synchronized int a() {
        return 0;
    }

    final boolean a(rta param0, int[] param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        bq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_B = kta.field_d / 100;
              if ((param0.field_t ^ -1) > -1) {
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
                  if (-1 <= (param0.field_z ^ -1)) {
                    break L3;
                  } else {
                    if (param0 != this.field_n[param0.field_k][param0.field_z]) {
                      break L3;
                    } else {
                      this.field_n[param0.field_k][param0.field_z] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param0.field_u;
              if (-1 > (var6_int ^ -1)) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_z[param0.field_k]) + 0.5);
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
              if ((var7.field_n ^ -1) < -1) {
                L8: {
                  L9: {
                    if (-1 <= (var7.field_c ^ -1)) {
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
                    if ((var7.field_i ^ -1) < -1) {
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
                        stackOut_33_0 = param0.field_A ^ -1;
                        stackOut_33_1 = (255 & var7.field_m[param0.field_w + 2]) << 714759784 ^ -1;
                        stackIn_38_0 = stackOut_33_0;
                        stackIn_38_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (var11 != 0) {
                          break L14;
                        } else {
                          if (stackIn_34_0 >= stackIn_34_1) {
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
                    stackOut_37_0 = -2 + var7.field_m.length;
                    stackOut_37_1 = param0.field_w;
                    stackIn_38_0 = stackOut_37_0;
                    stackIn_38_1 = stackOut_37_1;
                    break L14;
                  }
                  if (stackIn_38_0 != stackIn_38_1) {
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
              if ((param0.field_t ^ -1) > -1) {
                break L16;
              } else {
                if (var7.field_g == null) {
                  break L16;
                } else {
                  if (0 != (1 & this.field_M[param0.field_k])) {
                    break L16;
                  } else {
                    L17: {
                      if (0 > param0.field_z) {
                        break L17;
                      } else {
                        if (param0 != this.field_n[param0.field_k][param0.field_z]) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (-1 <= (var7.field_f ^ -1)) {
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
                            stackOut_52_0 = 65280 & var7.field_g[param0.field_i + 2] << -1769636408;
                            stackOut_52_1 = param0.field_t;
                            stackIn_57_0 = stackOut_52_0;
                            stackIn_57_1 = stackOut_52_1;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (stackIn_53_0 >= stackIn_53_1) {
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
                        stackOut_56_0 = param0.field_i;
                        stackOut_56_1 = -2 + var7.field_g.length;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        break L21;
                      }
                      if (stackIn_57_0 == stackIn_57_1) {
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
                  this.field_v.field_m.a(param0.field_x);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                param0.a(param3 ^ 5800);
                if ((param0.field_t ^ -1) <= -1) {
                  param0.p(69);
                  if (-1 <= (param0.field_z ^ -1)) {
                    break L26;
                  } else {
                    if (param0 == this.field_n[param0.field_k][param0.field_z]) {
                      this.field_n[param0.field_k][param0.field_z] = null;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                } else {
                  break L26;
                }
              }
              stackOut_75_0 = 1;
              stackIn_76_0 = stackOut_75_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param0.field_x.a(param0.field_B, this.a(param0, 83), this.b(-2421, param0));
              stackOut_77_0 = 0;
              stackIn_78_0 = stackOut_77_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var6);
            stackOut_79_1 = new StringBuilder().append("l.MA(");
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param0 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L27;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L27;
            }
          }
          L28: {
            stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
            stackOut_82_1 = ((StringBuilder) (Object) stackIn_82_1).append(stackIn_82_2).append(',');
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param1 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L28;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_76_0 != 0;
          } else {
            return stackIn_78_0 != 0;
          }
        }
    }

    final synchronized cg b() {
        return (cg) ((Object) this.field_v);
    }

    final synchronized void e(int param0) {
        int var3 = 0;
        tn var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var4 = (tn) ((Object) this.field_r.d(param0));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              var4.a(false);
              var4 = (tn) ((Object) this.field_r.c(param0 ^ 20806));
              if (var3 != 0) {
                break L1;
              } else {
                if (var3 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
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
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (0 < param0) {
                var7 = new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (jk) ((Object) param1.field_f.d(param4));
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var8 == null) {
                      break L5;
                    } else {
                      var9 = (int)var8.field_d;
                      var10 = (tn) ((Object) this.field_r.a((byte) -97, (long)var9));
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (var10 != null) {
                              break L7;
                            } else {
                              L8: {
                                var10 = rb.a(param2, var9, 15);
                                if (var10 == null) {
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
                              this.field_r.a((long)var9, 102, var10);
                              break L7;
                            }
                          }
                          if (!var10.a(param4 + -5853, var8.field_f, param3, (int[]) (var7))) {
                            var6_int = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 = (jk) ((Object) param1.field_f.c(param4 ^ 20806));
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
              stackOut_19_0 = var6_int;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("l.HA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param4 + ')');
        }
        return stackIn_20_0 != 0;
    }

    synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param0 == -105) {
            break L0;
          } else {
            this.b(-101, 68);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param2 ^ -1) > -1) {
              break L2;
            } else {
              this.field_N[param2] = param1;
              if (var5 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            if (var4 >= 16) {
              break L1;
            } else {
              this.field_N[var4] = param1;
              var4++;
              if (var5 != 0) {
                break L1;
              } else {
                if (var5 == 0) {
                  continue L3;
                } else {
                  break L1;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        this.field_D[param0] = param2;
        if (param1 <= 75) {
            discarded$0 = this.b(-126, (rta) null);
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 >= 109) {
            break L0;
          } else {
            this.field_s = false;
            break L0;
          }
        }
        L1: {
          var2 = this.field_j;
          var3 = this.field_p;
          var4 = this.field_B;
          if (this.field_x == null) {
            break L1;
          } else {
            if ((var3 ^ -1) != (this.field_C ^ -1)) {
              break L1;
            } else {
              this.a(this.field_t, this.field_x, (byte) 40, this.field_s);
              this.d(111);
              return;
            }
          }
        }
        L2: while (true) {
          stackOut_6_0 = var3;
          stackOut_6_1 = this.field_p;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          L3: while (true) {
            L4: {
              L5: {
                L6: {
                  if (stackIn_7_0 != stackIn_7_1) {
                    break L6;
                  } else {
                    L7: while (true) {
                      stackOut_8_0 = this.field_w.field_a[var2];
                      stackOut_8_1 = var3;
                      stackIn_30_0 = stackOut_8_0;
                      stackIn_30_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        L8: {
                          if (stackIn_9_0 != stackIn_9_1) {
                            break L8;
                          } else {
                            this.field_w.e(var2);
                            var6 = this.field_w.b(var2);
                            stackOut_10_0 = var6;
                            stackOut_10_1 = 1;
                            stackIn_7_0 = stackOut_10_0;
                            stackIn_7_1 = stackOut_10_1;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            if (var7 != 0) {
                              continue L3;
                            } else {
                              if (stackIn_11_0 == stackIn_11_1) {
                                L9: {
                                  this.field_w.e();
                                  this.field_w.f(var2);
                                  if (this.field_w.d()) {
                                    break L9;
                                  } else {
                                    if (var7 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (this.field_x == null) {
                                  L10: {
                                    if (!this.field_t) {
                                      break L10;
                                    } else {
                                      if (var3 != 0) {
                                        this.field_w.a(var4);
                                        if (var7 == 0) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  this.a(true, -127);
                                  this.field_w.a();
                                  return;
                                } else {
                                  this.a(this.field_x, this.field_t, (byte) 80);
                                  this.d(119);
                                  return;
                                }
                              } else {
                                L11: {
                                  if (0 != (var6 & 128)) {
                                    this.c(var6, 128);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                this.field_w.c(var2);
                                this.field_w.f(var2);
                                if (var7 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        var2 = this.field_w.f();
                        var3 = this.field_w.field_a[var2];
                        var4 = this.field_w.d(var3);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                this.field_p = var3;
                this.field_B = var4;
                this.field_j = var2;
                if (this.field_x == null) {
                  break L4;
                } else {
                  stackOut_29_0 = this.field_C ^ -1;
                  stackOut_29_1 = var3 ^ -1;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L5;
                }
              }
              if (stackIn_30_0 > stackIn_30_1) {
                this.field_j = -1;
                this.field_p = this.field_C;
                this.field_B = this.field_w.d(this.field_p);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    final synchronized cg c() {
        return null;
    }

    private final void b(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param2 != 98) {
            discarded$0 = this.a((byte) 90);
        }
    }

    synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(-191040664, param3);
              this.field_w.a(param1.field_g);
              this.field_E = 0L;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((l) (this)).field_t = stackIn_4_1 != 0;
            var5_int = this.field_w.c();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var5_int ^ -1) >= (var6 ^ -1)) {
                    break L4;
                  } else {
                    this.field_w.e(var6);
                    this.field_w.c(var6);
                    this.field_w.f(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                this.field_j = this.field_w.f();
                this.field_p = this.field_w.field_a[this.field_j];
                break L3;
              }
              if (param2 == 40) {
                this.field_B = this.field_w.d(this.field_p);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (runtimeException);
            stackOut_14_1 = new StringBuilder().append("l.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 <= 101) {
            this.field_u = (int[]) null;
        }
        this.field_O[param0] = param2;
        this.field_l[param0] = sea.c(-128, param2);
        this.a(param0, true, param2);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        rta var5 = null;
        u var6 = null;
        int var6_int = 0;
        rta var7 = null;
        rta var8 = null;
        int var9 = 0;
        tn var10 = null;
        tn var11 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        rta stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        rta stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        rta stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        rta stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        rta stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        rta stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          this.a(param0, param2, 64, 0);
          if ((this.field_M[param2] & 2 ^ -1) == -1) {
            break L0;
          } else {
            var5 = (rta) ((Object) this.field_v.field_l.b(param1 + 3));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((param2 ^ -1) != (var5.field_k ^ -1)) {
                    break L2;
                  } else {
                    if (var5.field_t < 0) {
                      this.field_I[param2][var5.field_m] = null;
                      this.field_I[param2][param0] = var5;
                      var6_int = (var5.field_o * var5.field_u >> 1566704172) + var5.field_q;
                      var5.field_q = var5.field_q + (-var5.field_m + param0 << 1667267208);
                      var5.field_o = var6_int + -var5.field_q;
                      var5.field_m = param0;
                      var5.field_u = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (rta) ((Object) this.field_v.field_l.a(-1));
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var10 = (tn) ((Object) this.field_r.a((byte) -117, (long)this.field_k[param2]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_h[param0];
          if (var6 != null) {
            L3: {
              L4: {
                var7 = new rta();
                var7.field_k = param2;
                var7.field_y = var11;
                var7.field_n = var6;
                var7.field_v = var10.field_m[param0];
                var7.field_z = var10.field_f[param0];
                var7.field_m = param0;
                var7.field_s = 1024 + var10.field_j[param0] * var11.field_i * (param3 * param3) >> 755563179;
                var7.field_h = var10.field_l[param0] & 255;
                var7.field_q = (param0 << -1935695896) + -(32767 & var10.field_g[param0]);
                var7.field_t = -1;
                var7.field_i = 0;
                var7.field_w = param1;
                var7.field_A = 0;
                var7.field_f = 0;
                if (0 == this.field_q[param2]) {
                  break L4;
                } else {
                  L5: {
                    var7.field_x = qia.a(var6, this.a(-101, var7), 0, this.b(-2421, var7));
                    stackOut_14_0 = this;
                    stackOut_14_1 = 95;
                    stackOut_14_2 = (rta) (var7);
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    if (0 <= var10.field_g[param0]) {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackOut_16_2 = (rta) ((Object) stackIn_16_2);
                      stackOut_16_3 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      stackIn_17_2 = stackOut_16_2;
                      stackIn_17_3 = stackOut_16_3;
                      break L5;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = (rta) ((Object) stackIn_15_2);
                      stackOut_15_3 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_17_3 = stackOut_15_3;
                      break L5;
                    }
                  }
                  this.a((byte) stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                  if (var9 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var7.field_x = qia.a(var6, this.a(param1 + -71, var7), this.a(var7, 113), this.b(-2421, var7));
              break L3;
            }
            L6: {
              if (0 <= var10.field_g[param0]) {
                break L6;
              } else {
                var7.field_x.b(-1);
                break L6;
              }
            }
            L7: {
              if ((var7.field_z ^ -1) > -1) {
                break L7;
              } else {
                L8: {
                  var8 = this.field_n[param2][var7.field_z];
                  if (var8 == null) {
                    break L8;
                  } else {
                    if (0 > var8.field_t) {
                      this.field_I[param2][var8.field_m] = null;
                      var8.field_t = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                this.field_n[param2][var7.field_z] = var7;
                break L7;
              }
            }
            this.field_v.field_l.b((byte) -68, var7);
            this.field_I[param2][param0] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_w.a();
        if (param0 != -191040664) {
            return;
        }
        this.field_x = null;
        this.a(param1, -124);
    }

    final void a(byte param0, rta param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
                      var5 = (int)((long)this.field_q[param1.field_k] * (long)var7 >> 1942271174);
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
              var5 = (int)((long)this.field_q[param1.field_k] * (long)var4_int >> 1881930054);
              break L1;
            }
            param1.field_x.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("l.S(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    protected l() {
        this.field_l = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_n = new rta[16][128];
        this.field_k = new int[16];
        this.field_z = new int[16];
        this.field_m = new int[16];
        this.field_y = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_I = new rta[16][128];
        this.field_D = new int[16];
        this.field_N = new int[16];
        this.field_G = 256;
        this.field_O = new int[16];
        this.field_H = 1000000;
        this.field_L = new int[16];
        this.field_w = new maa();
        this.field_v = new et((l) (this));
        this.field_r = new ji(128);
        this.a((byte) -105, 256, -1);
        this.a(true, -116);
    }

    l(l param0) {
        this.field_l = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_n = new rta[16][128];
        this.field_k = new int[16];
        this.field_z = new int[16];
        this.field_m = new int[16];
        this.field_y = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_I = new rta[16][128];
        this.field_D = new int[16];
        this.field_N = new int[16];
        this.field_G = 256;
        this.field_O = new int[16];
        this.field_H = 1000000;
        this.field_L = new int[16];
        this.field_w = new maa();
        this.field_v = new et((l) (this));
        try {
            this.field_r = param0.field_r;
            this.a((byte) -105, 256, -1);
            this.a(true, -119);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
