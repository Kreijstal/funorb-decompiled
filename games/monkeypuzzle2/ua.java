/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ua extends we implements ga {
    static int[] field_w;
    static String field_y;
    pj field_u;
    static pj field_v;
    static sj[] field_x;

    final void e(int param0) {
        int statePc = 0;
        ck var2 = null;
        we var3 = null;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = new ck(this.field_u);
                    var3 = (we) ((Object) var2.a((byte) -37));
                    if (param0 != 13104) {
                        statePc = 7;
                    } else {
                        statePc = 1;
                    }
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
                    var3.e(13104);
                    var3 = (we) ((Object) var2.a(true));
                    if (var4 == 0) {
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
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    this.e(53);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    if (var3 != null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    var3.e(13104);
                    var3 = (we) ((Object) var2.a(true));
                    if (var4 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (var4 == 0) {
                        statePc = 8;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int f(int param0) {
        int var2;
        ck var3;
        we var4;
        int var5;
        int var6;
        int stackIn_5_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0;
        var3 = new ck(this.field_u);
        var4 = (we) ((Object) var3.a((byte) -37));
        L0: while (true) {
          if (var4 != null) {
            var5 = var4.f(0);
            stackIn_5_0 = var2 ^ -1;

            if (var6 == 0) {
              L1: {
                if (stackIn_5_0 > (var5 ^ -1)) {
                  var2 = var5;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = (we) ((Object) var3.a(true));
              if (var6 == 0) {
                continue L0;
              } else {
                return var2;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return var2;
          }
        }
    }

    final boolean a(we param0, boolean param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        we var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        ck stackIn_13_0 = null;
        ck stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = new ck(this.field_u);
            if (!param1) {
              var4 = (we) ((Object) var3.a((byte) -37));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var4.a(param0, false);
                      stackIn_16_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (stackIn_7_0) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          L4: {
                            stackIn_13_0 = (ck) (var3);

                            if (param1) {
                              stackIn_14_0 = (ck) ((Object) stackIn_13_0);
                              stackIn_14_1 = 0;
                              break L4;
                            } else {
                              stackIn_14_0 = (ck) ((Object) stackIn_13_0);
                              stackIn_14_1 = 1;
                              break L4;
                            }
                          }
                          var4 = (we) ((Object) ((ck) (Object) stackIn_14_0).a(stackIn_14_1 != 0));
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  break L2;
                }
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
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ua.AA(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c((byte) 96);
    }

    final void b(byte param0, we param1) {
        if (param0 >= -17) {
            return;
        }
        try {
            this.field_u.a(-8212, param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ua.SB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(we param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -103);
              var5 = new ck(this.field_u);
              var6 = (we) ((Object) var5.a((byte) -37));
              if (param3 < -13) {
                break L1;
              } else {
                field_v = (pj) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var6 == null) {
                  break L3;
                } else {
                  if (!var6.d(-3548)) {
                    break L3;
                  } else {
                    var6.a(param0, param1 + this.field_e, param2 + this.field_r, (byte) -64);
                    var6 = (we) ((Object) var5.a(true));
                    if (var7 == 0) {
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
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("ua.E(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(int param0) {
        if (param0 >= 81) {
          if (hl.field_d != null) {
            if (hl.field_d.h()) {
              hl.field_d = li.a(ke.field_h[6], 100, 96);
              na.a((byte) 35, hl.field_d);
              return;
            } else {
              return;
            }
          } else {
            hl.field_d = li.a(ke.field_h[6], 100, 96);
            na.a((byte) 35, hl.field_d);
            return;
          }
        } else {
          field_w = (int[]) null;
          if (hl.field_d != null) {
            if (hl.field_d.h()) {
              hl.field_d = li.a(ke.field_h[6], 100, 96);
              na.a((byte) 35, hl.field_d);
              return;
            } else {
              return;
            }
          } else {
            hl.field_d = li.a(ke.field_h[6], 100, 96);
            na.a((byte) 35, hl.field_d);
            return;
          }
        }
    }

    private final void b(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        int var8 = 0;
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
        RuntimeException var5_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = new ck(this.field_u);
                        var6 = (we) ((Object) var5.a((byte) -37));
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
                        discarded$2 = param2.append('\n');
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
                        if (var7 > param1) {
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
                        discarded$3 = param2.append(' ');
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
                        var6.a(false, param2, param0, 1 + param1);
                        var6 = (we) ((Object) var5.a(true));
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
                        stackIn_12_0 = param3;
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
                        if (stackIn_12_0 == 13467) {
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
                        field_w = (int[]) null;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var5_ref);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ua.WB(");
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
                    stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param2 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        we var7 = null;
        int var8 = 0;
        ck var9 = null;
        boolean stackIn_4_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var9 = new ck(this.field_u);
            var6 = -77 % ((param3 - 37) / 50);
            var7 = (we) ((Object) var9.a((byte) -37));
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var7.d(-3548);
                    stackIn_12_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        L4: {
                          if (!var7.b((byte) 103)) {
                            break L4;
                          } else {
                            if (var7.a(param0, param1, param2, 124)) {
                              stackIn_9_0 = 1;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var7 = (we) ((Object) var9.a(true));
                        if (var8 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var6 = param2;
                stackIn_12_0 = 80;
                break L2;
              }
              if (stackIn_12_0 != var6) {
                stackIn_18_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L5: {
                  if (!dl.field_c[81]) {
                    stackIn_16_0 = this.b(param0, false);
                    break L5;
                  } else {
                    stackIn_16_0 = this.a((byte) 119, param0);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("ua.V(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_18_0 != 0;
          }
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        ck var8 = null;
        ck var37 = null;
        ck var56 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param1 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (this.field_h == null) {
                        statePc = 16;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_h.a(true, (we) (this), param2, param3, 69);
                    statePc = 29;
                    continue stateLoop;
                }
                case 3: {
                    var8 = new ck(this.field_u);
                    var5 = var8;
                    var6 = (we) ((Object) var8.b((byte) -102));
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var6 != null) {
                        statePc = 9;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (param0 == 30) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    this.b((byte) 23);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 9: {
                    var6.a(param0 ^ 0, param1, this.field_e + param2, param3 + this.field_r);
                    var6 = (we) ((Object) var8.a(param0 + -3733));
                    if (var7 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    return;
                }
                case 11: {
                    if (var7 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param0 == 30) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    this.b((byte) 23);
                    return;
                }
                case 14: {
                    return;
                }
                case 16: {
                    var37 = new ck(this.field_u);
                    var5 = var37;
                    var6 = (we) ((Object) var37.b((byte) -102));
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (var6 == null) {
                        statePc = 25;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var6.a(param0 ^ 0, param1, this.field_e + param2, param3 + this.field_r);
                    var6 = (we) ((Object) var37.a(param0 + -3733));
                    if (var7 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    return;
                }
                case 20: {
                    if (var7 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (param0 == 30) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    this.b((byte) 23);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 25: {
                    if (param0 == 30) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    this.b((byte) 23);
                    return;
                }
                case 28: {
                    return;
                }
                case 29: {
                    var56 = new ck(this.field_u);
                    var5 = var56;
                    var6 = (we) ((Object) var56.b((byte) -102));
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (var6 == null) {
                        statePc = 39;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var6.a(param0 ^ 0, param1, this.field_e + param2, param3 + this.field_r);
                    var6 = (we) ((Object) var56.a(param0 + -3733));
                    if (var7 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    return;
                }
                case 33: {
                    if (var7 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (param0 == 30) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.b((byte) 23);
                    return;
                }
                case 37: {
                    return;
                }
                case 39: {
                    if (param0 == 30) {
                        statePc = 42;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    this.b((byte) 23);
                    return;
                }
                case 42: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void j(int param0) {
        field_w = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            return;
        }
        field_x = null;
    }

    final String a(byte param0) {
        ck var2;
        we var3;
        String var4;
        int var5;
        Object stackIn_4_0 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = new ck(this.field_u);
        var3 = (we) ((Object) var2.a((byte) -37));
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              var4 = var3.a((byte) 54);
              stackIn_4_0 = null;

              if (var5 == 0) {
                if (stackIn_4_0 != var4) {
                  return var4;
                } else {
                  var3 = (we) ((Object) var2.a(true));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              } else {
                return (String) ((Object) stackIn_4_0);
              }
            }
          }
          if (param0 == 54) {
            return null;
          } else {
            this.a(89, -46, 124, -95);
            return null;
          }
        }
    }

    private final void c(byte param0) {
        ck var2 = null;
        we var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = new ck(this.field_u);
                    if (param0 >= 80) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b((byte) -67);
                    statePc = 9;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (we) ((Object) var2.a((byte) -37));
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var3 != null) {
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
                    var3.g(-1);
                    var3 = (we) ((Object) var2.a(true));
                    if (var4 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    if (var4 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return;
                }
                case 9: {
                    var3 = (we) ((Object) var2.a((byte) -37));
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var3 != null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    var3.g(-1);
                    var3 = (we) ((Object) var2.a(true));
                    if (var4 == 0) {
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
                    if (var4 == 0) {
                        statePc = 10;
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

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        we var9 = null;
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
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new ck(this.field_u);
              if (param3 == -1625) {
                break L1;
              } else {
                ua.j(-119);
                break L1;
              }
            }
            var9 = (we) ((Object) var8.a((byte) -37));
            L2: while (true) {
              L3: {
                L4: {
                  if (var9 == null) {
                    break L4;
                  } else {
                    stackOut_5_0 = var9.d(-3548);
                    stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (!stackIn_6_0) {
                        break L4;
                      } else {
                        if (!var9.a(param0 - -this.field_e, param1, param2, -1625, param4, param5, param6 + this.field_r)) {
                          var9 = (we) ((Object) var8.a(true));
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

            stackIn_15_1 = new StringBuilder().append("ua.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ck var7 = null;
        we var8 = null;
        int var9 = 0;
        we var10 = null;
        boolean stackIn_4_0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        RuntimeException var7_ref = null;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var7 = new ck(this.field_u);
            var8 = (we) ((Object) var7.a((byte) -37));
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var8.d(-3548);
                    stackIn_7_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      if (!stackIn_4_0) {
                        break L3;
                      } else {
                        var8.a(this.field_e + param0, param1, param2, param3, 0, param5 + this.field_r);
                        var8 = (we) ((Object) var7.a(true));
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackIn_7_0 = param4;
                break L2;
              }
              L4: {
                if (stackIn_7_0 == 0) {
                  break L4;
                } else {
                  var10 = (we) null;
                  this.a(122, 7, (we) null, -60, 25, -69);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var7_ref);

            stackIn_12_1 = new StringBuilder().append("ua.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean b(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 < 38) {
          L0: {
            this.a((byte) 92);
            if (null == this.a(true)) {
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
            if (null == this.a(true)) {
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

    we a(boolean param0) {
        ck var2;
        we var3;
        int var4;
        we var5;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = new ck(this.field_u);
        if (param0) {
          var3 = (we) ((Object) var2.a((byte) -37));
          L0: while (true) {
            if (var3 != null) {
              if (var3.b((byte) 40)) {
                return var3;
              } else {
                var3 = (we) ((Object) var2.a(param0));
                if (var4 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          var5 = (we) null;
          this.a((byte) -39, (we) null);
          var3 = (we) ((Object) var2.a((byte) -37));
          L1: while (true) {
            if (var3 != null) {
              if (var3.b((byte) 40)) {
                return var3;
              } else {
                var3 = (we) ((Object) var2.a(param0));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    final boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        ck var8 = null;
        RuntimeException var8_ref = null;
        we var9 = null;
        int var10 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param6 < -109) {
              var8 = new ck(this.field_u);
              var9 = (we) ((Object) var8.a((byte) -37));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 == null) {
                      break L3;
                    } else {
                      stackOut_6_0 = var9.d(-3548);
                      stackIn_15_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          L4: {
                            if (!var9.b((byte) 87)) {
                              break L4;
                            } else {
                              if (var9.a(param0, param1, param2, param3, param4, param5, -119)) {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var9 = (we) ((Object) var8.a(true));
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_15_0 = 0;
                  break L2;
                }
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
          L5: {
            var8_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var8_ref);

            stackIn_18_1 = new StringBuilder().append("ua.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final boolean b(we param0, boolean param1) {
        RuntimeException var3 = null;
        we var4 = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        ck var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_10_0;
        boolean stackOut_14_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        if (this.field_u.e(11253)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var8 = new ck(this.field_u);
                        var4 = (we) ((Object) var8.a((byte) -37));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == null) {
                            statePc = 21;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var4.b((byte) 122);
                        stackIn_22_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = new ck(this.field_u);
                        var5.a((byte) -127, (ug) (var4));
                        var6 = (we) ((Object) var5.a(true));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == null) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var6.a(param0, false);
                        stackIn_22_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var7 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
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
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    try {
                        var6 = (we) ((Object) var5.a(true));
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var4 = (we) ((Object) var8.a(true));
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackIn_22_0 = 0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_25_0 = (RuntimeException) (var3);
                    stackIn_24_0 = stackIn_25_0;
                    stackIn_25_1 = new StringBuilder().append("ua.TB(");
                    stackIn_24_1 = stackIn_25_1;
                    if (param0 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
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
              if (this.a(param2, (byte) -127, param3, param1)) {
                this.a(param2, param3, param1, -113);
                this.b(param2, param3, param1, 13467);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.a(118, 103, -77, 34, 51);
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

            stackIn_9_1 = new StringBuilder().append("ua.T(").append(param0).append(',');

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    ua(int param0, int param1, int param2, int param3, ml param4) {
        super(param0, param1, param2, param3, param4, (of) null);
        this.field_u = new pj();
    }

    final boolean a(byte param0, we param1) {
        RuntimeException var3 = null;
        we var4 = null;
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        ck var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_10_0;
        boolean stackOut_14_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_u.e(11253)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        var8 = new ck(this.field_u);
                        if (param0 > 54) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var4 = (we) ((Object) var8.b((byte) -96));
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var4 == null) {
                            statePc = 20;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var4.b((byte) 116);
                        stackIn_21_0 = stackOut_10_0 ? 1 : 0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = new ck(this.field_u);
                        var5.a(-11121, var4);
                        var6 = (we) ((Object) var5.a(-3703));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = var6.a(param1, false);
                        stackIn_21_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var7 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!stackIn_15_0) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var6 = (we) ((Object) var5.a(-3703));
                        if (var7 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4 = (we) ((Object) var8.a(-3703));
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var3);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("ua.RB(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            field_y = "to keep fullscreen or";
            field_w = new int[5];
            var0 = 0;
            L0: while (true) {
              if (field_w.length <= var0) {
                field_v = new pj();
                break $cfr$clinit;
              } else {
                L1: {
                  if (0 == var0) {
                    field_w[var0] = var0 * 20 + 20 << 36086632;
                    break L1;
                  } else {
                    field_w[var0] = 51 * var0 - -51 << -284439704;
                    break L1;
                  }
                }
                if (-3 > (var0 ^ -1)) {
                  field_w[var0] = bd.a(field_w[var0], 22 * (-2 + var0) << 1830170768);
                  var0++;
                  continue L0;
                } else {
                  var0++;
                  continue L0;
                }
              }
            }
        }
    }
}
