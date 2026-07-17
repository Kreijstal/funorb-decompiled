/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends hn {
    private dw field_q;
    private int[] field_u;
    static int[] field_E;
    static nj field_H;
    private mi[][] field_I;
    int[] field_s;
    private int[] field_F;
    private bg field_T;
    private int[] field_P;
    private mi[][] field_M;
    private int[] field_C;
    private int field_v;
    private int field_U;
    private int[] field_A;
    static rg field_p;
    private int[] field_V;
    private static byte[] field_G;
    private int[] field_r;
    private int[] field_D;
    private int[] field_x;
    int[] field_o;
    int[] field_W;
    private int[] field_N;
    private int[] field_O;
    static String field_R;
    private int[] field_w;
    private int[] field_J;
    static int field_ab;
    static String field_X;
    private long field_z;
    private int field_K;
    private int field_t;
    private boolean field_Z;
    private long field_Y;
    private os field_Q;
    private boolean field_y;
    private um field_B;
    private int field_L;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = ((ih) this).field_K;
          var3 = ((ih) this).field_t;
          var4 = ((ih) this).field_Y;
          if (null == ((ih) this).field_B) {
            break L0;
          } else {
            if (var3 != ((ih) this).field_L) {
              break L0;
            } else {
              ((ih) this).a(((ih) this).field_Z, (byte) -90, ((ih) this).field_y, ((ih) this).field_B);
              this.a((byte) 36);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((ih) this).field_t) {
            L2: {
              ((ih) this).field_Y = var4;
              ((ih) this).field_K = var2;
              ((ih) this).field_t = var3;
              if (((ih) this).field_B == null) {
                break L2;
              } else {
                if (((ih) this).field_L < var3) {
                  ((ih) this).field_t = ((ih) this).field_L;
                  ((ih) this).field_K = -1;
                  ((ih) this).field_Y = ((ih) this).field_q.b(((ih) this).field_t);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((ih) this).field_q.field_i[var2]) {
                  break L4;
                } else {
                  ((ih) this).field_q.d(var2);
                  var6 = ((ih) this).field_q.c(var2);
                  if (var6 == 1) {
                    ((ih) this).field_q.a();
                    ((ih) this).field_q.a(var2);
                    if (((ih) this).field_q.b()) {
                      if (null == ((ih) this).field_B) {
                        L5: {
                          if (!((ih) this).field_Z) {
                            break L5;
                          } else {
                            if (var3 == 0) {
                              break L5;
                            } else {
                              ((ih) this).field_q.a(var4);
                              break L4;
                            }
                          }
                        }
                        this.a(true, true);
                        ((ih) this).field_q.f();
                        return;
                      } else {
                        ((ih) this).a(2, ((ih) this).field_Z, ((ih) this).field_B);
                        this.a((byte) 36);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if (0 == (var6 & 128)) {
                        break L6;
                      } else {
                        this.a((byte) 127, var6);
                        break L6;
                      }
                    }
                    ((ih) this).field_q.f(var2);
                    ((ih) this).field_q.a(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((ih) this).field_q.e();
              var3 = ((ih) this).field_q.field_i[var2];
              var4 = ((ih) this).field_q.b(var3);
              continue L1;
            }
          }
        }
    }

    private final int a(byte param0, mi param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fq var9 = null;
        fq var10 = null;
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
            if (((ih) this).field_w[param1.field_m] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param1.field_v;
                var10 = var9;
                var4 = ((ih) this).field_A[param1.field_m] * ((ih) this).field_N[param1.field_m] + 4096 >> 13;
                var4 = 16384 + var4 * var4 >> 15;
                var4 = param1.field_u * var4 + 16384 >> 15;
                var4 = 128 + var4 * ((ih) this).field_v >> 8;
                var4 = var4 * ((ih) this).field_w[param1.field_m] - -128 >> 8;
                if (0 < var10.field_d) {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_o * (double)var10.field_d) * (double)var4);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10.field_l != null) {
                  L3: {
                    var5 = param1.field_s;
                    var6 = var10.field_l[param1.field_A - -1];
                    if (param1.field_A >= -2 + var10.field_l.length) {
                      break L3;
                    } else {
                      var7 = (var9.field_l[param1.field_A] & 255) << 8;
                      var8 = var10.field_l[2 + param1.field_A] << 8 & 65280;
                      var6 = var6 + (-var6 + var10.field_l[3 + param1.field_A]) * (var5 + -var7) / (var8 - var7);
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
                if (0 >= param1.field_x) {
                  break L4;
                } else {
                  if (var10.field_g == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param1.field_x;
                      var6 = var10.field_g[param1.field_p + 1];
                      if (var10.field_g.length + -2 > param1.field_p) {
                        var7 = var9.field_g[param1.field_p] << 8 & 65280;
                        var8 = (var10.field_g[param1.field_p - -2] & 255) << 8;
                        var6 = var6 + (-var6 + var10.field_g[param1.field_p - -3]) * (-var7 + var5) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 6;
                    break L4;
                  }
                }
              }
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
            stackOut_20_1 = new StringBuilder().append("ih.CA(").append(-110).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= -13) {
          L0: {
            if (0 <= param1) {
              ((ih) this).field_w[param1] = param0;
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if (16 <= var4) {
                  break L0;
                } else {
                  ((ih) this).field_w[var4] = param0;
                  var4++;
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

    final void a(boolean param0, mi param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              if (param2 == 16) {
                break L1;
              } else {
                this.a(-101, 56, -32, -116);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param1.field_q.field_o.length;
                if (!param0) {
                  break L3;
                } else {
                  if (!param1.field_q.field_l) {
                    break L3;
                  } else {
                    var6 = -param1.field_q.field_m + var4_int + var4_int;
                    var5 = (int)((long)((ih) this).field_W[param1.field_m] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var4_int <= var5) {
                      param1.field_K.a(true);
                      var5 = -var5 + var4_int + (var4_int + -1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)((ih) this).field_W[param1.field_m] * (long)var4_int >> 6);
              break L2;
            }
            param1.field_K.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ih.TA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
    }

    final synchronized hn b() {
        return null;
    }

    synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.a(param2, -128);
        if (param1 > -78) {
            return;
        }
        try {
            ((ih) this).field_q.a(param3.field_k);
            ((ih) this).field_z = 0L;
            ((ih) this).field_Z = param0 ? true : false;
            var5_int = ((ih) this).field_q.d();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((ih) this).field_q.d(var6);
                ((ih) this).field_q.f(var6);
                ((ih) this).field_q.a(var6);
            }
            ((ih) this).field_K = ((ih) this).field_q.e();
            ((ih) this).field_t = ((ih) this).field_q.field_i[((ih) this).field_K];
            ((ih) this).field_Y = ((ih) this).field_q.b(((ih) this).field_t);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ih.EA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void f(int param0, int param1) {
        if (param0 >= -49) {
            return;
        }
        ((ih) this).field_v = param1;
    }

    private final void a(int param0, int param1, boolean param2) {
        ((ih) this).field_P[param1] = param0;
        ((ih) this).field_D[param1] = rn.a(-128, param0);
        this.a(param1, (byte) 114, param0);
        if (!param2) {
            ((ih) this).field_z = -32L;
        }
    }

    final synchronized boolean a(p param0, kl param1, int param2, um param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        vc var8 = null;
        int var9 = 0;
        int var11 = 0;
        io var12 = null;
        io var13 = null;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if (param2 > 0) {
                var7 = (Object) (Object) new int[]{param2};
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == 86) {
              var8 = (vc) (Object) param3.field_l.b(1);
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int == 0) {
                      break L3;
                    } else {
                      param3.a();
                      break L3;
                    }
                  }
                  stackOut_19_0 = var6_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  L4: {
                    var9 = (int)var8.field_i;
                    var12 = (io) (Object) ((ih) this).field_T.a(-27, (long)var9);
                    if (var12 == null) {
                      int discarded$1 = 1;
                      var13 = wl.a(param1, var9);
                      if (var13 != null) {
                        ((ih) this).field_T.a((tc) (Object) var13, (long)var9, 24);
                        if (var13.a(param4 + 10922, var8.field_n, (int[]) var7, param0)) {
                          break L4;
                        } else {
                          var6_int = 0;
                          break L4;
                        }
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      if (var12.a(param4 + 10922, var8.field_n, (int[]) var7, param0)) {
                        break L4;
                      } else {
                        var6_int = 0;
                        var8 = (vc) (Object) param3.field_l.b((byte) 115);
                        continue L2;
                      }
                    }
                  }
                  var8 = (vc) (Object) param3.field_l.b((byte) 115);
                  continue L2;
                }
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ih.SA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param2).append(44);
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
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param4 + 41);
        }
        return stackIn_20_0 != 0;
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!(param2 == ((ih) this).field_O[param0])) {
            ((ih) this).field_O[param0] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((ih) this).field_I[param0][var4] = null;
            }
        }
        if (param1 < 111) {
            field_E = null;
        }
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
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((ih) this).field_q.g()) {
                  break L2;
                } else {
                  var4_int = ((ih) this).field_U * ((ih) this).field_q.field_c / rc.field_d;
                  L3: while (true) {
                    var5 = ((ih) this).field_z - -((long)param2 * (long)var4_int);
                    if (0L > -var5 + ((ih) this).field_Y) {
                      var7 = (int)(((long)var4_int + (((ih) this).field_Y - (((ih) this).field_z + 1L))) / (long)var4_int);
                      ((ih) this).field_z = ((ih) this).field_z + (long)var4_int * (long)var7;
                      ((ih) this).field_Q.b(param0, param1, var7);
                      this.a((byte) 36);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      if (((ih) this).field_q.g()) {
                        continue L3;
                      } else {
                        ((ih) this).field_Q.b(param0, param1, param2);
                        break L1;
                      }
                    } else {
                      ((ih) this).field_z = var5;
                      break L2;
                    }
                  }
                }
              }
              ((ih) this).field_Q.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ih.E(");
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
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean c(byte param0, mi param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
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
              if (param0 <= -76) {
                break L1;
              } else {
                ((ih) this).field_C = null;
                break L1;
              }
            }
            if (param1.field_K != null) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              L2: {
                if (param1.field_x < 0) {
                  break L2;
                } else {
                  param1.d(56);
                  if (param1.field_F <= 0) {
                    break L2;
                  } else {
                    if (((ih) this).field_I[param1.field_m][param1.field_F] == param1) {
                      ((ih) this).field_I[param1.field_m][param1.field_F] = null;
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ih.DA(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final synchronized void h(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        io var5 = (io) (Object) ((ih) this).field_T.b(1);
        int var3 = -125 % ((-68 - param0) / 49);
        while (var5 != null) {
            var5.a(126);
            var5 = (io) (Object) ((ih) this).field_T.b((byte) 55);
        }
    }

    private final void b(boolean param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 == (2 & ((ih) this).field_o[param1])) {
            break L0;
          } else {
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 89);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_m != param1) {
                    break L2;
                  } else {
                    if (null == ((ih) this).field_M[param1][var3.field_D]) {
                      if (0 <= var3.field_x) {
                        break L2;
                      } else {
                        var3.field_x = 0;
                        break L2;
                      }
                    } else {
                      var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
                      continue L1;
                    }
                  }
                }
                var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
                continue L1;
              }
            }
          }
        }
    }

    public static void f() {
        field_G = null;
        field_H = null;
        field_X = null;
        field_p = null;
        field_E = null;
        field_R = null;
    }

    final int i(int param0) {
        if (param0 != 4096) {
            ((ih) this).field_W = null;
        }
        return ((ih) this).field_v;
    }

    final static String e(int param0) {
        int var3 = 0;
        at var4 = null;
        jd var5 = null;
        int var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ic var1 = rd.field_j;
        if (!(var1 != null)) {
            return "No game in progress.";
        }
        at[] var2 = var1.field_xb.field_t;
        if (param0 <= 10) {
            return null;
        }
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            var5 = (jd) (Object) var4.e((byte) 99);
            while (var5 != null) {
                var5.field_u = false;
                var5 = (jd) (Object) var4.a((byte) 123);
            }
        }
        return "Did that work?";
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        mi var6 = null;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        mi var8 = ((ih) this).field_M[param3][param1];
        if (var8 == null) {
            return;
        }
        ((ih) this).field_M[param3][param1] = null;
        if (param2 != -44) {
            String discarded$0 = ih.e(-77);
        }
        if ((((ih) this).field_o[param3] & 2) == 0) {
            var8.field_x = 0;
        } else {
            var6 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 87);
            while (var6 != null) {
                if (var6.field_m == var8.field_m) {
                    if (var6.field_x < 0) {
                        if (var8 != var6) {
                            var8.field_x = 0;
                            break;
                        }
                    }
                }
                var6 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            }
        }
    }

    final synchronized void j(int param0) {
        this.a(true, -128);
        if (param0 != 7) {
            ((ih) this).field_I = null;
        }
    }

    private final int a(int param0, mi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        fq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_t + (param1.field_n * param1.field_J >> 12);
              var3_int = var3_int + (((ih) this).field_x[param1.field_m] * (-8192 + ((ih) this).field_r[param1.field_m]) >> 12);
              var4 = param1.field_v;
              if (var4.field_b <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_j > 0) {
                    break L2;
                  } else {
                    if (((ih) this).field_u[param1.field_m] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_j << 2;
                  var6 = var4.field_e << 1;
                  if (var6 <= param1.field_I) {
                    break L3;
                  } else {
                    var5 = param1.field_I * var5 / var6;
                    break L3;
                  }
                }
                var5 = var5 + (((ih) this).field_u[param1.field_m] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_y & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(param1.field_q.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)rc.field_d);
              if (1 > var5) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = var5;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ih.BA(").append(1370206316).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized hn a() {
        return (hn) (Object) ((ih) this).field_Q;
    }

    final boolean a(int param0, int param1, mi param2, byte param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        fq var7 = null;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.field_w = rc.field_d / 100;
              if (0 > param2.field_x) {
                break L1;
              } else {
                L2: {
                  if (param2.field_K == null) {
                    break L2;
                  } else {
                    if (param2.field_K.i()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param2.e(13301);
                  param2.d(-119);
                  if (param2.field_F <= 0) {
                    break L3;
                  } else {
                    if (param2 != ((ih) this).field_I[param2.field_m][param2.field_F]) {
                      break L3;
                    } else {
                      ((ih) this).field_I[param2.field_m][param2.field_F] = null;
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
              var6_int = param2.field_n;
              if (0 >= var6_int) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((ih) this).field_F[param2.field_m] * 0.0004921259842519685));
                  if (0 > var6_int) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param2.field_n = var6_int;
                break L4;
              }
            }
            L6: {
              param2.field_K.e(this.a(1370206316, param2));
              var7 = param2.field_v;
              param2.field_y = param2.field_y + var7.field_b;
              param2.field_I = param2.field_I + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param2.field_J * param2.field_n >> 12) + (-60 + param2.field_D << 8));
              if (0 < var7.field_d) {
                L7: {
                  if (var7.field_i > 0) {
                    param2.field_o = param2.field_o + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
                    break L7;
                  } else {
                    param2.field_o = param2.field_o + 128;
                    break L7;
                  }
                }
                if (var7.field_d * param2.field_o > -819201) {
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
              if (var7.field_l != null) {
                L9: {
                  if (-1 >= var7.field_m) {
                    param2.field_s = param2.field_s + 128;
                    break L9;
                  } else {
                    param2.field_s = param2.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_m) * 128.0);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param2.field_A >= var7.field_l.length - 2) {
                      break L11;
                    } else {
                      if ((255 & var7.field_l[param2.field_A - -2]) << 8 >= param2.field_s) {
                        break L11;
                      } else {
                        param2.field_A = param2.field_A + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param2.field_A != var7.field_l.length + -2) {
                    break L8;
                  } else {
                    if (var7.field_l[1 + param2.field_A] != 0) {
                      break L8;
                    } else {
                      var8 = 1;
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (param3 > 34) {
                break L12;
              } else {
                this.b(-100, -5, -59);
                break L12;
              }
            }
            L13: {
              if (param2.field_x < 0) {
                break L13;
              } else {
                if (var7.field_g == null) {
                  break L13;
                } else {
                  if (0 != (1 & ((ih) this).field_o[param2.field_m])) {
                    break L13;
                  } else {
                    L14: {
                      if (param2.field_F < 0) {
                        break L14;
                      } else {
                        if (param2 != ((ih) this).field_I[param2.field_m][param2.field_F]) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (var7.field_c <= 0) {
                        param2.field_x = param2.field_x + 128;
                        break L15;
                      } else {
                        param2.field_x = param2.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                        break L15;
                      }
                    }
                    L16: while (true) {
                      L17: {
                        if (param2.field_p >= var7.field_g.length - 2) {
                          break L17;
                        } else {
                          if ((255 & var7.field_g[2 + param2.field_p]) << 8 >= param2.field_x) {
                            break L17;
                          } else {
                            param2.field_p = param2.field_p + 2;
                            continue L16;
                          }
                        }
                      }
                      if (-2 + var7.field_g.length == param2.field_p) {
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
            if (var8 == 0) {
              param2.field_K.a(param2.field_w, this.a((byte) -110, param2), this.b((byte) 112, param2));
              stackOut_63_0 = 0;
              stackIn_64_0 = stackOut_63_0;
              break L0;
            } else {
              L18: {
                param2.field_K.h(param2.field_w);
                if (param4 == null) {
                  param2.field_K.a(param0);
                  break L18;
                } else {
                  param2.field_K.b(param4, param1, param0);
                  break L18;
                }
              }
              L19: {
                if (!param2.field_K.e()) {
                  break L19;
                } else {
                  ((ih) this).field_Q.field_s.a((hn) (Object) param2.field_K);
                  break L19;
                }
              }
              L20: {
                param2.e(13301);
                if (param2.field_x >= 0) {
                  param2.d(93);
                  if (0 >= param2.field_F) {
                    break L20;
                  } else {
                    if (((ih) this).field_I[param2.field_m][param2.field_F] != param2) {
                      break L20;
                    } else {
                      ((ih) this).field_I[param2.field_m][param2.field_F] = null;
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              return stackIn_62_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var6;
            stackOut_65_1 = new StringBuilder().append("ih.D(").append(param0).append(44).append(param1).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L21;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L21;
            }
          }
          L22: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44).append(param3).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L22;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L22;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 41);
        }
        return stackIn_64_0 != 0;
    }

    private final void b(int param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 105);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (var3.field_m == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3.field_x < 0) {
                ((ih) this).field_M[var3.field_m][var3.field_D] = null;
                var3.field_x = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            continue L0;
          }
        }
    }

    private final void e(int param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 121);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param1 < 0) {
                  break L2;
                } else {
                  if (param1 != var3.field_m) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == var3.field_K) {
                  break L3;
                } else {
                  L4: {
                    var3.field_K.h(rc.field_d / 100);
                    if (!var3.field_K.e()) {
                      break L4;
                    } else {
                      ((ih) this).field_Q.field_s.a((hn) (Object) var3.field_K);
                      break L4;
                    }
                  }
                  var3.e(13301);
                  break L3;
                }
              }
              L5: {
                if (var3.field_x >= 0) {
                  break L5;
                } else {
                  ((ih) this).field_M[var3.field_m][var3.field_D] = null;
                  break L5;
                }
              }
              var3.d(-118);
              break L1;
            }
            var3 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            continue L0;
          }
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 != -1) {
            this.a(true, false);
        }
        this.a(param1, param2, true);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != 2) {
            ((ih) this).f(-56, 47);
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((ih) this).field_r[param0] = param1;
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 >= 0) {
          L0: {
            ((ih) this).field_N[param1] = 12800;
            ((ih) this).field_V[param1] = 8192;
            ((ih) this).field_A[param1] = 16383;
            ((ih) this).field_r[param1] = 8192;
            ((ih) this).field_u[param1] = 0;
            ((ih) this).field_F[param1] = 8192;
            this.b(false, param1);
            if (param0 > 31) {
              break L0;
            } else {
              this.a(-1, (byte) -1, 112, 0);
              break L0;
            }
          }
          this.a(param1, (byte) 83);
          ((ih) this).field_o[param1] = 0;
          ((ih) this).field_J[param1] = 32767;
          ((ih) this).field_x[param1] = 256;
          ((ih) this).field_W[param1] = 0;
          this.d(10287, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if (param1 >= 16) {
              return;
            } else {
              this.d(59, param1);
              param1++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 240 & param1;
        if (var3 != 128) {
          L0: {
            if (var3 != 144) {
              if (var3 != 160) {
                if (var3 != 176) {
                  if (var3 == 192) {
                    var4 = param1 & 15;
                    var5 = param1 >> 8 & 127;
                    this.a(var4, (byte) 112, var5 + ((ih) this).field_D[var4]);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = param1 & 15;
                      var5 = 127 & param1 >> 8;
                      this.b(var5, 2, var4);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param1;
                        var5 = (param1 >> 8 & 127) + (param1 >> 9 & 16256);
                        this.c(var4, var5, 124);
                        return;
                      } else {
                        var3 = 255 & param1;
                        if (var3 != 255) {
                          return;
                        } else {
                          this.a(true, true);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L1: {
                    var4 = 15 & param1;
                    var5 = (param1 & 32599) >> 8;
                    var6 = 127 & param1 >> 16;
                    if (0 == var5) {
                      ((ih) this).field_D[var4] = rn.a(-2080769, ((ih) this).field_D[var4]) + (var6 << 14);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 == 32) {
                      ((ih) this).field_D[var4] = (var6 << 7) + rn.a(((ih) this).field_D[var4], -16257);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 == 1) {
                      ((ih) this).field_u[var4] = rn.a(((ih) this).field_u[var4], -16257) - -(var6 << 7);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == 33) {
                      ((ih) this).field_u[var4] = rn.a(((ih) this).field_u[var4], -128) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (5 != var5) {
                      break L5;
                    } else {
                      ((ih) this).field_F[var4] = rn.a(-16257, ((ih) this).field_F[var4]) + (var6 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (37 != var5) {
                      break L6;
                    } else {
                      ((ih) this).field_F[var4] = var6 + rn.a(((ih) this).field_F[var4], -128);
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var5) {
                      ((ih) this).field_N[var4] = (var6 << 7) + rn.a(-16257, ((ih) this).field_N[var4]);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 39) {
                      break L8;
                    } else {
                      ((ih) this).field_N[var4] = var6 + rn.a(-128, ((ih) this).field_N[var4]);
                      break L8;
                    }
                  }
                  L9: {
                    if (10 == var5) {
                      ((ih) this).field_V[var4] = rn.a(-16257, ((ih) this).field_V[var4]) - -(var6 << 7);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 42) {
                      break L10;
                    } else {
                      ((ih) this).field_V[var4] = var6 + rn.a(((ih) this).field_V[var4], -128);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 == 11) {
                      ((ih) this).field_A[var4] = rn.a(((ih) this).field_A[var4], -16257) - -(var6 << 7);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 != 43) {
                      break L12;
                    } else {
                      ((ih) this).field_A[var4] = rn.a(-128, ((ih) this).field_A[var4]) - -var6;
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if (var6 >= 64) {
                        ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 1);
                        break L13;
                      } else {
                        ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 == 65) {
                      if (var6 < 64) {
                        this.b(false, var4);
                        ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -3);
                        break L14;
                      } else {
                        ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 2);
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
                      ((ih) this).field_J[var4] = rn.a(127, ((ih) this).field_J[var4]) - -(var6 << 7);
                      break L15;
                    }
                  }
                  L16: {
                    if (var5 == 98) {
                      ((ih) this).field_J[var4] = rn.a(16256, ((ih) this).field_J[var4]) - -var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      ((ih) this).field_J[var4] = 16384 - (-rn.a(127, ((ih) this).field_J[var4]) - (var6 << 7));
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 100) {
                      ((ih) this).field_J[var4] = var6 + (rn.a(((ih) this).field_J[var4], 16256) + 16384);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.e(-23024, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.d(107, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.b(var4, 0);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = ((ih) this).field_J[var4];
                      if (16384 != var7) {
                        break L22;
                      } else {
                        ((ih) this).field_x[var4] = rn.a(-16257, ((ih) this).field_x[var4]) - -(var6 << 7);
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (38 == var5) {
                      var7 = ((ih) this).field_J[var4];
                      if (var7 != 16384) {
                        break L23;
                      } else {
                        ((ih) this).field_x[var4] = var6 + rn.a(-128, ((ih) this).field_x[var4]);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 != var5) {
                      break L24;
                    } else {
                      ((ih) this).field_W[var4] = rn.a(-16257, ((ih) this).field_W[var4]) + (var6 << 7);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((ih) this).field_W[var4] = var6 + rn.a(((ih) this).field_W[var4], -128);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 81) {
                      break L26;
                    } else {
                      if (var6 < 64) {
                        this.a(var4, (byte) -66);
                        ((ih) this).field_o[var4] = rn.a(((ih) this).field_o[var4], -5);
                        break L26;
                      } else {
                        ((ih) this).field_o[var4] = oe.c(((ih) this).field_o[var4], 4);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 != 17) {
                      break L27;
                    } else {
                      this.d(10287, var4, (-16257 & ((ih) this).field_C[var4]) + (var6 << 7));
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.d(10287, var4, var6 + (((ih) this).field_C[var4] & -128));
                    return;
                  }
                }
              } else {
                var4 = 15 & param1;
                var5 = param1 >> 8 & 127;
                var6 = (param1 & 8346101) >> 16;
                this.a(var4, (byte) 79, var5, var6);
                return;
              }
            } else {
              var4 = 15 & param1;
              var5 = param1 >> 8 & 127;
              var6 = param1 >> 16 & 127;
              if (0 < var6) {
                this.b(64, var5, var6, var4);
                return;
              } else {
                this.a(64, var5, -44, var4);
                break L0;
              }
            }
          }
          return;
        } else {
          var4 = param1 & 15;
          var5 = (32625 & param1) >> 8;
          var6 = (8335388 & param1) >> 16;
          this.a(var6, var5, -44, var4);
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
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!((ih) this).field_q.g()) {
              break L1;
            } else {
              var2 = ((ih) this).field_q.field_c * ((ih) this).field_U / rc.field_d;
              L2: while (true) {
                var3 = ((ih) this).field_z + (long)param0 * (long)var2;
                if (-var3 + ((ih) this).field_Y < 0L) {
                  var5 = (int)((-1L + ((long)var2 + -((ih) this).field_z) + ((ih) this).field_Y) / (long)var2);
                  ((ih) this).field_z = ((ih) this).field_z + (long)var2 * (long)var5;
                  ((ih) this).field_Q.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 36);
                  if (((ih) this).field_q.g()) {
                    continue L2;
                  } else {
                    ((ih) this).field_Q.a(param0);
                    break L0;
                  }
                } else {
                  ((ih) this).field_z = var3;
                  break L1;
                }
              }
            }
          }
          ((ih) this).field_Q.a(param0);
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        mi var5 = null;
        sn var6 = null;
        int var6_int = 0;
        mi var7 = null;
        mi var8 = null;
        int var9 = 0;
        io var10 = null;
        io var11 = null;
        io var12 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.a(64, param1, -44, param3);
          if ((2 & ((ih) this).field_o[param3]) == 0) {
            break L0;
          } else {
            var5 = (mi) (Object) ((ih) this).field_Q.field_p.d((byte) -83);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_m != param3) {
                    break L2;
                  } else {
                    if (var5.field_x >= 0) {
                      break L2;
                    } else {
                      ((ih) this).field_M[param3][var5.field_D] = null;
                      ((ih) this).field_M[param3][param1] = var5;
                      var6_int = var5.field_t - -(var5.field_J * var5.field_n >> 12);
                      var5.field_t = var5.field_t + (param1 - var5.field_D << 8);
                      var5.field_J = -var5.field_t + var6_int;
                      var5.field_D = param1;
                      var5.field_n = 4096;
                      return;
                    }
                  }
                }
                var5 = (mi) (Object) ((ih) this).field_Q.field_p.b((byte) 60);
                continue L1;
              }
            }
          }
        }
        var10 = (io) (Object) ((ih) this).field_T.a(-22, (long)((ih) this).field_O[param3]);
        var11 = var10;
        var12 = var11;
        if (var11 != null) {
          var6 = var10.field_y[param1];
          if (var6 != null) {
            L3: {
              var7 = new mi();
              var7.field_q = var6;
              var7.field_H = var11;
              var7.field_m = param3;
              var7.field_v = var10.field_v[param1];
              var7.field_F = var10.field_k[param1];
              var7.field_D = param1;
              var7.field_u = 1024 + param2 * param2 * (var10.field_s * var10.field_l[param1]) >> 11;
              var7.field_E = 255 & var10.field_x[param1];
              var7.field_t = (param1 << 8) - (32767 & var10.field_r[param1]);
              var7.field_o = 0;
              var7.field_p = 0;
              var7.field_x = -1;
              var7.field_A = 0;
              var7.field_s = 0;
              if (((ih) this).field_W[param3] != 0) {
                L4: {
                  var7.field_K = aa.b(var6, this.a(1370206316, var7), 0, this.b((byte) -119, var7));
                  stackOut_13_0 = this;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (0 <= var12.field_r[param1]) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L4;
                  }
                }
                ((ih) this).a(stackIn_16_1 != 0, var7, 16);
                break L3;
              } else {
                var7.field_K = aa.b(var6, this.a(1370206316, var7), this.a((byte) -110, var7), this.b((byte) -117, var7));
                break L3;
              }
            }
            L5: {
              if (0 > var12.field_r[param1]) {
                var7.field_K.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_F >= 0) {
                L7: {
                  var8 = ((ih) this).field_I[param3][var7.field_F];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_x >= 0) {
                      break L7;
                    } else {
                      ((ih) this).field_M[param3][var8.field_D] = null;
                      var8.field_x = 0;
                      break L7;
                    }
                  }
                }
                ((ih) this).field_I[param3][var7.field_F] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            ((ih) this).field_Q.field_p.a((byte) -119, (tc) (Object) var7);
            ((ih) this).field_M[param3][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0, boolean param1, um param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((ih) this).a(param1, (byte) -113, true, param2);
              if (param0 == 2) {
                break L1;
              } else {
                ((ih) this).a(-44);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ih.S(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((ih) this).field_q.f();
        ((ih) this).field_B = null;
        this.a(true, param0);
    }

    final synchronized boolean g(int param0) {
        if (param0 != 11899) {
            ((ih) this).field_C = null;
        }
        return ((ih) this).field_q.g();
    }

    private final void a(int param0, byte param1) {
        mi var4 = null;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = -88 / ((param1 - 1) / 57);
        if ((4 & ((ih) this).field_o[param0]) != 0) {
            var4 = (mi) (Object) ((ih) this).field_Q.field_p.e((byte) 107);
            while (var4 != null) {
                if (!(var4.field_m != param0)) {
                    var4.field_B = 0;
                }
                var4 = (mi) (Object) ((ih) this).field_Q.field_p.a((byte) 123);
            }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wk var8 = null;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param2 = param2 << 8 | param2;
            var4_int = param2 ^ param2 >> 1;
            var7 = 0;
            L1: while (true) {
              if (var7 >= 4) {
                break L0;
              } else {
                var6 = -64 + (param3 + (bm.field_y[var7][1] - -(param2 & 3)));
                var5 = (var4_int & 7) + (bm.field_y[var7][0] + param1) - 44;
                var8 = tn.field_eb[param2 % 6];
                fe.a(var8, var5, var6);
                var4_int = var4_int >> 1;
                param2 = param2 >> 1;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var4, "ih.M(" + -124 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void d(int param0, int param1, int param2) {
        ((ih) this).field_C[param1] = param2;
        ((ih) this).field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
    }

    private final int b(byte param0, mi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            var3_int = ((ih) this).field_V[param1.field_m];
            var4 = 78 / ((param0 - 63) / 40);
            if (var3_int >= 8192) {
              stackOut_3_0 = 16384 - ((-var3_int + 16384) * (128 - param1.field_E) - -32 >> 6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 32 + var3_int * param1.field_E >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ih.P(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 33) {
            this.a(-79, 59, false);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (!param1) {
            this.b(-1, 0);
        } else {
            this.e(-23024, -1);
        }
        this.d(89, -1);
        for (var3 = 0; var3 < 16; var3++) {
            ((ih) this).field_O[var3] = ((ih) this).field_P[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((ih) this).field_D[var5] = rn.a(((ih) this).field_P[var5], -128);
            var5++;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 >= -13) {
            ((ih) this).field_C = null;
        }
        ((ih) this).field_U = param0;
    }

    protected ih() {
        ((ih) this).field_F = new int[16];
        ((ih) this).field_u = new int[16];
        ((ih) this).field_P = new int[16];
        ((ih) this).field_M = new mi[16][128];
        ((ih) this).field_C = new int[16];
        ((ih) this).field_o = new int[16];
        ((ih) this).field_x = new int[16];
        ((ih) this).field_U = 1000000;
        ((ih) this).field_A = new int[16];
        ((ih) this).field_v = 256;
        ((ih) this).field_W = new int[16];
        ((ih) this).field_O = new int[16];
        ((ih) this).field_N = new int[16];
        ((ih) this).field_I = new mi[16][128];
        ((ih) this).field_s = new int[16];
        ((ih) this).field_r = new int[16];
        ((ih) this).field_w = new int[16];
        ((ih) this).field_D = new int[16];
        ((ih) this).field_V = new int[16];
        ((ih) this).field_J = new int[16];
        ((ih) this).field_q = new dw();
        ((ih) this).field_Q = new os((ih) this);
        ((ih) this).field_T = new bg(128);
        ((ih) this).a(256, -1, (byte) -116);
        this.a(true, true);
    }

    ih(ih param0) {
        ((ih) this).field_F = new int[16];
        ((ih) this).field_u = new int[16];
        ((ih) this).field_P = new int[16];
        ((ih) this).field_M = new mi[16][128];
        ((ih) this).field_C = new int[16];
        ((ih) this).field_o = new int[16];
        ((ih) this).field_x = new int[16];
        ((ih) this).field_U = 1000000;
        ((ih) this).field_A = new int[16];
        ((ih) this).field_v = 256;
        ((ih) this).field_W = new int[16];
        ((ih) this).field_O = new int[16];
        ((ih) this).field_N = new int[16];
        ((ih) this).field_I = new mi[16][128];
        ((ih) this).field_s = new int[16];
        ((ih) this).field_r = new int[16];
        ((ih) this).field_w = new int[16];
        ((ih) this).field_D = new int[16];
        ((ih) this).field_V = new int[16];
        ((ih) this).field_J = new int[16];
        ((ih) this).field_q = new dw();
        ((ih) this).field_Q = new os((ih) this);
        try {
            ((ih) this).field_T = param0.field_T;
            ((ih) this).a(256, -1, (byte) -70);
            this.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ih.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_E = new int[4096];
        field_p = null;
        field_G = new byte[4096];
        for (var0 = 0; var0 < 4096; var0++) {
            field_E[var0] = 1;
            field_G[var0] = (byte) -128;
        }
        field_X = "Offensive account name";
        field_R = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
