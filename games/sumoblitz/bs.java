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
            this.a(false, (tv) null, -40);
        }
        return this.field_v.c();
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
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                this.field_T = (int[]) null;
                break L1;
              }
            }
            if (-1 != (this.field_y[param1.field_y] ^ -1)) {
              L2: {
                var9 = param1.field_w;
                var10 = var9;
                var4 = 4096 + this.field_T[param1.field_y] * this.field_w[param1.field_y] >> 1508202765;
                var4 = 16384 + var4 * var4 >> 1622959503;
                var4 = 16384 + param1.field_F * var4 >> -1884114673;
                var4 = 128 + this.field_r * var4 >> 269218088;
                var4 = var4 * this.field_y[param1.field_y] - -128 >> 2050093704;
                if (0 >= var10.field_i) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var10.field_i));
                  break L2;
                }
              }
              L3: {
                if (null == var10.field_g) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_G;
                    var6 = var10.field_g[param1.field_r + 1];
                    if ((param1.field_r ^ -1) <= (-2 + var10.field_g.length ^ -1)) {
                      break L4;
                    } else {
                      var7 = 65280 & var9.field_g[param1.field_r] << -2137375128;
                      var8 = var10.field_g[param1.field_r + 2] << -1169234744 & 65280;
                      var6 = var6 + (var5 + -var7) * (-var6 + var10.field_g[3 + param1.field_r]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> -570420186;
                  break L3;
                }
              }
              L5: {
                if (-1 <= (param1.field_x ^ -1)) {
                  break L5;
                } else {
                  if (var10.field_h == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param1.field_x;
                      var6 = var10.field_h[1 + param1.field_n];
                      if ((-2 + var10.field_h.length ^ -1) < (param1.field_n ^ -1)) {
                        var7 = (var9.field_h[param1.field_n] & 255) << 272916840;
                        var8 = 65280 & var10.field_h[param1.field_n + 2] << -750033848;
                        var6 = var6 + (var10.field_h[3 + param1.field_n] + -var6) * (-var7 + var5) / (var8 - var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 - -32 >> -2031878778;
                    break L5;
                  }
                }
              }
              stackIn_18_0 = var4;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("bs.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_18_0;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        uu var6 = null;
        int var7 = 0;
        uu var8 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Sumoblitz.field_L ? 1 : 0;
                    var8 = this.field_t[param3][param1];
                    if (var8 != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    this.field_t[param3][param1] = null;
                    if (-1 == (this.field_J[param3] & 2 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var6 = (uu) ((Object) this.field_s.field_t.b(param2 + -12866));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 == null) {
                        statePc = 12;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_15_0 = var8.field_y;
                    stackIn_6_0 = stackIn_15_0;
                    stackIn_15_1 = var6.field_y;
                    stackIn_6_1 = stackIn_15_1;
                    if (var7 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (stackIn_6_0 != stackIn_6_1) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var6.field_x >= 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var8 != var6) {
                        statePc = 10;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var8.field_x = 0;
                    if (var7 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6 = (uu) ((Object) this.field_s.field_t.d((byte) 18));
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (var7 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var8.field_x = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = param2;
                    stackIn_15_1 = 12800;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (stackIn_15_0 == stackIn_15_1) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    this.field_r = 50;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(boolean param0, uu param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        mq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_p * param1.field_k >> -511409044) + param1.field_m;
              var3_int = var3_int + (this.field_D[param1.field_y] * (-8192 + this.field_L[param1.field_y]) >> 179164492);
              if (param0) {
                break L1;
              } else {
                this.field_O = 8L;
                break L1;
              }
            }
            L2: {
              var4 = param1.field_w;
              if (-1 <= (var4.field_j ^ -1)) {
                break L2;
              } else {
                L3: {
                  if ((var4.field_b ^ -1) < -1) {
                    break L3;
                  } else {
                    if ((this.field_K[param1.field_y] ^ -1) < -1) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_b << -165543262;
                  var6 = var4.field_e << -1276582079;
                  if ((var6 ^ -1) < (param1.field_H ^ -1)) {
                    var5 = var5 * param1.field_H / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (this.field_K[param1.field_y] >> -2115991481);
                var7 = Math.sin((double)(511 & param1.field_C) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_B.field_n * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)du.field_k);
              if ((var5 ^ -1) <= -2) {
                stackIn_13_0 = var5;
                break L5;
              } else {
                stackIn_13_0 = 1;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("bs.QA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final void a(int param0, boolean param1) {
        int discarded$1 = 0;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (0 > param0) {
          param0 = 0;
          L0: while (true) {
            if (-17 >= (param0 ^ -1)) {
              return;
            } else {
              this.a(param0, true);
              param0++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            }
          }
        } else {
          L1: {
            this.field_w[param0] = 12800;
            this.field_G[param0] = 8192;
            this.field_T[param0] = 16383;
            this.field_L[param0] = 8192;
            this.field_K[param0] = 0;
            this.field_z[param0] = 8192;
            this.b(param0, (byte) 126);
            this.a(param0, 32605);
            if (param1) {
              break L1;
            } else {
              discarded$1 = this.a(45, (uu) null);
              break L1;
            }
          }
          this.field_J[param0] = 0;
          this.field_S[param0] = 32767;
          this.field_D[param0] = 256;
          this.field_R[param0] = 0;
          this.d(8192, param0, 41);
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    if (!param0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c(-1, -1);
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.c(-1, (byte) -30);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    this.a(-1, param1);
                    var3 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var3 ^ -1) <= -17) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_B[var3] = this.field_H[var3];
                    var3++;
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var3 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (-17 >= (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_F[var3] = eb.a(this.field_H[var3], -128);
                    var3++;
                    if (var4 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized boolean a(og param0, tv param1, int param2, ki param3, int param4) {
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
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        tj var8 = null;
        int var9 = 0;
        td var10 = null;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param1.b();
                        var6_int = 1;
                        var7 = null;
                        if ((param4 ^ -1) >= param2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var7 = new int[]{param4};
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = (tj) ((Object) param1.field_l.a(52));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == null) {
                            statePc = 15;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var9 = (int)var8.field_h;
                        var10 = (td) ((Object) this.field_p.a(param2 ^ -119, (long)var9));
                        if (var11 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!var10.a(var8.field_m, (int[]) (var7), param0, 1255750754)) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = u.a(param3, var9, 0);
                        if (var10 != null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6_int = 0;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_p.a(var10, param2 ^ 0, (long)var9);
                        if (!var10.a(var8.field_m, (int[]) (var7), param0, 1255750754)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8 = (tj) ((Object) param1.field_l.a(true));
                        if (var11 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var6_int != 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param1.a();
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = var6_int;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var6);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("bs.EA(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param1 == null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_26_2 = "{...}";
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_26_2 = "null";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param2).append(',');
                    stackIn_27_1 = stackIn_28_1;
                    if (param3 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized hj a() {
        return (hj) ((Object) this.field_s);
    }

    final synchronized int d() {
        return 0;
    }

    private final int a(int param0, uu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 16384) {
                break L1;
              } else {
                this.field_K = (int[]) null;
                break L1;
              }
            }
            var3_int = this.field_G[param1.field_y];
            if (8192 <= var3_int) {
              stackIn_6_0 = 16384 + -((128 + -param1.field_D) * (16384 + -var3_int) + 32 >> -17436666);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = var3_int * param1.field_D + 32 >> 2065529958;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("bs.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized void a(boolean param0, tv param1, int param2) {
        try {
            if (param2 <= 48) {
                this.d(0, -127, 115);
            }
            this.a(param0, true, true, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bs.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(int[] param0, int param1, int param2, uu param3, int param4) {
        int stackIn_9_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        mq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_u = du.field_k / 100;
              if (-1 < (param3.field_x ^ -1)) {
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
                  if (-1 <= (param3.field_q ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_P[param3.field_y][param3.field_q] != param3) {
                      break L3;
                    } else {
                      this.field_P[param3.field_y][param3.field_q] = null;
                      return true;
                    }
                  }
                }
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_k;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_z[param3.field_y] * 0.0004921259842519685) + 0.5);
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
              var9 = (double)((param3.field_k * param3.field_p >> 1320346796) + (-60 + param3.field_E << 678374184)) * 0.000005086263020833333;
              if (var7.field_i > 0) {
                L7: {
                  L8: {
                    if ((var7.field_d ^ -1) < -1) {
                      break L8;
                    } else {
                      param3.field_v = param3.field_v + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                  break L7;
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
            L9: {
              if (var7.field_g == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (0 >= var7.field_f) {
                      break L11;
                    } else {
                      param3.field_G = param3.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_G = param3.field_G + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if ((var7.field_g.length + -2 ^ -1) >= (param3.field_r ^ -1)) {
                        break L14;
                      } else {
                        stackIn_34_0 = param3.field_G;

                        stackIn_34_1 = (255 & var7.field_g[param3.field_r - -2]) << -845544664;

                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_34_0 <= stackIn_34_1) {
                            break L14;
                          } else {
                            param3.field_r = param3.field_r + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackIn_34_0 = var7.field_g.length - 2 ^ -1;
                    stackIn_34_1 = param3.field_r ^ -1;
                    break L13;
                  }
                  if (stackIn_34_0 != stackIn_34_1) {
                    break L9;
                  } else {
                    if (0 == var7.field_g[param3.field_r + 1]) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (param4 > param3.field_x) {
                break L15;
              } else {
                if (var7.field_h == null) {
                  break L15;
                } else {
                  if ((1 & this.field_J[param3.field_y]) == 0) {
                    L16: {
                      if (param3.field_q < 0) {
                        break L16;
                      } else {
                        if (this.field_P[param3.field_y][param3.field_q] != param3) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if ((var7.field_c ^ -1) >= -1) {
                          break L18;
                        } else {
                          param3.field_x = param3.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_x = param3.field_x + 128;
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (param3.field_n >= var7.field_h.length + -2) {
                            break L21;
                          } else {
                            stackIn_55_0 = param3.field_x;

                            stackIn_55_1 = (var7.field_h[2 + param3.field_n] & 255) << 1815279624;

                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_55_0 <= stackIn_55_1) {
                                break L21;
                              } else {
                                param3.field_n = param3.field_n + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackIn_55_0 = param3.field_n;
                        stackIn_55_1 = var7.field_h.length + -2;
                        break L20;
                      }
                      if (stackIn_55_0 == stackIn_55_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            if (var8 == 0) {
              param3.field_z.a(param3.field_u, this.c(255, param3), this.a(param4 ^ 16384, param3));
              stackIn_74_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L22: {
                L23: {
                  param3.field_z.d(param3.field_u);
                  if (param0 == null) {
                    break L23;
                  } else {
                    param3.field_z.b(param0, param1, param2);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_z.a(param2);
                break L22;
              }
              L24: {
                if (!param3.field_z.k()) {
                  break L24;
                } else {
                  this.field_s.field_o.b(param3.field_z);
                  break L24;
                }
              }
              L25: {
                param3.a(0);
                if (-1 >= (param3.field_x ^ -1)) {
                  param3.b(false);
                  if (param3.field_q <= 0) {
                    break L25;
                  } else {
                    if (this.field_P[param3.field_y][param3.field_q] == param3) {
                      this.field_P[param3.field_y][param3.field_q] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackIn_72_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var6);

            stackIn_77_1 = new StringBuilder().append("bs.IA(");

            if (param0 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L26;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L27;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L27;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_78_0), stackIn_81_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0 != 0;
          } else {
            return stackIn_74_0 != 0;
          }
        }
    }

    private final void b(int param0, byte param1) {
        uu var3;
        int var4;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        L0: {
          L1: {
            var4 = Sumoblitz.field_L ? 1 : 0;
            if (-1 == (2 & this.field_J[param0] ^ -1)) {
              break L1;
            } else {
              var3 = (uu) ((Object) this.field_s.field_t.b(-78));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackIn_12_0 = var3.field_y;

                  stackIn_12_1 = param0;

                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_12_0 != stackIn_12_1) {
                        break L3;
                      } else {
                        if (this.field_t[param0][var3.field_E] == null) {
                          if (0 > var3.field_x) {
                            var3.field_x = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = (uu) ((Object) this.field_s.field_t.d((byte) 18));
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
          stackIn_12_0 = param1;
          stackIn_12_1 = 120;
          break L0;
        }
        L4: {
          if (stackIn_12_0 > stackIn_12_1) {
            break L4;
          } else {
            this.field_J = (int[]) null;
            break L4;
          }
        }
    }

    final void a(byte param0, uu param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                    L3: {
                      var6 = -param1.field_B.field_l + (var4_int + var4_int);
                      var5 = (int)((long)var6 * (long)this.field_R[param1.field_y] >> 2007001734);
                      var4_int = var4_int << 8;
                      if (var4_int <= var5) {
                        param1.field_z.c(true);
                        var5 = -var5 + (var4_int + var4_int) - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!Sumoblitz.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_R[param1.field_y] >> 1910152134);
              break L1;
            }
            var6 = -121 / ((22 - param0) / 59);
            param1.field_z.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("bs.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0, boolean param1) {
        if (!param1) {
            this.field_y = (int[]) null;
        }
        this.field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        this.field_L[param0] = param2;
        if (param1 > -98) {
            this.field_D = (int[]) null;
        }
    }

    private final void d(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Sumoblitz.field_L ? 1 : 0;
                    var2 = this.field_Q;
                    if (param0 == 18922) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_v = (sh) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = this.field_C;
                    var4 = this.field_q;
                    if (null == this.field_I) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ((var3 ^ -1) == (this.field_u ^ -1)) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.a(this.field_M, true, this.field_A, this.field_I);
                    this.d(18922);
                    return;
                }
                case 6: {
                    stackIn_7_0 = var3 ^ -1;
                    stackIn_7_1 = this.field_C ^ -1;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 != stackIn_7_1) {
                        statePc = 27;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackIn_29_0 = var3 ^ -1;
                    stackIn_9_0 = stackIn_29_0;
                    stackIn_29_1 = this.field_v.field_c[var2] ^ -1;
                    stackIn_9_1 = stackIn_29_1;
                    if (var7 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 != stackIn_9_1) {
                        statePc = 26;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_v.b(var2);
                    var6 = this.field_v.e(var2);
                    stackIn_7_0 = var6 ^ -1;
                    stackIn_11_0 = stackIn_7_0;
                    stackIn_7_1 = -2;
                    stackIn_11_1 = stackIn_7_1;
                    if (var7 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (stackIn_11_0 != stackIn_11_1) {
                        statePc = 23;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    this.field_v.a();
                    this.field_v.c(var2);
                    if (this.field_v.d()) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (var7 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (this.field_I != null) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.a(this.field_M, this.field_I, 107);
                    this.d(18922);
                    return;
                }
                case 18: {
                    if (!this.field_M) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var3 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    this.field_v.b(var4);
                    if (var7 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.a(true, true);
                    this.field_v.e();
                    return;
                }
                case 23: {
                    if (0 == (var6 & 128)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    this.a(var6, (byte) -82);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    this.field_v.a(var2);
                    this.field_v.c(var2);
                    if (var7 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var2 = this.field_v.b();
                    var3 = this.field_v.field_c[var2];
                    var4 = this.field_v.d(var3);
                    if (var7 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_q = var4;
                    this.field_C = var3;
                    this.field_Q = var2;
                    if (this.field_I == null) {
                        statePc = 31;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = this.field_u ^ -1;
                    stackIn_29_1 = var3 ^ -1;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (stackIn_29_0 <= stackIn_29_1) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.field_C = this.field_u;
                    this.field_Q = -1;
                    this.field_q = this.field_v.d(this.field_C);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        uu stackIn_17_2 = null;
        Object stackIn_18_0;
        int stackIn_18_1;
        uu stackIn_18_2;
        int stackIn_18_3;
        uu var5;
        int var6_int;
        qp var6;
        uu var7;
        int var8;
        uu var9;
        int var10;
        td var11;
        td var12;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          this.a(64, param3, 12800, param2);
          if ((this.field_J[param2] & 2) == 0) {
            break L0;
          } else {
            var5 = (uu) ((Object) this.field_s.field_t.a(9));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if ((param2 ^ -1) != (var5.field_y ^ -1)) {
                    break L2;
                  } else {
                    if (0 <= var5.field_x) {
                      break L2;
                    } else {
                      this.field_t[param2][var5.field_E] = null;
                      this.field_t[param2][param3] = var5;
                      var6_int = var5.field_m + (var5.field_p * var5.field_k >> 1057239788);
                      var5.field_m = var5.field_m + (-var5.field_E + param3 << -1227502136);
                      var5.field_p = -var5.field_m + var6_int;
                      var5.field_E = param3;
                      var5.field_k = 4096;
                      return;
                    }
                  }
                }
                var5 = (uu) ((Object) this.field_s.field_t.d(9));
                if (var10 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var11 = (td) ((Object) this.field_p.a(115, (long)this.field_B[param2]));
        var12 = var11;
        if (var12 == null) {
          return;
        } else {
          var6 = var11.field_o[param3];
          if (var6 != null) {
            L3: {
              L4: {
                var7 = new uu();
                var7.field_A = var12;
                var7.field_y = param2;
                var7.field_B = var6;
                var7.field_w = var11.field_n[param3];
                var7.field_q = var11.field_r[param3];
                var8 = -115 % ((-80 - param1) / 43);
                var7.field_E = param3;
                var7.field_F = 1024 + var12.field_s * (param0 * (param0 * var11.field_q[param3])) >> -1616706517;
                var7.field_D = var11.field_t[param3] & 255;
                var7.field_m = -(32767 & var11.field_k[param3]) + (param3 << 1140439080);
                var7.field_G = 0;
                var7.field_r = 0;
                var7.field_x = -1;
                var7.field_v = 0;
                var7.field_n = 0;
                if (0 != this.field_R[param2]) {
                  break L4;
                } else {
                  var7.field_z = mf.a(var6, this.a(true, var7), this.c(255, var7), this.a(16384, var7));
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
                stackIn_17_0 = this;

                stackIn_17_1 = 110;

                stackIn_17_2 = (uu) (var7);

                if (var11.field_k[param3] >= 0) {
                  stackIn_18_0 = this;
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = (uu) ((Object) stackIn_17_2);
                  stackIn_18_3 = 0;
                  break L5;
                } else {
                  stackIn_18_0 = this;
                  stackIn_18_1 = stackIn_17_1;
                  stackIn_18_2 = (uu) ((Object) stackIn_17_2);
                  stackIn_18_3 = 1;
                  break L5;
                }
              }
              this.a((byte) stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
              break L3;
            }
            L6: {
              if ((var11.field_k[param3] ^ -1) <= -1) {
                break L6;
              } else {
                var7.field_z.c(-1);
                break L6;
              }
            }
            L7: {
              if (-1 >= (var7.field_q ^ -1)) {
                L8: {
                  var9 = this.field_P[param2][var7.field_q];
                  if (var9 == null) {
                    break L8;
                  } else {
                    if (-1 >= (var9.field_x ^ -1)) {
                      break L8;
                    } else {
                      this.field_t[param2][var9.field_E] = null;
                      var9.field_x = 0;
                      break L8;
                    }
                  }
                }
                this.field_P[param2][var7.field_q] = var7;
                break L7;
              } else {
                break L7;
              }
            }
            this.field_s.field_t.a((ms) (var7), (byte) 39);
            this.field_t[param2][param3] = var7;
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(int param0, uu param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 30) {
                break L1;
              } else {
                this.field_s = (rh) null;
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
                    if (param1 == this.field_P[param1.field_y][param1.field_q]) {
                      this.field_P[param1.field_y][param1.field_q] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 1;
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
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("bs.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (-129 != (var3 ^ -1)) {
          if (-145 != (var3 ^ -1)) {
            if (param1 < -52) {
              if (-161 != (var3 ^ -1)) {
                if (176 != var3) {
                  if (var3 == 192) {
                    var4 = param0 & 15;
                    var5 = (param0 & 32711) >> 505053448;
                    this.e(var4, this.field_F[var4] + var5, 5174);
                    return;
                  } else {
                    if (208 == var3) {
                      var4 = 15 & param0;
                      var5 = (32605 & param0) >> 123435016;
                      this.a(var4, (byte) -101, var5);
                      return;
                    } else {
                      if (224 == var3) {
                        var4 = 15 & param0;
                        var5 = ((param0 & 8323255) >> -1023687511) + (param0 >> 1094630728 & 127);
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
                    var5 = (32654 & param0) >> 2057640584;
                    var6 = (8345855 & param0) >> -1027799472;
                    if (0 == var5) {
                      this.field_F[var4] = (var6 << 1880100622) + eb.a(-2080769, this.field_F[var4]);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if ((var5 ^ -1) != -33) {
                      break L1;
                    } else {
                      this.field_F[var4] = (var6 << 1839342279) + eb.a(this.field_F[var4], -16257);
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 == (var5 ^ -1)) {
                      this.field_K[var4] = (var6 << 1719036519) + eb.a(-16257, this.field_K[var4]);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (33 == var5) {
                      this.field_K[var4] = eb.a(-128, this.field_K[var4]) + var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((var5 ^ -1) != -6) {
                      break L4;
                    } else {
                      this.field_z[var4] = (var6 << 644505607) + eb.a(-16257, this.field_z[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if (37 != var5) {
                      break L5;
                    } else {
                      this.field_z[var4] = var6 + eb.a(-128, this.field_z[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 == 7) {
                      this.field_w[var4] = eb.a(-16257, this.field_w[var4]) + (var6 << 1871576871);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (39 == var5) {
                      this.field_w[var4] = var6 + eb.a(this.field_w[var4], -128);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (10 != var5) {
                      break L8;
                    } else {
                      this.field_G[var4] = eb.a(-16257, this.field_G[var4]) + (var6 << 1714289031);
                      break L8;
                    }
                  }
                  L9: {
                    if (42 == var5) {
                      this.field_G[var4] = var6 + eb.a(-128, this.field_G[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 11) {
                      break L10;
                    } else {
                      this.field_T[var4] = eb.a(-16257, this.field_T[var4]) + (var6 << 313173895);
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -44) {
                      this.field_T[var4] = var6 + eb.a(-128, this.field_T[var4]);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 64) {
                      L13: {
                        if (var6 < 64) {
                          break L13;
                        } else {
                          this.field_J[var4] = ic.a(this.field_J[var4], 1);
                          if (var8 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      this.field_J[var4] = eb.a(this.field_J[var4], -2);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L14: {
                    if (-66 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      L15: {
                        if ((var6 ^ -1) <= -65) {
                          break L15;
                        } else {
                          this.b(var4, (byte) 122);
                          this.field_J[var4] = eb.a(this.field_J[var4], -3);
                          if (var8 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      this.field_J[var4] = ic.a(this.field_J[var4], 2);
                      break L14;
                    }
                  }
                  L16: {
                    if ((var5 ^ -1) != -100) {
                      break L16;
                    } else {
                      this.field_S[var4] = (var6 << 1207116103) + eb.a(127, this.field_S[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if ((var5 ^ -1) == -99) {
                      this.field_S[var4] = eb.a(16256, this.field_S[var4]) + var6;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (-102 == (var5 ^ -1)) {
                      this.field_S[var4] = 16384 + (eb.a(127, this.field_S[var4]) - -(var6 << 1573849703));
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (-101 == (var5 ^ -1)) {
                      this.field_S[var4] = 16384 - (-eb.a(this.field_S[var4], 16256) + -var6);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (-121 == (var5 ^ -1)) {
                      this.c(-1, var4);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-122 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      this.a(var4, true);
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 123) {
                      break L22;
                    } else {
                      this.c(var4, (byte) -109);
                      break L22;
                    }
                  }
                  L23: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = this.field_S[var4];
                      if (16384 == var7) {
                        this.field_D[var4] = eb.a(-16257, this.field_D[var4]) + (var6 << -312279321);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (-39 == (var5 ^ -1)) {
                      var7 = this.field_S[var4];
                      if (-16385 != (var7 ^ -1)) {
                        break L24;
                      } else {
                        this.field_D[var4] = var6 + eb.a(this.field_D[var4], -128);
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (16 != var5) {
                      break L25;
                    } else {
                      this.field_R[var4] = eb.a(this.field_R[var4], -16257) - -(var6 << 1027833191);
                      break L25;
                    }
                  }
                  L26: {
                    if ((var5 ^ -1) != -49) {
                      break L26;
                    } else {
                      this.field_R[var4] = var6 + eb.a(this.field_R[var4], -128);
                      break L26;
                    }
                  }
                  L27: {
                    if (81 != var5) {
                      break L27;
                    } else {
                      L28: {
                        if (-65 >= (var6 ^ -1)) {
                          break L28;
                        } else {
                          this.a(var4, 32605);
                          this.field_J[var4] = eb.a(this.field_J[var4], -5);
                          if (var8 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      this.field_J[var4] = ic.a(this.field_J[var4], 4);
                      break L27;
                    }
                  }
                  L29: {
                    if ((var5 ^ -1) != -18) {
                      break L29;
                    } else {
                      this.d((var6 << 1547298695) + (-16257 & this.field_N[var4]), var4, 97);
                      break L29;
                    }
                  }
                  L30: {
                    if (-50 == (var5 ^ -1)) {
                      this.d(var6 + (-128 & this.field_N[var4]), var4, 42);
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  return;
                }
              } else {
                var4 = param0 & 15;
                var5 = 127 & param0 >> 420624520;
                var6 = param0 >> -1981835152 & 127;
                this.b(97, var5, var6, var4);
                return;
              }
            } else {
              return;
            }
          } else {
            L31: {
              var4 = 15 & param0;
              var5 = (32657 & param0) >> -1924715480;
              var6 = 127 & param0 >> 1556304016;
              if (-1 <= (var6 ^ -1)) {
                break L31;
              } else {
                this.a(var6, (byte) -13, var4, var5);
                if (var8 == 0) {
                  return;
                } else {
                  break L31;
                }
              }
            }
            this.a(64, var5, 12800, var4);
            return;
          }
        } else {
          var4 = 15 & param0;
          var5 = param0 >> 1651568840 & 127;
          var6 = param0 >> 610672944 & 127;
          this.a(var6, var5, 12800, var4);
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Sumoblitz.field_L ? 1 : 0;
                    if ((this.field_B[param0] ^ -1) == (param1 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_B[param0] = param1;
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 >= 128) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_P[param0][var4] = null;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (param2 == 5174) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_y = (int[]) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 >= -26) {
            this.field_r = -65;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_H[param1] = param2;
        this.field_F[param1] = eb.a(-128, param2);
        if (param0 != -1823) {
            return;
        }
        this.e(param1, param2, param0 ^ -4905);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_v.c()) {
                  break L2;
                } else {
                  var4_int = this.field_E * this.field_v.field_d / du.field_k;
                  L3: while (true) {
                    L4: {
                      var5 = (long)var4_int * (long)param2 + this.field_O;
                      if (0L <= -var5 + this.field_q) {
                        this.field_O = var5;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var7 = (int)((this.field_q + (-this.field_O + (long)var4_int - 1L)) / (long)var4_int);
                      this.field_O = this.field_O + (long)var7 * (long)var4_int;
                      this.field_s.b(param0, param1, var7);
                      param2 = param2 - var7;
                      this.d(18922);
                      param1 = param1 + var7;
                      if (this.field_v.c()) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      this.field_s.b(param0, param1, param2);
                      break L1;
                    }
                  }
                }
              }
              this.field_s.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("bs.J(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        uu var3;
        int var4;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 32605) {
            break L0;
          } else {
            this.field_z = (int[]) null;
            break L0;
          }
        }
        L1: {
          if ((this.field_J[param0] & 4 ^ -1) == -1) {
            break L1;
          } else {
            var3 = (uu) ((Object) this.field_s.field_t.b(param1 + -32539));
            L2: while (true) {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if ((param0 ^ -1) != (var3.field_y ^ -1)) {
                        break L4;
                      } else {
                        var3.field_t = 0;
                        break L4;
                      }
                    }
                    var3 = (uu) ((Object) this.field_s.field_t.d((byte) 18));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L1;
            }
          }
        }
    }

    private final void c(int param0, int param1) {
        uu var3;
        int var4;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            this.field_v = (sh) null;
            break L0;
          }
        }
        var3 = (uu) ((Object) this.field_s.field_t.b(param0 ^ -95));
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
                    if (-1 < (param1 ^ -1)) {
                      break L4;
                    } else {
                      if ((var3.field_y ^ -1) != (param1 ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == var3.field_z) {
                      break L5;
                    } else {
                      L6: {
                        var3.field_z.d(du.field_k / 100);
                        if (var3.field_z.k()) {
                          this.field_s.field_o.b(var3.field_z);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var3.a(param0 ^ -1);
                      break L5;
                    }
                  }
                  L7: {
                    if (-1 >= (var3.field_x ^ -1)) {
                      break L7;
                    } else {
                      this.field_t[var3.field_y][var3.field_E] = null;
                      break L7;
                    }
                  }
                  var3.b(false);
                  break L3;
                }
                var3 = (uu) ((Object) this.field_s.field_t.d((byte) 18));
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

    private final void b(int param0, int param1, int param2, int param3) {
        if (param0 <= 7) {
            this.field_F = (int[]) null;
        }
    }

    final synchronized void a(boolean param0, int param1, int param2, int param3, tv param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!(this.field_v.c())) {
            this.a(param5, param4, 77);
            return;
        }
        try {
            this.field_M = param5 ? true : false;
            this.field_A = param0 ? true : false;
            this.field_I = param4;
            var7_int = this.field_v.a(this.field_O) * param3;
            if (param2 != 7094) {
                this.c(-41, (byte) 86);
            }
            var8 = param1 * this.field_v.field_d;
            var7_int = var8 * ((-1 + var8 + var7_int) / var8);
            this.field_u = ((param3 >> -1451976831) + var7_int) / param3;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "bs.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void e(int param0) {
        if (param0 != 0) {
            this.b(-55, (byte) 105);
        }
        this.a(true, (byte) 104);
    }

    final synchronized void a(byte param0) {
        int var3 = 0;
        td var4 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Sumoblitz.field_L ? 1 : 0;
                    var4 = (td) ((Object) this.field_p.a(79));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var4 == null) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var4.d((byte) -36);
                    var4 = (td) ((Object) this.field_p.a(true));
                    if (var3 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 28) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.field_y = (int[]) null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void b(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 0) {
            discarded$0 = this.a(true, (uu) null);
        }
        this.field_E = param0;
    }

    private final void d(int param0, int param1, int param2) {
        this.field_N[param1] = param0;
        if (param2 <= 9) {
            this.a(-89, (byte) -88, -127);
        }
        this.field_x[param1] = (int)(0.5 + Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0 ^ -1968, param2, param1);
        if (param0 != 177) {
            this.field_z = (int[]) null;
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        this.field_v.e();
        this.field_I = null;
        if (param1 < 0) {
            this.field_q = 79L;
        }
        this.a(param0, true);
    }

    private final void c(int param0, byte param1) {
        uu var3;
        int var4;
        int stackIn_11_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = (uu) ((Object) this.field_s.field_t.b(-96));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackIn_11_0 = param0;

                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_11_0 < 0) {
                        break L4;
                      } else {
                        if ((var3.field_y ^ -1) == (param0 ^ -1)) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if ((var3.field_x ^ -1) > -1) {
                      this.field_t[var3.field_y][var3.field_E] = null;
                      var3.field_x = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (uu) ((Object) this.field_s.field_t.d((byte) 18));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackIn_11_0 = param1;
            break L1;
          }
          L5: {
            if (stackIn_11_0 < -15) {
              break L5;
            } else {
              this.c(126, 58);
              break L5;
            }
          }
          return;
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Sumoblitz.field_L ? 1 : 0;
                    if ((param1 ^ -1) <= -1) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (16 <= var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_y[var4] = param2;
                    var4++;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var5 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    this.field_y[param1] = param2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (param0 < -42) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    this.c();
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, tv param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.a(param2, (byte) 69);
                        this.field_v.a(param3.field_k);
                        this.field_O = 0L;
                        stackIn_3_0 = this;
                        stackIn_2_0 = stackIn_3_0;
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = this;
                        stackIn_4_1 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((bs) (this)).field_M = stackIn_4_1 != 0;
                        var5_int = this.field_v.f();
                        var6 = 0;
                        if (param1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_B = (int[]) null;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_v.b(var6);
                        this.field_v.a(var6);
                        this.field_v.c(var6);
                        var6++;
                        if (var7 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_Q = this.field_v.b();
                        this.field_C = this.field_v.field_c[this.field_Q];
                        this.field_q = this.field_v.d(this.field_C);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (runtimeException);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("bs.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param3 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 >= -38) {
            bs.f(-53);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        L0: {
          L1: {
            var6 = Sumoblitz.field_L ? 1 : 0;
            if (this.field_v.c()) {
              var2 = this.field_E * this.field_v.field_d / du.field_k;
              L2: while (true) {
                L3: {
                  var3 = this.field_O + (long)param0 * (long)var2;
                  if ((-var3 + this.field_q ^ -1L) <= -1L) {
                    this.field_O = var3;
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
                  var5 = (int)((this.field_q - this.field_O + ((long)var2 + -1L)) / (long)var2);
                  this.field_O = this.field_O + (long)var5 * (long)var2;
                  param0 = param0 - var5;
                  this.field_s.a(var5);
                  this.d(18922);
                  if (this.field_v.c()) {
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
                  this.field_s.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_s.a(param0);
          break L0;
        }
    }

    public bs() {
        this.field_R = new int[16];
        this.field_T = new int[16];
        this.field_B = new int[16];
        this.field_F = new int[16];
        this.field_H = new int[16];
        this.field_y = new int[16];
        this.field_P = new uu[16][128];
        this.field_r = 256;
        this.field_w = new int[16];
        this.field_E = 1000000;
        this.field_L = new int[16];
        this.field_N = new int[16];
        this.field_t = new uu[16][128];
        this.field_S = new int[16];
        this.field_x = new int[16];
        this.field_G = new int[16];
        this.field_K = new int[16];
        this.field_D = new int[16];
        this.field_J = new int[16];
        this.field_z = new int[16];
        this.field_v = new sh();
        this.field_s = new rh((bs) (this));
        this.field_p = new te(128);
        this.a((byte) -127, -1, 256);
        this.a(true, true);
    }

    static {
        field_o = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
