/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ch extends lh implements lm {
    static boolean[] field_G;
    static int field_N;
    static String field_K;
    static String field_P;
    static String field_M;
    static k field_O;
    static int field_L;
    static String field_H;
    static String field_I;
    lh[] field_J;

    final boolean a(int param0, int param1, char param2, lh param3) {
        lh[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh var9 = null;
        lh[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != this.field_J) {
              L1: {
                if (param0 == 30373) {
                  break L1;
                } else {
                  var9 = (lh) null;
                  this.a((byte) -45, 101, 54, 104, (lh) null, -22);
                  break L1;
                }
              }
              var10 = this.field_J;
              var5 = var10;
              var6 = 0;
              L2: while (true) {
                L3: {
                  if (var10.length <= var6) {
                    break L3;
                  } else {
                    L4: {
                      var7 = var10[var6];
                      if (var7 == null) {
                        break L4;
                      } else {
                        if (!var7.d(0)) {
                          break L4;
                        } else {
                          if (var7.a(30373, param1, param2, param3)) {
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6++;
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var5_int = param1;
                if ((var5_int ^ -1) == -81) {
                  L5: {
                    if (fc.field_e[81]) {
                      stackIn_20_0 = this.b(param3, (byte) -86);
                      break L5;
                    } else {
                      stackIn_20_0 = this.a(param3, (byte) -70);
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("ch.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    private final boolean b(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -61) {
                break L1;
              } else {
                field_N = 50;
                break L1;
              }
            }
            stackIn_3_0 = this.b((byte) -127, param0, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ch.FA(");

            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final boolean a(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_9_0 = null;
        lh stackIn_9_1 = null;
        Object stackIn_14_0 = null;
        lh stackIn_14_1 = null;
        int stackIn_19_0 = 0;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_J != null) {
                            statePc = 4;
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
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var4_int = 0;
                        if (param0 == -68) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = 1;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (var4_int >= this.field_J.length) {
                            statePc = 22;
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
                        var5 = this.field_J[var4_int];
                        stackIn_9_0 = null;
                        stackIn_9_1 = (lh) (var5);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!var5.d(0)) {
                            statePc = 21;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_int = var4_int + param2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (this.field_J.length <= var4_int) {
                            statePc = 21;
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
                        var6 = this.field_J[var4_int];
                        stackIn_9_0 = null;
                        stackIn_14_0 = stackIn_9_0;
                        stackIn_9_1 = (lh) (var6);
                        stackIn_14_1 = stackIn_9_1;
                        if (var7 != 0) {
                            statePc = 9;
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
                        if (stackIn_14_0 != stackIn_14_1) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var7 == 0) {
                            statePc = 20;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (!var6.a(1, param1)) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_19_0 = 1;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    try {
                        var4_int = var4_int + param2;
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
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
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("ch.GA(").append(param0).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param1 == null) {
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
                    throw ci.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        lh var6 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, (byte) -91, param3, param0)) {
                this.a(param3, param0, false, param1);
                this.a(0, param3, param0, param1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 < -104) {
                break L2;
              } else {
                var6 = (lh) null;
                this.a(-37, -54, (lh) null, -3);
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ch.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    private final boolean b(byte param0, lh param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        lh var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_11_0 = null;
        lh stackIn_11_1 = null;
        Object stackIn_16_0 = null;
        lh stackIn_16_1 = null;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -118) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (this.field_J == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_7_0 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var4_int = -1 + this.field_J.length;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (-1 < (var4_int ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = this.field_J[var4_int];
                        stackIn_11_0 = null;
                        stackIn_11_1 = (lh) (var5);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 == stackIn_11_1) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (!var5.d(0)) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4_int = var4_int - param2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 > var4_int) {
                            statePc = 24;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = this.field_J[var4_int];
                        stackIn_11_0 = null;
                        stackIn_16_0 = stackIn_11_0;
                        stackIn_11_1 = (lh) (var6);
                        stackIn_16_1 = stackIn_11_1;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != stackIn_16_1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var6.a(1, param1)) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 1;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    try {
                        var4_int = var4_int - param2;
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_int--;
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0 != 0;
                }
                case 27: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_29_0 = (RuntimeException) (var4);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = new StringBuilder().append("ch.JA(").append(param0).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param1 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh[] var10 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != this.field_J) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var10 = this.field_J;
                        var5 = var10;
                        var6 = param0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 >= var10.length) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var7 = var10[var6];
                        discarded$3 = param3.append('\n');
                        if (var9 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 > param1) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        discarded$4 = param3.append(' ');
                        var8++;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var7 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7.a(param2, param3, (byte) -112, param1 - -1);
                        if (var9 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        discarded$5 = param3.append("null");
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (runtimeException);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("ch.Q(").append(param0).append(',').append(param1).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param2 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_22_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param3 == null) {
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
                    throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
                }
                case 24: {
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var5;
        lh var6;
        int var7;
        L0: {
          var7 = SteelSentinels.field_G;
          if (0 != param3) {
            break L0;
          } else {
            if (this.field_p == null) {
              break L0;
            } else {
              this.field_p.a(param2, (lh) (this), (byte) -30, true, param0);
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (null != this.field_J) {
              var5 = this.field_J.length + -1;
              L3: while (true) {
                if (0 > var5) {
                  break L2;
                } else {
                  var6 = this.field_J[var5];
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L4: {
                      if (var6 != null) {
                        var6.a(param0 - -this.field_z, (byte) -126, param2 - -this.field_o, param3);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var5--;
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          if (param1 <= -99) {
            break L1;
          } else {
            field_K = (String) null;
            break L1;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, pe param5, int param6, int param7) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_20_0 = 0;
        int[] stackIn_21_0 = null;
        int[] stackIn_22_0 = null;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        jj stackIn_44_0 = null;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        jj var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        pe var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var44 = param5;
                        if (null == var44.field_P) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (1 < var44.field_K) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        sn.a(0);
                        if (var40 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var60 = var44.field_P;
                        la.a(var60, 0, qe.field_a, 0, -32513);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param3 <= -114) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_H = (String) null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var54 = new int[param5.field_u];
                        var49 = var54;
                        var41 = var49;
                        var8 = var41;
                        var64 = new int[param5.field_u];
                        var61 = tc.field_A;
                        var62 = hm.field_c;
                        var63 = pi.field_e;
                        var13 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param5.field_u <= var13) {
                            statePc = 24;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var14 = var61[var13] * param6 + var62[var13] * param1 - -(param0 * var63[var13]) >> -461225144;
                        stackIn_26_0 = var14 ^ -1;
                        stackIn_12_0 = stackIn_26_0;
                        stackIn_26_1 = -1;
                        stackIn_12_1 = stackIn_26_1;
                        if (var40 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 > stackIn_12_1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var14 = -var14;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 <= var14) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_20_0 = 128;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var14 ^ -1) > -129) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackIn_20_0 = 256;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = var14 + 128;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = stackIn_20_0;
                        var15 = var63[var13] * param2 + param4 * var61[var13] + param7 * var62[var13] >> -1070993560;
                        stackIn_22_0 = kf.field_t;
                        stackIn_21_0 = stackIn_22_0;
                        if (-1 < (var15 ^ -1)) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_23_0 = (int[]) ((Object) stackIn_21_0);
                        stackIn_23_1 = var15;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (int[]) ((Object) stackIn_22_0);
                        stackIn_23_1 = -var15;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var15 = stackIn_23_0[stackIn_23_1];
                        var14 = var14 * (-var15 + 256) >>> -1836577048;
                        var54[var13] = var14;
                        var64[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var13 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = wl.field_D;
                        stackIn_26_1 = var13;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 <= stackIn_26_1) {
                            statePc = 61;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var14 = um.field_bb[var13];
                        var15 = param5.field_G[var14];
                        var16 = param5.field_j[var14];
                        var17 = param5.field_x[var14];
                        if (var40 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (param5.field_M[var14] >= tc.field_A.length) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackIn_31_0 = param5.field_M[var14];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = -1;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var18 = stackIn_31_0;
                        if (tc.field_A.length > param5.field_V[var14]) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_34_0 = -1;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackIn_34_0 = param5.field_V[var14];
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var19 = stackIn_34_0;
                        if (param5.field_T[var14] < tc.field_A.length) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_37_0 = -1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackIn_37_0 = param5.field_T[var14];
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var20 = stackIn_37_0;
                        if (pm.field_W == null) {
                            statePc = 43;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (null == param5.field_e) {
                            statePc = 43;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param5.field_e.length <= var14) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (param5.field_e[var14] == -1) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (param5.field_e[var14] >= pm.field_W.length) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackIn_44_0 = pm.field_W[param5.field_e[var14]];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = null;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var21 = stackIn_44_0;
                        var22 = eh.field_d[var15];
                        var23 = n.field_p[var15];
                        var24 = eh.field_d[var16];
                        var25 = n.field_p[var16];
                        var26 = eh.field_d[var17];
                        var27 = n.field_p[var17];
                        if (var19 != var18) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (var20 == var19) {
                            statePc = 51;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_50_0 = 8355711;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = var21.field_g;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var34 = stackIn_50_0;
                        var35 = var34 & 16711935;
                        var36 = 65280 & var34;
                        var37 = var35 * var28 >>> -528179448 & -2130771713 | 1912667904 & var36 * var28 >>> -1592337432;
                        var38 = var35 * var29 >>> -436502744 & -16842497 | (16711703 & var36 * var29) >>> -1548077496;
                        var39 = -1090453760 & var36 * var30 >>> -169890840 | (-16711709 & var35 * var30) >>> 540690536;
                        var37 = var37 + var31 * 65793;
                        var38 = var38 + 65793 * var32;
                        var39 = var39 + 65793 * var33;
                        wh.a(var37 >> -241908944, (var38 & 65525) >> 872677448, var39 >> -1456192656, var39 >> 322790216 & 255, var26, var22, 255 & var37 >> 1652434088, 255 & var38, 255 & var37, var27, 255 & var39, var24, 22, var23, var38 >> 391624368, var25);
                        if (var40 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var28 = var54[var18];
                        var29 = var64[var18];
                        if (var21 == null) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        stackIn_54_0 = var21.field_g;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackIn_54_0 = 8355711;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var30 = stackIn_54_0;
                        var31 = var30 & 16711935;
                        var32 = var30 & 65280;
                        var33 = 1812004608 & var28 * var32 >>> 205411400 | (var28 * var31 & -16711831) >>> 918423112;
                        var33 = var33 + var29 * 65793;
                        vl.a(var27, var25, var23, var24, var26, var33 >> -1960202239 & 8355711, false, var22);
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 57: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_59_0 = (RuntimeException) (var8_ref);
                    stackIn_58_0 = stackIn_59_0;
                    stackIn_59_1 = new StringBuilder().append("ch.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_58_1 = stackIn_59_1;
                    if (param5 == null) {
                        statePc = 59;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_58_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_58_1);
                    stackIn_60_2 = "{...}";
                    statePc = 60;
                    continue stateLoop;
                }
                case 59: {
                    stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
                    stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
                    stackIn_60_2 = "null";
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    throw ci.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param6 + ',' + param7 + ')');
                }
                case 61: {
                    return;
                }
                case 62: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String e(int param0) {
        lh[] var2 = null;
        int var3 = 0;
        lh var4 = null;
        String var5 = null;
        int var6 = 0;
        lh[] var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = SteelSentinels.field_G;
                    if (this.field_J != null) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var7 = this.field_J;
                    var2 = var7;
                    var3 = param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 < var7.length) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    var4 = var7[var3];
                    stackIn_7_0 = null;
                    stackIn_6_0 = stackIn_7_0;
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return (String) ((Object) stackIn_6_0);
                }
                case 7: {
                    if (stackIn_7_0 != var4) {
                        statePc = 10;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var6 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var5 = var4.e(0);
                    if (var5 != null) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return var5;
                }
                case 13: {
                    var3++;
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void f(int param0);

    private final boolean a(lh param0, byte param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -70) {
                break L1;
              } else {
                field_O = (k) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a((byte) -68, param0, 1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ch.KA(");

            if (param0 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_G = null;
        field_P = null;
        field_K = null;
        field_O = null;
        if (param0 != -68) {
          return;
        } else {
          field_H = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        RuntimeException runtimeException = null;
        lh[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (null != this.field_J) {
              var12 = this.field_J;
              var7 = var12;
              var8 = 19 % ((36 - param0) / 32);
              var9 = 0;
              L1: while (true) {
                L2: {
                  if (var12.length <= var9) {
                    break L2;
                  } else {
                    var10 = var12[var9];
                    if (var11 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      L3: {
                        if (var10 != null) {
                          var10.a((byte) 127, param1, this.field_z + param2, param3 + this.field_o, param4, param5);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var9++;
                      if (var11 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (runtimeException);

            stackIn_13_1 = new StringBuilder().append("ch.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void d(byte param0) {
        lh[] var2;
        int var3;
        lh var4;
        int var5;
        lh[] var6;
        var5 = SteelSentinels.field_G;
        var6 = this.field_J;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var6.length <= var3) {
                break L2;
              } else {
                var4 = var6[var3];
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (var4 != null) {
                      var4.d((byte) -45);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == -45) {
              break L1;
            } else {
              field_K = (String) null;
              break L1;
            }
          }
          return;
        }
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_I = (String) null;
        }
        return null != this.a(true) ? true : false;
    }

    ch(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pb.h(param3, param0, param1, param4, 12105914);
                        pb.e(1 + param3, param0 - -1, param1 + -2, -2 + param4, 10461345, 16251129);
                        var5_int = 64;
                        if (param2 == 32308) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ch.a((byte) 31);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var6 ^ -1) <= -7) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        pb.h(param3 - -var6, var6 + param0, param1 - 2 * var6, -(2 * var6) + param4, 16251129, var5_int);
                        var5_int = var5_int >> 813834401;
                        var6++;
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var5), "ch.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 10: {
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_J != null) {
              L1: {
                if (param0 < -34) {
                  break L1;
                } else {
                  field_I = (String) null;
                  break L1;
                }
              }
              var12 = this.field_J;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                L3: {
                  if (var9 >= var12.length) {
                    break L3;
                  } else {
                    L4: {
                      var10 = var12[var9];
                      if (var10 == null) {
                        break L4;
                      } else {
                        if (!var10.d(0)) {
                          break L4;
                        } else {
                          if (!var10.a((byte) -118, param1, param2, param3, param4, param5, param6)) {
                            break L4;
                          } else {
                            stackIn_12_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                    var9++;
                    if (var11 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_15_0 = 0;
                decompiledRegionSelector0 = 2;
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
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("ch.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_15_0 != 0;
          }
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        RuntimeException runtimeException = null;
        lh[] var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var8 = 0;
        lh[] var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 95, param2, param3);
            if (param1 > 56) {
              if (this.field_J == null) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var9 = this.field_J;
                var5 = var9;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var9.length <= var6) {
                      break L2;
                    } else {
                      var7 = var9[var6];
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L3: {
                          if (var7 == null) {
                            break L3;
                          } else {
                            var7.a(param0 - -this.field_o, 92, param2, param3 + this.field_z);
                            break L3;
                          }
                        }
                        var6++;
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("ch.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0, lh param1) {
        boolean discarded$1 = false;
        lh[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        int var6 = 0;
        lh var7 = null;
        lh[] var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var7 = (lh) null;
                discarded$1 = this.a((lh) null, (byte) 117);
                break L1;
              }
            }
            var8 = this.field_J;
            var3 = var8;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var8.length <= var4) {
                  break L3;
                } else {
                  L4: {
                    var5 = var8[var4];
                    if (var5 == null) {
                      break L4;
                    } else {
                      if (!var5.a(1, param1)) {
                        break L4;
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ch.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final lh a(boolean param0) {
        lh var4 = null;
        int var5 = SteelSentinels.field_G;
        if (null == this.field_J) {
            return null;
        }
        lh[] var2 = this.field_J;
        int var3 = 0;
        if (!param0) {
            field_H = (String) null;
        }
        do {
            if (var2.length <= var3) {
                return null;
            }
            var4 = var2[var3];
            if (var4 != null) {
                if (!(!var4.d(0))) {
                    return var4;
                }
            }
            var3++;
        } while (var5 == 0);
        return null;
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        lh[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        lh var10 = null;
        int var11 = 0;
        lh[] var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            if (this.field_J == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var12 = this.field_J;
              var8 = var12;
              var9 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 >= var12.length) {
                      break L3;
                    } else {
                      var10 = var12[var9];
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (var10 == null) {
                            break L4;
                          } else {
                            if (var10.a(param0, param1, this.field_o + param2, param3, this.field_z + param4, true, param6)) {
                              stackIn_12_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var9++;
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param5) {
                    break L2;
                  } else {
                    field_L = -105;
                    return false;
                  }
                }
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8_ref);

            stackIn_20_1 = new StringBuilder().append("ch.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_17_0 != 0;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -88, param2, param3, param4);
        this.f(140);
        if (param1 > -71) {
            field_O = (k) null;
        }
    }

    final static wk[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int statePc = 0;
        int var9 = 0;
        wk[] var10 = null;
        wk[] var11_ref_wk__ = null;
        int var11 = 0;
        int var12 = 0;
        wk var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = SteelSentinels.field_G;
                    var9 = param7 + (param1 + param8);
                    var10 = new wk[]{new wk(var9, var9), new wk(param0, var9), new wk(var9, var9), new wk(var9, param0), new wk(64, 64), new wk(var9, param0), new wk(var9, var9), new wk(param0, var9), new wk(var9, var9)};
                    var11_ref_wk__ = var10;
                    if (param2 == 4) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_N = -114;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var12 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var12 >= var11_ref_wk__.length) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var13 = var11_ref_wk__[var12];
                    stackIn_13_0 = 0;
                    stackIn_5_0 = stackIn_13_0;
                    if (var15 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var14 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var13.field_E.length <= var14) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var13.field_E[var14] = param6;
                    var14++;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (var15 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var12++;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var15 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var11 = stackIn_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (var11 >= param1) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_24_0 = 0;
                    stackIn_16_0 = stackIn_24_0;
                    if (var15 != 0) {
                        statePc = 24;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var12 = stackIn_16_0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var9 <= var12) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var10[6].field_E[var12 + var9 * (-1 + (-var11 + var9))] = param3;
                    var10[8].field_E[var9 * (-var11 + (var9 + -1)) + var12] = param3;
                    var10[2].field_E[var9 * var12 - 1 - (-var9 + var11)] = param3;
                    var10[8].field_E[-1 - -var9 - var11 + var12 * var9] = param3;
                    var12++;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var15 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var15 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = 0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11 = stackIn_24_0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_26_0 = var11;
                    stackIn_26_1 = param1;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (stackIn_26_0 >= stackIn_26_1) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_36_0 = 0;
                    stackIn_28_0 = stackIn_36_0;
                    if (var15 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var12 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (var12 >= var9) {
                        statePc = 34;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var10[0].field_E[var11 * var9 + var12] = param5;
                    var10[0].field_E[var11 + var9 * var12] = param5;
                    stackIn_26_0 = -var11 + var9 ^ -1;
                    stackIn_31_0 = stackIn_26_0;
                    stackIn_26_1 = var12 ^ -1;
                    stackIn_31_1 = stackIn_26_1;
                    if (var15 != 0) {
                        statePc = 26;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    if (stackIn_31_0 >= stackIn_31_1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var10[2].field_E[var12 - -(var9 * var11)] = param5;
                    var10[6].field_E[var11 + var9 * var12] = param5;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 29;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = 0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    var11 = stackIn_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (var11 >= param0) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    stackIn_47_0 = 0;
                    stackIn_39_0 = stackIn_47_0;
                    if (var15 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var12 = stackIn_39_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var12 >= param1) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var10[7].field_E[(-1 + (-var12 + var9)) * param0 - -var11] = param3;
                    var10[5].field_E[-1 - (-var9 - (-var12 + var11 * var9))] = param3;
                    var10[1].field_E[var12 * param0 + var11] = param5;
                    var10[3].field_E[var11 * var9 - -var12] = param5;
                    var12++;
                    if (var15 != 0) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (var15 == 0) {
                        statePc = 40;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    var11++;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (var15 == 0) {
                        statePc = 37;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_47_0 = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    var11 = stackIn_47_0;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (param0 >> 928002657 <= var11) {
                        statePc = 56;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var12 = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (param7 <= var12) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10[1].field_E[var11 + param0 * (var9 + (-var12 + -1))] = param4;
                    var10[3].field_E[var9 * var11 + -var12 + (var9 + -1)] = param4;
                    var10[7].field_E[param0 * var12 + var11] = param4;
                    var10[5].field_E[var9 * var11 + var12] = param4;
                    var12++;
                    if (var15 != 0) {
                        statePc = 55;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var15 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    if (var15 == 0) {
                        statePc = 48;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int b(boolean param0) {
        int var2;
        lh[] var3;
        int var4;
        lh var5;
        int var6;
        int var7;
        L0: {
          var7 = SteelSentinels.field_G;
          var2 = 0;
          var3 = this.field_J;
          if (param0) {
            break L0;
          } else {
            field_P = (String) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= var3.length) {
              break L2;
            } else {
              L3: {
                var5 = var3[var4];
                if (var5 == null) {
                  break L3;
                } else {
                  var6 = var5.b(true);
                  if (var2 >= var6) {
                    break L3;
                  } else {
                    var2 = var6;
                    break L3;
                  }
                }
              }
              var4++;
              if (var7 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var2;
        }
    }

    static {
        field_K = "You must play <%1> more rated games before playing with the current options.";
        field_P = "Game options changed (<%0>)";
        field_N = -1;
        field_I = "<%1> met <%0>'s magic bullet";
        field_L = 4;
        field_M = "Respect";
        field_H = "Cancel unrated rematch";
    }
}
