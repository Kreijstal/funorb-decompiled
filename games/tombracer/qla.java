/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qla {
    int field_h;
    int field_a;
    private byte[] field_e;
    int field_d;
    int field_g;
    private byte[][] field_c;
    static Calendar field_b;
    static kea field_f;
    static String field_i;

    final static eua a(boolean param0, jea param1, jea param2, br param3, jea param4) {
        Object stackIn_5_0 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        eua stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        eua[] var11 = null;
        int var12 = 0;
        br var13_ref_br = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wua var16 = null;
        int var17 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var17 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null == param3) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = null;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (eua) ((Object) stackIn_5_0);
                }
                case 6: {
                    try {
                        if (param3.field_q == null) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_10_0 = param3.field_q.length;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_10_0 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_int = stackIn_10_0;
                        if (null == param3.field_l) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_14_0 = param3.field_l.length;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6 = stackIn_14_0;
                        var7 = var6 + var5_int;
                        var8 = new String[var7];
                        var9 = new char[var7];
                        var10 = new int[var7];
                        if (param0) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        field_b = (Calendar) null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var11 = new eua[var7];
                        if (null != param3.field_q) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param3.field_q.length ^ -1) >= (var12 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13_ref_br = taa.field_g.a((byte) 98, param3.field_q[var12]);
                        var8[var12] = var13_ref_br.field_n;
                        var9[var12] = param3.field_k[var12];
                        var11[var12] = qla.a(param0, param1, param2, var13_ref_br, param4);
                        var12++;
                        if (var17 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var17 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (null == param3.field_l) {
                            statePc = 39;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var12 = var5_int;
                        var13 = 49;
                        var14 = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if ((var14 ^ -1) <= (param3.field_l.length ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var15 = param3.field_l[var14];
                        if (0 != (var15 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var8[var14 + var12] = iw.field_a;
                        var9[var14 + var12] = param3.field_o[var14];
                        var10[var14 + var12] = param3.field_l[var14];
                        if (var17 == 0) {
                            statePc = 38;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16 = qu.field_a.a(false, var15);
                        var8[var12 - -var14] = var16.b((byte) -5);
                        var9[var12 + var14] = param3.field_o[var14];
                        if (0 >= var9[var12 - -var14]) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var13 = (char)(var13 + 1);
                        var9[var14 + var12] = (char) var13;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var10[var14 + var12] = param3.field_l[var14];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var14++;
                        if (var17 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = new eua(0L, param4, param2, param1, var11, var10, var8, var9);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    return stackIn_40_0;
                }
                case 41: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_44_0 = (RuntimeException) (var5);
                    stackIn_42_0 = stackIn_44_0;
                    stackIn_44_1 = new StringBuilder().append("qla.H(").append(param0).append(',');
                    stackIn_42_1 = stackIn_44_1;
                    if (param1 == null) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_42_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_42_1);
                    stackIn_45_2 = "{...}";
                    statePc = 45;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                    stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                    stackIn_45_2 = "null";
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    stackIn_48_0 = (RuntimeException) ((Object) stackIn_45_0);
                    stackIn_46_0 = stackIn_48_0;
                    stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');
                    stackIn_46_1 = stackIn_48_1;
                    if (param2 == null) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_46_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_46_1);
                    stackIn_49_2 = "{...}";
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
                    stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
                    stackIn_49_2 = "null";
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    stackIn_52_0 = (RuntimeException) ((Object) stackIn_49_0);
                    stackIn_50_0 = stackIn_52_0;
                    stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');
                    stackIn_50_1 = stackIn_52_1;
                    if (param3 == null) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_50_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_50_1);
                    stackIn_53_2 = "{...}";
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
                    stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                    stackIn_53_2 = "null";
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    stackIn_56_0 = (RuntimeException) ((Object) stackIn_53_0);
                    stackIn_54_0 = stackIn_56_0;
                    stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
                    stackIn_54_1 = stackIn_56_1;
                    if (param4 == null) {
                        statePc = 56;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_54_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_54_1);
                    stackIn_57_2 = "{...}";
                    statePc = 57;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_57_0 = (RuntimeException) ((Object) stackIn_56_0);
                    stackIn_57_1 = (StringBuilder) ((Object) stackIn_56_1);
                    stackIn_57_2 = "null";
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    throw tba.a((Throwable) ((Object) stackIn_57_0), stackIn_57_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!fia.field_j.startsWith("win")) {
                  stackIn_5_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if ((param0.length() ^ -1) >= (var3 ^ -1)) {
                          break L5;
                        } else {
                          stackIn_23_0 = -1;

                          stackIn_23_1 = var2.indexOf((int) param0.charAt(var3));

                          if (var4 != 0) {
                            break L4;
                          } else {
                            if (stackIn_23_0 == stackIn_23_1) {
                              stackIn_20_0 = 0;
                              decompiledRegionSelector0 = 2;
                              break L1;
                            } else {
                              var3++;
                              if (var4 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackIn_23_0 = 20;
                      stackIn_23_1 = (77 - param1) / 37;
                      break L4;
                    }
                    var3 = stackIn_23_0 / stackIn_23_1;
                    Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                    stackIn_24_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_26_0 = 0;
              return stackIn_26_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2_ref2);

            stackIn_30_1 = new StringBuilder().append("qla.K(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_20_0 != 0;
            } else {
              return stackIn_24_0 != 0;
            }
          }
        }
    }

    final int a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -6773) {
                break L1;
              } else {
                this.field_e = (byte[]) null;
                break L1;
              }
            }
            if (this.field_c != null) {
              stackIn_7_0 = this.field_c[param0][param2];
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "qla.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final int a(String param0, nh[] param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_72_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11_int = 0;
        Exception var11 = null;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0;
                }
                case 6: {
                    try {
                        var4_int = -1;
                        var5 = -1;
                        if (param2 < -60) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_e = (byte[]) null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = 0;
                        var7 = param0.length();
                        var8 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((var7 ^ -1) >= (var8 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var9 = param0.charAt(var8);
                        stackIn_72_0 = 60;
                        stackIn_12_0 = stackIn_72_0;
                        if (var12 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 == var9) {
                            statePc = 17;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var4_int = var8;
                        if (var12 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-63 != (var9 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var4_int == -1) {
                            statePc = 63;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var10 = param0.substring(1 + var4_int, var8);
                        var4_int = -1;
                        if (var10.equals("lt")) {
                            statePc = 62;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!var10.equals("gt")) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var9 = 62;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (var10.equals("nbsp")) {
                            statePc = 61;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!var10.equals("shy")) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var9 = 173;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var10.equals("times")) {
                            statePc = 60;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (!var10.equals("euro")) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var9 = 8364;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var10.equals("copy")) {
                            statePc = 59;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (!var10.equals("reg")) {
                            statePc = 50;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var9 = 174;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (!var10.startsWith("img=")) {
                            statePc = 70;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (param1 == null) {
                            statePc = 70;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var11_int = jb.a((CharSequence) ((Object) var10.substring(4)), (byte) 70);
                        var6 = var6 + param1[var11_int].d();
                        var5 = -1;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = ((Object) stateCaught_56 instanceof Exception ? 58 : 73);
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var11 = (Exception) ((Object) caughtException);
                        if (var12 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var9 = 169;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var9 = 215;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var9 = 160;
                        if (var12 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var9 = 60;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (-1 != var4_int) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var6 = var6 + (this.field_e[io.a(-377, (char) var9) & 255] & 255);
                        if (this.field_c == null) {
                            statePc = 69;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var5 == -1) {
                            statePc = 69;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var6 = var6 + this.field_c[var5][var9];
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        var5 = var9;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var8++;
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_72_0 = var6;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    return stackIn_72_0;
                }
                case 73: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_76_0 = (RuntimeException) (var4);
                    stackIn_74_0 = stackIn_76_0;
                    stackIn_76_1 = new StringBuilder().append("qla.C(");
                    stackIn_74_1 = stackIn_76_1;
                    if (param0 == null) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_74_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_74_1);
                    stackIn_77_2 = "{...}";
                    statePc = 77;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_77_0 = (RuntimeException) ((Object) stackIn_76_0);
                    stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
                    stackIn_77_2 = "null";
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_80_0;
                    stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',');
                    stackIn_78_1 = stackIn_80_1;
                    if (param1 == null) {
                        statePc = 80;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_78_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_78_1);
                    stackIn_81_2 = "{...}";
                    statePc = 81;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
                    stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
                    stackIn_81_2 = "null";
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    throw tba.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                this.a(82, -75);
                break L1;
              }
            }
            stackIn_4_0 = this.field_e[param1] & 255;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "qla.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final int a(String param0, int param1, String[] param2, nh[] param3, int[] param4) {
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_141_0 = 0;
        int[] stackIn_141_1 = null;
        int stackIn_142_0 = 0;
        int[] stackIn_142_1 = null;
        int stackIn_142_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_170_0 = null;
        StringBuilder stackIn_170_1 = null;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        RuntimeException stackIn_173_0 = null;
        StringBuilder stackIn_173_1 = null;
        String stackIn_173_2 = null;
        RuntimeException stackIn_174_0 = null;
        StringBuilder stackIn_174_1 = null;
        RuntimeException stackIn_176_0 = null;
        StringBuilder stackIn_176_1 = null;
        RuntimeException stackIn_177_0 = null;
        StringBuilder stackIn_177_1 = null;
        String stackIn_177_2 = null;
        RuntimeException stackIn_178_0 = null;
        StringBuilder stackIn_178_1 = null;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        RuntimeException stackIn_181_0 = null;
        StringBuilder stackIn_181_1 = null;
        String stackIn_181_2 = null;
        RuntimeException stackIn_182_0 = null;
        StringBuilder stackIn_182_1 = null;
        RuntimeException stackIn_184_0 = null;
        StringBuilder stackIn_184_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_185_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
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
        String var19 = null;
        int var20_int = 0;
        Exception var20 = null;
        int var21 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var21 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 169;
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
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var6_int = 0;
                        var7 = 0;
                        var8 = -1;
                        var9 = 0;
                        var10 = 0;
                        var11 = -1;
                        var12 = -1;
                        var13 = 0;
                        var14 = param0.length();
                        if (param1 <= -89) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_d = -106;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var15 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var15 >= var14) {
                            statePc = 163;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var16 = 255 & io.a(-377, param0.charAt(var15));
                        var17 = 0;
                        stackIn_164_0 = 60;
                        stackIn_10_0 = stackIn_164_0;
                        stackIn_164_1 = var16;
                        stackIn_10_1 = stackIn_164_1;
                        if (var21 != 0) {
                            statePc = 164;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 != stackIn_10_1) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var11 = var15;
                        if (var21 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var11 == -1) {
                            statePc = 120;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var16 ^ -1) == -63) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (var21 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var18 = var11;
                        var19 = param0.substring(var11 - -1, var15);
                        var11 = -1;
                        if (var19.equals("br")) {
                            statePc = 113;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var19.equals("lt")) {
                            statePc = 107;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var19.equals("gt")) {
                            statePc = 101;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (!var19.equals("nbsp")) {
                            statePc = 39;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var17 = var17 + this.a(255, 160);
                        if (null == this.field_c) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 == var12) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var17 = var17 + this.field_c[var12][160];
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var12 = 160;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var19.equals("shy")) {
                            statePc = 95;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (!var19.equals("times")) {
                            statePc = 53;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var17 = var17 + this.a(255, 215);
                        if (null == this.field_c) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var12 != -1) {
                            statePc = 51;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var17 = var17 + this.field_c[var12][215];
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var12 = 215;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var19.equals("euro")) {
                            statePc = 89;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (!var19.equals("copy")) {
                            statePc = 67;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var17 = var17 + this.a(255, 169);
                        if (this.field_c == null) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var17 = var17 + this.field_c[var12][169];
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var12 = 169;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (var19.equals("reg")) {
                            statePc = 81;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (!var19.startsWith("img=")) {
                            statePc = 119;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (null != param3) {
                            statePc = 78;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var20_int = jb.a((CharSequence) ((Object) var19.substring(4)), (byte) 70);
                        var17 = var17 + param3[var20_int].d();
                        var12 = -1;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = ((Object) stateCaught_78 instanceof Exception ? 80 : 169);
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var20 = (Exception) ((Object) caughtException);
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var17 = var17 + this.a(255, 174);
                        if (this.field_c == null) {
                            statePc = 88;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 87;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        var17 = var17 + this.field_c[var12][174];
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var12 = 174;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 89;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var17 = var17 + this.a(255, 8364);
                        if (null == this.field_c) {
                            statePc = 94;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (-1 == var12) {
                            statePc = 94;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var17 = var17 + this.field_c[var12][8364];
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var12 = 8364;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        var17 = var17 + this.a(255, 173);
                        if (this.field_c == null) {
                            statePc = 100;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (var12 == -1) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        var17 = var17 + this.field_c[var12][173];
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        var12 = 173;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        var17 = var17 + this.a(255, 62);
                        if (this.field_c == null) {
                            statePc = 106;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (-1 == var12) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var17 = var17 + this.field_c[var12][62];
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var12 = 62;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var17 = var17 + this.a(255, 60);
                        if (null == this.field_c) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if ((var12 ^ -1) == 0) {
                            statePc = 112;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        var17 = var17 + this.field_c[var12][60];
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        var12 = 60;
                        if (var21 == 0) {
                            statePc = 119;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        param2[var13] = param0.substring(var7, 1 + var15);
                        var13++;
                        if (param2.length > var13) {
                            statePc = 118;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        stackIn_117_0 = 0;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 117: {
                    return stackIn_117_0;
                }
                case 118: {
                    try {
                        var8 = -1;
                        var7 = 1 + var15;
                        var6_int = 0;
                        var12 = -1;
                        if (var21 == 0) {
                            statePc = 162;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var16 = -1;
                        if (var21 == 0) {
                            statePc = 128;
                        } else {
                            statePc = 120;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        var17 = var17 + this.a(255, var16);
                        var18 = var15;
                        if (this.field_c == null) {
                            statePc = 127;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if ((var12 ^ -1) != 0) {
                            statePc = 126;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var17 = var17 + this.field_c[var12][var16];
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        var12 = var16;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (-1 > (var17 ^ -1)) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        var6_int = var6_int + var17;
                        if (param4 == null) {
                            statePc = 162;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if ((var16 ^ -1) == -33) {
                            statePc = 137;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        var8 = var15;
                        var10 = 1;
                        var9 = var6_int;
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackIn_141_0 = var6_int;
                        stackIn_139_0 = stackIn_141_0;
                        stackIn_141_1 = (int[]) (param4);
                        stackIn_139_1 = stackIn_141_1;
                        if (var13 < param4.length) {
                            statePc = 141;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        stackIn_142_0 = stackIn_139_0;
                        stackIn_142_1 = (int[]) ((Object) stackIn_139_1);
                        stackIn_142_2 = -1 + param4.length;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        stackIn_142_0 = stackIn_141_0;
                        stackIn_142_1 = (int[]) ((Object) stackIn_141_1);
                        stackIn_142_2 = var13;
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if (stackIn_142_0 > stackIn_142_1[stackIn_142_2]) {
                            statePc = 145;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (-1 >= (var8 ^ -1)) {
                            statePc = 152;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        param2[var13] = param0.substring(var7, var18);
                        var13++;
                        if ((var13 ^ -1) > (param2.length ^ -1)) {
                            statePc = 151;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        stackIn_150_0 = 0;
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 150: {
                    return stackIn_150_0;
                }
                case 151: {
                    try {
                        var6_int = var17;
                        var8 = -1;
                        var12 = -1;
                        var7 = var18;
                        if (var21 == 0) {
                            statePc = 158;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        param2[var13] = param0.substring(var7, 1 + var8 - var10);
                        var13++;
                        if ((param2.length ^ -1) < (var13 ^ -1)) {
                            statePc = 157;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        stackIn_156_0 = 0;
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 156: {
                    return stackIn_156_0;
                }
                case 157: {
                    try {
                        var7 = 1 + var8;
                        var6_int = var6_int - var9;
                        var8 = -1;
                        var12 = -1;
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        if (-46 == (var16 ^ -1)) {
                            statePc = 161;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        var8 = var15;
                        var9 = var6_int;
                        var10 = 0;
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        var15++;
                        if (var21 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        stackIn_164_0 = var7 ^ -1;
                        stackIn_164_1 = param0.length() ^ -1;
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (stackIn_164_0 <= stackIn_164_1) {
                            statePc = 167;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        param2[var13] = param0.substring(var7, param0.length());
                        var13++;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        stackIn_168_0 = var13;
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 168: {
                    return stackIn_168_0;
                }
                case 169: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_172_0 = (RuntimeException) (var6);
                    stackIn_170_0 = stackIn_172_0;
                    stackIn_172_1 = new StringBuilder().append("qla.J(");
                    stackIn_170_1 = stackIn_172_1;
                    if (param0 == null) {
                        statePc = 172;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_170_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_170_1);
                    stackIn_173_2 = "{...}";
                    statePc = 173;
                    continue stateLoop;
                }
                case 172: {
                    stackIn_173_0 = (RuntimeException) ((Object) stackIn_172_0);
                    stackIn_173_1 = (StringBuilder) ((Object) stackIn_172_1);
                    stackIn_173_2 = "null";
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    stackIn_176_0 = (RuntimeException) ((Object) stackIn_173_0);
                    stackIn_174_0 = stackIn_176_0;
                    stackIn_176_1 = ((StringBuilder) (Object) stackIn_173_1).append(stackIn_173_2).append(',').append(param1).append(',');
                    stackIn_174_1 = stackIn_176_1;
                    if (param2 == null) {
                        statePc = 176;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_174_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_174_1);
                    stackIn_177_2 = "{...}";
                    statePc = 177;
                    continue stateLoop;
                }
                case 176: {
                    stackIn_177_0 = (RuntimeException) ((Object) stackIn_176_0);
                    stackIn_177_1 = (StringBuilder) ((Object) stackIn_176_1);
                    stackIn_177_2 = "null";
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    stackIn_180_0 = (RuntimeException) ((Object) stackIn_177_0);
                    stackIn_178_0 = stackIn_180_0;
                    stackIn_180_1 = ((StringBuilder) (Object) stackIn_177_1).append(stackIn_177_2).append(',');
                    stackIn_178_1 = stackIn_180_1;
                    if (param3 == null) {
                        statePc = 180;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_178_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_178_1);
                    stackIn_181_2 = "{...}";
                    statePc = 181;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_181_0 = (RuntimeException) ((Object) stackIn_180_0);
                    stackIn_181_1 = (StringBuilder) ((Object) stackIn_180_1);
                    stackIn_181_2 = "null";
                    statePc = 181;
                    continue stateLoop;
                }
                case 181: {
                    stackIn_184_0 = (RuntimeException) ((Object) stackIn_181_0);
                    stackIn_182_0 = stackIn_184_0;
                    stackIn_184_1 = ((StringBuilder) (Object) stackIn_181_1).append(stackIn_181_2).append(',');
                    stackIn_182_1 = stackIn_184_1;
                    if (param4 == null) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackIn_185_0 = (RuntimeException) ((Object) stackIn_182_0);
                    stackIn_185_1 = (StringBuilder) ((Object) stackIn_182_1);
                    stackIn_185_2 = "{...}";
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    stackIn_185_0 = (RuntimeException) ((Object) stackIn_184_0);
                    stackIn_185_1 = (StringBuilder) ((Object) stackIn_184_1);
                    stackIn_185_2 = "null";
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    throw tba.a((Throwable) ((Object) stackIn_185_0), stackIn_185_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 35 % ((param1 - -44) / 54);
            stackIn_1_0 = this.a(param0, (nh[]) null, -61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("qla.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final String a(boolean param0, nh[] param1, String param2, int param3) {
        String stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        String stackIn_60_0 = null;
        String stackIn_76_0 = null;
        int stackIn_80_0 = 0;
        String stackIn_84_0 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Exception var13 = null;
        int var14 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((this.a(param2, param1, -93) ^ -1) < (param3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (String) (param2);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        param3 = param3 - this.a("...", (nh[]) null, -61);
                        var5_int = -1;
                        var6 = -1;
                        var7 = 0;
                        var8 = param2.length();
                        var9 = "";
                        var10 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var10 ^ -1) <= (var8 ^ -1)) {
                            statePc = 79;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var11 = param2.charAt(var10);
                        stackIn_80_0 = -61;
                        stackIn_7_0 = stackIn_80_0;
                        if (var14 != 0) {
                            statePc = 80;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 == (var11 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5_int = var10;
                        if (var14 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (-63 != (var11 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if ((var5_int ^ -1) != 0) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var12_ref_String = param2.substring(1 + var5_int, var10);
                        var5_int = -1;
                        if (!var12_ref_String.equals("lt")) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = 60;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var12_ref_String.equals("gt")) {
                            statePc = 65;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (var12_ref_String.equals("nbsp")) {
                            statePc = 64;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (!var12_ref_String.equals("shy")) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var11 = 173;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (!var12_ref_String.equals("times")) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var11 = 215;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!var12_ref_String.equals("euro")) {
                            statePc = 41;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var11 = 8364;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!var12_ref_String.equals("copy")) {
                            statePc = 45;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var11 = 169;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (!var12_ref_String.equals("reg")) {
                            statePc = 49;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var11 = 174;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (!var12_ref_String.startsWith("img=")) {
                            statePc = 78;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (null != param1) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var14 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var13_int = jb.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 70);
                        var6 = -1;
                        var7 = var7 + param1[var13_int].d();
                        if (param3 >= var7) {
                            statePc = 61;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = ((Object) stateCaught_58 instanceof Exception ? 63 : 85);
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackIn_60_0 = var9 + "...";
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = ((Object) stateCaught_59 instanceof Exception ? 63 : 85);
                        continue stateLoop;
                    }
                }
                case 60: {
                    return stackIn_60_0;
                }
                case 61: {
                    try {
                        var9 = param2.substring(0, 1 + var10);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = ((Object) stateCaught_61 instanceof Exception ? 63 : 85);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var13 = (Exception) ((Object) caughtException);
                        if (var14 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var11 = 160;
                        if (var14 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var11 = 62;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((var5_int ^ -1) != 0) {
                            statePc = 78;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var7 = var7 + (this.field_e[io.a(-377, (char) var11) & 255] & 255);
                        if (null == this.field_c) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (-1 == var6) {
                            statePc = 72;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var7 = var7 + this.field_c[var6][var11];
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var6 = var11;
                        var12 = var7;
                        if (this.field_c == null) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var12 = var12 + this.field_c[var11][46];
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (var12 <= param3) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackIn_76_0 = var9 + "...";
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    return stackIn_76_0;
                }
                case 77: {
                    try {
                        var9 = param2.substring(0, 1 + var10);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var10++;
                        if (var14 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        stackIn_80_0 = param0 ? 1 : 0;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (stackIn_80_0 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        this.a((String) null, (byte) -79);
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_84_0 = (String) (param2);
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 84: {
                    return stackIn_84_0;
                }
                case 85: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_88_0 = (RuntimeException) (var5);
                    stackIn_86_0 = stackIn_88_0;
                    stackIn_88_1 = new StringBuilder().append("qla.E(").append(param0).append(',');
                    stackIn_86_1 = stackIn_88_1;
                    if (param1 == null) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_86_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_86_1);
                    stackIn_89_2 = "{...}";
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "null";
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_92_0 = (RuntimeException) ((Object) stackIn_89_0);
                    stackIn_90_0 = stackIn_92_0;
                    stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_89_2).append(',');
                    stackIn_90_1 = stackIn_92_1;
                    if (param2 == null) {
                        statePc = 92;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackIn_93_0 = (RuntimeException) ((Object) stackIn_90_0);
                    stackIn_93_1 = (StringBuilder) ((Object) stackIn_90_1);
                    stackIn_93_2 = "{...}";
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackIn_93_0 = (RuntimeException) ((Object) stackIn_92_0);
                    stackIn_93_1 = (StringBuilder) ((Object) stackIn_92_1);
                    stackIn_93_2 = "null";
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    throw tba.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_13_0 = null;
            String stackIn_19_0 = null;
            String stackIn_21_0 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var8 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getParameter("cookieprefix");
                    var3 = var2 + "settings";
                    var4 = (String) (lb.b(param1, 2864, "getcookies"));
                    var5 = rga.a(param0 + 32287, var4, ';');
                    var6 = param0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if ((var6 ^ -1) <= (var5.length ^ -1)) {
                            break L4;
                          } else {
                            var7 = var5[var6].indexOf('=');
                            if (var8 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (0 > var7) {
                                  break L5;
                                } else {
                                  if (var5[var6].substring(0, var7).trim().equals(var3)) {
                                    stackIn_13_0 = var5[var6].substring(var7 - -1).trim();
                                    decompiledRegionSelector0 = 1;
                                    break L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var6++;
                              if (var8 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        break L3;
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var2_ref2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (ts.field_g == null) {
                    stackIn_21_0 = param1.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_19_0 = ts.field_g;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_25_0 = (RuntimeException) (var2_ref);

                stackIn_25_1 = new StringBuilder().append("qla.L(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "null";
                  break L7;
                } else {
                  stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                  stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                  stackIn_26_2 = "{...}";
                  break L7;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_19_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0;
              } else {
                return stackIn_13_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(boolean param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = "Loaded.";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("qla.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(String param0, int param1, nh[] param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 != param4) {
                break L1;
              } else {
                param4 = this.field_a;
                break L1;
              }
            }
            var6_int = this.a(param0, -124, dra.field_a, param2, new int[]{param1});
            var7 = (var6_int + -1) * param4;
            var8 = 72 / ((-41 - param3) / 54);
            stackIn_3_0 = this.field_h - -var7 - -this.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("qla.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    qla(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        uia var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new uia(param0);
                        var3 = var2.h(255);
                        if (-1 == (var3 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 != var2.h(255)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = 1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = stackIn_8_0;
                        this.field_e = new byte[256];
                        var2.a(this.field_e, 0, -81, 256);
                        if (var4 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_a = var2.h(255);
                        if (var12 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = new int[256];
                        var7_int = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((var7_int ^ -1) <= -257) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var5[var7_int] = var2.h(255);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var12 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var6 = new int[256];
                        var7_int = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var7_int ^ -1) <= -257) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var6[var7_int] = var2.h(255);
                        var7_int++;
                        if (var12 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var12 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var7 = new byte[256][];
                        var8_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var8_int >= 256) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        array$0 = new byte[var5[var8_int]];
                        var7[var8_int] = array$0;
                        var9 = 0;
                        stackIn_36_0 = 0;
                        stackIn_27_0 = stackIn_36_0;
                        if (var12 != 0) {
                            statePc = 36;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var10 = stackIn_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (var7[var8_int].length <= var10) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var9 = (byte)(var9 + var2.c((byte) 79));
                        var7[var8_int][var10] = (byte) var9;
                        var10++;
                        if (var12 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var12 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var8_int++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var12 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackIn_36_0 = 256;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var8 = new byte[stackIn_36_0][];
                        var9 = 0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var9 >= 256) {
                            statePc = 47;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        array$1 = new byte[var5[var9]];
                        var8[var9] = array$1;
                        var10 = 0;
                        stackIn_48_0 = 0;
                        stackIn_39_0 = stackIn_48_0;
                        if (var12 != 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var11 = stackIn_39_0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (var8[var9].length <= var11) {
                            statePc = 45;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10 = (byte)(var10 + var2.c((byte) 93));
                        var8[var9][var11] = (byte) var10;
                        var11++;
                        if (var12 != 0) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (var12 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9++;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var12 == 0) {
                            statePc = 37;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        this.field_c = new byte[256][256];
                        stackIn_48_0 = 0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var9 = stackIn_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackIn_50_0 = -257;
                        stackIn_50_1 = var9 ^ -1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 >= stackIn_50_1) {
                            statePc = 72;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackIn_74_0 = 32;
                        stackIn_52_0 = stackIn_74_0;
                        if (var12 != 0) {
                            statePc = 74;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 == var9) {
                            statePc = 71;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((var9 ^ -1) == -161) {
                            statePc = 71;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var10 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (-257 >= (var10 ^ -1)) {
                            statePc = 71;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackIn_50_0 = 32;
                        stackIn_61_0 = stackIn_50_0;
                        stackIn_50_1 = var10;
                        stackIn_61_1 = stackIn_50_1;
                        if (var12 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 == stackIn_61_1) {
                            statePc = 70;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (160 != var10) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var12 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        this.field_c[var9][var10] = (byte)pu.a(var9, var10, true, var7, var5, this.field_e, var8, var6);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var10++;
                        if (var12 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var9++;
                        if (var12 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        this.field_a = var5[32] + var6[32];
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        this.field_d = var2.h(255);
                        stackIn_74_0 = var2.h(255);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        this.field_h = var2.h(255);
                        this.field_g = var2.h(255);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_79_0 = (RuntimeException) (var2_ref);
                    stackIn_77_0 = stackIn_79_0;
                    stackIn_79_1 = new StringBuilder().append("qla.<init>(");
                    stackIn_77_1 = stackIn_79_1;
                    if (param0 == null) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_77_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_77_1);
                    stackIn_80_2 = "{...}";
                    statePc = 80;
                    continue stateLoop;
                }
                case 79: {
                    stackIn_80_0 = (RuntimeException) ((Object) stackIn_79_0);
                    stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
                    stackIn_80_2 = "null";
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    throw tba.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ')');
                }
                case 81: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        try {
            field_f = null;
            field_b = null;
            field_i = null;
            if (param0 != -63) {
                qla.a(true, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qla.F(" + param0 + ')');
        }
    }

    static {
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = "Use this alternative as your account name";
    }
}
