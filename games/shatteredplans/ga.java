/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ga extends tn {
    private int[] field_p;
    private int field_H;
    static String field_L;
    private int[] field_y;
    static byte[] field_w;
    private int[] field_q;
    int[] field_t;
    private qq[][] field_N;
    private int[] field_r;
    static String field_o;
    private qq[][] field_K;
    private int[] field_m;
    private ti field_Q;
    private int[] field_G;
    private int field_M;
    int[] field_F;
    private pi field_x;
    int[] field_u;
    private int[] field_I;
    private int[] field_P;
    private int[] field_E;
    private int[] field_s;
    private int[] field_J;
    private int[] field_A;
    private int[] field_T;
    private int field_C;
    private long field_O;
    private int field_D;
    private rc field_l;
    private long field_n;
    private boolean field_v;
    private boolean field_B;
    private int field_S;
    private gh field_z;

    final synchronized void e(int param0) {
        L0: {
          this.b(16384, true);
          if (param0 == 15) {
            break L0;
          } else {
            ((ga) this).field_r = null;
            break L0;
          }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        L0: {
          ((ga) this).field_T[param0] = param2;
          if (param1 == -34) {
            break L0;
          } else {
            ((ga) this).field_K = null;
            break L0;
          }
        }
    }

    final synchronized tn b() {
        return (tn) (Object) ((ga) this).field_l;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = -117 / ((param0 - -22) / 39);
        ((ga) this).field_E[param2] = param1;
        ((ga) this).field_u[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    final static bi a(bc param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          if (vd.a(param2, param0, param1, 2)) {
            int discarded$2 = 0;
            return gq.d();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ga.J(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L0;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L0;
            }
          }
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + -20487 + 41);
        }
    }

    private final int b(qq param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param0.field_r * param0.field_G >> 12) + param0.field_J;
              var3_int = var3_int + (((ga) this).field_r[param0.field_y] * (-8192 + ((ga) this).field_T[param0.field_y]) >> 12);
              var5 = -50 % ((param1 - -60) / 41);
              var4 = param0.field_u;
              if (var4.field_o <= 0) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_f) {
                    break L2;
                  } else {
                    if (((ga) this).field_p[param0.field_y] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var6 = var4.field_f << 2;
                  var7 = var4.field_j << 1;
                  if (~var7 >= ~param0.field_C) {
                    break L3;
                  } else {
                    var6 = param0.field_C * var6 / var7;
                    break L3;
                  }
                }
                var6 = var6 + (((ga) this).field_p[param0.field_y] >> 7);
                var8 = Math.sin((double)(param0.field_i & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var6 * var8);
                break L1;
              }
            }
            L4: {
              var6 = (int)((double)(256 * param0.field_M.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ap.field_j + 0.5);
              if (var6 < 1) {
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_14_0 = stackOut_11_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ga.BA(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
        return stackIn_14_0;
    }

    final synchronized void f(int param0) {
        int var3 = 0;
        br var4 = null;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 256) {
            break L0;
          } else {
            ((ga) this).field_r = null;
            break L0;
          }
        }
        var4 = (br) (Object) ((ga) this).field_Q.c(83);
        L1: while (true) {
          if (null == var4) {
            return;
          } else {
            var4.e(26005);
            var4 = (br) (Object) ((ga) this).field_Q.a(false);
            continue L1;
          }
        }
    }

    private final void a(int param0, int param1) {
        qq var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (0 > param0) {
                  break L2;
                } else {
                  if (var3.field_y != param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_E < 0) {
                ((ga) this).field_N[var3.field_y][var3.field_H] = null;
                var3.field_E = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        qq var6 = null;
        int var7 = 0;
        qq var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = ((ga) this).field_N[param2][param3];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((ga) this).field_N[param2][param3] = null;
            if ((2 & ((ga) this).field_F[param2]) != 0) {
              var6 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
              L1: while (true) {
                if (null == var6) {
                  break L0;
                } else {
                  L2: {
                    if (var8.field_y != var6.field_y) {
                      break L2;
                    } else {
                      if (var6.field_E >= 0) {
                        break L2;
                      } else {
                        if (var6 != var8) {
                          var8.field_E = 0;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var6 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
                  continue L1;
                }
              }
            } else {
              var8.field_E = 0;
              break L0;
            }
          }
          return;
        }
    }

    final synchronized void c(int param0, boolean param1) {
        L0: {
          ((ga) this).field_M = param0;
          if (!param1) {
            break L0;
          } else {
            ((ga) this).field_t = null;
            break L0;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
    }

    private final void c(int param0, byte param1, int param2) {
        ((ga) this).field_m[param2] = param0;
        ((ga) this).field_P[param2] = we.a(-128, param0);
        int var4 = 0;
        this.a(param2, param0, (byte) -16);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 <= -67) {
            break L0;
          } else {
            this.b(44, (byte) 25, -26);
            break L0;
          }
        }
        L1: {
          if (param1 < 0) {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 16) {
                break L1;
              } else {
                ((ga) this).field_A[var4] = param2;
                var4++;
                continue L2;
              }
            }
          } else {
            ((ga) this).field_A[param1] = param2;
            break L1;
          }
        }
    }

    final synchronized boolean a(bc param0, gh param1, int param2, int param3, io param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        br var10 = null;
        int var11 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.a();
              if (param2 > 12) {
                break L1;
              } else {
                ((ga) this).field_s = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (0 < param3) {
                var7 = (Object) (Object) new int[]{param3};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (be) (Object) param1.field_i.c(-126);
            L3: while (true) {
              if (null == var8) {
                L4: {
                  if (var6_int != 0) {
                    param1.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_22_0 = var6_int;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = (int)var8.field_b;
                    var10 = (br) (Object) ((ga) this).field_Q.a((long)var9, -25064);
                    if (var10 == null) {
                      var10 = lo.a(param0, (byte) 125, var9);
                      if (null != var10) {
                        ((ga) this).field_Q.a((oh) (Object) var10, 87, (long)var9);
                        break L6;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (var10.a(param4, var8.field_j, (int[]) var7, 1)) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                var8 = (be) (Object) param1.field_i.a(false);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("ga.AA(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
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
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
        return stackIn_23_0 != 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (((ga) this).field_x.f()) {
            var2 = ((ga) this).field_x.field_e * ((ga) this).field_M / ap.field_j;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + ((ga) this).field_O;
              if (0L <= ((ga) this).field_n - var3) {
                ((ga) this).field_O = var3;
                ((ga) this).field_l.a(param0);
                break L0;
              } else {
                var5 = (int)((-1L + -((ga) this).field_O + (((ga) this).field_n + (long)var2)) / (long)var2);
                ((ga) this).field_O = ((ga) this).field_O + (long)var5 * (long)var2;
                ((ga) this).field_l.a(var5);
                param0 = param0 - var5;
                this.a((byte) 42);
                if (!((ga) this).field_x.f()) {
                  ((ga) this).field_l.a(param0);
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          } else {
            ((ga) this).field_l.a(param0);
            break L0;
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        pf var8 = null;
        long var9 = 0L;
        Object var11 = null;
        Object var12 = null;
        fb var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        qr var18 = null;
        int var18_int = 0;
        qr var19 = null;
        qr var20 = null;
        qr var21 = null;
        int var22_int = 0;
        qr var22 = null;
        qr var23 = null;
        qr var24 = null;
        qr var25 = null;
        qr var26 = null;
        qr var27 = null;
        qr var28 = null;
        qr var29 = null;
        qr var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        qr var43 = null;
        qr var44 = null;
        qr var45 = null;
        qr var46 = null;
        qr var47 = null;
        qr var48 = null;
        qr var49 = null;
        Object var50 = null;
        bi var50_ref = null;
        Object var51 = null;
        bi var51_ref = null;
        Object var52 = null;
        bi var52_ref = null;
        Object var53 = null;
        bi var53_ref = null;
        ub stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        ub stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        ub stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        fb stackIn_9_0 = null;
        qr stackIn_9_1 = null;
        qr stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        fb stackIn_10_0 = null;
        qr stackIn_10_1 = null;
        qr stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        fb stackIn_11_0 = null;
        qr stackIn_11_1 = null;
        qr stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        qr stackIn_11_4 = null;
        fb stackIn_28_0 = null;
        qr stackIn_28_1 = null;
        qr stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        fb stackIn_29_0 = null;
        qr stackIn_29_1 = null;
        qr stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        fb stackIn_30_0 = null;
        qr stackIn_30_1 = null;
        qr stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        qr stackIn_30_4 = null;
        int stackIn_34_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_84_0 = 0;
        bi[] stackIn_85_0 = null;
        bi[] stackIn_86_0 = null;
        bi[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        bi[] stackIn_92_0 = null;
        bi[] stackIn_93_0 = null;
        bi[] stackIn_94_0 = null;
        bi[] stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        String stackIn_156_0 = null;
        String stackIn_166_0 = null;
        String stackIn_172_0 = null;
        ub stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        ub stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        fb stackOut_8_0 = null;
        qr stackOut_8_1 = null;
        qr stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        fb stackOut_10_0 = null;
        qr stackOut_10_1 = null;
        qr stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        qr stackOut_10_4 = null;
        fb stackOut_9_0 = null;
        qr stackOut_9_1 = null;
        qr stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        qr stackOut_9_4 = null;
        fb stackOut_27_0 = null;
        qr stackOut_27_1 = null;
        qr stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        fb stackOut_29_0 = null;
        qr stackOut_29_1 = null;
        qr stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        qr stackOut_29_4 = null;
        fb stackOut_28_0 = null;
        qr stackOut_28_1 = null;
        qr stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        qr stackOut_28_4 = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        bi[] stackOut_84_0 = null;
        bi[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        bi[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        bi[] stackOut_91_0 = null;
        bi[] stackOut_92_0 = null;
        bi[] stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        bi[] stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        String stackOut_155_0 = null;
        String stackOut_154_0 = null;
        String stackOut_165_0 = null;
        String stackOut_164_0 = null;
        String stackOut_162_0 = null;
        String stackOut_171_0 = null;
        String stackOut_170_0 = null;
        L0: {
          var12 = null;
          var50 = null;
          var51 = null;
          var52 = null;
          var53 = null;
          var41 = ShatteredPlansClient.field_F ? 1 : 0;
          stackOut_0_0 = qs.field_y;
          stackOut_0_1 = (cr.field_c * 4 + 8) * param5;
          stackOut_0_2 = (2 + cr.field_c) * 2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (hp.field_l != qs.field_y) {
            stackOut_2_0 = (ub) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (ub) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        var7_int = ((ub) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3 != 0, -109, param0, 2) ? 1 : 0;
        var8 = qs.field_y.field_xb.field_M;
        var9 = pr.a(14274);
        var11 = null;
        var12_ref = (fb) (Object) var8.d(0);
        L1: while (true) {
          if (var12_ref == null) {
            return;
          } else {
            L2: {
              var13 = 0;
              if (null == var12_ref.field_M) {
                L3: {
                  var14 = 16777215 | param3;
                  var12_ref.field_Ub = new qr(0L, oj.field_zb);
                  var12_ref.a(4, var12_ref.field_Ub);
                  var12_ref.field_Ub.field_y = 1;
                  var12_ref.field_Pb = new qr(0L, ek.field_E);
                  var12_ref.a(4, var12_ref.field_Pb);
                  var12_ref.field_Rb = new qr(0L, oj.field_zb);
                  var12_ref.a(4, var12_ref.field_Rb);
                  var12_ref.field_Rb.field_kb = 0;
                  var12_ref.field_Wb = new qr(0L, oj.field_zb);
                  var12_ref.a(4, var12_ref.field_Wb);
                  var12_ref.field_Wb.field_kb = 0;
                  var12_ref.field_Ib = new qr(0L, ek.field_E);
                  var12_ref.a(4, var12_ref.field_Ib);
                  var12_ref.field_Ib.field_y = 2;
                  stackOut_8_0 = (fb) var12_ref;
                  stackOut_8_1 = null;
                  stackOut_8_2 = null;
                  stackOut_8_3 = 0L;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  stackIn_10_3 = stackOut_8_3;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  stackIn_9_3 = stackOut_8_3;
                  if (ns.field_pb) {
                    stackOut_10_0 = (fb) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = oj.field_zb;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    break L3;
                  } else {
                    stackOut_9_0 = (fb) (Object) stackIn_9_0;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = ek.field_E;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_11_4 = stackOut_9_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_11_0.field_Mb = new qr(stackIn_11_3, stackIn_11_4);
                  var12_ref.a(4, var12_ref.field_Mb);
                  var12_ref.field_xb = new qr[em.field_k];
                  var12_ref.field_Bb = new qr(0L, (qr) null);
                  if ((1 << cp.field_q & var14) == 0) {
                    break L4;
                  } else {
                    var12_ref.field_Mb.a(4, var12_ref.field_Bb);
                    break L4;
                  }
                }
                L5: {
                  var12_ref.field_oc = new qr(0L, (qr) null);
                  if ((1 << vr.field_g & var14) != 0) {
                    var12_ref.field_Mb.a(4, var12_ref.field_oc);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12_ref.field_ac = new qr(0L, (qr) null);
                  if ((var14 & 1 << kf.field_i) == 0) {
                    break L6;
                  } else {
                    var12_ref.field_Mb.a(4, var12_ref.field_ac);
                    break L6;
                  }
                }
                L7: {
                  var12_ref.field_Kb = new qr(0L, (qr) null);
                  if (0 != (1 << v.field_e & var14)) {
                    var12_ref.field_Mb.a(4, var12_ref.field_Kb);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var45 = var12_ref.field_Bb;
                var44 = var12_ref.field_Kb;
                var12_ref.field_ac.field_G = 1;
                var43 = var12_ref.field_oc;
                var43.field_G = 1;
                var44.field_G = 1;
                var45.field_G = 1;
                var18_int = 0;
                L8: while (true) {
                  if (em.field_k <= var18_int) {
                    L9: {
                      stackOut_27_0 = (fb) var12_ref;
                      stackOut_27_1 = null;
                      stackOut_27_2 = null;
                      stackOut_27_3 = 0L;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      stackIn_29_2 = stackOut_27_2;
                      stackIn_29_3 = stackOut_27_3;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      if (ns.field_pb) {
                        stackOut_29_0 = (fb) (Object) stackIn_29_0;
                        stackOut_29_1 = null;
                        stackOut_29_2 = null;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = ek.field_E;
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        stackIn_30_3 = stackOut_29_3;
                        stackIn_30_4 = stackOut_29_4;
                        break L9;
                      } else {
                        stackOut_28_0 = (fb) (Object) stackIn_28_0;
                        stackOut_28_1 = null;
                        stackOut_28_2 = null;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = oj.field_zb;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        stackIn_30_3 = stackOut_28_3;
                        stackIn_30_4 = stackOut_28_4;
                        break L9;
                      }
                    }
                    stackIn_30_0.field_Ob = new qr(stackIn_30_3, stackIn_30_4);
                    var12_ref.a(4, var12_ref.field_Ob);
                    var12_ref.field_Ob.field_y = 2;
                    var12_ref.field_Tb = new qr(0L, ek.field_E);
                    var12_ref.a(4, var12_ref.field_Tb);
                    var12_ref.field_Sb = new qr(0L, gn.field_w);
                    var12_ref.a(4, var12_ref.field_Sb);
                    var12_ref.field_Hb = new qr(0L, gn.field_w);
                    var12_ref.a(4, var12_ref.field_Hb);
                    var12_ref.field_ic = new qr(0L, ii.field_u);
                    var12_ref.a(4, var12_ref.field_ic);
                    var12_ref.e((byte) -126);
                    var12_ref.field_Db = new qr(0L, kq.field_h);
                    var13 = 1;
                    var12_ref.a(4, var12_ref.field_Db);
                    break L2;
                  } else {
                    L10: {
                      var12_ref.field_xb[var18_int] = new qr(0L, (qr) null);
                      if (0 != (var14 & 1 << var18_int + ml.field_j)) {
                        var12_ref.field_Mb.a(4, var12_ref.field_xb[var18_int]);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var12_ref.field_xb[var18_int].field_G = 1;
                    var18_int++;
                    continue L8;
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              if (!var12_ref.field_Ab) {
                stackOut_33_0 = 16777215;
                stackIn_34_0 = stackOut_33_0;
                break L11;
              } else {
                stackOut_32_0 = param3;
                stackIn_34_0 = stackOut_32_0;
                break L11;
              }
            }
            var14 = stackIn_34_0;
            var12_ref.field_Ub.field_z = null;
            var12_ref.field_Ub.field_mb = 0;
            var46 = var12_ref.field_Ub;
            var46.field_K = 0;
            var12_ref.field_Db.field_z = null;
            var12_ref.field_Db.field_mb = 0;
            var47 = var12_ref.field_Db;
            var47.field_K = 0;
            var12_ref.field_Pb.field_z = null;
            var48 = var12_ref.field_Pb;
            var12_ref.field_Pb.field_mb = 0;
            var12_ref.field_Rb.field_z = null;
            var48.field_K = 0;
            var12_ref.field_Rb.field_mb = 0;
            var18 = var12_ref.field_Rb;
            var18.field_K = 0;
            var12_ref.field_Wb.field_z = null;
            var12_ref.field_Wb.field_mb = 0;
            var19 = var12_ref.field_Wb;
            var19.field_K = 0;
            var12_ref.field_Ib.field_z = null;
            var20 = var12_ref.field_Ib;
            var12_ref.field_Ib.field_mb = 0;
            var20.field_K = 0;
            var12_ref.field_Mb.field_z = null;
            var21 = var12_ref.field_Mb;
            var12_ref.field_Mb.field_mb = 0;
            var21.field_K = 0;
            var22_int = 0;
            L12: while (true) {
              if (em.field_k <= var22_int) {
                L13: {
                  var12_ref.field_Bb.field_pb = null;
                  var12_ref.field_Bb.field_mb = 0;
                  var22 = var12_ref.field_Bb;
                  var12_ref.field_Kb.field_pb = null;
                  var22.field_K = 0;
                  var12_ref.field_Kb.field_mb = 0;
                  var49 = var12_ref.field_Kb;
                  var12_ref.field_oc.field_pb = null;
                  var49.field_K = 0;
                  var24 = var12_ref.field_oc;
                  var12_ref.field_oc.field_mb = 0;
                  var12_ref.field_ac.field_pb = null;
                  var24.field_K = 0;
                  var25 = var12_ref.field_ac;
                  var12_ref.field_ac.field_mb = 0;
                  var25.field_K = 0;
                  var12_ref.field_Ob.field_z = null;
                  var26 = var12_ref.field_Ob;
                  var12_ref.field_Ob.field_mb = 0;
                  var12_ref.field_Tb.field_z = null;
                  var26.field_K = 0;
                  var12_ref.field_Tb.field_mb = 0;
                  var27 = var12_ref.field_Tb;
                  var12_ref.field_Sb.field_z = null;
                  var27.field_K = 0;
                  var12_ref.field_Sb.field_mb = 0;
                  var28 = var12_ref.field_Sb;
                  var12_ref.field_Hb.field_z = null;
                  var28.field_K = 0;
                  var12_ref.field_Hb.field_mb = 0;
                  var29 = var12_ref.field_Hb;
                  var29.field_K = 0;
                  var12_ref.field_ic.field_z = null;
                  var12_ref.field_ic.field_mb = 0;
                  var30 = var12_ref.field_ic;
                  var30.field_K = 0;
                  var12_ref.field_K = qs.field_y.field_xb.field_K;
                  var31 = 0;
                  var32 = var12_ref.field_Xb;
                  if (!var12_ref.f((byte) -78)) {
                    L14: {
                      if (!var12_ref.field_Ab) {
                        L15: {
                          if (var12_ref.field_cc) {
                            break L15;
                          } else {
                            if (!var12_ref.field_Jb) {
                              if (!var12_ref.field_Qb) {
                                var12_ref.field_Ub.field_z = ng.field_b;
                                break L14;
                              } else {
                                var12_ref.field_Ub.field_z = lq.field_r;
                                break L14;
                              }
                            } else {
                              break L15;
                            }
                          }
                        }
                        var12_ref.field_Db.field_z = qn.field_a;
                        break L14;
                      } else {
                        if (var12_ref.field_lc >= 0) {
                          var12_ref.field_Ub.field_z = co.field_q;
                          break L14;
                        } else {
                          L16: {
                            if (!var12_ref.field_mc) {
                              break L16;
                            } else {
                              L17: {
                                if (var12_ref.field_cc) {
                                  break L17;
                                } else {
                                  if (var12_ref.field_Jb) {
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var12_ref.field_Db.field_z = qn.field_a;
                              break L14;
                            }
                          }
                          if (2 != var12_ref.field_Fb) {
                            var12_ref.field_Ub.field_z = tc.field_F;
                            break L14;
                          } else {
                            var12_ref.field_Db.field_z = ro.field_d;
                            break L14;
                          }
                        }
                      }
                    }
                    L18: {
                      if (var12_ref.field_Db.field_z == null) {
                        var12_ref.field_Ub.a(68, cr.field_c, (byte) 48, var31, 0);
                        break L18;
                      } else {
                        var12_ref.field_Db.a(68, cr.field_c, (byte) 72, var31, 0);
                        break L18;
                      }
                    }
                    L19: {
                      var12_ref.field_Pb.field_z = nq.a(var12_ref.field_Pb.field_nb, var32, 78);
                      var12_ref.field_Pb.a(78, cr.field_c, (byte) 85, var31, 70);
                      if (!var12_ref.field_Pb.field_L) {
                        break L19;
                      } else {
                        if (var12_ref.field_Pb.field_z.equals((Object) (Object) var32)) {
                          break L19;
                        } else {
                          dn.field_k = var32;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var12_ref.field_Rb.field_z = Integer.toString(var12_ref.field_Lb);
                      if (var12_ref.field_mc) {
                        var12_ref.field_Wb.field_z = "/" + var12_ref.field_Eb;
                        var12_ref.field_Rb.field_y = 2;
                        var33_int = (348 + -var12_ref.field_Wb.field_nb.c("/")) / 2;
                        var12_ref.field_Rb.a(var33_int + -150, cr.field_c, (byte) 83, var31, 150);
                        var12_ref.field_Wb.a(-var33_int + 198, cr.field_c, (byte) 84, var31, var33_int);
                        break L20;
                      } else {
                        var12_ref.field_Rb.field_y = 1;
                        var12_ref.field_Rb.a(48, cr.field_c, (byte) 108, var31, 150);
                        break L20;
                      }
                    }
                    L21: {
                      var12_ref.field_Ib.field_z = Integer.toString(var12_ref.field_Zb);
                      var12_ref.field_Ib.a(48, cr.field_c, (byte) 47, var31, 200);
                      if (!ns.field_pb) {
                        stackOut_75_0 = 200;
                        stackIn_76_0 = stackOut_75_0;
                        break L21;
                      } else {
                        stackOut_74_0 = 250;
                        stackIn_76_0 = stackOut_74_0;
                        break L21;
                      }
                    }
                    L22: {
                      var33_int = stackIn_76_0;
                      var12_ref.field_Mb.a(-2 + (365 + -var33_int), cr.field_c, (byte) 46, var31, var33_int);
                      var34_int = qo.field_b;
                      if ((var14 & 1 << cp.field_q) == 0) {
                        break L22;
                      } else {
                        var50_ref = uk.field_b[var12_ref.field_nc];
                        var12_ref.field_Bb.field_pb = var50_ref;
                        var12_ref.field_Bb.a(var50_ref.field_o, var12_ref.field_Mb.field_mb, (byte) 111, 0, var34_int);
                        var34_int = var34_int + (var50_ref.field_o - -qo.field_b);
                        break L22;
                      }
                    }
                    L23: {
                      if ((var14 & 1 << vr.field_g) == 0) {
                        break L23;
                      } else {
                        L24: {
                          if (!var12_ref.field_cc) {
                            if (var12_ref.field_Jb) {
                              stackOut_83_0 = 1;
                              stackIn_84_0 = stackOut_83_0;
                              break L24;
                            } else {
                              stackOut_82_0 = 0;
                              stackIn_84_0 = stackOut_82_0;
                              break L24;
                            }
                          } else {
                            stackOut_80_0 = 1;
                            stackIn_84_0 = stackOut_80_0;
                            break L24;
                          }
                        }
                        L25: {
                          var36 = stackIn_84_0;
                          stackOut_84_0 = ji.field_E;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_85_0 = stackOut_84_0;
                          if (var36 == 0) {
                            stackOut_86_0 = (bi[]) (Object) stackIn_86_0;
                            stackOut_86_1 = 0;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            break L25;
                          } else {
                            stackOut_85_0 = (bi[]) (Object) stackIn_85_0;
                            stackOut_85_1 = 1;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_87_1 = stackOut_85_1;
                            break L25;
                          }
                        }
                        var51_ref = stackIn_87_0[stackIn_87_1];
                        var12_ref.field_oc.field_pb = var51_ref;
                        var12_ref.field_oc.a(var51_ref.field_o, var12_ref.field_Mb.field_mb, (byte) 124, 0, var34_int);
                        var34_int = var34_int + (qo.field_b + var51_ref.field_o);
                        break L23;
                      }
                    }
                    L26: {
                      if (0 == (1 << kf.field_i & var14)) {
                        break L26;
                      } else {
                        var52_ref = j.field_s[-1 + var12_ref.field_Fb];
                        var12_ref.field_ac.field_pb = var52_ref;
                        var12_ref.field_ac.a(var52_ref.field_o, var12_ref.field_Mb.field_mb, (byte) 41, 0, var34_int);
                        var34_int = var34_int + (qo.field_b + var52_ref.field_o);
                        break L26;
                      }
                    }
                    L27: {
                      if ((1 << v.field_e & var14) == 0) {
                        break L27;
                      } else {
                        stackOut_91_0 = tf.field_l;
                        stackIn_92_0 = stackOut_91_0;
                        L28: {
                          stackOut_92_0 = (bi[]) (Object) stackIn_92_0;
                          stackIn_94_0 = stackOut_92_0;
                          stackIn_93_0 = stackOut_92_0;
                          if (var12_ref.field_ec) {
                            stackOut_94_0 = (bi[]) (Object) stackIn_94_0;
                            stackOut_94_1 = 1;
                            stackIn_95_0 = stackOut_94_0;
                            stackIn_95_1 = stackOut_94_1;
                            break L28;
                          } else {
                            stackOut_93_0 = (bi[]) (Object) stackIn_93_0;
                            stackOut_93_1 = 0;
                            stackIn_95_0 = stackOut_93_0;
                            stackIn_95_1 = stackOut_93_1;
                            break L28;
                          }
                        }
                        var53_ref = stackIn_95_0[stackIn_95_1];
                        var12_ref.field_Kb.field_pb = var53_ref;
                        var12_ref.field_Kb.a(var53_ref.field_o, var12_ref.field_Mb.field_mb, (byte) 127, 0, var34_int);
                        var34_int = var34_int + (qo.field_b + var53_ref.field_o);
                        break L27;
                      }
                    }
                    L29: {
                      if (null != ln.field_O) {
                        var36 = 0;
                        L30: while (true) {
                          if (var36 >= em.field_k) {
                            break L29;
                          } else {
                            L31: {
                              if (ln.field_O[var36] == null) {
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            var36++;
                            continue L30;
                          }
                        }
                      } else {
                        break L29;
                      }
                    }
                    L32: {
                      var36 = (-var34_int + var12_ref.field_Mb.field_K) / 2;
                      if (0 < var36) {
                        var12_ref.field_Bb.field_hb = var12_ref.field_Bb.field_hb + var36;
                        var12_ref.field_oc.field_hb = var12_ref.field_oc.field_hb + var36;
                        var12_ref.field_ac.field_hb = var12_ref.field_ac.field_hb + var36;
                        var12_ref.field_Kb.field_hb = var12_ref.field_Kb.field_hb + var36;
                        var37_int = 0;
                        L33: while (true) {
                          if (em.field_k <= var37_int) {
                            break L32;
                          } else {
                            var12_ref.field_xb[var37_int].field_hb = var12_ref.field_xb[var37_int].field_hb + var36;
                            var37_int++;
                            continue L33;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    L34: {
                      if (!var12_ref.field_Ab) {
                        break L34;
                      } else {
                        L35: {
                          var37_int = var12_ref.field_lc;
                          if (var37_int >= 0) {
                            break L35;
                          } else {
                            var37_int = (int)(var9 + -var12_ref.field_Gb);
                            break L35;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 < 60) {
                          var12_ref.field_Ob.field_z = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12_ref.field_Ob.field_z = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        }
                      }
                    }
                    L36: {
                      var12_ref.field_Ob.a(var12_ref.field_K - 365, cr.field_c, (byte) 57, var31, 365);
                      var31 = var31 + cr.field_c;
                      if (var12_ref.field_jc == null) {
                        break L36;
                      } else {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(hl.field_H);
                        StringBuilder discarded$5 = var37.append(var12_ref.field_jc[0]);
                        var38_int = 1;
                        L37: while (true) {
                          if (var38_int >= var12_ref.field_Lb) {
                            var38 = var37.toString();
                            var12_ref.field_Tb.field_z = var38;
                            var39 = var12_ref.field_Tb.field_nb.a(var38, var12_ref.field_K - 2 * var12_ref.field_Tb.field_kb);
                            var12_ref.field_Tb.a(var12_ref.field_K, cr.field_c * var39, (byte) 73, var31, 0);
                            var31 = var31 + var39 * cr.field_c;
                            break L36;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12_ref.field_jc[var38_int]);
                            var38_int++;
                            continue L37;
                          }
                        }
                      }
                    }
                    L38: {
                      if (!var12_ref.field_Jb) {
                        break L38;
                      } else {
                        var12_ref.field_Sb.field_z = re.a(tq.field_a, 4371, new String[1]);
                        var12_ref.field_Sb.a(var12_ref.field_K - tg.field_a * 2, cr.field_c, (byte) 80, var31, tg.field_a);
                        var31 = var31 + cr.field_c;
                        break L38;
                      }
                    }
                    if (var12_ref.field_Yb) {
                      var12_ref.field_Hb.field_z = re.a(wj.field_n, 4371, new String[1]);
                      var12_ref.field_Hb.a(-(2 * tg.field_a) + var12_ref.field_K, cr.field_c, (byte) 91, var31, tg.field_a);
                      var31 = var31 + cr.field_c;
                      break L13;
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L39: {
                  var33 = fi.a(var12_ref.field_hc, -11, var32);
                  if (var33 == null) {
                    break L39;
                  } else {
                    var34_int = var12_ref.field_ic.field_nb.a(var33, -tg.field_a + -tg.field_a + var12_ref.field_K);
                    var12_ref.field_ic.field_z = var33;
                    var12_ref.field_ic.field_I = 256 * var12_ref.field_Nb / ks.field_i;
                    var12_ref.field_ic.a(var12_ref.field_K + -(tg.field_a * 2), cr.field_c * var34_int, (byte) 112, var31, tg.field_a);
                    var31 = var31 + var34_int * cr.field_c;
                    break L39;
                  }
                }
                L40: {
                  if (var7_int == 0) {
                    var12_ref.field_gb = -var12_ref.field_mb + var31;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (var13 != 0) {
                    qs.field_y.field_xb.a(2, (qr) var11, (qr) (Object) var12_ref, (byte) 65);
                    break L41;
                  } else {
                    break L41;
                  }
                }
                var34_int = 0;
                L42: while (true) {
                  if (em.field_k <= var34_int) {
                    L43: {
                      if (var12_ref.field_Bb.field_L) {
                        L44: {
                          if (var12_ref.field_nc == 1) {
                            var34 = va.field_i;
                            break L44;
                          } else {
                            var34 = mk.field_e[var12_ref.field_nc];
                            break L44;
                          }
                        }
                        dn.field_k = vl.field_r + " - " + var34;
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    L45: {
                      if (!var12_ref.field_Kb.field_L) {
                        break L45;
                      } else {
                        L46: {
                          if (!var12_ref.field_ec) {
                            stackOut_155_0 = ek.field_G;
                            stackIn_156_0 = stackOut_155_0;
                            break L46;
                          } else {
                            stackOut_154_0 = le.field_c;
                            stackIn_156_0 = stackOut_154_0;
                            break L46;
                          }
                        }
                        dn.field_k = stackIn_156_0;
                        break L45;
                      }
                    }
                    L47: {
                      if (var12_ref.field_oc.field_L) {
                        L48: {
                          L49: {
                            if (var12_ref.field_cc) {
                              break L49;
                            } else {
                              if (!var12_ref.field_Jb) {
                                if (var12_ref.field_mc) {
                                  stackOut_165_0 = nr.field_o;
                                  stackIn_166_0 = stackOut_165_0;
                                  break L48;
                                } else {
                                  stackOut_164_0 = ls.field_d;
                                  stackIn_166_0 = stackOut_164_0;
                                  break L48;
                                }
                              } else {
                                break L49;
                              }
                            }
                          }
                          stackOut_162_0 = ns.field_qb;
                          stackIn_166_0 = stackOut_162_0;
                          break L48;
                        }
                        dn.field_k = stackIn_166_0;
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    L50: {
                      if (!var12_ref.field_ac.field_L) {
                        break L50;
                      } else {
                        L51: {
                          if (var12_ref.field_Fb == 2) {
                            stackOut_171_0 = we.field_d;
                            stackIn_172_0 = stackOut_171_0;
                            break L51;
                          } else {
                            stackOut_170_0 = wd.field_K;
                            stackIn_172_0 = stackOut_170_0;
                            break L51;
                          }
                        }
                        dn.field_k = stackIn_172_0;
                        break L50;
                      }
                    }
                    L52: {
                      if (var12_ref.field_rb == 0) {
                        break L52;
                      } else {
                        if (var12_ref.f((byte) -78)) {
                          break L52;
                        } else {
                          if (var12_ref.field_Db.field_rb != 0) {
                            L53: {
                              if (!var12_ref.field_Ab) {
                                break L53;
                              } else {
                                L54: {
                                  if (!var12_ref.field_mc) {
                                    break L54;
                                  } else {
                                    if (var12_ref.field_cc) {
                                      break L53;
                                    } else {
                                      if (!var12_ref.field_Jb) {
                                        break L54;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                os.a(var12_ref.g(-121), param4, true);
                                break L52;
                              }
                            }
                            sq.a(-57, param4, var12_ref.g(-103));
                            break L52;
                          } else {
                            aj.a(true, (byte) -100, var12_ref, var32);
                            break L52;
                          }
                        }
                      }
                    }
                    var12_ref = (fb) (Object) var8.a((byte) -71);
                    continue L1;
                  } else {
                    L55: {
                      if (var12_ref.field_xb[var34_int].field_L) {
                        L56: {
                          if (null == ei.field_f) {
                            var35 = null;
                            break L56;
                          } else {
                            if (ei.field_f[var34_int] != null) {
                              var35 = (Object) (Object) ei.field_f[var34_int][var12_ref.field_dc[var34_int] & 255];
                              break L56;
                            } else {
                              var35 = null;
                              break L56;
                            }
                          }
                        }
                        if (var35 == null) {
                          dn.field_k = gm.field_l[var34_int];
                          break L55;
                        } else {
                          dn.field_k = gm.field_l[var34_int] + " - " + var35;
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    var34_int++;
                    continue L42;
                  }
                }
              } else {
                var12_ref.field_xb[var22_int].field_pb = null;
                var23 = var12_ref.field_xb[var22_int];
                var12_ref.field_xb[var22_int].field_mb = 0;
                var23.field_K = 0;
                var22_int++;
                continue L12;
              }
            }
          }
        }
    }

    final synchronized void c(int param0, int param1) {
        L0: {
          ((ga) this).field_H = param1;
          if (param0 == 598) {
            break L0;
          } else {
            this.a(-76, -5, true, 106);
            break L0;
          }
        }
    }

    final static void a(nk[] param0, int param1, bc param2, int[] param3, bi[][] param4, String[] param5, int param6, bc param7, byte[] param8, String[][] param9, bc param10, byte[] param11, boolean param12, String[][] param13, int param14, int[] param15, bi[][] param16) {
        RuntimeException var17 = null;
        Object var18 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        try {
          L0: {
            L1: {
              var18 = null;
              ur.a(param4, param1, param8, param12, param10, param15, param16, param5, (String[]) null, -82, param11, param7, param2, param0, param13, 1, param9, param3, param6);
              if (param14 == 16384) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var17;
            stackOut_3_1 = new StringBuilder().append("ga.DA(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(param6).append(44);
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param7 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param8 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param9 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param10 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param11 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L11;
            }
          }
          L12: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(44).append(param12).append(44);
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param13 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L12;
            }
          }
          L13: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(44).append(param14).append(44);
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param15 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L13;
            }
          }
          L14: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(44);
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param16 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        ((ga) this).field_x.d();
        if (param0 != 16384) {
            boolean discarded$0 = ((ga) this).h(18);
        }
        ((ga) this).field_z = null;
        this.a(-1, param1);
    }

    private final void b(int param0, byte param1) {
        qq var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 != var3.field_y) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var3.field_K != null) {
                  L4: {
                    var3.field_K.g(ap.field_j / 100);
                    if (var3.field_K.e()) {
                      ((ga) this).field_l.field_o.a((tn) (Object) var3.field_K);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.d(false);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_E >= 0) {
                  break L5;
                } else {
                  ((ga) this).field_N[var3.field_y][var3.field_H] = null;
                  break L5;
                }
              }
              var3.b((byte) -60);
              break L1;
            }
            var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        qq var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: {
          if ((2 & ((ga) this).field_F[param1]) != 0) {
            var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_y != param1) {
                    break L2;
                  } else {
                    if (null == ((ga) this).field_N[param1][var3.field_H]) {
                      if (var3.field_E >= 0) {
                        break L2;
                      } else {
                        var3.field_E = 0;
                        break L2;
                      }
                    } else {
                      var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
                      continue L1;
                    }
                  }
                }
                var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        L0: {
          ij.a(3974311, param4, true, param2, param0, param1);
          if (param3 <= -57) {
            break L0;
          } else {
            ga.a((nk[]) null, 95, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, -102, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, 52, (int[]) null, (bi[][]) null);
            break L0;
          }
        }
    }

    final synchronized void a(gh param0, byte param1, boolean param2) {
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
        try {
          L0: {
            L1: {
              this.a(param2, param0, 114, true);
              if (param1 == 101) {
                break L1;
              } else {
                ((ga) this).field_n = -99L;
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
            stackOut_3_1 = new StringBuilder().append("ga.R(");
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
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ga) this).field_x.f()) {
                  var4_int = ((ga) this).field_x.field_e * ((ga) this).field_M / ap.field_j;
                  L3: while (true) {
                    var5 = ((ga) this).field_O - -((long)param2 * (long)var4_int);
                    if (0L <= ((ga) this).field_n - var5) {
                      ((ga) this).field_O = var5;
                      break L2;
                    } else {
                      var7 = (int)((-((ga) this).field_O + (((ga) this).field_n - (-(long)var4_int - -1L))) / (long)var4_int);
                      ((ga) this).field_O = ((ga) this).field_O + (long)var7 * (long)var4_int;
                      ((ga) this).field_l.b(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.a((byte) -64);
                      if (((ga) this).field_x.f()) {
                        continue L3;
                      } else {
                        ((ga) this).field_l.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((ga) this).field_l.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ga.G(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(byte param0, int param1) {
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 < 0) {
          param1 = 0;
          L0: while (true) {
            if (param1 >= 16) {
              return;
            } else {
              this.a((byte) -63, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          ((ga) this).field_y[param1] = 12800;
          ((ga) this).field_G[param1] = 8192;
          ((ga) this).field_s[param1] = 16383;
          ((ga) this).field_T[param1] = 8192;
          ((ga) this).field_p[param1] = 0;
          ((ga) this).field_J[param1] = 8192;
          this.a(true, param1);
          this.d(0, param1);
          ((ga) this).field_F[param1] = 0;
          ((ga) this).field_q[param1] = 32767;
          ((ga) this).field_r[param1] = 256;
          ((ga) this).field_t[param1] = 0;
          this.a(70, 8192, param1);
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1) {
            this.b(-1, (byte) 68);
            break L0;
          } else {
            this.a(-1, 2);
            break L0;
          }
        }
        this.a((byte) -63, -1);
        var3 = 0;
        L1: while (true) {
          if (var3 >= 16) {
            var5 = 0;
            var3 = var5;
            L2: while (true) {
              if (16 <= var5) {
                return;
              } else {
                ((ga) this).field_P[var5] = we.a(((ga) this).field_m[var5], -128);
                var5++;
                continue L2;
              }
            }
          } else {
            ((ga) this).field_I[var3] = ((ga) this).field_m[var3];
            var3++;
            continue L1;
          }
        }
    }

    final boolean a(byte param0, qq param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1.field_K == null) {
              L1: {
                if (-1 < param1.field_E) {
                  break L1;
                } else {
                  param1.b((byte) -114);
                  if (-1 >= param1.field_z) {
                    break L1;
                  } else {
                    if (param1 != ((ga) this).field_K[param1.field_y][param1.field_z]) {
                      break L1;
                    } else {
                      ((ga) this).field_K[param1.field_y][param1.field_z] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              var3_int = -106 % ((param0 - 64) / 53);
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ga.UA(").append(param0).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = 240 & param0;
        if (128 == var4) {
          var5 = 15 & param0;
          var6 = (32672 & param0) >> 8;
          var7 = (8354916 & param0) >> 16;
          this.a((byte) 29, var7, var5, var6);
          return;
        } else {
          if (144 != var4) {
            if (var4 != 160) {
              if (var4 == 176) {
                L0: {
                  var5 = 15 & param0;
                  var6 = 127 & param0 >> 8;
                  var7 = 127 & param0 >> 16;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    ((ga) this).field_P[var5] = (var7 << 14) + we.a(-2080769, ((ga) this).field_P[var5]);
                    break L0;
                  }
                }
                L1: {
                  if (var6 != 32) {
                    break L1;
                  } else {
                    ((ga) this).field_P[var5] = (var7 << 7) + we.a(-16257, ((ga) this).field_P[var5]);
                    break L1;
                  }
                }
                L2: {
                  if (var6 != 1) {
                    break L2;
                  } else {
                    ((ga) this).field_p[var5] = we.a(-16257, ((ga) this).field_p[var5]) + (var7 << 7);
                    break L2;
                  }
                }
                L3: {
                  if (33 != var6) {
                    break L3;
                  } else {
                    ((ga) this).field_p[var5] = var7 + we.a(((ga) this).field_p[var5], -128);
                    break L3;
                  }
                }
                L4: {
                  if (var6 != 5) {
                    break L4;
                  } else {
                    ((ga) this).field_J[var5] = we.a(-16257, ((ga) this).field_J[var5]) - -(var7 << 7);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var6) {
                    break L5;
                  } else {
                    ((ga) this).field_J[var5] = var7 + we.a(((ga) this).field_J[var5], -128);
                    break L5;
                  }
                }
                L6: {
                  if (var6 == 7) {
                    ((ga) this).field_y[var5] = (var7 << 7) + we.a(-16257, ((ga) this).field_y[var5]);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (39 == var6) {
                    ((ga) this).field_y[var5] = we.a(-128, ((ga) this).field_y[var5]) - -var7;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var6 == 10) {
                    ((ga) this).field_G[var5] = (var7 << 7) + we.a(((ga) this).field_G[var5], -16257);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (42 == var6) {
                    ((ga) this).field_G[var5] = we.a(((ga) this).field_G[var5], -128) - -var7;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var6 != 11) {
                    break L10;
                  } else {
                    ((ga) this).field_s[var5] = (var7 << 7) + we.a(-16257, ((ga) this).field_s[var5]);
                    break L10;
                  }
                }
                L11: {
                  if (var6 != 43) {
                    break L11;
                  } else {
                    ((ga) this).field_s[var5] = var7 + we.a(((ga) this).field_s[var5], -128);
                    break L11;
                  }
                }
                L12: {
                  if (var6 == 64) {
                    if (var7 < 64) {
                      ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -2);
                      break L12;
                    } else {
                      ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var6 == 65) {
                    if (var7 < 64) {
                      this.a(true, var5);
                      ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -3);
                      break L13;
                    } else {
                      ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 2);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (var6 == 99) {
                    ((ga) this).field_q[var5] = (var7 << 7) + we.a(127, ((ga) this).field_q[var5]);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (98 == var6) {
                    ((ga) this).field_q[var5] = var7 + we.a(16256, ((ga) this).field_q[var5]);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var6 == 101) {
                    ((ga) this).field_q[var5] = we.a(((ga) this).field_q[var5], 127) + (16384 + (var7 << 7));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (var6 == 100) {
                    ((ga) this).field_q[var5] = 16384 + (we.a(((ga) this).field_q[var5], 16256) + var7);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var6 != 120) {
                    break L18;
                  } else {
                    this.b(var5, (byte) 68);
                    break L18;
                  }
                }
                L19: {
                  if (var6 == 121) {
                    this.a((byte) -63, var5);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var6 != 123) {
                    break L20;
                  } else {
                    this.a(var5, 2);
                    break L20;
                  }
                }
                L21: {
                  if (var6 != 6) {
                    break L21;
                  } else {
                    var8 = ((ga) this).field_q[var5];
                    if (var8 == 16384) {
                      ((ga) this).field_r[var5] = we.a(((ga) this).field_r[var5], -16257) + (var7 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var6 != 38) {
                    break L22;
                  } else {
                    var8 = ((ga) this).field_q[var5];
                    if (var8 != 16384) {
                      break L22;
                    } else {
                      ((ga) this).field_r[var5] = var7 + we.a(((ga) this).field_r[var5], -128);
                      break L22;
                    }
                  }
                }
                L23: {
                  if (var6 != 16) {
                    break L23;
                  } else {
                    ((ga) this).field_t[var5] = (var7 << 7) + we.a(((ga) this).field_t[var5], -16257);
                    break L23;
                  }
                }
                L24: {
                  if (var6 != 48) {
                    break L24;
                  } else {
                    ((ga) this).field_t[var5] = we.a(((ga) this).field_t[var5], -128) - -var7;
                    break L24;
                  }
                }
                L25: {
                  if (81 != var6) {
                    break L25;
                  } else {
                    if (var7 < 64) {
                      this.d(0, var5);
                      ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -5);
                      break L25;
                    } else {
                      ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (var6 != 17) {
                    break L26;
                  } else {
                    this.a(-72, (var7 << 7) + (-16257 & ((ga) this).field_E[var5]), var5);
                    break L26;
                  }
                }
                L27: {
                  if (var6 == 49) {
                    this.a(46, (((ga) this).field_E[var5] & -128) - -var7, var5);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (var4 == 192) {
                  var5 = param0 & 15;
                  var6 = (32569 & param0) >> 8;
                  this.a(var5, ((ga) this).field_P[var5] - -var6, (byte) 119);
                  return;
                } else {
                  if (var4 == 208) {
                    var5 = param0 & 15;
                    var6 = param0 >> 8 & 127;
                    this.a(var5, (byte) 98, var6);
                    return;
                  } else {
                    if (224 == var4) {
                      var5 = 15 & param0;
                      var6 = (127 & param0 >> 8) + (param0 >> 9 & 16256);
                      this.b(var5, (byte) -34, var6);
                      return;
                    } else {
                      var4 = param0 & 255;
                      if (var4 == 255) {
                        this.a(-1, true);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              var5 = param0 & 15;
              var6 = param0 >> 8 & 127;
              var7 = (param0 & 8368783) >> 16;
              this.a(var5, var7, true, var6);
              return;
            }
          } else {
            var5 = param0 & 15;
            var6 = param0 >> 8 & 127;
            var7 = 127 & param0 >> 16;
            if (var7 <= 0) {
              this.a((byte) 29, 64, var5, var6);
              return;
            } else {
              this.a(var6, var5, var7, (byte) -49);
              return;
            }
          }
        }
    }

    final synchronized int a() {
        return 0;
    }

    final static void g() {
        jq.field_d = null;
        rs.field_Fb = -1;
        sc.field_q = false;
        ra.field_g = -1;
        rq.field_e = 0;
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
    }

    private final synchronized void a(boolean param0, gh param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(16384, param3);
              ((ga) this).field_x.a(param1.field_h);
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
            ((ga) this).field_v = stackIn_4_1 != 0;
            ((ga) this).field_O = 0L;
            var5_int = ((ga) this).field_x.c();
            var6 = 0;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  ((ga) this).field_C = ((ga) this).field_x.g();
                  ((ga) this).field_D = ((ga) this).field_x.field_b[((ga) this).field_C];
                  ((ga) this).field_n = ((ga) this).field_x.c(((ga) this).field_D);
                  if (param2 >= 32) {
                    break L3;
                  } else {
                    this.b(-59, true);
                    break L3;
                  }
                }
                break L0;
              } else {
                ((ga) this).field_x.b(var6);
                ((ga) this).field_x.d(var6);
                ((ga) this).field_x.e(var6);
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ga.W(").append(param0).append(44);
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final synchronized tn d() {
        return null;
    }

    private final void d(int param0, int param1) {
        qq var3 = null;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((4 & ((ga) this).field_F[param1]) == 0) {
            break L0;
          } else {
            var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (var3.field_y == param1) {
                    var3.field_j = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        qq var5 = null;
        kk var6 = null;
        int var6_int = 0;
        qq var7 = null;
        int var8 = 0;
        qq var9 = null;
        int var10 = 0;
        br var11 = null;
        Object var12 = null;
        br var12_ref = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        qq stackIn_19_2 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        qq stackIn_21_2 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        qq stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        qq stackOut_18_2 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        qq stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        qq stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        L0: {
          var12 = null;
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          this.a((byte) 29, 64, param1, param0);
          if (0 == (((ga) this).field_F[param1] & 2)) {
            break L0;
          } else {
            var5 = (qq) (Object) ((ga) this).field_l.field_n.f(3725);
            L1: while (true) {
              if (null == var5) {
                break L0;
              } else {
                L2: {
                  if (var5.field_y != param1) {
                    break L2;
                  } else {
                    if (var5.field_E >= 0) {
                      break L2;
                    } else {
                      ((ga) this).field_N[param1][var5.field_H] = null;
                      ((ga) this).field_N[param1][param0] = var5;
                      var6_int = (var5.field_G * var5.field_r >> 12) + var5.field_J;
                      var5.field_J = var5.field_J + (-var5.field_H + param0 << 8);
                      var5.field_G = 4096;
                      var5.field_r = -var5.field_J + var6_int;
                      var5.field_H = param0;
                      return;
                    }
                  }
                }
                var5 = (qq) (Object) ((ga) this).field_l.field_n.b(-123);
                continue L1;
              }
            }
          }
        }
        var11 = (br) (Object) ((ga) this).field_Q.a((long)((ga) this).field_I[param1], -25064);
        var12_ref = var11;
        if (null == var12_ref) {
          return;
        } else {
          var6 = var11.field_h[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new qq();
              var7.field_y = param1;
              var7.field_A = var12_ref;
              var7.field_M = var6;
              var7.field_u = var11.field_j[param0];
              var7.field_z = var11.field_r[param0];
              var7.field_H = param0;
              var7.field_k = var11.field_s[param0] * param2 * param2 * var12_ref.field_q - -1024 >> 11;
              var7.field_q = var11.field_t[param0] & 255;
              var8 = 0;
              var7.field_J = (param0 << 8) + -(var11.field_k[param0] & 32767);
              var7.field_B = 0;
              var7.field_E = -1;
              var7.field_F = 0;
              var7.field_h = 0;
              var7.field_v = 0;
              if (((ga) this).field_t[param1] != 0) {
                L4: {
                  var7.field_K = al.a(var6, this.b(var7, (byte) -123), 0, this.a(var7, (byte) 120));
                  stackOut_18_0 = this;
                  stackOut_18_1 = -2139009338;
                  stackOut_18_2 = (qq) var7;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_21_1 = stackOut_18_1;
                  stackIn_21_2 = stackOut_18_2;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  if (var12_ref.field_k[param0] >= 0) {
                    stackOut_21_0 = this;
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = (qq) (Object) stackIn_21_2;
                    stackOut_21_3 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    stackIn_22_3 = stackOut_21_3;
                    break L4;
                  } else {
                    stackOut_19_0 = this;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = (qq) (Object) stackIn_19_2;
                    stackOut_19_3 = 1;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_22_2 = stackOut_19_2;
                    stackIn_22_3 = stackOut_19_3;
                    break L4;
                  }
                }
                ((ga) this).a(stackIn_22_1, stackIn_22_2, stackIn_22_3 != 0);
                break L3;
              } else {
                int discarded$1 = -1481279096;
                var7.field_K = al.a(var6, this.b(var7, (byte) -6), this.a(var7), this.a(var7, (byte) 124));
                break L3;
              }
            }
            L5: {
              if (0 > var12_ref.field_k[param0]) {
                var7.field_K.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (0 > var7.field_z) {
                break L6;
              } else {
                L7: {
                  var9 = ((ga) this).field_K[param1][var7.field_z];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (0 > var9.field_E) {
                      ((ga) this).field_N[param1][var9.field_H] = null;
                      var9.field_E = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((ga) this).field_K[param1][var7.field_z] = var7;
                break L6;
              }
            }
            ((ga) this).field_l.field_n.a((byte) -113, (oh) (Object) var7);
            ((ga) this).field_N[param1][param0] = var7;
            return;
          }
        }
    }

    final boolean a(int param0, int[] param1, int param2, qq param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        kc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_74_0 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_p = ap.field_j / 100;
              if (0 > param3.field_E) {
                break L1;
              } else {
                L2: {
                  if (param3.field_K == null) {
                    break L2;
                  } else {
                    if (param3.field_K.g()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(false);
                  param3.b((byte) -68);
                  if (param3.field_z <= 0) {
                    break L3;
                  } else {
                    if (((ga) this).field_K[param3.field_y][param3.field_z] != param3) {
                      break L3;
                    } else {
                      ((ga) this).field_K[param3.field_y][param3.field_z] = null;
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_G;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)((ga) this).field_J[param3.field_y] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_G = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_K.d(this.b(param3, (byte) -1));
              var7 = param3.field_u;
              param3.field_i = param3.field_i + var7.field_o;
              param3.field_C = param3.field_C + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((-60 + param3.field_H << 8) + (param3.field_G * param3.field_r >> 12));
              if (var7.field_h <= 0) {
                break L6;
              } else {
                L7: {
                  if (var7.field_a <= 0) {
                    param3.field_h = param3.field_h + 128;
                    break L7;
                  } else {
                    param3.field_h = param3.field_h + (int)(Math.pow(2.0, var9 * (double)var7.field_a) * 128.0 + 0.5);
                    break L7;
                  }
                }
                if (var7.field_h * param3.field_h >= 819200) {
                  var8 = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (null == var7.field_n) {
                break L8;
              } else {
                L9: {
                  if (var7.field_k > 0) {
                    param3.field_F = param3.field_F + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                    break L9;
                  } else {
                    param3.field_F = param3.field_F + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_B >= var7.field_n.length + -2) {
                      break L11;
                    } else {
                      if ((65280 & var7.field_n[2 + param3.field_B] << 8) >= param3.field_F) {
                        break L11;
                      } else {
                        param3.field_B = param3.field_B + 2;
                        continue L10;
                      }
                    }
                  }
                  if (-2 + var7.field_n.length != param3.field_B) {
                    break L8;
                  } else {
                    if (var7.field_n[1 + param3.field_B] == -1) {
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
              if (-1 > param3.field_E) {
                break L12;
              } else {
                if (var7.field_e == null) {
                  break L12;
                } else {
                  if ((1 & ((ga) this).field_F[param3.field_y]) == -1) {
                    L13: {
                      if (-1 > param3.field_z) {
                        break L13;
                      } else {
                        if (((ga) this).field_K[param3.field_y][param3.field_z] == param3) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (var7.field_c > 0) {
                        param3.field_E = param3.field_E + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                        break L14;
                      } else {
                        param3.field_E = param3.field_E + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param3.field_v >= -2 + var7.field_e.length) {
                          break L16;
                        } else {
                          if (param3.field_E <= (255 & var7.field_e[2 + param3.field_v]) << 8) {
                            break L16;
                          } else {
                            param3.field_v = param3.field_v + 2;
                            continue L15;
                          }
                        }
                      }
                      if (-2 + var7.field_e.length == param3.field_v) {
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
              L17: {
                if (param2 == 2) {
                  break L17;
                } else {
                  this.a(-71, -84, -11);
                  break L17;
                }
              }
              int discarded$1 = -1481279096;
              param3.field_K.a(param3.field_p, this.a(param3), this.a(param3, (byte) 122));
              stackOut_78_0 = 0;
              stackIn_79_0 = stackOut_78_0;
              break L0;
            } else {
              L18: {
                param3.field_K.g(param3.field_p);
                if (param1 == null) {
                  param3.field_K.a(param4);
                  break L18;
                } else {
                  param3.field_K.b(param1, param0, param4);
                  break L18;
                }
              }
              L19: {
                if (param3.field_K.e()) {
                  ((ga) this).field_l.field_o.a((tn) (Object) param3.field_K);
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                param3.d(false);
                if (param3.field_E < 0) {
                  break L20;
                } else {
                  param3.b((byte) -58);
                  if (param3.field_z <= 0) {
                    break L20;
                  } else {
                    if (((ga) this).field_K[param3.field_y][param3.field_z] == param3) {
                      ((ga) this).field_K[param3.field_y][param3.field_z] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              stackOut_74_0 = 1;
              stackIn_75_0 = stackOut_74_0;
              return stackIn_75_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var6;
            stackOut_80_1 = new StringBuilder().append("ga.C(").append(param0).append(44);
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param1 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L21;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L21;
            }
          }
          L22: {
            stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(44).append(param2).append(44);
            stackIn_87_0 = stackOut_84_0;
            stackIn_87_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param3 == null) {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L22;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_88_0 = stackOut_85_0;
              stackIn_88_1 = stackOut_85_1;
              stackIn_88_2 = stackOut_85_2;
              break L22;
            }
          }
          throw r.a((Throwable) (Object) stackIn_88_0, stackIn_88_2 + 44 + param4 + 41);
        }
        return stackIn_79_0 != 0;
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          var4 = -35 / ((51 - param2) / 61);
          if (param1 != ((ga) this).field_I[param0]) {
            ((ga) this).field_I[param0] = param1;
            var5 = 0;
            L1: while (true) {
              if (128 <= var5) {
                break L0;
              } else {
                ((ga) this).field_K[param0][var5] = null;
                var5++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_w = null;
        field_L = null;
    }

    private final int a(qq param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 114) {
                break L1;
              } else {
                ((ga) this).field_u = null;
                break L1;
              }
            }
            var3_int = ((ga) this).field_G[param0.field_y];
            if (var3_int < 8192) {
              stackOut_5_0 = 32 + param0.field_q * var3_int >> 6;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (128 + -param0.field_q) * (-var3_int + 16384) >> 6) + 16384;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ga.SA(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = ((ga) this).field_C;
          var3 = ((ga) this).field_D;
          var4 = ((ga) this).field_n;
          if (null == ((ga) this).field_z) {
            break L0;
          } else {
            if (((ga) this).field_S == var3) {
              this.a(((ga) this).field_v, ((ga) this).field_z, 33, ((ga) this).field_B);
              this.a((byte) 109);
              return;
            } else {
              break L0;
            }
          }
        }
        var6 = -102 / ((-15 - param0) / 34);
        L1: while (true) {
          if (var3 != ((ga) this).field_D) {
            L2: {
              ((ga) this).field_C = var2;
              ((ga) this).field_D = var3;
              ((ga) this).field_n = var4;
              if (((ga) this).field_z == null) {
                break L2;
              } else {
                if (~var3 < ~((ga) this).field_S) {
                  ((ga) this).field_C = -1;
                  ((ga) this).field_D = ((ga) this).field_S;
                  ((ga) this).field_n = ((ga) this).field_x.c(((ga) this).field_D);
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
                if (((ga) this).field_x.field_b[var2] != var3) {
                  break L4;
                } else {
                  ((ga) this).field_x.b(var2);
                  var7 = ((ga) this).field_x.a(var2);
                  if (var7 != 1) {
                    L5: {
                      if ((var7 & 128) != 0) {
                        this.a(var7, (byte) -121);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((ga) this).field_x.d(var2);
                    ((ga) this).field_x.e(var2);
                    continue L3;
                  } else {
                    ((ga) this).field_x.e();
                    ((ga) this).field_x.e(var2);
                    if (((ga) this).field_x.a()) {
                      if (null == ((ga) this).field_z) {
                        L6: {
                          if (!((ga) this).field_v) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              ((ga) this).field_x.a(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(-1, true);
                        ((ga) this).field_x.d();
                        return;
                      } else {
                        ((ga) this).a(((ga) this).field_z, (byte) 101, ((ga) this).field_v);
                        this.a((byte) 29);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = ((ga) this).field_x.g();
              var3 = ((ga) this).field_x.field_b[var2];
              var4 = ((ga) this).field_x.c(var3);
              continue L1;
            }
          }
        }
    }

    final void a(int param0, qq param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
              if (param0 == -2139009338) {
                break L1;
              } else {
                ((ga) this).field_z = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param1.field_M.field_m.length;
                if (!param2) {
                  break L3;
                } else {
                  if (param1.field_M.field_i) {
                    var6 = -param1.field_M.field_l + (var4_int + var4_int);
                    var5 = (int)((long)((ga) this).field_t[param1.field_y] * (long)var6 >> 6);
                    var4_int = var4_int << 8;
                    if (var5 >= var4_int) {
                      param1.field_K.c(true);
                      var5 = -var5 + var4_int - -var4_int + -1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)((ga) this).field_t[param1.field_y] * (long)var4_int >> 6);
              break L2;
            }
            param1.field_K.h(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ga.RA(").append(param0).append(44);
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    private final int a(qq param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        kc var10 = null;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (((ga) this).field_A[param0.field_y] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                var9 = param0.field_u;
                var10 = var9;
                var4 = ((ga) this).field_y[param0.field_y] * ((ga) this).field_s[param0.field_y] + 4096 >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = param0.field_k * var4 + 16384 >> 15;
                var4 = 128 + ((ga) this).field_H * var4 >> 8;
                var4 = ((ga) this).field_A[param0.field_y] * var4 + 128 >> 8;
                if (var10.field_h <= 0) {
                  break L1;
                } else {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_h * 0.00001953125 * (double)var10.field_h));
                  break L1;
                }
              }
              L2: {
                if (null == var10.field_n) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_F;
                    var6 = var10.field_n[1 + param0.field_B];
                    if (param0.field_B < var10.field_n.length + -2) {
                      var7 = var9.field_n[param0.field_B] << 8 & 65280;
                      var8 = (255 & var10.field_n[2 + param0.field_B]) << 8;
                      var6 = var6 + (-var6 + var10.field_n[param0.field_B - -3]) * (-var7 + var5) / (-var7 + var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param0.field_E <= 0) {
                  break L4;
                } else {
                  if (var10.field_e != null) {
                    L5: {
                      var5 = param0.field_E;
                      var6 = var10.field_e[1 + param0.field_v];
                      if (var10.field_e.length + -2 <= param0.field_v) {
                        break L5;
                      } else {
                        var7 = (255 & var9.field_e[param0.field_v]) << 8;
                        var8 = var10.field_e[2 + param0.field_v] << 8 & 65280;
                        var6 = var6 + (var10.field_e[param0.field_v + 3] + -var6) * (-var7 + var5) / (-var7 + var8);
                        break L5;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_23_0 = var4;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("ga.PA(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + -1481279096 + 41);
        }
        return stackIn_24_0;
    }

    final synchronized void d(int param0, byte param1, int param2) {
        L0: {
          this.c(param0, (byte) 113, param2);
          if (param1 == -110) {
            break L0;
          } else {
            tn discarded$2 = ((ga) this).b();
            break L0;
          }
        }
    }

    final synchronized boolean h(int param0) {
        if (param0 != 5309) {
            field_L = null;
        }
        return ((ga) this).field_x.f();
    }

    public ga() {
        ((ga) this).field_p = new int[16];
        ((ga) this).field_t = new int[16];
        ((ga) this).field_N = new qq[16][128];
        ((ga) this).field_r = new int[16];
        ((ga) this).field_H = 256;
        ((ga) this).field_M = 1000000;
        ((ga) this).field_q = new int[16];
        ((ga) this).field_P = new int[16];
        ((ga) this).field_y = new int[16];
        ((ga) this).field_G = new int[16];
        ((ga) this).field_K = new qq[16][128];
        ((ga) this).field_u = new int[16];
        ((ga) this).field_I = new int[16];
        ((ga) this).field_F = new int[16];
        ((ga) this).field_s = new int[16];
        ((ga) this).field_m = new int[16];
        ((ga) this).field_J = new int[16];
        ((ga) this).field_A = new int[16];
        ((ga) this).field_T = new int[16];
        ((ga) this).field_E = new int[16];
        ((ga) this).field_x = new pi();
        ((ga) this).field_l = new rc((ga) this);
        ((ga) this).field_Q = new ti(128);
        ((ga) this).a((byte) -90, -1, 256);
        this.a(-1, true);
    }

    ga(ga param0) {
        RuntimeException var2 = null;
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
        ((ga) this).field_p = new int[16];
        ((ga) this).field_t = new int[16];
        ((ga) this).field_N = new qq[16][128];
        ((ga) this).field_r = new int[16];
        ((ga) this).field_H = 256;
        ((ga) this).field_M = 1000000;
        ((ga) this).field_q = new int[16];
        ((ga) this).field_P = new int[16];
        ((ga) this).field_y = new int[16];
        ((ga) this).field_G = new int[16];
        ((ga) this).field_K = new qq[16][128];
        ((ga) this).field_u = new int[16];
        ((ga) this).field_I = new int[16];
        ((ga) this).field_F = new int[16];
        ((ga) this).field_s = new int[16];
        ((ga) this).field_m = new int[16];
        ((ga) this).field_J = new int[16];
        ((ga) this).field_A = new int[16];
        ((ga) this).field_T = new int[16];
        ((ga) this).field_E = new int[16];
        ((ga) this).field_x = new pi();
        ((ga) this).field_l = new rc((ga) this);
        try {
          L0: {
            ((ga) this).field_Q = param0.field_Q;
            ((ga) this).a((byte) -75, -1, 256);
            this.a(-1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ga.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Seriously offensive language";
        field_w = new byte[]{(byte) 4, (byte) 2, (byte) 0, (byte) 2, (byte) 0};
    }
}
