/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class se extends cf implements dh {
    th field_B;
    static re field_F;
    static int field_E;
    static String field_D;
    static int field_C;

    final boolean a(cf param0, int param1) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        cf var4 = null;
        int var5 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new ch(this.field_B);
              if (param1 == 0) {
                break L1;
              } else {
                this.c((byte) -102);
                break L1;
              }
            }
            var4 = (cf) ((Object) var3.c(-3));
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var4.a(param0, param1 ^ 0);
                    stackIn_11_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        var4 = (cf) ((Object) var3.a((byte) -89));
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("se.S(");

            if (param0 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final boolean c(int param0) {
        if (param0 < 123) {
            return false;
        }
        return this.g(121) != null ? true : false;
    }

    boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        cf var8 = null;
        cf var9 = null;
        ch var10 = null;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var10 = new ch(this.field_B);
            var9 = (cf) ((Object) var10.c(-3));
            L1: while (true) {
              L2: {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var9.b(4);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var9.c(127)) {
                            break L4;
                          } else {
                            if (!var9.a(param0, param1, param2, -6208)) {
                              break L4;
                            } else {
                              stackIn_8_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                        var9 = (cf) ((Object) var10.a((byte) -126));
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_11_0 = param3;
                break L2;
              }
              L5: {
                if (stackIn_11_0 == -6208) {
                  break L5;
                } else {
                  var8 = (cf) null;
                  this.b((byte) 124, (cf) null);
                  break L5;
                }
              }
              var6 = param0;
              if ((var6 ^ -1) != -81) {
                stackIn_19_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L6: {
                  if (!lc.field_m[81]) {
                    stackIn_17_0 = this.a(param3 + 6319, param2);
                    break L6;
                  } else {
                    stackIn_17_0 = this.a((byte) -1, param2);
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("se.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final void a(int param0, cf param1, int param2, int param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        ch var7 = null;
        cf var8 = null;
        int var9 = 0;
        cf var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                var10 = (cf) null;
                this.a(64, (cf) null, 84, 126);
                break L1;
              }
            }
            var7 = new ch(this.field_B);
            var8 = (cf) ((Object) var7.c(-3));
            L2: while (true) {
              L3: {
                if (var8 == null) {
                  break L3;
                } else {
                  if (!var8.b(4)) {
                    break L3;
                  } else {
                    var8.a(param0, param1, param2 + this.field_i, param3, true, param5 + this.field_y);
                    var8 = (cf) ((Object) var7.a((byte) -80));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("se.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        ch var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_16_0 = false;
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
        boolean stackOut_9_0;
        boolean stackOut_15_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!this.field_B.f(28113)) {
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
                        if (param0 > 20) {
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
                        var8 = new ch(this.field_B);
                        var4 = (cf) ((Object) var8.c(-3));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 22;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var4.c(126);
                        stackIn_23_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                            statePc = 23;
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
                        if (stackIn_10_0) {
                            statePc = 13;
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
                        if (var7 == 0) {
                            statePc = 21;
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
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var5 = new ch(this.field_B);
                        var5.a(2680, var4);
                        var6 = (cf) ((Object) var5.a((byte) -36));
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var6 == null) {
                            statePc = 21;
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
                        stackOut_15_0 = var6.a(param1, 0);
                        stackIn_23_0 = stackOut_15_0 ? 1 : 0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var7 != 0) {
                            statePc = 23;
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
                        if (stackIn_16_0) {
                            statePc = 18;
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
                        statePc = 20;
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
                        var6 = (cf) ((Object) var5.a((byte) -58));
                        if (var7 == 0) {
                            statePc = 14;
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
                        var4 = (cf) ((Object) var8.a((byte) -126));
                        if (var7 == 0) {
                            statePc = 8;
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
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var3);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("se.AB(").append(param0).append(',');
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
                    throw fa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    String d(byte param0) {
        String var5 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(this.field_B);
        int var3 = -21 / ((53 - param0) / 57);
        cf var4 = (cf) ((Object) var2.c(-3));
        do {
            if (var4 == null) {
                return null;
            }
            var5 = var4.d((byte) 112);
            if (var5 != null) {
                return var5;
            }
            var4 = (cf) ((Object) var2.a((byte) -46));
        } while (var6 == 0);
        return null;
    }

    void a(int param0, int param1, int param2, int param3) {
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        ch var8 = null;
        ch var9 = null;
        ch var10 = null;
        ch var11 = null;
        ch var12 = null;
        ch var13 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param2 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 == -2) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    field_D = (String) null;
                    statePc = 11;
                    continue stateLoop;
                }
                case 3: {
                    var8 = new ch(this.field_B);
                    var6 = (cf) ((Object) var8.a(32397));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var8.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    var9 = new ch(this.field_B);
                    var5 = var9;
                    var6 = (cf) ((Object) var9.a(32397));
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var6 != null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                case 14: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var9.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var7 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 20: {
                    if (this.field_h != null) {
                        statePc = 39;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (param0 == -2) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    field_D = (String) null;
                    statePc = 31;
                    continue stateLoop;
                }
                case 23: {
                    var10 = new ch(this.field_B);
                    var6 = (cf) ((Object) var10.a(32397));
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (var6 != null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                case 26: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var10.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return;
                }
                case 28: {
                    if (var7 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    var11 = new ch(this.field_B);
                    var5 = var11;
                    var6 = (cf) ((Object) var11.a(32397));
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (var6 != null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return;
                }
                case 34: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var11.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    return;
                }
                case 36: {
                    if (var7 == 0) {
                        statePc = 32;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    return;
                }
                case 39: {
                    this.field_h.a(true, param1, -15112, param3, (cf) (this));
                    if (param0 == -2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    field_D = (String) null;
                    statePc = 50;
                    continue stateLoop;
                }
                case 41: {
                    var12 = new ch(this.field_B);
                    var5 = var12;
                    var6 = (cf) ((Object) var12.a(32397));
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (var6 != null) {
                        statePc = 44;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    return;
                }
                case 44: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var12.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    return;
                }
                case 46: {
                    if (var7 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    return;
                }
                case 50: {
                    var13 = new ch(this.field_B);
                    var5 = var13;
                    var6 = (cf) ((Object) var13.a(32397));
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (var6 != null) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return;
                }
                case 54: {
                    var6.a(-2, param1 - -this.field_i, param2, this.field_y + param3);
                    var6 = (cf) ((Object) var13.e(param0 ^ 3));
                    if (var7 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    if (var7 == 0) {
                        statePc = 51;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(int param0) {
        ch var2 = null;
        cf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    var2 = new ch(this.field_B);
                    var4 = -105 % ((param0 - 36) / 61);
                    var3 = (cf) ((Object) var2.c(-3));
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var3 != null) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3.e(-1);
                    var3 = (cf) ((Object) var2.a((byte) -34));
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(byte param0, cf param1) {
        RuntimeException var3 = null;
        cf var4 = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        cf var8 = null;
        ch var9 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_9_0;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_B.f(28113)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var9 = new ch(this.field_B);
                        if (param0 == -1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = (cf) null;
                        this.a((cf) null, 48);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = (cf) ((Object) var9.a(32397));
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == null) {
                            statePc = 19;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = var4.c(125);
                        stackIn_20_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = new ch(this.field_B);
                        var5.b(-4, var4);
                        var6 = (cf) ((Object) var5.e(-3));
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var6 == null) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = var6.a(param1, 0);
                        stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        var6 = (cf) ((Object) var5.e(param0 ^ 2));
                        if (var7 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var4 = (cf) ((Object) var9.e(-3));
                        if (var7 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var3);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("se.IB(").append(param0).append(',');
                    stackIn_22_1 = stackIn_23_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
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
              if (this.a(param1, -81, param3, param2)) {
                this.a(param2, param3, (byte) 26, param1);
                this.a(param1, param2, -92, param3);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 7) {
                break L2;
              } else {
                field_E = 118;
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("se.GA(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        cf var6 = null;
        int var7 = 0;
        int var8 = 0;
        ch var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
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
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var9 = new ch(this.field_B);
                        var6 = (cf) ((Object) var9.c(-3));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        discarded$2 = param3.append('\n');
                        stackIn_12_0 = 0;
                        stackIn_4_0 = stackIn_12_0;
                        if (var8 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var7 = stackIn_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 < var7) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        discarded$3 = param3.append(' ');
                        var7++;
                        if (var8 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6.a(7, param0, 1 + param1, param3);
                        var6 = (cf) ((Object) var9.a((byte) -94));
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var8 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = param2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 < -79) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_D = (String) null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("se.KB(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param3 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ch var5 = null;
        cf var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            var5 = new ch(this.field_B);
            var6 = (cf) ((Object) var5.c(-3));
            L1: while (true) {
              L2: {
                if (var6 == null) {
                  break L2;
                } else {
                  if (!var6.b(4)) {
                    break L2;
                  } else {
                    var6.a(-5407, param1, param2 - -this.field_y, param3 + this.field_i);
                    var6 = (cf) ((Object) var5.a((byte) -59));
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("se.T(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, cf param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        cf var10 = null;
        int var11 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var9 = -59 / ((48 - param0) / 37);
            var8 = new ch(this.field_B);
            var10 = (cf) ((Object) var8.c(-3));
            L1: while (true) {
              L2: {
                L3: {
                  if (var10 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var10.b(4);
                    stackIn_11_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var10.c(126)) {
                            break L4;
                          } else {
                            if (!var10.a((byte) 105, param1, param2, param3, param4, param5, param6)) {
                              break L4;
                            } else {
                              stackIn_8_0 = 1;
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                        var10 = (cf) ((Object) var8.a((byte) -50));
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var8_ref);

            stackIn_14_1 = new StringBuilder().append("se.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_F = null;
        field_D = null;
    }

    final void b(byte param0, cf param1) {
        try {
            if (param0 <= 38) {
                field_D = (String) null;
            }
            this.field_B.a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "se.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int var2;
        ch var3;
        cf var4;
        int var5;
        int var6;
        StringBuilder var7;
        int var8;
        int var9;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        var3 = new ch(this.field_B);
        var4 = (cf) ((Object) var3.c(param0 + -47));
        L0: while (true) {
          L1: {
            if (var4 == null) {
              break L1;
            } else {
              var5 = var4.f((byte) 44);
              var9 = var2 ^ -1;
              var8 = var5 ^ -1;
              if (var6 != 0) {
                if (var8 != var9) {
                  var7 = (StringBuilder) null;
                  this.a((Hashtable) null, 57, 123, (StringBuilder) null);
                  return var2;
                } else {
                  return var2;
                }
              } else {
                L2: {
                  if (var8 < var9) {
                    var2 = var5;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4 = (cf) ((Object) var3.a((byte) -74));
                if (var6 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param0 != 44) {
            var7 = (StringBuilder) null;
            this.a((Hashtable) null, 57, 123, (StringBuilder) null);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final void c(byte param0) {
        int statePc = 0;
        ch var2 = null;
        cf var3 = null;
        int var4 = 0;
        ch var5 = null;
        ch var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (param0 == 32) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_B = (th) null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 2: {
                    var5 = new ch(this.field_B);
                    var2 = var5;
                    var3 = (cf) ((Object) var5.c(-3));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 6: {
                    var3.c((byte) 32);
                    var3 = (cf) ((Object) var5.a((byte) -50));
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var8 = new ch(this.field_B);
                    var2 = var8;
                    var3 = (cf) ((Object) var8.c(-3));
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    if (var3 != null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 14: {
                    var3.c((byte) 32);
                    var3 = (cf) ((Object) var8.a((byte) -50));
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 16: {
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    se(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4, (bj) null);
        this.field_B = new th();
    }

    cf g(int param0) {
        ch var2;
        cf var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 >= 88) {
          var2 = new ch(this.field_B);
          var3 = (cf) ((Object) var2.c(-3));
          L0: while (true) {
            if (var3 != null) {
              if (!var3.c(125)) {
                var3 = (cf) ((Object) var2.a((byte) -40));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          field_F = (re) null;
          var2 = new ch(this.field_B);
          var3 = (cf) ((Object) var2.c(-3));
          L1: while (true) {
            if (var3 != null) {
              if (!var3.c(125)) {
                var3 = (cf) ((Object) var2.a((byte) -40));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, cf param3, int param4, int param5, int param6) {
        ch var8 = null;
        RuntimeException var8_ref = null;
        cf var9 = null;
        int var10 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ch(this.field_B);
              if (param4 == -24) {
                break L1;
              } else {
                field_C = 84;
                break L1;
              }
            }
            var9 = (cf) ((Object) var8.c(-3));
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var9.b(4);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0, param1, param2, param3, -24, param5 - -this.field_y, param6 - -this.field_i)) {
                          var9 = (cf) ((Object) var8.a((byte) -81));
                          if (var10 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackIn_9_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackIn_12_0 = 0;
                break L3;
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var8_ref);

            stackIn_15_1 = new StringBuilder().append("se.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.f(param2 + -29048);
    }

    static {
        field_F = new re();
        field_D = "Return to the Laboratory";
        field_E = 0;
    }
}
