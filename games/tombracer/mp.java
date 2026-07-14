/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class mp {
    static gb field_a;
    int[] field_c;
    static jpa field_d;
    static String field_b;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            ts.field_g = param0;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var3 = param1.getParameter("cookieprefix");
                            var4 = param1.getParameter("cookiehost");
                            var5 = var3 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                            if (-1 != (param0.length() ^ -1)) {
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
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            if (!TombRacer.field_G) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var5 + "; Expires=" + ida.a(bva.b((byte) -107) - -94608000000L, param2 + 21406) + "; Max-Age=" + 94608000L;
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
                            lb.a(param1, 19467, "document.cookie=\"" + var5 + "\"");
                            if (param2 == -21407) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            mp.a(-2);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
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
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throwable = caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            v.a((byte) 64, param1);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (RuntimeException) runtimeException;
                            stackOut_13_1 = new StringBuilder().append("mp.C(");
                            stackIn_16_0 = stackOut_13_0;
                            stackIn_16_1 = stackOut_13_1;
                            stackIn_14_0 = stackOut_13_0;
                            stackIn_14_1 = stackOut_13_1;
                            if (param0 == null) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                            stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                            stackOut_14_2 = "{...}";
                            stackIn_17_0 = stackOut_14_0;
                            stackIn_17_1 = stackOut_14_1;
                            stackIn_17_2 = stackOut_14_2;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 16: {
                        stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                        stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                        stackOut_16_2 = "null";
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
                            stackIn_20_0 = stackOut_17_0;
                            stackIn_20_1 = stackOut_17_1;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            if (param1 == null) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                            stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                            stackOut_18_2 = "{...}";
                            stackIn_21_0 = stackOut_18_0;
                            stackIn_21_1 = stackOut_18_1;
                            stackIn_21_2 = stackOut_18_2;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw tba.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 41);
                    }
                    case 22: {
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

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        vb var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackOut_5_0 = false;
        boolean stackOut_22_0 = false;
        boolean stackOut_23_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ot.field_v = param1;
                        if (param0 == 2) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = (vb) (Object) tna.field_e.f(param0 ^ -78);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == var2) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = var2.field_h.l((byte) 122);
                        stackIn_25_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var3 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var2.p(78);
                        if (var3 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2.field_f.e(var2.field_g * ot.field_v + 128 >> 720592520);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var2 = (vb) (Object) tna.field_e.e(112);
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != db.field_f) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var2 = (vb) (Object) db.field_f.f(param0 ^ -78);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (null == var2) {
                            statePc = 35;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var3 != 0) {
                            statePc = 35;
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
                        stackOut_22_0 = var2.field_h.l((byte) 44);
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = stackIn_23_0;
                        stackIn_25_0 = stackOut_23_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!stackIn_25_0) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var2.field_f.e(var2.field_g * ot.field_v - -128 >> 622387560);
                        if (var3 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var2.p(param0 + 2);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var2 = (vb) (Object) db.field_f.e(113);
                        if (var3 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) runtimeException, "mp.E(" + param0 + 44 + param1 + 41);
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          var1_int = 11 % ((-52 - param0) / 57);
          stackOut_0_0 = ej.field_a.g(-110);
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0;
    }

    final static void a(jea param0, jea param1, boolean param2, jea param3, oj param4, jea param5, int param6, jea param7, jea param8, jea param9, jea param10, il param11) {
        RuntimeException var12 = null;
        iu var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        iu[] var16 = null;
        jea var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_23_0 = 0;
        String stackIn_30_0 = null;
        int stackIn_34_0 = 0;
        boolean stackIn_36_0 = false;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_22_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_29_0 = null;
        boolean stackOut_33_0 = false;
        boolean stackOut_35_0 = false;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var20 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        pm.field_a[3] = 16736511;
                        pm.field_a[2] = 9474303;
                        lpa.field_s = param11;
                        pm.field_a[4] = 16711935;
                        kq.field_c = param2;
                        pm.field_a[0] = 16764000;
                        pm.field_a[1] = 6356832;
                        bn.field_t = param7;
                        bma.field_t[3] = 16736511;
                        bma.field_t[2] = 16736352;
                        sva.field_d = 8421504;
                        bma.field_t[param6] = 16764000;
                        pm.field_a[4] = 16711935;
                        bma.field_t[1] = 6356832;
                        var12_ref = new iu(4, 4);
                        var13 = var12_ref.field_r;
                        var14 = var12_ref.field_r;
                        var15 = var12_ref.field_r;
                        var12_ref.field_r[15] = 7368816;
                        var13[2] = 7368816;
                        var15[8] = 7368816;
                        var14[5] = 7368816;
                        var16 = new iu[9];
                        var16[4] = var12_ref;
                        era.field_e = new jea(0L, param0);
                        v.field_i = new jea(0L, param9);
                        era.field_e.b(-128, v.field_i);
                        var17 = new jea(0L, (jea) null);
                        var17.field_J = new vna();
                        ne.field_d = new iv(0L, var17, param3, param4);
                        v.field_i.b(-126, (jea) (Object) ne.field_d);
                        sua.field_K = new jea(0L, param1);
                        v.field_i.b(-124, sua.field_K);
                        pq.field_g = new jea(0L, param5);
                        pq.field_g.field_H = lpa.field_s;
                        sua.field_K.b(param6 + -124, pq.field_g);
                        sua.field_K.a(param6 ^ -10966);
                        mka.field_b = new jea(0L, (jea) null);
                        mka.field_b.field_w = var16;
                        sua.field_K.b(-125, mka.field_b);
                        bt.field_c = new jea[5];
                        kva.field_p = new jea[5];
                        oka.field_y = new jea[5];
                        wba.field_p = new jea[5];
                        var18 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var18 ^ -1) <= -6) {
                            statePc = 33;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = var18 ^ -1;
                        stackIn_34_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var20 != 0) {
                            statePc = 34;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = stackIn_4_0;
                        stackOut_4_1 = -1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == stackIn_5_1) {
                            statePc = 24;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((var18 ^ -1) != -2) {
                            statePc = 15;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = kq.field_c;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0) {
                            statePc = 22;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if ((var18 ^ -1) == -3) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var20 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var19 = dna.field_H;
                        if (var20 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var19 = kh.field_p;
                        stackOut_22_0 = var20;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (!kq.field_c) {
                            statePc = 29;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = cla.field_o;
                        stackIn_30_0 = stackOut_27_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = wra.field_a;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var19 = stackIn_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        wba.field_p[var18] = new jea(0L, param10);
                        bt.field_c[var18] = new jea(0L, bn.field_t, var19);
                        oka.field_y[var18] = new jea(0L, (jea) null);
                        oka.field_y[var18].field_bb = 1;
                        kva.field_p[var18] = new jea(0L, bn.field_t);
                        kva.field_p[var18].field_bb = 1;
                        wba.field_p[var18].b(-122, bt.field_c[var18]);
                        wba.field_p[var18].b(param6 + -125, oka.field_y[var18]);
                        wba.field_p[var18].b(-125, kva.field_p[var18]);
                        wba.field_p[var18].a(-10966);
                        era.field_e.b(-127, wba.field_p[var18]);
                        gka.field_g = gka.field_g + 1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var18++;
                        if (var20 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ara.field_ub = new jea(0L, param8);
                        ara.field_ub.field_r = ge.field_G;
                        era.field_e.b(-128, ara.field_ub);
                        stackOut_33_0 = o.e(540800);
                        stackIn_34_0 = stackOut_33_0 ? 1 : 0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 == 0) {
                            statePc = 41;
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
                        stackOut_35_0 = fua.field_g;
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
                        if (stackIn_36_0) {
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
                        statePc = 85;
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
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        apa.field_c = new ada(0, 0, 0, 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var12 = (RuntimeException) (Object) caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        stackOut_44_0 = (RuntimeException) var12;
                        stackOut_44_1 = new StringBuilder().append("mp.D(");
                        stackIn_47_0 = stackOut_44_0;
                        stackIn_47_1 = stackOut_44_1;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        if (param0 == null) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                        stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                        stackOut_45_2 = "{...}";
                        stackIn_48_0 = stackOut_45_0;
                        stackIn_48_1 = stackOut_45_1;
                        stackIn_48_2 = stackOut_45_2;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 47: {
                    stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                    stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                    stackOut_47_2 = "null";
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(44);
                        stackIn_51_0 = stackOut_48_0;
                        stackIn_51_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (param1 == null) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                        stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                        stackOut_49_2 = "{...}";
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_52_2 = stackOut_49_2;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 51: {
                    stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                    stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                    stackOut_51_2 = "null";
                    stackIn_52_0 = stackOut_51_0;
                    stackIn_52_1 = stackOut_51_1;
                    stackIn_52_2 = stackOut_51_2;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                        stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44).append(param2).append(44);
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (param3 == null) {
                            statePc = 55;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                        stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                        stackOut_53_2 = "{...}";
                        stackIn_56_0 = stackOut_53_0;
                        stackIn_56_1 = stackOut_53_1;
                        stackIn_56_2 = stackOut_53_2;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 55: {
                    stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                    stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                    stackOut_55_2 = "null";
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    stackIn_56_2 = stackOut_55_2;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    try {
                        stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                        stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(44);
                        stackIn_59_0 = stackOut_56_0;
                        stackIn_59_1 = stackOut_56_1;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        if (param4 == null) {
                            statePc = 59;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                        stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                        stackOut_57_2 = "{...}";
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 58: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 59: {
                    stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
                    stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
                    stackOut_59_2 = "null";
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    stackIn_60_2 = stackOut_59_2;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    try {
                        stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                        stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44);
                        stackIn_63_0 = stackOut_60_0;
                        stackIn_63_1 = stackOut_60_1;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if (param5 == null) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                        stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                        stackOut_61_2 = "{...}";
                        stackIn_64_0 = stackOut_61_0;
                        stackIn_64_1 = stackOut_61_1;
                        stackIn_64_2 = stackOut_61_2;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 63: {
                    stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
                    stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
                    stackOut_63_2 = "null";
                    stackIn_64_0 = stackOut_63_0;
                    stackIn_64_1 = stackOut_63_1;
                    stackIn_64_2 = stackOut_63_2;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    try {
                        stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                        stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44).append(param6).append(44);
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        if (param7 == null) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                        stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                        stackOut_65_2 = "{...}";
                        stackIn_68_0 = stackOut_65_0;
                        stackIn_68_1 = stackOut_65_1;
                        stackIn_68_2 = stackOut_65_2;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 67: {
                    stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                    stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                    stackOut_67_2 = "null";
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    stackIn_68_2 = stackOut_67_2;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    try {
                        stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                        stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
                        stackIn_71_0 = stackOut_68_0;
                        stackIn_71_1 = stackOut_68_1;
                        stackIn_69_0 = stackOut_68_0;
                        stackIn_69_1 = stackOut_68_1;
                        if (param8 == null) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                        stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                        stackOut_69_2 = "{...}";
                        stackIn_72_0 = stackOut_69_0;
                        stackIn_72_1 = stackOut_69_1;
                        stackIn_72_2 = stackOut_69_2;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 70: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 71: {
                    stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                    stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                    stackOut_71_2 = "null";
                    stackIn_72_0 = stackOut_71_0;
                    stackIn_72_1 = stackOut_71_1;
                    stackIn_72_2 = stackOut_71_2;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    try {
                        stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                        stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44);
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (param9 == null) {
                            statePc = 75;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                        stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                        stackOut_73_2 = "{...}";
                        stackIn_76_0 = stackOut_73_0;
                        stackIn_76_1 = stackOut_73_1;
                        stackIn_76_2 = stackOut_73_2;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 74: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 75: {
                    stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                    stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                    stackOut_75_2 = "null";
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    stackIn_76_2 = stackOut_75_2;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    try {
                        stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                        stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(44);
                        stackIn_79_0 = stackOut_76_0;
                        stackIn_79_1 = stackOut_76_1;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        if (param10 == null) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                        stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                        stackOut_77_2 = "{...}";
                        stackIn_80_0 = stackOut_77_0;
                        stackIn_80_1 = stackOut_77_1;
                        stackIn_80_2 = stackOut_77_2;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 78: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 79: {
                    stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                    stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
                    stackOut_79_2 = "null";
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    stackIn_80_2 = stackOut_79_2;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    try {
                        stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
                        stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(44);
                        stackIn_83_0 = stackOut_80_0;
                        stackIn_83_1 = stackOut_80_1;
                        stackIn_81_0 = stackOut_80_0;
                        stackIn_81_1 = stackOut_80_1;
                        if (param11 == null) {
                            statePc = 83;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
                        stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
                        stackOut_81_2 = "{...}";
                        stackIn_84_0 = stackOut_81_0;
                        stackIn_84_1 = stackOut_81_1;
                        stackIn_84_2 = stackOut_81_2;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 83: {
                    stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
                    stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
                    stackOut_83_2 = "null";
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    stackIn_84_2 = stackOut_83_2;
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    throw tba.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + 41);
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_b = null;
              if (param0 == 9) {
                break L0;
              } else {
                mp.a(13);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_a = null;
          field_d = null;
        }
    }

    public mp() {
        ((mp) this).field_c = new int[16];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new gb();
        field_b = "Add <%0> to ignore list";
    }
}
