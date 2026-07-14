/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static boolean field_g;
    static String field_f;
    static String field_b;
    static long field_d;
    static String field_c;
    static String field_e;
    static String[] field_a;

    final static long a(long param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          var3_int = 99 / ((-59 - param1) / 58);
          stackOut_0_0 = param0 + 1L;
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0L;
    }

    final static int b(byte param0) {
        RuntimeException var1 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param0 == 46) {
                break L0;
              } else {
                field_c = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = bh.field_l - ka.field_a;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, String param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param3 == 32) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ul.a(param1, 1, param2, false, (byte) 117, param5, 16, param0, 1, param4);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("wq.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param4 == null) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param5 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        String var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        long var5_long = 0L;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        String stackIn_108_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        String stackOut_105_0 = null;
        String stackOut_107_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (hr.field_k) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1_int++;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!gd.field_a) {
                            statePc = 10;
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
                        var1_int++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!gk.field_e) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var1_int++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!pq.field_K) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var1_int++;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (!wp.field_f) {
                            statePc = 22;
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
                        var1_int++;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (wl.field_g) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var1_int++;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (fa.field_j == 0) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var1_int++;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (pb.field_B) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var1_int++;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (!wl.field_o) {
                            statePc = 42;
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
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
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
                        if (stackIn_36_0 != (Object) (Object) um.field_e) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var1_int = var1_int + um.field_e.field_o.field_I;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((var1_int ^ -1) != -1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return;
                }
                case 44: {
                    try {
                        var1_int = var1_int * 20 + 10;
                        on.a(470, 10, 160, var1_int, 34);
                        on.e(470, 10, 160, var1_int, 3355477);
                        on.e(471, 11, 158, -2 + var1_int, 11184844);
                        on.e(472, 12, 156, var1_int + -4, 5592439);
                        if (param0 >= 13) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 45: {
                    return;
                }
                case 46: {
                    try {
                        var2 = 30;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (gd.field_a) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var3_long = Runtime.getRuntime().totalMemory();
                        var5_long = Runtime.getRuntime().freeMemory();
                        var7 = (-var5_long + var3_long) / 1024L + " kB / " + var3_long / 1024L + " kB";
                        pb.field_C.c(var7, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (hr.field_k) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var3_ref = nk.field_h + " fps / " + fb.field_T + " lps";
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (!wl.field_o) {
                            statePc = 72;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = null;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (stackIn_57_0 != (Object) (Object) um.field_e) {
                            statePc = 62;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 61;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var3 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if ((var3 ^ -1) <= (um.field_e.field_o.field_I ^ -1)) {
                            statePc = 72;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        stackOut_64_0 = var3 ^ -1;
                        stackOut_64_1 = um.field_e.field_h ^ -1;
                        stackIn_87_0 = stackOut_64_0;
                        stackIn_87_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (var8 != 0) {
                            statePc = 87;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (stackIn_65_0 == stackIn_65_1) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = 11184812;
                        stackIn_71_0 = stackOut_68_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = 16777215;
                        stackIn_71_0 = stackOut_70_0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        var4 = stackIn_71_0;
                        var5 = um.field_e.field_o.field_S[var3] + ": " + um.field_e.field_z[var3] + "ms / team " + um.field_e.field_o.field_g[var3].field_p;
                        pb.field_C.c(var5, 620, var2, var4, 0);
                        var2 += 20;
                        var3++;
                        if (var8 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!pq.field_K) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var3_ref = "Synchronisation disabled";
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (pb.field_B) {
                            statePc = 77;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var3_ref = "Camera boundary disabled";
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (gk.field_e) {
                            statePc = 81;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3_ref = "Response Filter disabled";
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (wp.field_f) {
                            statePc = 85;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var3_ref = "Smoothing disabled";
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = -1;
                        stackOut_86_1 = fa.field_j ^ -1;
                        stackIn_87_0 = stackOut_86_0;
                        stackIn_87_1 = stackOut_86_1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 != stackIn_87_1) {
                            statePc = 89;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        var3_ref = "Range:";
                        if (1 != fa.field_j) {
                            statePc = 91;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var3_ref = var3_ref + " Ball";
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if ((fa.field_j ^ -1) == -3) {
                            statePc = 94;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        var3_ref = var3_ref + " Player";
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (-4 == (fa.field_j ^ -1)) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        var3_ref = var3_ref + " Ball & Player";
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        pb.field_C.c(var3_ref, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        if (wl.field_g) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 102;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var3 = pq.field_J / 5;
                        var4 = pq.field_J % 5;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        if ((var4 ^ -1) != -1) {
                            statePc = 107;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        stackOut_105_0 = "all";
                        stackIn_108_0 = stackOut_105_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 106;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = Integer.toString(var4);
                        stackIn_108_0 = stackOut_107_0;
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var5 = stackIn_108_0;
                        var6 = "Viewing AI: " + var3 + "," + var5;
                        pb.field_C.c(var6, 620, var2, 16777215, 0);
                        var2 += 20;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 110;
                        continue stateLoop;
                    }
                }
                case 110: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw nb.a((Throwable) (Object) var1, "wq.F(" + param0 + 41);
                }
                case 111: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean stackIn_1_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        try {
          var1_int = 42 % ((param0 - -20) / 57);
          stackOut_0_0 = jn.a(17, so.a(71));
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return false;
    }

    public static void a(int param0) {
        try {
            field_e = null;
            field_c = null;
            field_a = null;
            field_f = null;
            field_b = null;
            if (param0 >= -102) {
                wq.a(-76);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "wq.D(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "You need to play <%0> more rated games to unlock this option.";
        field_b = "Cancel draw";
        field_f = "<lt>";
        field_e = "rematch! ";
        field_g = false;
        field_a = new String[]{"Circle", "Square", "Triangle", "Diamond"};
    }
}
