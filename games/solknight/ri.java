/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri implements j {
    static int field_f;
    private int field_b;
    static String field_d;
    static String field_a;
    private int field_c;
    private mg field_e;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -6873) {
          L0: {
            field_f = -71;
            if ((-param1 & param1) != param1) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((-param1 & param1) != param1) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (param0) {
            field_f = 91;
        }
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_v) {
                  break L2;
                } else {
                  if (!param4.b(true)) {
                    stackIn_6_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_6_0;
            this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_i + "</u>", param3 + param4.field_m, param1 + param4.field_j, param4.field_t, param4.field_x, var6_int, -1, this.field_b, this.field_c, this.field_e.field_s + this.field_e.field_F);
            if (param0 >= 113) {
              L3: {
                if (!param4.b(true)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var7 = this.field_e.b(param4.field_i);
                      var8 = this.field_e.field_s + this.field_e.field_F;
                      var9 = param3 - -param4.field_m;
                      if (this.field_b != 2) {
                        break L5;
                      } else {
                        var9 = var9 + (param4.field_t - var7);
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (-2 == (this.field_b ^ -1)) {
                      var9 = var9 + (-var7 + param4.field_t >> 1051701537);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    L7: {
                      var10 = param4.field_j + param1;
                      if (-3 != (this.field_c ^ -1)) {
                        break L7;
                      } else {
                        var10 = var10 + (-var8 + param4.field_x);
                        if (var11 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (-2 != (this.field_c ^ -1)) {
                      break L6;
                    } else {
                      var10 = var10 + (param4.field_x + -var8 >> -854277343);
                      break L6;
                    }
                  }
                  ci.a(var7 - -4, 2 + var10, var8, var9 - 2, (byte) 125);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("ri.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_14_0;
        boolean stackOut_23_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 <= param6) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (param6 - -1 < param3) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        if (param6 - -5 >= param3) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 == param5) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var7_int = -1 + param3;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = param6;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 >= var7_int) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var8 = param6;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var8 >= var7_int) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var9 = pd.field_e[var8];
                        var10 = pd.field_e[1 + var8];
                        stackOut_14_0 = ec.a(var9, -66, param2, var10);
                        stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var14 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        pd.field_e[var8] = var10;
                        pd.field_e[1 + var8] = var9;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8++;
                        if (var14 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int--;
                        if (var14 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return;
                }
                case 21: {
                    try {
                        var7_int = (1 & (param5 & param0)) + ((param0 >> -643157535) + (param5 >> -1524157823));
                        var8 = param6;
                        var9 = param0;
                        var10 = param5;
                        var11 = param6;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var11 >= param3) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var12 = pd.field_e[var11];
                        stackOut_23_0 = param2;
                        stackIn_36_0 = stackOut_23_0 ? 1 : 0;
                        stackIn_24_0 = stackOut_23_0;
                        if (var14 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!stackIn_24_0) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_27_0 = qg.field_c[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = l.field_a[var12];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var13 = stackIn_27_0;
                        if (var13 > var7_int) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var10 >= var13) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var10 = var13;
                        if (var14 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        pd.field_e[var11] = pd.field_e[var8];
                        if (var13 < var9) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var9 = var13;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        incrementValue$0 = var8;
                        var8++;
                        pd.field_e[incrementValue$0] = var12;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var11++;
                        if (var14 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ri.a(param0, param1, param2, var8, (byte) -81, var9, param6);
                        stackIn_36_0 = var10;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        ri.a(stackIn_36_0, param1, param2, param3, param4, param5, var8);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 38: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) var7), "ri.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ri() {
        this.field_e = ua.field_G;
        this.field_b = 1;
        this.field_c = 1;
    }

    ri(mg param0, int param1, int param2) {
        try {
            this.field_e = param0;
            this.field_b = param1;
            this.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Waiting for fonts";
    }
}
