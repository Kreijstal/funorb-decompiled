/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends lj {
    int field_B;
    int field_H;
    int field_A;
    int field_G;
    static nk field_I;
    int field_C;
    static String[] field_F;
    int field_D;

    final static vd a(byte param0) {
        int var1;
        if (null == fa.field_i) {
          fa.field_i = new vd();
          fa.field_i.a(-71, vd.field_h);
          fa.field_i.field_n = 2763306;
          fa.field_i.field_c = 6;
          fa.field_i.field_e = 4;
          fa.field_i.field_l = 0;
          fa.field_i.field_j = 14;
          fa.field_i.field_m = al.field_i;
          fa.field_i.field_g = 7697781;
          fa.field_i.field_i = 5;
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        } else {
          var1 = 40 / ((param0 - 72) / 54);
          return fa.field_i;
        }
    }

    public static void h(int param0) {
        if (param0 != 43) {
            return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (super.b(param0, param1, param2, param3, param4 ^ 0, param5, param6)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = -this.field_H - param3 - (this.field_p - param0);
                        var9 = param5 + (-this.field_G + -param6 + -this.field_n);
                        if (var8_int * var8_int - -(var9 * var9) < this.field_A * this.field_A) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = Math.atan2((double)var9, (double)var8_int) - ih.field_d;
                        if (0.0 <= var10) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = var10 - 3.141592653589793 / (double)this.field_C;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (0.0 < var10) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var10 + 3.141592653589793 / (double)this.field_C;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_B = (int)((double)this.field_C * var10 / 6.283185307179586);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (this.field_B < this.field_C) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        this.field_B = this.field_B - this.field_C;
                        if (var12 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var12 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_B >= 0) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_B = this.field_B + this.field_C;
                        if (var12 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_18_0 = 1;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    try {
                        if (param4 == -30386) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    try {
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0 != 0;
                }
                case 24: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var8);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("wh.O(").append(param0).append(',').append(param1).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void e(byte param0) {
        tj.field_w[46] = 72;
        tj.field_w[61] = 27;
        tj.field_w[91] = 42;
        tj.field_w[59] = 57;
        tj.field_w[44] = 71;
        tj.field_w[47] = 73;
        tj.field_w[45] = 26;
        tj.field_w[192] = 28;
        tj.field_w[520] = 59;
        tj.field_w[222] = 58;
        int var1 = 17 / ((param0 - 2) / 42);
        tj.field_w[92] = 74;
        tj.field_w[93] = 43;
    }

    final static void f(byte param0) {
        sj dupTemp$1 = null;
        Object var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj stackIn_6_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_5_0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = null;
              if (param0 == 104) {
                break L1;
              } else {
                wh.h(86);
                break L1;
              }
            }
            var2 = 11;
            L2: while (true) {
              L3: {
                L4: {
                  if ((var2 ^ -1) > -1) {
                    break L4;
                  } else {
                    dupTemp$1 = od.field_g.field_e[var2];
                    var1 = dupTemp$1;
                    stackOut_5_0 = (sj) (dupTemp$1);
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (stackIn_6_0 != null) {
                        break L4;
                      } else {
                        var2--;
                        if (var3 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_10_0 = var1;
                break L3;
              }
              eh.a((sj) ((Object) stackIn_10_0), 67);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (var1), "wh.C(" + param0 + ')');
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_I = new nk(3);
    }
}
