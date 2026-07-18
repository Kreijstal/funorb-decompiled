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
            ((l) this).field_E = -39L;
        }
    }

    private final int b(int param0, rta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = ((l) this).field_A[param1.field_k];
            if (var3_int >= 8192) {
              stackOut_3_0 = 16384 - ((128 + -param1.field_h) * (-var3_int + 16384) + 32 >> 6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = var3_int * param1.field_h + 32 >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("l.VA(").append(-2421).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -70) {
            ((l) this).a((byte) -3, 35, 27);
        }
        return ((l) this).field_w.g();
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
            if (0 == ((l) this).field_N[param0.field_k]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var9 = param0.field_v;
              var10 = var9;
              var4 = 4096 + ((l) this).field_L[param0.field_k] * ((l) this).field_y[param0.field_k] >> 13;
              var4 = 16384 + var4 * var4 >> 15;
              var4 = param0.field_s * var4 - -16384 >> 15;
              if (param1 >= 71) {
                L1: {
                  var4 = ((l) this).field_G * var4 + 128 >> 8;
                  var4 = var4 * ((l) this).field_N[param0.field_k] + 128 >> 8;
                  if (var10.field_n > 0) {
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
                      if (~param0.field_w <= ~(var10.field_m.length - 2)) {
                        break L3;
                      } else {
                        var7 = 65280 & var9.field_m[param0.field_w] << 8;
                        var8 = var10.field_m[2 + param0.field_w] << 8 & 65280;
                        var6 = var6 + (var5 - var7) * (-var6 + var10.field_m[3 + param0.field_w]) / (var8 - var7);
                        break L3;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 6;
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
                        if (~(-2 + var10.field_g.length) >= ~param0.field_i) {
                          break L5;
                        } else {
                          var7 = (var9.field_g[param0.field_i] & 255) << 8;
                          var8 = (var10.field_g[param0.field_i - -2] & 255) << 8;
                          var6 = var6 + (var5 + -var7) * (var10.field_g[param0.field_i + 3] - var6) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> 6;
                      break L4;
                    }
                  }
                }
                stackOut_20_0 = var4;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              } else {
                stackOut_5_0 = -110;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("l.KA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    final synchronized void a(int param0, int param1) {
        int var3 = 87 / ((param1 - 53) / 54);
        ((l) this).field_G = param0;
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
                  ((l) this).field_y = null;
                  break L1;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              if (param1.field_t >= 0) {
                L2: {
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
                }
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("l.H(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            ha discarded$0 = l.a(8, -95, (java.awt.Canvas) null, (d) null, -74);
        }
        field_K = null;
    }

    private final void d(int param0, int param1) {
        rta var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if ((((l) this).field_M[param1] & 2) != 0) {
            var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
            while (var3 != null) {
                if (param1 == var3.field_k) {
                    if (((l) this).field_I[param1][var3.field_m] == null) {
                        if (!(0 <= var3.field_t)) {
                            var3.field_t = 0;
                        }
                    }
                }
                var3 = (rta) (Object) ((l) this).field_v.field_l.e(123);
            }
        }
        if (param0 > -44) {
            boolean discarded$0 = ((l) this).a((byte) -62);
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
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("l.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param4 + ')');
        }
        return (ha) (Object) stackIn_3_0;
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
              var4 = 15 & param0;
              var5 = 127 & param0 >> 8;
              var6 = (param0 & 8342499) >> 16;
              if (var6 > 0) {
                this.b(var5, 0, var4, var6);
                return;
              } else {
                this.a(var5, var4, 64, 0);
                break L0;
              }
            } else {
              if (var3 != 160) {
                if (var3 == 176) {
                  L1: {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> 8;
                    var6 = (param0 & 8338047) >> 16;
                    if (var5 == 0) {
                      ((l) this).field_l[var4] = sea.c(((l) this).field_l[var4], -2080769) + (var6 << 14);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 != 32) {
                      break L2;
                    } else {
                      ((l) this).field_l[var4] = sea.c(-16257, ((l) this).field_l[var4]) + (var6 << 7);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      ((l) this).field_m[var4] = sea.c(((l) this).field_m[var4], -16257) - -(var6 << 7);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 33) {
                      break L4;
                    } else {
                      ((l) this).field_m[var4] = sea.c(((l) this).field_m[var4], -128) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (5 != var5) {
                      break L5;
                    } else {
                      ((l) this).field_z[var4] = sea.c(-16257, ((l) this).field_z[var4]) + (var6 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 37) {
                      break L6;
                    } else {
                      ((l) this).field_z[var4] = sea.c(-128, ((l) this).field_z[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 7) {
                      break L7;
                    } else {
                      ((l) this).field_L[var4] = sea.c(-16257, ((l) this).field_L[var4]) - -(var6 << 7);
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
                      break L8;
                    } else {
                      ((l) this).field_L[var4] = var6 + sea.c(((l) this).field_L[var4], -128);
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var5) {
                      ((l) this).field_A[var4] = (var6 << 7) + sea.c(-16257, ((l) this).field_A[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 42) {
                      break L10;
                    } else {
                      ((l) this).field_A[var4] = var6 + sea.c(-128, ((l) this).field_A[var4]);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((l) this).field_y[var4] = sea.c(((l) this).field_y[var4], -16257) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((l) this).field_y[var4] = var6 + sea.c(-128, ((l) this).field_y[var4]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 64) {
                      if (var6 >= 64) {
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 1);
                        break L13;
                      } else {
                        ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -2);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var5 == 65) {
                      if (var6 >= 64) {
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 2);
                        break L14;
                      } else {
                        this.d(-108, var4);
                        ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 != 99) {
                      break L15;
                    } else {
                      ((l) this).field_J[var4] = sea.c(127, ((l) this).field_J[var4]) - -(var6 << 7);
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 != 98) {
                      break L16;
                    } else {
                      ((l) this).field_J[var4] = var6 + sea.c(((l) this).field_J[var4], 16256);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 101) {
                      break L17;
                    } else {
                      ((l) this).field_J[var4] = (var6 << 7) + sea.c(((l) this).field_J[var4], 127) + 16384;
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 != 100) {
                      break L18;
                    } else {
                      ((l) this).field_J[var4] = 16384 + (sea.c(((l) this).field_J[var4], 16256) + var6);
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.b(true, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
                      break L20;
                    } else {
                      this.a((byte) 101, var4);
                      break L20;
                    }
                  }
                  L21: {
                    if (var5 == 123) {
                      this.b(var4, 92);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 6) {
                      break L22;
                    } else {
                      var7 = ((l) this).field_J[var4];
                      if (var7 != 16384) {
                        break L22;
                      } else {
                        ((l) this).field_F[var4] = (var6 << 7) + sea.c(((l) this).field_F[var4], -16257);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((l) this).field_J[var4];
                      if (16384 != var7) {
                        break L23;
                      } else {
                        ((l) this).field_F[var4] = sea.c(((l) this).field_F[var4], -128) - -var6;
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (var5 == 16) {
                      ((l) this).field_q[var4] = (var6 << 7) + sea.c(-16257, ((l) this).field_q[var4]);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (48 != var5) {
                      break L25;
                    } else {
                      ((l) this).field_q[var4] = var6 + sea.c(((l) this).field_q[var4], -128);
                      break L25;
                    }
                  }
                  L26: {
                    if (81 != var5) {
                      break L26;
                    } else {
                      if (var6 >= 64) {
                        ((l) this).field_M[var4] = fh.a(((l) this).field_M[var4], 4);
                        break L26;
                      } else {
                        this.e(28583, var4);
                        ((l) this).field_M[var4] = sea.c(((l) this).field_M[var4], -5);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.a(var4, (-16257 & ((l) this).field_o[var4]) + (var6 << 7), (byte) -78);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a(var4, (-128 & ((l) this).field_o[var4]) - -var6, (byte) -78);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = 15 & param0;
                    var5 = (32618 & param0) >> 8;
                    this.a(var4, true, ((l) this).field_l[var4] + var5);
                    return;
                  } else {
                    if (208 != var3) {
                      if (var3 == 224) {
                        var4 = 15 & param0;
                        var5 = (16256 & param0 >> 9) - -((param0 & 32646) >> 8);
                        this.a(var4, (byte) 109, var5);
                        return;
                      } else {
                        var3 = param0 & 255;
                        if (var3 == 255) {
                          this.a(true, -121);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (32632 & param0) >> 8;
                      this.b(var4, var5, 98);
                      return;
                    }
                  }
                }
              } else {
                var4 = param0 & 15;
                var5 = (32529 & param0) >> 8;
                var6 = (param0 & 8342767) >> 16;
                this.a(var6, (byte) -104, var4, var5);
                return;
              }
            }
          }
          return;
        } else {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (8386231 & param0) >> 16;
          this.a(var5, var4, var6, 0);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
          param1 = 0;
          L0: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a((byte) 91, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          L1: {
            ((l) this).field_L[param1] = 12800;
            ((l) this).field_A[param1] = 8192;
            if (param0 > 86) {
              break L1;
            } else {
              this.e(27, 5);
              break L1;
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
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 55) {
            this.e(61, 49);
        }
        ((l) this).field_H = param0;
    }

    final synchronized void a(qua param0, boolean param1, byte param2) {
        if (param2 != 80) {
            return;
        }
        try {
            ((l) this).a(param1, param0, (byte) 40, true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        ((l) this).field_o[param0] = param1;
        ((l) this).field_u[param0] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        rta var6 = null;
        int var7 = 0;
        rta var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = ((l) this).field_I[param1][param0];
        if (var8 != null) {
          L0: {
            ((l) this).field_I[param1][param0] = null;
            if ((((l) this).field_M[param1] & 2) == 0) {
              var8.field_t = 0;
              break L0;
            } else {
              var6 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var6.field_k != var8.field_k) {
                      break L2;
                    } else {
                      if (var6.field_t >= 0) {
                        break L2;
                      } else {
                        if (var6 != var8) {
                          var8.field_t = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (rta) (Object) ((l) this).field_v.field_l.e(113);
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 >>> 24;
        int var4 = 255 - var3;
        param0 = (var3 * (param0 & 16711935) & -16711936 | var3 * (65280 & param0) & 16711680) >>> 8;
        return ((var4 * (param1 & 65280) & 16711680 | -16711936 & var4 * (16711935 & param1)) >>> 8) + param0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (~((l) this).field_k[param0] != ~param2) {
            ((l) this).field_k[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                ((l) this).field_n[param0][var4] = null;
            }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 >= -114) {
            return;
        }
        if (param0) {
            this.b(true, -1);
        } else {
            this.b(-1, 117);
        }
        this.a((byte) 110, -1);
        for (var3 = 0; var3 < 16; var3++) {
            ((l) this).field_k[var3] = ((l) this).field_O[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((l) this).field_l[var5] = sea.c(((l) this).field_O[var5], -128);
            var5++;
        }
    }

    final synchronized void b(int param0) {
        this.a(-191040664, true);
        if (param0 != 2) {
            ((l) this).e(110);
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((l) this).field_w.g()) {
                break L1;
              } else {
                var4_int = ((l) this).field_w.field_e * ((l) this).field_H / kta.field_d;
                L2: while (true) {
                  var5 = (long)var4_int * (long)param2 + ((l) this).field_E;
                  if (((l) this).field_B + -var5 >= 0L) {
                    ((l) this).field_E = var5;
                    break L1;
                  } else {
                    var7 = (int)((-1L + -((l) this).field_E + (((l) this).field_B - -(long)var4_int)) / (long)var4_int);
                    ((l) this).field_E = ((l) this).field_E + (long)var4_int * (long)var7;
                    ((l) this).field_v.b(param0, param1, var7);
                    param2 = param2 - var7;
                    this.d(125);
                    param1 = param1 + var7;
                    if (!((l) this).field_w.g()) {
                      break L1;
                    } else {
                      continue L2;
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
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("l.D(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(byte param0) {
        if (param0 <= 118) {
            return 11;
        }
        return ((l) this).field_G;
    }

    private final void b(boolean param0, int param1) {
        rta var3 = null;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (param1 != var3.field_k) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == var3.field_x) {
                  break L3;
                } else {
                  L4: {
                    var3.field_x.d(kta.field_d / 100);
                    if (!var3.field_x.m()) {
                      break L4;
                    } else {
                      ((l) this).field_v.field_m.a((cg) (Object) var3.field_x);
                      break L4;
                    }
                  }
                  var3.a(5806);
                  break L3;
                }
              }
              L5: {
                if (var3.field_t < 0) {
                  ((l) this).field_I[var3.field_k][var3.field_m] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.p(100);
              break L1;
            }
            var3 = (rta) (Object) ((l) this).field_v.field_l.e(118);
            continue L0;
          }
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
            if (((l) this).field_w.g()) {
              var2 = ((l) this).field_H * ((l) this).field_w.field_e / kta.field_d;
              L2: while (true) {
                var3 = ((l) this).field_E + (long)var2 * (long)param0;
                if (-var3 + ((l) this).field_B >= 0L) {
                  ((l) this).field_E = var3;
                  break L1;
                } else {
                  var5 = (int)((-1L + (long)var2 + (-((l) this).field_E + ((l) this).field_B)) / (long)var2);
                  ((l) this).field_E = ((l) this).field_E + (long)var5 * (long)var2;
                  param0 = param0 - var5;
                  ((l) this).field_v.a(var5);
                  this.d(124);
                  if (((l) this).field_w.g()) {
                    continue L2;
                  } else {
                    ((l) this).field_v.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((l) this).field_v.a(param0);
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
                ((l) this).field_n = null;
                break L1;
              }
            }
            L2: {
              var3_int = (param1.field_u * param1.field_o >> 12) + param1.field_q;
              var3_int = var3_int + (((l) this).field_F[param1.field_k] * (-8192 + ((l) this).field_D[param1.field_k]) >> 12);
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
                  var5 = var4.field_l << 2;
                  var6 = var4.field_j << 1;
                  if (var6 > param1.field_l) {
                    var5 = param1.field_l * var5 / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((l) this).field_m[param1.field_k] >> 7);
                var7 = Math.sin((double)(511 & param1.field_p) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)((double)(256 * param1.field_n.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)kta.field_d + 0.5);
              if (var5 < 1) {
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
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("l.NA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void e(int param0, int param1) {
        rta var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if ((4 & ((l) this).field_M[param1]) != 0) {
            var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
            while (var3 != null) {
                if (~var3.field_k == ~param1) {
                    var3.field_r = 0;
                }
                var3 = (rta) (Object) ((l) this).field_v.field_l.e(126);
            }
        }
        if (param0 != 28583) {
            ((l) this).field_u = null;
        }
    }

    private final void b(int param0, int param1) {
        rta var3 = null;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var3 = (rta) (Object) ((l) this).field_v.field_l.f(-80);
          if (param1 >= 57) {
            break L0;
          } else {
            ((l) this).field_t = true;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (0 > param0) {
                  break L3;
                } else {
                  if (param0 != var3.field_k) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (0 > var3.field_t) {
                ((l) this).field_I[var3.field_k][var3.field_m] = null;
                var3.field_t = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (rta) (Object) ((l) this).field_v.field_l.e(110);
            continue L1;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
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
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
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
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
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
              var9 = (double)((param0.field_m - 60 << 8) + (param0.field_u * param0.field_o >> 12)) * 0.000005086263020833333;
              if (var7.field_n > 0) {
                L8: {
                  if (var7.field_c <= 0) {
                    param0.field_f = param0.field_f + 128;
                    break L8;
                  } else {
                    param0.field_f = param0.field_f + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
                    break L8;
                  }
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
            L9: {
              if (null != var7.field_m) {
                L10: {
                  if (var7.field_i > 0) {
                    param0.field_A = param0.field_A + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_i) + 0.5);
                    break L10;
                  } else {
                    param0.field_A = param0.field_A + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (var7.field_m.length + -2 <= param0.field_w) {
                      break L12;
                    } else {
                      if (~param0.field_A >= ~((255 & var7.field_m[param0.field_w + 2]) << 8)) {
                        break L12;
                      } else {
                        param0.field_w = param0.field_w + 2;
                        continue L11;
                      }
                    }
                  }
                  if (-2 + var7.field_m.length != param0.field_w) {
                    break L9;
                  } else {
                    if (0 != var7.field_m[1 + param0.field_w]) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L13: {
              if (param0.field_t < 0) {
                break L13;
              } else {
                if (var7.field_g == null) {
                  break L13;
                } else {
                  if (0 != (1 & ((l) this).field_M[param0.field_k])) {
                    break L13;
                  } else {
                    L14: {
                      if (0 > param0.field_z) {
                        break L14;
                      } else {
                        if (param0 != ((l) this).field_n[param0.field_k][param0.field_z]) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (var7.field_f <= 0) {
                        param0.field_t = param0.field_t + 128;
                        break L15;
                      } else {
                        param0.field_t = param0.field_t + (int)(128.0 * Math.pow(2.0, (double)var7.field_f * var9) + 0.5);
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (-2 + var7.field_g.length <= param0.field_i) {
                          break L17;
                        } else {
                          if ((65280 & var7.field_g[param0.field_i + 2] << 8) >= param0.field_t) {
                            break L17;
                          } else {
                            param0.field_i = param0.field_i + 2;
                            continue L16;
                          }
                        }
                      }
                      if (param0.field_i == -2 + var7.field_g.length) {
                        var8 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param0.field_x.d(param0.field_B);
                if (param1 != null) {
                  param0.field_x.b(param1, param2, param4);
                  break L18;
                } else {
                  param0.field_x.a(param4);
                  break L18;
                }
              }
              L19: {
                if (param0.field_x.m()) {
                  ((l) this).field_v.field_m.a((cg) (Object) param0.field_x);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param0.a(param3 ^ 5800);
                if (param0.field_t >= 0) {
                  param0.p(69);
                  if (param0.field_z <= 0) {
                    break L20;
                  } else {
                    if (param0 == ((l) this).field_n[param0.field_k][param0.field_z]) {
                      ((l) this).field_n[param0.field_k][param0.field_z] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_65_0 = 1;
              stackIn_66_0 = stackOut_65_0;
              return stackIn_66_0 != 0;
            } else {
              param0.field_x.a(param0.field_B, this.a(param0, 83), this.b(-2421, param0));
              stackOut_67_0 = 0;
              stackIn_68_0 = stackOut_67_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var6;
            stackOut_69_1 = new StringBuilder().append("l.MA(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L21;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L21;
            }
          }
          L22: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L22;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L22;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_68_0 != 0;
    }

    final synchronized cg b() {
        return (cg) (Object) ((l) this).field_v;
    }

    final synchronized void e(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        tn var4 = (tn) (Object) ((l) this).field_r.d(param0);
        while (var4 != null) {
            var4.a(false);
            var4 = (tn) (Object) ((l) this).field_r.c(param0 ^ 20806);
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
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
              if (var8 == null) {
                L3: {
                  if (var6_int != 0) {
                    param1.a();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var9 = (int)var8.field_d;
                    var10 = (tn) (Object) ((l) this).field_r.a((byte) -97, (long)var9);
                    if (var10 != null) {
                      break L5;
                    } else {
                      int discarded$1 = 15;
                      var10 = rb.a(param2, var9);
                      if (var10 == null) {
                        var6_int = 0;
                        break L4;
                      } else {
                        ((l) this).field_r.a((long)var9, 102, (vg) (Object) var10);
                        break L5;
                      }
                    }
                  }
                  if (!var10.a(param4 + -5853, var8.field_f, param3, (int[]) var7)) {
                    var6_int = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8 = (jk) (Object) param1.field_f.c(param4 ^ 20806);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("l.HA(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param4 + ')');
        }
        return stackIn_19_0 != 0;
    }

    synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != -105) {
            this.b(-101, 68);
        }
        if (param2 >= 0) {
            ((l) this).field_N[param2] = param1;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((l) this).field_N[var4] = param1;
            }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        ((l) this).field_D[param0] = param2;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 >= 109) {
            break L0;
          } else {
            ((l) this).field_s = false;
            break L0;
          }
        }
        L1: {
          var2 = ((l) this).field_j;
          var3 = ((l) this).field_p;
          var4 = ((l) this).field_B;
          if (((l) this).field_x == null) {
            break L1;
          } else {
            if (~var3 != ~((l) this).field_C) {
              break L1;
            } else {
              ((l) this).a(((l) this).field_t, ((l) this).field_x, (byte) 40, ((l) this).field_s);
              this.d(111);
              return;
            }
          }
        }
        L2: while (true) {
          if (var3 != ((l) this).field_p) {
            L3: {
              ((l) this).field_p = var3;
              ((l) this).field_B = var4;
              ((l) this).field_j = var2;
              if (((l) this).field_x == null) {
                break L3;
              } else {
                if (~((l) this).field_C > ~var3) {
                  ((l) this).field_j = -1;
                  ((l) this).field_p = ((l) this).field_C;
                  ((l) this).field_B = ((l) this).field_w.d(((l) this).field_p);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (((l) this).field_w.field_a[var2] != var3) {
                  break L5;
                } else {
                  ((l) this).field_w.e(var2);
                  var6 = ((l) this).field_w.b(var2);
                  if (var6 == 1) {
                    ((l) this).field_w.e();
                    ((l) this).field_w.f(var2);
                    if (((l) this).field_w.d()) {
                      if (((l) this).field_x == null) {
                        L6: {
                          if (!((l) this).field_t) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((l) this).field_w.a(var4);
                              break L5;
                            } else {
                              break L6;
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
                      break L5;
                    }
                  } else {
                    L7: {
                      if (0 != (var6 & 128)) {
                        this.c(var6, 128);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((l) this).field_w.c(var2);
                    ((l) this).field_w.f(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((l) this).field_w.f();
              var3 = ((l) this).field_w.field_a[var2];
              var4 = ((l) this).field_w.d(var3);
              continue L2;
            }
          }
        }
    }

    final synchronized cg c() {
        return null;
    }

    private final void b(int param0, int param1, int param2) {
    }

    synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        this.a(-191040664, param3);
        ((l) this).field_w.a(param1.field_g);
        ((l) this).field_E = 0L;
        ((l) this).field_t = param0 ? true : false;
        int var5_int = ((l) this).field_w.c();
        for (var6 = 0; ~var5_int < ~var6; var6++) {
            ((l) this).field_w.e(var6);
            ((l) this).field_w.c(var6);
            ((l) this).field_w.f(var6);
        }
        ((l) this).field_j = ((l) this).field_w.f();
        ((l) this).field_p = ((l) this).field_w.field_a[((l) this).field_j];
        if (param2 != 40) {
            return;
        }
        try {
            ((l) this).field_B = ((l) this).field_w.d(((l) this).field_p);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((l) this).field_O[param0] = param2;
        ((l) this).field_l[param0] = sea.c(-128, param2);
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
          if ((((l) this).field_M[param2] & 2) == 0) {
            break L0;
          } else {
            var5 = (rta) (Object) ((l) this).field_v.field_l.b(3);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (~param2 != ~var5.field_k) {
                    break L2;
                  } else {
                    if (var5.field_t < 0) {
                      ((l) this).field_I[param2][var5.field_m] = null;
                      ((l) this).field_I[param2][param0] = var5;
                      var6_int = (var5.field_o * var5.field_u >> 12) + var5.field_q;
                      var5.field_q = var5.field_q + (-var5.field_m + param0 << 8);
                      var5.field_o = var6_int + -var5.field_q;
                      var5.field_m = param0;
                      var5.field_u = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (rta) (Object) ((l) this).field_v.field_l.a(-1);
                continue L1;
              }
            }
          }
        }
        var10 = (tn) (Object) ((l) this).field_r.a((byte) -117, (long)((l) this).field_k[param2]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_h[param0];
          if (var6 != null) {
            L3: {
              var7 = new rta();
              var7.field_k = param2;
              var7.field_y = var11;
              var7.field_n = var6;
              var7.field_v = var10.field_m[param0];
              var7.field_z = var10.field_f[param0];
              var7.field_m = param0;
              var7.field_s = 1024 + var10.field_j[param0] * var11.field_i * (param3 * param3) >> 11;
              var7.field_h = var10.field_l[param0] & 255;
              var7.field_q = (param0 << 8) + -(32767 & var10.field_g[param0]);
              var7.field_t = -1;
              var7.field_i = 0;
              var7.field_w = 0;
              var7.field_A = 0;
              var7.field_f = 0;
              if (0 == ((l) this).field_q[param2]) {
                var7.field_x = qia.a(var6, this.a(-71, var7), this.a(var7, 113), this.b(-2421, var7));
                break L3;
              } else {
                L4: {
                  var7.field_x = qia.a(var6, this.a(-101, var7), 0, this.b(-2421, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 95;
                  stackOut_14_2 = (rta) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (0 <= var10.field_g[param0]) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (rta) (Object) stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (rta) (Object) stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L4;
                  }
                }
                ((l) this).a((byte) stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                break L3;
              }
            }
            L5: {
              if (0 <= var10.field_g[param0]) {
                break L5;
              } else {
                var7.field_x.b(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_z < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((l) this).field_n[param2][var7.field_z];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (0 > var8.field_t) {
                      ((l) this).field_I[param2][var8.field_m] = null;
                      var8.field_t = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((l) this).field_n[param2][var7.field_z] = var7;
                break L6;
              }
            }
            ((l) this).field_v.field_l.b((byte) -68, (vg) (Object) var7);
            ((l) this).field_I[param2][param0] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        ((l) this).field_w.a();
        ((l) this).field_x = null;
        this.a(param1, -124);
    }

    final void a(byte param0, rta param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
                    var7 = -param1.field_n.field_k + var4_int + var4_int;
                    var5 = (int)((long)((l) this).field_q[param1.field_k] * (long)var7 >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -var5 + (var4_int + (var4_int - 1));
                      param1.field_x.a(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)((l) this).field_q[param1.field_k] * (long)var4_int >> 6);
              break L1;
            }
            param1.field_x.c(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("l.S(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
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
        ((l) this).field_r = new ji(128);
        ((l) this).a((byte) -105, 256, -1);
        this.a(true, -116);
    }

    l(l param0) {
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
            ((l) this).field_r = param0.field_r;
            ((l) this).a((byte) -105, 256, -1);
            this.a(true, -119);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
