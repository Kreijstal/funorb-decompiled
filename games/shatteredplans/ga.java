/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        this.b(16384, true);
        if (param0 != 15) {
            this.field_r = (int[]) null;
        }
    }

    private final void b(int param0, byte param1, int param2) {
        this.field_T[param0] = param2;
        if (param1 != -34) {
            this.field_K = (qq[][]) null;
        }
    }

    final synchronized tn b() {
        return (tn) ((Object) this.field_l);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = -117 / ((param0 - -22) / 39);
        this.field_E[param2] = param1;
        this.field_u[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        bi stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_6_0 = null;
        bi stackOut_4_0 = null;
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
            if (vd.a(param2, param0, param1, 2)) {
              if (param3 == -20487) {
                stackOut_6_0 = gq.d(0);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_4_0 = (bi) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ga.J(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
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
              var3_int = (param0.field_r * param0.field_G >> -218032372) + param0.field_J;
              var3_int = var3_int + (this.field_r[param0.field_y] * (-8192 + this.field_T[param0.field_y]) >> 948714124);
              var5 = -50 % ((param1 - -60) / 41);
              var4 = param0.field_u;
              if ((var4.field_o ^ -1) >= -1) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_f) {
                    break L2;
                  } else {
                    if (-1 > (this.field_p[param0.field_y] ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var6 = var4.field_f << -196276638;
                  var7 = var4.field_j << -2141564063;
                  if (var7 <= param0.field_C) {
                    break L3;
                  } else {
                    var6 = param0.field_C * var6 / var7;
                    break L3;
                  }
                }
                var6 = var6 + (this.field_p[param0.field_y] >> -646051129);
                var8 = Math.sin((double)(param0.field_i & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var6 * var8);
                break L1;
              }
            }
            L4: {
              var6 = (int)((double)(256 * param0.field_M.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ap.field_j + 0.5);
              if ((var6 ^ -1) > -2) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = var6;
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
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("ga.BA(");
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
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized void f(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 256) {
            this.field_r = (int[]) null;
        }
        br var4 = (br) ((Object) this.field_Q.c(83));
        while (var4 != null) {
            var4.e(26005);
            var4 = (br) ((Object) this.field_Q.a(false));
        }
    }

    private final void a(int param0, int param1) {
        qq var3 = null;
        int var4 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == 2) {
            break L0;
          } else {
            this.b(-91, (byte) 112, -1);
            break L0;
          }
        }
        var3 = (qq) ((Object) this.field_l.field_n.d(0));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (0 > param0) {
                  break L3;
                } else {
                  if (var3.field_y != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var3.field_E < 0) {
                this.field_N[var3.field_y][var3.field_H] = null;
                var3.field_E = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
            continue L1;
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        qq var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        qq var8 = this.field_N[param2][param3];
        if (param0 != 29) {
            return;
        }
        if (!(var8 != null)) {
            return;
        }
        this.field_N[param2][param3] = null;
        if (-1 == (2 & this.field_F[param2] ^ -1)) {
            var8.field_E = 0;
        } else {
            var6 = (qq) ((Object) this.field_l.field_n.d(0));
            while (var6 != null) {
                if (var8.field_y == var6.field_y) {
                    if ((var6.field_E ^ -1) > -1) {
                        if (!(var6 == var8)) {
                            var8.field_E = 0;
                            break;
                        }
                    }
                }
                var6 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
            }
        }
    }

    final synchronized void c(int param0, boolean param1) {
        this.field_M = param0;
        if (param1) {
            this.field_t = (int[]) null;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        tn discarded$0 = null;
        if (param1 != 98) {
            discarded$0 = this.b();
        }
    }

    private final void c(int param0, byte param1, int param2) {
        this.field_m[param2] = param0;
        this.field_P[param2] = we.a(-128, param0);
        int var4 = 120 % ((51 - param1) / 40);
        this.a(param2, param0, (byte) -16);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 > -67) {
            this.b(44, (byte) 25, -26);
        }
        if ((param1 ^ -1) <= -1) {
            this.field_A[param1] = param2;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                this.field_A[var4] = param2;
            }
        }
    }

    final synchronized boolean a(bc param0, gh param1, int param2, int param3, io param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        int var11 = 0;
        br var12 = null;
        br var13 = null;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.a();
              if (param2 > 12) {
                break L1;
              } else {
                this.field_s = (int[]) null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (0 < param3) {
                var7 = new int[]{param3};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (be) ((Object) param1.field_i.c(-126));
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int != 0) {
                    param1.b();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackOut_19_0 = var6_int;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                L5: {
                  var9 = (int)var8.field_b;
                  var12 = (br) ((Object) this.field_Q.a((long)var9, -25064));
                  if (var12 == null) {
                    var13 = lo.a(param0, (byte) 125, var9);
                    if (var13 != null) {
                      this.field_Q.a(var13, 87, (long)var9);
                      if (var13.a(param4, var8.field_j, (int[]) (var7), 1)) {
                        break L5;
                      } else {
                        var6_int = 0;
                        break L5;
                      }
                    } else {
                      var6_int = 0;
                      break L5;
                    }
                  } else {
                    if (var12.a(param4, var8.field_j, (int[]) (var7), 1)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      var8 = (be) ((Object) param1.field_i.a(false));
                      continue L3;
                    }
                  }
                }
                var8 = (be) ((Object) param1.field_i.a(false));
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ga.AA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_x.f()) {
            var2 = this.field_x.field_e * this.field_M / ap.field_j;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + this.field_O;
                if (0L <= this.field_n - var3) {
                  this.field_O = var3;
                  break L2;
                } else {
                  var5 = (int)((-1L + -this.field_O + (this.field_n + (long)var2)) / (long)var2);
                  this.field_O = this.field_O + (long)var5 * (long)var2;
                  this.field_l.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 42);
                  if (!this.field_x.f()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              this.field_l.a(param0);
              break L0;
            }
          } else {
            this.field_l.a(param0);
            break L0;
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        pf var8 = null;
        long var9 = 0L;
        Object var11 = null;
        fb var12 = null;
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
        bi var42 = null;
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
        bi var54 = null;
        ub stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        ub stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        fb stackIn_11_0 = null;
        qr stackIn_11_1 = null;
        qr stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        fb stackIn_12_0 = null;
        qr stackIn_12_1 = null;
        qr stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        fb stackIn_13_0 = null;
        qr stackIn_13_1 = null;
        qr stackIn_13_2 = null;
        long stackIn_13_3 = 0L;
        qr stackIn_13_4 = null;
        fb stackIn_30_0 = null;
        qr stackIn_30_1 = null;
        qr stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        fb stackIn_31_0 = null;
        qr stackIn_31_1 = null;
        qr stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        fb stackIn_32_0 = null;
        qr stackIn_32_1 = null;
        qr stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        qr stackIn_32_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        bi[] stackIn_81_0 = null;
        bi[] stackIn_82_0 = null;
        bi[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        bi[] stackIn_88_0 = null;
        bi[] stackIn_89_0 = null;
        bi[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        String stackIn_153_0 = null;
        String stackIn_163_0 = null;
        String stackIn_168_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        ub stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        ub stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        fb stackOut_10_0 = null;
        qr stackOut_10_1 = null;
        qr stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        fb stackOut_12_0 = null;
        qr stackOut_12_1 = null;
        qr stackOut_12_2 = null;
        long stackOut_12_3 = 0L;
        qr stackOut_12_4 = null;
        fb stackOut_11_0 = null;
        qr stackOut_11_1 = null;
        qr stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        qr stackOut_11_4 = null;
        fb stackOut_29_0 = null;
        qr stackOut_29_1 = null;
        qr stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        fb stackOut_31_0 = null;
        qr stackOut_31_1 = null;
        qr stackOut_31_2 = null;
        long stackOut_31_3 = 0L;
        qr stackOut_31_4 = null;
        fb stackOut_30_0 = null;
        qr stackOut_30_1 = null;
        qr stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        qr stackOut_30_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        bi[] stackOut_80_0 = null;
        bi[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        bi[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        bi[] stackOut_87_0 = null;
        bi[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        bi[] stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        String stackOut_152_0 = null;
        String stackOut_151_0 = null;
        String stackOut_162_0 = null;
        String stackOut_161_0 = null;
        String stackOut_159_0 = null;
        String stackOut_167_0 = null;
        String stackOut_166_0 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = qs.field_y;
              stackOut_1_1 = (cr.field_c * 4 + 8) * param5;
              stackOut_1_2 = (2 + cr.field_c) * 2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (hp.field_l != qs.field_y) {
                stackOut_3_0 = (ub) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_2_0 = (ub) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L1;
              }
            }
            L2: {
              var7_int = ((ub) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3 != 0, -109, param0, 2) ? 1 : 0;
              var8 = qs.field_y.field_xb.field_M;
              if (param1 > 109) {
                break L2;
              } else {
                ga.a((nk[]) null, -36, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, 119, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, -57, (int[]) null, (bi[][]) null);
                break L2;
              }
            }
            var9 = pr.a(14274);
            var11 = null;
            var12 = (fb) ((Object) var8.d(0));
            L3: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L4: {
                  var13 = 0;
                  if (null == var12.field_M) {
                    L5: {
                      var14 = param2 | param3;
                      var12.field_Ub = new qr(0L, oj.field_zb);
                      var12.a(4, var12.field_Ub);
                      var12.field_Ub.field_y = 1;
                      var12.field_Pb = new qr(0L, ek.field_E);
                      var12.a(4, var12.field_Pb);
                      var12.field_Rb = new qr(0L, oj.field_zb);
                      var12.a(4, var12.field_Rb);
                      var12.field_Rb.field_kb = 0;
                      var12.field_Wb = new qr(0L, oj.field_zb);
                      var12.a(4, var12.field_Wb);
                      var12.field_Wb.field_kb = 0;
                      var12.field_Ib = new qr(0L, ek.field_E);
                      var12.a(4, var12.field_Ib);
                      var12.field_Ib.field_y = 2;
                      stackOut_10_0 = (fb) (var12);
                      stackOut_10_1 = null;
                      stackOut_10_2 = null;
                      stackOut_10_3 = 0L;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      if (ns.field_pb) {
                        stackOut_12_0 = (fb) ((Object) stackIn_12_0);
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = oj.field_zb;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        stackIn_13_4 = stackOut_12_4;
                        break L5;
                      } else {
                        stackOut_11_0 = (fb) ((Object) stackIn_11_0);
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = stackIn_11_3;
                        stackOut_11_4 = ek.field_E;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_13_0.field_Mb = new qr(stackIn_13_3, stackIn_13_4);
                      var12.a(4, var12.field_Mb);
                      var12.field_xb = new qr[em.field_k];
                      var12.field_Bb = new qr(0L, (qr) null);
                      if ((1 << cp.field_q & var14) == 0) {
                        break L6;
                      } else {
                        var12.field_Mb.a(4, var12.field_Bb);
                        break L6;
                      }
                    }
                    L7: {
                      var12.field_oc = new qr(0L, (qr) null);
                      if ((1 << vr.field_g & var14) != 0) {
                        var12.field_Mb.a(4, var12.field_oc);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var12.field_ac = new qr(0L, (qr) null);
                      if ((var14 & 1 << kf.field_i) == 0) {
                        break L8;
                      } else {
                        var12.field_Mb.a(4, var12.field_ac);
                        break L8;
                      }
                    }
                    L9: {
                      var12.field_Kb = new qr(0L, (qr) null);
                      if (0 != (1 << v.field_e & var14)) {
                        var12.field_Mb.a(4, var12.field_Kb);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var45 = var12.field_Bb;
                    var44 = var12.field_Kb;
                    var12.field_ac.field_G = 1;
                    var43 = var12.field_oc;
                    var43.field_G = 1;
                    var44.field_G = 1;
                    var45.field_G = 1;
                    var18_int = 0;
                    L10: while (true) {
                      if (em.field_k <= var18_int) {
                        L11: {
                          stackOut_29_0 = (fb) (var12);
                          stackOut_29_1 = null;
                          stackOut_29_2 = null;
                          stackOut_29_3 = 0L;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          stackIn_31_2 = stackOut_29_2;
                          stackIn_31_3 = stackOut_29_3;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          stackIn_30_2 = stackOut_29_2;
                          stackIn_30_3 = stackOut_29_3;
                          if (ns.field_pb) {
                            stackOut_31_0 = (fb) ((Object) stackIn_31_0);
                            stackOut_31_1 = null;
                            stackOut_31_2 = null;
                            stackOut_31_3 = stackIn_31_3;
                            stackOut_31_4 = ek.field_E;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            stackIn_32_3 = stackOut_31_3;
                            stackIn_32_4 = stackOut_31_4;
                            break L11;
                          } else {
                            stackOut_30_0 = (fb) ((Object) stackIn_30_0);
                            stackOut_30_1 = null;
                            stackOut_30_2 = null;
                            stackOut_30_3 = stackIn_30_3;
                            stackOut_30_4 = oj.field_zb;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_32_2 = stackOut_30_2;
                            stackIn_32_3 = stackOut_30_3;
                            stackIn_32_4 = stackOut_30_4;
                            break L11;
                          }
                        }
                        stackIn_32_0.field_Ob = new qr(stackIn_32_3, stackIn_32_4);
                        var12.a(4, var12.field_Ob);
                        var12.field_Ob.field_y = 2;
                        var12.field_Tb = new qr(0L, ek.field_E);
                        var12.a(4, var12.field_Tb);
                        var12.field_Sb = new qr(0L, gn.field_w);
                        var12.a(4, var12.field_Sb);
                        var12.field_Hb = new qr(0L, gn.field_w);
                        var12.a(4, var12.field_Hb);
                        var12.field_ic = new qr(0L, ii.field_u);
                        var12.a(4, var12.field_ic);
                        var12.e((byte) -126);
                        var12.field_Db = new qr(0L, kq.field_h);
                        var13 = 1;
                        var12.a(4, var12.field_Db);
                        break L4;
                      } else {
                        L12: {
                          var12.field_xb[var18_int] = new qr(0L, (qr) null);
                          if (0 != (var14 & 1 << var18_int + ml.field_j)) {
                            var12.field_Mb.a(4, var12.field_xb[var18_int]);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var12.field_xb[var18_int].field_G = 1;
                        var18_int++;
                        continue L10;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L13: {
                  if (!var12.field_Ab) {
                    stackOut_35_0 = param2;
                    stackIn_36_0 = stackOut_35_0;
                    break L13;
                  } else {
                    stackOut_34_0 = param3;
                    stackIn_36_0 = stackOut_34_0;
                    break L13;
                  }
                }
                var14 = stackIn_36_0;
                var12.field_Ub.field_z = null;
                var12.field_Ub.field_mb = 0;
                var46 = var12.field_Ub;
                var46.field_K = 0;
                var12.field_Db.field_z = null;
                var12.field_Db.field_mb = 0;
                var47 = var12.field_Db;
                var47.field_K = 0;
                var12.field_Pb.field_z = null;
                var48 = var12.field_Pb;
                var12.field_Pb.field_mb = 0;
                var12.field_Rb.field_z = null;
                var48.field_K = 0;
                var12.field_Rb.field_mb = 0;
                var18 = var12.field_Rb;
                var18.field_K = 0;
                var12.field_Wb.field_z = null;
                var12.field_Wb.field_mb = 0;
                var19 = var12.field_Wb;
                var19.field_K = 0;
                var12.field_Ib.field_z = null;
                var20 = var12.field_Ib;
                var12.field_Ib.field_mb = 0;
                var20.field_K = 0;
                var12.field_Mb.field_z = null;
                var21 = var12.field_Mb;
                var12.field_Mb.field_mb = 0;
                var21.field_K = 0;
                var22_int = 0;
                L14: while (true) {
                  if (em.field_k <= var22_int) {
                    L15: {
                      var12.field_Bb.field_pb = null;
                      var12.field_Bb.field_mb = 0;
                      var22 = var12.field_Bb;
                      var12.field_Kb.field_pb = null;
                      var22.field_K = 0;
                      var12.field_Kb.field_mb = 0;
                      var49 = var12.field_Kb;
                      var12.field_oc.field_pb = null;
                      var49.field_K = 0;
                      var24 = var12.field_oc;
                      var12.field_oc.field_mb = 0;
                      var12.field_ac.field_pb = null;
                      var24.field_K = 0;
                      var25 = var12.field_ac;
                      var12.field_ac.field_mb = 0;
                      var25.field_K = 0;
                      var12.field_Ob.field_z = null;
                      var26 = var12.field_Ob;
                      var12.field_Ob.field_mb = 0;
                      var12.field_Tb.field_z = null;
                      var26.field_K = 0;
                      var12.field_Tb.field_mb = 0;
                      var27 = var12.field_Tb;
                      var12.field_Sb.field_z = null;
                      var27.field_K = 0;
                      var12.field_Sb.field_mb = 0;
                      var28 = var12.field_Sb;
                      var12.field_Hb.field_z = null;
                      var28.field_K = 0;
                      var12.field_Hb.field_mb = 0;
                      var29 = var12.field_Hb;
                      var29.field_K = 0;
                      var12.field_ic.field_z = null;
                      var12.field_ic.field_mb = 0;
                      var30 = var12.field_ic;
                      var30.field_K = 0;
                      var12.field_K = qs.field_y.field_xb.field_K;
                      var31 = 0;
                      var32 = var12.field_Xb;
                      if (!var12.f((byte) -78)) {
                        L16: {
                          if (!var12.field_Ab) {
                            L17: {
                              if (var12.field_cc) {
                                break L17;
                              } else {
                                if (!var12.field_Jb) {
                                  if (!var12.field_Qb) {
                                    var12.field_Ub.field_z = ng.field_b;
                                    break L16;
                                  } else {
                                    var12.field_Ub.field_z = lq.field_r;
                                    break L16;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var12.field_Db.field_z = qn.field_a;
                            break L16;
                          } else {
                            if (var12.field_lc >= 0) {
                              var12.field_Ub.field_z = co.field_q;
                              break L16;
                            } else {
                              L18: {
                                if (!var12.field_mc) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var12.field_cc) {
                                      break L19;
                                    } else {
                                      if (var12.field_Jb) {
                                        break L19;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var12.field_Db.field_z = qn.field_a;
                                  break L16;
                                }
                              }
                              if (2 != var12.field_Fb) {
                                var12.field_Ub.field_z = tc.field_F;
                                break L16;
                              } else {
                                var12.field_Db.field_z = ro.field_d;
                                break L16;
                              }
                            }
                          }
                        }
                        L20: {
                          if (var12.field_Db.field_z == null) {
                            var12.field_Ub.a(68, cr.field_c, (byte) 48, var31, 0);
                            break L20;
                          } else {
                            var12.field_Db.a(68, cr.field_c, (byte) 72, var31, 0);
                            break L20;
                          }
                        }
                        L21: {
                          var12.field_Pb.field_z = nq.a(var12.field_Pb.field_nb, var32, 78);
                          var12.field_Pb.a(78, cr.field_c, (byte) 85, var31, 70);
                          if (!var12.field_Pb.field_L) {
                            break L21;
                          } else {
                            if (var12.field_Pb.field_z.equals(var32)) {
                              break L21;
                            } else {
                              dn.field_k = var32;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var12.field_Rb.field_z = Integer.toString(var12.field_Lb);
                          if (var12.field_mc) {
                            var12.field_Wb.field_z = "/" + var12.field_Eb;
                            var12.field_Rb.field_y = 2;
                            var33_int = (348 + -var12.field_Wb.field_nb.c("/")) / 2;
                            var12.field_Rb.a(var33_int + -150, cr.field_c, (byte) 83, var31, 150);
                            var12.field_Wb.a(-var33_int + 198, cr.field_c, (byte) 84, var31, var33_int);
                            break L22;
                          } else {
                            var12.field_Rb.field_y = 1;
                            var12.field_Rb.a(48, cr.field_c, (byte) 108, var31, 150);
                            break L22;
                          }
                        }
                        L23: {
                          var12.field_Ib.field_z = Integer.toString(var12.field_Zb);
                          var12.field_Ib.a(48, cr.field_c, (byte) 47, var31, 200);
                          if (!ns.field_pb) {
                            stackOut_70_0 = 200;
                            stackIn_71_0 = stackOut_70_0;
                            break L23;
                          } else {
                            stackOut_69_0 = 250;
                            stackIn_71_0 = stackOut_69_0;
                            break L23;
                          }
                        }
                        L24: {
                          var33_int = stackIn_71_0;
                          var12.field_Mb.a(-2 + (365 + -var33_int), cr.field_c, (byte) 46, var31, var33_int);
                          var34_int = qo.field_b;
                          if ((var14 & 1 << cp.field_q) == 0) {
                            break L24;
                          } else {
                            var50_ref = uk.field_b[var12.field_nc];
                            var12.field_Bb.field_pb = var50_ref;
                            var12.field_Bb.a(var50_ref.field_o, var12.field_Mb.field_mb, (byte) 111, 0, var34_int);
                            var34_int = var34_int + (var50_ref.field_o - -qo.field_b);
                            break L24;
                          }
                        }
                        L25: {
                          if ((var14 & 1 << vr.field_g) == 0) {
                            break L25;
                          } else {
                            L26: {
                              if (!var12.field_cc) {
                                if (var12.field_Jb) {
                                  stackOut_78_0 = 1;
                                  stackIn_80_0 = stackOut_78_0;
                                  break L26;
                                } else {
                                  stackOut_77_0 = 0;
                                  stackIn_80_0 = stackOut_77_0;
                                  break L26;
                                }
                              } else {
                                stackOut_75_0 = 1;
                                stackIn_80_0 = stackOut_75_0;
                                break L26;
                              }
                            }
                            L27: {
                              var36 = stackIn_80_0;
                              stackOut_80_0 = ji.field_E;
                              stackIn_82_0 = stackOut_80_0;
                              stackIn_81_0 = stackOut_80_0;
                              if (var36 == 0) {
                                stackOut_82_0 = (bi[]) ((Object) stackIn_82_0);
                                stackOut_82_1 = 0;
                                stackIn_83_0 = stackOut_82_0;
                                stackIn_83_1 = stackOut_82_1;
                                break L27;
                              } else {
                                stackOut_81_0 = (bi[]) ((Object) stackIn_81_0);
                                stackOut_81_1 = 1;
                                stackIn_83_0 = stackOut_81_0;
                                stackIn_83_1 = stackOut_81_1;
                                break L27;
                              }
                            }
                            var51_ref = stackIn_83_0[stackIn_83_1];
                            var12.field_oc.field_pb = var51_ref;
                            var12.field_oc.a(var51_ref.field_o, var12.field_Mb.field_mb, (byte) 124, 0, var34_int);
                            var34_int = var34_int + (qo.field_b + var51_ref.field_o);
                            break L25;
                          }
                        }
                        L28: {
                          if (0 == (1 << kf.field_i & var14)) {
                            break L28;
                          } else {
                            var52_ref = j.field_s[-1 + var12.field_Fb];
                            var12.field_ac.field_pb = var52_ref;
                            var12.field_ac.a(var52_ref.field_o, var12.field_Mb.field_mb, (byte) 41, 0, var34_int);
                            var34_int = var34_int + (qo.field_b + var52_ref.field_o);
                            break L28;
                          }
                        }
                        L29: {
                          if (-1 == (1 << v.field_e & var14 ^ -1)) {
                            break L29;
                          } else {
                            L30: {
                              stackOut_87_0 = tf.field_l;
                              stackIn_89_0 = stackOut_87_0;
                              stackIn_88_0 = stackOut_87_0;
                              if (var12.field_ec) {
                                stackOut_89_0 = (bi[]) ((Object) stackIn_89_0);
                                stackOut_89_1 = 1;
                                stackIn_90_0 = stackOut_89_0;
                                stackIn_90_1 = stackOut_89_1;
                                break L30;
                              } else {
                                stackOut_88_0 = (bi[]) ((Object) stackIn_88_0);
                                stackOut_88_1 = 0;
                                stackIn_90_0 = stackOut_88_0;
                                stackIn_90_1 = stackOut_88_1;
                                break L30;
                              }
                            }
                            var53_ref = stackIn_90_0[stackIn_90_1];
                            var12.field_Kb.field_pb = var53_ref;
                            var12.field_Kb.a(var53_ref.field_o, var12.field_Mb.field_mb, (byte) 127, 0, var34_int);
                            var34_int = var34_int + (qo.field_b + var53_ref.field_o);
                            break L29;
                          }
                        }
                        L31: {
                          if (null != ln.field_O) {
                            var36 = 0;
                            L32: while (true) {
                              if (var36 >= em.field_k) {
                                break L31;
                              } else {
                                if (ln.field_O[var36] != null) {
                                  L33: {
                                    if (0 != (var14 & 1 << var36 + ml.field_j)) {
                                      var42 = ln.field_O[var36][var12.field_dc[var36] & 255];
                                      var54 = var42;
                                      var12.field_xb[var36].field_pb = var42;
                                      var12.field_xb[var36].a(var54.field_o, var12.field_Mb.field_mb, (byte) 92, 0, var34_int);
                                      var34_int = var34_int + (qo.field_b + var54.field_o);
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                  var36++;
                                  continue L32;
                                } else {
                                  var36++;
                                  continue L32;
                                }
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        L34: {
                          var36 = (-var34_int + var12.field_Mb.field_K) / 2;
                          if (0 < var36) {
                            var12.field_Bb.field_hb = var12.field_Bb.field_hb + var36;
                            var12.field_oc.field_hb = var12.field_oc.field_hb + var36;
                            var12.field_ac.field_hb = var12.field_ac.field_hb + var36;
                            var12.field_Kb.field_hb = var12.field_Kb.field_hb + var36;
                            var37_int = 0;
                            L35: while (true) {
                              if (em.field_k <= var37_int) {
                                break L34;
                              } else {
                                var12.field_xb[var37_int].field_hb = var12.field_xb[var37_int].field_hb + var36;
                                var37_int++;
                                continue L35;
                              }
                            }
                          } else {
                            break L34;
                          }
                        }
                        L36: {
                          if (!var12.field_Ab) {
                            break L36;
                          } else {
                            L37: {
                              var37_int = var12.field_lc;
                              if ((var37_int ^ -1) <= -1) {
                                break L37;
                              } else {
                                var37_int = (int)(var9 + -var12.field_Gb);
                                break L37;
                              }
                            }
                            var38_int = var37_int / 1000;
                            var39 = var38_int / 60;
                            var38_int = var38_int % 60;
                            if (-61 < (var39 ^ -1)) {
                              var12.field_Ob.field_z = var39 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            } else {
                              var40 = var39 / 60;
                              var39 = var39 % 60;
                              var12.field_Ob.field_z = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            }
                          }
                        }
                        L38: {
                          var12.field_Ob.a(var12.field_K - 365, cr.field_c, (byte) 57, var31, 365);
                          var31 = var31 + cr.field_c;
                          if (var12.field_jc == null) {
                            break L38;
                          } else {
                            var31 += 2;
                            var37 = new StringBuilder(64);
                            discarded$4 = var37.append(hl.field_H);
                            discarded$5 = var37.append(var12.field_jc[0]);
                            var38_int = 1;
                            L39: while (true) {
                              if (var38_int >= var12.field_Lb) {
                                var38 = var37.toString();
                                var12.field_Tb.field_z = var38;
                                var39 = var12.field_Tb.field_nb.a(var38, var12.field_K - 2 * var12.field_Tb.field_kb);
                                var12.field_Tb.a(var12.field_K, cr.field_c * var39, (byte) 73, var31, 0);
                                var31 = var31 + var39 * cr.field_c;
                                break L38;
                              } else {
                                discarded$6 = var37.append(", ");
                                discarded$7 = var37.append(var12.field_jc[var38_int]);
                                var38_int++;
                                continue L39;
                              }
                            }
                          }
                        }
                        L40: {
                          if (!var12.field_Jb) {
                            break L40;
                          } else {
                            var12.field_Sb.field_z = re.a(tq.field_a, 4371, new String[]{var32});
                            var12.field_Sb.a(var12.field_K - tg.field_a * 2, cr.field_c, (byte) 80, var31, tg.field_a);
                            var31 = var31 + cr.field_c;
                            break L40;
                          }
                        }
                        if (var12.field_Yb) {
                          var12.field_Hb.field_z = re.a(wj.field_n, 4371, new String[]{var32});
                          var12.field_Hb.a(-(2 * tg.field_a) + var12.field_K, cr.field_c, (byte) 91, var31, tg.field_a);
                          var31 = var31 + cr.field_c;
                          break L15;
                        } else {
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L41: {
                      var33 = fi.a(var12.field_hc, -11, var32);
                      if (var33 == null) {
                        break L41;
                      } else {
                        var34_int = var12.field_ic.field_nb.a(var33, -tg.field_a + -tg.field_a + var12.field_K);
                        var12.field_ic.field_z = var33;
                        var12.field_ic.field_I = 256 * var12.field_Nb / ks.field_i;
                        var12.field_ic.a(var12.field_K + -(tg.field_a * 2), cr.field_c * var34_int, (byte) 112, var31, tg.field_a);
                        var31 = var31 + var34_int * cr.field_c;
                        break L41;
                      }
                    }
                    L42: {
                      if (var7_int == 0) {
                        var12.field_gb = -var12.field_mb + var31;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    L43: {
                      if (var13 != 0) {
                        qs.field_y.field_xb.a(2, (qr) (var11), var12, (byte) 65);
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    var34_int = 0;
                    L44: while (true) {
                      if (em.field_k <= var34_int) {
                        L45: {
                          if (var12.field_Bb.field_L) {
                            L46: {
                              if ((var12.field_nc ^ -1) == -2) {
                                var34 = va.field_i;
                                break L46;
                              } else {
                                var34 = mk.field_e[var12.field_nc];
                                break L46;
                              }
                            }
                            dn.field_k = vl.field_r + " - " + var34;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        L47: {
                          if (!var12.field_Kb.field_L) {
                            break L47;
                          } else {
                            L48: {
                              if (!var12.field_ec) {
                                stackOut_152_0 = ek.field_G;
                                stackIn_153_0 = stackOut_152_0;
                                break L48;
                              } else {
                                stackOut_151_0 = le.field_c;
                                stackIn_153_0 = stackOut_151_0;
                                break L48;
                              }
                            }
                            dn.field_k = stackIn_153_0;
                            break L47;
                          }
                        }
                        L49: {
                          if (var12.field_oc.field_L) {
                            L50: {
                              L51: {
                                if (var12.field_cc) {
                                  break L51;
                                } else {
                                  if (!var12.field_Jb) {
                                    if (var12.field_mc) {
                                      stackOut_162_0 = nr.field_o;
                                      stackIn_163_0 = stackOut_162_0;
                                      break L50;
                                    } else {
                                      stackOut_161_0 = ls.field_d;
                                      stackIn_163_0 = stackOut_161_0;
                                      break L50;
                                    }
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              stackOut_159_0 = ns.field_qb;
                              stackIn_163_0 = stackOut_159_0;
                              break L50;
                            }
                            dn.field_k = stackIn_163_0;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L52: {
                          if (!var12.field_ac.field_L) {
                            break L52;
                          } else {
                            L53: {
                              if (-3 == (var12.field_Fb ^ -1)) {
                                stackOut_167_0 = we.field_d;
                                stackIn_168_0 = stackOut_167_0;
                                break L53;
                              } else {
                                stackOut_166_0 = wd.field_K;
                                stackIn_168_0 = stackOut_166_0;
                                break L53;
                              }
                            }
                            dn.field_k = stackIn_168_0;
                            break L52;
                          }
                        }
                        L54: {
                          if (var12.field_rb == 0) {
                            break L54;
                          } else {
                            if (var12.f((byte) -78)) {
                              break L54;
                            } else {
                              if (var12.field_Db.field_rb != 0) {
                                L55: {
                                  if (!var12.field_Ab) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (!var12.field_mc) {
                                        break L56;
                                      } else {
                                        if (var12.field_cc) {
                                          break L55;
                                        } else {
                                          if (!var12.field_Jb) {
                                            break L56;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    os.a(var12.g(-121), param4, true);
                                    break L54;
                                  }
                                }
                                sq.a(-57, param4, var12.g(-103));
                                break L54;
                              } else {
                                aj.a(param6, (byte) -100, var12, var32);
                                break L54;
                              }
                            }
                          }
                        }
                        var12 = (fb) ((Object) var8.a((byte) -71));
                        continue L3;
                      } else {
                        L57: {
                          if (var12.field_xb[var34_int].field_L) {
                            L58: {
                              if (null == ei.field_f) {
                                var35 = null;
                                break L58;
                              } else {
                                if (ei.field_f[var34_int] != null) {
                                  var35 = ei.field_f[var34_int][var12.field_dc[var34_int] & 255];
                                  break L58;
                                } else {
                                  var35 = null;
                                  break L58;
                                }
                              }
                            }
                            if (var35 == null) {
                              dn.field_k = gm.field_l[var34_int];
                              break L57;
                            } else {
                              dn.field_k = gm.field_l[var34_int] + " - " + (String) (var35);
                              break L57;
                            }
                          } else {
                            break L57;
                          }
                        }
                        var34_int++;
                        continue L44;
                      }
                    }
                  } else {
                    var12.field_xb[var22_int].field_pb = null;
                    var23 = var12.field_xb[var22_int];
                    var12.field_xb[var22_int].field_mb = 0;
                    var23.field_K = 0;
                    var22_int++;
                    continue L14;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var7), "ga.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final synchronized void c(int param0, int param1) {
        this.field_H = param1;
        if (param0 != 598) {
            this.a(-76, -5, true, 106);
        }
    }

    final static void a(nk[] param0, int param1, bc param2, int[] param3, bi[][] param4, String[] param5, int param6, bc param7, byte[] param8, String[][] param9, bc param10, byte[] param11, boolean param12, String[][] param13, int param14, int[] param15, bi[][] param16) {
        RuntimeException var17 = null;
        String[] var18 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        try {
          L0: {
            L1: {
              var18 = (String[]) null;
              ur.a(param4, param1, param8, param12, param10, param15, param16, param5, (String[]) null, -82, param11, param7, param2, param0, param13, 1, param9, param3, param6);
              if (param14 == 16384) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var17);
            stackOut_3_1 = new StringBuilder().append("ga.DA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param6).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param7 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          L8: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param8 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param9 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param10 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param11 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param12).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param13 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          L13: {
            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param14).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param15 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L13;
            }
          }
          L14: {
            stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param16 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L14;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        boolean discarded$0 = false;
        this.field_x.d();
        if (param0 != 16384) {
            discarded$0 = this.h(18);
        }
        this.field_z = null;
        this.a(-1, param1);
    }

    private final void b(int param0, byte param1) {
        qq var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = (qq) ((Object) this.field_l.field_n.d(0));
        if (param1 == 68) {
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if ((param0 ^ -1) > -1) {
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
                        this.field_l.field_o.a(var3.field_K);
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
                  if (-1 >= (var3.field_E ^ -1)) {
                    break L5;
                  } else {
                    this.field_N[var3.field_y][var3.field_H] = null;
                    break L5;
                  }
                }
                var3.b((byte) -60);
                break L1;
              }
              var3 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, int param1) {
        qq var3 = null;
        int var4 = 0;
        qq var5 = null;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            var5 = (qq) null;
            this.a(72, (qq) null, true);
            break L0;
          }
        }
        L1: {
          if ((2 & this.field_F[param1]) != 0) {
            var3 = (qq) ((Object) this.field_l.field_n.d(0));
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                L3: {
                  if (var3.field_y != param1) {
                    break L3;
                  } else {
                    if (null == this.field_N[param1][var3.field_H]) {
                      if (var3.field_E >= 0) {
                        break L3;
                      } else {
                        var3.field_E = 0;
                        break L3;
                      }
                    } else {
                      var3 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
                      continue L2;
                    }
                  }
                }
                var3 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        ij.a(3974311, param4, true, param2, param0, param1);
        if (param3 > -57) {
            ga.a((nk[]) null, 95, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, -102, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, 52, (int[]) null, (bi[][]) null);
        }
    }

    final synchronized void a(gh param0, byte param1, boolean param2) {
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
              this.a(param2, param0, 114, true);
              if (param1 == 101) {
                break L1;
              } else {
                this.field_n = -99L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ga.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_x.f()) {
                  var4_int = this.field_x.field_e * this.field_M / ap.field_j;
                  L3: while (true) {
                    var5 = this.field_O - -((long)param2 * (long)var4_int);
                    if (0L <= this.field_n - var5) {
                      this.field_O = var5;
                      break L2;
                    } else {
                      var7 = (int)((-this.field_O + (this.field_n - (-(long)var4_int - -1L))) / (long)var4_int);
                      this.field_O = this.field_O + (long)var7 * (long)var4_int;
                      this.field_l.b(param0, param1, var7);
                      param1 = param1 + var7;
                      param2 = param2 - var7;
                      this.a((byte) -64);
                      if (this.field_x.f()) {
                        continue L3;
                      } else {
                        this.field_l.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              this.field_l.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ga.G(");
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        tn discarded$1 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (-1 < (param1 ^ -1)) {
          param1 = 0;
          L0: while (true) {
            if (-17 >= (param1 ^ -1)) {
              return;
            } else {
              this.a((byte) -63, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          L1: {
            this.field_y[param1] = 12800;
            this.field_G[param1] = 8192;
            if (param0 == -63) {
              break L1;
            } else {
              discarded$1 = this.d();
              break L1;
            }
          }
          this.field_s[param1] = 16383;
          this.field_T[param1] = 8192;
          this.field_p[param1] = 0;
          this.field_J[param1] = 8192;
          this.a(true, param1);
          this.d(0, param1);
          this.field_F[param1] = 0;
          this.field_q[param1] = 32767;
          this.field_r[param1] = 256;
          this.field_t[param1] = 0;
          this.a(70, 8192, param1);
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param1) {
            this.a(-1, 2);
        } else {
            this.b(-1, (byte) 68);
        }
        this.a((byte) -63, param0);
        for (var3 = 0; var3 < 16; var3++) {
            this.field_I[var3] = this.field_m[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (16 > var5) {
            this.field_P[var5] = we.a(this.field_m[var5], -128);
            var5++;
        }
    }

    final boolean a(byte param0, qq param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
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
            if (param1.field_K == null) {
              L1: {
                if (-1 < (param1.field_E ^ -1)) {
                  break L1;
                } else {
                  param1.b((byte) -114);
                  if (-1 <= (param1.field_z ^ -1)) {
                    break L1;
                  } else {
                    if (param1 != this.field_K[param1.field_y][param1.field_z]) {
                      break L1;
                    } else {
                      this.field_K[param1.field_y][param1.field_z] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = -106 % ((param0 - 64) / 53);
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ga.UA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
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
        var3 = 97 % ((-65 - param1) / 35);
        var4 = 240 & param0;
        if (128 == var4) {
          var5 = 15 & param0;
          var6 = (32672 & param0) >> -328733080;
          var7 = (8354916 & param0) >> 539580336;
          this.a((byte) 29, var7, var5, var6);
          return;
        } else {
          if (144 != var4) {
            if ((var4 ^ -1) != -161) {
              if ((var4 ^ -1) == -177) {
                L0: {
                  var5 = 15 & param0;
                  var6 = 127 & param0 >> 1346115592;
                  var7 = 127 & param0 >> 1562758128;
                  if (var6 != 0) {
                    break L0;
                  } else {
                    this.field_P[var5] = (var7 << 1687823918) + we.a(-2080769, this.field_P[var5]);
                    break L0;
                  }
                }
                L1: {
                  if (var6 != 32) {
                    break L1;
                  } else {
                    this.field_P[var5] = (var7 << -1009531001) + we.a(-16257, this.field_P[var5]);
                    break L1;
                  }
                }
                L2: {
                  if (var6 != 1) {
                    break L2;
                  } else {
                    this.field_p[var5] = we.a(-16257, this.field_p[var5]) + (var7 << 1703605415);
                    break L2;
                  }
                }
                L3: {
                  if (33 != var6) {
                    break L3;
                  } else {
                    this.field_p[var5] = var7 + we.a(this.field_p[var5], -128);
                    break L3;
                  }
                }
                L4: {
                  if ((var6 ^ -1) != -6) {
                    break L4;
                  } else {
                    this.field_J[var5] = we.a(-16257, this.field_J[var5]) - -(var7 << -1415207577);
                    break L4;
                  }
                }
                L5: {
                  if (37 != var6) {
                    break L5;
                  } else {
                    this.field_J[var5] = var7 + we.a(this.field_J[var5], -128);
                    break L5;
                  }
                }
                L6: {
                  if (-8 == (var6 ^ -1)) {
                    this.field_y[var5] = (var7 << 72489447) + we.a(-16257, this.field_y[var5]);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (39 == var6) {
                    this.field_y[var5] = we.a(-128, this.field_y[var5]) - -var7;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var6 == 10) {
                    this.field_G[var5] = (var7 << 1673748071) + we.a(this.field_G[var5], -16257);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (42 == var6) {
                    this.field_G[var5] = we.a(this.field_G[var5], -128) - -var7;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var6 != 11) {
                    break L10;
                  } else {
                    this.field_s[var5] = (var7 << 1280189543) + we.a(-16257, this.field_s[var5]);
                    break L10;
                  }
                }
                L11: {
                  if (-44 != (var6 ^ -1)) {
                    break L11;
                  } else {
                    this.field_s[var5] = var7 + we.a(this.field_s[var5], -128);
                    break L11;
                  }
                }
                L12: {
                  if (var6 == 64) {
                    if (-65 < (var7 ^ -1)) {
                      this.field_F[var5] = we.a(this.field_F[var5], -2);
                      break L12;
                    } else {
                      this.field_F[var5] = ee.a(this.field_F[var5], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (-66 == (var6 ^ -1)) {
                    if (var7 < 64) {
                      this.a(true, var5);
                      this.field_F[var5] = we.a(this.field_F[var5], -3);
                      break L13;
                    } else {
                      this.field_F[var5] = ee.a(this.field_F[var5], 2);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (-100 == (var6 ^ -1)) {
                    this.field_q[var5] = (var7 << 320420743) + we.a(127, this.field_q[var5]);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (98 == var6) {
                    this.field_q[var5] = var7 + we.a(16256, this.field_q[var5]);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (-102 == (var6 ^ -1)) {
                    this.field_q[var5] = we.a(this.field_q[var5], 127) + (16384 + (var7 << 1291856647));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if ((var6 ^ -1) == -101) {
                    this.field_q[var5] = 16384 + (we.a(this.field_q[var5], 16256) + var7);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (-121 != (var6 ^ -1)) {
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
                  if (-124 != (var6 ^ -1)) {
                    break L20;
                  } else {
                    this.a(var5, 2);
                    break L20;
                  }
                }
                L21: {
                  if (-7 != (var6 ^ -1)) {
                    break L21;
                  } else {
                    var8 = this.field_q[var5];
                    if ((var8 ^ -1) == -16385) {
                      this.field_r[var5] = we.a(this.field_r[var5], -16257) + (var7 << 1832420935);
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
                    var8 = this.field_q[var5];
                    if (var8 != 16384) {
                      break L22;
                    } else {
                      this.field_r[var5] = var7 + we.a(this.field_r[var5], -128);
                      break L22;
                    }
                  }
                }
                L23: {
                  if ((var6 ^ -1) != -17) {
                    break L23;
                  } else {
                    this.field_t[var5] = (var7 << -144902265) + we.a(this.field_t[var5], -16257);
                    break L23;
                  }
                }
                L24: {
                  if ((var6 ^ -1) != -49) {
                    break L24;
                  } else {
                    this.field_t[var5] = we.a(this.field_t[var5], -128) - -var7;
                    break L24;
                  }
                }
                L25: {
                  if (81 != var6) {
                    break L25;
                  } else {
                    if (-65 < (var7 ^ -1)) {
                      this.d(0, var5);
                      this.field_F[var5] = we.a(this.field_F[var5], -5);
                      break L25;
                    } else {
                      this.field_F[var5] = ee.a(this.field_F[var5], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (var6 != 17) {
                    break L26;
                  } else {
                    this.a(-72, (var7 << 576861319) + (-16257 & this.field_E[var5]), var5);
                    break L26;
                  }
                }
                L27: {
                  if (var6 == 49) {
                    this.a(46, (this.field_E[var5] & -128) - -var7, var5);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                if (-193 == (var4 ^ -1)) {
                  var5 = param0 & 15;
                  var6 = (32569 & param0) >> -1084866744;
                  this.a(var5, this.field_P[var5] - -var6, (byte) 119);
                  return;
                } else {
                  if ((var4 ^ -1) == -209) {
                    var5 = param0 & 15;
                    var6 = param0 >> -242097656 & 127;
                    this.a(var5, (byte) 98, var6);
                    return;
                  } else {
                    if (224 == var4) {
                      var5 = 15 & param0;
                      var6 = (127 & param0 >> 1711093192) + (param0 >> 1341813865 & 16256);
                      this.b(var5, (byte) -34, var6);
                      return;
                    } else {
                      var4 = param0 & 255;
                      if ((var4 ^ -1) == -256) {
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
              var6 = param0 >> 493943080 & 127;
              var7 = (param0 & 8368783) >> 762365424;
              this.a(var5, var7, true, var6);
              return;
            }
          } else {
            var5 = param0 & 15;
            var6 = param0 >> 98725160 & 127;
            var7 = 127 & param0 >> -318801456;
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

    final static void g(int param0) {
        if (param0 != 14745) {
            field_L = (String) null;
        }
        jq.field_d = null;
        rs.field_Fb = -1;
        sc.field_q = false;
        ra.field_g = -1;
        rq.field_e = 0;
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        if (!param2) {
            this.field_u = (int[]) null;
        }
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(16384, param3);
              this.field_x.a(param1.field_h);
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
            ((ga) (this)).field_v = stackIn_4_1 != 0;
            this.field_O = 0L;
            var5_int = this.field_x.c();
            var6 = 0;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  this.field_C = this.field_x.g();
                  this.field_D = this.field_x.field_b[this.field_C];
                  this.field_n = this.field_x.c(this.field_D);
                  if (param2 >= 32) {
                    break L3;
                  } else {
                    this.b(-59, true);
                    break L3;
                  }
                }
                break L0;
              } else {
                this.field_x.b(var6);
                this.field_x.d(var6);
                this.field_x.e(var6);
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("ga.W(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized tn d() {
        return null;
    }

    private final void d(int param0, int param1) {
        qq var3 = null;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((4 & this.field_F[param1]) != param0) {
            var3 = (qq) ((Object) this.field_l.field_n.d(0));
            while (var3 != null) {
                if (!(var3.field_y != param1)) {
                    var3.field_j = 0;
                }
                var3 = (qq) ((Object) this.field_l.field_n.a((byte) -71));
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
        br var12 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qq stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qq stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qq stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qq stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qq stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qq stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          this.a((byte) 29, 64, param1, param0);
          if (0 == (this.field_F[param1] & 2)) {
            break L0;
          } else {
            var5 = (qq) ((Object) this.field_l.field_n.f(3725));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_y != param1) {
                    break L2;
                  } else {
                    if ((var5.field_E ^ -1) <= -1) {
                      break L2;
                    } else {
                      this.field_N[param1][var5.field_H] = null;
                      this.field_N[param1][param0] = var5;
                      var6_int = (var5.field_G * var5.field_r >> -771862196) + var5.field_J;
                      var5.field_J = var5.field_J + (-var5.field_H + param0 << 2079003016);
                      var5.field_G = 4096;
                      var5.field_r = -var5.field_J + var6_int;
                      var5.field_H = param0;
                      return;
                    }
                  }
                }
                var5 = (qq) ((Object) this.field_l.field_n.b(-123));
                continue L1;
              }
            }
          }
        }
        var11 = (br) ((Object) this.field_Q.a((long)this.field_I[param1], -25064));
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_h[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new qq();
              var7.field_y = param1;
              var7.field_A = var12;
              var7.field_M = var6;
              var7.field_u = var11.field_j[param0];
              var7.field_z = var11.field_r[param0];
              var7.field_H = param0;
              var7.field_k = var11.field_s[param0] * param2 * param2 * var12.field_q - -1024 >> 479233579;
              var7.field_q = var11.field_t[param0] & 255;
              var8 = 26 % ((3 - param3) / 39);
              var7.field_J = (param0 << 1294558216) + -(var11.field_k[param0] & 32767);
              var7.field_B = 0;
              var7.field_E = -1;
              var7.field_F = 0;
              var7.field_h = 0;
              var7.field_v = 0;
              if (this.field_t[param1] != 0) {
                L4: {
                  var7.field_K = al.a(var6, this.b(var7, (byte) -123), 0, this.a(var7, (byte) 120));
                  stackOut_15_0 = this;
                  stackOut_15_1 = -2139009338;
                  stackOut_15_2 = (qq) (var7);
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if ((var12.field_k[param0] ^ -1) <= -1) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (qq) ((Object) stackIn_17_2);
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (qq) ((Object) stackIn_16_2);
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                this.a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              } else {
                var7.field_K = al.a(var6, this.b(var7, (byte) -6), this.a(var7, -1481279096), this.a(var7, (byte) 124));
                break L3;
              }
            }
            L5: {
              if (0 > var12.field_k[param0]) {
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
                  var9 = this.field_K[param1][var7.field_z];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (0 > var9.field_E) {
                      this.field_N[param1][var9.field_H] = null;
                      var9.field_E = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_K[param1][var7.field_z] = var7;
                break L6;
              }
            }
            this.field_l.field_n.a((byte) -113, var7);
            this.field_N[param1][param0] = var7;
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
        int stackIn_9_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
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
                    if (this.field_K[param3.field_y][param3.field_z] != param3) {
                      break L3;
                    } else {
                      this.field_K[param3.field_y][param3.field_z] = null;
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
              var6_int = param3.field_G;
              if ((var6_int ^ -1) < -1) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)this.field_J[param3.field_y] * 0.0004921259842519685) * 16.0 + 0.5);
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
              var9 = 0.000005086263020833333 * (double)((-60 + param3.field_H << -1725115960) + (param3.field_G * param3.field_r >> 1049960876));
              if ((var7.field_h ^ -1) >= -1) {
                break L6;
              } else {
                L7: {
                  if ((var7.field_a ^ -1) >= -1) {
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
                  if ((var7.field_k ^ -1) < -1) {
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
                      if ((65280 & var7.field_n[2 + param3.field_B] << -882586360) >= param3.field_F) {
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
                    if (var7.field_n[1 + param3.field_B] == 0) {
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
              if (-1 < (param3.field_E ^ -1)) {
                break L12;
              } else {
                if (var7.field_e == null) {
                  break L12;
                } else {
                  if ((1 & this.field_F[param3.field_y]) == 0) {
                    L13: {
                      if (-1 < (param3.field_z ^ -1)) {
                        break L13;
                      } else {
                        if (this.field_K[param3.field_y][param3.field_z] == param3) {
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
                          if (param3.field_E <= (255 & var7.field_e[2 + param3.field_v]) << -506654296) {
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
              param3.field_K.a(param3.field_p, this.a(param3, -1481279096), this.a(param3, (byte) 122));
              stackOut_65_0 = 0;
              stackIn_66_0 = stackOut_65_0;
              decompiledRegionSelector0 = 2;
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
                  this.field_l.field_o.a(param3.field_K);
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
                  if ((param3.field_z ^ -1) >= -1) {
                    break L20;
                  } else {
                    if (this.field_K[param3.field_y][param3.field_z] == param3) {
                      this.field_K[param3.field_y][param3.field_z] = null;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
              stackOut_61_0 = 1;
              stackIn_62_0 = stackOut_61_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) (var6);
            stackOut_67_1 = new StringBuilder().append("ga.C(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          L22: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L22;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L22;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_62_0 != 0;
          } else {
            return stackIn_66_0 != 0;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = -35 / ((51 - param2) / 61);
        if (!(param1 == this.field_I[param0])) {
            this.field_I[param0] = param1;
            for (var5 = 0; 128 > var5; var5++) {
                this.field_K[param0][var5] = null;
            }
        }
    }

    public static void d(int param0) {
        if (param0 != -17876) {
            field_o = (String) null;
        }
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
              if (param1 > 114) {
                break L1;
              } else {
                this.field_u = (int[]) null;
                break L1;
              }
            }
            var3_int = this.field_G[param0.field_y];
            if (var3_int < 8192) {
              stackOut_5_0 = 32 + param0.field_q * var3_int >> 1516527270;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (128 + -param0.field_q) * (-var3_int + 16384) >> -280536794) + 16384;
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
            stackOut_7_1 = new StringBuilder().append("ga.SA(");
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
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
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
          var2 = this.field_C;
          var3 = this.field_D;
          var4 = this.field_n;
          if (null == this.field_z) {
            break L0;
          } else {
            if (this.field_S == var3) {
              this.a(this.field_v, this.field_z, 33, this.field_B);
              this.a((byte) 109);
              return;
            } else {
              break L0;
            }
          }
        }
        var6 = -102 / ((-15 - param0) / 34);
        L1: while (true) {
          if (var3 != this.field_D) {
            L2: {
              this.field_C = var2;
              this.field_D = var3;
              this.field_n = var4;
              if (this.field_z == null) {
                break L2;
              } else {
                if (var3 > this.field_S) {
                  this.field_C = -1;
                  this.field_D = this.field_S;
                  this.field_n = this.field_x.c(this.field_D);
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
                if (this.field_x.field_b[var2] != var3) {
                  break L4;
                } else {
                  this.field_x.b(var2);
                  var7 = this.field_x.a(var2);
                  if (-2 != (var7 ^ -1)) {
                    L5: {
                      if ((var7 & 128) != 0) {
                        this.a(var7, (byte) -121);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_x.d(var2);
                    this.field_x.e(var2);
                    continue L3;
                  } else {
                    this.field_x.e();
                    this.field_x.e(var2);
                    if (this.field_x.a()) {
                      if (null == this.field_z) {
                        L6: {
                          if (!this.field_v) {
                            break L6;
                          } else {
                            if (-1 != (var3 ^ -1)) {
                              this.field_x.a(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(-1, true);
                        this.field_x.d();
                        return;
                      } else {
                        this.a(this.field_z, (byte) 101, this.field_v);
                        this.a((byte) 29);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              var2 = this.field_x.g();
              var3 = this.field_x.field_b[var2];
              var4 = this.field_x.c(var3);
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
        try {
          L0: {
            L1: {
              if (param0 == -2139009338) {
                break L1;
              } else {
                this.field_z = (gh) null;
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
                    var5 = (int)((long)this.field_t[param1.field_y] * (long)var6 >> -639684730);
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
              var5 = (int)((long)this.field_t[param1.field_y] * (long)var4_int >> -2139009338);
              break L2;
            }
            param1.field_K.h(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("ga.RA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final int a(qq param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        kc var10 = null;
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
            if (this.field_A[param0.field_y] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -1481279096) {
                L1: {
                  var9 = param0.field_u;
                  var10 = var9;
                  var4 = this.field_y[param0.field_y] * this.field_s[param0.field_y] + 4096 >> 2008746189;
                  var4 = var4 * var4 + 16384 >> -233436721;
                  var4 = param0.field_k * var4 + 16384 >> -432699537;
                  var4 = 128 + this.field_H * var4 >> 865651272;
                  var4 = this.field_A[param0.field_y] * var4 + 128 >> -1481279096;
                  if (-1 <= (var10.field_h ^ -1)) {
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
                        var7 = var9.field_n[param0.field_B] << 820391432 & 65280;
                        var8 = (255 & var10.field_n[2 + param0.field_B]) << -445601208;
                        var6 = var6 + (-var6 + var10.field_n[param0.field_B - -3]) * (-var7 + var5) / (-var7 + var8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 789886086;
                    break L2;
                  }
                }
                L4: {
                  if (-1 <= (param0.field_E ^ -1)) {
                    break L4;
                  } else {
                    if (var10.field_e != null) {
                      L5: {
                        var5 = param0.field_E;
                        var6 = var10.field_e[1 + param0.field_v];
                        if (var10.field_e.length + -2 <= param0.field_v) {
                          break L5;
                        } else {
                          var7 = (255 & var9.field_e[param0.field_v]) << -1558118488;
                          var8 = var10.field_e[2 + param0.field_v] << -1533511192 & 65280;
                          var6 = var6 + (var10.field_e[param0.field_v + 3] + -var6) * (-var7 + var5) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> 165727590;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_20_0 = var4;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 15;
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
            stackOut_22_1 = new StringBuilder().append("ga.PA(");
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
          throw r.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
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

    final synchronized void d(int param0, byte param1, int param2) {
        tn discarded$0 = null;
        this.c(param0, (byte) 113, param2);
        if (param1 != -110) {
            discarded$0 = this.b();
        }
    }

    final synchronized boolean h(int param0) {
        if (param0 != 5309) {
            field_L = (String) null;
        }
        return this.field_x.f();
    }

    public ga() {
        this.field_p = new int[16];
        this.field_t = new int[16];
        this.field_N = new qq[16][128];
        this.field_r = new int[16];
        this.field_H = 256;
        this.field_M = 1000000;
        this.field_q = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_G = new int[16];
        this.field_K = new qq[16][128];
        this.field_u = new int[16];
        this.field_I = new int[16];
        this.field_F = new int[16];
        this.field_s = new int[16];
        this.field_m = new int[16];
        this.field_J = new int[16];
        this.field_A = new int[16];
        this.field_T = new int[16];
        this.field_E = new int[16];
        this.field_x = new pi();
        this.field_l = new rc((ga) (this));
        this.field_Q = new ti(128);
        this.a((byte) -90, -1, 256);
        this.a(-1, true);
    }

    ga(ga param0) {
        this.field_p = new int[16];
        this.field_t = new int[16];
        this.field_N = new qq[16][128];
        this.field_r = new int[16];
        this.field_H = 256;
        this.field_M = 1000000;
        this.field_q = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_G = new int[16];
        this.field_K = new qq[16][128];
        this.field_u = new int[16];
        this.field_I = new int[16];
        this.field_F = new int[16];
        this.field_s = new int[16];
        this.field_m = new int[16];
        this.field_J = new int[16];
        this.field_A = new int[16];
        this.field_T = new int[16];
        this.field_E = new int[16];
        this.field_x = new pi();
        this.field_l = new rc((ga) (this));
        try {
            this.field_Q = param0.field_Q;
            this.a((byte) -75, -1, 256);
            this.a(-1, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Seriously offensive language";
        field_w = new byte[]{(byte)4, (byte)2, (byte) 0, (byte)2, (byte) 0};
    }
}
