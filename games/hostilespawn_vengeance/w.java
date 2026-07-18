/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends tj {
    private int[] field_L;
    static int field_r;
    private int[] field_F;
    static fa field_S;
    private gh field_G;
    private int[] field_u;
    int[] field_H;
    private tm[][] field_P;
    int[] field_l;
    private int[] field_w;
    private int[] field_T;
    private int[] field_n;
    private jm field_I;
    int[] field_C;
    private int[] field_o;
    private int[] field_E;
    static String field_A;
    private int[] field_t;
    private int[] field_O;
    private int[] field_M;
    private int[] field_v;
    private int field_p;
    private int[] field_y;
    private tm[][] field_q;
    private int field_m;
    private dl field_B;
    private long field_N;
    private long field_x;
    private int field_D;
    private boolean field_R;
    private int field_K;
    private int field_s;
    private ji field_z;
    private boolean field_J;

    private final void c(int param0, byte param1) {
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 >= 0) {
          L0: {
            ((w) this).field_O[param0] = 12800;
            ((w) this).field_v[param0] = 8192;
            ((w) this).field_T[param0] = 16383;
            ((w) this).field_E[param0] = 8192;
            ((w) this).field_y[param0] = 0;
            ((w) this).field_L[param0] = 8192;
            this.a(param0, false);
            this.a(param0, 4);
            ((w) this).field_C[param0] = 0;
            ((w) this).field_u[param0] = 32767;
            ((w) this).field_t[param0] = 256;
            ((w) this).field_H[param0] = 0;
            if (param1 >= 6) {
              break L0;
            } else {
              this.d(16);
              break L0;
            }
          }
          this.b(-112, 8192, param0);
          return;
        } else {
          param0 = 0;
          L1: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.c(param0, (byte) 90);
              param0++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, byte param1) {
        tm var3 = null;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var3 = (tm) (Object) ((w) this).field_B.field_t.g(-4);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (var3.field_E == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3.field_h < 0) {
                ((w) this).field_q[var3.field_E][var3.field_z] = null;
                var3.field_h = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
            continue L0;
          }
        }
    }

    final synchronized boolean a(int param0, ji param1, gb param2, rd param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        bc var8 = null;
        int var9 = 0;
        int var11 = 0;
        nf var12 = null;
        nf var13 = null;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              if (!param4) {
                break L1;
              } else {
                ((w) this).field_K = -87;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (param0 > 0) {
                var7 = (Object) (Object) new int[]{param0};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (bc) (Object) param1.field_i.a(-104);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param1.a();
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_c;
                  var12 = (nf) (Object) ((w) this).field_I.a(false, (long)var9);
                  if (var12 == null) {
                    var13 = ne.a(param2, -19, var9);
                    if (var13 == null) {
                      var6_int = 0;
                      break L5;
                    } else {
                      ((w) this).field_I.a(-116, (long)var9, (am) (Object) var13);
                      if (var13.a((int[]) var7, var8.field_h, param3, -20752)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    }
                  } else {
                    if (var12.a((int[]) var7, var8.field_h, param3, -20752)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (bc) (Object) param1.field_i.b(-1);
                      continue L3;
                    }
                  }
                }
                var8 = (bc) (Object) param1.field_i.b(-1);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("w.UA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param4 + ')');
        }
        return stackIn_20_0 != 0;
    }

    private final void b(int param0, int param1) {
        tm var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (param0 > 16) {
            break L0;
          } else {
            var5 = null;
            ((w) this).b((int[]) null, -11, 107);
            break L0;
          }
        }
        var3 = (tm) (Object) ((w) this).field_B.field_t.g(-95);
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (param1 != var3.field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var3.field_A == null) {
                  break L4;
                } else {
                  L5: {
                    var3.field_A.h(ug.field_g / 100);
                    if (var3.field_A.m()) {
                      ((w) this).field_B.field_q.b((tj) (Object) var3.field_A);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.b(true);
                  break L4;
                }
              }
              L6: {
                if (var3.field_h >= 0) {
                  break L6;
                } else {
                  ((w) this).field_q[var3.field_E][var3.field_z] = null;
                  break L6;
                }
              }
              var3.b(123);
              break L2;
            }
            var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
            continue L1;
          }
        }
    }

    final boolean a(byte param0, tm param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
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
            if (null == param1.field_A) {
              L1: {
                if (0 > param1.field_h) {
                  break L1;
                } else {
                  param1.b(-108);
                  if (param1.field_m <= 0) {
                    break L1;
                  } else {
                    if (param1 == ((w) this).field_P[param1.field_E][param1.field_m]) {
                      ((w) this).field_P[param1.field_E][param1.field_m] = null;
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              if (param0 > 10) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("w.IA(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final synchronized tj b() {
        return null;
    }

    private final void a(byte param0, int param1, int param2) {
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          if (((w) this).field_G.c()) {
            var2 = ((w) this).field_p * ((w) this).field_G.field_f / ug.field_g;
            L1: while (true) {
              L2: {
                var3 = ((w) this).field_N - -((long)var2 * (long)param0);
                if (((w) this).field_x + -var3 < 0L) {
                  var5 = (int)((-1L + ((long)var2 + -((w) this).field_N) + ((w) this).field_x) / (long)var2);
                  ((w) this).field_N = ((w) this).field_N + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((w) this).field_B.c(var5);
                  this.d(0);
                  if (!((w) this).field_G.c()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((w) this).field_N = var3;
                  break L2;
                }
              }
              ((w) this).field_B.c(param0);
              break L0;
            }
          } else {
            ((w) this).field_B.c(param0);
            break L0;
          }
        }
    }

    synchronized void a(boolean param0, byte param1, boolean param2, ji param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        try {
            this.a((byte) 61, param2);
            ((w) this).field_G.a(param3.field_h);
            ((w) this).field_N = 0L;
            if (param1 <= 123) {
                ((w) this).field_E = null;
            }
            ((w) this).field_R = param0 ? true : false;
            var5_int = ((w) this).field_G.g();
            for (var6 = 0; var5_int > var6; var6++) {
                ((w) this).field_G.e(var6);
                ((w) this).field_G.d(var6);
                ((w) this).field_G.a(var6);
            }
            ((w) this).field_D = ((w) this).field_G.d();
            ((w) this).field_K = ((w) this).field_G.field_a[((w) this).field_D];
            ((w) this).field_x = ((w) this).field_G.b(((w) this).field_K);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "w.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        ((w) this).field_F[param2] = param1;
        ((w) this).field_o[param2] = ua.a(param1, -128);
        this.d(-14089, param1, param2);
    }

    private final int a(tm param0, boolean param1) {
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
            var3_int = ((w) this).field_v[param0.field_E];
            if (8192 > var3_int) {
              stackOut_3_0 = 32 + param0.field_n * var3_int >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -(32 + (128 + -param0.field_n) * (16384 - var3_int) >> 6) + 16384;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("w.BB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 > -42) {
            ((w) this).field_u = null;
        }
        ((w) this).field_w[param2] = param1;
        ((w) this).field_l[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1) + 0.5);
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        tm var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        tm var5 = ((w) this).field_q[param1][param2];
        if (var5 == null) {
            return;
        }
        ((w) this).field_q[param1][param2] = null;
        if ((2 & ((w) this).field_C[param1]) == 0) {
            var5.field_h = 0;
        } else {
            var6 = (tm) (Object) ((w) this).field_B.field_t.g(-23);
            while (var6 != null) {
                if (var6.field_E == var5.field_E) {
                    if (0 > var6.field_h) {
                        if (!(var6 == var5)) {
                            var5.field_h = 0;
                            break;
                        }
                    }
                }
                var6 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
            }
        }
    }

    private final int a(tm param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pl var9 = null;
        pl var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (((w) this).field_M[param0.field_E] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param0.field_x;
                var10 = var9;
                var4 = 4096 + ((w) this).field_T[param0.field_E] * ((w) this).field_O[param0.field_E] >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = var4 * param0.field_D + 16384 >> 15;
                var4 = 128 + var4 * ((w) this).field_m >> 8;
                var4 = ((w) this).field_M[param0.field_E] * var4 + 128 >> 8;
                if (0 < var10.field_b) {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_k * (double)var10.field_b) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_C;
                    var6 = var10.field_n[1 + param0.field_w];
                    if (param0.field_w < var10.field_n.length - 2) {
                      var7 = (var9.field_n[param0.field_w] & 255) << 8;
                      var8 = 65280 & var10.field_n[param0.field_w + 2] << 8;
                      var6 = var6 + (-var7 + var5) * (var10.field_n[3 + param0.field_w] + -var6) / (var8 + -var7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var6 - -32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param0.field_h <= 0) {
                  break L4;
                } else {
                  if (var10.field_m == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_h;
                      var6 = var10.field_m[1 + param0.field_l];
                      if (var10.field_m.length + -2 > param0.field_l) {
                        var7 = var9.field_m[param0.field_l] << 8 & 65280;
                        var8 = (255 & var10.field_m[2 + param0.field_l]) << 8;
                        var6 = var6 + (-var6 + var10.field_m[param0.field_l + 3]) * (var5 - var7) / (-var7 + var8);
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
              var5 = -109 % ((-7 - param1) / 40);
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("w.R(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    final boolean a(tm param0, int param1, int param2, int param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        pl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_12_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              param0.field_u = ug.field_g / 100;
              if (param3 == 31458) {
                break L1;
              } else {
                this.a(50, -29, 123, -115);
                break L1;
              }
            }
            L2: {
              if (0 > param0.field_h) {
                break L2;
              } else {
                L3: {
                  if (param0.field_A == null) {
                    break L3;
                  } else {
                    if (!param0.field_A.j()) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  param0.b(true);
                  param0.b(119);
                  if (param0.field_m <= 0) {
                    break L4;
                  } else {
                    if (((w) this).field_P[param0.field_E][param0.field_m] == param0) {
                      ((w) this).field_P[param0.field_E][param0.field_m] = null;
                      break L4;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
            L5: {
              var6_int = param0.field_t;
              if (0 < var6_int) {
                L6: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)((w) this).field_L[param0.field_E] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (var6_int >= 0) {
                    break L6;
                  } else {
                    var6_int = 0;
                    break L6;
                  }
                }
                param0.field_t = var6_int;
                break L5;
              } else {
                break L5;
              }
            }
            L7: {
              param0.field_A.i(this.a(1, param0));
              var7 = param0.field_x;
              var8 = 0;
              param0.field_j = param0.field_j + var7.field_e;
              param0.field_B = param0.field_B + 1;
              var9 = (double)((param0.field_z + -60 << 8) + (param0.field_t * param0.field_F >> 12)) * 0.000005086263020833333;
              if (var7.field_b > 0) {
                L8: {
                  if (var7.field_h <= 0) {
                    param0.field_k = param0.field_k + 128;
                    break L8;
                  } else {
                    param0.field_k = param0.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_h));
                    break L8;
                  }
                }
                if (var7.field_b * param0.field_k >= 819200) {
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
              if (null == var7.field_n) {
                break L9;
              } else {
                L10: {
                  if (var7.field_o > 0) {
                    param0.field_C = param0.field_C + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_o) * 128.0);
                    break L10;
                  } else {
                    param0.field_C = param0.field_C + 128;
                    break L10;
                  }
                }
                L11: while (true) {
                  L12: {
                    if (-2 + var7.field_n.length <= param0.field_w) {
                      break L12;
                    } else {
                      if (param0.field_C <= (255 & var7.field_n[2 + param0.field_w]) << 8) {
                        break L12;
                      } else {
                        param0.field_w = param0.field_w + 2;
                        continue L11;
                      }
                    }
                  }
                  if (var7.field_n.length - 2 != param0.field_w) {
                    break L9;
                  } else {
                    if (var7.field_n[param0.field_w + 1] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L13: {
              if (param0.field_h < 0) {
                break L13;
              } else {
                if (var7.field_m == null) {
                  break L13;
                } else {
                  if (0 == (1 & ((w) this).field_C[param0.field_E])) {
                    L14: {
                      if (0 > param0.field_m) {
                        break L14;
                      } else {
                        if (param0 != ((w) this).field_P[param0.field_E][param0.field_m]) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (var7.field_c > 0) {
                        param0.field_h = param0.field_h + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                        break L15;
                      } else {
                        param0.field_h = param0.field_h + 128;
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param0.field_l >= var7.field_m.length + -2) {
                          break L17;
                        } else {
                          if (param0.field_h <= (var7.field_m[2 + param0.field_l] & 255) << 8) {
                            break L17;
                          } else {
                            param0.field_l = param0.field_l + 2;
                            continue L16;
                          }
                        }
                      }
                      if (param0.field_l != var7.field_m.length + -2) {
                        break L13;
                      } else {
                        var8 = 1;
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            if (var8 != 0) {
              L18: {
                param0.field_A.h(param0.field_u);
                if (param4 == null) {
                  param0.field_A.c(param1);
                  break L18;
                } else {
                  param0.field_A.b(param4, param2, param1);
                  break L18;
                }
              }
              L19: {
                if (!param0.field_A.m()) {
                  break L19;
                } else {
                  ((w) this).field_B.field_q.b((tj) (Object) param0.field_A);
                  break L19;
                }
              }
              L20: {
                param0.b(true);
                if (param0.field_h < 0) {
                  break L20;
                } else {
                  param0.b(-29);
                  if (param0.field_m <= 0) {
                    break L20;
                  } else {
                    if (param0 == ((w) this).field_P[param0.field_E][param0.field_m]) {
                      ((w) this).field_P[param0.field_E][param0.field_m] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              stackOut_64_0 = 1;
              stackIn_65_0 = stackOut_64_0;
              return stackIn_65_0 != 0;
            } else {
              param0.field_A.a(param0.field_u, this.a(param0, (byte) 68), this.a(param0, true));
              stackOut_66_0 = 0;
              stackIn_67_0 = stackOut_66_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("w.N(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
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
          L22: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L22;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L22;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ')');
        }
        return stackIn_67_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        tm var3 = null;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (0 != (((w) this).field_C[param0] & 2)) {
            var3 = (tm) (Object) ((w) this).field_B.field_t.g(-64);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_E != param0) {
                    break L2;
                  } else {
                    if (((w) this).field_q[param0][var3.field_z] == null) {
                      if (0 > var3.field_h) {
                        var3.field_h = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
                      continue L1;
                    }
                  }
                }
                var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final int g(int param0) {
        int var2 = 118 / (param0 / 42);
        return ((w) this).field_m;
    }

    private final void a(int param0, int param1) {
        tm var3 = null;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if ((4 & ((w) this).field_C[param0]) != 0) {
            var3 = (tm) (Object) ((w) this).field_B.field_t.g(-53);
            while (var3 != null) {
                if (!(var3.field_E != param0)) {
                    var3.field_i = 0;
                }
                var3 = (tm) (Object) ((w) this).field_B.field_t.a(12684);
            }
        }
    }

    final synchronized void c(int param0, int param1, int param2) {
        if (param0 != 2) {
            ((w) this).field_M = null;
        }
        this.b((byte) 22, param1, param2);
    }

    final synchronized void c(int param0, int param1) {
        ((w) this).field_p = param0;
        if (param1 < 93) {
            ((w) this).field_J = false;
        }
    }

    final synchronized void b(byte param0, int param1) {
        ((w) this).field_m = param1;
        int var3 = -10 / ((-1 - param0) / 40);
    }

    public static void a(boolean param0) {
        field_A = null;
        field_S = null;
    }

    final synchronized boolean f(int param0) {
        if (param0 != 323697071) {
            ((w) this).field_y = null;
        }
        return ((w) this).field_G.c();
    }

    private final int a(int param0, tm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        pl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_t * param1.field_F >> 12) + param1.field_y;
              var3_int = var3_int + ((-8192 + ((w) this).field_E[param1.field_E]) * ((w) this).field_t[param1.field_E] >> 12);
              var4 = param1.field_x;
              if (param0 == 1) {
                break L1;
              } else {
                ((w) this).field_B = null;
                break L1;
              }
            }
            L2: {
              if (-1 <= var4.field_e) {
                break L2;
              } else {
                L3: {
                  if (-1 < var4.field_g) {
                    break L3;
                  } else {
                    if (((w) this).field_y[param1.field_E] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_g << 2;
                  var6 = var4.field_d << 1;
                  if (var6 <= param1.field_B) {
                    break L4;
                  } else {
                    var5 = var5 * param1.field_B / var6;
                    break L4;
                  }
                }
                var5 = var5 + (((w) this).field_y[param1.field_E] >> 7);
                var7 = Math.sin((double)(param1.field_j & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(256 * param1.field_r.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)ug.field_g);
              if (1 <= var5) {
                stackOut_11_0 = var5;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = 1;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("w.TA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        if (!(param1 == ((w) this).field_n[param2])) {
            ((w) this).field_n[param2] = param1;
            for (var4 = 0; var4 < 128; var4++) {
                ((w) this).field_P[param2][var4] = null;
            }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        tm var5 = null;
        jb var6 = null;
        int var6_int = 0;
        tm var7 = null;
        tm var8 = null;
        int var9 = 0;
        nf var10 = null;
        nf var11 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          this.a(64, param2, param3, (byte) 63);
          if ((2 & ((w) this).field_C[param2]) == 0) {
            break L0;
          } else {
            var5 = (tm) (Object) ((w) this).field_B.field_t.b((byte) 117);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_E != param2) {
                    break L2;
                  } else {
                    if (var5.field_h >= 0) {
                      break L2;
                    } else {
                      ((w) this).field_q[param2][var5.field_z] = null;
                      ((w) this).field_q[param2][param3] = var5;
                      var6_int = var5.field_y - -(var5.field_t * var5.field_F >> 12);
                      var5.field_y = var5.field_y + (-var5.field_z + param3 << 8);
                      var5.field_z = param3;
                      var5.field_t = 4096;
                      var5.field_F = -var5.field_y + var6_int;
                      return;
                    }
                  }
                }
                var5 = (tm) (Object) ((w) this).field_B.field_t.a((byte) 124);
                continue L1;
              }
            }
          }
        }
        var10 = (nf) (Object) ((w) this).field_I.a(false, (long)((w) this).field_n[param2]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_q[param3];
          if (var6 == null) {
            return;
          } else {
            var7 = new tm();
            var7.field_r = var6;
            var7.field_E = param2;
            var7.field_p = var10;
            var7.field_x = var10.field_o[param3];
            var7.field_m = var10.field_s[param3];
            var7.field_z = param3;
            var7.field_D = 1024 + var11.field_j * param1 * param1 * var10.field_i[param3] >> 11;
            var7.field_n = 255 & var10.field_l[param3];
            var7.field_y = (param3 << 8) + -(var10.field_r[param3] & 32767);
            var7.field_l = 0;
            var7.field_k = 0;
            if (param0 == 35) {
              L3: {
                var7.field_h = -1;
                var7.field_w = 0;
                var7.field_C = 0;
                if (((w) this).field_H[param2] != 0) {
                  L4: {
                    var7.field_A = b.a(var6, this.a(1, var7), 0, this.a(var7, true));
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var11.field_r[param3] >= 0) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L4;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L4;
                    }
                  }
                  ((w) this).a(stackIn_20_1 != 0, var7, -128);
                  break L3;
                } else {
                  var7.field_A = b.a(var6, this.a(param0 ^ 34, var7), this.a(var7, (byte) -75), this.a(var7, true));
                  break L3;
                }
              }
              L5: {
                if (var11.field_r[param3] < 0) {
                  var7.field_A.d(-1);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 > var7.field_m) {
                  break L6;
                } else {
                  L7: {
                    var8 = ((w) this).field_P[param2][var7.field_m];
                    if (var8 == null) {
                      break L7;
                    } else {
                      if (var8.field_h >= 0) {
                        break L7;
                      } else {
                        ((w) this).field_q[param2][var8.field_z] = null;
                        var8.field_h = 0;
                        break L7;
                      }
                    }
                  }
                  ((w) this).field_P[param2][var7.field_m] = var7;
                  break L6;
                }
              }
              ((w) this).field_B.field_t.a((am) (Object) var7, param0 ^ 74);
              ((w) this).field_q[param2][param3] = var7;
              return;
            } else {
              return;
            }
          }
        }
    }

    final synchronized void a(boolean param0, byte param1, ji param2) {
        try {
            if (param1 < 8) {
                Object var5 = null;
                boolean discarded$0 = ((w) this).a((byte) -14, (tm) null);
            }
            ((w) this).a(param0, (byte) 124, true, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "w.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -16257) {
            ((w) this).field_v = null;
        }
    }

    final void a(boolean param0, tm param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
                var4_int = param1.field_r.field_k.length;
                if (!param0) {
                  break L2;
                } else {
                  if (!param1.field_r.field_m) {
                    break L2;
                  } else {
                    var6 = var4_int + var4_int - param1.field_r.field_l;
                    var5 = (int)((long)((w) this).field_H[param1.field_E] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      var5 = -var5 + -1 + var4_int - -var4_int;
                      param1.field_A.a(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)((w) this).field_H[param1.field_E] * (long)var4_int >> 6);
              break L1;
            }
            L3: {
              param1.field_A.e(var5);
              if (param2 <= -104) {
                break L3;
              } else {
                ((w) this).field_O = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("w.GA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static void b(boolean param0, int param1) {
        pc.a(param0, false, false);
    }

    private final void a(int param0, int param1, int param2) {
        ((w) this).field_E[param0] = param2;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var4 = -73;
        var3 = param1 & 240;
        if (var3 == 128) {
          var5 = 15 & param1;
          var6 = (32556 & param1) >> 8;
          var7 = (8342895 & param1) >> 16;
          this.a(var7, var5, var6, (byte) 63);
          return;
        } else {
          L0: {
            if (144 != var3) {
              if (var3 == 160) {
                var5 = 15 & param1;
                var6 = (32541 & param1) >> 8;
                var7 = (8342347 & param1) >> 16;
                this.a(var6, -16257, var7, var5);
                return;
              } else {
                if (var3 == 176) {
                  L1: {
                    var5 = 15 & param1;
                    var6 = param1 >> 8 & 127;
                    var7 = 127 & param1 >> 16;
                    if (0 != var6) {
                      break L1;
                    } else {
                      ((w) this).field_o[var5] = ua.a(((w) this).field_o[var5], -2080769) + (var7 << 14);
                      break L1;
                    }
                  }
                  L2: {
                    if (var6 == 32) {
                      ((w) this).field_o[var5] = (var7 << 7) + ua.a(-16257, ((w) this).field_o[var5]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (1 == var6) {
                      ((w) this).field_y[var5] = (var7 << 7) + ua.a(-16257, ((w) this).field_y[var5]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var6 != 33) {
                      break L4;
                    } else {
                      ((w) this).field_y[var5] = var7 + ua.a(((w) this).field_y[var5], -128);
                      break L4;
                    }
                  }
                  L5: {
                    if (var6 != 5) {
                      break L5;
                    } else {
                      ((w) this).field_L[var5] = ua.a(((w) this).field_L[var5], -16257) + (var7 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var6) {
                      break L6;
                    } else {
                      ((w) this).field_L[var5] = ua.a(-128, ((w) this).field_L[var5]) - -var7;
                      break L6;
                    }
                  }
                  L7: {
                    if (var6 == 7) {
                      ((w) this).field_O[var5] = ua.a(((w) this).field_O[var5], -16257) + (var7 << 7);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var6 == 39) {
                      ((w) this).field_O[var5] = var7 + ua.a(((w) this).field_O[var5], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var6) {
                      ((w) this).field_v[var5] = (var7 << 7) + ua.a(((w) this).field_v[var5], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var6 != 42) {
                      break L10;
                    } else {
                      ((w) this).field_v[var5] = var7 + ua.a(-128, ((w) this).field_v[var5]);
                      break L10;
                    }
                  }
                  L11: {
                    if (var6 == 11) {
                      ((w) this).field_T[var5] = ua.a(-16257, ((w) this).field_T[var5]) + (var7 << 7);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var6 == 43) {
                      ((w) this).field_T[var5] = ua.a(((w) this).field_T[var5], -128) - -var7;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var6 != 64) {
                      break L13;
                    } else {
                      if (var7 >= 64) {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 1);
                        break L13;
                      } else {
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var6) {
                      if (var7 >= 64) {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 2);
                        break L14;
                      } else {
                        this.a(var5, false);
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var6 != 99) {
                      break L15;
                    } else {
                      ((w) this).field_u[var5] = ua.a(127, ((w) this).field_u[var5]) + (var7 << 7);
                      break L15;
                    }
                  }
                  L16: {
                    if (var6 != 98) {
                      break L16;
                    } else {
                      ((w) this).field_u[var5] = ua.a(((w) this).field_u[var5], 16256) + var7;
                      break L16;
                    }
                  }
                  L17: {
                    if (101 != var6) {
                      break L17;
                    } else {
                      ((w) this).field_u[var5] = ua.a(127, ((w) this).field_u[var5]) + (16384 + (var7 << 7));
                      break L17;
                    }
                  }
                  L18: {
                    if (var6 != 100) {
                      break L18;
                    } else {
                      ((w) this).field_u[var5] = var7 + 16384 + ua.a(((w) this).field_u[var5], 16256);
                      break L18;
                    }
                  }
                  L19: {
                    if (var6 == 120) {
                      this.b(106, var5);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (121 == var6) {
                      this.c(var5, (byte) 15);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var6) {
                      break L21;
                    } else {
                      this.b(var5, (byte) 116);
                      break L21;
                    }
                  }
                  L22: {
                    if (var6 != 6) {
                      break L22;
                    } else {
                      var8 = ((w) this).field_u[var5];
                      if (var8 != 16384) {
                        break L22;
                      } else {
                        ((w) this).field_t[var5] = (var7 << 7) + ua.a(-16257, ((w) this).field_t[var5]);
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var6 != 38) {
                      break L23;
                    } else {
                      var8 = ((w) this).field_u[var5];
                      if (var8 == 16384) {
                        ((w) this).field_t[var5] = ua.a(((w) this).field_t[var5], -128) + var7;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var6 == 16) {
                      ((w) this).field_H[var5] = (var7 << 7) + ua.a(((w) this).field_H[var5], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var6 == 48) {
                      ((w) this).field_H[var5] = var7 + ua.a(-128, ((w) this).field_H[var5]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var6 == 81) {
                      if (var7 < 64) {
                        this.a(var5, 4);
                        ((w) this).field_C[var5] = ua.a(((w) this).field_C[var5], -5);
                        break L26;
                      } else {
                        ((w) this).field_C[var5] = ll.a(((w) this).field_C[var5], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (17 == var6) {
                      this.b(-91, (var7 << 7) + (-16257 & ((w) this).field_w[var5]), var5);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var6 != 49) {
                    break L0;
                  } else {
                    this.b(-75, (-128 & ((w) this).field_w[var5]) - -var7, var5);
                    return;
                  }
                } else {
                  if (var3 != 192) {
                    if (var3 != 208) {
                      if (var3 != 224) {
                        var3 = 255 & param1;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, 2065687494);
                          return;
                        }
                      } else {
                        var5 = param1 & 15;
                        var6 = ((8323466 & param1) >> 9) - -(param1 >> 8 & 127);
                        this.a(var5, -120, var6);
                        return;
                      }
                    } else {
                      var5 = param1 & 15;
                      var6 = (param1 & 32765) >> 8;
                      this.a((byte) 93, var6, var5);
                      return;
                    }
                  } else {
                    var5 = 15 & param1;
                    var6 = param1 >> 8 & 127;
                    this.d(-14089, var6 + ((w) this).field_o[var5], var5);
                    return;
                  }
                }
              }
            } else {
              var5 = param1 & 15;
              var6 = 127 & param1 >> 8;
              var7 = (8326969 & param1) >> 16;
              if (var7 > 0) {
                this.a((byte) 35, var7, var5, var6);
                return;
              } else {
                this.a(64, var5, var6, (byte) 63);
                break L0;
              }
            }
          }
          return;
        }
    }

    final synchronized tj d() {
        return (tj) (Object) ((w) this).field_B;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
            this.b(-1, (byte) 116);
        } else {
            this.b(61, -1);
        }
        this.c(-1, (byte) 106);
        for (var3 = 0; var3 < 16; var3++) {
            ((w) this).field_n[var3] = ((w) this).field_F[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((w) this).field_o[var5] = ua.a(-128, ((w) this).field_F[var5]);
            var5++;
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        if (param0 <= 56) {
            ((w) this).field_z = null;
        }
        ((w) this).field_G.b();
        ((w) this).field_z = null;
        this.a(param1, 2065687494);
    }

    synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((w) this).field_G.c()) {
                  break L2;
                } else {
                  var4_int = ((w) this).field_G.field_f * ((w) this).field_p / ug.field_g;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + ((w) this).field_N;
                    if (-var5 + ((w) this).field_x < 0L) {
                      var7 = (int)((-1L + ((long)var4_int + -((w) this).field_N + ((w) this).field_x)) / (long)var4_int);
                      ((w) this).field_N = ((w) this).field_N + (long)var7 * (long)var4_int;
                      ((w) this).field_B.b(param0, param1, var7);
                      this.d(0);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (((w) this).field_G.c()) {
                        continue L3;
                      } else {
                        ((w) this).field_B.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((w) this).field_N = var5;
                      break L2;
                    }
                  }
                }
              }
              ((w) this).field_B.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("w.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 4491) {
            this.a((byte) 108, -57, -120, 20);
        }
        this.a((byte) 109, true);
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          var2 = ((w) this).field_D;
          var3 = ((w) this).field_K;
          var4 = ((w) this).field_x;
          if (((w) this).field_z == null) {
            break L0;
          } else {
            if (var3 == ((w) this).field_s) {
              ((w) this).a(((w) this).field_R, (byte) 127, ((w) this).field_J, ((w) this).field_z);
              this.d(0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((w) this).field_K != var3) {
            L2: {
              ((w) this).field_K = var3;
              ((w) this).field_D = var2;
              if (param0 == 0) {
                break L2;
              } else {
                ((w) this).field_F = null;
                break L2;
              }
            }
            L3: {
              ((w) this).field_x = var4;
              if (null == ((w) this).field_z) {
                break L3;
              } else {
                if (((w) this).field_s < var3) {
                  ((w) this).field_D = -1;
                  ((w) this).field_K = ((w) this).field_s;
                  ((w) this).field_x = ((w) this).field_G.b(((w) this).field_K);
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
                if (var3 != ((w) this).field_G.field_a[var2]) {
                  break L5;
                } else {
                  ((w) this).field_G.e(var2);
                  var6 = ((w) this).field_G.c(var2);
                  if (1 == var6) {
                    ((w) this).field_G.a();
                    ((w) this).field_G.a(var2);
                    if (((w) this).field_G.e()) {
                      if (((w) this).field_z != null) {
                        ((w) this).a(((w) this).field_R, (byte) 52, ((w) this).field_z);
                        this.d(0);
                        return;
                      } else {
                        L6: {
                          if (!((w) this).field_R) {
                            break L6;
                          } else {
                            if (0 == var3) {
                              break L6;
                            } else {
                              ((w) this).field_G.a(var4);
                              break L5;
                            }
                          }
                        }
                        this.a(true, 2065687494);
                        ((w) this).field_G.b();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if ((var6 & 128) != 0) {
                        this.a((byte) -103, var6);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((w) this).field_G.d(var2);
                    ((w) this).field_G.a(var2);
                    continue L4;
                  }
                }
              }
              var2 = ((w) this).field_G.d();
              var3 = ((w) this).field_G.field_a[var2];
              var4 = ((w) this).field_G.b(var3);
              continue L1;
            }
          }
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (param2 <= -47) {
            break L0;
          } else {
            int discarded$2 = ((w) this).g(95);
            break L0;
          }
        }
        L1: {
          if (param1 >= 0) {
            ((w) this).field_M[param1] = param0;
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 16) {
                break L1;
              } else {
                ((w) this).field_M[var4] = param0;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    public w() {
        ((w) this).field_H = new int[16];
        ((w) this).field_u = new int[16];
        ((w) this).field_L = new int[16];
        ((w) this).field_w = new int[16];
        ((w) this).field_F = new int[16];
        ((w) this).field_n = new int[16];
        ((w) this).field_P = new tm[16][128];
        ((w) this).field_l = new int[16];
        ((w) this).field_E = new int[16];
        ((w) this).field_o = new int[16];
        ((w) this).field_v = new int[16];
        ((w) this).field_t = new int[16];
        ((w) this).field_p = 1000000;
        ((w) this).field_O = new int[16];
        ((w) this).field_M = new int[16];
        ((w) this).field_q = new tm[16][128];
        ((w) this).field_T = new int[16];
        ((w) this).field_y = new int[16];
        ((w) this).field_C = new int[16];
        ((w) this).field_m = 256;
        ((w) this).field_G = new gh();
        ((w) this).field_B = new dl((w) this);
        ((w) this).field_I = new jm(128);
        ((w) this).a(256, -1, (byte) -76);
        this.a(true, 2065687494);
    }

    w(w param0) {
        ((w) this).field_H = new int[16];
        ((w) this).field_u = new int[16];
        ((w) this).field_L = new int[16];
        ((w) this).field_w = new int[16];
        ((w) this).field_F = new int[16];
        ((w) this).field_n = new int[16];
        ((w) this).field_P = new tm[16][128];
        ((w) this).field_l = new int[16];
        ((w) this).field_E = new int[16];
        ((w) this).field_o = new int[16];
        ((w) this).field_v = new int[16];
        ((w) this).field_t = new int[16];
        ((w) this).field_p = 1000000;
        ((w) this).field_O = new int[16];
        ((w) this).field_M = new int[16];
        ((w) this).field_q = new tm[16][128];
        ((w) this).field_T = new int[16];
        ((w) this).field_y = new int[16];
        ((w) this).field_C = new int[16];
        ((w) this).field_m = 256;
        ((w) this).field_G = new gh();
        ((w) this).field_B = new dl((w) this);
        try {
            ((w) this).field_I = param0.field_I;
            ((w) this).a(256, -1, (byte) -77);
            this.a(true, 2065687494);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = 0;
        field_A = "<col=ffffff>Pistol</col><br>If one of your weapons runs out of ammo, you will revert to using your pistol. This weapon has unlimited ammo, but a slow rate of fire, so try not to rely on it. Keep ammo stocked for the better weapons.";
        field_S = new fa("");
    }
}
