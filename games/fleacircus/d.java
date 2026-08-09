/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends bb {
    static boolean field_L;
    private id field_K;
    static ed field_O;
    int field_M;
    static int field_N;
    int field_P;
    private int field_R;
    static boolean field_Q;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = (param5 - param0 << 1723611368) / param2.field_x;
                        var7 = var6_int * param2.field_q + (param0 << 1612409736);
                        param3 = param3 + param2.field_q;
                        param1 = param1 + param2.field_v;
                        var8 = param3 - -(gb.field_d * param1);
                        var9 = 0;
                        var10 = param2.field_t;
                        if (param4 == 2147483647) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        d.j(-47);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var11 = param2.field_w;
                        var12 = -var11 + gb.field_d;
                        var13 = 0;
                        if (gb.field_b <= param1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var14 = -param1 + gb.field_b;
                        param1 = gb.field_b;
                        var8 = var8 + gb.field_d * var14;
                        var9 = var9 + var14 * var11;
                        var10 = var10 - var14;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 + param1 <= gb.field_i) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = var10 - (var10 + (param1 - gb.field_i));
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (gb.field_l > param3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var14 = gb.field_l - param3;
                        var8 = var8 + var14;
                        var9 = var9 + var14;
                        var13 = var13 + var14;
                        param3 = gb.field_l;
                        var11 = var11 - var14;
                        var12 = var12 + var14;
                        var7 = var7 + var6_int * var14;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var11 + param3 <= gb.field_h) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = var11 + (param3 - gb.field_h);
                        var11 = var11 - var14;
                        var13 = var13 + var14;
                        var12 = var12 + var14;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var11 <= 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var10 ^ -1) >= -1) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        param1 = -var10;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (-1 >= (param1 ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var14 = var7;
                        if (var20 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        return;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param3 = -var11;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (-1 >= (param3 ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var15 = var14 >> -2068757560;
                        var16 = 256 - var15;
                        var14 = var14 + var6_int;
                        stackIn_33_0 = -1;
                        stackIn_23_0 = stackIn_33_0;
                        stackIn_33_1 = var15 ^ -1;
                        stackIn_23_1 = stackIn_33_1;
                        if (var20 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 >= stackIn_23_1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var8++;
                        var9++;
                        if (var20 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        incrementValue$0 = var9;
                        var9++;
                        var17 = param2.field_B[incrementValue$0];
                        if (0 == var17) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (255 < var15) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var18 = gb.field_a[var8];
                        var19 = (16711935 & var17) * var15 + (var18 & 16711935) * var16 >> -129030680 & 16711935;
                        gb.field_a[var8] = (sc.a(16711908, sc.a(var17, 65280) * var15 + sc.a(65280, var18) * var16) >> -1641925464) + var19;
                        if (var20 == 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        gb.field_a[var8] = var17;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8++;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        param3++;
                        if (var20 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var8 = var8 + var12;
                        stackIn_33_0 = var9;
                        stackIn_33_1 = var13;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var9 = stackIn_33_0 + stackIn_33_1;
                        param1++;
                        if (var20 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_37_0 = (RuntimeException) (var6);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = new StringBuilder().append("d.DA(").append(param0).append(',').append(param1).append(',');
                    stackIn_36_1 = stackIn_37_1;
                    if (param2 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw pf.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static si a(int param0, ih param1) {
        si stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.b(8, (byte) -87);
            if (-1 <= (var2_int ^ -1)) {
              L1: {
                var3 = fb.a((byte) 98, param1) ? 1 : 0;
                var4 = fb.a((byte) 98, param1) ? 1 : 0;
                var5 = new si();
                var5.field_w = (short)param1.b(16, (byte) -87);
                var5.field_n = qg.a((byte) 125, var5.field_n, 16, param1);
                var5.field_f = qg.a((byte) 125, var5.field_f, 16, param1);
                var5.field_P = qg.a((byte) 125, var5.field_P, 16, param1);
                var5.field_j = (short)param1.b(16, (byte) -87);
                var5.field_Q = qg.a((byte) 125, var5.field_Q, 16, param1);
                var5.field_M = qg.a((byte) 125, var5.field_M, 16, param1);
                var5.field_N = qg.a((byte) 125, var5.field_N, 16, param1);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_p = (short)param1.b(16, (byte) -87);
                  var5.field_r = qg.a((byte) 125, var5.field_r, 16, param1);
                  var5.field_K = qg.a((byte) 125, var5.field_K, 16, param1);
                  var5.field_x = qg.a((byte) 125, var5.field_x, 16, param1);
                  var5.field_D = qg.a((byte) 125, var5.field_D, 16, param1);
                  var5.field_F = qg.a((byte) 125, var5.field_F, 16, param1);
                  var5.field_u = qg.a((byte) 125, var5.field_u, 16, param1);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  param1.b(16, (byte) -87);
                  var5.field_E = qg.a((byte) 125, var5.field_E, 16, param1);
                  var5.field_i = qg.a((byte) 125, var5.field_i, 16, param1);
                  var5.field_t = qg.a((byte) 125, var5.field_t, 16, param1);
                  var5.field_q = qg.a((byte) 125, var5.field_q, 16, param1);
                  var5.field_l = qg.a((byte) 125, var5.field_l, 16, param1);
                  break L2;
                }
              }
              L3: {
                if (!fb.a((byte) 98, param1)) {
                  break L3;
                } else {
                  var5.field_s = qg.a((byte) 125, var5.field_s, 16, param1);
                  break L3;
                }
              }
              L4: {
                if (!fb.a((byte) 98, param1)) {
                  break L4;
                } else {
                  var5.field_J = bf.a(param1, 8, var5.field_J, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        L8: {
                          if (var5.field_J.length <= var7) {
                            break L8;
                          } else {
                            var10 = var6;
                            var9 = var5.field_J[var7] & 255;
                            if (var8 != 0) {
                              if (var9 != var10) {
                                break L6;
                              } else {
                                break L7;
                              }
                            } else {
                              L9: {
                                if (var9 <= var10) {
                                  break L9;
                                } else {
                                  var6 = var5.field_J[var7] & 255;
                                  break L9;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                      var5.field_J = null;
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                    var5.field_h = (byte)(1 + var6);
                    break L4;
                  }
                }
              }
              var6 = 37 / ((87 - param0) / 37);
              stackIn_24_0 = (si) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("d.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final int a(int param0, int param1) {
        int var3;
        if (0 <= param0) {
          if (this.field_K.b(0) <= param0) {
            return -1;
          } else {
            var3 = 76 % ((param1 - 14) / 59);
            return this.field_K.b(param0, false);
          }
        } else {
          return -1;
        }
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var14 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_25_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param4 - (param6 - -this.field_M);
                var9 = this.field_u - 2 * this.field_M;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 >= (var8_int ^ -1)) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = this.field_R * var8_int / var9;
                  if (param5 != 1) {
                    break L4;
                  } else {
                    this.field_K.a((byte) 47, var8_int);
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 != (param5 ^ -1)) {
                  break L3;
                } else {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var12 >= this.field_K.b(0)) {
                          break L7;
                        } else {
                          var13 = -var8_int + this.field_K.b(var12, false);
                          var13 = var13 * var13;
                          var16 = var13;
                          var15 = var10;
                          if (var14 != 0) {
                            if (var15 > var16) {
                              break L3;
                            } else {
                              break L6;
                            }
                          } else {
                            L8: {
                              if (var15 > var16) {
                                var11 = var12;
                                var10 = var13;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var12++;
                            if (var14 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (0 > var11) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                    this.field_K.b(1, var11);
                    break L3;
                  }
                }
              }
              stackIn_23_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8);

            stackIn_28_1 = new StringBuilder().append("d.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_23_0 != 0;
        } else {
          return stackIn_25_0 != 0;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 != -1) {
            field_O = (ed) null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    final int i(int param0) {
        if (param0 <= 24) {
            this.i(-5);
            return this.field_K.b(0);
        }
        return this.field_K.b(0);
    }

    final static void a(int param0, int param1, qc param2, qc param3, int param4, int param5, int param6, fa param7, fa param8, qc param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          L0: {
            L1: {
              bk.a(-5237, param15, param7, param8);
              hg.a(0, param17, param0, param14, param16);
              rb.a(param6, param4, (byte) 83);
              sk.a(param11, param2, param5, 443, param3, param19);
              if (param20 == 255) {
                break L1;
              } else {
                field_Q = false;
                break L1;
              }
            }
            ai.a(param10, param1, param9, false);
            mh.a(param12, 1, param18, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var21);

            stackIn_6_1 = new StringBuilder().append("d.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param8 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ',' + param20 + ')');
        }
    }

    final int a(byte param0) {
        if (param0 != 9) {
            this.field_K = (id) null;
            return this.field_R;
        }
        return this.field_R;
    }

    static {
        field_L = false;
        field_O = new ed();
    }
}
