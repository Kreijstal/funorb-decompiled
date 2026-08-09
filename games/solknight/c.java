/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        o var14;
        int var15;
        int var16;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var12;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * this.field_N, this.field_x);
        cl.a(-112, var14);
        var5 = this.field_x >> 985941857;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (this.field_x <= var6) {
              break L1;
            } else {
              var7 = (var6 >> -168292607) * (-1 + 2 * this.field_N) % (2 * this.field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              var16 = 256;
              var15 = var11;
              if (var13 != 0) {
                if (var15 != var16) {
                  this.field_O = 56;
                  mf.e(4096);
                  return var14;
                } else {
                  mf.e(4096);
                  return var14;
                }
              } else {
                L2: {
                  if (var15 < var16) {
                    stackIn_11_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 206831848;
                    break L2;
                  } else {
                    stackIn_11_0 = var8 | var9;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_11_0;
                  mi.b(var7, var6, this.field_N, var12);
                  var9 = param2 & 65280;
                  var8 = param2 & 16711935;
                  mi.b(var7 + -(2 * this.field_N), var6, this.field_N, var12);
                  if ((var11 ^ -1) <= -257) {
                    stackIn_14_0 = var9 | var8;
                    break L3;
                  } else {
                    stackIn_14_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> 2133927368;
                    break L3;
                  }
                }
                var12 = stackIn_14_0;
                mi.b(this.field_N + var7, var6, this.field_N, var12);
                mi.b(var7 - this.field_N, var6, this.field_N, var12);
                var6++;
                if (var13 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param1 != 16711935) {
            this.field_O = 56;
            mf.e(4096);
            return var14;
          } else {
            mf.e(4096);
            return var14;
          }
        }
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 571924641 & 8355711, param6 >> 209702273 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        if (param0 != -277997311) {
          field_H = -117;
          this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
          this.field_P = this.a((byte) -119);
          this.field_A = this.field_P.b();
          this.field_G = new o(this.field_x >> -277997311, this.field_x);
          return;
        } else {
          this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
          this.field_P = this.a((byte) -119);
          this.field_A = this.field_P.b();
          this.field_G = new o(this.field_x >> -277997311, this.field_x);
          return;
        }
    }

    final void a(int param0, int param1, int param2, rc param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 18874) {
                break L1;
              } else {
                this.a((byte) -66, -124, 9);
                break L1;
              }
            }
            L2: {
              if (!this.field_B) {
                break L2;
              } else {
                this.field_D = this.field_D + 1;
                if (this.field_N * 2 >= this.field_D) {
                  break L2;
                } else {
                  this.field_D = this.field_D - this.field_N * 2;
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("c.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (0 != param1) {
          return;
        } else {
          var5 = this.field_m + param2;
          var6 = param0 - -this.field_j;
          this.a(param3, var6, this.field_S[0], var5);
          if ((this.field_R ^ -1) > -65537) {
            kf.a((byte) 97, var5 - -(this.field_t * this.field_R >> 451556400), var6, var5 - -this.field_t, this.field_x + var6);
            this.a(0, var6, this.field_S[1], var5);
            mf.e(4096);
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        o discarded$0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_t + param3;
                        kf.a((byte) 97, param3 + this.field_P.field_p, param1, -this.field_P.field_p + var5_int, this.field_x + param1);
                        var6 = -this.field_D + param3;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2.d(var6, param1);
                        var6 = var6 + param2.field_p;
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 == 0) {
                            statePc = 8;
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
                        discarded$0 = this.a((byte) 120);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        mf.e(4096);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (mi.field_b > this.field_P.field_p + param3) {
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
                        cl.a(param0 ^ -100, this.field_G);
                        param2.d(-this.field_D, 0);
                        param2.d(-this.field_D + 2 * this.field_N, 0);
                        this.field_A.g(0, 0);
                        mf.e(param0 ^ 4096);
                        this.field_G.d(param3, param1);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (mi.field_k < -this.field_P.field_p + var5_int) {
                            statePc = 24;
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
                        cl.a(param0 + -119, this.field_G);
                        var7 = this.field_D + (-this.field_P.field_p + this.field_t);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 <= 2 * this.field_N) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var7 - this.field_N * 2;
                        if (var8 != 0) {
                            statePc = 18;
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
                        if (var8 == 0) {
                            statePc = 13;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param2.d(-var7, 0);
                        param2.d(-var7 + 2 * this.field_N, 0);
                        this.field_P.g(0, 0);
                        mf.e(param0 ^ 4096);
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
                        this.field_G.d(-this.field_P.field_p + var5_int, param1);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param2 == null) {
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
                    throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_F = (param1 & 16711422) >> 32005889;
        this.field_I = 8355711 & param2 >> 797935009;
        this.field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        this.field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -97 % ((param0 - -47) / 39);
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!gb.a(param1, 126)) {
                var6 = hh.field_N;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var6.length <= var3) {
                            break L5;
                          } else {
                            var4 = var6[var3];
                            var8 = var4;
                            var7 = param1;
                            if (var5 != 0) {
                              if (var7 >= var8) {
                                break L3;
                              } else {
                                L6: while (true) {
                                  var4 = var2[var3];
                                  stackIn_26_0 = var4 ^ -1;

                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_26_0 == (param1 ^ -1)) {
                                      break L4;
                                    } else {
                                      var3++;
                                      if (var5 == 0) {
                                        if (var2.length <= var3) {
                                          break L3;
                                        } else {
                                          continue L6;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var7 == var8) {
                                stackIn_15_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var2 = qk.field_k;
                        var3 = 0;
                        L7: while (true) {
                          if (var2.length <= var3) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackIn_26_0 = var4 ^ -1;

                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_26_0 == (param1 ^ -1)) {
                                break L4;
                              } else {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_23_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                    stackIn_26_0 = 0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "c.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_I = param7;
        this.field_K = param6;
        this.field_F = param8;
        this.field_O = param5;
        this.field_N = param4;
        this.b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    var2 = this.field_x >> 148199553;
                    if (param0 != -119) {
                        statePc = 17;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var3 = new o(var2, this.field_x);
                    cl.a(-98, var3);
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = this.field_x ^ -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 >= (var4 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_16_0 = 0;
                    stackIn_5_0 = stackIn_16_0;
                    if (var9 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var5 >= var2) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_x));
                    var8 = 1;
                    stackIn_3_0 = (1.0 < var6 ? -1 : (1.0 == var6 ? 0 : 1));
                    stackIn_8_0 = stackIn_3_0;
                    if (var9 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 <= 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (1.0 <= var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (int)(var6 * 255.0);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    mi.a(var5, var4, var8 << 1261525928 | var8 | var8 << -874209264);
                    var5++;
                    if (var9 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = 4096;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    mf.e(stackIn_16_0);
                    return var3;
                }
                case 17: {
                    return (o) null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
