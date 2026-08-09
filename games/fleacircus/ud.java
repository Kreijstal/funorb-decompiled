/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ud {
    static ih field_b;
    static boolean field_c;
    static String field_a;

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int statePc = 0;
        int var9 = 0;
        dd[] var10 = null;
        dd[] var11_ref_dd__ = null;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = fleas.field_A ? 1 : 0;
                    var9 = param3 + (param4 + param7);
                    var10 = new dd[]{new dd(var9, var9), new dd(param1, var9), new dd(var9, var9), new dd(var9, param1), new dd(64, 64), new dd(var9, param1), new dd(var9, var9), new dd(param1, var9), new dd(var9, var9)};
                    var11_ref_dd__ = var10;
                    var12 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var11_ref_dd__.length <= var12) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = var11_ref_dd__[var12];
                    stackIn_11_0 = 0;
                    stackIn_3_0 = stackIn_11_0;
                    if (var15 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var14 = stackIn_3_0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var14 >= var13.field_B.length) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var13.field_B[var14] = param0;
                    var14++;
                    if (var15 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (var15 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var12++;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var15 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var10 = var11_ref_dd__;
                    stackIn_11_0 = 0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var10 = var11_ref_dd__;
                    var11 = stackIn_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (var11 >= param3) {
                        statePc = 21;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_22_0 = 0;
                    stackIn_14_0 = stackIn_22_0;
                    if (var15 != 0) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var12 = stackIn_14_0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (var12 >= var9) {
                        statePc = 19;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var10[6].field_B[var12 + var9 * (var9 - (var11 - -1))] = param5;
                    var10[8].field_B[var9 * (var9 - var11 + -1) - -var12] = param5;
                    var10[2].field_B[var12 * var9 - var11 - (1 + -var9)] = param5;
                    var10[8].field_B[-var11 + var9 - 1 + var12 * var9] = param5;
                    var12++;
                    if (var15 != 0) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (var15 == 0) {
                        statePc = 15;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var11++;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (var15 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var11 = 0;
                    stackIn_22_0 = param2;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (stackIn_22_0 == 4715) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ud.a((byte) 104);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = param3;
                    stackIn_25_1 = var11;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (stackIn_25_0 <= stackIn_25_1) {
                        statePc = 34;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_35_0 = 0;
                    stackIn_27_0 = stackIn_35_0;
                    if (var15 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12 = stackIn_27_0;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (var12 >= var9) {
                        statePc = 33;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10[0].field_B[var12 + var9 * var11] = param8;
                    var10[0].field_B[var12 * var9 + var11] = param8;
                    stackIn_25_0 = var12 ^ -1;
                    stackIn_30_0 = stackIn_25_0;
                    stackIn_25_1 = -var11 + var9 ^ -1;
                    stackIn_30_1 = stackIn_25_1;
                    if (var15 != 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (stackIn_30_0 <= stackIn_30_1) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var10[2].field_B[var9 * var11 + var12] = param8;
                    var10[6].field_B[var9 * var12 + var11] = param8;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    var12++;
                    if (var15 == 0) {
                        statePc = 28;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var11++;
                    if (var15 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = 0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var11 = stackIn_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if (param1 <= var11) {
                        statePc = 45;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    stackIn_46_0 = 0;
                    stackIn_38_0 = stackIn_46_0;
                    if (var15 != 0) {
                        statePc = 46;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = stackIn_38_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param3 <= var12) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    var10[7].field_B[(var9 + (-var12 - 1)) * param1 + var11] = param5;
                    var10[5].field_B[var9 * var11 - (-var9 + 1 + var12)] = param5;
                    var10[1].field_B[param1 * var12 - -var11] = param8;
                    var10[3].field_B[var11 * var9 - -var12] = param8;
                    var12++;
                    if (var15 != 0) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (var15 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    var11++;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if (var15 == 0) {
                        statePc = 36;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    stackIn_46_0 = 0;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    var11 = stackIn_46_0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var11 >= param1 >> -722328895) {
                        statePc = 55;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    var12 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var12 >= param7) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var10[1].field_B[(-var12 + (var9 - 1)) * param1 - -var11] = param6;
                    var10[3].field_B[var11 * var9 + -1 + (var9 - var12)] = param6;
                    var10[7].field_B[var11 + param1 * var12] = param6;
                    var10[5].field_B[var11 * var9 + var12] = param6;
                    var12++;
                    if (var15 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (var15 == 0) {
                        statePc = 49;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var11++;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (var15 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 != 85) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            ce stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            ce stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            ce stackIn_14_0 = null;
            java.net.URL stackIn_14_1 = null;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            StringBuilder stackIn_14_4 = null;
            String stackIn_14_5 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            String var3 = null;
            Exception var3_ref = null;
            od var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = "";
                            if (param1 == null) {
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
                            var3 = ii.a(41, param1);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param1 == null) {
                                statePc = 7;
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
                            var3 = var3 + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3 = var3 + param0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            sk.a(param2 ^ param2, var3);
                            var7 = tj.a(":", var3, "%3a", (byte) -66);
                            var8 = tj.a("@", var7, "%40", (byte) -66);
                            var9 = tj.a("&", var8, "%26", (byte) -66);
                            var10 = tj.a("#", var9, "%23", (byte) -66);
                            if (tb.field_d == null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            stackIn_13_0 = fg.field_i;
                            stackIn_12_0 = stackIn_13_0;
                            stackIn_13_1 = null;
                            stackIn_12_1 = stackIn_13_1;
                            stackIn_13_2 = null;
                            stackIn_12_2 = stackIn_13_2;
                            stackIn_13_3 = tb.field_d.getCodeBase();
                            stackIn_12_3 = stackIn_13_3;
                            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(rc.field_a).append("&u=");
                            stackIn_12_4 = stackIn_13_4;
                            if (s.field_b == null) {
                                statePc = 13;
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
                            stackIn_14_0 = (ce) ((Object) stackIn_12_0);
                            stackIn_14_1 = null;
                            stackIn_14_2 = null;
                            stackIn_14_3 = (java.net.URL) ((Object) stackIn_12_3);
                            stackIn_14_4 = (StringBuilder) ((Object) stackIn_12_4);
                            stackIn_14_5 = s.field_b;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackIn_14_0 = (ce) ((Object) stackIn_13_0);
                            stackIn_14_1 = null;
                            stackIn_14_2 = null;
                            stackIn_14_3 = (java.net.URL) ((Object) stackIn_13_3);
                            stackIn_14_4 = (StringBuilder) ((Object) stackIn_13_4);
                            stackIn_14_5 = "" + of.field_c;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = ((ce) (Object) stackIn_14_0).a(new java.net.URL(stackIn_14_3, stackIn_14_5 + "&v1=" + ce.field_r + "&v2=" + ce.field_n + "&e=" + var10), -34);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (0 != var4.field_b) {
                                statePc = 19;
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
                            vh.a(1L, param2 + -100);
                            if (var6 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var4.field_b ^ -1) != -2) {
                                statePc = 23;
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
                            var5 = (DataInputStream) (var4.field_e);
                            var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3_ref = (Exception) ((Object) caughtException);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
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
              if (param0 == 1560) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            stackIn_3_0 = tc.a((byte) 82, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ud.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        dd[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        dd[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fa var7 = null;
        fa var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = tl.field_p;
                        var8 = var7;
                        sd.field_f = var8.b(pa.field_i[12]);
                        var2 = var8.b(pa.field_i[13]);
                        if (var2 > sd.field_f) {
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
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        sd.field_f = var2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        h.field_g = new dd[b.field_d.length];
                        ua.field_tb = new dd[b.field_d.length];
                        var3 = -15 % ((-48 - param0) / 60);
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 >= h.field_g.length) {
                            statePc = 15;
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
                        if (var5 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        h.field_g[var4] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == ua.field_tb[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackIn_13_0 = ua.field_tb;
                        stackIn_10_0 = stackIn_13_0;
                        stackIn_13_1 = var4;
                        stackIn_10_1 = stackIn_13_1;
                        if (var5 != 0) {
                            statePc = 13;
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
                        if (stackIn_10_0[stackIn_10_1] != h.field_g[var4]) {
                            statePc = 14;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = ua.field_tb;
                        stackIn_13_1 = var4;
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
                        stackIn_13_0[stackIn_13_1] = je.field_O[db.a((byte) -115, new Random(), je.field_O.length)];
                        if (var5 == 0) {
                            statePc = 8;
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
                        var4++;
                        if (var5 == 0) {
                            statePc = 5;
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
                        gj.field_A = new rk(320, 420, gl.field_m, qa.field_l, bb.field_H, lh.field_b);
                        gj.field_A.field_t = fl.field_f;
                        gj.field_A.field_y = 1;
                        gj.field_A.field_z = -1;
                        ca.field_L = new mf(3, 1560);
                        mg.field_b = new mf(6, 165);
                        fb.field_a = new mf(3, 4715);
                        cm.field_i = new mf(3, 1560);
                        mf.field_e = new mf(6, 165);
                        th.field_z = new mf(3, 4715);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (ca.field_L.field_d.length <= var3) {
                            statePc = 23;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ca.field_L.field_d[var3] = var3 * 65536;
                        cm.field_i.field_d[var3] = var3 * 65536;
                        fb.field_a.field_d[var3] = 65792 * var3;
                        th.field_z.field_d[var3] = 65792 * var3;
                        var3++;
                        if (var5 != 0) {
                            statePc = 24;
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
                        if (var5 == 0) {
                            statePc = 17;
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
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1), "ud.C(" + param0 + ')');
                }
                case 23: {
                    return;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = false;
        field_a = "Connection lost. <%0>";
    }
}
