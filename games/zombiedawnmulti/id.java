/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class id extends ff {
    int field_C;
    static String field_x;
    static String field_A;
    int field_z;
    static ak field_B;
    int field_y;
    static int field_D;
    int field_E;

    abstract void f(byte param0);

    abstract void a(int param0, nm param1);

    final static void d(byte param0) {
        br var1 = null;
        RuntimeException var1_ref = null;
        br var2 = null;
        int var3 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_22_0 = false;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_21_0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_D = -84;
                break L1;
              }
            }
            var1 = fd.field_M.c(49);
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        if (!(var1 instanceof wj)) {
                          break L7;
                        } else {
                          var2 = var1.field_d;
                          stackIn_12_0 = ((wj) ((Object) var1)).field_m.k();

                          if (var3 != 0) {
                            L8: while (true) {
                              if (!stackIn_12_0) {
                                break L5;
                              } else {
                                var2 = var1.field_d;
                                stackIn_20_0 = ((wj) ((Object) var1)).field_m.k();

                                if (var3 != 0) {
                                  break L6;
                                } else {
                                  L9: {
                                    if (stackIn_20_0) {
                                      var1.a(true);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var1 = var2;
                                  if (var3 == 0) {
                                    stackIn_12_0 = var1 instanceof wj;
                                    continue L8;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            L10: {
                              if (stackIn_12_0) {
                                var1.a(true);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var1 = var2;
                            if (var3 == 0) {
                              continue L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      var1 = qo.field_q.c(param0 ^ 68);
                      L11: while (true) {
                        stackIn_12_0 = var1 instanceof wj;
                        if (!stackIn_12_0) {
                          break L5;
                        } else {
                          var2 = var1.field_d;
                          stackIn_20_0 = ((wj) ((Object) var1)).field_m.k();

                          if (var3 != 0) {
                            break L6;
                          } else {
                            L12: {
                              if (stackIn_20_0) {
                                var1.a(true);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var1 = var2;
                            if (var3 == 0) {
                              continue L11;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    L13: while (true) {
                      if (!stackIn_20_0) {
                        break L4;
                      } else {
                        var2 = var1.field_d;
                        stackOut_21_0 = ((wj) ((Object) var1)).field_m.k();
                        stackIn_27_0 = stackOut_21_0 ? 1 : 0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var3 != 0) {
                          break L3;
                        } else {
                          L14: {
                            if (stackIn_22_0) {
                              var1.a(true);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var1 = var2;
                          if (var3 == 0) {
                            stackIn_20_0 = var1 instanceof wj;
                            continue L13;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var1 = jp.field_c.c(80);
                  L15: while (true) {
                    stackIn_20_0 = var1 instanceof wj;
                    if (!stackIn_20_0) {
                      break L4;
                    } else {
                      var2 = var1.field_d;
                      stackOut_21_0 = ((wj) ((Object) var1)).field_m.k();
                      stackIn_27_0 = stackOut_21_0 ? 1 : 0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        L16: {
                          if (stackIn_22_0) {
                            var1.a(true);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var1 = var2;
                        if (var3 == 0) {
                          continue L15;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                stackIn_27_0 = 127;
                break L3;
              }
              L17: {
                wp.b(stackIn_27_0);
                if (null == td.field_b) {
                  break L17;
                } else {
                  if (wd.field_L.c(-37)) {
                    break L17;
                  } else {
                    fk.a(td.field_b, true);
                    td.field_b = null;
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "id.S(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        field_B = null;
        if (param0 < 60) {
            field_x = (String) null;
            field_x = null;
            field_A = null;
            return;
        }
        field_x = null;
        field_A = null;
    }

    final int h(int param0) {
        int var2 = 60 / ((12 - param0) / 58);
        return this.field_E >> -500960720;
    }

    final static ld a(cj param0, cj param1, byte param2, int[] param3, cj param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        ld[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        tl var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_11_0 = null;
        ld stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        Exception var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = param3.length;
                        var6 = new String[var5_int];
                        var14 = new char[var5_int];
                        var13 = var14;
                        var7 = var13;
                        var8 = new ld[var5_int];
                        var9 = 49;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var5_int <= var10_int) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var11 = bd.field_c.a(param3[var10_int], -11452);
                        var6[var10_int] = var11.e(-18572);
                        var9 = (char)(var9 + 1);
                        var7[var10_int] = (char)var9;
                        var8[var10_int] = null;
                        var10_int++;
                        if (var12 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var12 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param2 == -65) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_D = -90;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 10 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var10 = (Exception) ((Object) caughtException);
                        stackIn_11_0 = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (ld) ((Object) stackIn_11_0);
                }
                case 12: {
                    try {
                        stackIn_13_0 = new ld(0L, param0, param4, param1, var8, param3, var6, var14);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var5);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("id.P(");
                    stackIn_15_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
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
                    stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');
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
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
                    stackIn_24_1 = stackIn_25_1;
                    if (param4 == null) {
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
                    throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int g(int param0) {
        int var2 = -126 / ((param0 - 13) / 45);
        return this.field_z >> -735148080;
    }

    id(int param0, int param1, int param2) {
        this.field_C = param2;
        this.field_E = param1 << 1205882640;
        this.field_z = param0 << -268982768;
    }

    static {
        field_A = "Unable to delete name - system busy";
        field_x = "Hide chat";
    }
}
