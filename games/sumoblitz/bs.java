/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends hj {
    private int field_E;
    private int[] field_L;
    private int[] field_H;
    int[] field_R;
    private int[] field_F;
    private int[] field_T;
    private int[] field_y;
    private sh field_v;
    private int[] field_B;
    private int[] field_S;
    private uu[][] field_P;
    private int field_r;
    private int[] field_D;
    private te field_p;
    int[] field_x;
    private int[] field_N;
    private int[] field_w;
    private int[] field_G;
    private uu[][] field_t;
    private int[] field_z;
    private int[] field_K;
    static char[] field_o;
    int[] field_J;
    private boolean field_M;
    private long field_q;
    private rh field_s;
    private int field_C;
    private long field_O;
    private int field_Q;
    private int field_u;
    private boolean field_A;
    private tv field_I;

    final synchronized boolean c(int param0) {
        if (param0 != -8192) {
            Object var3 = null;
            ((bs) this).a(false, (tv) null, -40);
        }
        return ((bs) this).field_v.c();
    }

    final synchronized hj c() {
        return null;
    }

    private final int c(int param0, uu param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mq var9 = null;
        mq var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((bs) this).field_y[param1.field_y] != 0) {
              L1: {
                var9 = param1.field_w;
                var10 = var9;
                var4 = 4096 + ((bs) this).field_T[param1.field_y] * ((bs) this).field_w[param1.field_y] >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = 16384 + param1.field_F * var4 >> 15;
                var4 = 128 + ((bs) this).field_r * var4 >> 8;
                var4 = var4 * ((bs) this).field_y[param1.field_y] - -128 >> 8;
                if (0 >= var10.field_i) {
                  break L1;
                } else {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_i));
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_g) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_G;
                    var6 = var10.field_g[param1.field_r + 1];
                    if (~param1.field_r <= ~(-2 + var10.field_g.length)) {
                      break L3;
                    } else {
                      var7 = 65280 & var9.field_g[param1.field_r] << 8;
                      var8 = var10.field_g[param1.field_r + 2] << 8 & 65280;
                      var6 = var6 + (var5 + -var7) * (-var6 + var10.field_g[3 + param1.field_r]) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = 32 + var6 * var4 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param1.field_x <= 0) {
                  break L4;
                } else {
                  if (var10.field_h == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param1.field_x;
                      var6 = var10.field_h[1 + param1.field_n];
                      if (~(-2 + var10.field_h.length) < ~param1.field_n) {
                        var7 = (var9.field_h[param1.field_n] & 255) << 8;
                        var8 = 65280 & var10.field_h[param1.field_n + 2] << 8;
                        var6 = var6 + (var10.field_h[3 + param1.field_n] + -var6) * (-var7 + var5) / (var8 - var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_15_0 = var4;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("bs.I(").append(255).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        uu var6 = null;
        int var7 = 0;
        uu var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = ((bs) this).field_t[param3][param1];
        if (var8 != null) {
          L0: {
            ((bs) this).field_t[param3][param1] = null;
            if ((((bs) this).field_J[param3] & 2) == 0) {
              var8.field_x = 0;
              break L0;
            } else {
              var6 = (uu) (Object) ((bs) this).field_s.field_t.b(-66);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var8.field_y != var6.field_y) {
                      break L2;
                    } else {
                      if (var6.field_x >= 0) {
                        break L2;
                      } else {
                        if (var8 != var6) {
                          var8.field_x = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
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

    private final int a(boolean param0, uu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
        int stackOut_9_0 = 0;
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
            L1: {
              var3_int = (param1.field_p * param1.field_k >> 12) + param1.field_m;
              var3_int = var3_int + (((bs) this).field_D[param1.field_y] * (-8192 + ((bs) this).field_L[param1.field_y]) >> 12);
              var4 = param1.field_w;
              if (var4.field_j <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_b > 0) {
                    break L2;
                  } else {
                    if (((bs) this).field_K[param1.field_y] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_b << 2;
                  var6 = var4.field_e << 1;
                  if (~var6 < ~param1.field_H) {
                    var5 = var5 * param1.field_H / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((bs) this).field_K[param1.field_y] >> 7);
                var7 = Math.sin((double)(511 & param1.field_C) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(param1.field_B.field_n * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)du.field_k);
              if (var5 >= 1) {
                stackOut_10_0 = var5;
                stackIn_11_0 = stackOut_10_0;
                break L4;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("bs.QA(").append(true).append(',');
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
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    private final void a(int param0, boolean param1) {
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (0 > param0) {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.a(param0, true);
              param0++;
              continue L0;
            }
          }
        } else {
          ((bs) this).field_w[param0] = 12800;
          ((bs) this).field_G[param0] = 8192;
          ((bs) this).field_T[param0] = 16383;
          ((bs) this).field_L[param0] = 8192;
          ((bs) this).field_K[param0] = 0;
          ((bs) this).field_z[param0] = 8192;
          this.b(param0, (byte) 126);
          this.a(param0, 32605);
          ((bs) this).field_J[param0] = 0;
          ((bs) this).field_S[param0] = 32767;
          ((bs) this).field_D[param0] = 256;
          ((bs) this).field_R[param0] = 0;
          this.d(8192, param0, 41);
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
            this.c(-1, -1);
        } else {
            this.c(-1, (byte) -30);
        }
        this.a(-1, true);
        for (var3 = 0; var3 < 16; var3++) {
            ((bs) this).field_B[var3] = ((bs) this).field_H[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((bs) this).field_F[var5] = eb.a(((bs) this).field_H[var5], -128);
            var5++;
        }
    }

    final synchronized boolean a(og param0, tv param1, int param2, ki param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        tj var8 = null;
        int var9 = 0;
        td var10 = null;
        int var11 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (~param4 >= param2) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              }
            }
            var8 = (tj) (Object) param1.field_l.a(52);
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
                stackOut_17_0 = var6_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var9 = (int)var8.field_h;
                    var10 = (td) (Object) ((bs) this).field_p.a(param2 ^ -119, (long)var9);
                    if (var10 == null) {
                      int discarded$1 = 0;
                      var10 = u.a(param3, var9);
                      if (var10 != null) {
                        ((bs) this).field_p.a((ms) (Object) var10, param2, (long)var9);
                        if (!var10.a(var8.field_m, (int[]) var7, param0, 1255750754)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      if (!var10.a(var8.field_m, (int[]) var7, param0, 1255750754)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var6_int = 0;
                  break L4;
                }
                var8 = (tj) (Object) param1.field_l.a(true);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("bs.EA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param4 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized hj a() {
        return (hj) (Object) ((bs) this).field_s;
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(int param0, uu param1) {
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
              if (param0 == 16384) {
                break L1;
              } else {
                ((bs) this).field_K = null;
                break L1;
              }
            }
            var3_int = ((bs) this).field_G[param1.field_y];
            if (8192 <= var3_int) {
              stackOut_5_0 = 16384 + -((128 + -param1.field_D) * (16384 + -var3_int) + 32 >> 6);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = var3_int * param1.field_D + 32 >> 6;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("bs.HA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final synchronized void a(boolean param0, tv param1, int param2) {
        try {
            if (param2 <= 48) {
                this.d(0, -127, 115);
            }
            this.a(param0, true, true, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int[] param0, int param1, int param2, uu param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        mq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_u = du.field_k / 100;
              if (param3.field_x < 0) {
                break L1;
              } else {
                L2: {
                  if (param3.field_z == null) {
                    break L2;
                  } else {
                    if (!param3.field_z.h()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param3.a(0);
                  param3.b(false);
                  if (param3.field_q <= 0) {
                    break L3;
                  } else {
                    if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                      break L3;
                    } else {
                      ((bs) this).field_P[param3.field_y][param3.field_q] = null;
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
              var6_int = param3.field_k;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)((bs) this).field_z[param3.field_y] * 0.0004921259842519685) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_k = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_z.e(this.a(true, param3));
              var7 = param3.field_w;
              param3.field_C = param3.field_C + var7.field_j;
              var8 = 0;
              param3.field_H = param3.field_H + 1;
              var9 = (double)((param3.field_k * param3.field_p >> 12) + (-60 + param3.field_E << 8)) * 0.000005086263020833333;
              if (var7.field_i > 0) {
                L7: {
                  if (var7.field_d > 0) {
                    param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                    break L7;
                  } else {
                    param3.field_v = param3.field_v + 128;
                    break L7;
                  }
                }
                if (819200 > var7.field_i * param3.field_v) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var7.field_g == null) {
                break L8;
              } else {
                L9: {
                  if (0 >= var7.field_f) {
                    param3.field_G = param3.field_G + 128;
                    break L9;
                  } else {
                    param3.field_G = param3.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (~(var7.field_g.length + -2) >= ~param3.field_r) {
                      break L11;
                    } else {
                      if (param3.field_G <= (255 & var7.field_g[param3.field_r - -2]) << 8) {
                        break L11;
                      } else {
                        param3.field_r = param3.field_r + 2;
                        continue L10;
                      }
                    }
                  }
                  if (~(var7.field_g.length - 2) != ~param3.field_r) {
                    break L8;
                  } else {
                    if (0 == var7.field_g[param3.field_r + 1]) {
                      var8 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if (param4 > param3.field_x) {
                break L12;
              } else {
                if (var7.field_h == null) {
                  break L12;
                } else {
                  if ((1 & ((bs) this).field_J[param3.field_y]) == 0) {
                    L13: {
                      if (param3.field_q < 0) {
                        break L13;
                      } else {
                        if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_c <= 0) {
                        param3.field_x = param3.field_x + 128;
                        break L14;
                      } else {
                        param3.field_x = param3.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param3.field_n >= var7.field_h.length + -2) {
                          break L16;
                        } else {
                          if (param3.field_x <= (var7.field_h[2 + param3.field_n] & 255) << 8) {
                            break L16;
                          } else {
                            param3.field_n = param3.field_n + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_n == var7.field_h.length + -2) {
                        var8 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var8 == 0) {
              param3.field_z.a(param3.field_u, this.c(255, param3), this.a(param4 ^ 16384, param3));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            } else {
              L17: {
                param3.field_z.d(param3.field_u);
                if (param0 == null) {
                  param3.field_z.a(param2);
                  break L17;
                } else {
                  param3.field_z.b(param0, param1, param2);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_z.k()) {
                  break L18;
                } else {
                  ((bs) this).field_s.field_o.b((hj) (Object) param3.field_z);
                  break L18;
                }
              }
              L19: {
                param3.a(0);
                if (param3.field_x >= 0) {
                  param3.b(false);
                  if (param3.field_q <= 0) {
                    break L19;
                  } else {
                    if (((bs) this).field_P[param3.field_y][param3.field_q] == param3) {
                      ((bs) this).field_P[param3.field_y][param3.field_q] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("bs.IA(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L20;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L20;
            }
          }
          L21: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L21;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L21;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param4 + ')');
        }
        return stackIn_64_0 != 0;
    }

    private final void b(int param0, byte param1) {
        uu var3 = null;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if ((2 & ((bs) this).field_J[param0]) == 0) {
            break L0;
          } else {
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-78);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_y != param0) {
                    break L2;
                  } else {
                    if (((bs) this).field_t[param0][var3.field_E] == null) {
                      if (0 > var3.field_x) {
                        var3.field_x = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                      continue L1;
                    }
                  }
                }
                var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param1 > 120) {
            break L3;
          } else {
            ((bs) this).field_J = null;
            break L3;
          }
        }
    }

    final void a(byte param0, uu param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
                var4_int = param1.field_B.field_p.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param1.field_B.field_m) {
                    break L2;
                  } else {
                    var6 = -param1.field_B.field_l + (var4_int + var4_int);
                    var5 = (int)((long)var6 * (long)((bs) this).field_R[param1.field_y] >> 6);
                    var4_int = var4_int << 8;
                    if (var4_int <= var5) {
                      param1.field_z.c(true);
                      var5 = -var5 + (var4_int + var4_int) - 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((bs) this).field_R[param1.field_y] >> 6);
              break L1;
            }
            var6 = -121 / ((22 - param0) / 59);
            param1.field_z.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("bs.GA(").append(param0).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0, boolean param1) {
        if (!param1) {
            ((bs) this).field_y = null;
        }
        ((bs) this).field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        ((bs) this).field_L[param0] = param2;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          var2 = ((bs) this).field_Q;
          var3 = ((bs) this).field_C;
          var4 = ((bs) this).field_q;
          if (null == ((bs) this).field_I) {
            break L0;
          } else {
            if (~var3 == ~((bs) this).field_u) {
              this.a(((bs) this).field_M, true, ((bs) this).field_A, ((bs) this).field_I);
              this.d(18922);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (~var3 != ~((bs) this).field_C) {
            L2: {
              ((bs) this).field_q = var4;
              ((bs) this).field_C = var3;
              ((bs) this).field_Q = var2;
              if (((bs) this).field_I == null) {
                break L2;
              } else {
                if (~((bs) this).field_u <= ~var3) {
                  break L2;
                } else {
                  ((bs) this).field_C = ((bs) this).field_u;
                  ((bs) this).field_Q = -1;
                  ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (~var3 != ~((bs) this).field_v.field_c[var2]) {
                  break L4;
                } else {
                  ((bs) this).field_v.b(var2);
                  var6 = ((bs) this).field_v.e(var2);
                  if (var6 != 1) {
                    L5: {
                      if (0 == (var6 & 128)) {
                        break L5;
                      } else {
                        this.a(var6, (byte) -82);
                        break L5;
                      }
                    }
                    ((bs) this).field_v.a(var2);
                    ((bs) this).field_v.c(var2);
                    continue L3;
                  } else {
                    ((bs) this).field_v.a();
                    ((bs) this).field_v.c(var2);
                    if (((bs) this).field_v.d()) {
                      if (((bs) this).field_I != null) {
                        ((bs) this).a(((bs) this).field_M, ((bs) this).field_I, 107);
                        this.d(18922);
                        return;
                      } else {
                        L6: {
                          if (!((bs) this).field_M) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((bs) this).field_v.b(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, true);
                        ((bs) this).field_v.e();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = ((bs) this).field_v.b();
              var3 = ((bs) this).field_v.field_c[var2];
              var4 = ((bs) this).field_v.d(var3);
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        uu var5 = null;
        qp var6 = null;
        int var6_int = 0;
        uu var7 = null;
        int var8 = 0;
        uu var9 = null;
        int var10 = 0;
        td var11 = null;
        td var12 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        uu stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        uu stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uu stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        uu stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        uu stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        uu stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          this.a(64, param3, 12800, param2);
          if ((((bs) this).field_J[param2] & 2) == 0) {
            break L0;
          } else {
            var5 = (uu) (Object) ((bs) this).field_s.field_t.a(9);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (~param2 != ~var5.field_y) {
                    break L2;
                  } else {
                    if (0 <= var5.field_x) {
                      break L2;
                    } else {
                      ((bs) this).field_t[param2][var5.field_E] = null;
                      ((bs) this).field_t[param2][param3] = var5;
                      var6_int = var5.field_m + (var5.field_p * var5.field_k >> 12);
                      var5.field_m = var5.field_m + (-var5.field_E + param3 << 8);
                      var5.field_p = -var5.field_m + var6_int;
                      var5.field_E = param3;
                      var5.field_k = 4096;
                      return;
                    }
                  }
                }
                var5 = (uu) (Object) ((bs) this).field_s.field_t.d(9);
                continue L1;
              }
            }
          }
        }
        var11 = (td) (Object) ((bs) this).field_p.a(115, (long)((bs) this).field_B[param2]);
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_o[param3];
          if (var6 != null) {
            L3: {
              var7 = new uu();
              var7.field_A = var12;
              var7.field_y = param2;
              var7.field_B = var6;
              var7.field_w = var11.field_n[param3];
              var7.field_q = var11.field_r[param3];
              var8 = 0;
              var7.field_E = param3;
              var7.field_F = 1024 + var12.field_s * (param0 * (param0 * var11.field_q[param3])) >> 11;
              var7.field_D = var11.field_t[param3] & 255;
              var7.field_m = -(32767 & var11.field_k[param3]) + (param3 << 8);
              var7.field_G = 0;
              var7.field_r = 0;
              var7.field_x = -1;
              var7.field_v = 0;
              var7.field_n = 0;
              if (0 != ((bs) this).field_R[param2]) {
                L4: {
                  var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 110;
                  stackOut_14_2 = (uu) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  if (var12.field_k[param3] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (uu) (Object) stackIn_16_2;
                    stackOut_16_3 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    stackIn_17_3 = stackOut_16_3;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = (uu) (Object) stackIn_15_2;
                    stackOut_15_3 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    stackIn_17_3 = stackOut_15_3;
                    break L4;
                  }
                }
                ((bs) this).a((byte) stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0);
                break L3;
              } else {
                var7.field_z = mf.a(var6, this.a(true, var7), this.c(255, var7), this.a(16384, var7));
                break L3;
              }
            }
            L5: {
              if (var12.field_k[param3] >= 0) {
                break L5;
              } else {
                var7.field_z.c(-1);
                break L5;
              }
            }
            L6: {
              if (var7.field_q >= 0) {
                L7: {
                  var9 = ((bs) this).field_P[param2][var7.field_q];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (var9.field_x >= 0) {
                      break L7;
                    } else {
                      ((bs) this).field_t[param2][var9.field_E] = null;
                      var9.field_x = 0;
                      break L7;
                    }
                  }
                }
                ((bs) this).field_P[param2][var7.field_q] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((bs) this).field_s.field_t.a((ms) (Object) var7, (byte) 39);
            ((bs) this).field_t[param2][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(int param0, uu param1) {
        RuntimeException var3 = null;
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
            L1: {
              if (param0 >= 30) {
                break L1;
              } else {
                ((bs) this).field_s = null;
                break L1;
              }
            }
            if (param1.field_z == null) {
              if (param1.field_x >= 0) {
                L2: {
                  param1.b(false);
                  if (0 >= param1.field_q) {
                    break L2;
                  } else {
                    if (param1 == ((bs) this).field_P[param1.field_y][param1.field_q]) {
                      ((bs) this).field_P[param1.field_y][param1.field_q] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("bs.V(").append(param0).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (var3 != 128) {
          if (var3 != 144) {
            if (var3 != 160) {
              if (176 != var3) {
                if (var3 == 192) {
                  var4 = param0 & 15;
                  var5 = (param0 & 32711) >> 8;
                  this.e(var4, ((bs) this).field_F[var4] + var5, 5174);
                  return;
                } else {
                  if (208 == var3) {
                    var4 = 15 & param0;
                    var5 = (32605 & param0) >> 8;
                    this.a(var4, (byte) -101, var5);
                    return;
                  } else {
                    if (224 == var3) {
                      var4 = 15 & param0;
                      var5 = ((param0 & 8323255) >> 9) + (param0 >> 8 & 127);
                      this.b(var4, -105, var5);
                      return;
                    } else {
                      var3 = 255 & param0;
                      if (var3 == 255) {
                        this.a(true, true);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L0: {
                  var4 = 15 & param0;
                  var5 = (32654 & param0) >> 8;
                  var6 = (8345855 & param0) >> 16;
                  if (0 == var5) {
                    ((bs) this).field_F[var4] = (var6 << 14) + eb.a(-2080769, ((bs) this).field_F[var4]);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (var5 != 32) {
                    break L1;
                  } else {
                    ((bs) this).field_F[var4] = (var6 << 7) + eb.a(((bs) this).field_F[var4], -16257);
                    break L1;
                  }
                }
                L2: {
                  if (var5 == 1) {
                    ((bs) this).field_K[var4] = (var6 << 7) + eb.a(-16257, ((bs) this).field_K[var4]);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((bs) this).field_K[var4] = eb.a(-128, ((bs) this).field_K[var4]) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 != 5) {
                    break L4;
                  } else {
                    ((bs) this).field_z[var4] = (var6 << 7) + eb.a(-16257, ((bs) this).field_z[var4]);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    ((bs) this).field_z[var4] = var6 + eb.a(-128, ((bs) this).field_z[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 == 7) {
                    ((bs) this).field_w[var4] = eb.a(-16257, ((bs) this).field_w[var4]) + (var6 << 7);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (39 == var5) {
                    ((bs) this).field_w[var4] = var6 + eb.a(((bs) this).field_w[var4], -128);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (10 != var5) {
                    break L8;
                  } else {
                    ((bs) this).field_G[var4] = eb.a(-16257, ((bs) this).field_G[var4]) + (var6 << 7);
                    break L8;
                  }
                }
                L9: {
                  if (42 == var5) {
                    ((bs) this).field_G[var4] = var6 + eb.a(-128, ((bs) this).field_G[var4]);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var5 != 11) {
                    break L10;
                  } else {
                    ((bs) this).field_T[var4] = eb.a(-16257, ((bs) this).field_T[var4]) + (var6 << 7);
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((bs) this).field_T[var4] = var6 + eb.a(-128, ((bs) this).field_T[var4]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (var5 == 64) {
                    if (var6 < 64) {
                      ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -2);
                      break L12;
                    } else {
                      ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (var6 >= 64) {
                      ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 2);
                      break L13;
                    } else {
                      this.b(var4, (byte) 122);
                      ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -3);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (var5 != 99) {
                    break L14;
                  } else {
                    ((bs) this).field_S[var4] = (var6 << 7) + eb.a(127, ((bs) this).field_S[var4]);
                    break L14;
                  }
                }
                L15: {
                  if (var5 == 98) {
                    ((bs) this).field_S[var4] = eb.a(16256, ((bs) this).field_S[var4]) + var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var5 == 101) {
                    ((bs) this).field_S[var4] = 16384 + (eb.a(127, ((bs) this).field_S[var4]) - -(var6 << 7));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var5 == 100) {
                    ((bs) this).field_S[var4] = 16384 - (-eb.a(((bs) this).field_S[var4], 16256) + -var6);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 == 120) {
                    this.c(-1, var4);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var5 != 121) {
                    break L19;
                  } else {
                    this.a(var4, true);
                    break L19;
                  }
                }
                L20: {
                  if (var5 != 123) {
                    break L20;
                  } else {
                    this.c(var4, (byte) -109);
                    break L20;
                  }
                }
                L21: {
                  if (var5 == 6) {
                    var7 = ((bs) this).field_S[var4];
                    if (16384 == var7) {
                      ((bs) this).field_D[var4] = eb.a(-16257, ((bs) this).field_D[var4]) + (var6 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((bs) this).field_S[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((bs) this).field_D[var4] = var6 + eb.a(((bs) this).field_D[var4], -128);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (16 != var5) {
                    break L23;
                  } else {
                    ((bs) this).field_R[var4] = eb.a(((bs) this).field_R[var4], -16257) - -(var6 << 7);
                    break L23;
                  }
                }
                L24: {
                  if (var5 != 48) {
                    break L24;
                  } else {
                    ((bs) this).field_R[var4] = var6 + eb.a(((bs) this).field_R[var4], -128);
                    break L24;
                  }
                }
                L25: {
                  if (81 != var5) {
                    break L25;
                  } else {
                    if (var6 >= 64) {
                      ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 4);
                      break L25;
                    } else {
                      this.a(var4, 32605);
                      ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -5);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (var5 != 17) {
                    break L26;
                  } else {
                    this.d((var6 << 7) + (-16257 & ((bs) this).field_N[var4]), var4, 97);
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.d(var6 + (-128 & ((bs) this).field_N[var4]), var4, 42);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            } else {
              var4 = param0 & 15;
              var5 = 127 & param0 >> 8;
              var6 = param0 >> 16 & 127;
              this.b(97, var5, var6, var4);
              return;
            }
          } else {
            var4 = 15 & param0;
            var5 = (32657 & param0) >> 8;
            var6 = 127 & param0 >> 16;
            if (var6 <= 0) {
              this.a(64, var5, 12800, var4);
              return;
            } else {
              this.a(var6, (byte) -13, var4, var5);
              return;
            }
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = param0 >> 16 & 127;
          this.a(var6, var5, 12800, var4);
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (~((bs) this).field_B[param0] != ~param1) {
            ((bs) this).field_B[param0] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((bs) this).field_P[param0][var4] = null;
            }
        }
        if (param2 != 5174) {
            ((bs) this).field_y = null;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 >= -26) {
            ((bs) this).field_r = -65;
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((bs) this).field_H[param1] = param2;
        ((bs) this).field_F[param1] = eb.a(-128, param2);
        if (param0 != -1823) {
            return;
        }
        this.e(param1, param2, param0 ^ -4905);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((bs) this).field_v.c()) {
                  break L2;
                } else {
                  var4_int = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + ((bs) this).field_O;
                    if (0L <= -var5 + ((bs) this).field_q) {
                      ((bs) this).field_O = var5;
                      break L2;
                    } else {
                      var7 = (int)((((bs) this).field_q + (-((bs) this).field_O + (long)var4_int - 1L)) / (long)var4_int);
                      ((bs) this).field_O = ((bs) this).field_O + (long)var7 * (long)var4_int;
                      ((bs) this).field_s.b(param0, param1, var7);
                      param2 = param2 - var7;
                      this.d(18922);
                      param1 = param1 + var7;
                      if (((bs) this).field_v.c()) {
                        continue L3;
                      } else {
                        ((bs) this).field_s.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              ((bs) this).field_s.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("bs.J(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        uu var3 = null;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if ((((bs) this).field_J[param0] & 4) != 0) {
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(66);
            while (var3 != null) {
                if (~param0 == ~var3.field_y) {
                    var3.field_t = 0;
                }
                var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
            }
        }
    }

    private final void c(int param0, int param1) {
        uu var3 = null;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            ((bs) this).field_v = null;
            break L0;
          }
        }
        var3 = (uu) (Object) ((bs) this).field_s.field_t.b(param0 ^ -95);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (~var3.field_y != ~param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == var3.field_z) {
                  break L4;
                } else {
                  L5: {
                    var3.field_z.d(du.field_k / 100);
                    if (var3.field_z.k()) {
                      ((bs) this).field_s.field_o.b((hj) (Object) var3.field_z);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.a(~param0);
                  break L4;
                }
              }
              L6: {
                if (var3.field_x >= 0) {
                  break L6;
                } else {
                  ((bs) this).field_t[var3.field_y][var3.field_E] = null;
                  break L6;
                }
              }
              var3.b(false);
              break L2;
            }
            var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
            continue L1;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
    }

    final synchronized void a(boolean param0, int param1, int param2, int param3, tv param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!(((bs) this).field_v.c())) {
            ((bs) this).a(param5, param4, 77);
            return;
        }
        try {
            ((bs) this).field_M = param5 ? true : false;
            ((bs) this).field_A = param0 ? true : false;
            ((bs) this).field_I = param4;
            var7_int = ((bs) this).field_v.a(((bs) this).field_O) * param3;
            if (param2 != 7094) {
                this.c(-41, (byte) 86);
            }
            var8 = param1 * ((bs) this).field_v.field_d;
            var7_int = var8 * ((-1 + var8 + var7_int) / var8);
            ((bs) this).field_u = ((param3 >> 1) + var7_int) / param3;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 0) {
            this.b(-55, (byte) 105);
        }
        this.a(true, (byte) 104);
    }

    final synchronized void a(byte param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        td var4 = (td) (Object) ((bs) this).field_p.a(79);
        while (var4 != null) {
            var4.d((byte) -36);
            var4 = (td) (Object) ((bs) this).field_p.a(true);
        }
        if (param0 != 28) {
            ((bs) this).field_y = null;
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            int discarded$0 = this.a(true, (uu) null);
        }
        ((bs) this).field_E = param0;
    }

    private final void d(int param0, int param1, int param2) {
        ((bs) this).field_N[param1] = param0;
        if (param2 <= 9) {
            this.a(-89, (byte) -88, -127);
        }
        ((bs) this).field_x[param1] = (int)(0.5 + Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0 ^ -1968, param2, param1);
        if (param0 != 177) {
            ((bs) this).field_z = null;
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        ((bs) this).field_v.e();
        ((bs) this).field_I = null;
        if (param1 < 0) {
            ((bs) this).field_q = 79L;
        }
        this.a(param0, true);
    }

    private final void c(int param0, byte param1) {
        uu var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-96);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 < -15) {
                break L1;
              } else {
                this.c(126, 58);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (~var3.field_y == ~param0) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_x < 0) {
                ((bs) this).field_t[var3.field_y][var3.field_E] = null;
                var3.field_x = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
            continue L0;
          }
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (param1 >= 0) {
            ((bs) this).field_y[param1] = param2;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (16 <= var4) {
                break L0;
              } else {
                ((bs) this).field_y[var4] = param2;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param0 < -42) {
            break L2;
          } else {
            hj discarded$1 = ((bs) this).c();
            break L2;
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, tv param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        try {
            this.a(param2, (byte) 69);
            ((bs) this).field_v.a(param3.field_k);
            ((bs) this).field_O = 0L;
            ((bs) this).field_M = param0 ? true : false;
            var5_int = ((bs) this).field_v.f();
            for (var6 = 0; var5_int > var6; var6++) {
                ((bs) this).field_v.b(var6);
                ((bs) this).field_v.a(var6);
                ((bs) this).field_v.c(var6);
            }
            ((bs) this).field_Q = ((bs) this).field_v.b();
            ((bs) this).field_C = ((bs) this).field_v.field_c[((bs) this).field_Q];
            ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.L(" + param0 + ',' + true + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 >= -38) {
            bs.f(-53);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Sumoblitz.field_L ? 1 : 0;
            if (((bs) this).field_v.c()) {
              var2 = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
              L2: while (true) {
                var3 = ((bs) this).field_O + (long)param0 * (long)var2;
                if (-var3 + ((bs) this).field_q >= 0L) {
                  ((bs) this).field_O = var3;
                  break L1;
                } else {
                  var5 = (int)((((bs) this).field_q - ((bs) this).field_O + ((long)var2 + -1L)) / (long)var2);
                  ((bs) this).field_O = ((bs) this).field_O + (long)var5 * (long)var2;
                  param0 = param0 - var5;
                  ((bs) this).field_s.a(var5);
                  this.d(18922);
                  if (((bs) this).field_v.c()) {
                    continue L2;
                  } else {
                    ((bs) this).field_s.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          ((bs) this).field_s.a(param0);
          break L0;
        }
    }

    public bs() {
        ((bs) this).field_R = new int[16];
        ((bs) this).field_T = new int[16];
        ((bs) this).field_B = new int[16];
        ((bs) this).field_F = new int[16];
        ((bs) this).field_H = new int[16];
        ((bs) this).field_y = new int[16];
        ((bs) this).field_P = new uu[16][128];
        ((bs) this).field_r = 256;
        ((bs) this).field_w = new int[16];
        ((bs) this).field_E = 1000000;
        ((bs) this).field_L = new int[16];
        ((bs) this).field_N = new int[16];
        ((bs) this).field_t = new uu[16][128];
        ((bs) this).field_S = new int[16];
        ((bs) this).field_x = new int[16];
        ((bs) this).field_G = new int[16];
        ((bs) this).field_K = new int[16];
        ((bs) this).field_D = new int[16];
        ((bs) this).field_J = new int[16];
        ((bs) this).field_z = new int[16];
        ((bs) this).field_v = new sh();
        ((bs) this).field_s = new rh((bs) this);
        ((bs) this).field_p = new te(128);
        ((bs) this).a((byte) -127, -1, 256);
        this.a(true, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
